package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ResearchsubjectStatus {
  public static final ResearchsubjectStatus WITHDRAWN = new ResearchsubjectStatus(Value.WITHDRAWN, "WITHDRAWN");

  public static final ResearchsubjectStatus INELIGIBLE = new ResearchsubjectStatus(Value.INELIGIBLE, "INELIGIBLE");

  public static final ResearchsubjectStatus CANDIDATE = new ResearchsubjectStatus(Value.CANDIDATE, "CANDIDATE");

  public static final ResearchsubjectStatus ELIGIBLE = new ResearchsubjectStatus(Value.ELIGIBLE, "ELIGIBLE");

  public static final ResearchsubjectStatus SCREENING = new ResearchsubjectStatus(Value.SCREENING, "SCREENING");

  private final Value value;

  private final String string;

  ResearchsubjectStatus(Value value, String string) {
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
      || (other instanceof ResearchsubjectStatus && this.string.equals(((ResearchsubjectStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case WITHDRAWN:
        return visitor.visitWITHDRAWN();
      case INELIGIBLE:
        return visitor.visitINELIGIBLE();
      case CANDIDATE:
        return visitor.visitCANDIDATE();
      case ELIGIBLE:
        return visitor.visitELIGIBLE();
      case SCREENING:
        return visitor.visitSCREENING();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ResearchsubjectStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "WITHDRAWN":
        return WITHDRAWN;
      case "INELIGIBLE":
        return INELIGIBLE;
      case "CANDIDATE":
        return CANDIDATE;
      case "ELIGIBLE":
        return ELIGIBLE;
      case "SCREENING":
        return SCREENING;
      default:
        return new ResearchsubjectStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CANDIDATE,

    ELIGIBLE,

    INELIGIBLE,

    SCREENING,

    WITHDRAWN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCANDIDATE();

    T visitELIGIBLE();

    T visitINELIGIBLE();

    T visitSCREENING();

    T visitWITHDRAWN();

    T visitUnknown(String unknownType);
  }
}
