package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class GrantType {
  public static final GrantType CLIENT_CREDENTIALS = new GrantType(Value.CLIENT_CREDENTIALS, "CLIENT_CREDENTIALS");

  private final Value value;

  private final String string;

  GrantType(Value value, String string) {
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
      || (other instanceof GrantType && this.string.equals(((GrantType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case CLIENT_CREDENTIALS:
        return visitor.visitCLIENT_CREDENTIALS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static GrantType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CLIENT_CREDENTIALS":
        return CLIENT_CREDENTIALS;
      default:
        return new GrantType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CLIENT_CREDENTIALS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCLIENT_CREDENTIALS();

    T visitUnknown(String unknownType);
  }
}
