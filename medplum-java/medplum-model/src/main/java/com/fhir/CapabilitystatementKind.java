package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class CapabilitystatementKind {
  public static final CapabilitystatementKind CAPABILITY = new CapabilitystatementKind(Value.CAPABILITY, "CAPABILITY");

  public static final CapabilitystatementKind INSTANCE = new CapabilitystatementKind(Value.INSTANCE, "INSTANCE");

  public static final CapabilitystatementKind REQUIREMENTS = new CapabilitystatementKind(Value.REQUIREMENTS, "REQUIREMENTS");

  private final Value value;

  private final String string;

  CapabilitystatementKind(Value value, String string) {
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
      || (other instanceof CapabilitystatementKind && this.string.equals(((CapabilitystatementKind) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case CAPABILITY:
        return visitor.visitCAPABILITY();
      case INSTANCE:
        return visitor.visitINSTANCE();
      case REQUIREMENTS:
        return visitor.visitREQUIREMENTS();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static CapabilitystatementKind valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CAPABILITY":
        return CAPABILITY;
      case "INSTANCE":
        return INSTANCE;
      case "REQUIREMENTS":
        return REQUIREMENTS;
      default:
        return new CapabilitystatementKind(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INSTANCE,

    CAPABILITY,

    REQUIREMENTS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitINSTANCE();

    T visitCAPABILITY();

    T visitREQUIREMENTS();

    T visitUnknown(String unknownType);
  }
}
