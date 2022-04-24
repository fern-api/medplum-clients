package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuremap_targetContexttype {
  public static final Structuremap_targetContexttype VARIABLE = new Structuremap_targetContexttype(Value.VARIABLE, "VARIABLE");

  public static final Structuremap_targetContexttype TYPE = new Structuremap_targetContexttype(Value.TYPE, "TYPE");

  private final Value value;

  private final String string;

  Structuremap_targetContexttype(Value value, String string) {
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
      || (other instanceof Structuremap_targetContexttype && this.string.equals(((Structuremap_targetContexttype) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case VARIABLE:
        return visitor.visitVARIABLE();
      case TYPE:
        return visitor.visitTYPE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Structuremap_targetContexttype valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "VARIABLE":
        return VARIABLE;
      case "TYPE":
        return TYPE;
      default:
        return new Structuremap_targetContexttype(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    TYPE,

    VARIABLE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitTYPE();

    T visitVARIABLE();

    T visitUnknown(String unknownType);
  }
}
