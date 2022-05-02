package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Appointment_participantStatus {
  public static final Appointment_participantStatus ACCEPTED = new Appointment_participantStatus(Value.ACCEPTED, "ACCEPTED");

  public static final Appointment_participantStatus TENTATIVE = new Appointment_participantStatus(Value.TENTATIVE, "TENTATIVE");

  public static final Appointment_participantStatus DECLINED = new Appointment_participantStatus(Value.DECLINED, "DECLINED");

  private final Value value;

  private final String string;

  Appointment_participantStatus(Value value, String string) {
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
      || (other instanceof Appointment_participantStatus && this.string.equals(((Appointment_participantStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACCEPTED:
        return visitor.visitACCEPTED();
      case TENTATIVE:
        return visitor.visitTENTATIVE();
      case DECLINED:
        return visitor.visitDECLINED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Appointment_participantStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACCEPTED":
        return ACCEPTED;
      case "TENTATIVE":
        return TENTATIVE;
      case "DECLINED":
        return DECLINED;
      default:
        return new Appointment_participantStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACCEPTED,

    DECLINED,

    TENTATIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACCEPTED();

    T visitDECLINED();

    T visitTENTATIVE();

    T visitUnknown(String unknownType);
  }
}
