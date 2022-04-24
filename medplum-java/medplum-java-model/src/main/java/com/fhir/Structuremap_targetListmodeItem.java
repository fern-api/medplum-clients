package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuremap_targetListmodeItem {
  public static final Structuremap_targetListmodeItem FIRST = new Structuremap_targetListmodeItem(Value.FIRST, "FIRST");

  public static final Structuremap_targetListmodeItem LAST = new Structuremap_targetListmodeItem(Value.LAST, "LAST");

  public static final Structuremap_targetListmodeItem COLLATE = new Structuremap_targetListmodeItem(Value.COLLATE, "COLLATE");

  public static final Structuremap_targetListmodeItem SHARE = new Structuremap_targetListmodeItem(Value.SHARE, "SHARE");

  private final Value value;

  private final String string;

  Structuremap_targetListmodeItem(Value value, String string) {
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
      || (other instanceof Structuremap_targetListmodeItem && this.string.equals(((Structuremap_targetListmodeItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case FIRST:
        return visitor.visitFIRST();
      case LAST:
        return visitor.visitLAST();
      case COLLATE:
        return visitor.visitCOLLATE();
      case SHARE:
        return visitor.visitSHARE();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Structuremap_targetListmodeItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FIRST":
        return FIRST;
      case "LAST":
        return LAST;
      case "COLLATE":
        return COLLATE;
      case "SHARE":
        return SHARE;
      default:
        return new Structuremap_targetListmodeItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FIRST,

    SHARE,

    LAST,

    COLLATE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFIRST();

    T visitSHARE();

    T visitLAST();

    T visitCOLLATE();

    T visitUnknown(String unknownType);
  }
}
