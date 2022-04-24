package com.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Operationoutcome_issueCode {
  public static final Operationoutcome_issueCode DUPLICATE = new Operationoutcome_issueCode(Value.DUPLICATE, "DUPLICATE");

  public static final Operationoutcome_issueCode VALUE = new Operationoutcome_issueCode(Value.VALUE, "VALUE");

  public static final Operationoutcome_issueCode LOGIN = new Operationoutcome_issueCode(Value.LOGIN, "LOGIN");

  public static final Operationoutcome_issueCode INVARIANT = new Operationoutcome_issueCode(Value.INVARIANT, "INVARIANT");

  public static final Operationoutcome_issueCode INVALID = new Operationoutcome_issueCode(Value.INVALID, "INVALID");

  public static final Operationoutcome_issueCode THROTTLED = new Operationoutcome_issueCode(Value.THROTTLED, "THROTTLED");

  public static final Operationoutcome_issueCode SUPPRESSED = new Operationoutcome_issueCode(Value.SUPPRESSED, "SUPPRESSED");

  public static final Operationoutcome_issueCode EXTENSION = new Operationoutcome_issueCode(Value.EXTENSION, "EXTENSION");

  public static final Operationoutcome_issueCode INCOMPLETE = new Operationoutcome_issueCode(Value.INCOMPLETE, "INCOMPLETE");

  public static final Operationoutcome_issueCode FORBIDDEN = new Operationoutcome_issueCode(Value.FORBIDDEN, "FORBIDDEN");

  public static final Operationoutcome_issueCode EXPIRED = new Operationoutcome_issueCode(Value.EXPIRED, "EXPIRED");

  public static final Operationoutcome_issueCode DELETED = new Operationoutcome_issueCode(Value.DELETED, "DELETED");

  public static final Operationoutcome_issueCode TIMEOUT = new Operationoutcome_issueCode(Value.TIMEOUT, "TIMEOUT");

  public static final Operationoutcome_issueCode REQUIRED = new Operationoutcome_issueCode(Value.REQUIRED, "REQUIRED");

  public static final Operationoutcome_issueCode SECURITY = new Operationoutcome_issueCode(Value.SECURITY, "SECURITY");

  public static final Operationoutcome_issueCode PROCESSING = new Operationoutcome_issueCode(Value.PROCESSING, "PROCESSING");

  public static final Operationoutcome_issueCode EXCEPTION = new Operationoutcome_issueCode(Value.EXCEPTION, "EXCEPTION");

  public static final Operationoutcome_issueCode STRUCTURE = new Operationoutcome_issueCode(Value.STRUCTURE, "STRUCTURE");

  public static final Operationoutcome_issueCode INFORMATIONAL = new Operationoutcome_issueCode(Value.INFORMATIONAL, "INFORMATIONAL");

  public static final Operationoutcome_issueCode CONFLICT = new Operationoutcome_issueCode(Value.CONFLICT, "CONFLICT");

  public static final Operationoutcome_issueCode TRANSIENT = new Operationoutcome_issueCode(Value.TRANSIENT, "TRANSIENT");

  private final Value value;

  private final String string;

  Operationoutcome_issueCode(Value value, String string) {
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
      || (other instanceof Operationoutcome_issueCode && this.string.equals(((Operationoutcome_issueCode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case DUPLICATE:
        return visitor.visitDUPLICATE();
      case VALUE:
        return visitor.visitVALUE();
      case LOGIN:
        return visitor.visitLOGIN();
      case INVARIANT:
        return visitor.visitINVARIANT();
      case INVALID:
        return visitor.visitINVALID();
      case THROTTLED:
        return visitor.visitTHROTTLED();
      case SUPPRESSED:
        return visitor.visitSUPPRESSED();
      case EXTENSION:
        return visitor.visitEXTENSION();
      case INCOMPLETE:
        return visitor.visitINCOMPLETE();
      case FORBIDDEN:
        return visitor.visitFORBIDDEN();
      case EXPIRED:
        return visitor.visitEXPIRED();
      case DELETED:
        return visitor.visitDELETED();
      case TIMEOUT:
        return visitor.visitTIMEOUT();
      case REQUIRED:
        return visitor.visitREQUIRED();
      case SECURITY:
        return visitor.visitSECURITY();
      case PROCESSING:
        return visitor.visitPROCESSING();
      case EXCEPTION:
        return visitor.visitEXCEPTION();
      case STRUCTURE:
        return visitor.visitSTRUCTURE();
      case INFORMATIONAL:
        return visitor.visitINFORMATIONAL();
      case CONFLICT:
        return visitor.visitCONFLICT();
      case TRANSIENT:
        return visitor.visitTRANSIENT();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Operationoutcome_issueCode valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DUPLICATE":
        return DUPLICATE;
      case "VALUE":
        return VALUE;
      case "LOGIN":
        return LOGIN;
      case "INVARIANT":
        return INVARIANT;
      case "INVALID":
        return INVALID;
      case "THROTTLED":
        return THROTTLED;
      case "SUPPRESSED":
        return SUPPRESSED;
      case "EXTENSION":
        return EXTENSION;
      case "INCOMPLETE":
        return INCOMPLETE;
      case "FORBIDDEN":
        return FORBIDDEN;
      case "EXPIRED":
        return EXPIRED;
      case "DELETED":
        return DELETED;
      case "TIMEOUT":
        return TIMEOUT;
      case "REQUIRED":
        return REQUIRED;
      case "SECURITY":
        return SECURITY;
      case "PROCESSING":
        return PROCESSING;
      case "EXCEPTION":
        return EXCEPTION;
      case "STRUCTURE":
        return STRUCTURE;
      case "INFORMATIONAL":
        return INFORMATIONAL;
      case "CONFLICT":
        return CONFLICT;
      case "TRANSIENT":
        return TRANSIENT;
      default:
        return new Operationoutcome_issueCode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INVALID,

    STRUCTURE,

    REQUIRED,

    VALUE,

    INVARIANT,

    SECURITY,

    LOGIN,

    EXPIRED,

    FORBIDDEN,

    SUPPRESSED,

    PROCESSING,

    DUPLICATE,

    DELETED,

    EXTENSION,

    CONFLICT,

    TRANSIENT,

    EXCEPTION,

    TIMEOUT,

    INCOMPLETE,

    THROTTLED,

    INFORMATIONAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitINVALID();

    T visitSTRUCTURE();

    T visitREQUIRED();

    T visitVALUE();

    T visitINVARIANT();

    T visitSECURITY();

    T visitLOGIN();

    T visitEXPIRED();

    T visitFORBIDDEN();

    T visitSUPPRESSED();

    T visitPROCESSING();

    T visitDUPLICATE();

    T visitDELETED();

    T visitEXTENSION();

    T visitCONFLICT();

    T visitTRANSIENT();

    T visitEXCEPTION();

    T visitTIMEOUT();

    T visitINCOMPLETE();

    T visitTHROTTLED();

    T visitINFORMATIONAL();

    T visitUnknown(String unknownType);
  }
}
