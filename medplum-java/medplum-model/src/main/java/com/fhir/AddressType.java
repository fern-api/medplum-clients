package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AddressType {
  public static final AddressType PHYSICAL = new AddressType(Value.PHYSICAL, "PHYSICAL");

  public static final AddressType POSTAL = new AddressType(Value.POSTAL, "POSTAL");

  public static final AddressType BOTH = new AddressType(Value.BOTH, "BOTH");

  private final Value value;

  private final String string;

  AddressType(Value value, String string) {
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
      || (other instanceof AddressType && this.string.equals(((AddressType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PHYSICAL:
        return visitor.visitPHYSICAL();
      case POSTAL:
        return visitor.visitPOSTAL();
      case BOTH:
        return visitor.visitBOTH();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AddressType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PHYSICAL":
        return PHYSICAL;
      case "POSTAL":
        return POSTAL;
      case "BOTH":
        return BOTH;
      default:
        return new AddressType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    POSTAL,

    PHYSICAL,

    BOTH,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPOSTAL();

    T visitPHYSICAL();

    T visitBOTH();

    T visitUnknown(String unknownType);
  }
}
