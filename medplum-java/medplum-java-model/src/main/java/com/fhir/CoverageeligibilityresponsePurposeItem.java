package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CoverageeligibilityresponsePurposeItem {
  public static final CoverageeligibilityresponsePurposeItem DISCOVERY = new CoverageeligibilityresponsePurposeItem(Value.DISCOVERY, "DISCOVERY");

  public static final CoverageeligibilityresponsePurposeItem VALIDATION = new CoverageeligibilityresponsePurposeItem(Value.VALIDATION, "VALIDATION");

  public static final CoverageeligibilityresponsePurposeItem BENEFITS = new CoverageeligibilityresponsePurposeItem(Value.BENEFITS, "BENEFITS");

  private final Value value;

  private final String string;

  CoverageeligibilityresponsePurposeItem(Value value, String string) {
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
      || (other instanceof CoverageeligibilityresponsePurposeItem && this.string.equals(((CoverageeligibilityresponsePurposeItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DISCOVERY:
        return visitor.visitDISCOVERY();
      case VALIDATION:
        return visitor.visitVALIDATION();
      case BENEFITS:
        return visitor.visitBENEFITS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CoverageeligibilityresponsePurposeItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DISCOVERY":
        return DISCOVERY;
      case "VALIDATION":
        return VALIDATION;
      case "BENEFITS":
        return BENEFITS;
      default:
        return new CoverageeligibilityresponsePurposeItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BENEFITS,

    DISCOVERY,

    VALIDATION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBENEFITS();

    T visitDISCOVERY();

    T visitVALIDATION();

    T visitUnknown(String unknownType);
  }
}
