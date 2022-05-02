package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class AdverseeventActuality {
  public static final AdverseeventActuality POTENTIAL = new AdverseeventActuality(Value.POTENTIAL, "POTENTIAL");

  public static final AdverseeventActuality ACTUAL = new AdverseeventActuality(Value.ACTUAL, "ACTUAL");

  private final Value value;

  private final String string;

  AdverseeventActuality(Value value, String string) {
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
      || (other instanceof AdverseeventActuality && this.string.equals(((AdverseeventActuality) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case POTENTIAL:
        return visitor.visitPOTENTIAL();
      case ACTUAL:
        return visitor.visitACTUAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AdverseeventActuality valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "POTENTIAL":
        return POTENTIAL;
      case "ACTUAL":
        return ACTUAL;
      default:
        return new AdverseeventActuality(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTUAL,

    POTENTIAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACTUAL();

    T visitPOTENTIAL();

    T visitUnknown(String unknownType);
  }
}
