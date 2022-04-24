package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CompartmentdefinitionCode {
  public static final CompartmentdefinitionCode ENCOUNTER = new CompartmentdefinitionCode(Value.ENCOUNTER, "ENCOUNTER");

  public static final CompartmentdefinitionCode PATIENT = new CompartmentdefinitionCode(Value.PATIENT, "PATIENT");

  public static final CompartmentdefinitionCode RELATEDPERSON = new CompartmentdefinitionCode(Value.RELATEDPERSON, "RELATEDPERSON");

  public static final CompartmentdefinitionCode PRACTITIONER = new CompartmentdefinitionCode(Value.PRACTITIONER, "PRACTITIONER");

  public static final CompartmentdefinitionCode DEVICE = new CompartmentdefinitionCode(Value.DEVICE, "DEVICE");

  private final Value value;

  private final String string;

  CompartmentdefinitionCode(Value value, String string) {
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
      || (other instanceof CompartmentdefinitionCode && this.string.equals(((CompartmentdefinitionCode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ENCOUNTER:
        return visitor.visitENCOUNTER();
      case PATIENT:
        return visitor.visitPATIENT();
      case RELATEDPERSON:
        return visitor.visitRELATEDPERSON();
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
  public static CompartmentdefinitionCode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ENCOUNTER":
        return ENCOUNTER;
      case "PATIENT":
        return PATIENT;
      case "RELATEDPERSON":
        return RELATEDPERSON;
      case "PRACTITIONER":
        return PRACTITIONER;
      case "DEVICE":
        return DEVICE;
      default:
        return new CompartmentdefinitionCode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PATIENT,

    ENCOUNTER,

    RELATEDPERSON,

    PRACTITIONER,

    DEVICE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPATIENT();

    T visitENCOUNTER();

    T visitRELATEDPERSON();

    T visitPRACTITIONER();

    T visitDEVICE();

    T visitUnknown(String unknownType);
  }
}
