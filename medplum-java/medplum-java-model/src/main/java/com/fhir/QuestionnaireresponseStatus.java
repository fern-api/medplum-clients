package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class QuestionnaireresponseStatus {
  public static final QuestionnaireresponseStatus COMPLETED = new QuestionnaireresponseStatus(Value.COMPLETED, "COMPLETED");

  public static final QuestionnaireresponseStatus STOPPED = new QuestionnaireresponseStatus(Value.STOPPED, "STOPPED");

  public static final QuestionnaireresponseStatus AMENDED = new QuestionnaireresponseStatus(Value.AMENDED, "AMENDED");

  private final Value value;

  private final String string;

  QuestionnaireresponseStatus(Value value, String string) {
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
      || (other instanceof QuestionnaireresponseStatus && this.string.equals(((QuestionnaireresponseStatus) other).string));
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
      case AMENDED:
        return visitor.visitAMENDED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static QuestionnaireresponseStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "COMPLETED":
        return COMPLETED;
      case "STOPPED":
        return STOPPED;
      case "AMENDED":
        return AMENDED;
      default:
        return new QuestionnaireresponseStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    COMPLETED,

    AMENDED,

    STOPPED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCOMPLETED();

    T visitAMENDED();

    T visitSTOPPED();

    T visitUnknown(String unknownType);
  }
}
