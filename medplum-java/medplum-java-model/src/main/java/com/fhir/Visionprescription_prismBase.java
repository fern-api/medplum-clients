package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Visionprescription_prismBase {
  public static final Visionprescription_prismBase IN = new Visionprescription_prismBase(Value.IN, "IN");

  public static final Visionprescription_prismBase UP = new Visionprescription_prismBase(Value.UP, "UP");

  public static final Visionprescription_prismBase OUT = new Visionprescription_prismBase(Value.OUT, "OUT");

  public static final Visionprescription_prismBase DOWN = new Visionprescription_prismBase(Value.DOWN, "DOWN");

  private final Value value;

  private final String string;

  Visionprescription_prismBase(Value value, String string) {
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
      || (other instanceof Visionprescription_prismBase && this.string.equals(((Visionprescription_prismBase) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case IN:
        return visitor.visitIN();
      case UP:
        return visitor.visitUP();
      case OUT:
        return visitor.visitOUT();
      case DOWN:
        return visitor.visitDOWN();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Visionprescription_prismBase valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "IN":
        return IN;
      case "UP":
        return UP;
      case "OUT":
        return OUT;
      case "DOWN":
        return DOWN;
      default:
        return new Visionprescription_prismBase(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    UP,

    DOWN,

    IN,

    OUT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitUP();

    T visitDOWN();

    T visitIN();

    T visitOUT();

    T visitUnknown(String unknownType);
  }
}
