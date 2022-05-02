package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Conceptmap_targetEquivalence {
  public static final Conceptmap_targetEquivalence EQUIVALENT = new Conceptmap_targetEquivalence(Value.EQUIVALENT, "EQUIVALENT");

  public static final Conceptmap_targetEquivalence INEXACT = new Conceptmap_targetEquivalence(Value.INEXACT, "INEXACT");

  public static final Conceptmap_targetEquivalence RELATEDTO = new Conceptmap_targetEquivalence(Value.RELATEDTO, "RELATEDTO");

  public static final Conceptmap_targetEquivalence WIDER = new Conceptmap_targetEquivalence(Value.WIDER, "WIDER");

  public static final Conceptmap_targetEquivalence EQUAL = new Conceptmap_targetEquivalence(Value.EQUAL, "EQUAL");

  public static final Conceptmap_targetEquivalence UNMATCHED = new Conceptmap_targetEquivalence(Value.UNMATCHED, "UNMATCHED");

  public static final Conceptmap_targetEquivalence SUBSUMES = new Conceptmap_targetEquivalence(Value.SUBSUMES, "SUBSUMES");

  public static final Conceptmap_targetEquivalence SPECIALIZES = new Conceptmap_targetEquivalence(Value.SPECIALIZES, "SPECIALIZES");

  public static final Conceptmap_targetEquivalence DISJOINT = new Conceptmap_targetEquivalence(Value.DISJOINT, "DISJOINT");

  public static final Conceptmap_targetEquivalence NARROWER = new Conceptmap_targetEquivalence(Value.NARROWER, "NARROWER");

  private final Value value;

  private final String string;

  Conceptmap_targetEquivalence(Value value, String string) {
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
      || (other instanceof Conceptmap_targetEquivalence && this.string.equals(((Conceptmap_targetEquivalence) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case EQUIVALENT:
        return visitor.visitEQUIVALENT();
      case INEXACT:
        return visitor.visitINEXACT();
      case RELATEDTO:
        return visitor.visitRELATEDTO();
      case WIDER:
        return visitor.visitWIDER();
      case EQUAL:
        return visitor.visitEQUAL();
      case UNMATCHED:
        return visitor.visitUNMATCHED();
      case SUBSUMES:
        return visitor.visitSUBSUMES();
      case SPECIALIZES:
        return visitor.visitSPECIALIZES();
      case DISJOINT:
        return visitor.visitDISJOINT();
      case NARROWER:
        return visitor.visitNARROWER();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Conceptmap_targetEquivalence valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EQUIVALENT":
        return EQUIVALENT;
      case "INEXACT":
        return INEXACT;
      case "RELATEDTO":
        return RELATEDTO;
      case "WIDER":
        return WIDER;
      case "EQUAL":
        return EQUAL;
      case "UNMATCHED":
        return UNMATCHED;
      case "SUBSUMES":
        return SUBSUMES;
      case "SPECIALIZES":
        return SPECIALIZES;
      case "DISJOINT":
        return DISJOINT;
      case "NARROWER":
        return NARROWER;
      default:
        return new Conceptmap_targetEquivalence(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    RELATEDTO,

    EQUIVALENT,

    EQUAL,

    WIDER,

    SUBSUMES,

    NARROWER,

    SPECIALIZES,

    INEXACT,

    UNMATCHED,

    DISJOINT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitRELATEDTO();

    T visitEQUIVALENT();

    T visitEQUAL();

    T visitWIDER();

    T visitSUBSUMES();

    T visitNARROWER();

    T visitSPECIALIZES();

    T visitINEXACT();

    T visitUNMATCHED();

    T visitDISJOINT();

    T visitUnknown(String unknownType);
  }
}
