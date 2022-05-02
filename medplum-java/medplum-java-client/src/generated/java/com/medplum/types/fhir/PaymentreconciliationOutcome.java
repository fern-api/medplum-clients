package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class PaymentreconciliationOutcome {
  public static final PaymentreconciliationOutcome ERROR = new PaymentreconciliationOutcome(Value.ERROR, "ERROR");

  public static final PaymentreconciliationOutcome PARTIAL = new PaymentreconciliationOutcome(Value.PARTIAL, "PARTIAL");

  public static final PaymentreconciliationOutcome QUEUED = new PaymentreconciliationOutcome(Value.QUEUED, "QUEUED");

  public static final PaymentreconciliationOutcome COMPLETE = new PaymentreconciliationOutcome(Value.COMPLETE, "COMPLETE");

  private final Value value;

  private final String string;

  PaymentreconciliationOutcome(Value value, String string) {
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
      || (other instanceof PaymentreconciliationOutcome && this.string.equals(((PaymentreconciliationOutcome) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ERROR:
        return visitor.visitERROR();
      case PARTIAL:
        return visitor.visitPARTIAL();
      case QUEUED:
        return visitor.visitQUEUED();
      case COMPLETE:
        return visitor.visitCOMPLETE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static PaymentreconciliationOutcome valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ERROR":
        return ERROR;
      case "PARTIAL":
        return PARTIAL;
      case "QUEUED":
        return QUEUED;
      case "COMPLETE":
        return COMPLETE;
      default:
        return new PaymentreconciliationOutcome(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    QUEUED,

    COMPLETE,

    ERROR,

    PARTIAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitQUEUED();

    T visitCOMPLETE();

    T visitERROR();

    T visitPARTIAL();

    T visitUnknown(String unknownType);
  }
}
