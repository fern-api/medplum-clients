package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SearchparameterModifierItem {
  public static final SearchparameterModifierItem NOT = new SearchparameterModifierItem(Value.NOT, "NOT");

  public static final SearchparameterModifierItem TEXT = new SearchparameterModifierItem(Value.TEXT, "TEXT");

  public static final SearchparameterModifierItem IDENTIFIER = new SearchparameterModifierItem(Value.IDENTIFIER, "IDENTIFIER");

  public static final SearchparameterModifierItem IN = new SearchparameterModifierItem(Value.IN, "IN");

  public static final SearchparameterModifierItem MISSING = new SearchparameterModifierItem(Value.MISSING, "MISSING");

  public static final SearchparameterModifierItem CONTAINS = new SearchparameterModifierItem(Value.CONTAINS, "CONTAINS");

  public static final SearchparameterModifierItem EXACT = new SearchparameterModifierItem(Value.EXACT, "EXACT");

  public static final SearchparameterModifierItem OFTYPE = new SearchparameterModifierItem(Value.OFTYPE, "OFTYPE");

  public static final SearchparameterModifierItem BELOW = new SearchparameterModifierItem(Value.BELOW, "BELOW");

  public static final SearchparameterModifierItem ABOVE = new SearchparameterModifierItem(Value.ABOVE, "ABOVE");

  public static final SearchparameterModifierItem TYPE = new SearchparameterModifierItem(Value.TYPE, "TYPE");

  private final Value value;

  private final String string;

  SearchparameterModifierItem(Value value, String string) {
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
      || (other instanceof SearchparameterModifierItem && this.string.equals(((SearchparameterModifierItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case NOT:
        return visitor.visitNOT();
      case TEXT:
        return visitor.visitTEXT();
      case IDENTIFIER:
        return visitor.visitIDENTIFIER();
      case IN:
        return visitor.visitIN();
      case MISSING:
        return visitor.visitMISSING();
      case CONTAINS:
        return visitor.visitCONTAINS();
      case EXACT:
        return visitor.visitEXACT();
      case OFTYPE:
        return visitor.visitOFTYPE();
      case BELOW:
        return visitor.visitBELOW();
      case ABOVE:
        return visitor.visitABOVE();
      case TYPE:
        return visitor.visitTYPE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SearchparameterModifierItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "NOT":
        return NOT;
      case "TEXT":
        return TEXT;
      case "IDENTIFIER":
        return IDENTIFIER;
      case "IN":
        return IN;
      case "MISSING":
        return MISSING;
      case "CONTAINS":
        return CONTAINS;
      case "EXACT":
        return EXACT;
      case "OFTYPE":
        return OFTYPE;
      case "BELOW":
        return BELOW;
      case "ABOVE":
        return ABOVE;
      case "TYPE":
        return TYPE;
      default:
        return new SearchparameterModifierItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MISSING,

    EXACT,

    CONTAINS,

    NOT,

    TEXT,

    IN,

    BELOW,

    ABOVE,

    TYPE,

    IDENTIFIER,

    OFTYPE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMISSING();

    T visitEXACT();

    T visitCONTAINS();

    T visitNOT();

    T visitTEXT();

    T visitIN();

    T visitBELOW();

    T visitABOVE();

    T visitTYPE();

    T visitIDENTIFIER();

    T visitOFTYPE();

    T visitUnknown(String unknownType);
  }
}
