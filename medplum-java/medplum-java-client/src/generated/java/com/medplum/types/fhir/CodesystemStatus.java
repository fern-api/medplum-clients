package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CodesystemStatus {
  public static final CodesystemStatus ACTIVE = new CodesystemStatus(Value.ACTIVE, "ACTIVE");

  public static final CodesystemStatus RETIRED = new CodesystemStatus(Value.RETIRED, "RETIRED");

  public static final CodesystemStatus DRAFT = new CodesystemStatus(Value.DRAFT, "DRAFT");

  private final Value value;

  private final String string;

  CodesystemStatus(Value value, String string) {
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
      || (other instanceof CodesystemStatus && this.string.equals(((CodesystemStatus) other).string));
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
  public static CodesystemStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "RETIRED":
        return RETIRED;
      case "DRAFT":
        return DRAFT;
      default:
        return new CodesystemStatus(Value.UNKNOWN, upperCasedValue);
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
