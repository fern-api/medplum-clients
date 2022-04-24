package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SearchparameterType {
  public static final SearchparameterType TOKEN = new SearchparameterType(Value.TOKEN, "TOKEN");

  public static final SearchparameterType SPECIAL = new SearchparameterType(Value.SPECIAL, "SPECIAL");

  public static final SearchparameterType STRING = new SearchparameterType(Value.STRING, "STRING");

  public static final SearchparameterType QUANTITY = new SearchparameterType(Value.QUANTITY, "QUANTITY");

  public static final SearchparameterType DATE = new SearchparameterType(Value.DATE, "DATE");

  public static final SearchparameterType NUMBER = new SearchparameterType(Value.NUMBER, "NUMBER");

  public static final SearchparameterType URI = new SearchparameterType(Value.URI, "URI");

  public static final SearchparameterType REFERENCE = new SearchparameterType(Value.REFERENCE, "REFERENCE");

  public static final SearchparameterType COMPOSITE = new SearchparameterType(Value.COMPOSITE, "COMPOSITE");

  private final Value value;

  private final String string;

  SearchparameterType(Value value, String string) {
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
      || (other instanceof SearchparameterType && this.string.equals(((SearchparameterType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case TOKEN:
        return visitor.visitTOKEN();
      case SPECIAL:
        return visitor.visitSPECIAL();
      case STRING:
        return visitor.visitSTRING();
      case QUANTITY:
        return visitor.visitQUANTITY();
      case DATE:
        return visitor.visitDATE();
      case NUMBER:
        return visitor.visitNUMBER();
      case URI:
        return visitor.visitURI();
      case REFERENCE:
        return visitor.visitREFERENCE();
      case COMPOSITE:
        return visitor.visitCOMPOSITE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SearchparameterType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "TOKEN":
        return TOKEN;
      case "SPECIAL":
        return SPECIAL;
      case "STRING":
        return STRING;
      case "QUANTITY":
        return QUANTITY;
      case "DATE":
        return DATE;
      case "NUMBER":
        return NUMBER;
      case "URI":
        return URI;
      case "REFERENCE":
        return REFERENCE;
      case "COMPOSITE":
        return COMPOSITE;
      default:
        return new SearchparameterType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NUMBER,

    DATE,

    STRING,

    TOKEN,

    REFERENCE,

    COMPOSITE,

    QUANTITY,

    URI,

    SPECIAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNUMBER();

    T visitDATE();

    T visitSTRING();

    T visitTOKEN();

    T visitREFERENCE();

    T visitCOMPOSITE();

    T visitQUANTITY();

    T visitURI();

    T visitSPECIAL();

    T visitUnknown(String unknownType);
  }
}
