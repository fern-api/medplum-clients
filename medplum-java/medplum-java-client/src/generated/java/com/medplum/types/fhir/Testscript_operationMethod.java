package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Testscript_operationMethod {
  public static final Testscript_operationMethod GET = new Testscript_operationMethod(Value.GET, "GET");

  public static final Testscript_operationMethod DELETE = new Testscript_operationMethod(Value.DELETE, "DELETE");

  public static final Testscript_operationMethod PATCH = new Testscript_operationMethod(Value.PATCH, "PATCH");

  public static final Testscript_operationMethod OPTIONS = new Testscript_operationMethod(Value.OPTIONS, "OPTIONS");

  public static final Testscript_operationMethod POST = new Testscript_operationMethod(Value.POST, "POST");

  public static final Testscript_operationMethod PUT = new Testscript_operationMethod(Value.PUT, "PUT");

  public static final Testscript_operationMethod HEAD = new Testscript_operationMethod(Value.HEAD, "HEAD");

  private final Value value;

  private final String string;

  Testscript_operationMethod(Value value, String string) {
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
      || (other instanceof Testscript_operationMethod && this.string.equals(((Testscript_operationMethod) other).string));
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
  public static Testscript_operationMethod valueOf(@Nonnull String value) {
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
        return new Testscript_operationMethod(Value.UNKNOWN, upperCasedValue);
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
