package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class NarrativeStatus {
  public static final NarrativeStatus EXTENSIONS = new NarrativeStatus(Value.EXTENSIONS, "EXTENSIONS");

  public static final NarrativeStatus GENERATED = new NarrativeStatus(Value.GENERATED, "GENERATED");

  public static final NarrativeStatus ADDITIONAL = new NarrativeStatus(Value.ADDITIONAL, "ADDITIONAL");

  public static final NarrativeStatus EMPTY = new NarrativeStatus(Value.EMPTY, "EMPTY");

  private final Value value;

  private final String string;

  NarrativeStatus(Value value, String string) {
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
      || (other instanceof NarrativeStatus && this.string.equals(((NarrativeStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case EXTENSIONS:
        return visitor.visitEXTENSIONS();
      case GENERATED:
        return visitor.visitGENERATED();
      case ADDITIONAL:
        return visitor.visitADDITIONAL();
      case EMPTY:
        return visitor.visitEMPTY();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static NarrativeStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EXTENSIONS":
        return EXTENSIONS;
      case "GENERATED":
        return GENERATED;
      case "ADDITIONAL":
        return ADDITIONAL;
      case "EMPTY":
        return EMPTY;
      default:
        return new NarrativeStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    GENERATED,

    EXTENSIONS,

    ADDITIONAL,

    EMPTY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitGENERATED();

    T visitEXTENSIONS();

    T visitADDITIONAL();

    T visitEMPTY();

    T visitUnknown(String unknownType);
  }
}
