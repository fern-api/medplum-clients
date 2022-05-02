package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuredefinition_contextType {
  public static final Structuredefinition_contextType FHIRPATH = new Structuredefinition_contextType(Value.FHIRPATH, "FHIRPATH");

  public static final Structuredefinition_contextType ELEMENT = new Structuredefinition_contextType(Value.ELEMENT, "ELEMENT");

  public static final Structuredefinition_contextType EXTENSION = new Structuredefinition_contextType(Value.EXTENSION, "EXTENSION");

  private final Value value;

  private final String string;

  Structuredefinition_contextType(Value value, String string) {
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
      || (other instanceof Structuredefinition_contextType && this.string.equals(((Structuredefinition_contextType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case FHIRPATH:
        return visitor.visitFHIRPATH();
      case ELEMENT:
        return visitor.visitELEMENT();
      case EXTENSION:
        return visitor.visitEXTENSION();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Structuredefinition_contextType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FHIRPATH":
        return FHIRPATH;
      case "ELEMENT":
        return ELEMENT;
      case "EXTENSION":
        return EXTENSION;
      default:
        return new Structuredefinition_contextType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FHIRPATH,

    ELEMENT,

    EXTENSION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFHIRPATH();

    T visitELEMENT();

    T visitEXTENSION();

    T visitUnknown(String unknownType);
  }
}
