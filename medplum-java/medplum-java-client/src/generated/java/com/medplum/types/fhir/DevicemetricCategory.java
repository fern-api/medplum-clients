package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DevicemetricCategory {
  public static final DevicemetricCategory SETTING = new DevicemetricCategory(Value.SETTING, "SETTING");

  public static final DevicemetricCategory UNSPECIFIED = new DevicemetricCategory(Value.UNSPECIFIED, "UNSPECIFIED");

  public static final DevicemetricCategory CALCULATION = new DevicemetricCategory(Value.CALCULATION, "CALCULATION");

  public static final DevicemetricCategory MEASUREMENT = new DevicemetricCategory(Value.MEASUREMENT, "MEASUREMENT");

  private final Value value;

  private final String string;

  DevicemetricCategory(Value value, String string) {
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
      || (other instanceof DevicemetricCategory && this.string.equals(((DevicemetricCategory) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SETTING:
        return visitor.visitSETTING();
      case UNSPECIFIED:
        return visitor.visitUNSPECIFIED();
      case CALCULATION:
        return visitor.visitCALCULATION();
      case MEASUREMENT:
        return visitor.visitMEASUREMENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DevicemetricCategory valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SETTING":
        return SETTING;
      case "UNSPECIFIED":
        return UNSPECIFIED;
      case "CALCULATION":
        return CALCULATION;
      case "MEASUREMENT":
        return MEASUREMENT;
      default:
        return new DevicemetricCategory(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MEASUREMENT,

    SETTING,

    CALCULATION,

    UNSPECIFIED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMEASUREMENT();

    T visitSETTING();

    T visitCALCULATION();

    T visitUNSPECIFIED();

    T visitUnknown(String unknownType);
  }
}
