package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Plandefinition_actionPrecheckbehavior {
  public static final Plandefinition_actionPrecheckbehavior YES = new Plandefinition_actionPrecheckbehavior(Value.YES, "YES");

  public static final Plandefinition_actionPrecheckbehavior NO = new Plandefinition_actionPrecheckbehavior(Value.NO, "NO");

  private final Value value;

  private final String string;

  Plandefinition_actionPrecheckbehavior(Value value, String string) {
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
      || (other instanceof Plandefinition_actionPrecheckbehavior && this.string.equals(((Plandefinition_actionPrecheckbehavior) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case YES:
        return visitor.visitYES();
      case NO:
        return visitor.visitNO();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Plandefinition_actionPrecheckbehavior valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "YES":
        return YES;
      case "NO":
        return NO;
      default:
        return new Plandefinition_actionPrecheckbehavior(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    YES,

    NO,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitYES();

    T visitNO();

    T visitUnknown(String unknownType);
  }
}
