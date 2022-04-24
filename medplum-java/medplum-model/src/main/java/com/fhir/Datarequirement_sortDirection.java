package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Datarequirement_sortDirection {
  public static final Datarequirement_sortDirection DESCENDING = new Datarequirement_sortDirection(Value.DESCENDING, "DESCENDING");

  public static final Datarequirement_sortDirection ASCENDING = new Datarequirement_sortDirection(Value.ASCENDING, "ASCENDING");

  private final Value value;

  private final String string;

  Datarequirement_sortDirection(Value value, String string) {
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
      || (other instanceof Datarequirement_sortDirection && this.string.equals(((Datarequirement_sortDirection) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DESCENDING:
        return visitor.visitDESCENDING();
      case ASCENDING:
        return visitor.visitASCENDING();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Datarequirement_sortDirection valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DESCENDING":
        return DESCENDING;
      case "ASCENDING":
        return ASCENDING;
      default:
        return new Datarequirement_sortDirection(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ASCENDING,

    DESCENDING,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitASCENDING();

    T visitDESCENDING();

    T visitUnknown(String unknownType);
  }
}
