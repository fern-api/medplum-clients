package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class SearchparameterXpathusage {
  public static final SearchparameterXpathusage PHONETIC = new SearchparameterXpathusage(Value.PHONETIC, "PHONETIC");

  public static final SearchparameterXpathusage NEARBY = new SearchparameterXpathusage(Value.NEARBY, "NEARBY");

  public static final SearchparameterXpathusage DISTANCE = new SearchparameterXpathusage(Value.DISTANCE, "DISTANCE");

  public static final SearchparameterXpathusage OTHER = new SearchparameterXpathusage(Value.OTHER, "OTHER");

  public static final SearchparameterXpathusage NORMAL = new SearchparameterXpathusage(Value.NORMAL, "NORMAL");

  private final Value value;

  private final String string;

  SearchparameterXpathusage(Value value, String string) {
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
      || (other instanceof SearchparameterXpathusage && this.string.equals(((SearchparameterXpathusage) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case PHONETIC:
        return visitor.visitPHONETIC();
      case NEARBY:
        return visitor.visitNEARBY();
      case DISTANCE:
        return visitor.visitDISTANCE();
      case OTHER:
        return visitor.visitOTHER();
      case NORMAL:
        return visitor.visitNORMAL();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SearchparameterXpathusage valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PHONETIC":
        return PHONETIC;
      case "NEARBY":
        return NEARBY;
      case "DISTANCE":
        return DISTANCE;
      case "OTHER":
        return OTHER;
      case "NORMAL":
        return NORMAL;
      default:
        return new SearchparameterXpathusage(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NORMAL,

    PHONETIC,

    NEARBY,

    DISTANCE,

    OTHER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNORMAL();

    T visitPHONETIC();

    T visitNEARBY();

    T visitDISTANCE();

    T visitOTHER();

    T visitUnknown(String unknownType);
  }
}
