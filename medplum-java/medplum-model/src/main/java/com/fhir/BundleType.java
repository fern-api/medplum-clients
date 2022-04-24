package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class BundleType {
  public static final BundleType SEARCHSET = new BundleType(Value.SEARCHSET, "SEARCHSET");

  public static final BundleType MESSAGE = new BundleType(Value.MESSAGE, "MESSAGE");

  public static final BundleType BATCH = new BundleType(Value.BATCH, "BATCH");

  public static final BundleType COLLECTION = new BundleType(Value.COLLECTION, "COLLECTION");

  public static final BundleType DOCUMENT = new BundleType(Value.DOCUMENT, "DOCUMENT");

  public static final BundleType HISTORY = new BundleType(Value.HISTORY, "HISTORY");

  public static final BundleType TRANSACTION = new BundleType(Value.TRANSACTION, "TRANSACTION");

  private final Value value;

  private final String string;

  BundleType(Value value, String string) {
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
      || (other instanceof BundleType && this.string.equals(((BundleType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case SEARCHSET:
        return visitor.visitSEARCHSET();
      case MESSAGE:
        return visitor.visitMESSAGE();
      case BATCH:
        return visitor.visitBATCH();
      case COLLECTION:
        return visitor.visitCOLLECTION();
      case DOCUMENT:
        return visitor.visitDOCUMENT();
      case HISTORY:
        return visitor.visitHISTORY();
      case TRANSACTION:
        return visitor.visitTRANSACTION();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static BundleType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "SEARCHSET":
        return SEARCHSET;
      case "MESSAGE":
        return MESSAGE;
      case "BATCH":
        return BATCH;
      case "COLLECTION":
        return COLLECTION;
      case "DOCUMENT":
        return DOCUMENT;
      case "HISTORY":
        return HISTORY;
      case "TRANSACTION":
        return TRANSACTION;
      default:
        return new BundleType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DOCUMENT,

    MESSAGE,

    TRANSACTION,

    BATCH,

    HISTORY,

    SEARCHSET,

    COLLECTION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDOCUMENT();

    T visitMESSAGE();

    T visitTRANSACTION();

    T visitBATCH();

    T visitHISTORY();

    T visitSEARCHSET();

    T visitCOLLECTION();

    T visitUnknown(String unknownType);
  }
}
