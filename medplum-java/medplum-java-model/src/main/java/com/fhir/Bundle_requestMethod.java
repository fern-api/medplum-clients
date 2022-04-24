package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Bundle_requestMethod {
  public static final Bundle_requestMethod GET = new Bundle_requestMethod(Value.GET, "GET");

  public static final Bundle_requestMethod DELETE = new Bundle_requestMethod(Value.DELETE, "DELETE");

  public static final Bundle_requestMethod PATCH = new Bundle_requestMethod(Value.PATCH, "PATCH");

  public static final Bundle_requestMethod POST = new Bundle_requestMethod(Value.POST, "POST");

  public static final Bundle_requestMethod HEAD = new Bundle_requestMethod(Value.HEAD, "HEAD");

  public static final Bundle_requestMethod PUT = new Bundle_requestMethod(Value.PUT, "PUT");

  private final Value value;

  private final String string;

  Bundle_requestMethod(Value value, String string) {
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
      || (other instanceof Bundle_requestMethod && this.string.equals(((Bundle_requestMethod) other).string));
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
      case POST:
        return visitor.visitPOST();
      case HEAD:
        return visitor.visitHEAD();
      case PUT:
        return visitor.visitPUT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Bundle_requestMethod valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "GET":
        return GET;
      case "DELETE":
        return DELETE;
      case "PATCH":
        return PATCH;
      case "POST":
        return POST;
      case "HEAD":
        return HEAD;
      case "PUT":
        return PUT;
      default:
        return new Bundle_requestMethod(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    GET,

    HEAD,

    POST,

    PUT,

    DELETE,

    PATCH,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitGET();

    T visitHEAD();

    T visitPOST();

    T visitPUT();

    T visitDELETE();

    T visitPATCH();

    T visitUnknown(String unknownType);
  }
}
