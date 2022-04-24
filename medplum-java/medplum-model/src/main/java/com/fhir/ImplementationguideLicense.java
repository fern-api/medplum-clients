package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ImplementationguideLicense {
  public static final ImplementationguideLicense ALADDIN = new ImplementationguideLicense(Value.ALADDIN, "ALADDIN");

  public static final ImplementationguideLicense ABSTYLES = new ImplementationguideLicense(Value.ABSTYLES, "ABSTYLES");

  public static final ImplementationguideLicense AMPAS = new ImplementationguideLicense(Value.AMPAS, "AMPAS");

  public static final ImplementationguideLicense AAL = new ImplementationguideLicense(Value.AAL, "AAL");

  public static final ImplementationguideLicense AMDPLPA = new ImplementationguideLicense(Value.AMDPLPA, "AMDPLPA");

  public static final ImplementationguideLicense AML = new ImplementationguideLicense(Value.AML, "AML");

  private final Value value;

  private final String string;

  ImplementationguideLicense(Value value, String string) {
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
      || (other instanceof ImplementationguideLicense && this.string.equals(((ImplementationguideLicense) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ALADDIN:
        return visitor.visitALADDIN();
      case ABSTYLES:
        return visitor.visitABSTYLES();
      case AMPAS:
        return visitor.visitAMPAS();
      case AAL:
        return visitor.visitAAL();
      case AMDPLPA:
        return visitor.visitAMDPLPA();
      case AML:
        return visitor.visitAML();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ImplementationguideLicense valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ALADDIN":
        return ALADDIN;
      case "ABSTYLES":
        return ABSTYLES;
      case "AMPAS":
        return AMPAS;
      case "AAL":
        return AAL;
      case "AMDPLPA":
        return AMDPLPA;
      case "AML":
        return AML;
      default:
        return new ImplementationguideLicense(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AAL,

    ABSTYLES,

    ALADDIN,

    AMDPLPA,

    AML,

    AMPAS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAAL();

    T visitABSTYLES();

    T visitALADDIN();

    T visitAMDPLPA();

    T visitAML();

    T visitAMPAS();

    T visitUnknown(String unknownType);
  }
}
