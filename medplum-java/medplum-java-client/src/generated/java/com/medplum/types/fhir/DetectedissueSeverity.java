package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DetectedissueSeverity {
  public static final DetectedissueSeverity LOW = new DetectedissueSeverity(Value.LOW, "LOW");

  public static final DetectedissueSeverity MODERATE = new DetectedissueSeverity(Value.MODERATE, "MODERATE");

  public static final DetectedissueSeverity HIGH = new DetectedissueSeverity(Value.HIGH, "HIGH");

  private final Value value;

  private final String string;

  DetectedissueSeverity(Value value, String string) {
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
      || (other instanceof DetectedissueSeverity && this.string.equals(((DetectedissueSeverity) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LOW:
        return visitor.visitLOW();
      case MODERATE:
        return visitor.visitMODERATE();
      case HIGH:
        return visitor.visitHIGH();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DetectedissueSeverity valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LOW":
        return LOW;
      case "MODERATE":
        return MODERATE;
      case "HIGH":
        return HIGH;
      default:
        return new DetectedissueSeverity(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    HIGH,

    MODERATE,

    LOW,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitHIGH();

    T visitMODERATE();

    T visitLOW();

    T visitUnknown(String unknownType);
  }
}
