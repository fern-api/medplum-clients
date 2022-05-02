package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CatalogentryStatus {
  public static final CatalogentryStatus ACTIVE = new CatalogentryStatus(Value.ACTIVE, "ACTIVE");

  public static final CatalogentryStatus RETIRED = new CatalogentryStatus(Value.RETIRED, "RETIRED");

  public static final CatalogentryStatus DRAFT = new CatalogentryStatus(Value.DRAFT, "DRAFT");

  private final Value value;

  private final String string;

  CatalogentryStatus(Value value, String string) {
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
      || (other instanceof CatalogentryStatus && this.string.equals(((CatalogentryStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case RETIRED:
        return visitor.visitRETIRED();
      case DRAFT:
        return visitor.visitDRAFT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CatalogentryStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "RETIRED":
        return RETIRED;
      case "DRAFT":
        return DRAFT;
      default:
        return new CatalogentryStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DRAFT,

    ACTIVE,

    RETIRED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDRAFT();

    T visitACTIVE();

    T visitRETIRED();

    T visitUnknown(String unknownType);
  }
}
