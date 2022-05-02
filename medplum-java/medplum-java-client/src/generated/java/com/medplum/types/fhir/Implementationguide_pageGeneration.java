package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Implementationguide_pageGeneration {
  public static final Implementationguide_pageGeneration MARKDOWN = new Implementationguide_pageGeneration(Value.MARKDOWN, "MARKDOWN");

  public static final Implementationguide_pageGeneration XML = new Implementationguide_pageGeneration(Value.XML, "XML");

  public static final Implementationguide_pageGeneration GENERATED = new Implementationguide_pageGeneration(Value.GENERATED, "GENERATED");

  public static final Implementationguide_pageGeneration HTML = new Implementationguide_pageGeneration(Value.HTML, "HTML");

  private final Value value;

  private final String string;

  Implementationguide_pageGeneration(Value value, String string) {
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
      || (other instanceof Implementationguide_pageGeneration && this.string.equals(((Implementationguide_pageGeneration) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case MARKDOWN:
        return visitor.visitMARKDOWN();
      case XML:
        return visitor.visitXML();
      case GENERATED:
        return visitor.visitGENERATED();
      case HTML:
        return visitor.visitHTML();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Implementationguide_pageGeneration valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MARKDOWN":
        return MARKDOWN;
      case "XML":
        return XML;
      case "GENERATED":
        return GENERATED;
      case "HTML":
        return HTML;
      default:
        return new Implementationguide_pageGeneration(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    HTML,

    MARKDOWN,

    XML,

    GENERATED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitHTML();

    T visitMARKDOWN();

    T visitXML();

    T visitGENERATED();

    T visitUnknown(String unknownType);
  }
}
