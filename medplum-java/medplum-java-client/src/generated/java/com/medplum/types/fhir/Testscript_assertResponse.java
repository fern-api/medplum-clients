package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Testscript_assertResponse {
  public static final Testscript_assertResponse BAD = new Testscript_assertResponse(Value.BAD, "BAD");

  public static final Testscript_assertResponse METHODNOTALLOWED = new Testscript_assertResponse(Value.METHODNOTALLOWED, "METHODNOTALLOWED");

  public static final Testscript_assertResponse UNPROCESSABLE = new Testscript_assertResponse(Value.UNPROCESSABLE, "UNPROCESSABLE");

  public static final Testscript_assertResponse OKAY = new Testscript_assertResponse(Value.OKAY, "OKAY");

  public static final Testscript_assertResponse CONFLICT = new Testscript_assertResponse(Value.CONFLICT, "CONFLICT");

  public static final Testscript_assertResponse NOTFOUND = new Testscript_assertResponse(Value.NOTFOUND, "NOTFOUND");

  public static final Testscript_assertResponse NOTMODIFIED = new Testscript_assertResponse(Value.NOTMODIFIED, "NOTMODIFIED");

  public static final Testscript_assertResponse CREATED = new Testscript_assertResponse(Value.CREATED, "CREATED");

  public static final Testscript_assertResponse FORBIDDEN = new Testscript_assertResponse(Value.FORBIDDEN, "FORBIDDEN");

  public static final Testscript_assertResponse GONE = new Testscript_assertResponse(Value.GONE, "GONE");

  public static final Testscript_assertResponse PRECONDITIONFAILED = new Testscript_assertResponse(Value.PRECONDITIONFAILED, "PRECONDITIONFAILED");

  public static final Testscript_assertResponse NOCONTENT = new Testscript_assertResponse(Value.NOCONTENT, "NOCONTENT");

  private final Value value;

  private final String string;

  Testscript_assertResponse(Value value, String string) {
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
      || (other instanceof Testscript_assertResponse && this.string.equals(((Testscript_assertResponse) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case BAD:
        return visitor.visitBAD();
      case METHODNOTALLOWED:
        return visitor.visitMETHODNOTALLOWED();
      case UNPROCESSABLE:
        return visitor.visitUNPROCESSABLE();
      case OKAY:
        return visitor.visitOKAY();
      case CONFLICT:
        return visitor.visitCONFLICT();
      case NOTFOUND:
        return visitor.visitNOTFOUND();
      case NOTMODIFIED:
        return visitor.visitNOTMODIFIED();
      case CREATED:
        return visitor.visitCREATED();
      case FORBIDDEN:
        return visitor.visitFORBIDDEN();
      case GONE:
        return visitor.visitGONE();
      case PRECONDITIONFAILED:
        return visitor.visitPRECONDITIONFAILED();
      case NOCONTENT:
        return visitor.visitNOCONTENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Testscript_assertResponse valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "BAD":
        return BAD;
      case "METHODNOTALLOWED":
        return METHODNOTALLOWED;
      case "UNPROCESSABLE":
        return UNPROCESSABLE;
      case "OKAY":
        return OKAY;
      case "CONFLICT":
        return CONFLICT;
      case "NOTFOUND":
        return NOTFOUND;
      case "NOTMODIFIED":
        return NOTMODIFIED;
      case "CREATED":
        return CREATED;
      case "FORBIDDEN":
        return FORBIDDEN;
      case "GONE":
        return GONE;
      case "PRECONDITIONFAILED":
        return PRECONDITIONFAILED;
      case "NOCONTENT":
        return NOCONTENT;
      default:
        return new Testscript_assertResponse(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    OKAY,

    CREATED,

    NOCONTENT,

    NOTMODIFIED,

    BAD,

    FORBIDDEN,

    NOTFOUND,

    METHODNOTALLOWED,

    CONFLICT,

    GONE,

    PRECONDITIONFAILED,

    UNPROCESSABLE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOKAY();

    T visitCREATED();

    T visitNOCONTENT();

    T visitNOTMODIFIED();

    T visitBAD();

    T visitFORBIDDEN();

    T visitNOTFOUND();

    T visitMETHODNOTALLOWED();

    T visitCONFLICT();

    T visitGONE();

    T visitPRECONDITIONFAILED();

    T visitUNPROCESSABLE();

    T visitUnknown(String unknownType);
  }
}
