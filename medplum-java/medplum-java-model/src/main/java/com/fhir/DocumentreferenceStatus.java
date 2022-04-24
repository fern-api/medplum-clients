package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DocumentreferenceStatus {
  public static final DocumentreferenceStatus SUPERSEDED = new DocumentreferenceStatus(Value.SUPERSEDED, "SUPERSEDED");

  public static final DocumentreferenceStatus CURRENT = new DocumentreferenceStatus(Value.CURRENT, "CURRENT");

  private final Value value;

  private final String string;

  DocumentreferenceStatus(Value value, String string) {
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
      || (other instanceof DocumentreferenceStatus && this.string.equals(((DocumentreferenceStatus) other).string));
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
  public static DocumentreferenceStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SUPERSEDED":
        return SUPERSEDED;
      case "CURRENT":
        return CURRENT;
      default:
        return new DocumentreferenceStatus(Value.UNKNOWN, upperCasedValue);
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
