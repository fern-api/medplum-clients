package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AppointmentStatus {
  public static final AppointmentStatus NOSHOW = new AppointmentStatus(Value.NOSHOW, "NOSHOW");

  public static final AppointmentStatus WAITLIST = new AppointmentStatus(Value.WAITLIST, "WAITLIST");

  public static final AppointmentStatus ARRIVED = new AppointmentStatus(Value.ARRIVED, "ARRIVED");

  public static final AppointmentStatus PENDING = new AppointmentStatus(Value.PENDING, "PENDING");

  public static final AppointmentStatus PROPOSED = new AppointmentStatus(Value.PROPOSED, "PROPOSED");

  public static final AppointmentStatus BOOKED = new AppointmentStatus(Value.BOOKED, "BOOKED");

  public static final AppointmentStatus FULFILLED = new AppointmentStatus(Value.FULFILLED, "FULFILLED");

  public static final AppointmentStatus CANCELLED = new AppointmentStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  AppointmentStatus(Value value, String string) {
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
      || (other instanceof AppointmentStatus && this.string.equals(((AppointmentStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case NOSHOW:
        return visitor.visitNOSHOW();
      case WAITLIST:
        return visitor.visitWAITLIST();
      case ARRIVED:
        return visitor.visitARRIVED();
      case PENDING:
        return visitor.visitPENDING();
      case PROPOSED:
        return visitor.visitPROPOSED();
      case BOOKED:
        return visitor.visitBOOKED();
      case FULFILLED:
        return visitor.visitFULFILLED();
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
  public static AppointmentStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "NOSHOW":
        return NOSHOW;
      case "WAITLIST":
        return WAITLIST;
      case "ARRIVED":
        return ARRIVED;
      case "PENDING":
        return PENDING;
      case "PROPOSED":
        return PROPOSED;
      case "BOOKED":
        return BOOKED;
      case "FULFILLED":
        return FULFILLED;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new AppointmentStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PROPOSED,

    PENDING,

    BOOKED,

    ARRIVED,

    FULFILLED,

    CANCELLED,

    NOSHOW,

    WAITLIST,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPROPOSED();

    T visitPENDING();

    T visitBOOKED();

    T visitARRIVED();

    T visitFULFILLED();

    T visitCANCELLED();

    T visitNOSHOW();

    T visitWAITLIST();

    T visitUnknown(String unknownType);
  }
}
