package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Effectevidencesynthesis_resultsbyexposureExposurestate {
  public static final Effectevidencesynthesis_resultsbyexposureExposurestate EXPOSURE = new Effectevidencesynthesis_resultsbyexposureExposurestate(Value.EXPOSURE, "EXPOSURE");

  private final Value value;

  private final String string;

  Effectevidencesynthesis_resultsbyexposureExposurestate(Value value, String string) {
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
      || (other instanceof Effectevidencesynthesis_resultsbyexposureExposurestate && this.string.equals(((Effectevidencesynthesis_resultsbyexposureExposurestate) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
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
  public static Effectevidencesynthesis_resultsbyexposureExposurestate valueOf(
      @Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EXPOSURE":
        return EXPOSURE;
      default:
        return new Effectevidencesynthesis_resultsbyexposureExposurestate(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    EXPOSURE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEXPOSURE();

    T visitUnknown(String unknownType);
  }
}
