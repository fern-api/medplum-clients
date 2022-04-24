package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Devicemetric_calibrationType {
  public static final Devicemetric_calibrationType UNSPECIFIED = new Devicemetric_calibrationType(Value.UNSPECIFIED, "UNSPECIFIED");

  public static final Devicemetric_calibrationType OFFSET = new Devicemetric_calibrationType(Value.OFFSET, "OFFSET");

  public static final Devicemetric_calibrationType GAIN = new Devicemetric_calibrationType(Value.GAIN, "GAIN");

  private final Value value;

  private final String string;

  Devicemetric_calibrationType(Value value, String string) {
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
      || (other instanceof Devicemetric_calibrationType && this.string.equals(((Devicemetric_calibrationType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case UNSPECIFIED:
        return visitor.visitUNSPECIFIED();
      case OFFSET:
        return visitor.visitOFFSET();
      case GAIN:
        return visitor.visitGAIN();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Devicemetric_calibrationType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "UNSPECIFIED":
        return UNSPECIFIED;
      case "OFFSET":
        return OFFSET;
      case "GAIN":
        return GAIN;
      default:
        return new Devicemetric_calibrationType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    UNSPECIFIED,

    OFFSET,

    GAIN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitUNSPECIFIED();

    T visitOFFSET();

    T visitGAIN();

    T visitUnknown(String unknownType);
  }
}
