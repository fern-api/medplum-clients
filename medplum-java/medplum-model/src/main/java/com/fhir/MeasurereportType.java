package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class MeasurereportType {
  public static final MeasurereportType SUMMARY = new MeasurereportType(Value.SUMMARY, "SUMMARY");

  public static final MeasurereportType INDIVIDUAL = new MeasurereportType(Value.INDIVIDUAL, "INDIVIDUAL");

  private final Value value;

  private final String string;

  MeasurereportType(Value value, String string) {
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
      || (other instanceof MeasurereportType && this.string.equals(((MeasurereportType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SUMMARY:
        return visitor.visitSUMMARY();
      case INDIVIDUAL:
        return visitor.visitINDIVIDUAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static MeasurereportType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SUMMARY":
        return SUMMARY;
      case "INDIVIDUAL":
        return INDIVIDUAL;
      default:
        return new MeasurereportType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INDIVIDUAL,

    SUMMARY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitINDIVIDUAL();

    T visitSUMMARY();

    T visitUnknown(String unknownType);
  }
}
