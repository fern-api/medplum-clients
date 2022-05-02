package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AccountStatus {
  public static final AccountStatus ACTIVE = new AccountStatus(Value.ACTIVE, "ACTIVE");

  public static final AccountStatus INACTIVE = new AccountStatus(Value.INACTIVE, "INACTIVE");

  private final Value value;

  private final String string;

  AccountStatus(Value value, String string) {
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
      || (other instanceof AccountStatus && this.string.equals(((AccountStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case INACTIVE:
        return visitor.visitINACTIVE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AccountStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "INACTIVE":
        return INACTIVE;
      default:
        return new AccountStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    INACTIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACTIVE();

    T visitINACTIVE();

    T visitUnknown(String unknownType);
  }
}
