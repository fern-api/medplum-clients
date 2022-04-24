package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Linkage_itemType {
  public static final Linkage_itemType HISTORICAL = new Linkage_itemType(Value.HISTORICAL, "HISTORICAL");

  public static final Linkage_itemType ALTERNATE = new Linkage_itemType(Value.ALTERNATE, "ALTERNATE");

  public static final Linkage_itemType SOURCE = new Linkage_itemType(Value.SOURCE, "SOURCE");

  private final Value value;

  private final String string;

  Linkage_itemType(Value value, String string) {
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
      || (other instanceof Linkage_itemType && this.string.equals(((Linkage_itemType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case HISTORICAL:
        return visitor.visitHISTORICAL();
      case ALTERNATE:
        return visitor.visitALTERNATE();
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
  public static Linkage_itemType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "HISTORICAL":
        return HISTORICAL;
      case "ALTERNATE":
        return ALTERNATE;
      case "SOURCE":
        return SOURCE;
      default:
        return new Linkage_itemType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SOURCE,

    ALTERNATE,

    HISTORICAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSOURCE();

    T visitALTERNATE();

    T visitHISTORICAL();

    T visitUnknown(String unknownType);
  }
}
