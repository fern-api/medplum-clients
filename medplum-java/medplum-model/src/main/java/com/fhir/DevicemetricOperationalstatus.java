package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DevicemetricOperationalstatus {
  public static final DevicemetricOperationalstatus STANDBY = new DevicemetricOperationalstatus(Value.STANDBY, "STANDBY");

  public static final DevicemetricOperationalstatus ON = new DevicemetricOperationalstatus(Value.ON, "ON");

  public static final DevicemetricOperationalstatus OFF = new DevicemetricOperationalstatus(Value.OFF, "OFF");

  private final Value value;

  private final String string;

  DevicemetricOperationalstatus(Value value, String string) {
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
      || (other instanceof DevicemetricOperationalstatus && this.string.equals(((DevicemetricOperationalstatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case STANDBY:
        return visitor.visitSTANDBY();
      case ON:
        return visitor.visitON();
      case OFF:
        return visitor.visitOFF();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DevicemetricOperationalstatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "STANDBY":
        return STANDBY;
      case "ON":
        return ON;
      case "OFF":
        return OFF;
      default:
        return new DevicemetricOperationalstatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ON,

    OFF,

    STANDBY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitON();

    T visitOFF();

    T visitSTANDBY();

    T visitUnknown(String unknownType);
  }
}
