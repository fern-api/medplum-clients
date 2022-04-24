package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Careplan_detailStatus {
  public static final Careplan_detailStatus COMPLETED = new Careplan_detailStatus(Value.COMPLETED, "COMPLETED");

  public static final Careplan_detailStatus STOPPED = new Careplan_detailStatus(Value.STOPPED, "STOPPED");

  public static final Careplan_detailStatus SCHEDULED = new Careplan_detailStatus(Value.SCHEDULED, "SCHEDULED");

  public static final Careplan_detailStatus CANCELLED = new Careplan_detailStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  Careplan_detailStatus(Value value, String string) {
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
      || (other instanceof Careplan_detailStatus && this.string.equals(((Careplan_detailStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case STOPPED:
        return visitor.visitSTOPPED();
      case SCHEDULED:
        return visitor.visitSCHEDULED();
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
  public static Careplan_detailStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "COMPLETED":
        return COMPLETED;
      case "STOPPED":
        return STOPPED;
      case "SCHEDULED":
        return SCHEDULED;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new Careplan_detailStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SCHEDULED,

    COMPLETED,

    CANCELLED,

    STOPPED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSCHEDULED();

    T visitCOMPLETED();

    T visitCANCELLED();

    T visitSTOPPED();

    T visitUnknown(String unknownType);
  }
}
