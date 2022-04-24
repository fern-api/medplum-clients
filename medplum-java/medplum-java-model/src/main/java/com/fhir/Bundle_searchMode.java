package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Bundle_searchMode {
  public static final Bundle_searchMode INCLUDE = new Bundle_searchMode(Value.INCLUDE, "INCLUDE");

  public static final Bundle_searchMode OUTCOME = new Bundle_searchMode(Value.OUTCOME, "OUTCOME");

  public static final Bundle_searchMode MATCH = new Bundle_searchMode(Value.MATCH, "MATCH");

  private final Value value;

  private final String string;

  Bundle_searchMode(Value value, String string) {
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
      || (other instanceof Bundle_searchMode && this.string.equals(((Bundle_searchMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case INCLUDE:
        return visitor.visitINCLUDE();
      case OUTCOME:
        return visitor.visitOUTCOME();
      case MATCH:
        return visitor.visitMATCH();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Bundle_searchMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "INCLUDE":
        return INCLUDE;
      case "OUTCOME":
        return OUTCOME;
      case "MATCH":
        return MATCH;
      default:
        return new Bundle_searchMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MATCH,

    INCLUDE,

    OUTCOME,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMATCH();

    T visitINCLUDE();

    T visitOUTCOME();

    T visitUnknown(String unknownType);
  }
}
