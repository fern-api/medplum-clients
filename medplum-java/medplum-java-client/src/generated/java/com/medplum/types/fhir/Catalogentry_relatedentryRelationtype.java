package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Catalogentry_relatedentryRelationtype {
  public static final Catalogentry_relatedentryRelationtype TRIGGERS = new Catalogentry_relatedentryRelationtype(Value.TRIGGERS, "TRIGGERS");

  private final Value value;

  private final String string;

  Catalogentry_relatedentryRelationtype(Value value, String string) {
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
      || (other instanceof Catalogentry_relatedentryRelationtype && this.string.equals(((Catalogentry_relatedentryRelationtype) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case TRIGGERS:
        return visitor.visitTRIGGERS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Catalogentry_relatedentryRelationtype valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "TRIGGERS":
        return TRIGGERS;
      default:
        return new Catalogentry_relatedentryRelationtype(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    TRIGGERS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitTRIGGERS();

    T visitUnknown(String unknownType);
  }
}
