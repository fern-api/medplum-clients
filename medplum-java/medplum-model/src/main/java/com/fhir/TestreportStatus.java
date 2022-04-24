package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class TestreportStatus {
  public static final TestreportStatus COMPLETED = new TestreportStatus(Value.COMPLETED, "COMPLETED");

  public static final TestreportStatus STOPPED = new TestreportStatus(Value.STOPPED, "STOPPED");

  public static final TestreportStatus WAITING = new TestreportStatus(Value.WAITING, "WAITING");

  private final Value value;

  private final String string;

  TestreportStatus(Value value, String string) {
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
      || (other instanceof TestreportStatus && this.string.equals(((TestreportStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case STOPPED:
        return visitor.visitSTOPPED();
      case WAITING:
        return visitor.visitWAITING();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TestreportStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "COMPLETED":
        return COMPLETED;
      case "STOPPED":
        return STOPPED;
      case "WAITING":
        return WAITING;
      default:
        return new TestreportStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    COMPLETED,

    WAITING,

    STOPPED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCOMPLETED();

    T visitWAITING();

    T visitSTOPPED();

    T visitUnknown(String unknownType);
  }
}
