package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Subscription_channelType {
  public static final Subscription_channelType MESSAGE = new Subscription_channelType(Value.MESSAGE, "MESSAGE");

  public static final Subscription_channelType SMS = new Subscription_channelType(Value.SMS, "SMS");

  public static final Subscription_channelType EMAIL = new Subscription_channelType(Value.EMAIL, "EMAIL");

  public static final Subscription_channelType WEBSOCKET = new Subscription_channelType(Value.WEBSOCKET, "WEBSOCKET");

  private final Value value;

  private final String string;

  Subscription_channelType(Value value, String string) {
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
      || (other instanceof Subscription_channelType && this.string.equals(((Subscription_channelType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case MESSAGE:
        return visitor.visitMESSAGE();
      case SMS:
        return visitor.visitSMS();
      case EMAIL:
        return visitor.visitEMAIL();
      case WEBSOCKET:
        return visitor.visitWEBSOCKET();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Subscription_channelType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MESSAGE":
        return MESSAGE;
      case "SMS":
        return SMS;
      case "EMAIL":
        return EMAIL;
      case "WEBSOCKET":
        return WEBSOCKET;
      default:
        return new Subscription_channelType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    WEBSOCKET,

    EMAIL,

    SMS,

    MESSAGE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitWEBSOCKET();

    T visitEMAIL();

    T visitSMS();

    T visitMESSAGE();

    T visitUnknown(String unknownType);
  }
}
