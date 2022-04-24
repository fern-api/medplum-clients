package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Elementdefinition_typeAggregationItem {
  public static final Elementdefinition_typeAggregationItem CONTAINED = new Elementdefinition_typeAggregationItem(Value.CONTAINED, "CONTAINED");

  public static final Elementdefinition_typeAggregationItem BUNDLED = new Elementdefinition_typeAggregationItem(Value.BUNDLED, "BUNDLED");

  public static final Elementdefinition_typeAggregationItem REFERENCED = new Elementdefinition_typeAggregationItem(Value.REFERENCED, "REFERENCED");

  private final Value value;

  private final String string;

  Elementdefinition_typeAggregationItem(Value value, String string) {
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
      || (other instanceof Elementdefinition_typeAggregationItem && this.string.equals(((Elementdefinition_typeAggregationItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case CONTAINED:
        return visitor.visitCONTAINED();
      case BUNDLED:
        return visitor.visitBUNDLED();
      case REFERENCED:
        return visitor.visitREFERENCED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Elementdefinition_typeAggregationItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CONTAINED":
        return CONTAINED;
      case "BUNDLED":
        return BUNDLED;
      case "REFERENCED":
        return REFERENCED;
      default:
        return new Elementdefinition_typeAggregationItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CONTAINED,

    REFERENCED,

    BUNDLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCONTAINED();

    T visitREFERENCED();

    T visitBUNDLED();

    T visitUnknown(String unknownType);
  }
}
