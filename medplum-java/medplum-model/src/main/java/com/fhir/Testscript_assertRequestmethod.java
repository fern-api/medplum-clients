package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Testscript_assertRequestmethod {
  public static final Testscript_assertRequestmethod GET = new Testscript_assertRequestmethod(Value.GET, "GET");

  public static final Testscript_assertRequestmethod DELETE = new Testscript_assertRequestmethod(Value.DELETE, "DELETE");

  public static final Testscript_assertRequestmethod PATCH = new Testscript_assertRequestmethod(Value.PATCH, "PATCH");

  public static final Testscript_assertRequestmethod OPTIONS = new Testscript_assertRequestmethod(Value.OPTIONS, "OPTIONS");

  public static final Testscript_assertRequestmethod POST = new Testscript_assertRequestmethod(Value.POST, "POST");

  public static final Testscript_assertRequestmethod PUT = new Testscript_assertRequestmethod(Value.PUT, "PUT");

  public static final Testscript_assertRequestmethod HEAD = new Testscript_assertRequestmethod(Value.HEAD, "HEAD");

  private final Value value;

  private final String string;

  Testscript_assertRequestmethod(Value value, String string) {
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
      || (other instanceof Testscript_assertRequestmethod && this.string.equals(((Testscript_assertRequestmethod) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case GET:
        return visitor.visitGET();
      case DELETE:
        return visitor.visitDELETE();
      case PATCH:
        return visitor.visitPATCH();
      case OPTIONS:
        return visitor.visitOPTIONS();
      case POST:
        return visitor.visitPOST();
      case PUT:
        return visitor.visitPUT();
      case HEAD:
        return visitor.visitHEAD();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Testscript_assertRequestmethod valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "GET":
        return GET;
      case "DELETE":
        return DELETE;
      case "PATCH":
        return PATCH;
      case "OPTIONS":
        return OPTIONS;
      case "POST":
        return POST;
      case "PUT":
        return PUT;
      case "HEAD":
        return HEAD;
      default:
        return new Testscript_assertRequestmethod(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DELETE,

    GET,

    OPTIONS,

    PATCH,

    POST,

    PUT,

    HEAD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDELETE();

    T visitGET();

    T visitOPTIONS();

    T visitPATCH();

    T visitPOST();

    T visitPUT();

    T visitHEAD();

    T visitUnknown(String unknownType);
  }
}
