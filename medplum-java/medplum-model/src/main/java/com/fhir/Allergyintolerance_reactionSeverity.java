package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Allergyintolerance_reactionSeverity {
  public static final Allergyintolerance_reactionSeverity MILD = new Allergyintolerance_reactionSeverity(Value.MILD, "MILD");

  public static final Allergyintolerance_reactionSeverity MODERATE = new Allergyintolerance_reactionSeverity(Value.MODERATE, "MODERATE");

  public static final Allergyintolerance_reactionSeverity SEVERE = new Allergyintolerance_reactionSeverity(Value.SEVERE, "SEVERE");

  private final Value value;

  private final String string;

  Allergyintolerance_reactionSeverity(Value value, String string) {
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
      || (other instanceof Allergyintolerance_reactionSeverity && this.string.equals(((Allergyintolerance_reactionSeverity) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case MILD:
        return visitor.visitMILD();
      case MODERATE:
        return visitor.visitMODERATE();
      case SEVERE:
        return visitor.visitSEVERE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Allergyintolerance_reactionSeverity valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MILD":
        return MILD;
      case "MODERATE":
        return MODERATE;
      case "SEVERE":
        return SEVERE;
      default:
        return new Allergyintolerance_reactionSeverity(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MILD,

    MODERATE,

    SEVERE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMILD();

    T visitMODERATE();

    T visitSEVERE();

    T visitUnknown(String unknownType);
  }
}
