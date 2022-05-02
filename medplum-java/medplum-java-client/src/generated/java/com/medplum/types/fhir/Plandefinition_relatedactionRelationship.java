package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Plandefinition_relatedactionRelationship {
  public static final Plandefinition_relatedactionRelationship BEFORE = new Plandefinition_relatedactionRelationship(Value.BEFORE, "BEFORE");

  public static final Plandefinition_relatedactionRelationship CONCURRENT = new Plandefinition_relatedactionRelationship(Value.CONCURRENT, "CONCURRENT");

  public static final Plandefinition_relatedactionRelationship AFTER = new Plandefinition_relatedactionRelationship(Value.AFTER, "AFTER");

  private final Value value;

  private final String string;

  Plandefinition_relatedactionRelationship(Value value, String string) {
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
      || (other instanceof Plandefinition_relatedactionRelationship && this.string.equals(((Plandefinition_relatedactionRelationship) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case BEFORE:
        return visitor.visitBEFORE();
      case CONCURRENT:
        return visitor.visitCONCURRENT();
      case AFTER:
        return visitor.visitAFTER();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Plandefinition_relatedactionRelationship valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "BEFORE":
        return BEFORE;
      case "CONCURRENT":
        return CONCURRENT;
      case "AFTER":
        return AFTER;
      default:
        return new Plandefinition_relatedactionRelationship(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BEFORE,

    CONCURRENT,

    AFTER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBEFORE();

    T visitCONCURRENT();

    T visitAFTER();

    T visitUnknown(String unknownType);
  }
}
