package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Specimendefinition_typetestedPreference {
  public static final Specimendefinition_typetestedPreference PREFERRED = new Specimendefinition_typetestedPreference(Value.PREFERRED, "PREFERRED");

  public static final Specimendefinition_typetestedPreference ALTERNATE = new Specimendefinition_typetestedPreference(Value.ALTERNATE, "ALTERNATE");

  private final Value value;

  private final String string;

  Specimendefinition_typetestedPreference(Value value, String string) {
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
      || (other instanceof Specimendefinition_typetestedPreference && this.string.equals(((Specimendefinition_typetestedPreference) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PREFERRED:
        return visitor.visitPREFERRED();
      case ALTERNATE:
        return visitor.visitALTERNATE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Specimendefinition_typetestedPreference valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PREFERRED":
        return PREFERRED;
      case "ALTERNATE":
        return ALTERNATE;
      default:
        return new Specimendefinition_typetestedPreference(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PREFERRED,

    ALTERNATE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPREFERRED();

    T visitALTERNATE();

    T visitUnknown(String unknownType);
  }
}
