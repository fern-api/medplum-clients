package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ResearchelementdefinitionType {
  public static final ResearchelementdefinitionType POPULATION = new ResearchelementdefinitionType(Value.POPULATION, "POPULATION");

  public static final ResearchelementdefinitionType OUTCOME = new ResearchelementdefinitionType(Value.OUTCOME, "OUTCOME");

  public static final ResearchelementdefinitionType EXPOSURE = new ResearchelementdefinitionType(Value.EXPOSURE, "EXPOSURE");

  private final Value value;

  private final String string;

  ResearchelementdefinitionType(Value value, String string) {
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
      || (other instanceof ResearchelementdefinitionType && this.string.equals(((ResearchelementdefinitionType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case POPULATION:
        return visitor.visitPOPULATION();
      case OUTCOME:
        return visitor.visitOUTCOME();
      case EXPOSURE:
        return visitor.visitEXPOSURE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ResearchelementdefinitionType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "POPULATION":
        return POPULATION;
      case "OUTCOME":
        return OUTCOME;
      case "EXPOSURE":
        return EXPOSURE;
      default:
        return new ResearchelementdefinitionType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    POPULATION,

    EXPOSURE,

    OUTCOME,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPOPULATION();

    T visitEXPOSURE();

    T visitOUTCOME();

    T visitUnknown(String unknownType);
  }
}
