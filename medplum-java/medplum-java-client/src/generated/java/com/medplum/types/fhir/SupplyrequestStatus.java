package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SupplyrequestStatus {
  public static final SupplyrequestStatus ACTIVE = new SupplyrequestStatus(Value.ACTIVE, "ACTIVE");

  public static final SupplyrequestStatus COMPLETED = new SupplyrequestStatus(Value.COMPLETED, "COMPLETED");

  public static final SupplyrequestStatus SUSPENDED = new SupplyrequestStatus(Value.SUSPENDED, "SUSPENDED");

  public static final SupplyrequestStatus DRAFT = new SupplyrequestStatus(Value.DRAFT, "DRAFT");

  public static final SupplyrequestStatus CANCELLED = new SupplyrequestStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  SupplyrequestStatus(Value value, String string) {
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
      || (other instanceof SupplyrequestStatus && this.string.equals(((SupplyrequestStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case COMPLETED:
        return visitor.visitCOMPLETED();
      case SUSPENDED:
        return visitor.visitSUSPENDED();
      case DRAFT:
        return visitor.visitDRAFT();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SupplyrequestStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "COMPLETED":
        return COMPLETED;
      case "SUSPENDED":
        return SUSPENDED;
      case "DRAFT":
        return DRAFT;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new SupplyrequestStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DRAFT,

    ACTIVE,

    SUSPENDED,

    CANCELLED,

    COMPLETED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDRAFT();

    T visitACTIVE();

    T visitSUSPENDED();

    T visitCANCELLED();

    T visitCOMPLETED();

    T visitUnknown(String unknownType);
  }
}
