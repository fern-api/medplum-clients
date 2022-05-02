package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Structuremap_targetTransform {
  public static final Structuremap_targetTransform TRANSLATE = new Structuremap_targetTransform(Value.TRANSLATE, "TRANSLATE");

  public static final Structuremap_targetTransform UUID = new Structuremap_targetTransform(Value.UUID, "UUID");

  public static final Structuremap_targetTransform QTY = new Structuremap_targetTransform(Value.QTY, "QTY");

  public static final Structuremap_targetTransform COPY = new Structuremap_targetTransform(Value.COPY, "COPY");

  public static final Structuremap_targetTransform POINTER = new Structuremap_targetTransform(Value.POINTER, "POINTER");

  public static final Structuremap_targetTransform DATEOP = new Structuremap_targetTransform(Value.DATEOP, "DATEOP");

  public static final Structuremap_targetTransform CP = new Structuremap_targetTransform(Value.CP, "CP");

  public static final Structuremap_targetTransform ESCAPE = new Structuremap_targetTransform(Value.ESCAPE, "ESCAPE");

  public static final Structuremap_targetTransform APPEND = new Structuremap_targetTransform(Value.APPEND, "APPEND");

  public static final Structuremap_targetTransform CREATE = new Structuremap_targetTransform(Value.CREATE, "CREATE");

  public static final Structuremap_targetTransform C = new Structuremap_targetTransform(Value.C, "C");

  public static final Structuremap_targetTransform ID = new Structuremap_targetTransform(Value.ID, "ID");

  public static final Structuremap_targetTransform TRUNCATE = new Structuremap_targetTransform(Value.TRUNCATE, "TRUNCATE");

  public static final Structuremap_targetTransform EVALUATE = new Structuremap_targetTransform(Value.EVALUATE, "EVALUATE");

  public static final Structuremap_targetTransform CAST = new Structuremap_targetTransform(Value.CAST, "CAST");

  public static final Structuremap_targetTransform REFERENCE = new Structuremap_targetTransform(Value.REFERENCE, "REFERENCE");

  public static final Structuremap_targetTransform CC = new Structuremap_targetTransform(Value.CC, "CC");

  private final Value value;

  private final String string;

  Structuremap_targetTransform(Value value, String string) {
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
      || (other instanceof Structuremap_targetTransform && this.string.equals(((Structuremap_targetTransform) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case TRANSLATE:
        return visitor.visitTRANSLATE();
      case UUID:
        return visitor.visitUUID();
      case QTY:
        return visitor.visitQTY();
      case COPY:
        return visitor.visitCOPY();
      case POINTER:
        return visitor.visitPOINTER();
      case DATEOP:
        return visitor.visitDATEOP();
      case CP:
        return visitor.visitCP();
      case ESCAPE:
        return visitor.visitESCAPE();
      case APPEND:
        return visitor.visitAPPEND();
      case CREATE:
        return visitor.visitCREATE();
      case C:
        return visitor.visitC();
      case ID:
        return visitor.visitID();
      case TRUNCATE:
        return visitor.visitTRUNCATE();
      case EVALUATE:
        return visitor.visitEVALUATE();
      case CAST:
        return visitor.visitCAST();
      case REFERENCE:
        return visitor.visitREFERENCE();
      case CC:
        return visitor.visitCC();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Structuremap_targetTransform valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "TRANSLATE":
        return TRANSLATE;
      case "UUID":
        return UUID;
      case "QTY":
        return QTY;
      case "COPY":
        return COPY;
      case "POINTER":
        return POINTER;
      case "DATEOP":
        return DATEOP;
      case "CP":
        return CP;
      case "ESCAPE":
        return ESCAPE;
      case "APPEND":
        return APPEND;
      case "CREATE":
        return CREATE;
      case "C":
        return C;
      case "ID":
        return ID;
      case "TRUNCATE":
        return TRUNCATE;
      case "EVALUATE":
        return EVALUATE;
      case "CAST":
        return CAST;
      case "REFERENCE":
        return REFERENCE;
      case "CC":
        return CC;
      default:
        return new Structuremap_targetTransform(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CREATE,

    COPY,

    TRUNCATE,

    ESCAPE,

    CAST,

    APPEND,

    TRANSLATE,

    REFERENCE,

    DATEOP,

    UUID,

    POINTER,

    EVALUATE,

    CC,

    C,

    QTY,

    ID,

    CP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCREATE();

    T visitCOPY();

    T visitTRUNCATE();

    T visitESCAPE();

    T visitCAST();

    T visitAPPEND();

    T visitTRANSLATE();

    T visitREFERENCE();

    T visitDATEOP();

    T visitUUID();

    T visitPOINTER();

    T visitEVALUATE();

    T visitCC();

    T visitC();

    T visitQTY();

    T visitID();

    T visitCP();

    T visitUnknown(String unknownType);
  }
}
