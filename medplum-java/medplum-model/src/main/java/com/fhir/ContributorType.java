package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ContributorType {
  public static final ContributorType REVIEWER = new ContributorType(Value.REVIEWER, "REVIEWER");

  public static final ContributorType AUTHOR = new ContributorType(Value.AUTHOR, "AUTHOR");

  public static final ContributorType EDITOR = new ContributorType(Value.EDITOR, "EDITOR");

  public static final ContributorType ENDORSER = new ContributorType(Value.ENDORSER, "ENDORSER");

  private final Value value;

  private final String string;

  ContributorType(Value value, String string) {
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
      || (other instanceof ContributorType && this.string.equals(((ContributorType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case REVIEWER:
        return visitor.visitREVIEWER();
      case AUTHOR:
        return visitor.visitAUTHOR();
      case EDITOR:
        return visitor.visitEDITOR();
      case ENDORSER:
        return visitor.visitENDORSER();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ContributorType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "REVIEWER":
        return REVIEWER;
      case "AUTHOR":
        return AUTHOR;
      case "EDITOR":
        return EDITOR;
      case "ENDORSER":
        return ENDORSER;
      default:
        return new ContributorType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AUTHOR,

    EDITOR,

    REVIEWER,

    ENDORSER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAUTHOR();

    T visitEDITOR();

    T visitREVIEWER();

    T visitENDORSER();

    T visitUnknown(String unknownType);
  }
}
