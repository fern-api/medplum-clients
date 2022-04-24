package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Timing_repeatWhenItem {
  public static final Timing_repeatWhenItem CV = new Timing_repeatWhenItem(Value.CV, "CV");

  public static final Timing_repeatWhenItem PC = new Timing_repeatWhenItem(Value.PC, "PC");

  public static final Timing_repeatWhenItem EVE = new Timing_repeatWhenItem(Value.EVE, "EVE");

  public static final Timing_repeatWhenItem ACV = new Timing_repeatWhenItem(Value.ACV, "ACV");

  public static final Timing_repeatWhenItem PCM = new Timing_repeatWhenItem(Value.PCM, "PCM");

  public static final Timing_repeatWhenItem WAKE = new Timing_repeatWhenItem(Value.WAKE, "WAKE");

  public static final Timing_repeatWhenItem HS = new Timing_repeatWhenItem(Value.HS, "HS");

  public static final Timing_repeatWhenItem ACM = new Timing_repeatWhenItem(Value.ACM, "ACM");

  public static final Timing_repeatWhenItem PCD = new Timing_repeatWhenItem(Value.PCD, "PCD");

  public static final Timing_repeatWhenItem AFT = new Timing_repeatWhenItem(Value.AFT, "AFT");

  public static final Timing_repeatWhenItem C = new Timing_repeatWhenItem(Value.C, "C");

  public static final Timing_repeatWhenItem PCV = new Timing_repeatWhenItem(Value.PCV, "PCV");

  public static final Timing_repeatWhenItem CM = new Timing_repeatWhenItem(Value.CM, "CM");

  public static final Timing_repeatWhenItem PHS = new Timing_repeatWhenItem(Value.PHS, "PHS");

  public static final Timing_repeatWhenItem NOON = new Timing_repeatWhenItem(Value.NOON, "NOON");

  public static final Timing_repeatWhenItem NIGHT = new Timing_repeatWhenItem(Value.NIGHT, "NIGHT");

  public static final Timing_repeatWhenItem ACD = new Timing_repeatWhenItem(Value.ACD, "ACD");

  public static final Timing_repeatWhenItem MORN = new Timing_repeatWhenItem(Value.MORN, "MORN");

  public static final Timing_repeatWhenItem AC = new Timing_repeatWhenItem(Value.AC, "AC");

  public static final Timing_repeatWhenItem CD = new Timing_repeatWhenItem(Value.CD, "CD");

  private final Value value;

  private final String string;

  Timing_repeatWhenItem(Value value, String string) {
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
      || (other instanceof Timing_repeatWhenItem && this.string.equals(((Timing_repeatWhenItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case CV:
        return visitor.visitCV();
      case PC:
        return visitor.visitPC();
      case EVE:
        return visitor.visitEVE();
      case ACV:
        return visitor.visitACV();
      case PCM:
        return visitor.visitPCM();
      case WAKE:
        return visitor.visitWAKE();
      case HS:
        return visitor.visitHS();
      case ACM:
        return visitor.visitACM();
      case PCD:
        return visitor.visitPCD();
      case AFT:
        return visitor.visitAFT();
      case C:
        return visitor.visitC();
      case PCV:
        return visitor.visitPCV();
      case CM:
        return visitor.visitCM();
      case PHS:
        return visitor.visitPHS();
      case NOON:
        return visitor.visitNOON();
      case NIGHT:
        return visitor.visitNIGHT();
      case ACD:
        return visitor.visitACD();
      case MORN:
        return visitor.visitMORN();
      case AC:
        return visitor.visitAC();
      case CD:
        return visitor.visitCD();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Timing_repeatWhenItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CV":
        return CV;
      case "PC":
        return PC;
      case "EVE":
        return EVE;
      case "ACV":
        return ACV;
      case "PCM":
        return PCM;
      case "WAKE":
        return WAKE;
      case "HS":
        return HS;
      case "ACM":
        return ACM;
      case "PCD":
        return PCD;
      case "AFT":
        return AFT;
      case "C":
        return C;
      case "PCV":
        return PCV;
      case "CM":
        return CM;
      case "PHS":
        return PHS;
      case "NOON":
        return NOON;
      case "NIGHT":
        return NIGHT;
      case "ACD":
        return ACD;
      case "MORN":
        return MORN;
      case "AC":
        return AC;
      case "CD":
        return CD;
      default:
        return new Timing_repeatWhenItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MORN,

    NOON,

    AFT,

    EVE,

    NIGHT,

    PHS,

    HS,

    WAKE,

    C,

    CM,

    CD,

    CV,

    AC,

    ACM,

    ACD,

    ACV,

    PC,

    PCM,

    PCD,

    PCV,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMORN();

    T visitNOON();

    T visitAFT();

    T visitEVE();

    T visitNIGHT();

    T visitPHS();

    T visitHS();

    T visitWAKE();

    T visitC();

    T visitCM();

    T visitCD();

    T visitCV();

    T visitAC();

    T visitACM();

    T visitACD();

    T visitACV();

    T visitPC();

    T visitPCM();

    T visitPCD();

    T visitPCV();

    T visitUnknown(String unknownType);
  }
}
