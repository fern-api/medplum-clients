package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ClaimUse {
  public static final ClaimUse PREDETERMINATION = new ClaimUse(Value.PREDETERMINATION, "PREDETERMINATION");

  public static final ClaimUse CLAIM = new ClaimUse(Value.CLAIM, "CLAIM");

  public static final ClaimUse PREAUTHORIZATION = new ClaimUse(Value.PREAUTHORIZATION, "PREAUTHORIZATION");

  private final Value value;

  private final String string;

  ClaimUse(Value value, String string) {
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
      || (other instanceof ClaimUse && this.string.equals(((ClaimUse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PREDETERMINATION:
        return visitor.visitPREDETERMINATION();
      case CLAIM:
        return visitor.visitCLAIM();
      case PREAUTHORIZATION:
        return visitor.visitPREAUTHORIZATION();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ClaimUse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PREDETERMINATION":
        return PREDETERMINATION;
      case "CLAIM":
        return CLAIM;
      case "PREAUTHORIZATION":
        return PREAUTHORIZATION;
      default:
        return new ClaimUse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CLAIM,

    PREAUTHORIZATION,

    PREDETERMINATION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCLAIM();

    T visitPREAUTHORIZATION();

    T visitPREDETERMINATION();

    T visitUnknown(String unknownType);
  }
}
