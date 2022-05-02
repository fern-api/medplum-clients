package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Molecularsequence_repositoryType {
  public static final Molecularsequence_repositoryType LOGIN = new Molecularsequence_repositoryType(Value.LOGIN, "LOGIN");

  public static final Molecularsequence_repositoryType OTHER = new Molecularsequence_repositoryType(Value.OTHER, "OTHER");

  public static final Molecularsequence_repositoryType DIRECTLINK = new Molecularsequence_repositoryType(Value.DIRECTLINK, "DIRECTLINK");

  public static final Molecularsequence_repositoryType OAUTH = new Molecularsequence_repositoryType(Value.OAUTH, "OAUTH");

  public static final Molecularsequence_repositoryType OPENAPI = new Molecularsequence_repositoryType(Value.OPENAPI, "OPENAPI");

  private final Value value;

  private final String string;

  Molecularsequence_repositoryType(Value value, String string) {
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
      || (other instanceof Molecularsequence_repositoryType && this.string.equals(((Molecularsequence_repositoryType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case LOGIN:
        return visitor.visitLOGIN();
      case OTHER:
        return visitor.visitOTHER();
      case DIRECTLINK:
        return visitor.visitDIRECTLINK();
      case OAUTH:
        return visitor.visitOAUTH();
      case OPENAPI:
        return visitor.visitOPENAPI();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Molecularsequence_repositoryType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "LOGIN":
        return LOGIN;
      case "OTHER":
        return OTHER;
      case "DIRECTLINK":
        return DIRECTLINK;
      case "OAUTH":
        return OAUTH;
      case "OPENAPI":
        return OPENAPI;
      default:
        return new Molecularsequence_repositoryType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DIRECTLINK,

    OPENAPI,

    LOGIN,

    OAUTH,

    OTHER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDIRECTLINK();

    T visitOPENAPI();

    T visitLOGIN();

    T visitOAUTH();

    T visitOTHER();

    T visitUnknown(String unknownType);
  }
}
