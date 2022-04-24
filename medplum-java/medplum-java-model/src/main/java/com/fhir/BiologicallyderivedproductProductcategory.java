package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class BiologicallyderivedproductProductcategory {
  public static final BiologicallyderivedproductProductcategory TISSUE = new BiologicallyderivedproductProductcategory(Value.TISSUE, "TISSUE");

  public static final BiologicallyderivedproductProductcategory FLUID = new BiologicallyderivedproductProductcategory(Value.FLUID, "FLUID");

  public static final BiologicallyderivedproductProductcategory BIOLOGICALAGENT = new BiologicallyderivedproductProductcategory(Value.BIOLOGICALAGENT, "BIOLOGICALAGENT");

  public static final BiologicallyderivedproductProductcategory CELLS = new BiologicallyderivedproductProductcategory(Value.CELLS, "CELLS");

  public static final BiologicallyderivedproductProductcategory ORGAN = new BiologicallyderivedproductProductcategory(Value.ORGAN, "ORGAN");

  private final Value value;

  private final String string;

  BiologicallyderivedproductProductcategory(Value value, String string) {
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
      || (other instanceof BiologicallyderivedproductProductcategory && this.string.equals(((BiologicallyderivedproductProductcategory) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case TISSUE:
        return visitor.visitTISSUE();
      case FLUID:
        return visitor.visitFLUID();
      case BIOLOGICALAGENT:
        return visitor.visitBIOLOGICALAGENT();
      case CELLS:
        return visitor.visitCELLS();
      case ORGAN:
        return visitor.visitORGAN();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static BiologicallyderivedproductProductcategory valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "TISSUE":
        return TISSUE;
      case "FLUID":
        return FLUID;
      case "BIOLOGICALAGENT":
        return BIOLOGICALAGENT;
      case "CELLS":
        return CELLS;
      case "ORGAN":
        return ORGAN;
      default:
        return new BiologicallyderivedproductProductcategory(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ORGAN,

    TISSUE,

    FLUID,

    CELLS,

    BIOLOGICALAGENT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitORGAN();

    T visitTISSUE();

    T visitFLUID();

    T visitCELLS();

    T visitBIOLOGICALAGENT();

    T visitUnknown(String unknownType);
  }
}
