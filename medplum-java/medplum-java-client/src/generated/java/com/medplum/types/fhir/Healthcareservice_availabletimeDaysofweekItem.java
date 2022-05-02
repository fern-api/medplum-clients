package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Healthcareservice_availabletimeDaysofweekItem {
  public static final Healthcareservice_availabletimeDaysofweekItem WED = new Healthcareservice_availabletimeDaysofweekItem(Value.WED, "WED");

  public static final Healthcareservice_availabletimeDaysofweekItem SAT = new Healthcareservice_availabletimeDaysofweekItem(Value.SAT, "SAT");

  public static final Healthcareservice_availabletimeDaysofweekItem TUE = new Healthcareservice_availabletimeDaysofweekItem(Value.TUE, "TUE");

  public static final Healthcareservice_availabletimeDaysofweekItem FRI = new Healthcareservice_availabletimeDaysofweekItem(Value.FRI, "FRI");

  public static final Healthcareservice_availabletimeDaysofweekItem MON = new Healthcareservice_availabletimeDaysofweekItem(Value.MON, "MON");

  public static final Healthcareservice_availabletimeDaysofweekItem SUN = new Healthcareservice_availabletimeDaysofweekItem(Value.SUN, "SUN");

  public static final Healthcareservice_availabletimeDaysofweekItem THU = new Healthcareservice_availabletimeDaysofweekItem(Value.THU, "THU");

  private final Value value;

  private final String string;

  Healthcareservice_availabletimeDaysofweekItem(Value value, String string) {
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
      || (other instanceof Healthcareservice_availabletimeDaysofweekItem && this.string.equals(((Healthcareservice_availabletimeDaysofweekItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case WED:
        return visitor.visitWED();
      case SAT:
        return visitor.visitSAT();
      case TUE:
        return visitor.visitTUE();
      case FRI:
        return visitor.visitFRI();
      case MON:
        return visitor.visitMON();
      case SUN:
        return visitor.visitSUN();
      case THU:
        return visitor.visitTHU();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Healthcareservice_availabletimeDaysofweekItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "WED":
        return WED;
      case "SAT":
        return SAT;
      case "TUE":
        return TUE;
      case "FRI":
        return FRI;
      case "MON":
        return MON;
      case "SUN":
        return SUN;
      case "THU":
        return THU;
      default:
        return new Healthcareservice_availabletimeDaysofweekItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MON,

    TUE,

    WED,

    THU,

    FRI,

    SAT,

    SUN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMON();

    T visitTUE();

    T visitWED();

    T visitTHU();

    T visitFRI();

    T visitSAT();

    T visitSUN();

    T visitUnknown(String unknownType);
  }
}
