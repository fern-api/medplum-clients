package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ChargeitemStatus {
  public static final ChargeitemStatus ABORTED = new ChargeitemStatus(Value.ABORTED, "ABORTED");

  public static final ChargeitemStatus BILLED = new ChargeitemStatus(Value.BILLED, "BILLED");

  public static final ChargeitemStatus PLANNED = new ChargeitemStatus(Value.PLANNED, "PLANNED");

  public static final ChargeitemStatus BILLABLE = new ChargeitemStatus(Value.BILLABLE, "BILLABLE");

  private final Value value;

  private final String string;

  ChargeitemStatus(Value value, String string) {
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
      || (other instanceof ChargeitemStatus && this.string.equals(((ChargeitemStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ABORTED:
        return visitor.visitABORTED();
      case BILLED:
        return visitor.visitBILLED();
      case PLANNED:
        return visitor.visitPLANNED();
      case BILLABLE:
        return visitor.visitBILLABLE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ChargeitemStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ABORTED":
        return ABORTED;
      case "BILLED":
        return BILLED;
      case "PLANNED":
        return PLANNED;
      case "BILLABLE":
        return BILLABLE;
      default:
        return new ChargeitemStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PLANNED,

    BILLABLE,

    ABORTED,

    BILLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPLANNED();

    T visitBILLABLE();

    T visitABORTED();

    T visitBILLED();

    T visitUnknown(String unknownType);
  }
}
