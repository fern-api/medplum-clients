package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Claimresponse_processnoteType {
  public static final Claimresponse_processnoteType PRINTOPER = new Claimresponse_processnoteType(Value.PRINTOPER, "PRINTOPER");

  public static final Claimresponse_processnoteType PRINT = new Claimresponse_processnoteType(Value.PRINT, "PRINT");

  public static final Claimresponse_processnoteType DISPLAY = new Claimresponse_processnoteType(Value.DISPLAY, "DISPLAY");

  private final Value value;

  private final String string;

  Claimresponse_processnoteType(Value value, String string) {
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
      || (other instanceof Claimresponse_processnoteType && this.string.equals(((Claimresponse_processnoteType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PRINTOPER:
        return visitor.visitPRINTOPER();
      case PRINT:
        return visitor.visitPRINT();
      case DISPLAY:
        return visitor.visitDISPLAY();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Claimresponse_processnoteType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PRINTOPER":
        return PRINTOPER;
      case "PRINT":
        return PRINT;
      case "DISPLAY":
        return DISPLAY;
      default:
        return new Claimresponse_processnoteType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DISPLAY,

    PRINT,

    PRINTOPER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDISPLAY();

    T visitPRINT();

    T visitPRINTOPER();

    T visitUnknown(String unknownType);
  }
}
