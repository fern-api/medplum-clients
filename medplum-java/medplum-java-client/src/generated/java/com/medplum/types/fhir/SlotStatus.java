package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SlotStatus {
  public static final SlotStatus BUSY = new SlotStatus(Value.BUSY, "BUSY");

  public static final SlotStatus FREE = new SlotStatus(Value.FREE, "FREE");

  private final Value value;

  private final String string;

  SlotStatus(Value value, String string) {
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
      || (other instanceof SlotStatus && this.string.equals(((SlotStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case BUSY:
        return visitor.visitBUSY();
      case FREE:
        return visitor.visitFREE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SlotStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "BUSY":
        return BUSY;
      case "FREE":
        return FREE;
      default:
        return new SlotStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BUSY,

    FREE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBUSY();

    T visitFREE();

    T visitUnknown(String unknownType);
  }
}
