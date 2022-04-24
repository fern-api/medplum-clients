package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Paymentreconciliation_processnoteType {
  public static final Paymentreconciliation_processnoteType PRINTOPER = new Paymentreconciliation_processnoteType(Value.PRINTOPER, "PRINTOPER");

  public static final Paymentreconciliation_processnoteType PRINT = new Paymentreconciliation_processnoteType(Value.PRINT, "PRINT");

  public static final Paymentreconciliation_processnoteType DISPLAY = new Paymentreconciliation_processnoteType(Value.DISPLAY, "DISPLAY");

  private final Value value;

  private final String string;

  Paymentreconciliation_processnoteType(Value value, String string) {
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
      || (other instanceof Paymentreconciliation_processnoteType && this.string.equals(((Paymentreconciliation_processnoteType) other).string));
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
  public static Paymentreconciliation_processnoteType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PRINTOPER":
        return PRINTOPER;
      case "PRINT":
        return PRINT;
      case "DISPLAY":
        return DISPLAY;
      default:
        return new Paymentreconciliation_processnoteType(Value.UNKNOWN, upperCasedValue);
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
