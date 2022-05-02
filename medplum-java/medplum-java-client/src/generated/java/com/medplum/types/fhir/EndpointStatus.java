package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class EndpointStatus {
  public static final EndpointStatus ACTIVE = new EndpointStatus(Value.ACTIVE, "ACTIVE");

  public static final EndpointStatus ERROR = new EndpointStatus(Value.ERROR, "ERROR");

  public static final EndpointStatus SUSPENDED = new EndpointStatus(Value.SUSPENDED, "SUSPENDED");

  public static final EndpointStatus TEST = new EndpointStatus(Value.TEST, "TEST");

  public static final EndpointStatus OFF = new EndpointStatus(Value.OFF, "OFF");

  private final Value value;

  private final String string;

  EndpointStatus(Value value, String string) {
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
      || (other instanceof EndpointStatus && this.string.equals(((EndpointStatus) other).string));
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
      case SUSPENDED:
        return visitor.visitSUSPENDED();
      case TEST:
        return visitor.visitTEST();
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
  public static EndpointStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "ERROR":
        return ERROR;
      case "SUSPENDED":
        return SUSPENDED;
      case "TEST":
        return TEST;
      case "OFF":
        return OFF;
      default:
        return new EndpointStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    SUSPENDED,

    ERROR,

    OFF,

    TEST,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACTIVE();

    T visitSUSPENDED();

    T visitERROR();

    T visitOFF();

    T visitTEST();

    T visitUnknown(String unknownType);
  }
}
