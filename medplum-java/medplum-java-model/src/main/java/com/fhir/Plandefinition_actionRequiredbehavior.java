package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Plandefinition_actionRequiredbehavior {
  public static final Plandefinition_actionRequiredbehavior MUST = new Plandefinition_actionRequiredbehavior(Value.MUST, "MUST");

  public static final Plandefinition_actionRequiredbehavior COULD = new Plandefinition_actionRequiredbehavior(Value.COULD, "COULD");

  private final Value value;

  private final String string;

  Plandefinition_actionRequiredbehavior(Value value, String string) {
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
      || (other instanceof Plandefinition_actionRequiredbehavior && this.string.equals(((Plandefinition_actionRequiredbehavior) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case MUST:
        return visitor.visitMUST();
      case COULD:
        return visitor.visitCOULD();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Plandefinition_actionRequiredbehavior valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MUST":
        return MUST;
      case "COULD":
        return COULD;
      default:
        return new Plandefinition_actionRequiredbehavior(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MUST,

    COULD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMUST();

    T visitCOULD();

    T visitUnknown(String unknownType);
  }
}
