package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Visionprescription_lensspecificationEye {
  public static final Visionprescription_lensspecificationEye LEFT = new Visionprescription_lensspecificationEye(Value.LEFT, "LEFT");

  public static final Visionprescription_lensspecificationEye RIGHT = new Visionprescription_lensspecificationEye(Value.RIGHT, "RIGHT");

  private final Value value;

  private final String string;

  Visionprescription_lensspecificationEye(Value value, String string) {
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
      || (other instanceof Visionprescription_lensspecificationEye && this.string.equals(((Visionprescription_lensspecificationEye) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LEFT:
        return visitor.visitLEFT();
      case RIGHT:
        return visitor.visitRIGHT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Visionprescription_lensspecificationEye valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LEFT":
        return LEFT;
      case "RIGHT":
        return RIGHT;
      default:
        return new Visionprescription_lensspecificationEye(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    RIGHT,

    LEFT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitRIGHT();

    T visitLEFT();

    T visitUnknown(String unknownType);
  }
}
