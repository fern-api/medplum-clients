package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ImagingstudyStatus {
  public static final ImagingstudyStatus REGISTERED = new ImagingstudyStatus(Value.REGISTERED, "REGISTERED");

  public static final ImagingstudyStatus AVAILABLE = new ImagingstudyStatus(Value.AVAILABLE, "AVAILABLE");

  public static final ImagingstudyStatus CANCELLED = new ImagingstudyStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  ImagingstudyStatus(Value value, String string) {
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
      || (other instanceof ImagingstudyStatus && this.string.equals(((ImagingstudyStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case REGISTERED:
        return visitor.visitREGISTERED();
      case AVAILABLE:
        return visitor.visitAVAILABLE();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ImagingstudyStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "REGISTERED":
        return REGISTERED;
      case "AVAILABLE":
        return AVAILABLE;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new ImagingstudyStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REGISTERED,

    AVAILABLE,

    CANCELLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREGISTERED();

    T visitAVAILABLE();

    T visitCANCELLED();

    T visitUnknown(String unknownType);
  }
}
