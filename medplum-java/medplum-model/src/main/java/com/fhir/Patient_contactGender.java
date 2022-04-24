package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Patient_contactGender {
  public static final Patient_contactGender OTHER = new Patient_contactGender(Value.OTHER, "OTHER");

  public static final Patient_contactGender FEMALE = new Patient_contactGender(Value.FEMALE, "FEMALE");

  public static final Patient_contactGender MALE = new Patient_contactGender(Value.MALE, "MALE");

  private final Value value;

  private final String string;

  Patient_contactGender(Value value, String string) {
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
      || (other instanceof Patient_contactGender && this.string.equals(((Patient_contactGender) other).string));
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
  public static Patient_contactGender valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OTHER":
        return OTHER;
      case "FEMALE":
        return FEMALE;
      case "MALE":
        return MALE;
      default:
        return new Patient_contactGender(Value.UNKNOWN, upperCasedValue);
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
