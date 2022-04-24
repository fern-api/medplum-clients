package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class MessagedefinitionCategory {
  public static final MessagedefinitionCategory NOTIFICATION = new MessagedefinitionCategory(Value.NOTIFICATION, "NOTIFICATION");

  public static final MessagedefinitionCategory CONSEQUENCE = new MessagedefinitionCategory(Value.CONSEQUENCE, "CONSEQUENCE");

  public static final MessagedefinitionCategory CURRENCY = new MessagedefinitionCategory(Value.CURRENCY, "CURRENCY");

  private final Value value;

  private final String string;

  MessagedefinitionCategory(Value value, String string) {
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
      || (other instanceof MessagedefinitionCategory && this.string.equals(((MessagedefinitionCategory) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case NOTIFICATION:
        return visitor.visitNOTIFICATION();
      case CONSEQUENCE:
        return visitor.visitCONSEQUENCE();
      case CURRENCY:
        return visitor.visitCURRENCY();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static MessagedefinitionCategory valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "NOTIFICATION":
        return NOTIFICATION;
      case "CONSEQUENCE":
        return CONSEQUENCE;
      case "CURRENCY":
        return CURRENCY;
      default:
        return new MessagedefinitionCategory(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CONSEQUENCE,

    CURRENCY,

    NOTIFICATION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCONSEQUENCE();

    T visitCURRENCY();

    T visitNOTIFICATION();

    T visitUnknown(String unknownType);
  }
}
