package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class MeasurereportStatus {
  public static final MeasurereportStatus ERROR = new MeasurereportStatus(Value.ERROR, "ERROR");

  public static final MeasurereportStatus PENDING = new MeasurereportStatus(Value.PENDING, "PENDING");

  public static final MeasurereportStatus COMPLETE = new MeasurereportStatus(Value.COMPLETE, "COMPLETE");

  private final Value value;

  private final String string;

  MeasurereportStatus(Value value, String string) {
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
      || (other instanceof MeasurereportStatus && this.string.equals(((MeasurereportStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ERROR:
        return visitor.visitERROR();
      case PENDING:
        return visitor.visitPENDING();
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
  public static MeasurereportStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ERROR":
        return ERROR;
      case "PENDING":
        return PENDING;
      case "COMPLETE":
        return COMPLETE;
      default:
        return new MeasurereportStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    COMPLETE,

    PENDING,

    ERROR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCOMPLETE();

    T visitPENDING();

    T visitERROR();

    T visitUnknown(String unknownType);
  }
}
