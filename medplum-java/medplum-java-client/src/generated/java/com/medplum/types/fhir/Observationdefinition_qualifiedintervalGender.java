package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Observationdefinition_qualifiedintervalGender {
  public static final Observationdefinition_qualifiedintervalGender OTHER = new Observationdefinition_qualifiedintervalGender(Value.OTHER, "OTHER");

  public static final Observationdefinition_qualifiedintervalGender FEMALE = new Observationdefinition_qualifiedintervalGender(Value.FEMALE, "FEMALE");

  public static final Observationdefinition_qualifiedintervalGender MALE = new Observationdefinition_qualifiedintervalGender(Value.MALE, "MALE");

  private final Value value;

  private final String string;

  Observationdefinition_qualifiedintervalGender(Value value, String string) {
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
      || (other instanceof Observationdefinition_qualifiedintervalGender && this.string.equals(((Observationdefinition_qualifiedintervalGender) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OTHER:
        return visitor.visitOTHER();
      case FEMALE:
        return visitor.visitFEMALE();
      case MALE:
        return visitor.visitMALE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Observationdefinition_qualifiedintervalGender valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OTHER":
        return OTHER;
      case "FEMALE":
        return FEMALE;
      case "MALE":
        return MALE;
      default:
        return new Observationdefinition_qualifiedintervalGender(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MALE,

    FEMALE,

    OTHER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMALE();

    T visitFEMALE();

    T visitOTHER();

    T visitUnknown(String unknownType);
  }
}
