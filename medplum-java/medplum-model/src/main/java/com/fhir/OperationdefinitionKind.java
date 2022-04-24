package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class OperationdefinitionKind {
  public static final OperationdefinitionKind OPERATION = new OperationdefinitionKind(Value.OPERATION, "OPERATION");

  public static final OperationdefinitionKind QUERY = new OperationdefinitionKind(Value.QUERY, "QUERY");

  private final Value value;

  private final String string;

  OperationdefinitionKind(Value value, String string) {
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
      || (other instanceof OperationdefinitionKind && this.string.equals(((OperationdefinitionKind) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OPERATION:
        return visitor.visitOPERATION();
      case QUERY:
        return visitor.visitQUERY();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static OperationdefinitionKind valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OPERATION":
        return OPERATION;
      case "QUERY":
        return QUERY;
      default:
        return new OperationdefinitionKind(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    OPERATION,

    QUERY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOPERATION();

    T visitQUERY();

    T visitUnknown(String unknownType);
  }
}
