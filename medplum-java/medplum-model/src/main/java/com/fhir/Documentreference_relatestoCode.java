package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Documentreference_relatestoCode {
  public static final Documentreference_relatestoCode APPENDS = new Documentreference_relatestoCode(Value.APPENDS, "APPENDS");

  public static final Documentreference_relatestoCode SIGNS = new Documentreference_relatestoCode(Value.SIGNS, "SIGNS");

  public static final Documentreference_relatestoCode REPLACES = new Documentreference_relatestoCode(Value.REPLACES, "REPLACES");

  public static final Documentreference_relatestoCode TRANSFORMS = new Documentreference_relatestoCode(Value.TRANSFORMS, "TRANSFORMS");

  private final Value value;

  private final String string;

  Documentreference_relatestoCode(Value value, String string) {
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
      || (other instanceof Documentreference_relatestoCode && this.string.equals(((Documentreference_relatestoCode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case APPENDS:
        return visitor.visitAPPENDS();
      case SIGNS:
        return visitor.visitSIGNS();
      case REPLACES:
        return visitor.visitREPLACES();
      case TRANSFORMS:
        return visitor.visitTRANSFORMS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Documentreference_relatestoCode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "APPENDS":
        return APPENDS;
      case "SIGNS":
        return SIGNS;
      case "REPLACES":
        return REPLACES;
      case "TRANSFORMS":
        return TRANSFORMS;
      default:
        return new Documentreference_relatestoCode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REPLACES,

    TRANSFORMS,

    SIGNS,

    APPENDS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREPLACES();

    T visitTRANSFORMS();

    T visitSIGNS();

    T visitAPPENDS();

    T visitUnknown(String unknownType);
  }
}
