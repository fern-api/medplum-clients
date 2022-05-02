package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuremap_inputMode {
  public static final Structuremap_inputMode SOURCE = new Structuremap_inputMode(Value.SOURCE, "SOURCE");

  public static final Structuremap_inputMode TARGET = new Structuremap_inputMode(Value.TARGET, "TARGET");

  private final Value value;

  private final String string;

  Structuremap_inputMode(Value value, String string) {
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
      || (other instanceof Structuremap_inputMode && this.string.equals(((Structuremap_inputMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SOURCE:
        return visitor.visitSOURCE();
      case TARGET:
        return visitor.visitTARGET();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Structuremap_inputMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SOURCE":
        return SOURCE;
      case "TARGET":
        return TARGET;
      default:
        return new Structuremap_inputMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SOURCE,

    TARGET,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSOURCE();

    T visitTARGET();

    T visitUnknown(String unknownType);
  }
}
