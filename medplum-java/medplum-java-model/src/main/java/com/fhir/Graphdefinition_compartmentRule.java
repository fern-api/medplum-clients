package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Graphdefinition_compartmentRule {
  public static final Graphdefinition_compartmentRule MATCHING = new Graphdefinition_compartmentRule(Value.MATCHING, "MATCHING");

  public static final Graphdefinition_compartmentRule CUSTOM = new Graphdefinition_compartmentRule(Value.CUSTOM, "CUSTOM");

  public static final Graphdefinition_compartmentRule DIFFERENT = new Graphdefinition_compartmentRule(Value.DIFFERENT, "DIFFERENT");

  public static final Graphdefinition_compartmentRule IDENTICAL = new Graphdefinition_compartmentRule(Value.IDENTICAL, "IDENTICAL");

  private final Value value;

  private final String string;

  Graphdefinition_compartmentRule(Value value, String string) {
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
      || (other instanceof Graphdefinition_compartmentRule && this.string.equals(((Graphdefinition_compartmentRule) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case MATCHING:
        return visitor.visitMATCHING();
      case CUSTOM:
        return visitor.visitCUSTOM();
      case DIFFERENT:
        return visitor.visitDIFFERENT();
      case IDENTICAL:
        return visitor.visitIDENTICAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Graphdefinition_compartmentRule valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MATCHING":
        return MATCHING;
      case "CUSTOM":
        return CUSTOM;
      case "DIFFERENT":
        return DIFFERENT;
      case "IDENTICAL":
        return IDENTICAL;
      default:
        return new Graphdefinition_compartmentRule(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    IDENTICAL,

    MATCHING,

    DIFFERENT,

    CUSTOM,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitIDENTICAL();

    T visitMATCHING();

    T visitDIFFERENT();

    T visitCUSTOM();

    T visitUnknown(String unknownType);
  }
}
