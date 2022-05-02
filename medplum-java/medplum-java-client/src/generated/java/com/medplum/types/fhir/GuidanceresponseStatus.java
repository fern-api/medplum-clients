package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class GuidanceresponseStatus {
  public static final GuidanceresponseStatus SUCCESS = new GuidanceresponseStatus(Value.SUCCESS, "SUCCESS");

  public static final GuidanceresponseStatus FAILURE = new GuidanceresponseStatus(Value.FAILURE, "FAILURE");

  private final Value value;

  private final String string;

  GuidanceresponseStatus(Value value, String string) {
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
      || (other instanceof GuidanceresponseStatus && this.string.equals(((GuidanceresponseStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SUCCESS:
        return visitor.visitSUCCESS();
      case FAILURE:
        return visitor.visitFAILURE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static GuidanceresponseStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SUCCESS":
        return SUCCESS;
      case "FAILURE":
        return FAILURE;
      default:
        return new GuidanceresponseStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SUCCESS,

    FAILURE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSUCCESS();

    T visitFAILURE();

    T visitUnknown(String unknownType);
  }
}
