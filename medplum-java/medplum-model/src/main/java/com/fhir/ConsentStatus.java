package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ConsentStatus {
  public static final ConsentStatus ACTIVE = new ConsentStatus(Value.ACTIVE, "ACTIVE");

  public static final ConsentStatus INACTIVE = new ConsentStatus(Value.INACTIVE, "INACTIVE");

  public static final ConsentStatus REJECTED = new ConsentStatus(Value.REJECTED, "REJECTED");

  public static final ConsentStatus PROPOSED = new ConsentStatus(Value.PROPOSED, "PROPOSED");

  public static final ConsentStatus DRAFT = new ConsentStatus(Value.DRAFT, "DRAFT");

  private final Value value;

  private final String string;

  ConsentStatus(Value value, String string) {
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
      || (other instanceof ConsentStatus && this.string.equals(((ConsentStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case INACTIVE:
        return visitor.visitINACTIVE();
      case REJECTED:
        return visitor.visitREJECTED();
      case PROPOSED:
        return visitor.visitPROPOSED();
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
  public static ConsentStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "INACTIVE":
        return INACTIVE;
      case "REJECTED":
        return REJECTED;
      case "PROPOSED":
        return PROPOSED;
      case "DRAFT":
        return DRAFT;
      default:
        return new ConsentStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DRAFT,

    PROPOSED,

    ACTIVE,

    REJECTED,

    INACTIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDRAFT();

    T visitPROPOSED();

    T visitACTIVE();

    T visitREJECTED();

    T visitINACTIVE();

    T visitUnknown(String unknownType);
  }
}
