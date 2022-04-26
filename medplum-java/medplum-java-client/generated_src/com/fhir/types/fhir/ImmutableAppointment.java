package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Appointment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppointment.builder()}.
 */
@Generated(from = "Appointment", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAppointment implements Appointment {
  private final @Nullable Id id;
  private final @Nullable PositiveInt minutesDuration;
  private final @Nullable List<Extension> extension;
  private final List<Appointment_Participant> participant;
  private final @Nullable Meta meta;
  private final @Nullable UnsignedInt priority;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Instant end;
  private final @Nullable List<CodeableConcept> specialty;
  private final @Nullable String patientInstruction;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable AppointmentStatus status;
  private final @Nullable List<Reference> supportingInformation;
  private final @Nullable String comment;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Code language;
  private final @Nullable CodeableConcept appointmentType;
  private final @Nullable String description;
  private final @Nullable List<CodeableConcept> serviceCategory;
  private final @Nullable Narrative text;
  private final @Nullable CodeableConcept cancelationReason;
  private final @Nullable List<Period> requestedPeriod;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Reference> basedOn;
  private final String resourceType;
  private final @Nullable List<CodeableConcept> serviceType;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Instant start;
  private final @Nullable DateTime created;
  private final @Nullable List<Reference> slot;

  private ImmutableAppointment(
      @Nullable Id id,
      @Nullable PositiveInt minutesDuration,
      @Nullable List<Extension> extension,
      List<Appointment_Participant> participant,
      @Nullable Meta meta,
      @Nullable UnsignedInt priority,
      @Nullable List<Extension> modifierExtension,
      @Nullable Instant end,
      @Nullable List<CodeableConcept> specialty,
      @Nullable String patientInstruction,
      @Nullable List<Identifier> identifier,
      @Nullable AppointmentStatus status,
      @Nullable List<Reference> supportingInformation,
      @Nullable String comment,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Code language,
      @Nullable CodeableConcept appointmentType,
      @Nullable String description,
      @Nullable List<CodeableConcept> serviceCategory,
      @Nullable Narrative text,
      @Nullable CodeableConcept cancelationReason,
      @Nullable List<Period> requestedPeriod,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable List<Reference> basedOn,
      String resourceType,
      @Nullable List<CodeableConcept> serviceType,
      @Nullable List<Reference> reasonReference,
      @Nullable Instant start,
      @Nullable DateTime created,
      @Nullable List<Reference> slot) {
    this.id = id;
    this.minutesDuration = minutesDuration;
    this.extension = extension;
    this.participant = participant;
    this.meta = meta;
    this.priority = priority;
    this.modifierExtension = modifierExtension;
    this.end = end;
    this.specialty = specialty;
    this.patientInstruction = patientInstruction;
    this.identifier = identifier;
    this.status = status;
    this.supportingInformation = supportingInformation;
    this.comment = comment;
    this.reasonCode = reasonCode;
    this.language = language;
    this.appointmentType = appointmentType;
    this.description = description;
    this.serviceCategory = serviceCategory;
    this.text = text;
    this.cancelationReason = cancelationReason;
    this.requestedPeriod = requestedPeriod;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.basedOn = basedOn;
    this.resourceType = resourceType;
    this.serviceType = serviceType;
    this.reasonReference = reasonReference;
    this.start = start;
    this.created = created;
    this.slot = slot;
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
   * @return The value of the {@code minutesDuration} attribute
   */
  @JsonProperty("minutesDuration")
  @Override
  public Optional<PositiveInt> minutesDuration() {
    return Optional.ofNullable(minutesDuration);
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
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public List<Appointment_Participant> participant() {
    return participant;
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<UnsignedInt> priority() {
    return Optional.ofNullable(priority);
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
   * @return The value of the {@code end} attribute
   */
  @JsonProperty("end")
  @Override
  public Optional<Instant> end() {
    return Optional.ofNullable(end);
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
   * @return The value of the {@code patientInstruction} attribute
   */
  @JsonProperty("patientInstruction")
  @Override
  public Optional<String> patientInstruction() {
    return Optional.ofNullable(patientInstruction);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<AppointmentStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code supportingInformation} attribute
   */
  @JsonProperty("supportingInformation")
  @Override
  public Optional<List<Reference>> supportingInformation() {
    return Optional.ofNullable(supportingInformation);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code appointmentType} attribute
   */
  @JsonProperty("appointmentType")
  @Override
  public Optional<CodeableConcept> appointmentType() {
    return Optional.ofNullable(appointmentType);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code cancelationReason} attribute
   */
  @JsonProperty("cancelationReason")
  @Override
  public Optional<CodeableConcept> cancelationReason() {
    return Optional.ofNullable(cancelationReason);
  }

  /**
   * @return The value of the {@code requestedPeriod} attribute
   */
  @JsonProperty("requestedPeriod")
  @Override
  public Optional<List<Period>> requestedPeriod() {
    return Optional.ofNullable(requestedPeriod);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
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
   * @return The value of the {@code serviceType} attribute
   */
  @JsonProperty("serviceType")
  @Override
  public Optional<List<CodeableConcept>> serviceType() {
    return Optional.ofNullable(serviceType);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
  }

  /**
   * @return The value of the {@code slot} attribute
   */
  @JsonProperty("slot")
  @Override
  public Optional<List<Reference>> slot() {
    return Optional.ofNullable(slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAppointment(
        newValue,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAppointment(
        value,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#minutesDuration() minutesDuration} attribute.
   * @param value The value for minutesDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withMinutesDuration(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "minutesDuration");
    if (this.minutesDuration == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        newValue,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#minutesDuration() minutesDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for minutesDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withMinutesDuration(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.minutesDuration == value) return this;
    return new ImmutableAppointment(
        this.id,
        value,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        newValue,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        value,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Appointment#participant() participant}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withParticipant(Appointment_Participant... elements) {
    List<Appointment_Participant> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        newValue,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Appointment#participant() participant}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of participant elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withParticipant(Iterable<? extends Appointment_Participant> elements) {
    if (this.participant == elements) return this;
    List<Appointment_Participant> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        newValue,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        newValue,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        value,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withPriority(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        newValue,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withPriority(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        value,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        newValue,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        value,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withEnd(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        newValue,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withEnd(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        value,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withSpecialty(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        newValue,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withSpecialty(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        value,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#patientInstruction() patientInstruction} attribute.
   * @param value The value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withPatientInstruction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "patientInstruction");
    if (Objects.equals(this.patientInstruction, newValue)) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        newValue,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#patientInstruction() patientInstruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withPatientInstruction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.patientInstruction, value)) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        value,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        newValue,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        value,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withStatus(AppointmentStatus value) {
    @Nullable AppointmentStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        newValue,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withStatus(Optional<? extends AppointmentStatus> optional) {
    @Nullable AppointmentStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        value,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withSupportingInformation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        newValue,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withSupportingInformation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        value,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        newValue,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        value,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        newValue,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        value,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        newValue,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        value,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#appointmentType() appointmentType} attribute.
   * @param value The value for appointmentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withAppointmentType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "appointmentType");
    if (this.appointmentType == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        newValue,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#appointmentType() appointmentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointmentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withAppointmentType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.appointmentType == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        value,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        newValue,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        value,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#serviceCategory() serviceCategory} attribute.
   * @param value The value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withServiceCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "serviceCategory");
    if (this.serviceCategory == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        newValue,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#serviceCategory() serviceCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withServiceCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.serviceCategory == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        value,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        newValue,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        value,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#cancelationReason() cancelationReason} attribute.
   * @param value The value for cancelationReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withCancelationReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "cancelationReason");
    if (this.cancelationReason == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        newValue,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#cancelationReason() cancelationReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cancelationReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withCancelationReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.cancelationReason == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        value,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#requestedPeriod() requestedPeriod} attribute.
   * @param value The value for requestedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withRequestedPeriod(List<Period> value) {
    @Nullable List<Period> newValue = Objects.requireNonNull(value, "requestedPeriod");
    if (this.requestedPeriod == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        newValue,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#requestedPeriod() requestedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withRequestedPeriod(Optional<? extends List<Period>> optional) {
    @Nullable List<Period> value = optional.orElse(null);
    if (this.requestedPeriod == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        value,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        newValue,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        value,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        newValue,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        value,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        newValue,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        value,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Appointment#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppointment withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        newValue,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withServiceType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        newValue,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withServiceType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        value,
        this.reasonReference,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        newValue,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        value,
        this.start,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withStart(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        newValue,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withStart(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        value,
        this.created,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        newValue,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        value,
        this.slot);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#slot() slot} attribute.
   * @param value The value for slot
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withSlot(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "slot");
    if (this.slot == newValue) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#slot() slot} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for slot
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withSlot(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.slot == value) return this;
    return new ImmutableAppointment(
        this.id,
        this.minutesDuration,
        this.extension,
        this.participant,
        this.meta,
        this.priority,
        this.modifierExtension,
        this.end,
        this.specialty,
        this.patientInstruction,
        this.identifier,
        this.status,
        this.supportingInformation,
        this.comment,
        this.reasonCode,
        this.language,
        this.appointmentType,
        this.description,
        this.serviceCategory,
        this.text,
        this.cancelationReason,
        this.requestedPeriod,
        this.implicitRules,
        this.contained,
        this.basedOn,
        this.resourceType,
        this.serviceType,
        this.reasonReference,
        this.start,
        this.created,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppointment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppointment
        && equalTo((ImmutableAppointment) another);
  }

  private boolean equalTo(ImmutableAppointment another) {
    return Objects.equals(id, another.id)
        && Objects.equals(minutesDuration, another.minutesDuration)
        && Objects.equals(extension, another.extension)
        && participant.equals(another.participant)
        && Objects.equals(meta, another.meta)
        && Objects.equals(priority, another.priority)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(end, another.end)
        && Objects.equals(specialty, another.specialty)
        && Objects.equals(patientInstruction, another.patientInstruction)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(status, another.status)
        && Objects.equals(supportingInformation, another.supportingInformation)
        && Objects.equals(comment, another.comment)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(language, another.language)
        && Objects.equals(appointmentType, another.appointmentType)
        && Objects.equals(description, another.description)
        && Objects.equals(serviceCategory, another.serviceCategory)
        && Objects.equals(text, another.text)
        && Objects.equals(cancelationReason, another.cancelationReason)
        && Objects.equals(requestedPeriod, another.requestedPeriod)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(basedOn, another.basedOn)
        && resourceType.equals(another.resourceType)
        && Objects.equals(serviceType, another.serviceType)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(start, another.start)
        && Objects.equals(created, another.created)
        && Objects.equals(slot, another.slot);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code minutesDuration}, {@code extension}, {@code participant}, {@code meta}, {@code priority}, {@code modifierExtension}, {@code end}, {@code specialty}, {@code patientInstruction}, {@code identifier}, {@code status}, {@code supportingInformation}, {@code comment}, {@code reasonCode}, {@code language}, {@code appointmentType}, {@code description}, {@code serviceCategory}, {@code text}, {@code cancelationReason}, {@code requestedPeriod}, {@code implicitRules}, {@code contained}, {@code basedOn}, {@code resourceType}, {@code serviceType}, {@code reasonReference}, {@code start}, {@code created}, {@code slot}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(minutesDuration);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + participant.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + Objects.hashCode(specialty);
    h += (h << 5) + Objects.hashCode(patientInstruction);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(supportingInformation);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(appointmentType);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(serviceCategory);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(cancelationReason);
    h += (h << 5) + Objects.hashCode(requestedPeriod);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(serviceType);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(slot);
    return h;
  }

  /**
   * Prints the immutable value {@code Appointment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Appointment{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (minutesDuration != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("minutesDuration=").append(minutesDuration);
    }
    if (extension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("participant=").append(participant);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (patientInstruction != null) {
      builder.append(", ");
      builder.append("patientInstruction=").append(patientInstruction);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (appointmentType != null) {
      builder.append(", ");
      builder.append("appointmentType=").append(appointmentType);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (serviceCategory != null) {
      builder.append(", ");
      builder.append("serviceCategory=").append(serviceCategory);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (cancelationReason != null) {
      builder.append(", ");
      builder.append("cancelationReason=").append(cancelationReason);
    }
    if (requestedPeriod != null) {
      builder.append(", ");
      builder.append("requestedPeriod=").append(requestedPeriod);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (serviceType != null) {
      builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (start != null) {
      builder.append(", ");
      builder.append("start=").append(start);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (slot != null) {
      builder.append(", ");
      builder.append("slot=").append(slot);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Appointment", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Appointment {
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<PositiveInt> minutesDuration = Optional.empty();
    boolean minutesDurationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable List<Appointment_Participant> participant = Collections.emptyList();
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<UnsignedInt> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Instant> end = Optional.empty();
    boolean endIsSet;
    @Nullable Optional<List<CodeableConcept>> specialty = Optional.empty();
    boolean specialtyIsSet;
    @Nullable Optional<String> patientInstruction = Optional.empty();
    boolean patientInstructionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<AppointmentStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Reference>> supportingInformation = Optional.empty();
    boolean supportingInformationIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<CodeableConcept> appointmentType = Optional.empty();
    boolean appointmentTypeIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<CodeableConcept>> serviceCategory = Optional.empty();
    boolean serviceCategoryIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CodeableConcept> cancelationReason = Optional.empty();
    boolean cancelationReasonIsSet;
    @Nullable Optional<List<Period>> requestedPeriod = Optional.empty();
    boolean requestedPeriodIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<CodeableConcept>> serviceType = Optional.empty();
    boolean serviceTypeIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Instant> start = Optional.empty();
    boolean startIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<List<Reference>> slot = Optional.empty();
    boolean slotIsSet;
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("minutesDuration")
    public void setMinutesDuration(Optional<PositiveInt> minutesDuration) {
      this.minutesDuration = minutesDuration;
      this.minutesDurationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(List<Appointment_Participant> participant) {
      this.participant = participant;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<UnsignedInt> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("end")
    public void setEnd(Optional<Instant> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("specialty")
    public void setSpecialty(Optional<List<CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @JsonProperty("patientInstruction")
    public void setPatientInstruction(Optional<String> patientInstruction) {
      this.patientInstruction = patientInstruction;
      this.patientInstructionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<AppointmentStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(Optional<List<Reference>> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("appointmentType")
    public void setAppointmentType(Optional<CodeableConcept> appointmentType) {
      this.appointmentType = appointmentType;
      this.appointmentTypeIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("serviceCategory")
    public void setServiceCategory(Optional<List<CodeableConcept>> serviceCategory) {
      this.serviceCategory = serviceCategory;
      this.serviceCategoryIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("cancelationReason")
    public void setCancelationReason(Optional<CodeableConcept> cancelationReason) {
      this.cancelationReason = cancelationReason;
      this.cancelationReasonIsSet = true;
    }
    @JsonProperty("requestedPeriod")
    public void setRequestedPeriod(Optional<List<Period>> requestedPeriod) {
      this.requestedPeriod = requestedPeriod;
      this.requestedPeriodIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("serviceType")
    public void setServiceType(Optional<List<CodeableConcept>> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("start")
    public void setStart(Optional<Instant> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("slot")
    public void setSlot(Optional<List<Reference>> slot) {
      this.slot = slot;
      this.slotIsSet = true;
    }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> minutesDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public List<Appointment_Participant> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> end() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> patientInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AppointmentStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> appointmentType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> serviceCategory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> cancelationReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Period>> requestedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> start() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> slot() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppointment fromJson(Json json) {
    ImmutableAppointment.Builder builder = ((ImmutableAppointment.Builder) ImmutableAppointment.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.minutesDurationIsSet) {
      builder.minutesDuration(json.minutesDuration);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.participant != null) {
      builder.addAllParticipant(json.participant);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.patientInstructionIsSet) {
      builder.patientInstruction(json.patientInstruction);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.appointmentTypeIsSet) {
      builder.appointmentType(json.appointmentType);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.serviceCategoryIsSet) {
      builder.serviceCategory(json.serviceCategory);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.cancelationReasonIsSet) {
      builder.cancelationReason(json.cancelationReason);
    }
    if (json.requestedPeriodIsSet) {
      builder.requestedPeriod(json.requestedPeriod);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.slotIsSet) {
      builder.slot(json.slot);
    }
    return (ImmutableAppointment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Appointment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Appointment instance
   */
  public static Appointment copyOf(Appointment instance) {
    if (instance instanceof ImmutableAppointment) {
      return (ImmutableAppointment) instance;
    }
    return ((ImmutableAppointment.Builder) ImmutableAppointment.builder())
        .id(instance.id())
        .minutesDuration(instance.minutesDuration())
        .extension(instance.extension())
        .addAllParticipant(instance.participant())
        .meta(instance.meta())
        .priority(instance.priority())
        .modifierExtension(instance.modifierExtension())
        .end(instance.end())
        .specialty(instance.specialty())
        .patientInstruction(instance.patientInstruction())
        .identifier(instance.identifier())
        .status(instance.status())
        .supportingInformation(instance.supportingInformation())
        .comment(instance.comment())
        .reasonCode(instance.reasonCode())
        .language(instance.language())
        .appointmentType(instance.appointmentType())
        .description(instance.description())
        .serviceCategory(instance.serviceCategory())
        .text(instance.text())
        .cancelationReason(instance.cancelationReason())
        .requestedPeriod(instance.requestedPeriod())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .basedOn(instance.basedOn())
        .resourceType(instance.resourceType())
        .serviceType(instance.serviceType())
        .reasonReference(instance.reasonReference())
        .start(instance.start())
        .created(instance.created())
        .slot(instance.slot())
        .build();
  }

  /**
   * Creates a builder for {@link Appointment Appointment}.
   * <pre>
   * ImmutableAppointment.builder()
   *    .id(com.fhir.types.fhir.Id) // optional {@link Appointment#id() id}
   *    .minutesDuration(com.fhir.types.fhir.PositiveInt) // optional {@link Appointment#minutesDuration() minutesDuration}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Appointment#extension() extension}
   *    .addParticipant|addAllParticipant(com.fhir.types.fhir.Appointment_Participant) // {@link Appointment#participant() participant} elements
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Appointment#meta() meta}
   *    .priority(com.fhir.types.fhir.UnsignedInt) // optional {@link Appointment#priority() priority}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Appointment#modifierExtension() modifierExtension}
   *    .end(com.fhir.types.fhir.Instant) // optional {@link Appointment#end() end}
   *    .specialty(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#specialty() specialty}
   *    .patientInstruction(String) // optional {@link Appointment#patientInstruction() patientInstruction}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Appointment#identifier() identifier}
   *    .status(com.fhir.types.fhir.AppointmentStatus) // optional {@link Appointment#status() status}
   *    .supportingInformation(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Appointment#supportingInformation() supportingInformation}
   *    .comment(String) // optional {@link Appointment#comment() comment}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#reasonCode() reasonCode}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Appointment#language() language}
   *    .appointmentType(com.fhir.types.fhir.CodeableConcept) // optional {@link Appointment#appointmentType() appointmentType}
   *    .description(String) // optional {@link Appointment#description() description}
   *    .serviceCategory(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#serviceCategory() serviceCategory}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Appointment#text() text}
   *    .cancelationReason(com.fhir.types.fhir.CodeableConcept) // optional {@link Appointment#cancelationReason() cancelationReason}
   *    .requestedPeriod(List&amp;lt;com.fhir.types.fhir.Period&amp;gt;) // optional {@link Appointment#requestedPeriod() requestedPeriod}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Appointment#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Appointment#contained() contained}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Appointment#basedOn() basedOn}
   *    .resourceType(String) // required {@link Appointment#resourceType() resourceType}
   *    .serviceType(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#serviceType() serviceType}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Appointment#reasonReference() reasonReference}
   *    .start(com.fhir.types.fhir.Instant) // optional {@link Appointment#start() start}
   *    .created(com.fhir.types.fhir.DateTime) // optional {@link Appointment#created() created}
   *    .slot(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Appointment#slot() slot}
   *    .build();
   * </pre>
   * @return A new Appointment builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableAppointment.Builder();
  }

  /**
   * Builds instances of type {@link Appointment Appointment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Appointment", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MINUTES_DURATION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_PRIORITY = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_END = 0x40L;
    private static final long OPT_BIT_SPECIALTY = 0x80L;
    private static final long OPT_BIT_PATIENT_INSTRUCTION = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_STATUS = 0x400L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x800L;
    private static final long OPT_BIT_COMMENT = 0x1000L;
    private static final long OPT_BIT_REASON_CODE = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_APPOINTMENT_TYPE = 0x8000L;
    private static final long OPT_BIT_DESCRIPTION = 0x10000L;
    private static final long OPT_BIT_SERVICE_CATEGORY = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_CANCELATION_REASON = 0x80000L;
    private static final long OPT_BIT_REQUESTED_PERIOD = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_CONTAINED = 0x400000L;
    private static final long OPT_BIT_BASED_ON = 0x800000L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x1000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x2000000L;
    private static final long OPT_BIT_START = 0x4000000L;
    private static final long OPT_BIT_CREATED = 0x8000000L;
    private static final long OPT_BIT_SLOT = 0x10000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Id id;
    private @Nullable PositiveInt minutesDuration;
    private @Nullable List<Extension> extension;
    private final List<Appointment_Participant> participant = new ArrayList<Appointment_Participant>();
    private @Nullable Meta meta;
    private @Nullable UnsignedInt priority;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Instant end;
    private @Nullable List<CodeableConcept> specialty;
    private @Nullable String patientInstruction;
    private @Nullable List<Identifier> identifier;
    private @Nullable AppointmentStatus status;
    private @Nullable List<Reference> supportingInformation;
    private @Nullable String comment;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Code language;
    private @Nullable CodeableConcept appointmentType;
    private @Nullable String description;
    private @Nullable List<CodeableConcept> serviceCategory;
    private @Nullable Narrative text;
    private @Nullable CodeableConcept cancelationReason;
    private @Nullable List<Period> requestedPeriod;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Reference> basedOn;
    private @Nullable String resourceType;
    private @Nullable List<CodeableConcept> serviceType;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Instant start;
    private @Nullable DateTime created;
    private @Nullable List<Reference> slot;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Appointment#id() id} to id.
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
     * Initializes the optional value {@link Appointment#id() id} to id.
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
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder minutesDuration(PositiveInt minutesDuration) {
      checkNotIsSet(minutesDurationIsSet(), "minutesDuration");
      this.minutesDuration = Objects.requireNonNull(minutesDuration, "minutesDuration");
      optBits |= OPT_BIT_MINUTES_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("minutesDuration")
    public final Builder minutesDuration(Optional<? extends PositiveInt> minutesDuration) {
      checkNotIsSet(minutesDurationIsSet(), "minutesDuration");
      this.minutesDuration = minutesDuration.orElse(null);
      optBits |= OPT_BIT_MINUTES_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
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
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
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
     * Adds one element to {@link Appointment#participant() participant} list.
     * @param element A participant element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParticipant(Appointment_Participant element) {
      this.participant.add(Objects.requireNonNull(element, "participant element"));
      return this;
    }

    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An array of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParticipant(Appointment_Participant... elements) {
      for (Appointment_Participant element : elements) {
        this.participant.add(Objects.requireNonNull(element, "participant element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An iterable of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllParticipant(Iterable<? extends Appointment_Participant> elements) {
      for (Appointment_Participant element : elements) {
        this.participant.add(Objects.requireNonNull(element, "participant element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
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
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
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
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(UnsignedInt priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends UnsignedInt> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Appointment#end() end} to end.
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
     * Initializes the optional value {@link Appointment#end() end} to end.
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
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientInstruction(String patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = Objects.requireNonNull(patientInstruction, "patientInstruction");
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patientInstruction")
    public final Builder patientInstruction(Optional<String> patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = patientInstruction.orElse(null);
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(AppointmentStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends AppointmentStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInformation(List<Reference> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = Objects.requireNonNull(supportingInformation, "supportingInformation");
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInformation")
    public final Builder supportingInformation(Optional<? extends List<Reference>> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = supportingInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
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
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
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
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#language() language} to language.
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
     * Initializes the optional value {@link Appointment#language() language} to language.
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
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
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
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
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
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
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
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
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
     * Initializes the optional value {@link Appointment#text() text} to text.
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
     * Initializes the optional value {@link Appointment#text() text} to text.
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
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder cancelationReason(CodeableConcept cancelationReason) {
      checkNotIsSet(cancelationReasonIsSet(), "cancelationReason");
      this.cancelationReason = Objects.requireNonNull(cancelationReason, "cancelationReason");
      optBits |= OPT_BIT_CANCELATION_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cancelationReason")
    public final Builder cancelationReason(Optional<? extends CodeableConcept> cancelationReason) {
      checkNotIsSet(cancelationReasonIsSet(), "cancelationReason");
      this.cancelationReason = cancelationReason.orElse(null);
      optBits |= OPT_BIT_CANCELATION_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestedPeriod(List<Period> requestedPeriod) {
      checkNotIsSet(requestedPeriodIsSet(), "requestedPeriod");
      this.requestedPeriod = Objects.requireNonNull(requestedPeriod, "requestedPeriod");
      optBits |= OPT_BIT_REQUESTED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestedPeriod")
    public final Builder requestedPeriod(Optional<? extends List<Period>> requestedPeriod) {
      checkNotIsSet(requestedPeriodIsSet(), "requestedPeriod");
      this.requestedPeriod = requestedPeriod.orElse(null);
      optBits |= OPT_BIT_REQUESTED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
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
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
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
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the value for the {@link Appointment#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
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
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
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
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#start() start} to start.
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
     * Initializes the optional value {@link Appointment#start() start} to start.
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
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(DateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("created")
    public final Builder created(Optional<? extends DateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for chained invocation
     */
    public final Builder slot(List<Reference> slot) {
      checkNotIsSet(slotIsSet(), "slot");
      this.slot = Objects.requireNonNull(slot, "slot");
      optBits |= OPT_BIT_SLOT;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("slot")
    public final Builder slot(Optional<? extends List<Reference>> slot) {
      checkNotIsSet(slotIsSet(), "slot");
      this.slot = slot.orElse(null);
      optBits |= OPT_BIT_SLOT;
      return this;
    }

    /**
     * Builds a new {@link Appointment Appointment}.
     * @return An immutable instance of Appointment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Appointment build() {
      checkRequiredAttributes();
      return new ImmutableAppointment(
          id,
          minutesDuration,
          extension,
          createUnmodifiableList(true, participant),
          meta,
          priority,
          modifierExtension,
          end,
          specialty,
          patientInstruction,
          identifier,
          status,
          supportingInformation,
          comment,
          reasonCode,
          language,
          appointmentType,
          description,
          serviceCategory,
          text,
          cancelationReason,
          requestedPeriod,
          implicitRules,
          contained,
          basedOn,
          resourceType,
          serviceType,
          reasonReference,
          start,
          created,
          slot);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean minutesDurationIsSet() {
      return (optBits & OPT_BIT_MINUTES_DURATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean patientInstructionIsSet() {
      return (optBits & OPT_BIT_PATIENT_INSTRUCTION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean appointmentTypeIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT_TYPE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean serviceCategoryIsSet() {
      return (optBits & OPT_BIT_SERVICE_CATEGORY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean cancelationReasonIsSet() {
      return (optBits & OPT_BIT_CANCELATION_REASON) != 0;
    }

    private boolean requestedPeriodIsSet() {
      return (optBits & OPT_BIT_REQUESTED_PERIOD) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean slotIsSet() {
      return (optBits & OPT_BIT_SLOT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Appointment is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Appointment, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Appointment", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Appointment#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Appointment", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Appointment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Appointment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal minutesDuration(PositiveInt minutesDuration);

    /**
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal minutesDuration(Optional<? extends PositiveInt> minutesDuration);

    /**
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Adds one element to {@link Appointment#participant() participant} list.
     * @param element A participant element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addParticipant(Appointment_Participant element);

    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An array of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addParticipant(Appointment_Participant... elements);

    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An iterable of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllParticipant(Iterable<? extends Appointment_Participant> elements);

    /**
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(UnsignedInt priority);

    /**
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends UnsignedInt> priority);

    /**
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Appointment#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(Instant end);

    /**
     * Initializes the optional value {@link Appointment#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(Optional<? extends Instant> end);

    /**
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(List<CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(Optional<? extends List<CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patientInstruction(String patientInstruction);

    /**
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patientInstruction(Optional<String> patientInstruction);

    /**
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(AppointmentStatus status);

    /**
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends AppointmentStatus> status);

    /**
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(List<Reference> supportingInformation);

    /**
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(Optional<? extends List<Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Appointment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Appointment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appointmentType(CodeableConcept appointmentType);

    /**
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointmentType(Optional<? extends CodeableConcept> appointmentType);

    /**
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceCategory(List<CodeableConcept> serviceCategory);

    /**
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceCategory(Optional<? extends List<CodeableConcept>> serviceCategory);

    /**
     * Initializes the optional value {@link Appointment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Appointment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cancelationReason(CodeableConcept cancelationReason);

    /**
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cancelationReason(Optional<? extends CodeableConcept> cancelationReason);

    /**
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestedPeriod(List<Period> requestedPeriod);

    /**
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestedPeriod(Optional<? extends List<Period>> requestedPeriod);

    /**
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(List<CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(Optional<? extends List<CodeableConcept>> serviceType);

    /**
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Appointment#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(Instant start);

    /**
     * Initializes the optional value {@link Appointment#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(Optional<? extends Instant> start);

    /**
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for chained invocation
     */
    BuildFinal slot(List<Reference> slot);

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal slot(Optional<? extends List<Reference>> slot);

    /**
     * Builds a new {@link Appointment Appointment}.
     * @return An immutable instance of Appointment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Appointment build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
