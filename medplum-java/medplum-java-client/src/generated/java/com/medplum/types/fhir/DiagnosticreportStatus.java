package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class DiagnosticreportStatus {
  public static final DiagnosticreportStatus APPENDED = new DiagnosticreportStatus(Value.APPENDED, "APPENDED");

  public static final DiagnosticreportStatus PARTIAL = new DiagnosticreportStatus(Value.PARTIAL, "PARTIAL");

  public static final DiagnosticreportStatus AMENDED = new DiagnosticreportStatus(Value.AMENDED, "AMENDED");

  public static final DiagnosticreportStatus REGISTERED = new DiagnosticreportStatus(Value.REGISTERED, "REGISTERED");

  public static final DiagnosticreportStatus CORRECTED = new DiagnosticreportStatus(Value.CORRECTED, "CORRECTED");

  public static final DiagnosticreportStatus PRELIMINARY = new DiagnosticreportStatus(Value.PRELIMINARY, "PRELIMINARY");

  public static final DiagnosticreportStatus FINAL = new DiagnosticreportStatus(Value.FINAL, "FINAL");

  public static final DiagnosticreportStatus CANCELLED = new DiagnosticreportStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  DiagnosticreportStatus(Value value, String string) {
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
      || (other instanceof DiagnosticreportStatus && this.string.equals(((DiagnosticreportStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case APPENDED:
        return visitor.visitAPPENDED();
      case PARTIAL:
        return visitor.visitPARTIAL();
      case AMENDED:
        return visitor.visitAMENDED();
      case REGISTERED:
        return visitor.visitREGISTERED();
      case CORRECTED:
        return visitor.visitCORRECTED();
      case PRELIMINARY:
        return visitor.visitPRELIMINARY();
      case FINAL:
        return visitor.visitFINAL();
      case CANCELLED:
        return visitor.visitCANCELLED();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DiagnosticreportStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "APPENDED":
        return APPENDED;
      case "PARTIAL":
        return PARTIAL;
      case "AMENDED":
        return AMENDED;
      case "REGISTERED":
        return REGISTERED;
      case "CORRECTED":
        return CORRECTED;
      case "PRELIMINARY":
        return PRELIMINARY;
      case "FINAL":
        return FINAL;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new DiagnosticreportStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    REGISTERED,

    PARTIAL,

    PRELIMINARY,

    FINAL,

    AMENDED,

    CORRECTED,

    APPENDED,

    CANCELLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitREGISTERED();

    T visitPARTIAL();

    T visitPRELIMINARY();

    T visitFINAL();

    T visitAMENDED();

    T visitCORRECTED();

    T visitAPPENDED();

    T visitCANCELLED();

    T visitUnknown(String unknownType);
  }
}
