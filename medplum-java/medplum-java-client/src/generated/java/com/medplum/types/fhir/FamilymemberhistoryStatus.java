package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class FamilymemberhistoryStatus {
  public static final FamilymemberhistoryStatus COMPLETED = new FamilymemberhistoryStatus(Value.COMPLETED, "COMPLETED");

  public static final FamilymemberhistoryStatus PARTIAL = new FamilymemberhistoryStatus(Value.PARTIAL, "PARTIAL");

  private final Value value;

  private final String string;

  FamilymemberhistoryStatus(Value value, String string) {
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
      || (other instanceof FamilymemberhistoryStatus && this.string.equals(((FamilymemberhistoryStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case PARTIAL:
        return visitor.visitPARTIAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static FamilymemberhistoryStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "COMPLETED":
        return COMPLETED;
      case "PARTIAL":
        return PARTIAL;
      default:
        return new FamilymemberhistoryStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PARTIAL,

    COMPLETED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPARTIAL();

    T visitCOMPLETED();

    T visitUnknown(String unknownType);
  }
}
