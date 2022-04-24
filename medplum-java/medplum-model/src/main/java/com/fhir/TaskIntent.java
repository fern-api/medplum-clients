package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class TaskIntent {
  public static final TaskIntent PLAN = new TaskIntent(Value.PLAN, "PLAN");

  public static final TaskIntent PROPOSAL = new TaskIntent(Value.PROPOSAL, "PROPOSAL");

  public static final TaskIntent ORDER = new TaskIntent(Value.ORDER, "ORDER");

  public static final TaskIntent OPTION = new TaskIntent(Value.OPTION, "OPTION");

  private final Value value;

  private final String string;

  TaskIntent(Value value, String string) {
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
      || (other instanceof TaskIntent && this.string.equals(((TaskIntent) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PLAN:
        return visitor.visitPLAN();
      case PROPOSAL:
        return visitor.visitPROPOSAL();
      case ORDER:
        return visitor.visitORDER();
      case OPTION:
        return visitor.visitOPTION();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TaskIntent valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PLAN":
        return PLAN;
      case "PROPOSAL":
        return PROPOSAL;
      case "ORDER":
        return ORDER;
      case "OPTION":
        return OPTION;
      default:
        return new TaskIntent(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PROPOSAL,

    PLAN,

    ORDER,

    OPTION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPROPOSAL();

    T visitPLAN();

    T visitORDER();

    T visitOPTION();

    T visitUnknown(String unknownType);
  }
}
