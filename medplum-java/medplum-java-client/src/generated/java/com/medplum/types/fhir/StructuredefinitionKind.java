package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class StructuredefinitionKind {
  public static final StructuredefinitionKind LOGICAL = new StructuredefinitionKind(Value.LOGICAL, "LOGICAL");

  public static final StructuredefinitionKind RESOURCE = new StructuredefinitionKind(Value.RESOURCE, "RESOURCE");

  private final Value value;

  private final String string;

  StructuredefinitionKind(Value value, String string) {
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
      || (other instanceof StructuredefinitionKind && this.string.equals(((StructuredefinitionKind) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LOGICAL:
        return visitor.visitLOGICAL();
      case RESOURCE:
        return visitor.visitRESOURCE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static StructuredefinitionKind valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LOGICAL":
        return LOGICAL;
      case "RESOURCE":
        return RESOURCE;
      default:
        return new StructuredefinitionKind(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    RESOURCE,

    LOGICAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitRESOURCE();

    T visitLOGICAL();

    T visitUnknown(String unknownType);
  }
}
