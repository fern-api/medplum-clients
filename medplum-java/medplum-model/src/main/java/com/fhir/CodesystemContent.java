package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CodesystemContent {
  public static final CodesystemContent EXAMPLE = new CodesystemContent(Value.EXAMPLE, "EXAMPLE");

  public static final CodesystemContent FRAGMENT = new CodesystemContent(Value.FRAGMENT, "FRAGMENT");

  public static final CodesystemContent COMPLETE = new CodesystemContent(Value.COMPLETE, "COMPLETE");

  public static final CodesystemContent SUPPLEMENT = new CodesystemContent(Value.SUPPLEMENT, "SUPPLEMENT");

  private final Value value;

  private final String string;

  CodesystemContent(Value value, String string) {
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
      || (other instanceof CodesystemContent && this.string.equals(((CodesystemContent) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case EXAMPLE:
        return visitor.visitEXAMPLE();
      case FRAGMENT:
        return visitor.visitFRAGMENT();
      case COMPLETE:
        return visitor.visitCOMPLETE();
      case SUPPLEMENT:
        return visitor.visitSUPPLEMENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CodesystemContent valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EXAMPLE":
        return EXAMPLE;
      case "FRAGMENT":
        return FRAGMENT;
      case "COMPLETE":
        return COMPLETE;
      case "SUPPLEMENT":
        return SUPPLEMENT;
      default:
        return new CodesystemContent(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    EXAMPLE,

    FRAGMENT,

    COMPLETE,

    SUPPLEMENT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEXAMPLE();

    T visitFRAGMENT();

    T visitCOMPLETE();

    T visitSUPPLEMENT();

    T visitUnknown(String unknownType);
  }
}
