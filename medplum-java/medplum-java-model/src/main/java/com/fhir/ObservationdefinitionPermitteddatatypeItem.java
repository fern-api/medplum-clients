package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ObservationdefinitionPermitteddatatypeItem {
  public static final ObservationdefinitionPermitteddatatypeItem CODEABLECONCEPT = new ObservationdefinitionPermitteddatatypeItem(Value.CODEABLECONCEPT, "CODEABLECONCEPT");

  public static final ObservationdefinitionPermitteddatatypeItem TIME = new ObservationdefinitionPermitteddatatypeItem(Value.TIME, "TIME");

  public static final ObservationdefinitionPermitteddatatypeItem QUANTITY = new ObservationdefinitionPermitteddatatypeItem(Value.QUANTITY, "QUANTITY");

  public static final ObservationdefinitionPermitteddatatypeItem STRING = new ObservationdefinitionPermitteddatatypeItem(Value.STRING, "STRING");

  public static final ObservationdefinitionPermitteddatatypeItem SAMPLEDDATA = new ObservationdefinitionPermitteddatatypeItem(Value.SAMPLEDDATA, "SAMPLEDDATA");

  public static final ObservationdefinitionPermitteddatatypeItem INTEGER = new ObservationdefinitionPermitteddatatypeItem(Value.INTEGER, "INTEGER");

  public static final ObservationdefinitionPermitteddatatypeItem RANGE = new ObservationdefinitionPermitteddatatypeItem(Value.RANGE, "RANGE");

  public static final ObservationdefinitionPermitteddatatypeItem DATETIME = new ObservationdefinitionPermitteddatatypeItem(Value.DATETIME, "DATETIME");

  public static final ObservationdefinitionPermitteddatatypeItem PERIOD = new ObservationdefinitionPermitteddatatypeItem(Value.PERIOD, "PERIOD");

  public static final ObservationdefinitionPermitteddatatypeItem RATIO = new ObservationdefinitionPermitteddatatypeItem(Value.RATIO, "RATIO");

  public static final ObservationdefinitionPermitteddatatypeItem BOOLEAN = new ObservationdefinitionPermitteddatatypeItem(Value.BOOLEAN, "BOOLEAN");

  private final Value value;

  private final String string;

  ObservationdefinitionPermitteddatatypeItem(Value value, String string) {
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
      || (other instanceof ObservationdefinitionPermitteddatatypeItem && this.string.equals(((ObservationdefinitionPermitteddatatypeItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case CODEABLECONCEPT:
        return visitor.visitCODEABLECONCEPT();
      case TIME:
        return visitor.visitTIME();
      case QUANTITY:
        return visitor.visitQUANTITY();
      case STRING:
        return visitor.visitSTRING();
      case SAMPLEDDATA:
        return visitor.visitSAMPLEDDATA();
      case INTEGER:
        return visitor.visitINTEGER();
      case RANGE:
        return visitor.visitRANGE();
      case DATETIME:
        return visitor.visitDATETIME();
      case PERIOD:
        return visitor.visitPERIOD();
      case RATIO:
        return visitor.visitRATIO();
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
  public static ObservationdefinitionPermitteddatatypeItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CODEABLECONCEPT":
        return CODEABLECONCEPT;
      case "TIME":
        return TIME;
      case "QUANTITY":
        return QUANTITY;
      case "STRING":
        return STRING;
      case "SAMPLEDDATA":
        return SAMPLEDDATA;
      case "INTEGER":
        return INTEGER;
      case "RANGE":
        return RANGE;
      case "DATETIME":
        return DATETIME;
      case "PERIOD":
        return PERIOD;
      case "RATIO":
        return RATIO;
      case "BOOLEAN":
        return BOOLEAN;
      default:
        return new ObservationdefinitionPermitteddatatypeItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    QUANTITY,

    CODEABLECONCEPT,

    STRING,

    BOOLEAN,

    INTEGER,

    RANGE,

    RATIO,

    SAMPLEDDATA,

    TIME,

    DATETIME,

    PERIOD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitQUANTITY();

    T visitCODEABLECONCEPT();

    T visitSTRING();

    T visitBOOLEAN();

    T visitINTEGER();

    T visitRANGE();

    T visitRATIO();

    T visitSAMPLEDDATA();

    T visitTIME();

    T visitDATETIME();

    T visitPERIOD();

    T visitUnknown(String unknownType);
  }
}
