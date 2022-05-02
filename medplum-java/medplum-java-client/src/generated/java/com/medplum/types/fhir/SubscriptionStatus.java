package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SubscriptionStatus {
  public static final SubscriptionStatus ACTIVE = new SubscriptionStatus(Value.ACTIVE, "ACTIVE");

  public static final SubscriptionStatus ERROR = new SubscriptionStatus(Value.ERROR, "ERROR");

  public static final SubscriptionStatus REQUESTED = new SubscriptionStatus(Value.REQUESTED, "REQUESTED");

  public static final SubscriptionStatus OFF = new SubscriptionStatus(Value.OFF, "OFF");

  private final Value value;

  private final String string;

  SubscriptionStatus(Value value, String string) {
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
      || (other instanceof SubscriptionStatus && this.string.equals(((SubscriptionStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case ERROR:
        return visitor.visitERROR();
      case REQUESTED:
        return visitor.visitREQUESTED();
      case OFF:
        return visitor.visitOFF();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SubscriptionStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "ERROR":
        return ERROR;
      case "REQUESTED":
        return REQUESTED;
      case "OFF":
        return OFF;
      default:
        return new SubscriptionStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REQUESTED,

    ACTIVE,

    ERROR,

    OFF,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREQUESTED();

    T visitACTIVE();

    T visitERROR();

    T visitOFF();

    T visitUnknown(String unknownType);
  }
}
