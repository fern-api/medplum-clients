package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Molecularsequence_referenceseqOrientation {
  public static final Molecularsequence_referenceseqOrientation ANTISENSE = new Molecularsequence_referenceseqOrientation(Value.ANTISENSE, "ANTISENSE");

  public static final Molecularsequence_referenceseqOrientation SENSE = new Molecularsequence_referenceseqOrientation(Value.SENSE, "SENSE");

  private final Value value;

  private final String string;

  Molecularsequence_referenceseqOrientation(Value value, String string) {
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
      || (other instanceof Molecularsequence_referenceseqOrientation && this.string.equals(((Molecularsequence_referenceseqOrientation) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ANTISENSE:
        return visitor.visitANTISENSE();
      case SENSE:
        return visitor.visitSENSE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Molecularsequence_referenceseqOrientation valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ANTISENSE":
        return ANTISENSE;
      case "SENSE":
        return SENSE;
      default:
        return new Molecularsequence_referenceseqOrientation(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SENSE,

    ANTISENSE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSENSE();

    T visitANTISENSE();

    T visitUnknown(String unknownType);
  }
}
