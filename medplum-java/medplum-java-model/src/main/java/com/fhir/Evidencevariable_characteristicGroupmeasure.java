package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Evidencevariable_characteristicGroupmeasure {
  public static final Evidencevariable_characteristicGroupmeasure MEDIAN = new Evidencevariable_characteristicGroupmeasure(Value.MEDIAN, "MEDIAN");

  public static final Evidencevariable_characteristicGroupmeasure MEAN = new Evidencevariable_characteristicGroupmeasure(Value.MEAN, "MEAN");

  private final Value value;

  private final String string;

  Evidencevariable_characteristicGroupmeasure(Value value, String string) {
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
      || (other instanceof Evidencevariable_characteristicGroupmeasure && this.string.equals(((Evidencevariable_characteristicGroupmeasure) other).string));
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
  public static Evidencevariable_characteristicGroupmeasure valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MEDIAN":
        return MEDIAN;
      case "MEAN":
        return MEAN;
      default:
        return new Evidencevariable_characteristicGroupmeasure(Value.UNKNOWN, upperCasedValue);
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
