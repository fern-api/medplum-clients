package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Elementdefinition_bindingStrength {
  public static final Elementdefinition_bindingStrength REQUIRED = new Elementdefinition_bindingStrength(Value.REQUIRED, "REQUIRED");

  public static final Elementdefinition_bindingStrength EXAMPLE = new Elementdefinition_bindingStrength(Value.EXAMPLE, "EXAMPLE");

  public static final Elementdefinition_bindingStrength PREFERRED = new Elementdefinition_bindingStrength(Value.PREFERRED, "PREFERRED");

  public static final Elementdefinition_bindingStrength EXTENSIBLE = new Elementdefinition_bindingStrength(Value.EXTENSIBLE, "EXTENSIBLE");

  private final Value value;

  private final String string;

  Elementdefinition_bindingStrength(Value value, String string) {
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
      || (other instanceof Elementdefinition_bindingStrength && this.string.equals(((Elementdefinition_bindingStrength) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case REQUIRED:
        return visitor.visitREQUIRED();
      case EXAMPLE:
        return visitor.visitEXAMPLE();
      case PREFERRED:
        return visitor.visitPREFERRED();
      case EXTENSIBLE:
        return visitor.visitEXTENSIBLE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Elementdefinition_bindingStrength valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "REQUIRED":
        return REQUIRED;
      case "EXAMPLE":
        return EXAMPLE;
      case "PREFERRED":
        return PREFERRED;
      case "EXTENSIBLE":
        return EXTENSIBLE;
      default:
        return new Elementdefinition_bindingStrength(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REQUIRED,

    EXTENSIBLE,

    PREFERRED,

    EXAMPLE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREQUIRED();

    T visitEXTENSIBLE();

    T visitPREFERRED();

    T visitEXAMPLE();

    T visitUnknown(String unknownType);
  }
}
