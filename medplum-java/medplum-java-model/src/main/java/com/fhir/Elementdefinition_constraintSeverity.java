package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Elementdefinition_constraintSeverity {
  public static final Elementdefinition_constraintSeverity ERROR = new Elementdefinition_constraintSeverity(Value.ERROR, "ERROR");

  public static final Elementdefinition_constraintSeverity WARNING = new Elementdefinition_constraintSeverity(Value.WARNING, "WARNING");

  private final Value value;

  private final String string;

  Elementdefinition_constraintSeverity(Value value, String string) {
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
      || (other instanceof Elementdefinition_constraintSeverity && this.string.equals(((Elementdefinition_constraintSeverity) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ERROR:
        return visitor.visitERROR();
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
  public static Elementdefinition_constraintSeverity valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ERROR":
        return ERROR;
      case "WARNING":
        return WARNING;
      default:
        return new Elementdefinition_constraintSeverity(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ERROR,

    WARNING,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitERROR();

    T visitWARNING();

    T visitUnknown(String unknownType);
  }
}
