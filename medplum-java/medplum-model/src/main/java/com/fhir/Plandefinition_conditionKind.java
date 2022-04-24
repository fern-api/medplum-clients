package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Plandefinition_conditionKind {
  public static final Plandefinition_conditionKind START = new Plandefinition_conditionKind(Value.START, "START");

  public static final Plandefinition_conditionKind STOP = new Plandefinition_conditionKind(Value.STOP, "STOP");

  public static final Plandefinition_conditionKind APPLICABILITY = new Plandefinition_conditionKind(Value.APPLICABILITY, "APPLICABILITY");

  private final Value value;

  private final String string;

  Plandefinition_conditionKind(Value value, String string) {
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
      || (other instanceof Plandefinition_conditionKind && this.string.equals(((Plandefinition_conditionKind) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case START:
        return visitor.visitSTART();
      case STOP:
        return visitor.visitSTOP();
      case APPLICABILITY:
        return visitor.visitAPPLICABILITY();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Plandefinition_conditionKind valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "START":
        return START;
      case "STOP":
        return STOP;
      case "APPLICABILITY":
        return APPLICABILITY;
      default:
        return new Plandefinition_conditionKind(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    APPLICABILITY,

    START,

    STOP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAPPLICABILITY();

    T visitSTART();

    T visitSTOP();

    T visitUnknown(String unknownType);
  }
}
