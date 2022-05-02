package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class MolecularsequenceType {
  public static final MolecularsequenceType RNA = new MolecularsequenceType(Value.RNA, "RNA");

  public static final MolecularsequenceType DNA = new MolecularsequenceType(Value.DNA, "DNA");

  public static final MolecularsequenceType AA = new MolecularsequenceType(Value.AA, "AA");

  private final Value value;

  private final String string;

  MolecularsequenceType(Value value, String string) {
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
      || (other instanceof MolecularsequenceType && this.string.equals(((MolecularsequenceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case RNA:
        return visitor.visitRNA();
      case DNA:
        return visitor.visitDNA();
      case AA:
        return visitor.visitAA();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static MolecularsequenceType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "RNA":
        return RNA;
      case "DNA":
        return DNA;
      case "AA":
        return AA;
      default:
        return new MolecularsequenceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AA,

    DNA,

    RNA,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAA();

    T visitDNA();

    T visitRNA();

    T visitUnknown(String unknownType);
  }
}
