package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AuditeventAction {
  public static final AuditeventAction D = new AuditeventAction(Value.D, "D");

  public static final AuditeventAction C = new AuditeventAction(Value.C, "C");

  public static final AuditeventAction U = new AuditeventAction(Value.U, "U");

  public static final AuditeventAction E = new AuditeventAction(Value.E, "E");

  public static final AuditeventAction R = new AuditeventAction(Value.R, "R");

  private final Value value;

  private final String string;

  AuditeventAction(Value value, String string) {
    this.value = value;
    this.string = string;
  }

  public Value getEnumValue() {
    return value;
  }

  @Override
  @JsonValue
  public String toString() {
    return this.string;
  }

  @Override
  public boolean equals(Object other) {
    return (this == other) 
      || (other instanceof AuditeventAction && this.string.equals(((AuditeventAction) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case D:
        return visitor.visitD();
      case C:
        return visitor.visitC();
      case U:
        return visitor.visitU();
      case E:
        return visitor.visitE();
      case R:
        return visitor.visitR();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AuditeventAction valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "D":
        return D;
      case "C":
        return C;
      case "U":
        return U;
      case "E":
        return E;
      case "R":
        return R;
      default:
        return new AuditeventAction(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    C,

    R,

    U,

    D,

    E,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitC();

    T visitR();

    T visitU();

    T visitD();

    T visitE();

    T visitUnknown(String unknownType);
  }
}
