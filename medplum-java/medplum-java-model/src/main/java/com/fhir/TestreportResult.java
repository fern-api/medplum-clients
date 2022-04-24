package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class TestreportResult {
  public static final TestreportResult PASS = new TestreportResult(Value.PASS, "PASS");

  public static final TestreportResult FAIL = new TestreportResult(Value.FAIL, "FAIL");

  public static final TestreportResult PENDING = new TestreportResult(Value.PENDING, "PENDING");

  private final Value value;

  private final String string;

  TestreportResult(Value value, String string) {
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
      || (other instanceof TestreportResult && this.string.equals(((TestreportResult) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PASS:
        return visitor.visitPASS();
      case FAIL:
        return visitor.visitFAIL();
      case PENDING:
        return visitor.visitPENDING();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TestreportResult valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PASS":
        return PASS;
      case "FAIL":
        return FAIL;
      case "PENDING":
        return PENDING;
      default:
        return new TestreportResult(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PASS,

    FAIL,

    PENDING,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPASS();

    T visitFAIL();

    T visitPENDING();

    T visitUnknown(String unknownType);
  }
}
