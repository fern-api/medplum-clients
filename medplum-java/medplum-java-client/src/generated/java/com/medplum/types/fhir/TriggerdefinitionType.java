package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class TriggerdefinitionType {
  public static final TriggerdefinitionType PERIODIC = new TriggerdefinitionType(Value.PERIODIC, "PERIODIC");

  private final Value value;

  private final String string;

  TriggerdefinitionType(Value value, String string) {
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
      || (other instanceof TriggerdefinitionType && this.string.equals(((TriggerdefinitionType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PERIODIC:
        return visitor.visitPERIODIC();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TriggerdefinitionType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PERIODIC":
        return PERIODIC;
      default:
        return new TriggerdefinitionType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PERIODIC,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPERIODIC();

    T visitUnknown(String unknownType);
  }
}
