package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Appointment_participantRequired {
  public static final Appointment_participantRequired REQUIRED = new Appointment_participantRequired(Value.REQUIRED, "REQUIRED");

  public static final Appointment_participantRequired OPTIONAL = new Appointment_participantRequired(Value.OPTIONAL, "OPTIONAL");

  private final Value value;

  private final String string;

  Appointment_participantRequired(Value value, String string) {
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
      || (other instanceof Appointment_participantRequired && this.string.equals(((Appointment_participantRequired) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case REQUIRED:
        return visitor.visitREQUIRED();
      case OPTIONAL:
        return visitor.visitOPTIONAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Appointment_participantRequired valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "REQUIRED":
        return REQUIRED;
      case "OPTIONAL":
        return OPTIONAL;
      default:
        return new Appointment_participantRequired(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REQUIRED,

    OPTIONAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREQUIRED();

    T visitOPTIONAL();

    T visitUnknown(String unknownType);
  }
}
