//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link AppointmentResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppointmentResponse.builder()}.
 */
@org.immutables.value.Generated(from = "AppointmentResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAppointmentResponse implements com.fhir.AppointmentResponse {
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.code participantStatus;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final com.fhir.Reference appointment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Reference actor;
  private final @javax.annotation.Nullable com.fhir.instant end;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> participantType;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable com.fhir.instant start;

  private ImmutableAppointmentResponse(
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.code participantStatus,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      com.fhir.Reference appointment,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Reference actor,
      @javax.annotation.Nullable com.fhir.instant end,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> participantType,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable com.fhir.instant start) {
    this.resourceType = resourceType;
    this.contained = contained;
    this.extension = extension;
    this.text = text;
    this.participantStatus = participantStatus;
    this.implicitRules = implicitRules;
    this.id = id;
    this.meta = meta;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.appointment = appointment;
    this.identifier = identifier;
    this.actor = actor;
    this.end = end;
    this.participantType = participantType;
    this.comment = comment;
    this.start = start;
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code participantStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participantStatus")
  @Override
  public java.util.Optional<com.fhir.code> participantStatus() {
    return java.util.Optional.ofNullable(participantStatus);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code appointment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("appointment")
  @Override
  public com.fhir.Reference appointment() {
    return appointment;
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code actor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("actor")
  @Override
  public java.util.Optional<com.fhir.Reference> actor() {
    return java.util.Optional.ofNullable(actor);
  }

  /**
   * @return The value of the {@code end} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("end")
  @Override
  public java.util.Optional<com.fhir.instant> end() {
    return java.util.Optional.ofNullable(end);
  }

  /**
   * @return The value of the {@code participantType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participantType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> participantType() {
    return java.util.Optional.ofNullable(participantType);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("start")
  @Override
  public java.util.Optional<com.fhir.instant> start() {
    return java.util.Optional.ofNullable(start);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppointmentResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppointmentResponse withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAppointmentResponse(
        newValue,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        newValue,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        value,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        newValue,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        value,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        newValue,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        value,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#participantStatus() participantStatus} attribute.
   * @param value The value for participantStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withParticipantStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "participantStatus");
    if (this.participantStatus == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        newValue,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#participantStatus() participantStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withParticipantStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.participantStatus == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        value,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        newValue,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        value,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        newValue,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        value,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        newValue,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        value,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        newValue,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        value,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        newValue,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        value,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AppointmentResponse#appointment() appointment} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appointment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppointmentResponse withAppointment(com.fhir.Reference value) {
    if (this.appointment == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "appointment");
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        newValue,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        value,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#actor() actor} attribute.
   * @param value The value for actor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withActor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "actor");
    if (this.actor == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        newValue,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#actor() actor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withActor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.actor == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        value,
        this.end,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withEnd(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        newValue,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withEnd(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        value,
        this.participantType,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#participantType() participantType} attribute.
   * @param value The value for participantType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withParticipantType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "participantType");
    if (this.participantType == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        newValue,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#participantType() participantType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participantType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withParticipantType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.participantType == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        value,
        this.comment,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        newValue,
        this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        value,
        this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AppointmentResponse#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointmentResponse withStart(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AppointmentResponse#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointmentResponse withStart(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableAppointmentResponse(
        this.resourceType,
        this.contained,
        this.extension,
        this.text,
        this.participantStatus,
        this.implicitRules,
        this.id,
        this.meta,
        this.language,
        this.modifierExtension,
        this.appointment,
        this.identifier,
        this.actor,
        this.end,
        this.participantType,
        this.comment,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppointmentResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppointmentResponse
        && equalTo((ImmutableAppointmentResponse) another);
  }

  private boolean equalTo(ImmutableAppointmentResponse another) {
    return resourceType.equals(another.resourceType)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(participantStatus, another.participantStatus)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && appointment.equals(another.appointment)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(actor, another.actor)
        && java.util.Objects.equals(end, another.end)
        && java.util.Objects.equals(participantType, another.participantType)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(start, another.start);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code contained}, {@code extension}, {@code text}, {@code participantStatus}, {@code implicitRules}, {@code id}, {@code meta}, {@code language}, {@code modifierExtension}, {@code appointment}, {@code identifier}, {@code actor}, {@code end}, {@code participantType}, {@code comment}, {@code start}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(participantStatus);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + appointment.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(actor);
    h += (h << 5) + java.util.Objects.hashCode(end);
    h += (h << 5) + java.util.Objects.hashCode(participantType);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(start);
    return h;
  }

  /**
   * Prints the immutable value {@code AppointmentResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("AppointmentResponse{");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (participantStatus != null) {
      builder.append(", ");
      builder.append("participantStatus=").append(participantStatus);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("appointment=").append(appointment);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (actor != null) {
      builder.append(", ");
      builder.append("actor=").append(actor);
    }
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    if (participantType != null) {
      builder.append(", ");
      builder.append("participantType=").append(participantType);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (start != null) {
      builder.append(", ");
      builder.append("start=").append(start);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "AppointmentResponse", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.AppointmentResponse {
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> participantStatus = java.util.Optional.empty();
    boolean participantStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable com.fhir.Reference appointment;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> actor = java.util.Optional.empty();
    boolean actorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> end = java.util.Optional.empty();
    boolean endIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> participantType = java.util.Optional.empty();
    boolean participantTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> start = java.util.Optional.empty();
    boolean startIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participantStatus")
    public void setParticipantStatus(java.util.Optional<com.fhir.code> participantStatus) {
      this.participantStatus = participantStatus;
      this.participantStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("appointment")
    public void setAppointment(com.fhir.Reference appointment) {
      this.appointment = appointment;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("actor")
    public void setActor(java.util.Optional<com.fhir.Reference> actor) {
      this.actor = actor;
      this.actorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public void setEnd(java.util.Optional<com.fhir.instant> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participantType")
    public void setParticipantType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> participantType) {
      this.participantType = participantType;
      this.participantTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public void setStart(java.util.Optional<com.fhir.instant> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> participantStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference appointment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> actor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> end() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> participantType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> start() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAppointmentResponse fromJson(Json json) {
    ImmutableAppointmentResponse.Builder builder = ((ImmutableAppointmentResponse.Builder) ImmutableAppointmentResponse.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.participantStatusIsSet) {
      builder.participantStatus(json.participantStatus);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.appointment != null) {
      builder.appointment(json.appointment);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.actorIsSet) {
      builder.actor(json.actor);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.participantTypeIsSet) {
      builder.participantType(json.participantType);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.startIsSet) {
      builder.start(json.start);
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
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .extension(instance.extension())
        .text(instance.text())
        .participantStatus(instance.participantStatus())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .meta(instance.meta())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .appointment(instance.appointment())
        .identifier(instance.identifier())
        .actor(instance.actor())
        .end(instance.end())
        .participantType(instance.participantType())
        .comment(instance.comment())
        .start(instance.start())
        .build();
  }

  /**
   * Creates a builder for {@link AppointmentResponse AppointmentResponse}.
   * <pre>
   * ImmutableAppointmentResponse.builder()
   *    .resourceType(String) // required {@link AppointmentResponse#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link AppointmentResponse#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AppointmentResponse#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link AppointmentResponse#text() text}
   *    .participantStatus(com.fhir.code) // optional {@link AppointmentResponse#participantStatus() participantStatus}
   *    .implicitRules(com.fhir.uri) // optional {@link AppointmentResponse#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link AppointmentResponse#id() id}
   *    .meta(com.fhir.Meta) // optional {@link AppointmentResponse#meta() meta}
   *    .language(com.fhir.code) // optional {@link AppointmentResponse#language() language}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AppointmentResponse#modifierExtension() modifierExtension}
   *    .appointment(com.fhir.Reference) // required {@link AppointmentResponse#appointment() appointment}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link AppointmentResponse#identifier() identifier}
   *    .actor(com.fhir.Reference) // optional {@link AppointmentResponse#actor() actor}
   *    .end(com.fhir.instant) // optional {@link AppointmentResponse#end() end}
   *    .participantType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link AppointmentResponse#participantType() participantType}
   *    .comment(String) // optional {@link AppointmentResponse#comment() comment}
   *    .start(com.fhir.instant) // optional {@link AppointmentResponse#start() start}
   *    .build();
   * </pre>
   * @return A new AppointmentResponse builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableAppointmentResponse.Builder();
  }

  /**
   * Builds instances of type {@link AppointmentResponse AppointmentResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "AppointmentResponse", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, AppointmentBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_APPOINTMENT = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_PARTICIPANT_STATUS = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_ACTOR = 0x400L;
    private static final long OPT_BIT_END = 0x800L;
    private static final long OPT_BIT_PARTICIPANT_TYPE = 0x1000L;
    private static final long OPT_BIT_COMMENT = 0x2000L;
    private static final long OPT_BIT_START = 0x4000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.code participantStatus;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference appointment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Reference actor;
    private @javax.annotation.Nullable com.fhir.instant end;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> participantType;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable com.fhir.instant start;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link AppointmentResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantStatus(com.fhir.code participantStatus) {
      checkNotIsSet(participantStatusIsSet(), "participantStatus");
      this.participantStatus = java.util.Objects.requireNonNull(participantStatus, "participantStatus");
      optBits |= OPT_BIT_PARTICIPANT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participantStatus")
    public final Builder participantStatus(java.util.Optional<? extends com.fhir.code> participantStatus) {
      checkNotIsSet(participantStatusIsSet(), "participantStatus");
      this.participantStatus = participantStatus.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the value for the {@link AppointmentResponse#appointment() appointment} attribute.
     * @param appointment The value for appointment 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appointment")
    public final Builder appointment(com.fhir.Reference appointment) {
      checkNotIsSet(appointmentIsSet(), "appointment");
      this.appointment = java.util.Objects.requireNonNull(appointment, "appointment");
      initBits &= ~INIT_BIT_APPOINTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
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
    public final Builder actor(com.fhir.Reference actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = java.util.Objects.requireNonNull(actor, "actor");
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actor")
    public final Builder actor(java.util.Optional<? extends com.fhir.Reference> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = actor.orElse(null);
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(com.fhir.instant end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = java.util.Objects.requireNonNull(end, "end");
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public final Builder end(java.util.Optional<? extends com.fhir.instant> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for chained invocation
     */
    public final Builder participantType(java.util.List<com.fhir.CodeableConcept> participantType) {
      checkNotIsSet(participantTypeIsSet(), "participantType");
      this.participantType = java.util.Objects.requireNonNull(participantType, "participantType");
      optBits |= OPT_BIT_PARTICIPANT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participantType")
    public final Builder participantType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> participantType) {
      checkNotIsSet(participantTypeIsSet(), "participantType");
      this.participantType = participantType.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(com.fhir.instant start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = java.util.Objects.requireNonNull(start, "start");
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public final Builder start(java.util.Optional<? extends com.fhir.instant> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Builds a new {@link AppointmentResponse AppointmentResponse}.
     * @return An immutable instance of AppointmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.AppointmentResponse build() {
      checkRequiredAttributes();
      return new ImmutableAppointmentResponse(
          resourceType,
          contained,
          extension,
          text,
          participantStatus,
          implicitRules,
          id,
          meta,
          language,
          modifierExtension,
          appointment,
          identifier,
          actor,
          end,
          participantType,
          comment,
          start);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean participantStatusIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_STATUS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean actorIsSet() {
      return (optBits & OPT_BIT_ACTOR) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean participantTypeIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT_TYPE) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean appointmentIsSet() {
      return (initBits & INIT_BIT_APPOINTMENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of AppointmentResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!appointmentIsSet()) attributes.add("appointment");
      return "Cannot build AppointmentResponse, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "AppointmentResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AppointmentResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    AppointmentBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "AppointmentResponse", generator = "Immutables")
  public interface AppointmentBuildStage {
    /**
     * Initializes the value for the {@link AppointmentResponse#appointment() appointment} attribute.
     * @param appointment The value for appointment 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointment(com.fhir.Reference appointment);
  }

  @org.immutables.value.Generated(from = "AppointmentResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link AppointmentResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link AppointmentResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link AppointmentResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participantStatus(com.fhir.code participantStatus);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantStatus() participantStatus} to participantStatus.
     * @param participantStatus The value for participantStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participantStatus(java.util.Optional<? extends com.fhir.code> participantStatus);

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link AppointmentResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link AppointmentResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link AppointmentResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link AppointmentResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AppointmentResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link AppointmentResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link AppointmentResponse#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actor(com.fhir.Reference actor);

    /**
     * Initializes the optional value {@link AppointmentResponse#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actor(java.util.Optional<? extends com.fhir.Reference> actor);

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(com.fhir.instant end);

    /**
     * Initializes the optional value {@link AppointmentResponse#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(java.util.Optional<? extends com.fhir.instant> end);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participantType(java.util.List<com.fhir.CodeableConcept> participantType);

    /**
     * Initializes the optional value {@link AppointmentResponse#participantType() participantType} to participantType.
     * @param participantType The value for participantType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participantType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> participantType);

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.lang.String comment);

    /**
     * Initializes the optional value {@link AppointmentResponse#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<java.lang.String> comment);

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(com.fhir.instant start);

    /**
     * Initializes the optional value {@link AppointmentResponse#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(java.util.Optional<? extends com.fhir.instant> start);

    /**
     * Builds a new {@link AppointmentResponse AppointmentResponse}.
     * @return An immutable instance of AppointmentResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AppointmentResponse build();
  }
}
