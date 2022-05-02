package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_resourceVersioning {
  public static final Capabilitystatement_resourceVersioning VERSIONED = new Capabilitystatement_resourceVersioning(Value.VERSIONED, "VERSIONED");

  private final Value value;

  private final String string;

  Capabilitystatement_resourceVersioning(Value value, String string) {
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
      || (other instanceof Capabilitystatement_resourceVersioning && this.string.equals(((Capabilitystatement_resourceVersioning) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case VERSIONED:
        return visitor.visitVERSIONED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Capabilitystatement_resourceVersioning valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "VERSIONED":
        return VERSIONED;
      default:
        return new Capabilitystatement_resourceVersioning(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    VERSIONED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitVERSIONED();

    T visitUnknown(String unknownType);
  }
}
