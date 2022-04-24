package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SupplydeliveryStatus {
  public static final SupplydeliveryStatus ABANDONED = new SupplydeliveryStatus(Value.ABANDONED, "ABANDONED");

  public static final SupplydeliveryStatus COMPLETED = new SupplydeliveryStatus(Value.COMPLETED, "COMPLETED");

  private final Value value;

  private final String string;

  SupplydeliveryStatus(Value value, String string) {
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
      || (other instanceof SupplydeliveryStatus && this.string.equals(((SupplydeliveryStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ABANDONED:
        return visitor.visitABANDONED();
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SupplydeliveryStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ABANDONED":
        return ABANDONED;
      case "COMPLETED":
        return COMPLETED;
      default:
        return new SupplydeliveryStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    COMPLETED,

    ABANDONED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCOMPLETED();

    T visitABANDONED();

    T visitUnknown(String unknownType);
  }
}
