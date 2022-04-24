package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Testscript_assertDirection {
  public static final Testscript_assertDirection RESPONSE = new Testscript_assertDirection(Value.RESPONSE, "RESPONSE");

  public static final Testscript_assertDirection REQUEST = new Testscript_assertDirection(Value.REQUEST, "REQUEST");

  private final Value value;

  private final String string;

  Testscript_assertDirection(Value value, String string) {
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
      || (other instanceof Testscript_assertDirection && this.string.equals(((Testscript_assertDirection) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case RESPONSE:
        return visitor.visitRESPONSE();
      case REQUEST:
        return visitor.visitREQUEST();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Testscript_assertDirection valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "RESPONSE":
        return RESPONSE;
      case "REQUEST":
        return REQUEST;
      default:
        return new Testscript_assertDirection(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    RESPONSE,

    REQUEST,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitRESPONSE();

    T visitREQUEST();

    T visitUnknown(String unknownType);
  }
}
