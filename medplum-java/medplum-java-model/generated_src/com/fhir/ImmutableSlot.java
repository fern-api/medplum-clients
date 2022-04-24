//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Slot}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSlot.builder()}.
 */
@org.immutables.value.Generated(from = "Slot", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSlot implements com.fhir.Slot {
  private final @javax.annotation.Nullable com.fhir.instant start;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.Boolean overbooked;
  private final @javax.annotation.Nullable com.fhir.SlotStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept appointmentType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final com.fhir.Reference schedule;
  private final @javax.annotation.Nullable com.fhir.instant end;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;

  private ImmutableSlot(
      @javax.annotation.Nullable com.fhir.instant start,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.Boolean overbooked,
      @javax.annotation.Nullable com.fhir.SlotStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept appointmentType,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      com.fhir.Reference schedule,
      @javax.annotation.Nullable com.fhir.instant end,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty) {
    this.start = start;
    this.comment = comment;
    this.text = text;
    this.resourceType = resourceType;
    this.overbooked = overbooked;
    this.status = status;
    this.extension = extension;
    this.language = language;
    this.appointmentType = appointmentType;
    this.contained = contained;
    this.id = id;
    this.identifier = identifier;
    this.serviceType = serviceType;
    this.modifierExtension = modifierExtension;
    this.serviceCategory = serviceCategory;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.schedule = schedule;
    this.end = end;
    this.specialty = specialty;
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
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code overbooked} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("overbooked")
  @Override
  public java.util.Optional<java.lang.Boolean> overbooked() {
    return java.util.Optional.ofNullable(overbooked);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.SlotStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code appointmentType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("appointmentType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> appointmentType() {
    return java.util.Optional.ofNullable(appointmentType);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code serviceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType() {
    return java.util.Optional.ofNullable(serviceType);
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
   * @return The value of the {@code serviceCategory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory() {
    return java.util.Optional.ofNullable(serviceCategory);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code schedule} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("schedule")
  @Override
  public com.fhir.Reference schedule() {
    return schedule;
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
   * @return The value of the {@code specialty} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialty")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() {
    return java.util.Optional.ofNullable(specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withStart(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableSlot(
        newValue,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withStart(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableSlot(
        value,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSlot(
        this.start,
        newValue,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableSlot(
        this.start,
        value,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        newValue,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        value,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Slot#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSlot withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        newValue,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#overbooked() overbooked} attribute.
   * @param value The value for overbooked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withOverbooked(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.overbooked, newValue)) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        newValue,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#overbooked() overbooked} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for overbooked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withOverbooked(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.overbooked, value)) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        value,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withStatus(com.fhir.SlotStatus value) {
    @javax.annotation.Nullable com.fhir.SlotStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        newValue,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withStatus(java.util.Optional<? extends com.fhir.SlotStatus> optional) {
    @javax.annotation.Nullable com.fhir.SlotStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        value,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        newValue,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        value,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        newValue,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        value,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#appointmentType() appointmentType} attribute.
   * @param value The value for appointmentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withAppointmentType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "appointmentType");
    if (this.appointmentType == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        newValue,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#appointmentType() appointmentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointmentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withAppointmentType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.appointmentType == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        value,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        newValue,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        value,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        newValue,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        value,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        newValue,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        value,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withServiceType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withServiceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        value,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        newValue,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        value,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#serviceCategory() serviceCategory} attribute.
   * @param value The value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withServiceCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "serviceCategory");
    if (this.serviceCategory == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        newValue,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#serviceCategory() serviceCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withServiceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.serviceCategory == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        value,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        newValue,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        value,
        this.implicitRules,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        newValue,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        value,
        this.schedule,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Slot#schedule() schedule} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for schedule
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSlot withSchedule(com.fhir.Reference value) {
    if (this.schedule == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "schedule");
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        newValue,
        this.end,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withEnd(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        newValue,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withEnd(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        value,
        this.specialty);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withSpecialty(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withSpecialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableSlot(
        this.start,
        this.comment,
        this.text,
        this.resourceType,
        this.overbooked,
        this.status,
        this.extension,
        this.language,
        this.appointmentType,
        this.contained,
        this.id,
        this.identifier,
        this.serviceType,
        this.modifierExtension,
        this.serviceCategory,
        this.meta,
        this.implicitRules,
        this.schedule,
        this.end,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSlot} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSlot
        && equalTo((ImmutableSlot) another);
  }

  private boolean equalTo(ImmutableSlot another) {
    return java.util.Objects.equals(start, another.start)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(overbooked, another.overbooked)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(appointmentType, another.appointmentType)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(serviceType, another.serviceType)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(serviceCategory, another.serviceCategory)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && schedule.equals(another.schedule)
        && java.util.Objects.equals(end, another.end)
        && java.util.Objects.equals(specialty, another.specialty);
  }

  /**
   * Computes a hash code from attributes: {@code start}, {@code comment}, {@code text}, {@code resourceType}, {@code overbooked}, {@code status}, {@code extension}, {@code language}, {@code appointmentType}, {@code contained}, {@code id}, {@code identifier}, {@code serviceType}, {@code modifierExtension}, {@code serviceCategory}, {@code meta}, {@code implicitRules}, {@code schedule}, {@code end}, {@code specialty}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(start);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(overbooked);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(appointmentType);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(serviceType);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(serviceCategory);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + schedule.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(end);
    h += (h << 5) + java.util.Objects.hashCode(specialty);
    return h;
  }

  /**
   * Prints the immutable value {@code Slot} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Slot{");
    if (start != null) {
      builder.append("start=").append(start);
    }
    if (comment != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (text != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (overbooked != null) {
      builder.append(", ");
      builder.append("overbooked=").append(overbooked);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (appointmentType != null) {
      builder.append(", ");
      builder.append("appointmentType=").append(appointmentType);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (serviceType != null) {
      builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (serviceCategory != null) {
      builder.append(", ");
      builder.append("serviceCategory=").append(serviceCategory);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("schedule=").append(schedule);
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Slot", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Slot {
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> start = java.util.Optional.empty();
    boolean startIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> overbooked = java.util.Optional.empty();
    boolean overbookedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SlotStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> appointmentType = java.util.Optional.empty();
    boolean appointmentTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType = java.util.Optional.empty();
    boolean serviceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory = java.util.Optional.empty();
    boolean serviceCategoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable com.fhir.Reference schedule;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> end = java.util.Optional.empty();
    boolean endIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty = java.util.Optional.empty();
    boolean specialtyIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public void setStart(java.util.Optional<com.fhir.instant> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("overbooked")
    public void setOverbooked(java.util.Optional<java.lang.Boolean> overbooked) {
      this.overbooked = overbooked;
      this.overbookedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.SlotStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("appointmentType")
    public void setAppointmentType(java.util.Optional<com.fhir.CodeableConcept> appointmentType) {
      this.appointmentType = appointmentType;
      this.appointmentTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    public void setServiceType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
    public void setServiceCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory) {
      this.serviceCategory = serviceCategory;
      this.serviceCategoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    public void setSchedule(com.fhir.Reference schedule) {
      this.schedule = schedule;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public void setEnd(java.util.Optional<com.fhir.instant> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public void setSpecialty(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.instant> start() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> overbooked() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SlotStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> appointmentType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference schedule() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> end() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSlot fromJson(Json json) {
    ImmutableSlot.Builder builder = ((ImmutableSlot.Builder) ImmutableSlot.builder());
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.overbookedIsSet) {
      builder.overbooked(json.overbooked);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.appointmentTypeIsSet) {
      builder.appointmentType(json.appointmentType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.serviceCategoryIsSet) {
      builder.serviceCategory(json.serviceCategory);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.schedule != null) {
      builder.schedule(json.schedule);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    return (ImmutableSlot) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Slot} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Slot instance
   */
  public static Slot copyOf(Slot instance) {
    if (instance instanceof ImmutableSlot) {
      return (ImmutableSlot) instance;
    }
    return ((ImmutableSlot.Builder) ImmutableSlot.builder())
        .start(instance.start())
        .comment(instance.comment())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .overbooked(instance.overbooked())
        .status(instance.status())
        .extension(instance.extension())
        .language(instance.language())
        .appointmentType(instance.appointmentType())
        .contained(instance.contained())
        .id(instance.id())
        .identifier(instance.identifier())
        .serviceType(instance.serviceType())
        .modifierExtension(instance.modifierExtension())
        .serviceCategory(instance.serviceCategory())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .schedule(instance.schedule())
        .end(instance.end())
        .specialty(instance.specialty())
        .build();
  }

  /**
   * Creates a builder for {@link Slot Slot}.
   * <pre>
   * ImmutableSlot.builder()
   *    .start(com.fhir.instant) // optional {@link Slot#start() start}
   *    .comment(String) // optional {@link Slot#comment() comment}
   *    .text(com.fhir.Narrative) // optional {@link Slot#text() text}
   *    .resourceType(String) // required {@link Slot#resourceType() resourceType}
   *    .overbooked(Boolean) // optional {@link Slot#overbooked() overbooked}
   *    .status(com.fhir.SlotStatus) // optional {@link Slot#status() status}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Slot#extension() extension}
   *    .language(com.fhir.code) // optional {@link Slot#language() language}
   *    .appointmentType(com.fhir.CodeableConcept) // optional {@link Slot#appointmentType() appointmentType}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Slot#contained() contained}
   *    .id(com.fhir.id) // optional {@link Slot#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Slot#identifier() identifier}
   *    .serviceType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Slot#serviceType() serviceType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Slot#modifierExtension() modifierExtension}
   *    .serviceCategory(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Slot#serviceCategory() serviceCategory}
   *    .meta(com.fhir.Meta) // optional {@link Slot#meta() meta}
   *    .implicitRules(com.fhir.uri) // optional {@link Slot#implicitRules() implicitRules}
   *    .schedule(com.fhir.Reference) // required {@link Slot#schedule() schedule}
   *    .end(com.fhir.instant) // optional {@link Slot#end() end}
   *    .specialty(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Slot#specialty() specialty}
   *    .build();
   * </pre>
   * @return A new Slot builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSlot.Builder();
  }

  /**
   * Builds instances of type {@link Slot Slot}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Slot", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ScheduleBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SCHEDULE = 0x2L;
    private static final long OPT_BIT_START = 0x1L;
    private static final long OPT_BIT_COMMENT = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_OVERBOOKED = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_APPOINTMENT_TYPE = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_SERVICE_CATEGORY = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_END = 0x10000L;
    private static final long OPT_BIT_SPECIALTY = 0x20000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.instant start;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.Boolean overbooked;
    private @javax.annotation.Nullable com.fhir.SlotStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept appointmentType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference schedule;
    private @javax.annotation.Nullable com.fhir.instant end;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Slot#start() start} to start.
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
     * Initializes the optional value {@link Slot#start() start} to start.
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
     * Initializes the optional value {@link Slot#comment() comment} to comment.
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
     * Initializes the optional value {@link Slot#comment() comment} to comment.
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
     * Initializes the optional value {@link Slot#text() text} to text.
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
     * Initializes the optional value {@link Slot#text() text} to text.
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
     * Initializes the value for the {@link Slot#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Slot#overbooked() overbooked} to overbooked.
     * @param overbooked The value for overbooked
     * @return {@code this} builder for chained invocation
     */
    public final Builder overbooked(boolean overbooked) {
      checkNotIsSet(overbookedIsSet(), "overbooked");
      this.overbooked = overbooked;
      optBits |= OPT_BIT_OVERBOOKED;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#overbooked() overbooked} to overbooked.
     * @param overbooked The value for overbooked
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overbooked")
    public final Builder overbooked(java.util.Optional<java.lang.Boolean> overbooked) {
      checkNotIsSet(overbookedIsSet(), "overbooked");
      this.overbooked = overbooked.orElse(null);
      optBits |= OPT_BIT_OVERBOOKED;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.SlotStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.SlotStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#extension() extension} to extension.
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
     * Initializes the optional value {@link Slot#extension() extension} to extension.
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
     * Initializes the optional value {@link Slot#language() language} to language.
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
     * Initializes the optional value {@link Slot#language() language} to language.
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
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder appointmentType(com.fhir.CodeableConcept appointmentType) {
      checkNotIsSet(appointmentTypeIsSet(), "appointmentType");
      this.appointmentType = java.util.Objects.requireNonNull(appointmentType, "appointmentType");
      optBits |= OPT_BIT_APPOINTMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appointmentType")
    public final Builder appointmentType(java.util.Optional<? extends com.fhir.CodeableConcept> appointmentType) {
      checkNotIsSet(appointmentTypeIsSet(), "appointmentType");
      this.appointmentType = appointmentType.orElse(null);
      optBits |= OPT_BIT_APPOINTMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#contained() contained} to contained.
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
     * Initializes the optional value {@link Slot#contained() contained} to contained.
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
     * Initializes the optional value {@link Slot#id() id} to id.
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
     * Initializes the optional value {@link Slot#id() id} to id.
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
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceType(java.util.List<com.fhir.CodeableConcept> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = java.util.Objects.requireNonNull(serviceType, "serviceType");
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    public final Builder serviceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = serviceType.orElse(null);
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceCategory(java.util.List<com.fhir.CodeableConcept> serviceCategory) {
      checkNotIsSet(serviceCategoryIsSet(), "serviceCategory");
      this.serviceCategory = java.util.Objects.requireNonNull(serviceCategory, "serviceCategory");
      optBits |= OPT_BIT_SERVICE_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
    public final Builder serviceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceCategory) {
      checkNotIsSet(serviceCategoryIsSet(), "serviceCategory");
      this.serviceCategory = serviceCategory.orElse(null);
      optBits |= OPT_BIT_SERVICE_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#meta() meta} to meta.
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
     * Initializes the optional value {@link Slot#meta() meta} to meta.
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
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link Slot#schedule() schedule} attribute.
     * @param schedule The value for schedule 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    public final Builder schedule(com.fhir.Reference schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = java.util.Objects.requireNonNull(schedule, "schedule");
      initBits &= ~INIT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#end() end} to end.
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
     * Initializes the optional value {@link Slot#end() end} to end.
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
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialty(java.util.List<com.fhir.CodeableConcept> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = java.util.Objects.requireNonNull(specialty, "specialty");
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public final Builder specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = specialty.orElse(null);
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Builds a new {@link Slot Slot}.
     * @return An immutable instance of Slot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Slot build() {
      checkRequiredAttributes();
      return new ImmutableSlot(
          start,
          comment,
          text,
          resourceType,
          overbooked,
          status,
          extension,
          language,
          appointmentType,
          contained,
          id,
          identifier,
          serviceType,
          modifierExtension,
          serviceCategory,
          meta,
          implicitRules,
          schedule,
          end,
          specialty);
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean overbookedIsSet() {
      return (optBits & OPT_BIT_OVERBOOKED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean appointmentTypeIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT_TYPE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean serviceCategoryIsSet() {
      return (optBits & OPT_BIT_SERVICE_CATEGORY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean scheduleIsSet() {
      return (initBits & INIT_BIT_SCHEDULE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Slot is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!scheduleIsSet()) attributes.add("schedule");
      return "Cannot build Slot, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Slot", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Slot#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ScheduleBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Slot", generator = "Immutables")
  public interface ScheduleBuildStage {
    /**
     * Initializes the value for the {@link Slot#schedule() schedule} attribute.
     * @param schedule The value for schedule 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal schedule(com.fhir.Reference schedule);
  }

  @org.immutables.value.Generated(from = "Slot", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Slot#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(com.fhir.instant start);

    /**
     * Initializes the optional value {@link Slot#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(java.util.Optional<? extends com.fhir.instant> start);

    /**
     * Initializes the optional value {@link Slot#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.lang.String comment);

    /**
     * Initializes the optional value {@link Slot#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<java.lang.String> comment);

    /**
     * Initializes the optional value {@link Slot#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Slot#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Slot#overbooked() overbooked} to overbooked.
     * @param overbooked The value for overbooked
     * @return {@code this} builder for chained invocation
     */
    BuildFinal overbooked(boolean overbooked);

    /**
     * Initializes the optional value {@link Slot#overbooked() overbooked} to overbooked.
     * @param overbooked The value for overbooked
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal overbooked(java.util.Optional<java.lang.Boolean> overbooked);

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.SlotStatus status);

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.SlotStatus> status);

    /**
     * Initializes the optional value {@link Slot#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Slot#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Slot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Slot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appointmentType(com.fhir.CodeableConcept appointmentType);

    /**
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointmentType(java.util.Optional<? extends com.fhir.CodeableConcept> appointmentType);

    /**
     * Initializes the optional value {@link Slot#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Slot#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Slot#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Slot#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(java.util.List<com.fhir.CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceType);

    /**
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceCategory(java.util.List<com.fhir.CodeableConcept> serviceCategory);

    /**
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceCategory);

    /**
     * Initializes the optional value {@link Slot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Slot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Slot#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(com.fhir.instant end);

    /**
     * Initializes the optional value {@link Slot#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(java.util.Optional<? extends com.fhir.instant> end);

    /**
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(java.util.List<com.fhir.CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty);

    /**
     * Builds a new {@link Slot Slot}.
     * @return An immutable instance of Slot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Slot build();
  }
}
