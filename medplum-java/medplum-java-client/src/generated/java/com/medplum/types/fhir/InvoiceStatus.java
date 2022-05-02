package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class InvoiceStatus {
  public static final InvoiceStatus ISSUED = new InvoiceStatus(Value.ISSUED, "ISSUED");

  public static final InvoiceStatus BALANCED = new InvoiceStatus(Value.BALANCED, "BALANCED");

  public static final InvoiceStatus DRAFT = new InvoiceStatus(Value.DRAFT, "DRAFT");

  public static final InvoiceStatus CANCELLED = new InvoiceStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  InvoiceStatus(Value value, String string) {
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
      || (other instanceof InvoiceStatus && this.string.equals(((InvoiceStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ISSUED:
        return visitor.visitISSUED();
      case BALANCED:
        return visitor.visitBALANCED();
      case DRAFT:
        return visitor.visitDRAFT();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static InvoiceStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ISSUED":
        return ISSUED;
      case "BALANCED":
        return BALANCED;
      case "DRAFT":
        return DRAFT;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new InvoiceStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DRAFT,

    ISSUED,

    BALANCED,

    CANCELLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDRAFT();

    T visitISSUED();

    T visitBALANCED();

    T visitCANCELLED();

    T visitUnknown(String unknownType);
  }
}
