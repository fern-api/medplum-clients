package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AllergyintoleranceCriticality {
  public static final AllergyintoleranceCriticality LOW = new AllergyintoleranceCriticality(Value.LOW, "LOW");

  public static final AllergyintoleranceCriticality HIGH = new AllergyintoleranceCriticality(Value.HIGH, "HIGH");

  private final Value value;

  private final String string;

  AllergyintoleranceCriticality(Value value, String string) {
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
      || (other instanceof AllergyintoleranceCriticality && this.string.equals(((AllergyintoleranceCriticality) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LOW:
        return visitor.visitLOW();
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
  public static AllergyintoleranceCriticality valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LOW":
        return LOW;
      case "HIGH":
        return HIGH;
      default:
        return new AllergyintoleranceCriticality(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    LOW,

    HIGH,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitLOW();

    T visitHIGH();

    T visitUnknown(String unknownType);
  }
}
