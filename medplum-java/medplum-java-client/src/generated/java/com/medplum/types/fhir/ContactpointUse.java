package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ContactpointUse {
  public static final ContactpointUse MOBILE = new ContactpointUse(Value.MOBILE, "MOBILE");

  public static final ContactpointUse WORK = new ContactpointUse(Value.WORK, "WORK");

  public static final ContactpointUse OLD = new ContactpointUse(Value.OLD, "OLD");

  public static final ContactpointUse TEMP = new ContactpointUse(Value.TEMP, "TEMP");

  public static final ContactpointUse HOME = new ContactpointUse(Value.HOME, "HOME");

  private final Value value;

  private final String string;

  ContactpointUse(Value value, String string) {
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
      || (other instanceof ContactpointUse && this.string.equals(((ContactpointUse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case MOBILE:
        return visitor.visitMOBILE();
      case WORK:
        return visitor.visitWORK();
      case OLD:
        return visitor.visitOLD();
      case TEMP:
        return visitor.visitTEMP();
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
  public static ContactpointUse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MOBILE":
        return MOBILE;
      case "WORK":
        return WORK;
      case "OLD":
        return OLD;
      case "TEMP":
        return TEMP;
      case "HOME":
        return HOME;
      default:
        return new ContactpointUse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    HOME,

    WORK,

    TEMP,

    OLD,

    MOBILE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitHOME();

    T visitWORK();

    T visitTEMP();

    T visitOLD();

    T visitMOBILE();

    T visitUnknown(String unknownType);
  }
}
