package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class MessagedefinitionResponserequired {
  public static final MessagedefinitionResponserequired NEVER = new MessagedefinitionResponserequired(Value.NEVER, "NEVER");

  public static final MessagedefinitionResponserequired ALWAYS = new MessagedefinitionResponserequired(Value.ALWAYS, "ALWAYS");

  private final Value value;

  private final String string;

  MessagedefinitionResponserequired(Value value, String string) {
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
      || (other instanceof MessagedefinitionResponserequired && this.string.equals(((MessagedefinitionResponserequired) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case NEVER:
        return visitor.visitNEVER();
      case ALWAYS:
        return visitor.visitALWAYS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static MessagedefinitionResponserequired valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "NEVER":
        return NEVER;
      case "ALWAYS":
        return ALWAYS;
      default:
        return new MessagedefinitionResponserequired(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ALWAYS,

    NEVER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitALWAYS();

    T visitNEVER();

    T visitUnknown(String unknownType);
  }
}
