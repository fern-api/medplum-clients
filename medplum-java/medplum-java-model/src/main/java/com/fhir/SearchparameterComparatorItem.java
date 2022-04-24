package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SearchparameterComparatorItem {
  public static final SearchparameterComparatorItem LT = new SearchparameterComparatorItem(Value.LT, "LT");

  public static final SearchparameterComparatorItem NE = new SearchparameterComparatorItem(Value.NE, "NE");

  public static final SearchparameterComparatorItem LE = new SearchparameterComparatorItem(Value.LE, "LE");

  public static final SearchparameterComparatorItem EQ = new SearchparameterComparatorItem(Value.EQ, "EQ");

  public static final SearchparameterComparatorItem GE = new SearchparameterComparatorItem(Value.GE, "GE");

  public static final SearchparameterComparatorItem SA = new SearchparameterComparatorItem(Value.SA, "SA");

  public static final SearchparameterComparatorItem GT = new SearchparameterComparatorItem(Value.GT, "GT");

  public static final SearchparameterComparatorItem EB = new SearchparameterComparatorItem(Value.EB, "EB");

  public static final SearchparameterComparatorItem AP = new SearchparameterComparatorItem(Value.AP, "AP");

  private final Value value;

  private final String string;

  SearchparameterComparatorItem(Value value, String string) {
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
      || (other instanceof SearchparameterComparatorItem && this.string.equals(((SearchparameterComparatorItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LT:
        return visitor.visitLT();
      case NE:
        return visitor.visitNE();
      case LE:
        return visitor.visitLE();
      case EQ:
        return visitor.visitEQ();
      case GE:
        return visitor.visitGE();
      case SA:
        return visitor.visitSA();
      case GT:
        return visitor.visitGT();
      case EB:
        return visitor.visitEB();
      case AP:
        return visitor.visitAP();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SearchparameterComparatorItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LT":
        return LT;
      case "NE":
        return NE;
      case "LE":
        return LE;
      case "EQ":
        return EQ;
      case "GE":
        return GE;
      case "SA":
        return SA;
      case "GT":
        return GT;
      case "EB":
        return EB;
      case "AP":
        return AP;
      default:
        return new SearchparameterComparatorItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    EQ,

    NE,

    GT,

    LT,

    GE,

    LE,

    SA,

    EB,

    AP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEQ();

    T visitNE();

    T visitGT();

    T visitLT();

    T visitGE();

    T visitLE();

    T visitSA();

    T visitEB();

    T visitAP();

    T visitUnknown(String unknownType);
  }
}
