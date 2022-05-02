package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_documentMode {
  public static final Capabilitystatement_documentMode PRODUCER = new Capabilitystatement_documentMode(Value.PRODUCER, "PRODUCER");

  public static final Capabilitystatement_documentMode CONSUMER = new Capabilitystatement_documentMode(Value.CONSUMER, "CONSUMER");

  private final Value value;

  private final String string;

  Capabilitystatement_documentMode(Value value, String string) {
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
      || (other instanceof Capabilitystatement_documentMode && this.string.equals(((Capabilitystatement_documentMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PRODUCER:
        return visitor.visitPRODUCER();
      case CONSUMER:
        return visitor.visitCONSUMER();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Capabilitystatement_documentMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PRODUCER":
        return PRODUCER;
      case "CONSUMER":
        return CONSUMER;
      default:
        return new Capabilitystatement_documentMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PRODUCER,

    CONSUMER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPRODUCER();

    T visitCONSUMER();

    T visitUnknown(String unknownType);
  }
}
