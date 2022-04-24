package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Patient_linkType {
  public static final Patient_linkType SEEALSO = new Patient_linkType(Value.SEEALSO, "SEEALSO");

  public static final Patient_linkType REFER = new Patient_linkType(Value.REFER, "REFER");

  public static final Patient_linkType REPLACES = new Patient_linkType(Value.REPLACES, "REPLACES");

  private final Value value;

  private final String string;

  Patient_linkType(Value value, String string) {
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
      || (other instanceof Patient_linkType && this.string.equals(((Patient_linkType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SEEALSO:
        return visitor.visitSEEALSO();
      case REFER:
        return visitor.visitREFER();
      case REPLACES:
        return visitor.visitREPLACES();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Patient_linkType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SEEALSO":
        return SEEALSO;
      case "REFER":
        return REFER;
      case "REPLACES":
        return REPLACES;
      default:
        return new Patient_linkType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REPLACES,

    REFER,

    SEEALSO,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREPLACES();

    T visitREFER();

    T visitSEEALSO();

    T visitUnknown(String unknownType);
  }
}
