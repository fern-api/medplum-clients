package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_restMode {
  public static final Capabilitystatement_restMode SERVER = new Capabilitystatement_restMode(Value.SERVER, "SERVER");

  public static final Capabilitystatement_restMode CLIENT = new Capabilitystatement_restMode(Value.CLIENT, "CLIENT");

  private final Value value;

  private final String string;

  Capabilitystatement_restMode(Value value, String string) {
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
      || (other instanceof Capabilitystatement_restMode && this.string.equals(((Capabilitystatement_restMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SERVER:
        return visitor.visitSERVER();
      case CLIENT:
        return visitor.visitCLIENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Capabilitystatement_restMode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SERVER":
        return SERVER;
      case "CLIENT":
        return CLIENT;
      default:
        return new Capabilitystatement_restMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CLIENT,

    SERVER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCLIENT();

    T visitSERVER();

    T visitUnknown(String unknownType);
  }
}
