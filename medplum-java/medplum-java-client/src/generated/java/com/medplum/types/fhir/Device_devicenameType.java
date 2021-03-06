package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Device_devicenameType {
  public static final Device_devicenameType OTHER = new Device_devicenameType(Value.OTHER, "OTHER");

  private final Value value;

  private final String string;

  Device_devicenameType(Value value, String string) {
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
      || (other instanceof Device_devicenameType && this.string.equals(((Device_devicenameType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OTHER:
        return visitor.visitOTHER();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Device_devicenameType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OTHER":
        return OTHER;
      default:
        return new Device_devicenameType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    OTHER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOTHER();

    T visitUnknown(String unknownType);
  }
}
