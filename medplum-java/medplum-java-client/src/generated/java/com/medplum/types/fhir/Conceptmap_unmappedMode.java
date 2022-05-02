package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Conceptmap_unmappedMode {
  public static final Conceptmap_unmappedMode PROVIDED = new Conceptmap_unmappedMode(Value.PROVIDED, "PROVIDED");

  public static final Conceptmap_unmappedMode FIXED = new Conceptmap_unmappedMode(Value.FIXED, "FIXED");

  private final Value value;

  private final String string;

  Conceptmap_unmappedMode(Value value, String string) {
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
      || (other instanceof Conceptmap_unmappedMode && this.string.equals(((Conceptmap_unmappedMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PROVIDED:
        return visitor.visitPROVIDED();
      case FIXED:
        return visitor.visitFIXED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Conceptmap_unmappedMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PROVIDED":
        return PROVIDED;
      case "FIXED":
        return FIXED;
      default:
        return new Conceptmap_unmappedMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PROVIDED,

    FIXED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPROVIDED();

    T visitFIXED();

    T visitUnknown(String unknownType);
  }
}
