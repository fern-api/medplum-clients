package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class TerminologycapabilitiesCodesearch {
  public static final TerminologycapabilitiesCodesearch EXPLICIT = new TerminologycapabilitiesCodesearch(Value.EXPLICIT, "EXPLICIT");

  public static final TerminologycapabilitiesCodesearch ALL = new TerminologycapabilitiesCodesearch(Value.ALL, "ALL");

  private final Value value;

  private final String string;

  TerminologycapabilitiesCodesearch(Value value, String string) {
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
      || (other instanceof TerminologycapabilitiesCodesearch && this.string.equals(((TerminologycapabilitiesCodesearch) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case EXPLICIT:
        return visitor.visitEXPLICIT();
      case ALL:
        return visitor.visitALL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TerminologycapabilitiesCodesearch valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EXPLICIT":
        return EXPLICIT;
      case "ALL":
        return ALL;
      default:
        return new TerminologycapabilitiesCodesearch(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    EXPLICIT,

    ALL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEXPLICIT();

    T visitALL();

    T visitUnknown(String unknownType);
  }
}
