package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Devicemetric_calibrationState {
  public static final Devicemetric_calibrationState UNSPECIFIED = new Devicemetric_calibrationState(Value.UNSPECIFIED, "UNSPECIFIED");

  public static final Devicemetric_calibrationState CALIBRATED = new Devicemetric_calibrationState(Value.CALIBRATED, "CALIBRATED");

  private final Value value;

  private final String string;

  Devicemetric_calibrationState(Value value, String string) {
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
      || (other instanceof Devicemetric_calibrationState && this.string.equals(((Devicemetric_calibrationState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case UNSPECIFIED:
        return visitor.visitUNSPECIFIED();
      case CALIBRATED:
        return visitor.visitCALIBRATED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Devicemetric_calibrationState valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "UNSPECIFIED":
        return UNSPECIFIED;
      case "CALIBRATED":
        return CALIBRATED;
      default:
        return new Devicemetric_calibrationState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CALIBRATED,

    UNSPECIFIED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCALIBRATED();

    T visitUNSPECIFIED();

    T visitUnknown(String unknownType);
  }
}
