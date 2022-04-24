package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AllergyintoleranceType {
  public static final AllergyintoleranceType INTOLERANCE = new AllergyintoleranceType(Value.INTOLERANCE, "INTOLERANCE");

  public static final AllergyintoleranceType ALLERGY = new AllergyintoleranceType(Value.ALLERGY, "ALLERGY");

  private final Value value;

  private final String string;

  AllergyintoleranceType(Value value, String string) {
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
      || (other instanceof AllergyintoleranceType && this.string.equals(((AllergyintoleranceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case INTOLERANCE:
        return visitor.visitINTOLERANCE();
      case ALLERGY:
        return visitor.visitALLERGY();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AllergyintoleranceType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "INTOLERANCE":
        return INTOLERANCE;
      case "ALLERGY":
        return ALLERGY;
      default:
        return new AllergyintoleranceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ALLERGY,

    INTOLERANCE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitALLERGY();

    T visitINTOLERANCE();

    T visitUnknown(String unknownType);
  }
}
