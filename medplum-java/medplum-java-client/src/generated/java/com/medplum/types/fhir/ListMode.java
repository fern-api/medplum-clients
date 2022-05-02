package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ListMode {
  public static final ListMode SNAPSHOT = new ListMode(Value.SNAPSHOT, "SNAPSHOT");

  public static final ListMode CHANGES = new ListMode(Value.CHANGES, "CHANGES");

  public static final ListMode WORKING = new ListMode(Value.WORKING, "WORKING");

  private final Value value;

  private final String string;

  ListMode(Value value, String string) {
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
      || (other instanceof ListMode && this.string.equals(((ListMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SNAPSHOT:
        return visitor.visitSNAPSHOT();
      case CHANGES:
        return visitor.visitCHANGES();
      case WORKING:
        return visitor.visitWORKING();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ListMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SNAPSHOT":
        return SNAPSHOT;
      case "CHANGES":
        return CHANGES;
      case "WORKING":
        return WORKING;
      default:
        return new ListMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    WORKING,

    SNAPSHOT,

    CHANGES,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitWORKING();

    T visitSNAPSHOT();

    T visitCHANGES();

    T visitUnknown(String unknownType);
  }
}
