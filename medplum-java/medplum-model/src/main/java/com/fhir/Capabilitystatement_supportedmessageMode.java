package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_supportedmessageMode {
  public static final Capabilitystatement_supportedmessageMode SENDER = new Capabilitystatement_supportedmessageMode(Value.SENDER, "SENDER");

  public static final Capabilitystatement_supportedmessageMode RECEIVER = new Capabilitystatement_supportedmessageMode(Value.RECEIVER, "RECEIVER");

  private final Value value;

  private final String string;

  Capabilitystatement_supportedmessageMode(Value value, String string) {
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
      || (other instanceof Capabilitystatement_supportedmessageMode && this.string.equals(((Capabilitystatement_supportedmessageMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SENDER:
        return visitor.visitSENDER();
      case RECEIVER:
        return visitor.visitRECEIVER();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Capabilitystatement_supportedmessageMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SENDER":
        return SENDER;
      case "RECEIVER":
        return RECEIVER;
      default:
        return new Capabilitystatement_supportedmessageMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SENDER,

    RECEIVER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSENDER();

    T visitRECEIVER();

    T visitUnknown(String unknownType);
  }
}
