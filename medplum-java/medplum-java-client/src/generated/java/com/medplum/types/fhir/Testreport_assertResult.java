package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Testreport_assertResult {
  public static final Testreport_assertResult ERROR = new Testreport_assertResult(Value.ERROR, "ERROR");

  public static final Testreport_assertResult SKIP = new Testreport_assertResult(Value.SKIP, "SKIP");

  public static final Testreport_assertResult PASS = new Testreport_assertResult(Value.PASS, "PASS");

  public static final Testreport_assertResult FAIL = new Testreport_assertResult(Value.FAIL, "FAIL");

  public static final Testreport_assertResult WARNING = new Testreport_assertResult(Value.WARNING, "WARNING");

  private final Value value;

  private final String string;

  Testreport_assertResult(Value value, String string) {
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
      || (other instanceof Testreport_assertResult && this.string.equals(((Testreport_assertResult) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ERROR:
        return visitor.visitERROR();
      case SKIP:
        return visitor.visitSKIP();
      case PASS:
        return visitor.visitPASS();
      case FAIL:
        return visitor.visitFAIL();
      case WARNING:
        return visitor.visitWARNING();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Testreport_assertResult valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ERROR":
        return ERROR;
      case "SKIP":
        return SKIP;
      case "PASS":
        return PASS;
      case "FAIL":
        return FAIL;
      case "WARNING":
        return WARNING;
      default:
        return new Testreport_assertResult(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PASS,

    SKIP,

    FAIL,

    WARNING,

    ERROR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPASS();

    T visitSKIP();

    T visitFAIL();

    T visitWARNING();

    T visitERROR();

    T visitUnknown(String unknownType);
  }
}
