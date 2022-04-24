package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class EncounterStatus {
  public static final EncounterStatus TRIAGED = new EncounterStatus(Value.TRIAGED, "TRIAGED");

  public static final EncounterStatus ONLEAVE = new EncounterStatus(Value.ONLEAVE, "ONLEAVE");

  public static final EncounterStatus ARRIVED = new EncounterStatus(Value.ARRIVED, "ARRIVED");

  public static final EncounterStatus PLANNED = new EncounterStatus(Value.PLANNED, "PLANNED");

  public static final EncounterStatus FINISHED = new EncounterStatus(Value.FINISHED, "FINISHED");

  public static final EncounterStatus CANCELLED = new EncounterStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  EncounterStatus(Value value, String string) {
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
      || (other instanceof EncounterStatus && this.string.equals(((EncounterStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case TRIAGED:
        return visitor.visitTRIAGED();
      case ONLEAVE:
        return visitor.visitONLEAVE();
      case ARRIVED:
        return visitor.visitARRIVED();
      case PLANNED:
        return visitor.visitPLANNED();
      case FINISHED:
        return visitor.visitFINISHED();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static EncounterStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "TRIAGED":
        return TRIAGED;
      case "ONLEAVE":
        return ONLEAVE;
      case "ARRIVED":
        return ARRIVED;
      case "PLANNED":
        return PLANNED;
      case "FINISHED":
        return FINISHED;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new EncounterStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PLANNED,

    ARRIVED,

    TRIAGED,

    ONLEAVE,

    FINISHED,

    CANCELLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPLANNED();

    T visitARRIVED();

    T visitTRIAGED();

    T visitONLEAVE();

    T visitFINISHED();

    T visitCANCELLED();

    T visitUnknown(String unknownType);
  }
}
