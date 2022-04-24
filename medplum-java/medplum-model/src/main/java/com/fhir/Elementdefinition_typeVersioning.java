package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Elementdefinition_typeVersioning {
  public static final Elementdefinition_typeVersioning INDEPENDENT = new Elementdefinition_typeVersioning(Value.INDEPENDENT, "INDEPENDENT");

  public static final Elementdefinition_typeVersioning EITHER = new Elementdefinition_typeVersioning(Value.EITHER, "EITHER");

  public static final Elementdefinition_typeVersioning SPECIFIC = new Elementdefinition_typeVersioning(Value.SPECIFIC, "SPECIFIC");

  private final Value value;

  private final String string;

  Elementdefinition_typeVersioning(Value value, String string) {
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
      || (other instanceof Elementdefinition_typeVersioning && this.string.equals(((Elementdefinition_typeVersioning) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case INDEPENDENT:
        return visitor.visitINDEPENDENT();
      case EITHER:
        return visitor.visitEITHER();
      case SPECIFIC:
        return visitor.visitSPECIFIC();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Elementdefinition_typeVersioning valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "INDEPENDENT":
        return INDEPENDENT;
      case "EITHER":
        return EITHER;
      case "SPECIFIC":
        return SPECIFIC;
      default:
        return new Elementdefinition_typeVersioning(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    EITHER,

    INDEPENDENT,

    SPECIFIC,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEITHER();

    T visitINDEPENDENT();

    T visitSPECIFIC();

    T visitUnknown(String unknownType);
  }
}
