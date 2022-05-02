package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;
import javax.annotation.Nonnull;

public final class EpisodeofcareStatus {
  public static final EpisodeofcareStatus ACTIVE = new EpisodeofcareStatus(Value.ACTIVE, "ACTIVE");

  public static final EpisodeofcareStatus WAITLIST = new EpisodeofcareStatus(Value.WAITLIST, "WAITLIST");

  public static final EpisodeofcareStatus ONHOLD = new EpisodeofcareStatus(Value.ONHOLD, "ONHOLD");

  public static final EpisodeofcareStatus PLANNED = new EpisodeofcareStatus(Value.PLANNED, "PLANNED");

  public static final EpisodeofcareStatus FINISHED = new EpisodeofcareStatus(Value.FINISHED, "FINISHED");

  public static final EpisodeofcareStatus CANCELLED = new EpisodeofcareStatus(Value.CANCELLED, "CANCELLED");

  private final Value value;

  private final String string;

  EpisodeofcareStatus(Value value, String string) {
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
      || (other instanceof EpisodeofcareStatus && this.string.equals(((EpisodeofcareStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T accept(Visitor<T> visitor) {
    switch (value) {
      case ACTIVE:
        return visitor.visitACTIVE();
      case WAITLIST:
        return visitor.visitWAITLIST();
      case ONHOLD:
        return visitor.visitONHOLD();
      case PLANNED:
        return visitor.visitPLANNED();
      case FINISHED:
        return visitor.visitFINISHED();
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
  public static EpisodeofcareStatus valueOf(@Nonnull String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACTIVE":
        return ACTIVE;
      case "WAITLIST":
        return WAITLIST;
      case "ONHOLD":
        return ONHOLD;
      case "PLANNED":
        return PLANNED;
      case "FINISHED":
        return FINISHED;
      case "CANCELLED":
        return CANCELLED;
      default:
        return new EpisodeofcareStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PLANNED,

    WAITLIST,

    ACTIVE,

    ONHOLD,

    FINISHED,

    CANCELLED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPLANNED();

    T visitWAITLIST();

    T visitACTIVE();

    T visitONHOLD();

    T visitFINISHED();

    T visitCANCELLED();

    T visitUnknown(String unknownType);
  }
}
