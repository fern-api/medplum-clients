package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Biologicallyderivedproduct_storageScale {
  public static final Biologicallyderivedproduct_storageScale FARENHEIT = new Biologicallyderivedproduct_storageScale(Value.FARENHEIT, "FARENHEIT");

  public static final Biologicallyderivedproduct_storageScale KELVIN = new Biologicallyderivedproduct_storageScale(Value.KELVIN, "KELVIN");

  public static final Biologicallyderivedproduct_storageScale CELSIUS = new Biologicallyderivedproduct_storageScale(Value.CELSIUS, "CELSIUS");

  private final Value value;

  private final String string;

  Biologicallyderivedproduct_storageScale(Value value, String string) {
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
      || (other instanceof Biologicallyderivedproduct_storageScale && this.string.equals(((Biologicallyderivedproduct_storageScale) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case FARENHEIT:
        return visitor.visitFARENHEIT();
      case KELVIN:
        return visitor.visitKELVIN();
      case CELSIUS:
        return visitor.visitCELSIUS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Biologicallyderivedproduct_storageScale valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FARENHEIT":
        return FARENHEIT;
      case "KELVIN":
        return KELVIN;
      case "CELSIUS":
        return CELSIUS;
      default:
        return new Biologicallyderivedproduct_storageScale(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FARENHEIT,

    CELSIUS,

    KELVIN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFARENHEIT();

    T visitCELSIUS();

    T visitKELVIN();

    T visitUnknown(String unknownType);
  }
}
