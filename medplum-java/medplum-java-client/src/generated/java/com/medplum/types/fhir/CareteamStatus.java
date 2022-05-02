package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CareteamStatus {
  public static final CareteamStatus ACTIVE = new CareteamStatus(Value.ACTIVE, "ACTIVE");

  public static final CareteamStatus SUSPENDED = new CareteamStatus(Value.SUSPENDED, "SUSPENDED");

  public static final CareteamStatus INACTIVE = new CareteamStatus(Value.INACTIVE, "INACTIVE");

  public static final CareteamStatus PROPOSED = new CareteamStatus(Value.PROPOSED, "PROPOSED");

  private final Value value;

  private final String string;

  CareteamStatus(Value value, String string) {
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
      || (other instanceof CareteamStatus && this.string.equals(((CareteamStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case SUSPENDED:
        return visitor.visitSUSPENDED();
      case INACTIVE:
        return visitor.visitINACTIVE();
      case PROPOSED:
        return visitor.visitPROPOSED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CareteamStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "SUSPENDED":
        return SUSPENDED;
      case "INACTIVE":
        return INACTIVE;
      case "PROPOSED":
        return PROPOSED;
      default:
        return new CareteamStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PROPOSED,

    ACTIVE,

    SUSPENDED,

    INACTIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPROPOSED();

    T visitACTIVE();

    T visitSUSPENDED();

    T visitINACTIVE();

    T visitUnknown(String unknownType);
  }
}
