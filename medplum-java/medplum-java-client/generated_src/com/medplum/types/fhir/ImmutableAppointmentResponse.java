package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AppointmentResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppointmentResponse.builder()}.
 */
@Generated(from = "AppointmentResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAppointmentResponse implements AppointmentResponse {
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final Reference appointment;
  private final @Nullable Instant end;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Reference actor;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable Instant start;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable String comment;
  private final @Nullable List<CodeableConcept> participantType;
  private final @Nullable Code participantStatus;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableAppointmentResponse(
      @Nullable Id id,
      @Nullable Narrative text,
      Reference appointment,
      @Nullable Instant end,
      @Nullable List<Identifier> identifier,
      @Nullable Reference actor,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable Instant start,
      String resourceType,
      @Nullable Meta meta,
      @Nullable String comment,
      @Nullable List<CodeableConcept> participantType,
      @Nullable Code participantStatus,
      @Nullable List<Extension> extension,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.text = text;
    this.appointment = appointment;
    this.end = end;
    this.identifier = identifier;
    this.actor = actor;
    this.implicitRules = implicitRules;
    this.language = language;
    this.start = start;
    this.resourceType = resourceType;
    this.meta = meta;
    this.comment = comment;
    this.participantType = participantType;
    this.participantStatus = participantStatus;
    this.extension = extension;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code appointment} attribute
   */
  @JsonProperty("appointment")
  @Override
  public Reference appointment() {
    return appointment;
  }

  /**
   * @return The value of the {@code end} attribute
   */
  @JsonProperty("end")
  @Override
  public Optional<Instant> end() {
    return Optional.ofNullable(end);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code actor} attribute
   */
  @JsonProperty("actor")
  @Override
  public Optional<Reference> actor() {
    return Optional.ofNullable(actor);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public Optional<Instant> start() {
    return Optional.ofNullable(start);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code participantType} attribute
   */
  @JsonProperty("participantType")
  @Override
  public Optional<List<CodeableConcept>> participantType() {
    return Optional.ofNullable(participantType);
  }

  /**
   * @return The value of the {@code participantStatus} attribute
   */
  @JsonProperty("participantStatus")
  @Override
  public Optional<Code> participantStatus() {
    return Optional.ofNullable(participantStatus);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAppointmentResponse(
        newValue,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAppointmentResponse(
        value,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        newValue,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        value,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppointmentResponse#appointment() appointment} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appointment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppointmentResponse withAppointment(Reference value) {
    if (this.appointment == value) return this;
    Reference newValue = Objects.requireNonNull(value, "appointment");
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        newValue,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withEnd(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        newValue,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withEnd(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        value,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        newValue,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        value,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#actor() actor} attribute.
   * @param value The value for actor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withActor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "actor");
    if (this.actor == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        newValue,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#actor() actor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withActor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.actor == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        value,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        newValue,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        value,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        newValue,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        value,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withStart(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        newValue,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withStart(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        value,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppointmentResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppointmentResponse withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        newValue,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        newValue,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        value,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        newValue,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        value,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#participantType() participantType} attribute.
   * @param value The value for participantType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withParticipantType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "participantType");
    if (this.participantType == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        newValue,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#participantType() participantType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withParticipantType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.participantType == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        value,
        this.participantStatus,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#participantStatus() participantStatus} attribute.
   * @param value The value for participantStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withParticipantStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "participantStatus");
    if (this.participantStatus == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        newValue,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#participantStatus() participantStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withParticipantStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.participantStatus == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        value,
        this.extension,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        newValue,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        value,
        this.contained,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAppointmentResponse(
        this.id,
        this.text,
        this.appointment,
        this.end,
        this.identifier,
        this.actor,
        this.implicitRules,
        this.language,
        this.start,
        this.resourceType,
        this.meta,
        this.comment,
        this.participantType,
        this.participantStatus,
        this.extension,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppointmentResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppointmentResponse
        && equalTo((ImmutableAppointmentResponse) another);
  }

  private boolean equalTo(ImmutableAppointmentResponse another) {
    return Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && appointment.equals(another.appointment)
        && Objects.equals(end, another.end)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(actor, another.actor)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(start, another.start)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(comment, another.comment)
        && Objects.equals(participantType, another.participantType)
        && Objects.equals(participantStatus, another.participantStatus)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code text}, {@code appointment}, {@code end}, {@code identifier}, {@code actor}, {@code implicitRules}, {@code language}, {@code start}, {@code resourceType}, {@code meta}, {@code comment}, {@code participantType}, {@code participantStatus}, {@code extension}, {@code contained}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + appointment.hashCode();
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(actor);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(participantType);
    h += (h << 5) + Objects.hashCode(participantStatus);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code AppointmentResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AppointmentResponse{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("appointment=").append(appointment);
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (actor != null) {
      builder.append(", ");
      builder.append("actor=").append(actor);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (start != null) {
      builder.append(", ");
      builder.append("start=").append(start);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (participantType != null) {
      builder.append(", ");
      builder.append("participantType=").append(participantType);
    }
    if (participantStatus != null) {
      builder.append(", ");
      builder.append("participantStatus=").append(participantStatus);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AppointmentResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AppointmentResponse {
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Reference appointment;
    @Nullable Optional<Instant> end = Optional.empty();
    boolean endIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> actor = Optional.empty();
    boolean actorIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Instant> start = Optional.empty();
    boolean startIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<List<CodeableConcept>> participantType = Optional.empty();
    boolean participantTypeIsSet;
    @Nullable Optional<Code> participantStatus = Optional.empty();
    boolean participantStatusIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("appointment")
    public void setAppointment(Reference appointment) {
      this.appointment = appointment;
    }
    @JsonProperty("end")
    public void setEnd(Optional<Instant> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("actor")
    public void setActor(Optional<Reference> actor) {
      this.actor = actor;
      this.actorIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("start")
    public void setStart(Optional<Instant> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("participantType")
    public void setParticipantType(Optional<List<CodeableConcept>> participantType) {
      this.participantType = participantType;
      this.participantTypeIsSet = true;
    }
    @JsonProperty("participantStatus")
    public void setParticipantStatus(Optional<Code> participantStatus) {
      this.participantStatus = participantStatus;
      this.participantStatusIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Reference appointment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> end() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> actor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> start() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> participantType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> participantStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppointmentResponse fromJson(Json json) {
    ImmutableAppointmentResponse.Builder builder = ((ImmutableAppointmentResponse.Builder) ImmutableAppointmentResponse.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.appointment != null) {
      builder.appointment(json.appointment);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.actorIsSet) {
      builder.actor(json.actor);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.participantTypeIsSet) {
      builder.participantType(json.participantType);
    }
    if (json.participantStatusIsSet) {
      builder.participantStatus(json.participantStatus);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableAppointmentResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AppointmentResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AppointmentResponse instance
   */
  public static AppointmentResponse copyOf(AppointmentResponse instance) {
    if (instance instanceof ImmutableAppointmentResponse) {
      return (ImmutableAppointmentResponse) instance;
    }
    return ((ImmutableAppointmentResponse.Builder) ImmutableAppointmentResponse.builder())
        .id(instance.id())
        .text(instance.text())
        .appointment(instance.appointment())
        .end(instance.end())
        .identifier(instance.identifier())
        .actor(instance.actor())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .start(instance.start())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .comment(instance.comment())
        .participantType(instance.participantType())
        .participantStatus(instance.participantStatus())
        .extension(instance.extension())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link AppointmentResponse AppointmentResponse}.
   * <pre>
   * ImmutableAppointmentResponse.builder()
   *    .id(com.medplum.types.fhir.Id) // optional {@link AppointmentResponse#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link AppointmentResponse#text() text}
   *    .appointment(com.medplum.types.fhir.Reference) // required {@link AppointmentResponse#appointment() appointment}
   *    .end(com.medplum.types.fhir.Instant) // optional {@link AppointmentResponse#end() end}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link AppointmentResponse#identifier() identifier}
   *    .actor(com.medplum.types.fhir.Reference) // optional {@link AppointmentResponse#actor() actor}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link AppointmentResponse#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link AppointmentResponse#language() language}
   *    .start(com.medplum.types.fhir.Instant) // optional {@link AppointmentResponse#start() start}
   *    .resourceType(String) // required {@link AppointmentResponse#resourceType() resourceType}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link AppointmentResponse#meta() meta}
   *    .comment(String) // optional {@link AppointmentResponse#comment() comment}
   *    .participantType(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link AppointmentResponse#participantType() participantType}
   *    .participantStatus(com.medplum.types.fhir.Code) // optional {@link AppointmentResponse#participantStatus() participantStatus}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link AppointmentResponse#extension() extension}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link AppointmentResponse#contained() contained}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link AppointmentResponse#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new AppointmentResponse builder
   */
  public static AppointmentBuildStage builder() {
    return new ImmutableAppointmentResponse.Builder();
  }

  /**
   * Builds instances of type {@link AppointmentResponse AppointmentResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AppointmentResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements AppointmentBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_APPOINTMENT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_END = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_ACTOR = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_START = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_COMMENT = 0x200L;
    private static final long OPT_BIT_PARTICIPANT_TYPE = 0x400L;
    private static final long OPT_BIT_PARTICIPANT_STATUS = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable Reference appointment;
    private @Nullable Instant end;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference actor;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable Instant start;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable String comment;
    private @Nullable List<CodeableConcept> participantType;
    private @Nullable Code participantStatus;
    private @Nullable List<Extension> extension;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link AppointmentResponse#appointment() appointment} attribute.
     * @param appointment The value for appointment 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appointment")
    public final Builder appointment(Reference appointment) {
      checkNotIsSet(appointmentIsSet(), "appointment");
      this.appointment = Objects.requireNonNull(appointment, "appointment");
      initBits &= ~INIT_BIT_APPOINTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(Instant end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = Objects.requireNonNull(end, "end");
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("end")
    public final Builder end(Optional<? extends Instant> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    public final Builder actor(Reference actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = Objects.requireNonNull(actor, "actor");
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actor")
    public final Builder actor(Optional<? extends Reference> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = actor.orElse(null);
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(Instant start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = Objects.requireNonNull(start, "start");
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("start")
    public final Builder start(Optional<? extends Instant> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the value for the {@link AppointmentResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantType(List<CodeableConcept> participantType) {
      checkNotIsSet(participantTypeIsSet(), "participantType");
      this.participantType = Objects.requireNonNull(participantType, "participantType");
      optBits |= OPT_BIT_PARTICIPANT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantType")
    public final Builder participantType(Optional<? extends List<CodeableConcept>> participantType) {
      checkNotIsSet(participantTypeIsSet(), "participantType");
      this.participantType = participantType.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantStatus(Code participantStatus) {
      checkNotIsSet(participantStatusIsSet(), "participantStatus");
      this.participantStatus = Objects.requireNonNull(participantStatus, "participantStatus");
      optBits |= OPT_BIT_PARTICIPANT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participantStatus")
    public final Builder participantStatus(Optional<? extends Code> participantStatus) {
      checkNotIsSet(participantStatusIsSet(), "participantStatus");
      this.participantStatus = participantStatus.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link AppointmentResponse AppointmentResponse}.
     * @return An immutable instance of AppointmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AppointmentResponse build() {
      checkRequiredAttributes();
      return new ImmutableAppointmentResponse(
          id,
          text,
          appointment,
          end,
          identifier,
          actor,
          implicitRules,
          language,
          start,
          resourceType,
          meta,
          comment,
          participantType,
          participantStatus,
          extension,
          contained,
          modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean actorIsSet() {
      return (optBits & OPT_BIT_ACTOR) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean participantTypeIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_TYPE) != 0;
    }

    private boolean participantStatusIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean appointmentIsSet() {
      return (initBits & INIT_BIT_APPOINTMENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AppointmentResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!appointmentIsSet()) attributes.add("appointment");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build AppointmentResponse, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "AppointmentResponse", generator = "Immutables")
  public interface AppointmentBuildStage {
    /**
     * Initializes the value for the {@link AppointmentResponse#appointment() appointment} attribute.
     * @param appointment The value for appointment 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage appointment(Reference appointment);
  }

  @Generated(from = "AppointmentResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AppointmentResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "AppointmentResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(Instant end);

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(Optional<? extends Instant> end);

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link AppointmentResponse#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actor(Reference actor);

    /**
     * Initializes the optional value {@link AppointmentResponse#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actor(Optional<? extends Reference> actor);

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(Instant start);

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(Optional<? extends Instant> start);

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participantType(List<CodeableConcept> participantType);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participantType(Optional<? extends List<CodeableConcept>> participantType);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participantStatus(Code participantStatus);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participantStatus(Optional<? extends Code> participantStatus);

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link AppointmentResponse AppointmentResponse}.
     * @return An immutable instance of AppointmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AppointmentResponse build();
  }
}
