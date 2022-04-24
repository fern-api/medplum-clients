package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Valueset_filterOp {
  public static final Valueset_filterOp REGEX = new Valueset_filterOp(Value.REGEX, "REGEX");

  public static final Valueset_filterOp IN = new Valueset_filterOp(Value.IN, "IN");

  public static final Valueset_filterOp EXISTS = new Valueset_filterOp(Value.EXISTS, "EXISTS");

  public static final Valueset_filterOp GENERALIZES = new Valueset_filterOp(Value.GENERALIZES, "GENERALIZES");

  private final Value value;

  private final String string;

  Valueset_filterOp(Value value, String string) {
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
      || (other instanceof Valueset_filterOp && this.string.equals(((Valueset_filterOp) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case REGEX:
        return visitor.visitREGEX();
      case IN:
        return visitor.visitIN();
      case EXISTS:
        return visitor.visitEXISTS();
      case GENERALIZES:
        return visitor.visitGENERALIZES();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Valueset_filterOp valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "REGEX":
        return REGEX;
      case "IN":
        return IN;
      case "EXISTS":
        return EXISTS;
      case "GENERALIZES":
        return GENERALIZES;
      default:
        return new Valueset_filterOp(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REGEX,

    IN,

    GENERALIZES,

    EXISTS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREGEX();

    T visitIN();

    T visitGENERALIZES();

    T visitEXISTS();

    T visitUnknown(String unknownType);
  }
}
