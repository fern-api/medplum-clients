package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class GoalLifecyclestatus {
  public static final GoalLifecyclestatus ACTIVE = new GoalLifecyclestatus(Value.ACTIVE, "ACTIVE");

  public static final GoalLifecyclestatus ACCEPTED = new GoalLifecyclestatus(Value.ACCEPTED, "ACCEPTED");

  public static final GoalLifecyclestatus COMPLETED = new GoalLifecyclestatus(Value.COMPLETED, "COMPLETED");

  public static final GoalLifecyclestatus REJECTED = new GoalLifecyclestatus(Value.REJECTED, "REJECTED");

  public static final GoalLifecyclestatus PROPOSED = new GoalLifecyclestatus(Value.PROPOSED, "PROPOSED");

  public static final GoalLifecyclestatus PLANNED = new GoalLifecyclestatus(Value.PLANNED, "PLANNED");

  public static final GoalLifecyclestatus CANCELLED = new GoalLifecyclestatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  GoalLifecyclestatus(Value value, String string) {
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
      || (other instanceof GoalLifecyclestatus && this.string.equals(((GoalLifecyclestatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case ACCEPTED:
        return visitor.visitACCEPTED();
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case REJECTED:
        return visitor.visitREJECTED();
      case PROPOSED:
        return visitor.visitPROPOSED();
      case PLANNED:
        return visitor.visitPLANNED();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static GoalLifecyclestatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "ACCEPTED":
        return ACCEPTED;
      case "COMPLETED":
        return COMPLETED;
      case "REJECTED":
        return REJECTED;
      case "PROPOSED":
        return PROPOSED;
      case "PLANNED":
        return PLANNED;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new GoalLifecyclestatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PROPOSED,

    PLANNED,

    ACCEPTED,

    ACTIVE,

    COMPLETED,

    CANCELLED,

    REJECTED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPROPOSED();

    T visitPLANNED();

    T visitACCEPTED();

    T visitACTIVE();

    T visitCOMPLETED();

    T visitCANCELLED();

    T visitREJECTED();

    T visitUnknown(String unknownType);
  }
}
