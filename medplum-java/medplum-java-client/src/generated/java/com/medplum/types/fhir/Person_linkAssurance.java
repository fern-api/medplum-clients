package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Person_linkAssurance {
  public static final Person_linkAssurance LEVEL3 = new Person_linkAssurance(Value.LEVEL3, "LEVEL3");

  public static final Person_linkAssurance LEVEL4 = new Person_linkAssurance(Value.LEVEL4, "LEVEL4");

  public static final Person_linkAssurance LEVEL1 = new Person_linkAssurance(Value.LEVEL1, "LEVEL1");

  public static final Person_linkAssurance LEVEL2 = new Person_linkAssurance(Value.LEVEL2, "LEVEL2");

  private final Value value;

  private final String string;

  Person_linkAssurance(Value value, String string) {
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
      || (other instanceof Person_linkAssurance && this.string.equals(((Person_linkAssurance) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LEVEL3:
        return visitor.visitLEVEL3();
      case LEVEL4:
        return visitor.visitLEVEL4();
      case LEVEL1:
        return visitor.visitLEVEL1();
      case LEVEL2:
        return visitor.visitLEVEL2();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Person_linkAssurance valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LEVEL3":
        return LEVEL3;
      case "LEVEL4":
        return LEVEL4;
      case "LEVEL1":
        return LEVEL1;
      case "LEVEL2":
        return LEVEL2;
      default:
        return new Person_linkAssurance(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    LEVEL1,

    LEVEL2,

    LEVEL3,

    LEVEL4,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitLEVEL1();

    T visitLEVEL2();

    T visitLEVEL3();

    T visitLEVEL4();

    T visitUnknown(String unknownType);
  }
}
