//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Appointment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppointment.builder()}.
 */
@org.immutables.value.Generated(from = "Appointment", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAppointment implements com.fhir.Appointment {
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final java.util.List<com.fhir.Appointment_Participant> participant;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept cancelationReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.unsignedInt priority;
  private final @javax.annotation.Nullable com.fhir.positiveInt minutesDuration;
  private final @javax.annotation.Nullable com.fhir.instant start;
  private final @javax.annotation.Nullable com.fhir.AppointmentStatus status;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable java.lang.String patientInstruction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.instant end;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> slot;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept appointmentType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Period> requestedPeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory;

  private ImmutableAppointment(
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.dateTime created,
      java.util.List<com.fhir.Appointment_Participant> participant,
      @javax.annotation.Nullable com.fhir.CodeableConcept cancelationReason,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.unsignedInt priority,
      @javax.annotation.Nullable com.fhir.positiveInt minutesDuration,
      @javax.annotation.Nullable com.fhir.instant start,
      @javax.annotation.Nullable com.fhir.AppointmentStatus status,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable java.lang.String patientInstruction,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.instant end,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> slot,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept appointmentType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty,
      @javax.annotation.Nullable java.util.List<com.fhir.Period> requestedPeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory) {
    this.description = description;
    this.created = created;
    this.participant = participant;
    this.cancelationReason = cancelationReason;
    this.basedOn = basedOn;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.priority = priority;
    this.minutesDuration = minutesDuration;
    this.start = start;
    this.status = status;
    this.comment = comment;
    this.patientInstruction = patientInstruction;
    this.serviceType = serviceType;
    this.reasonCode = reasonCode;
    this.identifier = identifier;
    this.reasonReference = reasonReference;
    this.text = text;
    this.end = end;
    this.extension = extension;
    this.language = language;
    this.meta = meta;
    this.supportingInformation = supportingInformation;
    this.slot = slot;
    this.contained = contained;
    this.id = id;
    this.implicitRules = implicitRules;
    this.appointmentType = appointmentType;
    this.specialty = specialty;
    this.requestedPeriod = requestedPeriod;
    this.serviceCategory = serviceCategory;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code created} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("created")
  @Override
  public java.util.Optional<com.fhir.dateTime> created() {
    return java.util.Optional.ofNullable(created);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participant")
  @Override
  public java.util.List<com.fhir.Appointment_Participant> participant() {
    return participant;
  }

  /**
   * @return The value of the {@code cancelationReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cancelationReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> cancelationReason() {
    return java.util.Optional.ofNullable(cancelationReason);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> priority() {
    return java.util.Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code minutesDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("minutesDuration")
  @Override
  public java.util.Optional<com.fhir.positiveInt> minutesDuration() {
    return java.util.Optional.ofNullable(minutesDuration);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.AppointmentStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code patientInstruction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patientInstruction")
  @Override
  public java.util.Optional<java.lang.String> patientInstruction() {
    return java.util.Optional.ofNullable(patientInstruction);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code end} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("end")
  @Override
  public java.util.Optional<com.fhir.instant> end() {
    return java.util.Optional.ofNullable(end);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code supportingInformation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() {
    return java.util.Optional.ofNullable(supportingInformation);
  }

  /**
   * @return The value of the {@code slot} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("slot")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> slot() {
    return java.util.Optional.ofNullable(slot);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code specialty} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialty")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() {
    return java.util.Optional.ofNullable(specialty);
  }

  /**
   * @return The value of the {@code requestedPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestedPeriod")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Period>> requestedPeriod() {
    return java.util.Optional.ofNullable(requestedPeriod);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableAppointment(
        newValue,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableAppointment(
        value,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        newValue,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableAppointment(
        this.description,
        value,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Appointment#participant() participant}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withParticipant(com.fhir.Appointment_Participant... elements) {
    java.util.List<com.fhir.Appointment_Participant> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableAppointment(
        this.description,
        this.created,
        newValue,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Appointment#participant() participant}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of participant elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withParticipant(Iterable<? extends com.fhir.Appointment_Participant> elements) {
    if (this.participant == elements) return this;
    java.util.List<com.fhir.Appointment_Participant> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAppointment(
        this.description,
        this.created,
        newValue,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#cancelationReason() cancelationReason} attribute.
   * @param value The value for cancelationReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withCancelationReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "cancelationReason");
    if (this.cancelationReason == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        newValue,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#cancelationReason() cancelationReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cancelationReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withCancelationReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.cancelationReason == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        value,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        value,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        newValue,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        value,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Appointment#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAppointment withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        newValue,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withPriority(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withPriority(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        value,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#minutesDuration() minutesDuration} attribute.
   * @param value The value for minutesDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withMinutesDuration(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "minutesDuration");
    if (this.minutesDuration == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        newValue,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#minutesDuration() minutesDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for minutesDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withMinutesDuration(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.minutesDuration == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        value,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withStart(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        newValue,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withStart(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        value,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withStatus(com.fhir.AppointmentStatus value) {
    @javax.annotation.Nullable com.fhir.AppointmentStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        newValue,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withStatus(java.util.Optional<? extends com.fhir.AppointmentStatus> optional) {
    @javax.annotation.Nullable com.fhir.AppointmentStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        value,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        newValue,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        value,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#patientInstruction() patientInstruction} attribute.
   * @param value The value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withPatientInstruction(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "patientInstruction");
    if (java.util.Objects.equals(this.patientInstruction, newValue)) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        newValue,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#patientInstruction() patientInstruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withPatientInstruction(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.patientInstruction, value)) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        value,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withServiceType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        newValue,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withServiceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        value,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        newValue,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        value,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        newValue,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        value,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        newValue,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        value,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        newValue,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        value,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withEnd(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        newValue,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withEnd(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        value,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        newValue,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        value,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        newValue,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        value,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        newValue,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        value,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withSupportingInformation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        newValue,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withSupportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        value,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#slot() slot} attribute.
   * @param value The value for slot
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withSlot(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "slot");
    if (this.slot == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        newValue,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#slot() slot} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for slot
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withSlot(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.slot == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        value,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        newValue,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        value,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        newValue,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        value,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        newValue,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        value,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#appointmentType() appointmentType} attribute.
   * @param value The value for appointmentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withAppointmentType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "appointmentType");
    if (this.appointmentType == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        newValue,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#appointmentType() appointmentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointmentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withAppointmentType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.appointmentType == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        value,
        this.specialty,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#specialty() specialty} attribute.
   * @param value The value for specialty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withSpecialty(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "specialty");
    if (this.specialty == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        newValue,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#specialty() specialty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withSpecialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.specialty == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        value,
        this.requestedPeriod,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#requestedPeriod() requestedPeriod} attribute.
   * @param value The value for requestedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withRequestedPeriod(java.util.List<com.fhir.Period> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Period> newValue = java.util.Objects.requireNonNull(value, "requestedPeriod");
    if (this.requestedPeriod == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        newValue,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#requestedPeriod() requestedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withRequestedPeriod(java.util.Optional<? extends java.util.List<com.fhir.Period>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Period> value = optional.orElse(null);
    if (this.requestedPeriod == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        value,
        this.serviceCategory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment#serviceCategory() serviceCategory} attribute.
   * @param value The value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment withServiceCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "serviceCategory");
    if (this.serviceCategory == newValue) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment#serviceCategory() serviceCategory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceCategory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment withServiceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.serviceCategory == value) return this;
    return new ImmutableAppointment(
        this.description,
        this.created,
        this.participant,
        this.cancelationReason,
        this.basedOn,
        this.modifierExtension,
        this.resourceType,
        this.priority,
        this.minutesDuration,
        this.start,
        this.status,
        this.comment,
        this.patientInstruction,
        this.serviceType,
        this.reasonCode,
        this.identifier,
        this.reasonReference,
        this.text,
        this.end,
        this.extension,
        this.language,
        this.meta,
        this.supportingInformation,
        this.slot,
        this.contained,
        this.id,
        this.implicitRules,
        this.appointmentType,
        this.specialty,
        this.requestedPeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppointment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppointment
        && equalTo((ImmutableAppointment) another);
  }

  private boolean equalTo(ImmutableAppointment another) {
    return java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(created, another.created)
        && participant.equals(another.participant)
        && java.util.Objects.equals(cancelationReason, another.cancelationReason)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(minutesDuration, another.minutesDuration)
        && java.util.Objects.equals(start, another.start)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(patientInstruction, another.patientInstruction)
        && java.util.Objects.equals(serviceType, another.serviceType)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(end, another.end)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(supportingInformation, another.supportingInformation)
        && java.util.Objects.equals(slot, another.slot)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(appointmentType, another.appointmentType)
        && java.util.Objects.equals(specialty, another.specialty)
        && java.util.Objects.equals(requestedPeriod, another.requestedPeriod)
        && java.util.Objects.equals(serviceCategory, another.serviceCategory);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code created}, {@code participant}, {@code cancelationReason}, {@code basedOn}, {@code modifierExtension}, {@code resourceType}, {@code priority}, {@code minutesDuration}, {@code start}, {@code status}, {@code comment}, {@code patientInstruction}, {@code serviceType}, {@code reasonCode}, {@code identifier}, {@code reasonReference}, {@code text}, {@code end}, {@code extension}, {@code language}, {@code meta}, {@code supportingInformation}, {@code slot}, {@code contained}, {@code id}, {@code implicitRules}, {@code appointmentType}, {@code specialty}, {@code requestedPeriod}, {@code serviceCategory}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + participant.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(cancelationReason);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(minutesDuration);
    h += (h << 5) + java.util.Objects.hashCode(start);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(patientInstruction);
    h += (h << 5) + java.util.Objects.hashCode(serviceType);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(end);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(supportingInformation);
    h += (h << 5) + java.util.Objects.hashCode(slot);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(appointmentType);
    h += (h << 5) + java.util.Objects.hashCode(specialty);
    h += (h << 5) + java.util.Objects.hashCode(requestedPeriod);
    h += (h << 5) + java.util.Objects.hashCode(serviceCategory);
    return h;
  }

  /**
   * Prints the immutable value {@code Appointment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Appointment{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (created != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("created=").append(created);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("participant=").append(participant);
    if (cancelationReason != null) {
      builder.append(", ");
      builder.append("cancelationReason=").append(cancelationReason);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (minutesDuration != null) {
      builder.append(", ");
      builder.append("minutesDuration=").append(minutesDuration);
    }
    if (start != null) {
      builder.append(", ");
      builder.append("start=").append(start);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (patientInstruction != null) {
      builder.append(", ");
      builder.append("patientInstruction=").append(patientInstruction);
    }
    if (serviceType != null) {
      builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (end != null) {
      builder.append(", ");
      builder.append("end=").append(end);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (slot != null) {
      builder.append(", ");
      builder.append("slot=").append(slot);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (appointmentType != null) {
      builder.append(", ");
      builder.append("appointmentType=").append(appointmentType);
    }
    if (specialty != null) {
      builder.append(", ");
      builder.append("specialty=").append(specialty);
    }
    if (requestedPeriod != null) {
      builder.append(", ");
      builder.append("requestedPeriod=").append(requestedPeriod);
    }
    if (serviceCategory != null) {
      builder.append(", ");
      builder.append("serviceCategory=").append(serviceCategory);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Appointment", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Appointment {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Appointment_Participant> participant = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> cancelationReason = java.util.Optional.empty();
    boolean cancelationReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> minutesDuration = java.util.Optional.empty();
    boolean minutesDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> start = java.util.Optional.empty();
    boolean startIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.AppointmentStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> patientInstruction = java.util.Optional.empty();
    boolean patientInstructionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType = java.util.Optional.empty();
    boolean serviceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> end = java.util.Optional.empty();
    boolean endIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation = java.util.Optional.empty();
    boolean supportingInformationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> slot = java.util.Optional.empty();
    boolean slotIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> appointmentType = java.util.Optional.empty();
    boolean appointmentTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty = java.util.Optional.empty();
    boolean specialtyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Period>> requestedPeriod = java.util.Optional.empty();
    boolean requestedPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory = java.util.Optional.empty();
    boolean serviceCategoryIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public void setParticipant(java.util.List<com.fhir.Appointment_Participant> participant) {
      this.participant = participant;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cancelationReason")
    public void setCancelationReason(java.util.Optional<com.fhir.CodeableConcept> cancelationReason) {
      this.cancelationReason = cancelationReason;
      this.cancelationReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.unsignedInt> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("minutesDuration")
    public void setMinutesDuration(java.util.Optional<com.fhir.positiveInt> minutesDuration) {
      this.minutesDuration = minutesDuration;
      this.minutesDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public void setStart(java.util.Optional<com.fhir.instant> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.AppointmentStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patientInstruction")
    public void setPatientInstruction(java.util.Optional<java.lang.String> patientInstruction) {
      this.patientInstruction = patientInstruction;
      this.patientInstructionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    public void setServiceType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public void setEnd(java.util.Optional<com.fhir.instant> end) {
      this.end = end;
      this.endIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
    public void setSupportingInformation(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("slot")
    public void setSlot(java.util.Optional<java.util.List<com.fhir.Reference>> slot) {
      this.slot = slot;
      this.slotIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("appointmentType")
    public void setAppointmentType(java.util.Optional<com.fhir.CodeableConcept> appointmentType) {
      this.appointmentType = appointmentType;
      this.appointmentTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialty")
    public void setSpecialty(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty) {
      this.specialty = specialty;
      this.specialtyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestedPeriod")
    public void setRequestedPeriod(java.util.Optional<java.util.List<com.fhir.Period>> requestedPeriod) {
      this.requestedPeriod = requestedPeriod;
      this.requestedPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
    public void setServiceCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory) {
      this.serviceCategory = serviceCategory;
      this.serviceCategoryIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Appointment_Participant> participant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> cancelationReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> minutesDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> start() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.AppointmentStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> patientInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> end() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> slot() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> appointmentType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> specialty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Period>> requestedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> serviceCategory() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAppointment fromJson(Json json) {
    ImmutableAppointment.Builder builder = ((ImmutableAppointment.Builder) ImmutableAppointment.builder());
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.participant != null) {
      builder.addAllParticipant(json.participant);
    }
    if (json.cancelationReasonIsSet) {
      builder.cancelationReason(json.cancelationReason);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.minutesDurationIsSet) {
      builder.minutesDuration(json.minutesDuration);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.patientInstructionIsSet) {
      builder.patientInstruction(json.patientInstruction);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.slotIsSet) {
      builder.slot(json.slot);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.appointmentTypeIsSet) {
      builder.appointmentType(json.appointmentType);
    }
    if (json.specialtyIsSet) {
      builder.specialty(json.specialty);
    }
    if (json.requestedPeriodIsSet) {
      builder.requestedPeriod(json.requestedPeriod);
    }
    if (json.serviceCategoryIsSet) {
      builder.serviceCategory(json.serviceCategory);
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
        .description(instance.description())
        .created(instance.created())
        .addAllParticipant(instance.participant())
        .cancelationReason(instance.cancelationReason())
        .basedOn(instance.basedOn())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .priority(instance.priority())
        .minutesDuration(instance.minutesDuration())
        .start(instance.start())
        .status(instance.status())
        .comment(instance.comment())
        .patientInstruction(instance.patientInstruction())
        .serviceType(instance.serviceType())
        .reasonCode(instance.reasonCode())
        .identifier(instance.identifier())
        .reasonReference(instance.reasonReference())
        .text(instance.text())
        .end(instance.end())
        .extension(instance.extension())
        .language(instance.language())
        .meta(instance.meta())
        .supportingInformation(instance.supportingInformation())
        .slot(instance.slot())
        .contained(instance.contained())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .appointmentType(instance.appointmentType())
        .specialty(instance.specialty())
        .requestedPeriod(instance.requestedPeriod())
        .serviceCategory(instance.serviceCategory())
        .build();
  }

  /**
   * Creates a builder for {@link Appointment Appointment}.
   * <pre>
   * ImmutableAppointment.builder()
   *    .description(String) // optional {@link Appointment#description() description}
   *    .created(com.fhir.dateTime) // optional {@link Appointment#created() created}
   *    .addParticipant|addAllParticipant(com.fhir.Appointment_Participant) // {@link Appointment#participant() participant} elements
   *    .cancelationReason(com.fhir.CodeableConcept) // optional {@link Appointment#cancelationReason() cancelationReason}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Appointment#basedOn() basedOn}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Appointment#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link Appointment#resourceType() resourceType}
   *    .priority(com.fhir.unsignedInt) // optional {@link Appointment#priority() priority}
   *    .minutesDuration(com.fhir.positiveInt) // optional {@link Appointment#minutesDuration() minutesDuration}
   *    .start(com.fhir.instant) // optional {@link Appointment#start() start}
   *    .status(com.fhir.AppointmentStatus) // optional {@link Appointment#status() status}
   *    .comment(String) // optional {@link Appointment#comment() comment}
   *    .patientInstruction(String) // optional {@link Appointment#patientInstruction() patientInstruction}
   *    .serviceType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#serviceType() serviceType}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#reasonCode() reasonCode}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Appointment#identifier() identifier}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Appointment#reasonReference() reasonReference}
   *    .text(com.fhir.Narrative) // optional {@link Appointment#text() text}
   *    .end(com.fhir.instant) // optional {@link Appointment#end() end}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Appointment#extension() extension}
   *    .language(com.fhir.code) // optional {@link Appointment#language() language}
   *    .meta(com.fhir.Meta) // optional {@link Appointment#meta() meta}
   *    .supportingInformation(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Appointment#supportingInformation() supportingInformation}
   *    .slot(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Appointment#slot() slot}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Appointment#contained() contained}
   *    .id(com.fhir.id) // optional {@link Appointment#id() id}
   *    .implicitRules(com.fhir.uri) // optional {@link Appointment#implicitRules() implicitRules}
   *    .appointmentType(com.fhir.CodeableConcept) // optional {@link Appointment#appointmentType() appointmentType}
   *    .specialty(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#specialty() specialty}
   *    .requestedPeriod(List&amp;lt;com.fhir.Period&amp;gt;) // optional {@link Appointment#requestedPeriod() requestedPeriod}
   *    .serviceCategory(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment#serviceCategory() serviceCategory}
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
  @org.immutables.value.Generated(from = "Appointment", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_CREATED = 0x2L;
    private static final long OPT_BIT_CANCELATION_REASON = 0x4L;
    private static final long OPT_BIT_BASED_ON = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_PRIORITY = 0x20L;
    private static final long OPT_BIT_MINUTES_DURATION = 0x40L;
    private static final long OPT_BIT_START = 0x80L;
    private static final long OPT_BIT_STATUS = 0x100L;
    private static final long OPT_BIT_COMMENT = 0x200L;
    private static final long OPT_BIT_PATIENT_INSTRUCTION = 0x400L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x800L;
    private static final long OPT_BIT_REASON_CODE = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_END = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x100000L;
    private static final long OPT_BIT_SLOT = 0x200000L;
    private static final long OPT_BIT_CONTAINED = 0x400000L;
    private static final long OPT_BIT_ID = 0x800000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000000L;
    private static final long OPT_BIT_APPOINTMENT_TYPE = 0x2000000L;
    private static final long OPT_BIT_SPECIALTY = 0x4000000L;
    private static final long OPT_BIT_REQUESTED_PERIOD = 0x8000000L;
    private static final long OPT_BIT_SERVICE_CATEGORY = 0x10000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private final java.util.List<com.fhir.Appointment_Participant> participant = new java.util.ArrayList<com.fhir.Appointment_Participant>();
    private @javax.annotation.Nullable com.fhir.CodeableConcept cancelationReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.unsignedInt priority;
    private @javax.annotation.Nullable com.fhir.positiveInt minutesDuration;
    private @javax.annotation.Nullable com.fhir.instant start;
    private @javax.annotation.Nullable com.fhir.AppointmentStatus status;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable java.lang.String patientInstruction;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.instant end;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> slot;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept appointmentType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> specialty;
    private @javax.annotation.Nullable java.util.List<com.fhir.Period> requestedPeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> serviceCategory;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(com.fhir.dateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = java.util.Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public final Builder created(java.util.Optional<? extends com.fhir.dateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Adds one element to {@link Appointment#participant() participant} list.
     * @param element A participant element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParticipant(com.fhir.Appointment_Participant element) {
      this.participant.add(java.util.Objects.requireNonNull(element, "participant element"));
      return this;
    }

    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An array of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addParticipant(com.fhir.Appointment_Participant... elements) {
      for (com.fhir.Appointment_Participant element : elements) {
        this.participant.add(java.util.Objects.requireNonNull(element, "participant element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An iterable of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllParticipant(Iterable<? extends com.fhir.Appointment_Participant> elements) {
      for (com.fhir.Appointment_Participant element : elements) {
        this.participant.add(java.util.Objects.requireNonNull(element, "participant element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder cancelationReason(com.fhir.CodeableConcept cancelationReason) {
      checkNotIsSet(cancelationReasonIsSet(), "cancelationReason");
      this.cancelationReason = java.util.Objects.requireNonNull(cancelationReason, "cancelationReason");
      optBits |= OPT_BIT_CANCELATION_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cancelationReason")
    public final Builder cancelationReason(java.util.Optional<? extends com.fhir.CodeableConcept> cancelationReason) {
      checkNotIsSet(cancelationReasonIsSet(), "cancelationReason");
      this.cancelationReason = cancelationReason.orElse(null);
      optBits |= OPT_BIT_CANCELATION_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Appointment#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.unsignedInt priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.unsignedInt> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder minutesDuration(com.fhir.positiveInt minutesDuration) {
      checkNotIsSet(minutesDurationIsSet(), "minutesDuration");
      this.minutesDuration = java.util.Objects.requireNonNull(minutesDuration, "minutesDuration");
      optBits |= OPT_BIT_MINUTES_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minutesDuration")
    public final Builder minutesDuration(java.util.Optional<? extends com.fhir.positiveInt> minutesDuration) {
      checkNotIsSet(minutesDurationIsSet(), "minutesDuration");
      this.minutesDuration = minutesDuration.orElse(null);
      optBits |= OPT_BIT_MINUTES_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#start() start} to start.
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
     * Initializes the optional value {@link Appointment#start() start} to start.
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
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.AppointmentStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.AppointmentStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
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
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
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
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientInstruction(java.lang.String patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = java.util.Objects.requireNonNull(patientInstruction, "patientInstruction");
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patientInstruction")
    public final Builder patientInstruction(java.util.Optional<java.lang.String> patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = patientInstruction.orElse(null);
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
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
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
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
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(java.util.List<com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#text() text} to text.
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
     * Initializes the optional value {@link Appointment#text() text} to text.
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
     * Initializes the optional value {@link Appointment#end() end} to end.
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
     * Initializes the optional value {@link Appointment#end() end} to end.
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
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
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
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
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
     * Initializes the optional value {@link Appointment#language() language} to language.
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
     * Initializes the optional value {@link Appointment#language() language} to language.
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
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
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
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
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
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInformation(java.util.List<com.fhir.Reference> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = java.util.Objects.requireNonNull(supportingInformation, "supportingInformation");
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
    public final Builder supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = supportingInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for chained invocation
     */
    public final Builder slot(java.util.List<com.fhir.Reference> slot) {
      checkNotIsSet(slotIsSet(), "slot");
      this.slot = java.util.Objects.requireNonNull(slot, "slot");
      optBits |= OPT_BIT_SLOT;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("slot")
    public final Builder slot(java.util.Optional<? extends java.util.List<com.fhir.Reference>> slot) {
      checkNotIsSet(slotIsSet(), "slot");
      this.slot = slot.orElse(null);
      optBits |= OPT_BIT_SLOT;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
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
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
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
     * Initializes the optional value {@link Appointment#id() id} to id.
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
     * Initializes the optional value {@link Appointment#id() id} to id.
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
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
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
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
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
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
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
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestedPeriod(java.util.List<com.fhir.Period> requestedPeriod) {
      checkNotIsSet(requestedPeriodIsSet(), "requestedPeriod");
      this.requestedPeriod = java.util.Objects.requireNonNull(requestedPeriod, "requestedPeriod");
      optBits |= OPT_BIT_REQUESTED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedPeriod")
    public final Builder requestedPeriod(java.util.Optional<? extends java.util.List<com.fhir.Period>> requestedPeriod) {
      checkNotIsSet(requestedPeriodIsSet(), "requestedPeriod");
      this.requestedPeriod = requestedPeriod.orElse(null);
      optBits |= OPT_BIT_REQUESTED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
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
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
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
     * Builds a new {@link Appointment Appointment}.
     * @return An immutable instance of Appointment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Appointment build() {
      checkRequiredAttributes();
      return new ImmutableAppointment(
          description,
          created,
          createUnmodifiableList(true, participant),
          cancelationReason,
          basedOn,
          modifierExtension,
          resourceType,
          priority,
          minutesDuration,
          start,
          status,
          comment,
          patientInstruction,
          serviceType,
          reasonCode,
          identifier,
          reasonReference,
          text,
          end,
          extension,
          language,
          meta,
          supportingInformation,
          slot,
          contained,
          id,
          implicitRules,
          appointmentType,
          specialty,
          requestedPeriod,
          serviceCategory);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean cancelationReasonIsSet() {
      return (optBits & OPT_BIT_CANCELATION_REASON) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean minutesDurationIsSet() {
      return (optBits & OPT_BIT_MINUTES_DURATION) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean patientInstructionIsSet() {
      return (optBits & OPT_BIT_PATIENT_INSTRUCTION) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean slotIsSet() {
      return (optBits & OPT_BIT_SLOT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean appointmentTypeIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT_TYPE) != 0;
    }

    private boolean specialtyIsSet() {
      return (optBits & OPT_BIT_SPECIALTY) != 0;
    }

    private boolean requestedPeriodIsSet() {
      return (optBits & OPT_BIT_REQUESTED_PERIOD) != 0;
    }

    private boolean serviceCategoryIsSet() {
      return (optBits & OPT_BIT_SERVICE_CATEGORY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Appointment is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Appointment, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Appointment", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Appointment#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Appointment", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link Appointment#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link Appointment#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Adds one element to {@link Appointment#participant() participant} list.
     * @param element A participant element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addParticipant(com.fhir.Appointment_Participant element);

    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An array of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addParticipant(com.fhir.Appointment_Participant... elements);

    /**
     * Adds elements to {@link Appointment#participant() participant} list.
     * @param elements An iterable of participant elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllParticipant(Iterable<? extends com.fhir.Appointment_Participant> elements);

    /**
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cancelationReason(com.fhir.CodeableConcept cancelationReason);

    /**
     * Initializes the optional value {@link Appointment#cancelationReason() cancelationReason} to cancelationReason.
     * @param cancelationReason The value for cancelationReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cancelationReason(java.util.Optional<? extends com.fhir.CodeableConcept> cancelationReason);

    /**
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link Appointment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Appointment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.unsignedInt priority);

    /**
     * Initializes the optional value {@link Appointment#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.unsignedInt> priority);

    /**
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal minutesDuration(com.fhir.positiveInt minutesDuration);

    /**
     * Initializes the optional value {@link Appointment#minutesDuration() minutesDuration} to minutesDuration.
     * @param minutesDuration The value for minutesDuration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal minutesDuration(java.util.Optional<? extends com.fhir.positiveInt> minutesDuration);

    /**
     * Initializes the optional value {@link Appointment#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(com.fhir.instant start);

    /**
     * Initializes the optional value {@link Appointment#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(java.util.Optional<? extends com.fhir.instant> start);

    /**
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.AppointmentStatus status);

    /**
     * Initializes the optional value {@link Appointment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.AppointmentStatus> status);

    /**
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.lang.String comment);

    /**
     * Initializes the optional value {@link Appointment#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<java.lang.String> comment);

    /**
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patientInstruction(java.lang.String patientInstruction);

    /**
     * Initializes the optional value {@link Appointment#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patientInstruction(java.util.Optional<java.lang.String> patientInstruction);

    /**
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(java.util.List<com.fhir.CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Appointment#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceType);

    /**
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Appointment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Appointment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link Appointment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Appointment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Appointment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Appointment#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    BuildFinal end(com.fhir.instant end);

    /**
     * Initializes the optional value {@link Appointment#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal end(java.util.Optional<? extends com.fhir.instant> end);

    /**
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Appointment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Appointment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Appointment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Appointment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(java.util.List<com.fhir.Reference> supportingInformation);

    /**
     * Initializes the optional value {@link Appointment#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for chained invocation
     */
    BuildFinal slot(java.util.List<com.fhir.Reference> slot);

    /**
     * Initializes the optional value {@link Appointment#slot() slot} to slot.
     * @param slot The value for slot
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal slot(java.util.Optional<? extends java.util.List<com.fhir.Reference>> slot);

    /**
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Appointment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Appointment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Appointment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Appointment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appointmentType(com.fhir.CodeableConcept appointmentType);

    /**
     * Initializes the optional value {@link Appointment#appointmentType() appointmentType} to appointmentType.
     * @param appointmentType The value for appointmentType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointmentType(java.util.Optional<? extends com.fhir.CodeableConcept> appointmentType);

    /**
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialty(java.util.List<com.fhir.CodeableConcept> specialty);

    /**
     * Initializes the optional value {@link Appointment#specialty() specialty} to specialty.
     * @param specialty The value for specialty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialty(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> specialty);

    /**
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestedPeriod(java.util.List<com.fhir.Period> requestedPeriod);

    /**
     * Initializes the optional value {@link Appointment#requestedPeriod() requestedPeriod} to requestedPeriod.
     * @param requestedPeriod The value for requestedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestedPeriod(java.util.Optional<? extends java.util.List<com.fhir.Period>> requestedPeriod);

    /**
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceCategory(java.util.List<com.fhir.CodeableConcept> serviceCategory);

    /**
     * Initializes the optional value {@link Appointment#serviceCategory() serviceCategory} to serviceCategory.
     * @param serviceCategory The value for serviceCategory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> serviceCategory);

    /**
     * Builds a new {@link Appointment Appointment}.
     * @return An immutable instance of Appointment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Appointment build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
