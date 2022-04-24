package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuremap_sourceListmode {
  public static final Structuremap_sourceListmode FIRST = new Structuremap_sourceListmode(Value.FIRST, "FIRST");

  public static final Structuremap_sourceListmode LAST = new Structuremap_sourceListmode(Value.LAST, "LAST");

  private final Value value;

  private final String string;

  Structuremap_sourceListmode(Value value, String string) {
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
      || (other instanceof Structuremap_sourceListmode && this.string.equals(((Structuremap_sourceListmode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case FIRST:
        return visitor.visitFIRST();
      case LAST:
        return visitor.visitLAST();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Structuremap_sourceListmode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FIRST":
        return FIRST;
      case "LAST":
        return LAST;
      default:
        return new Structuremap_sourceListmode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FIRST,

    LAST,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFIRST();

    T visitLAST();

    T visitUnknown(String unknownType);
  }
}
