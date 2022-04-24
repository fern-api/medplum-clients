package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ObservationStatus {
  public static final ObservationStatus AMENDED = new ObservationStatus(Value.AMENDED, "AMENDED");

  public static final ObservationStatus REGISTERED = new ObservationStatus(Value.REGISTERED, "REGISTERED");

  public static final ObservationStatus CORRECTED = new ObservationStatus(Value.CORRECTED, "CORRECTED");

  public static final ObservationStatus PRELIMINARY = new ObservationStatus(Value.PRELIMINARY, "PRELIMINARY");

  public static final ObservationStatus FINAL = new ObservationStatus(Value.FINAL, "FINAL");

  public static final ObservationStatus CANCELLED = new ObservationStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  ObservationStatus(Value value, String string) {
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
      || (other instanceof ObservationStatus && this.string.equals(((ObservationStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case AMENDED:
        return visitor.visitAMENDED();
      case REGISTERED:
        return visitor.visitREGISTERED();
      case CORRECTED:
        return visitor.visitCORRECTED();
      case PRELIMINARY:
        return visitor.visitPRELIMINARY();
      case FINAL:
        return visitor.visitFINAL();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ObservationStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "AMENDED":
        return AMENDED;
      case "REGISTERED":
        return REGISTERED;
      case "CORRECTED":
        return CORRECTED;
      case "PRELIMINARY":
        return PRELIMINARY;
      case "FINAL":
        return FINAL;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new ObservationStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REGISTERED,

    PRELIMINARY,

    FINAL,

    AMENDED,

    CORRECTED,

    CANCELLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREGISTERED();

    T visitPRELIMINARY();

    T visitFINAL();

    T visitAMENDED();

    T visitCORRECTED();

    T visitCANCELLED();

    T visitUnknown(String unknownType);
  }
}
