package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class IdentifierUse {
  public static final IdentifierUse OFFICIAL = new IdentifierUse(Value.OFFICIAL, "OFFICIAL");

  public static final IdentifierUse OLD = new IdentifierUse(Value.OLD, "OLD");

  public static final IdentifierUse USUAL = new IdentifierUse(Value.USUAL, "USUAL");

  public static final IdentifierUse TEMP = new IdentifierUse(Value.TEMP, "TEMP");

  public static final IdentifierUse SECONDARY = new IdentifierUse(Value.SECONDARY, "SECONDARY");

  private final Value value;

  private final String string;

  IdentifierUse(Value value, String string) {
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
      || (other instanceof IdentifierUse && this.string.equals(((IdentifierUse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OFFICIAL:
        return visitor.visitOFFICIAL();
      case OLD:
        return visitor.visitOLD();
      case USUAL:
        return visitor.visitUSUAL();
      case TEMP:
        return visitor.visitTEMP();
      case SECONDARY:
        return visitor.visitSECONDARY();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static IdentifierUse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OFFICIAL":
        return OFFICIAL;
      case "OLD":
        return OLD;
      case "USUAL":
        return USUAL;
      case "TEMP":
        return TEMP;
      case "SECONDARY":
        return SECONDARY;
      default:
        return new IdentifierUse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    USUAL,

    OFFICIAL,

    TEMP,

    SECONDARY,

    OLD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitUSUAL();

    T visitOFFICIAL();

    T visitTEMP();

    T visitSECONDARY();

    T visitOLD();

    T visitUnknown(String unknownType);
  }
}
