package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class EvidencevariableType {
  public static final EvidencevariableType DESCRIPTIVE = new EvidencevariableType(Value.DESCRIPTIVE, "DESCRIPTIVE");

  public static final EvidencevariableType CONTINUOUS = new EvidencevariableType(Value.CONTINUOUS, "CONTINUOUS");

  public static final EvidencevariableType DICHOTOMOUS = new EvidencevariableType(Value.DICHOTOMOUS, "DICHOTOMOUS");

  private final Value value;

  private final String string;

  EvidencevariableType(Value value, String string) {
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
      || (other instanceof EvidencevariableType && this.string.equals(((EvidencevariableType) other).string));
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
  public static EvidencevariableType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DESCRIPTIVE":
        return DESCRIPTIVE;
      case "CONTINUOUS":
        return CONTINUOUS;
      case "DICHOTOMOUS":
        return DICHOTOMOUS;
      default:
        return new EvidencevariableType(Value.UNKNOWN, upperCasedValue);
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
