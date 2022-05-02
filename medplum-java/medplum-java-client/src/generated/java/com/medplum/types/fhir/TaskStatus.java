package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class TaskStatus {
  public static final TaskStatus FAILED = new TaskStatus(Value.FAILED, "FAILED");

  public static final TaskStatus ACCEPTED = new TaskStatus(Value.ACCEPTED, "ACCEPTED");

  public static final TaskStatus COMPLETED = new TaskStatus(Value.COMPLETED, "COMPLETED");

  public static final TaskStatus READY = new TaskStatus(Value.READY, "READY");

  public static final TaskStatus REJECTED = new TaskStatus(Value.REJECTED, "REJECTED");

  public static final TaskStatus DRAFT = new TaskStatus(Value.DRAFT, "DRAFT");

  public static final TaskStatus REQUESTED = new TaskStatus(Value.REQUESTED, "REQUESTED");

  public static final TaskStatus RECEIVED = new TaskStatus(Value.RECEIVED, "RECEIVED");

  public static final TaskStatus CANCELLED = new TaskStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  TaskStatus(Value value, String string) {
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
      || (other instanceof TaskStatus && this.string.equals(((TaskStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case FAILED:
        return visitor.visitFAILED();
      case ACCEPTED:
        return visitor.visitACCEPTED();
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case READY:
        return visitor.visitREADY();
      case REJECTED:
        return visitor.visitREJECTED();
      case DRAFT:
        return visitor.visitDRAFT();
      case REQUESTED:
        return visitor.visitREQUESTED();
      case RECEIVED:
        return visitor.visitRECEIVED();
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
  public static TaskStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FAILED":
        return FAILED;
      case "ACCEPTED":
        return ACCEPTED;
      case "COMPLETED":
        return COMPLETED;
      case "READY":
        return READY;
      case "REJECTED":
        return REJECTED;
      case "DRAFT":
        return DRAFT;
      case "REQUESTED":
        return REQUESTED;
      case "RECEIVED":
        return RECEIVED;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new TaskStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DRAFT,

    REQUESTED,

    RECEIVED,

    ACCEPTED,

    REJECTED,

    READY,

    CANCELLED,

    FAILED,

    COMPLETED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDRAFT();

    T visitREQUESTED();

    T visitRECEIVED();

    T visitACCEPTED();

    T visitREJECTED();

    T visitREADY();

    T visitCANCELLED();

    T visitFAILED();

    T visitCOMPLETED();

    T visitUnknown(String unknownType);
  }
}
