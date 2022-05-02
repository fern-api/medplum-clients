package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Testscript_assertOperator {
  public static final Testscript_assertOperator EQUALS = new Testscript_assertOperator(Value.EQUALS, "EQUALS");

  public static final Testscript_assertOperator GREATERTHAN = new Testscript_assertOperator(Value.GREATERTHAN, "GREATERTHAN");

  public static final Testscript_assertOperator NOTEQUALS = new Testscript_assertOperator(Value.NOTEQUALS, "NOTEQUALS");

  public static final Testscript_assertOperator IN = new Testscript_assertOperator(Value.IN, "IN");

  public static final Testscript_assertOperator NOTIN = new Testscript_assertOperator(Value.NOTIN, "NOTIN");

  public static final Testscript_assertOperator LESSTHAN = new Testscript_assertOperator(Value.LESSTHAN, "LESSTHAN");

  public static final Testscript_assertOperator NOTEMPTY = new Testscript_assertOperator(Value.NOTEMPTY, "NOTEMPTY");

  public static final Testscript_assertOperator CONTAINS = new Testscript_assertOperator(Value.CONTAINS, "CONTAINS");

  public static final Testscript_assertOperator EMPTY = new Testscript_assertOperator(Value.EMPTY, "EMPTY");

  public static final Testscript_assertOperator EVAL = new Testscript_assertOperator(Value.EVAL, "EVAL");

  public static final Testscript_assertOperator NOTCONTAINS = new Testscript_assertOperator(Value.NOTCONTAINS, "NOTCONTAINS");

  private final Value value;

  private final String string;

  Testscript_assertOperator(Value value, String string) {
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
      || (other instanceof Testscript_assertOperator && this.string.equals(((Testscript_assertOperator) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case EQUALS:
        return visitor.visitEQUALS();
      case GREATERTHAN:
        return visitor.visitGREATERTHAN();
      case NOTEQUALS:
        return visitor.visitNOTEQUALS();
      case IN:
        return visitor.visitIN();
      case NOTIN:
        return visitor.visitNOTIN();
      case LESSTHAN:
        return visitor.visitLESSTHAN();
      case NOTEMPTY:
        return visitor.visitNOTEMPTY();
      case CONTAINS:
        return visitor.visitCONTAINS();
      case EMPTY:
        return visitor.visitEMPTY();
      case EVAL:
        return visitor.visitEVAL();
      case NOTCONTAINS:
        return visitor.visitNOTCONTAINS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Testscript_assertOperator valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EQUALS":
        return EQUALS;
      case "GREATERTHAN":
        return GREATERTHAN;
      case "NOTEQUALS":
        return NOTEQUALS;
      case "IN":
        return IN;
      case "NOTIN":
        return NOTIN;
      case "LESSTHAN":
        return LESSTHAN;
      case "NOTEMPTY":
        return NOTEMPTY;
      case "CONTAINS":
        return CONTAINS;
      case "EMPTY":
        return EMPTY;
      case "EVAL":
        return EVAL;
      case "NOTCONTAINS":
        return NOTCONTAINS;
      default:
        return new Testscript_assertOperator(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    EQUALS,

    NOTEQUALS,

    IN,

    NOTIN,

    GREATERTHAN,

    LESSTHAN,

    EMPTY,

    NOTEMPTY,

    CONTAINS,

    NOTCONTAINS,

    EVAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEQUALS();

    T visitNOTEQUALS();

    T visitIN();

    T visitNOTIN();

    T visitGREATERTHAN();

    T visitLESSTHAN();

    T visitEMPTY();

    T visitNOTEMPTY();

    T visitCONTAINS();

    T visitNOTCONTAINS();

    T visitEVAL();

    T visitUnknown(String unknownType);
  }
}
