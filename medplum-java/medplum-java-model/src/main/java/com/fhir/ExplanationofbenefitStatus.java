package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ExplanationofbenefitStatus {
  public static final ExplanationofbenefitStatus ACTIVE = new ExplanationofbenefitStatus(Value.ACTIVE, "ACTIVE");

  public static final ExplanationofbenefitStatus DRAFT = new ExplanationofbenefitStatus(Value.DRAFT, "DRAFT");

  public static final ExplanationofbenefitStatus CANCELLED = new ExplanationofbenefitStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  ExplanationofbenefitStatus(Value value, String string) {
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
      || (other instanceof ExplanationofbenefitStatus && this.string.equals(((ExplanationofbenefitStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case DRAFT:
        return visitor.visitDRAFT();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ExplanationofbenefitStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "DRAFT":
        return DRAFT;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new ExplanationofbenefitStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    CANCELLED,

    DRAFT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACTIVE();

    T visitCANCELLED();

    T visitDRAFT();

    T visitUnknown(String unknownType);
  }
}
