package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class BiologicallyderivedproductStatus {
  public static final BiologicallyderivedproductStatus UNAVAILABLE = new BiologicallyderivedproductStatus(Value.UNAVAILABLE, "UNAVAILABLE");

  public static final BiologicallyderivedproductStatus AVAILABLE = new BiologicallyderivedproductStatus(Value.AVAILABLE, "AVAILABLE");

  private final Value value;

  private final String string;

  BiologicallyderivedproductStatus(Value value, String string) {
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
      || (other instanceof BiologicallyderivedproductStatus && this.string.equals(((BiologicallyderivedproductStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case UNAVAILABLE:
        return visitor.visitUNAVAILABLE();
      case AVAILABLE:
        return visitor.visitAVAILABLE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static BiologicallyderivedproductStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "UNAVAILABLE":
        return UNAVAILABLE;
      case "AVAILABLE":
        return AVAILABLE;
      default:
        return new BiologicallyderivedproductStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AVAILABLE,

    UNAVAILABLE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAVAILABLE();

    T visitUNAVAILABLE();

    T visitUnknown(String unknownType);
  }
}
