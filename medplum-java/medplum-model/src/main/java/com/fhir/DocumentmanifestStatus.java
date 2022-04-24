package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DocumentmanifestStatus {
  public static final DocumentmanifestStatus SUPERSEDED = new DocumentmanifestStatus(Value.SUPERSEDED, "SUPERSEDED");

  public static final DocumentmanifestStatus CURRENT = new DocumentmanifestStatus(Value.CURRENT, "CURRENT");

  private final Value value;

  private final String string;

  DocumentmanifestStatus(Value value, String string) {
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
      || (other instanceof DocumentmanifestStatus && this.string.equals(((DocumentmanifestStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SUPERSEDED:
        return visitor.visitSUPERSEDED();
      case CURRENT:
        return visitor.visitCURRENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DocumentmanifestStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SUPERSEDED":
        return SUPERSEDED;
      case "CURRENT":
        return CURRENT;
      default:
        return new DocumentmanifestStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CURRENT,

    SUPERSEDED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCURRENT();

    T visitSUPERSEDED();

    T visitUnknown(String unknownType);
  }
}
