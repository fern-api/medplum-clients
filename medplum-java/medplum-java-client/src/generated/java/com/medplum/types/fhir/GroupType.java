package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class GroupType {
  public static final GroupType ANIMAL = new GroupType(Value.ANIMAL, "ANIMAL");

  public static final GroupType PERSON = new GroupType(Value.PERSON, "PERSON");

  public static final GroupType PRACTITIONER = new GroupType(Value.PRACTITIONER, "PRACTITIONER");

  public static final GroupType DEVICE = new GroupType(Value.DEVICE, "DEVICE");

  public static final GroupType SUBSTANCE = new GroupType(Value.SUBSTANCE, "SUBSTANCE");

  public static final GroupType MEDICATION = new GroupType(Value.MEDICATION, "MEDICATION");

  private final Value value;

  private final String string;

  GroupType(Value value, String string) {
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
      || (other instanceof GroupType && this.string.equals(((GroupType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ANIMAL:
        return visitor.visitANIMAL();
      case PERSON:
        return visitor.visitPERSON();
      case PRACTITIONER:
        return visitor.visitPRACTITIONER();
      case DEVICE:
        return visitor.visitDEVICE();
      case SUBSTANCE:
        return visitor.visitSUBSTANCE();
      case MEDICATION:
        return visitor.visitMEDICATION();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static GroupType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ANIMAL":
        return ANIMAL;
      case "PERSON":
        return PERSON;
      case "PRACTITIONER":
        return PRACTITIONER;
      case "DEVICE":
        return DEVICE;
      case "SUBSTANCE":
        return SUBSTANCE;
      case "MEDICATION":
        return MEDICATION;
      default:
        return new GroupType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PERSON,

    ANIMAL,

    PRACTITIONER,

    DEVICE,

    MEDICATION,

    SUBSTANCE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPERSON();

    T visitANIMAL();

    T visitPRACTITIONER();

    T visitDEVICE();

    T visitMEDICATION();

    T visitSUBSTANCE();

    T visitUnknown(String unknownType);
  }
}
