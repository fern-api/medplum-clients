package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Encounter_locationStatus {
  public static final Encounter_locationStatus ACTIVE = new Encounter_locationStatus(Value.ACTIVE, "ACTIVE");

  public static final Encounter_locationStatus RESERVED = new Encounter_locationStatus(Value.RESERVED, "RESERVED");

  public static final Encounter_locationStatus COMPLETED = new Encounter_locationStatus(Value.COMPLETED, "COMPLETED");

  public static final Encounter_locationStatus PLANNED = new Encounter_locationStatus(Value.PLANNED, "PLANNED");

  private final Value value;

  private final String string;

  Encounter_locationStatus(Value value, String string) {
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
      || (other instanceof Encounter_locationStatus && this.string.equals(((Encounter_locationStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case RESERVED:
        return visitor.visitRESERVED();
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case PLANNED:
        return visitor.visitPLANNED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Encounter_locationStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "RESERVED":
        return RESERVED;
      case "COMPLETED":
        return COMPLETED;
      case "PLANNED":
        return PLANNED;
      default:
        return new Encounter_locationStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PLANNED,

    ACTIVE,

    RESERVED,

    COMPLETED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPLANNED();

    T visitACTIVE();

    T visitRESERVED();

    T visitCOMPLETED();

    T visitUnknown(String unknownType);
  }
}
