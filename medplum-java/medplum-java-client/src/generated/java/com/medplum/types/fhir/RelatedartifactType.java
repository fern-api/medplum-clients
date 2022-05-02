package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class RelatedartifactType {
  public static final RelatedartifactType PREDECESSOR = new RelatedartifactType(Value.PREDECESSOR, "PREDECESSOR");

  public static final RelatedartifactType JUSTIFICATION = new RelatedartifactType(Value.JUSTIFICATION, "JUSTIFICATION");

  public static final RelatedartifactType DOCUMENTATION = new RelatedartifactType(Value.DOCUMENTATION, "DOCUMENTATION");

  public static final RelatedartifactType CITATION = new RelatedartifactType(Value.CITATION, "CITATION");

  public static final RelatedartifactType SUCCESSOR = new RelatedartifactType(Value.SUCCESSOR, "SUCCESSOR");

  private final Value value;

  private final String string;

  RelatedartifactType(Value value, String string) {
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
      || (other instanceof RelatedartifactType && this.string.equals(((RelatedartifactType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PREDECESSOR:
        return visitor.visitPREDECESSOR();
      case JUSTIFICATION:
        return visitor.visitJUSTIFICATION();
      case DOCUMENTATION:
        return visitor.visitDOCUMENTATION();
      case CITATION:
        return visitor.visitCITATION();
      case SUCCESSOR:
        return visitor.visitSUCCESSOR();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static RelatedartifactType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PREDECESSOR":
        return PREDECESSOR;
      case "JUSTIFICATION":
        return JUSTIFICATION;
      case "DOCUMENTATION":
        return DOCUMENTATION;
      case "CITATION":
        return CITATION;
      case "SUCCESSOR":
        return SUCCESSOR;
      default:
        return new RelatedartifactType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DOCUMENTATION,

    JUSTIFICATION,

    CITATION,

    PREDECESSOR,

    SUCCESSOR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDOCUMENTATION();

    T visitJUSTIFICATION();

    T visitCITATION();

    T visitPREDECESSOR();

    T visitSUCCESSOR();

    T visitUnknown(String unknownType);
  }
}
