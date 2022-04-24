package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class LocationMode {
  public static final LocationMode KIND = new LocationMode(Value.KIND, "KIND");

  public static final LocationMode INSTANCE = new LocationMode(Value.INSTANCE, "INSTANCE");

  private final Value value;

  private final String string;

  LocationMode(Value value, String string) {
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
      || (other instanceof LocationMode && this.string.equals(((LocationMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case KIND:
        return visitor.visitKIND();
      case INSTANCE:
        return visitor.visitINSTANCE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static LocationMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "KIND":
        return KIND;
      case "INSTANCE":
        return INSTANCE;
      default:
        return new LocationMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INSTANCE,

    KIND,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitINSTANCE();

    T visitKIND();

    T visitUnknown(String unknownType);
  }
}
