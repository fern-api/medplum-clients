package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AddressUse {
  public static final AddressUse WORK = new AddressUse(Value.WORK, "WORK");

  public static final AddressUse OLD = new AddressUse(Value.OLD, "OLD");

  public static final AddressUse TEMP = new AddressUse(Value.TEMP, "TEMP");

  public static final AddressUse BILLING = new AddressUse(Value.BILLING, "BILLING");

  public static final AddressUse HOME = new AddressUse(Value.HOME, "HOME");

  private final Value value;

  private final String string;

  AddressUse(Value value, String string) {
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
      || (other instanceof AddressUse && this.string.equals(((AddressUse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case WORK:
        return visitor.visitWORK();
      case OLD:
        return visitor.visitOLD();
      case TEMP:
        return visitor.visitTEMP();
      case BILLING:
        return visitor.visitBILLING();
      case HOME:
        return visitor.visitHOME();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AddressUse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "WORK":
        return WORK;
      case "OLD":
        return OLD;
      case "TEMP":
        return TEMP;
      case "BILLING":
        return BILLING;
      case "HOME":
        return HOME;
      default:
        return new AddressUse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    HOME,

    WORK,

    TEMP,

    OLD,

    BILLING,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitHOME();

    T visitWORK();

    T visitTEMP();

    T visitOLD();

    T visitBILLING();

    T visitUnknown(String unknownType);
  }
}
