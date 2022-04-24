package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Elementdefinition_discriminatorType {
  public static final Elementdefinition_discriminatorType VALUE = new Elementdefinition_discriminatorType(Value.VALUE, "VALUE");

  public static final Elementdefinition_discriminatorType EXISTS = new Elementdefinition_discriminatorType(Value.EXISTS, "EXISTS");

  public static final Elementdefinition_discriminatorType PATTERN = new Elementdefinition_discriminatorType(Value.PATTERN, "PATTERN");

  public static final Elementdefinition_discriminatorType PROFILE = new Elementdefinition_discriminatorType(Value.PROFILE, "PROFILE");

  public static final Elementdefinition_discriminatorType TYPE = new Elementdefinition_discriminatorType(Value.TYPE, "TYPE");

  private final Value value;

  private final String string;

  Elementdefinition_discriminatorType(Value value, String string) {
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
      || (other instanceof Elementdefinition_discriminatorType && this.string.equals(((Elementdefinition_discriminatorType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case VALUE:
        return visitor.visitVALUE();
      case EXISTS:
        return visitor.visitEXISTS();
      case PATTERN:
        return visitor.visitPATTERN();
      case PROFILE:
        return visitor.visitPROFILE();
      case TYPE:
        return visitor.visitTYPE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Elementdefinition_discriminatorType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "VALUE":
        return VALUE;
      case "EXISTS":
        return EXISTS;
      case "PATTERN":
        return PATTERN;
      case "PROFILE":
        return PROFILE;
      case "TYPE":
        return TYPE;
      default:
        return new Elementdefinition_discriminatorType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    VALUE,

    EXISTS,

    PATTERN,

    TYPE,

    PROFILE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitVALUE();

    T visitEXISTS();

    T visitPATTERN();

    T visitTYPE();

    T visitPROFILE();

    T visitUnknown(String unknownType);
  }
}
