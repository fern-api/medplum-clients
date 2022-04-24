package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Composition_attesterMode {
  public static final Composition_attesterMode OFFICIAL = new Composition_attesterMode(Value.OFFICIAL, "OFFICIAL");

  public static final Composition_attesterMode LEGAL = new Composition_attesterMode(Value.LEGAL, "LEGAL");

  public static final Composition_attesterMode PERSONAL = new Composition_attesterMode(Value.PERSONAL, "PERSONAL");

  public static final Composition_attesterMode PROFESSIONAL = new Composition_attesterMode(Value.PROFESSIONAL, "PROFESSIONAL");

  private final Value value;

  private final String string;

  Composition_attesterMode(Value value, String string) {
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
      || (other instanceof Composition_attesterMode && this.string.equals(((Composition_attesterMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case OFFICIAL:
        return visitor.visitOFFICIAL();
      case LEGAL:
        return visitor.visitLEGAL();
      case PERSONAL:
        return visitor.visitPERSONAL();
      case PROFESSIONAL:
        return visitor.visitPROFESSIONAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Composition_attesterMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "OFFICIAL":
        return OFFICIAL;
      case "LEGAL":
        return LEGAL;
      case "PERSONAL":
        return PERSONAL;
      case "PROFESSIONAL":
        return PROFESSIONAL;
      default:
        return new Composition_attesterMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PERSONAL,

    PROFESSIONAL,

    LEGAL,

    OFFICIAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPERSONAL();

    T visitPROFESSIONAL();

    T visitLEGAL();

    T visitOFFICIAL();

    T visitUnknown(String unknownType);
  }
}
