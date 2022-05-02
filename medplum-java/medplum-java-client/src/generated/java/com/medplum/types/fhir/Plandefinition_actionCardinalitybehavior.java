package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Plandefinition_actionCardinalitybehavior {
  public static final Plandefinition_actionCardinalitybehavior SINGLE = new Plandefinition_actionCardinalitybehavior(Value.SINGLE, "SINGLE");

  public static final Plandefinition_actionCardinalitybehavior MULTIPLE = new Plandefinition_actionCardinalitybehavior(Value.MULTIPLE, "MULTIPLE");

  private final Value value;

  private final String string;

  Plandefinition_actionCardinalitybehavior(Value value, String string) {
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
      || (other instanceof Plandefinition_actionCardinalitybehavior && this.string.equals(((Plandefinition_actionCardinalitybehavior) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SINGLE:
        return visitor.visitSINGLE();
      case MULTIPLE:
        return visitor.visitMULTIPLE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Plandefinition_actionCardinalitybehavior valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SINGLE":
        return SINGLE;
      case "MULTIPLE":
        return MULTIPLE;
      default:
        return new Plandefinition_actionCardinalitybehavior(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SINGLE,

    MULTIPLE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSINGLE();

    T visitMULTIPLE();

    T visitUnknown(String unknownType);
  }
}
