package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuremap_groupTypemode {
  public static final Structuremap_groupTypemode NONE = new Structuremap_groupTypemode(Value.NONE, "NONE");

  public static final Structuremap_groupTypemode TYPES = new Structuremap_groupTypemode(Value.TYPES, "TYPES");

  private final Value value;

  private final String string;

  Structuremap_groupTypemode(Value value, String string) {
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
      || (other instanceof Structuremap_groupTypemode && this.string.equals(((Structuremap_groupTypemode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case NONE:
        return visitor.visitNONE();
      case TYPES:
        return visitor.visitTYPES();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Structuremap_groupTypemode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "NONE":
        return NONE;
      case "TYPES":
        return TYPES;
      default:
        return new Structuremap_groupTypemode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NONE,

    TYPES,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNONE();

    T visitTYPES();

    T visitUnknown(String unknownType);
  }
}
