package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ResearchelementdefinitionVariabletype {
  public static final ResearchelementdefinitionVariabletype DESCRIPTIVE = new ResearchelementdefinitionVariabletype(Value.DESCRIPTIVE, "DESCRIPTIVE");

  public static final ResearchelementdefinitionVariabletype CONTINUOUS = new ResearchelementdefinitionVariabletype(Value.CONTINUOUS, "CONTINUOUS");

  public static final ResearchelementdefinitionVariabletype DICHOTOMOUS = new ResearchelementdefinitionVariabletype(Value.DICHOTOMOUS, "DICHOTOMOUS");

  private final Value value;

  private final String string;

  ResearchelementdefinitionVariabletype(Value value, String string) {
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
      || (other instanceof ResearchelementdefinitionVariabletype && this.string.equals(((ResearchelementdefinitionVariabletype) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DESCRIPTIVE:
        return visitor.visitDESCRIPTIVE();
      case CONTINUOUS:
        return visitor.visitCONTINUOUS();
      case DICHOTOMOUS:
        return visitor.visitDICHOTOMOUS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ResearchelementdefinitionVariabletype valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DESCRIPTIVE":
        return DESCRIPTIVE;
      case "CONTINUOUS":
        return CONTINUOUS;
      case "DICHOTOMOUS":
        return DICHOTOMOUS;
      default:
        return new ResearchelementdefinitionVariabletype(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DICHOTOMOUS,

    CONTINUOUS,

    DESCRIPTIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDICHOTOMOUS();

    T visitCONTINUOUS();

    T visitDESCRIPTIVE();

    T visitUnknown(String unknownType);
  }
}
