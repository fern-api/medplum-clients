package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class EnrollmentresponseOutcome {
  public static final EnrollmentresponseOutcome ERROR = new EnrollmentresponseOutcome(Value.ERROR, "ERROR");

  public static final EnrollmentresponseOutcome PARTIAL = new EnrollmentresponseOutcome(Value.PARTIAL, "PARTIAL");

  public static final EnrollmentresponseOutcome QUEUED = new EnrollmentresponseOutcome(Value.QUEUED, "QUEUED");

  public static final EnrollmentresponseOutcome COMPLETE = new EnrollmentresponseOutcome(Value.COMPLETE, "COMPLETE");

  private final Value value;

  private final String string;

  EnrollmentresponseOutcome(Value value, String string) {
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
      || (other instanceof EnrollmentresponseOutcome && this.string.equals(((EnrollmentresponseOutcome) other).string));
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
  public static EnrollmentresponseOutcome valueOf(@Nonnull String value) {
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
        return new EnrollmentresponseOutcome(Value.UNKNOWN, upperCasedValue);
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
