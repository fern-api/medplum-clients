package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Elementdefinition_slicingRules {
  public static final Elementdefinition_slicingRules OPEN = new Elementdefinition_slicingRules(Value.OPEN, "OPEN");

  public static final Elementdefinition_slicingRules CLOSED = new Elementdefinition_slicingRules(Value.CLOSED, "CLOSED");

  public static final Elementdefinition_slicingRules OPENATEND = new Elementdefinition_slicingRules(Value.OPENATEND, "OPENATEND");

  private final Value value;

  private final String string;

  Elementdefinition_slicingRules(Value value, String string) {
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
      || (other instanceof Elementdefinition_slicingRules && this.string.equals(((Elementdefinition_slicingRules) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OPEN:
        return visitor.visitOPEN();
      case CLOSED:
        return visitor.visitCLOSED();
      case OPENATEND:
        return visitor.visitOPENATEND();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Elementdefinition_slicingRules valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OPEN":
        return OPEN;
      case "CLOSED":
        return CLOSED;
      case "OPENATEND":
        return OPENATEND;
      default:
        return new Elementdefinition_slicingRules(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CLOSED,

    OPEN,

    OPENATEND,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCLOSED();

    T visitOPEN();

    T visitOPENATEND();

    T visitUnknown(String unknownType);
  }
}
