package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Molecularsequence_referenceseqStrand {
  public static final Molecularsequence_referenceseqStrand WATSON = new Molecularsequence_referenceseqStrand(Value.WATSON, "WATSON");

  public static final Molecularsequence_referenceseqStrand CRICK = new Molecularsequence_referenceseqStrand(Value.CRICK, "CRICK");

  private final Value value;

  private final String string;

  Molecularsequence_referenceseqStrand(Value value, String string) {
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
      || (other instanceof Molecularsequence_referenceseqStrand && this.string.equals(((Molecularsequence_referenceseqStrand) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case WATSON:
        return visitor.visitWATSON();
      case CRICK:
        return visitor.visitCRICK();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Molecularsequence_referenceseqStrand valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "WATSON":
        return WATSON;
      case "CRICK":
        return CRICK;
      default:
        return new Molecularsequence_referenceseqStrand(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    WATSON,

    CRICK,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitWATSON();

    T visitCRICK();

    T visitUnknown(String unknownType);
  }
}
