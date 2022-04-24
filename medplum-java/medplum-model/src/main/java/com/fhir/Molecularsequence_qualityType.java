package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Molecularsequence_qualityType {
  public static final Molecularsequence_qualityType SNP = new Molecularsequence_qualityType(Value.SNP, "SNP");

  public static final Molecularsequence_qualityType INDEL = new Molecularsequence_qualityType(Value.INDEL, "INDEL");

  private final Value value;

  private final String string;

  Molecularsequence_qualityType(Value value, String string) {
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
      || (other instanceof Molecularsequence_qualityType && this.string.equals(((Molecularsequence_qualityType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SNP:
        return visitor.visitSNP();
      case INDEL:
        return visitor.visitINDEL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Molecularsequence_qualityType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SNP":
        return SNP;
      case "INDEL":
        return INDEL;
      default:
        return new Molecularsequence_qualityType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INDEL,

    SNP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitINDEL();

    T visitSNP();

    T visitUnknown(String unknownType);
  }
}
