package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Questionnaire_itemType {
  public static final Questionnaire_itemType DECIMAL = new Questionnaire_itemType(Value.DECIMAL, "DECIMAL");

  public static final Questionnaire_itemType DATETIME = new Questionnaire_itemType(Value.DATETIME, "DATETIME");

  public static final Questionnaire_itemType DATE = new Questionnaire_itemType(Value.DATE, "DATE");

  public static final Questionnaire_itemType GROUP = new Questionnaire_itemType(Value.GROUP, "GROUP");

  public static final Questionnaire_itemType DISPLAY = new Questionnaire_itemType(Value.DISPLAY, "DISPLAY");

  public static final Questionnaire_itemType BOOLEAN = new Questionnaire_itemType(Value.BOOLEAN, "BOOLEAN");

  public static final Questionnaire_itemType URL = new Questionnaire_itemType(Value.URL, "URL");

  public static final Questionnaire_itemType CHOICE = new Questionnaire_itemType(Value.CHOICE, "CHOICE");

  public static final Questionnaire_itemType TIME = new Questionnaire_itemType(Value.TIME, "TIME");

  public static final Questionnaire_itemType TEXT = new Questionnaire_itemType(Value.TEXT, "TEXT");

  public static final Questionnaire_itemType ATTACHMENT = new Questionnaire_itemType(Value.ATTACHMENT, "ATTACHMENT");

  public static final Questionnaire_itemType STRING = new Questionnaire_itemType(Value.STRING, "STRING");

  public static final Questionnaire_itemType QUANTITY = new Questionnaire_itemType(Value.QUANTITY, "QUANTITY");

  public static final Questionnaire_itemType INTEGER = new Questionnaire_itemType(Value.INTEGER, "INTEGER");

  public static final Questionnaire_itemType REFERENCE = new Questionnaire_itemType(Value.REFERENCE, "REFERENCE");

  private final Value value;

  private final String string;

  Questionnaire_itemType(Value value, String string) {
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
      || (other instanceof Questionnaire_itemType && this.string.equals(((Questionnaire_itemType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DECIMAL:
        return visitor.visitDECIMAL();
      case DATETIME:
        return visitor.visitDATETIME();
      case DATE:
        return visitor.visitDATE();
      case GROUP:
        return visitor.visitGROUP();
      case DISPLAY:
        return visitor.visitDISPLAY();
      case BOOLEAN:
        return visitor.visitBOOLEAN();
      case URL:
        return visitor.visitURL();
      case CHOICE:
        return visitor.visitCHOICE();
      case TIME:
        return visitor.visitTIME();
      case TEXT:
        return visitor.visitTEXT();
      case ATTACHMENT:
        return visitor.visitATTACHMENT();
      case STRING:
        return visitor.visitSTRING();
      case QUANTITY:
        return visitor.visitQUANTITY();
      case INTEGER:
        return visitor.visitINTEGER();
      case REFERENCE:
        return visitor.visitREFERENCE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Questionnaire_itemType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DECIMAL":
        return DECIMAL;
      case "DATETIME":
        return DATETIME;
      case "DATE":
        return DATE;
      case "GROUP":
        return GROUP;
      case "DISPLAY":
        return DISPLAY;
      case "BOOLEAN":
        return BOOLEAN;
      case "URL":
        return URL;
      case "CHOICE":
        return CHOICE;
      case "TIME":
        return TIME;
      case "TEXT":
        return TEXT;
      case "ATTACHMENT":
        return ATTACHMENT;
      case "STRING":
        return STRING;
      case "QUANTITY":
        return QUANTITY;
      case "INTEGER":
        return INTEGER;
      case "REFERENCE":
        return REFERENCE;
      default:
        return new Questionnaire_itemType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    GROUP,

    DISPLAY,

    BOOLEAN,

    DECIMAL,

    INTEGER,

    DATE,

    DATETIME,

    TIME,

    STRING,

    TEXT,

    URL,

    CHOICE,

    ATTACHMENT,

    REFERENCE,

    QUANTITY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitGROUP();

    T visitDISPLAY();

    T visitBOOLEAN();

    T visitDECIMAL();

    T visitINTEGER();

    T visitDATE();

    T visitDATETIME();

    T visitTIME();

    T visitSTRING();

    T visitTEXT();

    T visitURL();

    T visitCHOICE();

    T visitATTACHMENT();

    T visitREFERENCE();

    T visitQUANTITY();

    T visitUnknown(String unknownType);
  }
}
