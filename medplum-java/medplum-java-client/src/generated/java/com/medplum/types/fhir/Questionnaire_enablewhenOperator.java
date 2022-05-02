package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Questionnaire_enablewhenOperator {
  public static final Questionnaire_enablewhenOperator EXISTS = new Questionnaire_enablewhenOperator(Value.EXISTS, "EXISTS");

  private final Value value;

  private final String string;

  Questionnaire_enablewhenOperator(Value value, String string) {
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
      || (other instanceof Questionnaire_enablewhenOperator && this.string.equals(((Questionnaire_enablewhenOperator) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case EXISTS:
        return visitor.visitEXISTS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Questionnaire_enablewhenOperator valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EXISTS":
        return EXISTS;
      default:
        return new Questionnaire_enablewhenOperator(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    EXISTS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEXISTS();

    T visitUnknown(String unknownType);
  }
}
