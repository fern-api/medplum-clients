package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ListStatus {
  public static final ListStatus RETIRED = new ListStatus(Value.RETIRED, "RETIRED");

  public static final ListStatus CURRENT = new ListStatus(Value.CURRENT, "CURRENT");

  private final Value value;

  private final String string;

  ListStatus(Value value, String string) {
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
      || (other instanceof ListStatus && this.string.equals(((ListStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case RETIRED:
        return visitor.visitRETIRED();
      case CURRENT:
        return visitor.visitCURRENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ListStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "RETIRED":
        return RETIRED;
      case "CURRENT":
        return CURRENT;
      default:
        return new ListStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CURRENT,

    RETIRED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCURRENT();

    T visitRETIRED();

    T visitUnknown(String unknownType);
  }
}
