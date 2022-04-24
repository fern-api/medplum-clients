package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_interaction1Code {
  public static final Capabilitystatement_interaction1Code BATCH = new Capabilitystatement_interaction1Code(Value.BATCH, "BATCH");

  public static final Capabilitystatement_interaction1Code TRANSACTION = new Capabilitystatement_interaction1Code(Value.TRANSACTION, "TRANSACTION");

  private final Value value;

  private final String string;

  Capabilitystatement_interaction1Code(Value value, String string) {
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
      || (other instanceof Capabilitystatement_interaction1Code && this.string.equals(((Capabilitystatement_interaction1Code) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case BATCH:
        return visitor.visitBATCH();
      case TRANSACTION:
        return visitor.visitTRANSACTION();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Capabilitystatement_interaction1Code valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "BATCH":
        return BATCH;
      case "TRANSACTION":
        return TRANSACTION;
      default:
        return new Capabilitystatement_interaction1Code(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    TRANSACTION,

    BATCH,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitTRANSACTION();

    T visitBATCH();

    T visitUnknown(String unknownType);
  }
}
