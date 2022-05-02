package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class NamingsystemKind {
  public static final NamingsystemKind IDENTIFIER = new NamingsystemKind(Value.IDENTIFIER, "IDENTIFIER");

  public static final NamingsystemKind ROOT = new NamingsystemKind(Value.ROOT, "ROOT");

  public static final NamingsystemKind CODESYSTEM = new NamingsystemKind(Value.CODESYSTEM, "CODESYSTEM");

  private final Value value;

  private final String string;

  NamingsystemKind(Value value, String string) {
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
      || (other instanceof NamingsystemKind && this.string.equals(((NamingsystemKind) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case IDENTIFIER:
        return visitor.visitIDENTIFIER();
      case ROOT:
        return visitor.visitROOT();
      case CODESYSTEM:
        return visitor.visitCODESYSTEM();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static NamingsystemKind valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "IDENTIFIER":
        return IDENTIFIER;
      case "ROOT":
        return ROOT;
      case "CODESYSTEM":
        return CODESYSTEM;
      default:
        return new NamingsystemKind(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CODESYSTEM,

    IDENTIFIER,

    ROOT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCODESYSTEM();

    T visitIDENTIFIER();

    T visitROOT();

    T visitUnknown(String unknownType);
  }
}
