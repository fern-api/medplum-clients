package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Capabilitystatement_resourceReferencepolicyItem {
  public static final Capabilitystatement_resourceReferencepolicyItem LITERAL = new Capabilitystatement_resourceReferencepolicyItem(Value.LITERAL, "LITERAL");

  public static final Capabilitystatement_resourceReferencepolicyItem LOGICAL = new Capabilitystatement_resourceReferencepolicyItem(Value.LOGICAL, "LOGICAL");

  public static final Capabilitystatement_resourceReferencepolicyItem ENFORCED = new Capabilitystatement_resourceReferencepolicyItem(Value.ENFORCED, "ENFORCED");

  public static final Capabilitystatement_resourceReferencepolicyItem RESOLVES = new Capabilitystatement_resourceReferencepolicyItem(Value.RESOLVES, "RESOLVES");

  public static final Capabilitystatement_resourceReferencepolicyItem LOCAL = new Capabilitystatement_resourceReferencepolicyItem(Value.LOCAL, "LOCAL");

  private final Value value;

  private final String string;

  Capabilitystatement_resourceReferencepolicyItem(Value value, String string) {
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
      || (other instanceof Capabilitystatement_resourceReferencepolicyItem && this.string.equals(((Capabilitystatement_resourceReferencepolicyItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LITERAL:
        return visitor.visitLITERAL();
      case LOGICAL:
        return visitor.visitLOGICAL();
      case ENFORCED:
        return visitor.visitENFORCED();
      case RESOLVES:
        return visitor.visitRESOLVES();
      case LOCAL:
        return visitor.visitLOCAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Capabilitystatement_resourceReferencepolicyItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LITERAL":
        return LITERAL;
      case "LOGICAL":
        return LOGICAL;
      case "ENFORCED":
        return ENFORCED;
      case "RESOLVES":
        return RESOLVES;
      case "LOCAL":
        return LOCAL;
      default:
        return new Capabilitystatement_resourceReferencepolicyItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    LITERAL,

    LOGICAL,

    RESOLVES,

    ENFORCED,

    LOCAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitLITERAL();

    T visitLOGICAL();

    T visitRESOLVES();

    T visitENFORCED();

    T visitLOCAL();

    T visitUnknown(String unknownType);
  }
}
