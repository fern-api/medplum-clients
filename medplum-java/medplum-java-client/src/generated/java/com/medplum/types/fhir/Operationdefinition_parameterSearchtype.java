package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Operationdefinition_parameterSearchtype {
  public static final Operationdefinition_parameterSearchtype TOKEN = new Operationdefinition_parameterSearchtype(Value.TOKEN, "TOKEN");

  public static final Operationdefinition_parameterSearchtype SPECIAL = new Operationdefinition_parameterSearchtype(Value.SPECIAL, "SPECIAL");

  public static final Operationdefinition_parameterSearchtype STRING = new Operationdefinition_parameterSearchtype(Value.STRING, "STRING");

  public static final Operationdefinition_parameterSearchtype QUANTITY = new Operationdefinition_parameterSearchtype(Value.QUANTITY, "QUANTITY");

  public static final Operationdefinition_parameterSearchtype DATE = new Operationdefinition_parameterSearchtype(Value.DATE, "DATE");

  public static final Operationdefinition_parameterSearchtype NUMBER = new Operationdefinition_parameterSearchtype(Value.NUMBER, "NUMBER");

  public static final Operationdefinition_parameterSearchtype URI = new Operationdefinition_parameterSearchtype(Value.URI, "URI");

  public static final Operationdefinition_parameterSearchtype REFERENCE = new Operationdefinition_parameterSearchtype(Value.REFERENCE, "REFERENCE");

  public static final Operationdefinition_parameterSearchtype COMPOSITE = new Operationdefinition_parameterSearchtype(Value.COMPOSITE, "COMPOSITE");

  private final Value value;

  private final String string;

  Operationdefinition_parameterSearchtype(Value value, String string) {
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
      || (other instanceof Operationdefinition_parameterSearchtype && this.string.equals(((Operationdefinition_parameterSearchtype) other).string));
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
  public static Operationdefinition_parameterSearchtype valueOf(@Nonnull String value) {
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
        return new Operationdefinition_parameterSearchtype(Value.UNKNOWN, upperCasedValue);
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
