package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class StructuredefinitionDerivation {
  public static final StructuredefinitionDerivation SPECIALIZATION = new StructuredefinitionDerivation(Value.SPECIALIZATION, "SPECIALIZATION");

  public static final StructuredefinitionDerivation CONSTRAINT = new StructuredefinitionDerivation(Value.CONSTRAINT, "CONSTRAINT");

  private final Value value;

  private final String string;

  StructuredefinitionDerivation(Value value, String string) {
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
      || (other instanceof StructuredefinitionDerivation && this.string.equals(((StructuredefinitionDerivation) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SPECIALIZATION:
        return visitor.visitSPECIALIZATION();
      case CONSTRAINT:
        return visitor.visitCONSTRAINT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static StructuredefinitionDerivation valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SPECIALIZATION":
        return SPECIALIZATION;
      case "CONSTRAINT":
        return CONSTRAINT;
      default:
        return new StructuredefinitionDerivation(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SPECIALIZATION,

    CONSTRAINT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSPECIALIZATION();

    T visitCONSTRAINT();

    T visitUnknown(String unknownType);
  }
}
