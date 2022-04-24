package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DeviceusestatementStatus {
  public static final DeviceusestatementStatus ACTIVE = new DeviceusestatementStatus(Value.ACTIVE, "ACTIVE");

  public static final DeviceusestatementStatus COMPLETED = new DeviceusestatementStatus(Value.COMPLETED, "COMPLETED");

  public static final DeviceusestatementStatus STOPPED = new DeviceusestatementStatus(Value.STOPPED, "STOPPED");

  public static final DeviceusestatementStatus INTENDED = new DeviceusestatementStatus(Value.INTENDED, "INTENDED");

  private final Value value;

  private final String string;

  DeviceusestatementStatus(Value value, String string) {
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
      || (other instanceof DeviceusestatementStatus && this.string.equals(((DeviceusestatementStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case STOPPED:
        return visitor.visitSTOPPED();
      case INTENDED:
        return visitor.visitINTENDED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DeviceusestatementStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "COMPLETED":
        return COMPLETED;
      case "STOPPED":
        return STOPPED;
      case "INTENDED":
        return INTENDED;
      default:
        return new DeviceusestatementStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    COMPLETED,

    INTENDED,

    STOPPED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACTIVE();

    T visitCOMPLETED();

    T visitINTENDED();

    T visitSTOPPED();

    T visitUnknown(String unknownType);
  }
}
