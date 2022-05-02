package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Messageheader_responseCode {
  public static final Messageheader_responseCode OK = new Messageheader_responseCode(Value.OK, "OK");

  private final Value value;

  private final String string;

  Messageheader_responseCode(Value value, String string) {
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
      || (other instanceof Messageheader_responseCode && this.string.equals(((Messageheader_responseCode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OK:
        return visitor.visitOK();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Messageheader_responseCode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OK":
        return OK;
      default:
        return new Messageheader_responseCode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    OK,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOK();

    T visitUnknown(String unknownType);
  }
}
