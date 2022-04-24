package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Plandefinition_actionSelectionbehavior {
  public static final Plandefinition_actionSelectionbehavior ANY = new Plandefinition_actionSelectionbehavior(Value.ANY, "ANY");

  public static final Plandefinition_actionSelectionbehavior ALL = new Plandefinition_actionSelectionbehavior(Value.ALL, "ALL");

  private final Value value;

  private final String string;

  Plandefinition_actionSelectionbehavior(Value value, String string) {
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
      || (other instanceof Plandefinition_actionSelectionbehavior && this.string.equals(((Plandefinition_actionSelectionbehavior) other).string));
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
  public static Plandefinition_actionSelectionbehavior valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ANY":
        return ANY;
      case "ALL":
        return ALL;
      default:
        return new Plandefinition_actionSelectionbehavior(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ANY,

    ALL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitANY();

    T visitALL();

    T visitUnknown(String unknownType);
  }
}
