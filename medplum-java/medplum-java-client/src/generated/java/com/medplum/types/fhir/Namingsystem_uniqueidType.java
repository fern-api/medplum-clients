package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class Namingsystem_uniqueidType {
  public static final Namingsystem_uniqueidType UUID = new Namingsystem_uniqueidType(Value.UUID, "UUID");

  public static final Namingsystem_uniqueidType OID = new Namingsystem_uniqueidType(Value.OID, "OID");

  public static final Namingsystem_uniqueidType URI = new Namingsystem_uniqueidType(Value.URI, "URI");

  public static final Namingsystem_uniqueidType OTHER = new Namingsystem_uniqueidType(Value.OTHER, "OTHER");

  private final Value value;

  private final String string;

  Namingsystem_uniqueidType(Value value, String string) {
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
      || (other instanceof Namingsystem_uniqueidType && this.string.equals(((Namingsystem_uniqueidType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case UUID:
        return visitor.visitUUID();
      case OID:
        return visitor.visitOID();
      case URI:
        return visitor.visitURI();
      case OTHER:
        return visitor.visitOTHER();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static Namingsystem_uniqueidType valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "UUID":
        return UUID;
      case "OID":
        return OID;
      case "URI":
        return URI;
      case "OTHER":
        return OTHER;
      default:
        return new Namingsystem_uniqueidType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    OID,

    UUID,

    URI,

    OTHER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOID();

    T visitUUID();

    T visitURI();

    T visitOTHER();

    T visitUnknown(String unknownType);
  }
}
