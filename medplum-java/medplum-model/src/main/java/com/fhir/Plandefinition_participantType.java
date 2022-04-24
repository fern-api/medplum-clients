package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Plandefinition_participantType {
  public static final Plandefinition_participantType PATIENT = new Plandefinition_participantType(Value.PATIENT, "PATIENT");

  public static final Plandefinition_participantType PRACTITIONER = new Plandefinition_participantType(Value.PRACTITIONER, "PRACTITIONER");

  public static final Plandefinition_participantType DEVICE = new Plandefinition_participantType(Value.DEVICE, "DEVICE");

  private final Value value;

  private final String string;

  Plandefinition_participantType(Value value, String string) {
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
      || (other instanceof Plandefinition_participantType && this.string.equals(((Plandefinition_participantType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PATIENT:
        return visitor.visitPATIENT();
      case PRACTITIONER:
        return visitor.visitPRACTITIONER();
      case DEVICE:
        return visitor.visitDEVICE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Plandefinition_participantType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PATIENT":
        return PATIENT;
      case "PRACTITIONER":
        return PRACTITIONER;
      case "DEVICE":
        return DEVICE;
      default:
        return new Plandefinition_participantType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PATIENT,

    PRACTITIONER,

    DEVICE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPATIENT();

    T visitPRACTITIONER();

    T visitDEVICE();

    T visitUnknown(String unknownType);
  }
}
