package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Implementationguide_resourceFhirversionItem {
  private final Value value;

  private final String string;

  Implementationguide_resourceFhirversionItem(Value value, String string) {
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
      || (other instanceof Implementationguide_resourceFhirversionItem && this.string.equals(((Implementationguide_resourceFhirversionItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Implementationguide_resourceFhirversionItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      default:
        return new Implementationguide_resourceFhirversionItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    UNKNOWN
  }

  public interface Visitor<T> {
    T visitUnknown(String unknownType);
  }
}
