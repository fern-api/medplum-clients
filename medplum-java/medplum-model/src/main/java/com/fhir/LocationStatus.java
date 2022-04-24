package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class LocationStatus {
  public static final LocationStatus ACTIVE = new LocationStatus(Value.ACTIVE, "ACTIVE");

  public static final LocationStatus SUSPENDED = new LocationStatus(Value.SUSPENDED, "SUSPENDED");

  public static final LocationStatus INACTIVE = new LocationStatus(Value.INACTIVE, "INACTIVE");

  private final Value value;

  private final String string;

  LocationStatus(Value value, String string) {
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
      || (other instanceof LocationStatus && this.string.equals(((LocationStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case SUSPENDED:
        return visitor.visitSUSPENDED();
      case INACTIVE:
        return visitor.visitINACTIVE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static LocationStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "SUSPENDED":
        return SUSPENDED;
      case "INACTIVE":
        return INACTIVE;
      default:
        return new LocationStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    SUSPENDED,

    INACTIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACTIVE();

    T visitSUSPENDED();

    T visitINACTIVE();

    T visitUnknown(String unknownType);
  }
}
