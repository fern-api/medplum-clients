package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Timing_repeatPeriodunit {
  public static final Timing_repeatPeriodunit D = new Timing_repeatPeriodunit(Value.D, "D");

  public static final Timing_repeatPeriodunit WK = new Timing_repeatPeriodunit(Value.WK, "WK");

  public static final Timing_repeatPeriodunit S = new Timing_repeatPeriodunit(Value.S, "S");

  public static final Timing_repeatPeriodunit H = new Timing_repeatPeriodunit(Value.H, "H");

  public static final Timing_repeatPeriodunit MIN = new Timing_repeatPeriodunit(Value.MIN, "MIN");

  public static final Timing_repeatPeriodunit MO = new Timing_repeatPeriodunit(Value.MO, "MO");

  public static final Timing_repeatPeriodunit A = new Timing_repeatPeriodunit(Value.A, "A");

  private final Value value;

  private final String string;

  Timing_repeatPeriodunit(Value value, String string) {
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
      || (other instanceof Timing_repeatPeriodunit && this.string.equals(((Timing_repeatPeriodunit) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case D:
        return visitor.visitD();
      case WK:
        return visitor.visitWK();
      case S:
        return visitor.visitS();
      case H:
        return visitor.visitH();
      case MIN:
        return visitor.visitMIN();
      case MO:
        return visitor.visitMO();
      case A:
        return visitor.visitA();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Timing_repeatPeriodunit valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "D":
        return D;
      case "WK":
        return WK;
      case "S":
        return S;
      case "H":
        return H;
      case "MIN":
        return MIN;
      case "MO":
        return MO;
      case "A":
        return A;
      default:
        return new Timing_repeatPeriodunit(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    S,

    MIN,

    H,

    D,

    WK,

    MO,

    A,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitS();

    T visitMIN();

    T visitH();

    T visitD();

    T visitWK();

    T visitMO();

    T visitA();

    T visitUnknown(String unknownType);
  }
}
