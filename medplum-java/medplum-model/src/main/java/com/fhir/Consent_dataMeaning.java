package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Consent_dataMeaning {
  public static final Consent_dataMeaning RELATED = new Consent_dataMeaning(Value.RELATED, "RELATED");

  public static final Consent_dataMeaning AUTHOREDBY = new Consent_dataMeaning(Value.AUTHOREDBY, "AUTHOREDBY");

  public static final Consent_dataMeaning DEPENDENTS = new Consent_dataMeaning(Value.DEPENDENTS, "DEPENDENTS");

  public static final Consent_dataMeaning INSTANCE = new Consent_dataMeaning(Value.INSTANCE, "INSTANCE");

  private final Value value;

  private final String string;

  Consent_dataMeaning(Value value, String string) {
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
      || (other instanceof Consent_dataMeaning && this.string.equals(((Consent_dataMeaning) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case RELATED:
        return visitor.visitRELATED();
      case AUTHOREDBY:
        return visitor.visitAUTHOREDBY();
      case DEPENDENTS:
        return visitor.visitDEPENDENTS();
      case INSTANCE:
        return visitor.visitINSTANCE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Consent_dataMeaning valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "RELATED":
        return RELATED;
      case "AUTHOREDBY":
        return AUTHOREDBY;
      case "DEPENDENTS":
        return DEPENDENTS;
      case "INSTANCE":
        return INSTANCE;
      default:
        return new Consent_dataMeaning(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INSTANCE,

    RELATED,

    DEPENDENTS,

    AUTHOREDBY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitINSTANCE();

    T visitRELATED();

    T visitDEPENDENTS();

    T visitAUTHOREDBY();

    T visitUnknown(String unknownType);
  }
}
