package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Provenance_entityRole {
  public static final Provenance_entityRole QUOTATION = new Provenance_entityRole(Value.QUOTATION, "QUOTATION");

  public static final Provenance_entityRole REVISION = new Provenance_entityRole(Value.REVISION, "REVISION");

  public static final Provenance_entityRole REMOVAL = new Provenance_entityRole(Value.REMOVAL, "REMOVAL");

  public static final Provenance_entityRole DERIVATION = new Provenance_entityRole(Value.DERIVATION, "DERIVATION");

  public static final Provenance_entityRole SOURCE = new Provenance_entityRole(Value.SOURCE, "SOURCE");

  private final Value value;

  private final String string;

  Provenance_entityRole(Value value, String string) {
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
      || (other instanceof Provenance_entityRole && this.string.equals(((Provenance_entityRole) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case QUOTATION:
        return visitor.visitQUOTATION();
      case REVISION:
        return visitor.visitREVISION();
      case REMOVAL:
        return visitor.visitREMOVAL();
      case DERIVATION:
        return visitor.visitDERIVATION();
      case SOURCE:
        return visitor.visitSOURCE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Provenance_entityRole valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "QUOTATION":
        return QUOTATION;
      case "REVISION":
        return REVISION;
      case "REMOVAL":
        return REMOVAL;
      case "DERIVATION":
        return DERIVATION;
      case "SOURCE":
        return SOURCE;
      default:
        return new Provenance_entityRole(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DERIVATION,

    REVISION,

    QUOTATION,

    SOURCE,

    REMOVAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDERIVATION();

    T visitREVISION();

    T visitQUOTATION();

    T visitSOURCE();

    T visitREMOVAL();

    T visitUnknown(String unknownType);
  }
}
