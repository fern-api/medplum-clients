package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AllergyintoleranceCategoryItem {
  public static final AllergyintoleranceCategoryItem ENVIRONMENT = new AllergyintoleranceCategoryItem(Value.ENVIRONMENT, "ENVIRONMENT");

  public static final AllergyintoleranceCategoryItem FOOD = new AllergyintoleranceCategoryItem(Value.FOOD, "FOOD");

  public static final AllergyintoleranceCategoryItem BIOLOGIC = new AllergyintoleranceCategoryItem(Value.BIOLOGIC, "BIOLOGIC");

  public static final AllergyintoleranceCategoryItem MEDICATION = new AllergyintoleranceCategoryItem(Value.MEDICATION, "MEDICATION");

  private final Value value;

  private final String string;

  AllergyintoleranceCategoryItem(Value value, String string) {
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
      || (other instanceof AllergyintoleranceCategoryItem && this.string.equals(((AllergyintoleranceCategoryItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ENVIRONMENT:
        return visitor.visitENVIRONMENT();
      case FOOD:
        return visitor.visitFOOD();
      case BIOLOGIC:
        return visitor.visitBIOLOGIC();
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
  public static AllergyintoleranceCategoryItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ENVIRONMENT":
        return ENVIRONMENT;
      case "FOOD":
        return FOOD;
      case "BIOLOGIC":
        return BIOLOGIC;
      case "MEDICATION":
        return MEDICATION;
      default:
        return new AllergyintoleranceCategoryItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FOOD,

    MEDICATION,

    ENVIRONMENT,

    BIOLOGIC,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFOOD();

    T visitMEDICATION();

    T visitENVIRONMENT();

    T visitBIOLOGIC();

    T visitUnknown(String unknownType);
  }
}
