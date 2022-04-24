package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Graphdefinition_compartmentUse {
  public static final Graphdefinition_compartmentUse CONDITION = new Graphdefinition_compartmentUse(Value.CONDITION, "CONDITION");

  public static final Graphdefinition_compartmentUse REQUIREMENT = new Graphdefinition_compartmentUse(Value.REQUIREMENT, "REQUIREMENT");

  private final Value value;

  private final String string;

  Graphdefinition_compartmentUse(Value value, String string) {
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
      || (other instanceof Graphdefinition_compartmentUse && this.string.equals(((Graphdefinition_compartmentUse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case CONDITION:
        return visitor.visitCONDITION();
      case REQUIREMENT:
        return visitor.visitREQUIREMENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Graphdefinition_compartmentUse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CONDITION":
        return CONDITION;
      case "REQUIREMENT":
        return REQUIREMENT;
      default:
        return new Graphdefinition_compartmentUse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CONDITION,

    REQUIREMENT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCONDITION();

    T visitREQUIREMENT();

    T visitUnknown(String unknownType);
  }
}
