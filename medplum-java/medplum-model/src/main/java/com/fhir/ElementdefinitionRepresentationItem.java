package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class ElementdefinitionRepresentationItem {
  public static final ElementdefinitionRepresentationItem XMLTEXT = new ElementdefinitionRepresentationItem(Value.XMLTEXT, "XMLTEXT");

  public static final ElementdefinitionRepresentationItem TYPEATTR = new ElementdefinitionRepresentationItem(Value.TYPEATTR, "TYPEATTR");

  public static final ElementdefinitionRepresentationItem XHTML = new ElementdefinitionRepresentationItem(Value.XHTML, "XHTML");

  public static final ElementdefinitionRepresentationItem XMLATTR = new ElementdefinitionRepresentationItem(Value.XMLATTR, "XMLATTR");

  public static final ElementdefinitionRepresentationItem CDATEXT = new ElementdefinitionRepresentationItem(Value.CDATEXT, "CDATEXT");

  private final Value value;

  private final String string;

  ElementdefinitionRepresentationItem(Value value, String string) {
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
      || (other instanceof ElementdefinitionRepresentationItem && this.string.equals(((ElementdefinitionRepresentationItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case XMLTEXT:
        return visitor.visitXMLTEXT();
      case TYPEATTR:
        return visitor.visitTYPEATTR();
      case XHTML:
        return visitor.visitXHTML();
      case XMLATTR:
        return visitor.visitXMLATTR();
      case CDATEXT:
        return visitor.visitCDATEXT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ElementdefinitionRepresentationItem valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "XMLTEXT":
        return XMLTEXT;
      case "TYPEATTR":
        return TYPEATTR;
      case "XHTML":
        return XHTML;
      case "XMLATTR":
        return XMLATTR;
      case "CDATEXT":
        return CDATEXT;
      default:
        return new ElementdefinitionRepresentationItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    XMLATTR,

    XMLTEXT,

    TYPEATTR,

    CDATEXT,

    XHTML,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitXMLATTR();

    T visitXMLTEXT();

    T visitTYPEATTR();

    T visitCDATEXT();

    T visitXHTML();

    T visitUnknown(String unknownType);
  }
}
