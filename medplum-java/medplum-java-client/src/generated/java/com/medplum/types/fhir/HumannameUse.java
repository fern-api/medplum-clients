package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class HumannameUse {
  public static final HumannameUse OFFICIAL = new HumannameUse(Value.OFFICIAL, "OFFICIAL");

  public static final HumannameUse NICKNAME = new HumannameUse(Value.NICKNAME, "NICKNAME");

  public static final HumannameUse OLD = new HumannameUse(Value.OLD, "OLD");

  public static final HumannameUse ANONYMOUS = new HumannameUse(Value.ANONYMOUS, "ANONYMOUS");

  public static final HumannameUse USUAL = new HumannameUse(Value.USUAL, "USUAL");

  public static final HumannameUse TEMP = new HumannameUse(Value.TEMP, "TEMP");

  public static final HumannameUse MAIDEN = new HumannameUse(Value.MAIDEN, "MAIDEN");

  private final Value value;

  private final String string;

  HumannameUse(Value value, String string) {
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
      || (other instanceof HumannameUse && this.string.equals(((HumannameUse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OFFICIAL:
        return visitor.visitOFFICIAL();
      case NICKNAME:
        return visitor.visitNICKNAME();
      case OLD:
        return visitor.visitOLD();
      case ANONYMOUS:
        return visitor.visitANONYMOUS();
      case USUAL:
        return visitor.visitUSUAL();
      case TEMP:
        return visitor.visitTEMP();
      case MAIDEN:
        return visitor.visitMAIDEN();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static HumannameUse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OFFICIAL":
        return OFFICIAL;
      case "NICKNAME":
        return NICKNAME;
      case "OLD":
        return OLD;
      case "ANONYMOUS":
        return ANONYMOUS;
      case "USUAL":
        return USUAL;
      case "TEMP":
        return TEMP;
      case "MAIDEN":
        return MAIDEN;
      default:
        return new HumannameUse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    USUAL,

    OFFICIAL,

    TEMP,

    NICKNAME,

    ANONYMOUS,

    OLD,

    MAIDEN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitUSUAL();

    T visitOFFICIAL();

    T visitTEMP();

    T visitNICKNAME();

    T visitANONYMOUS();

    T visitOLD();

    T visitMAIDEN();

    T visitUnknown(String unknownType);
  }
}
