package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Questionnaire_itemEnablebehavior {
  public static final Questionnaire_itemEnablebehavior ANY = new Questionnaire_itemEnablebehavior(Value.ANY, "ANY");

  public static final Questionnaire_itemEnablebehavior ALL = new Questionnaire_itemEnablebehavior(Value.ALL, "ALL");

  private final Value value;

  private final String string;

  Questionnaire_itemEnablebehavior(Value value, String string) {
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
      || (other instanceof Questionnaire_itemEnablebehavior && this.string.equals(((Questionnaire_itemEnablebehavior) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ANY:
        return visitor.visitANY();
      case ALL:
        return visitor.visitALL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Questionnaire_itemEnablebehavior valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ANY":
        return ANY;
      case "ALL":
        return ALL;
      default:
        return new Questionnaire_itemEnablebehavior(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ALL,

    ANY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitALL();

    T visitANY();

    T visitUnknown(String unknownType);
  }
}
