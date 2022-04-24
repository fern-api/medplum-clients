package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Codesystem_propertyType {
  public static final Codesystem_propertyType DECIMAL = new Codesystem_propertyType(Value.DECIMAL, "DECIMAL");

  public static final Codesystem_propertyType STRING = new Codesystem_propertyType(Value.STRING, "STRING");

  public static final Codesystem_propertyType CODING = new Codesystem_propertyType(Value.CODING, "CODING");

  public static final Codesystem_propertyType INTEGER = new Codesystem_propertyType(Value.INTEGER, "INTEGER");

  public static final Codesystem_propertyType DATETIME = new Codesystem_propertyType(Value.DATETIME, "DATETIME");

  public static final Codesystem_propertyType CODE = new Codesystem_propertyType(Value.CODE, "CODE");

  public static final Codesystem_propertyType BOOLEAN = new Codesystem_propertyType(Value.BOOLEAN, "BOOLEAN");

  private final Value value;

  private final String string;

  Codesystem_propertyType(Value value, String string) {
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
      || (other instanceof Codesystem_propertyType && this.string.equals(((Codesystem_propertyType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DECIMAL:
        return visitor.visitDECIMAL();
      case STRING:
        return visitor.visitSTRING();
      case CODING:
        return visitor.visitCODING();
      case INTEGER:
        return visitor.visitINTEGER();
      case DATETIME:
        return visitor.visitDATETIME();
      case CODE:
        return visitor.visitCODE();
      case BOOLEAN:
        return visitor.visitBOOLEAN();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Codesystem_propertyType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DECIMAL":
        return DECIMAL;
      case "STRING":
        return STRING;
      case "CODING":
        return CODING;
      case "INTEGER":
        return INTEGER;
      case "DATETIME":
        return DATETIME;
      case "CODE":
        return CODE;
      case "BOOLEAN":
        return BOOLEAN;
      default:
        return new Codesystem_propertyType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CODE,

    CODING,

    STRING,

    INTEGER,

    BOOLEAN,

    DATETIME,

    DECIMAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCODE();

    T visitCODING();

    T visitSTRING();

    T visitINTEGER();

    T visitBOOLEAN();

    T visitDATETIME();

    T visitDECIMAL();

    T visitUnknown(String unknownType);
  }
}
