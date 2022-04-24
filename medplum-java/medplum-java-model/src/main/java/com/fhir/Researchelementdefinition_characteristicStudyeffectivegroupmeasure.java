package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Researchelementdefinition_characteristicStudyeffectivegroupmeasure {
  public static final Researchelementdefinition_characteristicStudyeffectivegroupmeasure MEDIAN = new Researchelementdefinition_characteristicStudyeffectivegroupmeasure(Value.MEDIAN, "MEDIAN");

  public static final Researchelementdefinition_characteristicStudyeffectivegroupmeasure MEAN = new Researchelementdefinition_characteristicStudyeffectivegroupmeasure(Value.MEAN, "MEAN");

  private final Value value;

  private final String string;

  Researchelementdefinition_characteristicStudyeffectivegroupmeasure(Value value, String string) {
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
      || (other instanceof Researchelementdefinition_characteristicStudyeffectivegroupmeasure && this.string.equals(((Researchelementdefinition_characteristicStudyeffectivegroupmeasure) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case MEDIAN:
        return visitor.visitMEDIAN();
      case MEAN:
        return visitor.visitMEAN();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Researchelementdefinition_characteristicStudyeffectivegroupmeasure valueOf(
      @Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MEDIAN":
        return MEDIAN;
      case "MEAN":
        return MEAN;
      default:
        return new Researchelementdefinition_characteristicStudyeffectivegroupmeasure(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MEAN,

    MEDIAN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMEAN();

    T visitMEDIAN();

    T visitUnknown(String unknownType);
  }
}
