package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ResearchstudyStatus {
  public static final ResearchstudyStatus ACTIVE = new ResearchstudyStatus(Value.ACTIVE, "ACTIVE");

  public static final ResearchstudyStatus COMPLETED = new ResearchstudyStatus(Value.COMPLETED, "COMPLETED");

  public static final ResearchstudyStatus WITHDRAWN = new ResearchstudyStatus(Value.WITHDRAWN, "WITHDRAWN");

  public static final ResearchstudyStatus APPROVED = new ResearchstudyStatus(Value.APPROVED, "APPROVED");

  public static final ResearchstudyStatus DISAPPROVED = new ResearchstudyStatus(Value.DISAPPROVED, "DISAPPROVED");

  private final Value value;

  private final String string;

  ResearchstudyStatus(Value value, String string) {
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
      || (other instanceof ResearchstudyStatus && this.string.equals(((ResearchstudyStatus) other).string));
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
      case WITHDRAWN:
        return visitor.visitWITHDRAWN();
      case APPROVED:
        return visitor.visitAPPROVED();
      case DISAPPROVED:
        return visitor.visitDISAPPROVED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ResearchstudyStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "COMPLETED":
        return COMPLETED;
      case "WITHDRAWN":
        return WITHDRAWN;
      case "APPROVED":
        return APPROVED;
      case "DISAPPROVED":
        return DISAPPROVED;
      default:
        return new ResearchstudyStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    APPROVED,

    COMPLETED,

    DISAPPROVED,

    WITHDRAWN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitACTIVE();

    T visitAPPROVED();

    T visitCOMPLETED();

    T visitDISAPPROVED();

    T visitWITHDRAWN();

    T visitUnknown(String unknownType);
  }
}
