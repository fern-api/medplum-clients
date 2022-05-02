package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Operationoutcome_issueSeverity {
  public static final Operationoutcome_issueSeverity ERROR = new Operationoutcome_issueSeverity(Value.ERROR, "ERROR");

  public static final Operationoutcome_issueSeverity INFORMATION = new Operationoutcome_issueSeverity(Value.INFORMATION, "INFORMATION");

  public static final Operationoutcome_issueSeverity FATAL = new Operationoutcome_issueSeverity(Value.FATAL, "FATAL");

  public static final Operationoutcome_issueSeverity WARNING = new Operationoutcome_issueSeverity(Value.WARNING, "WARNING");

  private final Value value;

  private final String string;

  Operationoutcome_issueSeverity(Value value, String string) {
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
      || (other instanceof Operationoutcome_issueSeverity && this.string.equals(((Operationoutcome_issueSeverity) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ERROR:
        return visitor.visitERROR();
      case INFORMATION:
        return visitor.visitINFORMATION();
      case FATAL:
        return visitor.visitFATAL();
      case WARNING:
        return visitor.visitWARNING();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Operationoutcome_issueSeverity valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ERROR":
        return ERROR;
      case "INFORMATION":
        return INFORMATION;
      case "FATAL":
        return FATAL;
      case "WARNING":
        return WARNING;
      default:
        return new Operationoutcome_issueSeverity(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FATAL,

    ERROR,

    WARNING,

    INFORMATION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFATAL();

    T visitERROR();

    T visitWARNING();

    T visitINFORMATION();

    T visitUnknown(String unknownType);
  }
}
