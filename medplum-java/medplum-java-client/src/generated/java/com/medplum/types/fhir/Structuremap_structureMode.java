package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuremap_structureMode {
  public static final Structuremap_structureMode PRODUCED = new Structuremap_structureMode(Value.PRODUCED, "PRODUCED");

  public static final Structuremap_structureMode SOURCE = new Structuremap_structureMode(Value.SOURCE, "SOURCE");

  public static final Structuremap_structureMode QUERIED = new Structuremap_structureMode(Value.QUERIED, "QUERIED");

  public static final Structuremap_structureMode TARGET = new Structuremap_structureMode(Value.TARGET, "TARGET");

  private final Value value;

  private final String string;

  Structuremap_structureMode(Value value, String string) {
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
      || (other instanceof Structuremap_structureMode && this.string.equals(((Structuremap_structureMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PRODUCED:
        return visitor.visitPRODUCED();
      case SOURCE:
        return visitor.visitSOURCE();
      case QUERIED:
        return visitor.visitQUERIED();
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
  public static Structuremap_structureMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PRODUCED":
        return PRODUCED;
      case "SOURCE":
        return SOURCE;
      case "QUERIED":
        return QUERIED;
      case "TARGET":
        return TARGET;
      default:
        return new Structuremap_structureMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SOURCE,

    QUERIED,

    TARGET,

    PRODUCED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSOURCE();

    T visitQUERIED();

    T visitTARGET();

    T visitPRODUCED();

    T visitUnknown(String unknownType);
  }
}
