package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DevicemetricColor {
  public static final DevicemetricColor GREEN = new DevicemetricColor(Value.GREEN, "GREEN");

  public static final DevicemetricColor YELLOW = new DevicemetricColor(Value.YELLOW, "YELLOW");

  public static final DevicemetricColor CYAN = new DevicemetricColor(Value.CYAN, "CYAN");

  public static final DevicemetricColor MAGENTA = new DevicemetricColor(Value.MAGENTA, "MAGENTA");

  public static final DevicemetricColor BLUE = new DevicemetricColor(Value.BLUE, "BLUE");

  public static final DevicemetricColor BLACK = new DevicemetricColor(Value.BLACK, "BLACK");

  public static final DevicemetricColor WHITE = new DevicemetricColor(Value.WHITE, "WHITE");

  public static final DevicemetricColor RED = new DevicemetricColor(Value.RED, "RED");

  private final Value value;

  private final String string;

  DevicemetricColor(Value value, String string) {
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
      || (other instanceof DevicemetricColor && this.string.equals(((DevicemetricColor) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case GREEN:
        return visitor.visitGREEN();
      case YELLOW:
        return visitor.visitYELLOW();
      case CYAN:
        return visitor.visitCYAN();
      case MAGENTA:
        return visitor.visitMAGENTA();
      case BLUE:
        return visitor.visitBLUE();
      case BLACK:
        return visitor.visitBLACK();
      case WHITE:
        return visitor.visitWHITE();
      case RED:
        return visitor.visitRED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DevicemetricColor valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "GREEN":
        return GREEN;
      case "YELLOW":
        return YELLOW;
      case "CYAN":
        return CYAN;
      case "MAGENTA":
        return MAGENTA;
      case "BLUE":
        return BLUE;
      case "BLACK":
        return BLACK;
      case "WHITE":
        return WHITE;
      case "RED":
        return RED;
      default:
        return new DevicemetricColor(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BLACK,

    RED,

    GREEN,

    YELLOW,

    BLUE,

    MAGENTA,

    CYAN,

    WHITE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBLACK();

    T visitRED();

    T visitGREEN();

    T visitYELLOW();

    T visitBLUE();

    T visitMAGENTA();

    T visitCYAN();

    T visitWHITE();

    T visitUnknown(String unknownType);
  }
}
