package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Observationdefinition_qualifiedintervalCategory {
  public static final Observationdefinition_qualifiedintervalCategory REFERENCE = new Observationdefinition_qualifiedintervalCategory(Value.REFERENCE, "REFERENCE");

  public static final Observationdefinition_qualifiedintervalCategory ABSOLUTE = new Observationdefinition_qualifiedintervalCategory(Value.ABSOLUTE, "ABSOLUTE");

  public static final Observationdefinition_qualifiedintervalCategory CRITICAL = new Observationdefinition_qualifiedintervalCategory(Value.CRITICAL, "CRITICAL");

  private final Value value;

  private final String string;

  Observationdefinition_qualifiedintervalCategory(Value value, String string) {
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
      || (other instanceof Observationdefinition_qualifiedintervalCategory && this.string.equals(((Observationdefinition_qualifiedintervalCategory) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case REFERENCE:
        return visitor.visitREFERENCE();
      case ABSOLUTE:
        return visitor.visitABSOLUTE();
      case CRITICAL:
        return visitor.visitCRITICAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Observationdefinition_qualifiedintervalCategory valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "REFERENCE":
        return REFERENCE;
      case "ABSOLUTE":
        return ABSOLUTE;
      case "CRITICAL":
        return CRITICAL;
      default:
        return new Observationdefinition_qualifiedintervalCategory(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REFERENCE,

    CRITICAL,

    ABSOLUTE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREFERENCE();

    T visitCRITICAL();

    T visitABSOLUTE();

    T visitUnknown(String unknownType);
  }
}
