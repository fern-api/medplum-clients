package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Consent_provisionType {
  public static final Consent_provisionType DENY = new Consent_provisionType(Value.DENY, "DENY");

  public static final Consent_provisionType PERMIT = new Consent_provisionType(Value.PERMIT, "PERMIT");

  private final Value value;

  private final String string;

  Consent_provisionType(Value value, String string) {
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
      || (other instanceof Consent_provisionType && this.string.equals(((Consent_provisionType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DENY:
        return visitor.visitDENY();
      case PERMIT:
        return visitor.visitPERMIT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Consent_provisionType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DENY":
        return DENY;
      case "PERMIT":
        return PERMIT;
      default:
        return new Consent_provisionType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DENY,

    PERMIT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDENY();

    T visitPERMIT();

    T visitUnknown(String unknownType);
  }
}
