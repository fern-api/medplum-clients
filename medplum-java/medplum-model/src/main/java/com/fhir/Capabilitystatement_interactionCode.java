package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_interactionCode {
  public static final Capabilitystatement_interactionCode CREATE = new Capabilitystatement_interactionCode(Value.CREATE, "CREATE");

  public static final Capabilitystatement_interactionCode UPDATE = new Capabilitystatement_interactionCode(Value.UPDATE, "UPDATE");

  public static final Capabilitystatement_interactionCode PATCH = new Capabilitystatement_interactionCode(Value.PATCH, "PATCH");

  public static final Capabilitystatement_interactionCode DELETE = new Capabilitystatement_interactionCode(Value.DELETE, "DELETE");

  public static final Capabilitystatement_interactionCode READ = new Capabilitystatement_interactionCode(Value.READ, "READ");

  public static final Capabilitystatement_interactionCode VREAD = new Capabilitystatement_interactionCode(Value.VREAD, "VREAD");

  private final Value value;

  private final String string;

  Capabilitystatement_interactionCode(Value value, String string) {
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
      || (other instanceof Capabilitystatement_interactionCode && this.string.equals(((Capabilitystatement_interactionCode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case CREATE:
        return visitor.visitCREATE();
      case UPDATE:
        return visitor.visitUPDATE();
      case PATCH:
        return visitor.visitPATCH();
      case DELETE:
        return visitor.visitDELETE();
      case READ:
        return visitor.visitREAD();
      case VREAD:
        return visitor.visitVREAD();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Capabilitystatement_interactionCode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CREATE":
        return CREATE;
      case "UPDATE":
        return UPDATE;
      case "PATCH":
        return PATCH;
      case "DELETE":
        return DELETE;
      case "READ":
        return READ;
      case "VREAD":
        return VREAD;
      default:
        return new Capabilitystatement_interactionCode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    READ,

    VREAD,

    UPDATE,

    PATCH,

    DELETE,

    CREATE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREAD();

    T visitVREAD();

    T visitUPDATE();

    T visitPATCH();

    T visitDELETE();

    T visitCREATE();

    T visitUnknown(String unknownType);
  }
}
