package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_searchparamType {
  public static final Capabilitystatement_searchparamType TOKEN = new Capabilitystatement_searchparamType(Value.TOKEN, "TOKEN");

  public static final Capabilitystatement_searchparamType SPECIAL = new Capabilitystatement_searchparamType(Value.SPECIAL, "SPECIAL");

  public static final Capabilitystatement_searchparamType STRING = new Capabilitystatement_searchparamType(Value.STRING, "STRING");

  public static final Capabilitystatement_searchparamType QUANTITY = new Capabilitystatement_searchparamType(Value.QUANTITY, "QUANTITY");

  public static final Capabilitystatement_searchparamType DATE = new Capabilitystatement_searchparamType(Value.DATE, "DATE");

  public static final Capabilitystatement_searchparamType NUMBER = new Capabilitystatement_searchparamType(Value.NUMBER, "NUMBER");

  public static final Capabilitystatement_searchparamType URI = new Capabilitystatement_searchparamType(Value.URI, "URI");

  public static final Capabilitystatement_searchparamType REFERENCE = new Capabilitystatement_searchparamType(Value.REFERENCE, "REFERENCE");

  public static final Capabilitystatement_searchparamType COMPOSITE = new Capabilitystatement_searchparamType(Value.COMPOSITE, "COMPOSITE");

  private final Value value;

  private final String string;

  Capabilitystatement_searchparamType(Value value, String string) {
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
      || (other instanceof Capabilitystatement_searchparamType && this.string.equals(((Capabilitystatement_searchparamType) other).string));
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
  public static Capabilitystatement_searchparamType valueOf(@Nonnull String value) {
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
        return new Capabilitystatement_searchparamType(Value.UNKNOWN, upperCasedValue);
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
