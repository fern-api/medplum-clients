package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Slot}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSlot.builder()}.
 */
@Generated(from = "Slot", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSlot implements Slot {
  private final @Nullable SlotStatus status;
  private final @Nullable Id id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Code language;
  private final Reference schedule;
  private final @Nullable CodeableConcept appointmentType;
  private final @Nullable Narrative text;
  private final @Nullable Instant start;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> specialty;
  private final @Nullable Instant end;
  private final String resourceType;
  private final @Nullable List<CodeableConcept> serviceCategory;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> serviceType;
  private final @Nullable Boolean overbooked;
  private final @Nullable String comment;

  private ImmutableSlot(
      @Nullable SlotStatus status,
      @Nullable Id id,
      @Nullable List<Extension> extension,
      @Nullable List<Identifier> identifier,
      @Nullable Code language,
      Reference schedule,
      @Nullable CodeableConcept appointmentType,
      @Nullable Narrative text,
      @Nullable Instant start,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> specialty,
      @Nullable Instant end,
      String resourceType,
      @Nullable List<CodeableConcept> serviceCategory,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> serviceType,
      @Nullable Boolean overbooked,
      @Nullable String comment) {
    this.status = status;
    this.id = id;
    this.extension = extension;
    this.identifier = identifier;
    this.language = language;
    this.schedule = schedule;
    this.appointmentType = appointmentType;
    this.text = text;
    this.start = start;
    this.modifierExtension = modifierExtension;
    this.specialty = specialty;
    this.end = end;
    this.resourceType = resourceType;
    this.serviceCategory = serviceCategory;
    this.meta = meta;
    this.contained = contained;
    this.implicitRules = implicitRules;
    this.serviceType = serviceType;
    this.overbooked = overbooked;
    this.comment = comment;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<SlotStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code schedule} attribute
   */
  @JsonProperty("schedule")
  @Override
  public Reference schedule() {
    return schedule;
  }

  /**
   * @return The value of the {@code appointmentType} attribute
   */
  @JsonProperty("appointmentType")
  @Override
  public Optional<CodeableConcept> appointmentType() {
    return Optional.ofNullable(appointmentType);
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
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public Optional<Instant> start() {
    return Optional.ofNullable(start);
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
   * @return The value of the {@code specialty} attribute
   */
  @JsonProperty("specialty")
  @Override
  public Optional<List<CodeableConcept>> specialty() {
    return Optional.ofNullable(specialty);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code serviceCategory} attribute
   */
  @JsonProperty("serviceCategory")
  @Override
  public Optional<List<CodeableConcept>> serviceCategory() {
    return Optional.ofNullable(serviceCategory);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code serviceType} attribute
   */
  @JsonProperty("serviceType")
  @Override
  public Optional<List<CodeableConcept>> serviceType() {
    return Optional.ofNullable(serviceType);
  }

  /**
   * @return The value of the {@code overbooked} attribute
   */
  @JsonProperty("overbooked")
  @Override
  public Optional<Boolean> overbooked() {
    return Optional.ofNullable(overbooked);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withStatus(SlotStatus value) {
    @Nullable SlotStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSlot(
        newValue,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withStatus(Optional<? extends SlotStatus> optional) {
    @Nullable SlotStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSlot(
        value,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSlot(
        this.status,
        newValue,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSlot(
        this.status,
        value,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        newValue,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        value,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        newValue,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        value,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        newValue,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        value,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Slot#schedule() schedule} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for schedule
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSlot withSchedule(Reference value) {
    if (this.schedule == value) return this;
    Reference newValue = Objects.requireNonNull(value, "schedule");
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        newValue,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#appointmentType() appointmentType} attribute.
   * @param value The value for appointmentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withAppointmentType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "appointmentType");
    if (this.appointmentType == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        newValue,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#appointmentType() appointmentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointmentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withAppointmentType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.appointmentType == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        value,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        newValue,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        value,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withStart(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        newValue,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withStart(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        value,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        newValue,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        value,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withSpecialty(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        newValue,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withSpecialty(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        value,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withEnd(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        newValue,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withEnd(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        value,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Slot#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSlot withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        newValue,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#serviceCategory() serviceCategory} attribute.
   * @param value The value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withServiceCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "serviceCategory");
    if (this.serviceCategory == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        newValue,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#serviceCategory() serviceCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withServiceCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.serviceCategory == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        value,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        newValue,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        value,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        newValue,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        value,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        newValue,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        value,
        this.serviceType,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withServiceType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        newValue,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSlot withServiceType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        value,
        this.overbooked,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#overbooked() overbooked} attribute.
   * @param value The value for overbooked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withOverbooked(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.overbooked, newValue)) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        newValue,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#overbooked() overbooked} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for overbooked
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withOverbooked(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.overbooked, value)) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        value,
        this.comment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Slot#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Slot#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSlot withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableSlot(
        this.status,
        this.id,
        this.extension,
        this.identifier,
        this.language,
        this.schedule,
        this.appointmentType,
        this.text,
        this.start,
        this.modifierExtension,
        this.specialty,
        this.end,
        this.resourceType,
        this.serviceCategory,
        this.meta,
        this.contained,
        this.implicitRules,
        this.serviceType,
        this.overbooked,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSlot} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSlot
        && equalTo((ImmutableSlot) another);
  }

  private boolean equalTo(ImmutableSlot another) {
    return Objects.equals(status, another.status)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(language, another.language)
        && schedule.equals(another.schedule)
        && Objects.equals(appointmentType, another.appointmentType)
        && Objects.equals(text, another.text)
        && Objects.equals(start, another.start)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(specialty, another.specialty)
        && Objects.equals(end, another.end)
        && resourceType.equals(another.resourceType)
        && Objects.equals(serviceCategory, another.serviceCategory)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(serviceType, another.serviceType)
        && Objects.equals(overbooked, another.overbooked)
        && Objects.equals(comment, another.comment);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code id}, {@code extension}, {@code identifier}, {@code language}, {@code schedule}, {@code appointmentType}, {@code text}, {@code start}, {@code modifierExtension}, {@code specialty}, {@code end}, {@code resourceType}, {@code serviceCategory}, {@code meta}, {@code contained}, {@code implicitRules}, {@code serviceType}, {@code overbooked}, {@code comment}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + schedule.hashCode();
    h += (h << 5) + Objects.hashCode(appointmentType);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(specialty);
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(serviceCategory);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(serviceType);
    h += (h << 5) + Objects.hashCode(overbooked);
    h += (h << 5) + Objects.hashCode(comment);
    return h;
  }

  /**
   * Prints the immutable value {@code Slot} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Slot{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (language != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("schedule=").append(schedule);
    if (appointmentType != null) {
      builder.append(", ");
      builder.append("appointmentType=").append(appointmentType);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (start != null) {
      builder.append(", ");
      builder.append("start=").append(start);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (serviceCategory != null) {
      builder.append(", ");
      builder.append("serviceCategory=").append(serviceCategory);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (serviceType != null) {
      builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (overbooked != null) {
      builder.append(", ");
      builder.append("overbooked=").append(overbooked);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Slot", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Slot {
    @Nullable Optional<SlotStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Reference schedule;
    @Nullable Optional<CodeableConcept> appointmentType = Optional.empty();
    boolean appointmentTypeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Instant> start = Optional.empty();
    boolean startIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> specialty = Optional.empty();
    boolean specialtyIsSet;
    @Nullable Optional<Instant> end = Optional.empty();
    boolean endIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<CodeableConcept>> serviceCategory = Optional.empty();
    boolean serviceCategoryIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> serviceType = Optional.empty();
    boolean serviceTypeIsSet;
    @Nullable Optional<Boolean> overbooked = Optional.empty();
    boolean overbookedIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<SlotStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("schedule")
    public void setSchedule(Reference schedule) {
      this.schedule = schedule;
    }
    @JsonProperty("appointmentType")
    public void setAppointmentType(Optional<CodeableConcept> appointmentType) {
      this.appointmentType = appointmentType;
      this.appointmentTypeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("start")
    public void setStart(Optional<Instant> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("specialty")
    public void setSpecialty(Optional<List<CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @JsonProperty("end")
    public void setEnd(Optional<Instant> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("serviceCategory")
    public void setServiceCategory(Optional<List<CodeableConcept>> serviceCategory) {
      this.serviceCategory = serviceCategory;
      this.serviceCategoryIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("serviceType")
    public void setServiceType(Optional<List<CodeableConcept>> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @JsonProperty("overbooked")
    public void setOverbooked(Optional<Boolean> overbooked) {
      this.overbooked = overbooked;
      this.overbookedIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @Override
    public Optional<SlotStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Reference schedule() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> appointmentType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> start() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> end() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> serviceCategory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> overbooked() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSlot fromJson(Json json) {
    ImmutableSlot.Builder builder = ((ImmutableSlot.Builder) ImmutableSlot.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.schedule != null) {
      builder.schedule(json.schedule);
    }
    if (json.appointmentTypeIsSet) {
      builder.appointmentType(json.appointmentType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.serviceCategoryIsSet) {
      builder.serviceCategory(json.serviceCategory);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.overbookedIsSet) {
      builder.overbooked(json.overbooked);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
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
        .status(instance.status())
        .id(instance.id())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .language(instance.language())
        .schedule(instance.schedule())
        .appointmentType(instance.appointmentType())
        .text(instance.text())
        .start(instance.start())
        .modifierExtension(instance.modifierExtension())
        .specialty(instance.specialty())
        .end(instance.end())
        .resourceType(instance.resourceType())
        .serviceCategory(instance.serviceCategory())
        .meta(instance.meta())
        .contained(instance.contained())
        .implicitRules(instance.implicitRules())
        .serviceType(instance.serviceType())
        .overbooked(instance.overbooked())
        .comment(instance.comment())
        .build();
  }

  /**
   * Creates a builder for {@link Slot Slot}.
   * <pre>
   * ImmutableSlot.builder()
   *    .status(com.fhir.types.fhir.SlotStatus) // optional {@link Slot#status() status}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Slot#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Slot#extension() extension}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Slot#identifier() identifier}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Slot#language() language}
   *    .schedule(com.fhir.types.fhir.Reference) // required {@link Slot#schedule() schedule}
   *    .appointmentType(com.fhir.types.fhir.CodeableConcept) // optional {@link Slot#appointmentType() appointmentType}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Slot#text() text}
   *    .start(com.fhir.types.fhir.Instant) // optional {@link Slot#start() start}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Slot#modifierExtension() modifierExtension}
   *    .specialty(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Slot#specialty() specialty}
   *    .end(com.fhir.types.fhir.Instant) // optional {@link Slot#end() end}
   *    .resourceType(String) // required {@link Slot#resourceType() resourceType}
   *    .serviceCategory(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Slot#serviceCategory() serviceCategory}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Slot#meta() meta}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Slot#contained() contained}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Slot#implicitRules() implicitRules}
   *    .serviceType(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Slot#serviceType() serviceType}
   *    .overbooked(Boolean) // optional {@link Slot#overbooked() overbooked}
   *    .comment(String) // optional {@link Slot#comment() comment}
   *    .build();
   * </pre>
   * @return A new Slot builder
   */
  public static ScheduleBuildStage builder() {
    return new ImmutableSlot.Builder();
  }

  /**
   * Builds instances of type {@link Slot Slot}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Slot", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ScheduleBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SCHEDULE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_APPOINTMENT_TYPE = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_START = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_SPECIALTY = 0x200L;
    private static final long OPT_BIT_END = 0x400L;
    private static final long OPT_BIT_SERVICE_CATEGORY = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x8000L;
    private static final long OPT_BIT_OVERBOOKED = 0x10000L;
    private static final long OPT_BIT_COMMENT = 0x20000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable SlotStatus status;
    private @Nullable Id id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Identifier> identifier;
    private @Nullable Code language;
    private @Nullable Reference schedule;
    private @Nullable CodeableConcept appointmentType;
    private @Nullable Narrative text;
    private @Nullable Instant start;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> specialty;
    private @Nullable Instant end;
    private @Nullable String resourceType;
    private @Nullable List<CodeableConcept> serviceCategory;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> serviceType;
    private @Nullable Boolean overbooked;
    private @Nullable String comment;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(SlotStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends SlotStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#id() id} to id.
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
     * Initializes the optional value {@link Slot#id() id} to id.
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
     * Initializes the optional value {@link Slot#extension() extension} to extension.
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
     * Initializes the optional value {@link Slot#extension() extension} to extension.
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
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Slot#language() language} to language.
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
     * Initializes the optional value {@link Slot#language() language} to language.
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
     * Initializes the value for the {@link Slot#schedule() schedule} attribute.
     * @param schedule The value for schedule 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("schedule")
    public final Builder schedule(Reference schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = Objects.requireNonNull(schedule, "schedule");
      initBits &= ~INIT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder appointmentType(CodeableConcept appointmentType) {
      checkNotIsSet(appointmentTypeIsSet(), "appointmentType");
      this.appointmentType = Objects.requireNonNull(appointmentType, "appointmentType");
      optBits |= OPT_BIT_APPOINTMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appointmentType")
    public final Builder appointmentType(Optional<? extends CodeableConcept> appointmentType) {
      checkNotIsSet(appointmentTypeIsSet(), "appointmentType");
      this.appointmentType = appointmentType.orElse(null);
      optBits |= OPT_BIT_APPOINTMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#text() text} to text.
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
     * Initializes the optional value {@link Slot#text() text} to text.
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
     * Initializes the optional value {@link Slot#start() start} to start.
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
     * Initializes the optional value {@link Slot#start() start} to start.
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
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialty(List<CodeableConcept> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = Objects.requireNonNull(specialty, "specialty");
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialty")
    public final Builder specialty(Optional<? extends List<CodeableConcept>> specialty) {
      checkNotIsSet(specialtyIsSet(), "specialty");
      this.specialty = specialty.orElse(null);
      optBits |= OPT_BIT_SPECIALTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#end() end} to end.
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
     * Initializes the optional value {@link Slot#end() end} to end.
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
     * Initializes the value for the {@link Slot#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceCategory(List<CodeableConcept> serviceCategory) {
      checkNotIsSet(serviceCategoryIsSet(), "serviceCategory");
      this.serviceCategory = Objects.requireNonNull(serviceCategory, "serviceCategory");
      optBits |= OPT_BIT_SERVICE_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serviceCategory")
    public final Builder serviceCategory(Optional<? extends List<CodeableConcept>> serviceCategory) {
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
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#meta() meta} to meta.
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
     * Initializes the optional value {@link Slot#contained() contained} to contained.
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
     * Initializes the optional value {@link Slot#contained() contained} to contained.
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
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceType(List<CodeableConcept> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = Objects.requireNonNull(serviceType, "serviceType");
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("serviceType")
    public final Builder serviceType(Optional<? extends List<CodeableConcept>> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = serviceType.orElse(null);
      optBits |= OPT_BIT_SERVICE_TYPE;
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
    @JsonProperty("overbooked")
    public final Builder overbooked(Optional<Boolean> overbooked) {
      checkNotIsSet(overbookedIsSet(), "overbooked");
      this.overbooked = overbooked.orElse(null);
      optBits |= OPT_BIT_OVERBOOKED;
      return this;
    }

    /**
     * Initializes the optional value {@link Slot#comment() comment} to comment.
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
     * Initializes the optional value {@link Slot#comment() comment} to comment.
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
     * Builds a new {@link Slot Slot}.
     * @return An immutable instance of Slot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Slot build() {
      checkRequiredAttributes();
      return new ImmutableSlot(
          status,
          id,
          extension,
          identifier,
          language,
          schedule,
          appointmentType,
          text,
          start,
          modifierExtension,
          specialty,
          end,
          resourceType,
          serviceCategory,
          meta,
          contained,
          implicitRules,
          serviceType,
          overbooked,
          comment);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean appointmentTypeIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean serviceCategoryIsSet() {
      return (optBits & OPT_BIT_SERVICE_CATEGORY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean overbookedIsSet() {
      return (optBits & OPT_BIT_OVERBOOKED) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean scheduleIsSet() {
      return (initBits & INIT_BIT_SCHEDULE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Slot is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!scheduleIsSet()) attributes.add("schedule");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Slot, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Slot", generator = "Immutables")
  public interface ScheduleBuildStage {
    /**
     * Initializes the value for the {@link Slot#schedule() schedule} attribute.
     * @param schedule The value for schedule 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage schedule(Reference schedule);
  }

  @Generated(from = "Slot", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Slot#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Slot", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(SlotStatus status);

    /**
     * Initializes the optional value {@link Slot#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends SlotStatus> status);

    /**
     * Initializes the optional value {@link Slot#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Slot#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Slot#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Slot#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Slot#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Slot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Slot#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appointmentType(CodeableConcept appointmentType);

    /**
     * Initializes the optional value {@link Slot#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointmentType(Optional<? extends CodeableConcept> appointmentType);

    /**
     * Initializes the optional value {@link Slot#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Slot#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Slot#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(Instant start);

    /**
     * Initializes the optional value {@link Slot#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(Optional<? extends Instant> start);

    /**
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Slot#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(List<CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link Slot#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(Optional<? extends List<CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link Slot#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(Instant end);

    /**
     * Initializes the optional value {@link Slot#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(Optional<? extends Instant> end);

    /**
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceCategory(List<CodeableConcept> serviceCategory);

    /**
     * Initializes the optional value {@link Slot#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceCategory(Optional<? extends List<CodeableConcept>> serviceCategory);

    /**
     * Initializes the optional value {@link Slot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Slot#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Slot#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Slot#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Slot#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(List<CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Slot#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(Optional<? extends List<CodeableConcept>> serviceType);

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
    BuildFinal overbooked(Optional<Boolean> overbooked);

    /**
     * Initializes the optional value {@link Slot#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link Slot#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Builds a new {@link Slot Slot}.
     * @return An immutable instance of Slot
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Slot build();
  }
}
