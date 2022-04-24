package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Operationdefinition_parameterUse {
  public static final Operationdefinition_parameterUse IN = new Operationdefinition_parameterUse(Value.IN, "IN");

  public static final Operationdefinition_parameterUse OUT = new Operationdefinition_parameterUse(Value.OUT, "OUT");

  private final Value value;

  private final String string;

  Operationdefinition_parameterUse(Value value, String string) {
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
      || (other instanceof Operationdefinition_parameterUse && this.string.equals(((Operationdefinition_parameterUse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case IN:
        return visitor.visitIN();
      case OUT:
        return visitor.visitOUT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Operationdefinition_parameterUse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "IN":
        return IN;
      case "OUT":
        return OUT;
      default:
        return new Operationdefinition_parameterUse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    IN,

    OUT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitIN();

    T visitOUT();

    T visitUnknown(String unknownType);
  }
}
