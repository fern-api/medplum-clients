package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ContactpointSystem {
  public static final ContactpointSystem PHONE = new ContactpointSystem(Value.PHONE, "PHONE");

  public static final ContactpointSystem SMS = new ContactpointSystem(Value.SMS, "SMS");

  public static final ContactpointSystem PAGER = new ContactpointSystem(Value.PAGER, "PAGER");

  public static final ContactpointSystem FAX = new ContactpointSystem(Value.FAX, "FAX");

  public static final ContactpointSystem EMAIL = new ContactpointSystem(Value.EMAIL, "EMAIL");

  public static final ContactpointSystem OTHER = new ContactpointSystem(Value.OTHER, "OTHER");

  public static final ContactpointSystem URL = new ContactpointSystem(Value.URL, "URL");

  private final Value value;

  private final String string;

  ContactpointSystem(Value value, String string) {
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
      || (other instanceof ContactpointSystem && this.string.equals(((ContactpointSystem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PHONE:
        return visitor.visitPHONE();
      case SMS:
        return visitor.visitSMS();
      case PAGER:
        return visitor.visitPAGER();
      case FAX:
        return visitor.visitFAX();
      case EMAIL:
        return visitor.visitEMAIL();
      case OTHER:
        return visitor.visitOTHER();
      case URL:
        return visitor.visitURL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ContactpointSystem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PHONE":
        return PHONE;
      case "SMS":
        return SMS;
      case "PAGER":
        return PAGER;
      case "FAX":
        return FAX;
      case "EMAIL":
        return EMAIL;
      case "OTHER":
        return OTHER;
      case "URL":
        return URL;
      default:
        return new ContactpointSystem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PHONE,

    FAX,

    EMAIL,

    PAGER,

    URL,

    SMS,

    OTHER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPHONE();

    T visitFAX();

    T visitEMAIL();

    T visitPAGER();

    T visitURL();

    T visitSMS();

    T visitOTHER();

    T visitUnknown(String unknownType);
  }
}
