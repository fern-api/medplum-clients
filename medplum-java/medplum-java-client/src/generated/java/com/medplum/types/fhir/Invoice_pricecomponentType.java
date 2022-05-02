package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Invoice_pricecomponentType {
  public static final Invoice_pricecomponentType DISCOUNT = new Invoice_pricecomponentType(Value.DISCOUNT, "DISCOUNT");

  public static final Invoice_pricecomponentType DEDUCTION = new Invoice_pricecomponentType(Value.DEDUCTION, "DEDUCTION");

  public static final Invoice_pricecomponentType INFORMATIONAL = new Invoice_pricecomponentType(Value.INFORMATIONAL, "INFORMATIONAL");

  public static final Invoice_pricecomponentType TAX = new Invoice_pricecomponentType(Value.TAX, "TAX");

  public static final Invoice_pricecomponentType BASE = new Invoice_pricecomponentType(Value.BASE, "BASE");

  public static final Invoice_pricecomponentType SURCHARGE = new Invoice_pricecomponentType(Value.SURCHARGE, "SURCHARGE");

  private final Value value;

  private final String string;

  Invoice_pricecomponentType(Value value, String string) {
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
      || (other instanceof Invoice_pricecomponentType && this.string.equals(((Invoice_pricecomponentType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DISCOUNT:
        return visitor.visitDISCOUNT();
      case DEDUCTION:
        return visitor.visitDEDUCTION();
      case INFORMATIONAL:
        return visitor.visitINFORMATIONAL();
      case TAX:
        return visitor.visitTAX();
      case BASE:
        return visitor.visitBASE();
      case SURCHARGE:
        return visitor.visitSURCHARGE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Invoice_pricecomponentType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DISCOUNT":
        return DISCOUNT;
      case "DEDUCTION":
        return DEDUCTION;
      case "INFORMATIONAL":
        return INFORMATIONAL;
      case "TAX":
        return TAX;
      case "BASE":
        return BASE;
      case "SURCHARGE":
        return SURCHARGE;
      default:
        return new Invoice_pricecomponentType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BASE,

    SURCHARGE,

    DEDUCTION,

    DISCOUNT,

    TAX,

    INFORMATIONAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBASE();

    T visitSURCHARGE();

    T visitDEDUCTION();

    T visitDISCOUNT();

    T visitTAX();

    T visitINFORMATIONAL();

    T visitUnknown(String unknownType);
  }
}
