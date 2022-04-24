package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Device_udicarrierEntrytype {
  public static final Device_udicarrierEntrytype BARCODE = new Device_udicarrierEntrytype(Value.BARCODE, "BARCODE");

  public static final Device_udicarrierEntrytype RFID = new Device_udicarrierEntrytype(Value.RFID, "RFID");

  public static final Device_udicarrierEntrytype MANUAL = new Device_udicarrierEntrytype(Value.MANUAL, "MANUAL");

  public static final Device_udicarrierEntrytype CARD = new Device_udicarrierEntrytype(Value.CARD, "CARD");

  private final Value value;

  private final String string;

  Device_udicarrierEntrytype(Value value, String string) {
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
      || (other instanceof Device_udicarrierEntrytype && this.string.equals(((Device_udicarrierEntrytype) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case BARCODE:
        return visitor.visitBARCODE();
      case RFID:
        return visitor.visitRFID();
      case MANUAL:
        return visitor.visitMANUAL();
      case CARD:
        return visitor.visitCARD();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Device_udicarrierEntrytype valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "BARCODE":
        return BARCODE;
      case "RFID":
        return RFID;
      case "MANUAL":
        return MANUAL;
      case "CARD":
        return CARD;
      default:
        return new Device_udicarrierEntrytype(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BARCODE,

    RFID,

    MANUAL,

    CARD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBARCODE();

    T visitRFID();

    T visitMANUAL();

    T visitCARD();

    T visitUnknown(String unknownType);
  }
}
