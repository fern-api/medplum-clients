package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CompositionStatus {
  public static final CompositionStatus AMENDED = new CompositionStatus(Value.AMENDED, "AMENDED");

  public static final CompositionStatus PRELIMINARY = new CompositionStatus(Value.PRELIMINARY, "PRELIMINARY");

  public static final CompositionStatus FINAL = new CompositionStatus(Value.FINAL, "FINAL");

  private final Value value;

  private final String string;

  CompositionStatus(Value value, String string) {
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
      || (other instanceof CompositionStatus && this.string.equals(((CompositionStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case AMENDED:
        return visitor.visitAMENDED();
      case PRELIMINARY:
        return visitor.visitPRELIMINARY();
      case FINAL:
        return visitor.visitFINAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CompositionStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "AMENDED":
        return AMENDED;
      case "PRELIMINARY":
        return PRELIMINARY;
      case "FINAL":
        return FINAL;
      default:
        return new CompositionStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PRELIMINARY,

    FINAL,

    AMENDED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPRELIMINARY();

    T visitFINAL();

    T visitAMENDED();

    T visitUnknown(String unknownType);
  }
}
