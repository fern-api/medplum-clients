//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Encounter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter.builder()}.
 */
@org.immutables.value.Generated(from = "Encounter", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter implements com.fhir.Encounter {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> episodeOfCare;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Duration length;
  private final @javax.annotation.Nullable com.fhir.EncounterStatus status;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept serviceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Encounter_StatusHistory> statusHistory;
  private final com.fhir.Coding _class;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> account;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Encounter_ClassHistory> classHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Location> location;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Diagnosis> diagnosis;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Encounter_Hospitalization hospitalization;
  private final @javax.annotation.Nullable com.fhir.Reference serviceProvider;
  private final @javax.annotation.Nullable com.fhir.Reference partOf;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> appointment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Participant> participant;

  private ImmutableEncounter(
      @javax.annotation.Nullable com.fhir.CodeableConcept priority,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> episodeOfCare,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Duration length,
      @javax.annotation.Nullable com.fhir.EncounterStatus status,
      @javax.annotation.Nullable com.fhir.CodeableConcept serviceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Encounter_StatusHistory> statusHistory,
      com.fhir.Coding _class,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> account,
      @javax.annotation.Nullable java.util.List<com.fhir.Encounter_ClassHistory> classHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Location> location,
      @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Diagnosis> diagnosis,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Encounter_Hospitalization hospitalization,
      @javax.annotation.Nullable com.fhir.Reference serviceProvider,
      @javax.annotation.Nullable com.fhir.Reference partOf,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> appointment,
      @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Participant> participant) {
    this.priority = priority;
    this.type = type;
    this.reasonCode = reasonCode;
    this.subject = subject;
    this.basedOn = basedOn;
    this.episodeOfCare = episodeOfCare;
    this.meta = meta;
    this.language = language;
    this.contained = contained;
    this.length = length;
    this.status = status;
    this.serviceType = serviceType;
    this.modifierExtension = modifierExtension;
    this.reasonReference = reasonReference;
    this.identifier = identifier;
    this.period = period;
    this.id = id;
    this.implicitRules = implicitRules;
    this.statusHistory = statusHistory;
    this._class = _class;
    this.text = text;
    this.account = account;
    this.classHistory = classHistory;
    this.extension = extension;
    this.location = location;
    this.diagnosis = diagnosis;
    this.resourceType = resourceType;
    this.hospitalization = hospitalization;
    this.serviceProvider = serviceProvider;
    this.partOf = partOf;
    this.appointment = appointment;
    this.participant = participant;
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> priority() {
    return java.util.Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
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
   * @return The value of the {@code episodeOfCare} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("episodeOfCare")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> episodeOfCare() {
    return java.util.Optional.ofNullable(episodeOfCare);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code length} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("length")
  @Override
  public java.util.Optional<com.fhir.Duration> length() {
    return java.util.Optional.ofNullable(length);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.EncounterStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code serviceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> serviceType() {
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
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
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
   * @return The value of the {@code statusHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Encounter_StatusHistory>> statusHistory() {
    return java.util.Optional.ofNullable(statusHistory);
  }

  /**
   * @return The value of the {@code _class} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("class")
  @Override
  public com.fhir.Coding _class() {
    return _class;
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
   * @return The value of the {@code account} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("account")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> account() {
    return java.util.Optional.ofNullable(account);
  }

  /**
   * @return The value of the {@code classHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("classHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Encounter_ClassHistory>> classHistory() {
    return java.util.Optional.ofNullable(classHistory);
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
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Encounter_Location>> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code diagnosis} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Encounter_Diagnosis>> diagnosis() {
    return java.util.Optional.ofNullable(diagnosis);
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
   * @return The value of the {@code hospitalization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hospitalization")
  @Override
  public java.util.Optional<com.fhir.Encounter_Hospitalization> hospitalization() {
    return java.util.Optional.ofNullable(hospitalization);
  }

  /**
   * @return The value of the {@code serviceProvider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("serviceProvider")
  @Override
  public java.util.Optional<com.fhir.Reference> serviceProvider() {
    return java.util.Optional.ofNullable(serviceProvider);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<com.fhir.Reference> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code appointment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("appointment")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> appointment() {
    return java.util.Optional.ofNullable(appointment);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Encounter_Participant>> participant() {
    return java.util.Optional.ofNullable(participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withPriority(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableEncounter(
        newValue,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withPriority(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableEncounter(
        value,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        newValue,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEncounter(
        this.priority,
        value,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        newValue,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        value,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        newValue,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        value,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        newValue,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        value,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#episodeOfCare() episodeOfCare} attribute.
   * @param value The value for episodeOfCare
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withEpisodeOfCare(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "episodeOfCare");
    if (this.episodeOfCare == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        newValue,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#episodeOfCare() episodeOfCare} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for episodeOfCare
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withEpisodeOfCare(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.episodeOfCare == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        value,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        newValue,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        value,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        newValue,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        value,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        newValue,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        value,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#length() length} attribute.
   * @param value The value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withLength(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "length");
    if (this.length == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        newValue,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#length() length} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for length
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withLength(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.length == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        value,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withStatus(com.fhir.EncounterStatus value) {
    @javax.annotation.Nullable com.fhir.EncounterStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        newValue,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withStatus(java.util.Optional<? extends com.fhir.EncounterStatus> optional) {
    @javax.annotation.Nullable com.fhir.EncounterStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        value,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#serviceType() serviceType} attribute.
   * @param value The value for serviceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withServiceType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "serviceType");
    if (this.serviceType == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        newValue,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#serviceType() serviceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withServiceType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.serviceType == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        value,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        newValue,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        value,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        value,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        newValue,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        value,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        newValue,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        value,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        newValue,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        value,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        newValue,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        value,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#statusHistory() statusHistory} attribute.
   * @param value The value for statusHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withStatusHistory(java.util.List<com.fhir.Encounter_StatusHistory> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_StatusHistory> newValue = java.util.Objects.requireNonNull(value, "statusHistory");
    if (this.statusHistory == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        newValue,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#statusHistory() statusHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withStatusHistory(java.util.Optional<? extends java.util.List<com.fhir.Encounter_StatusHistory>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_StatusHistory> value = optional.orElse(null);
    if (this.statusHistory == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        value,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter#_class() _class} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for _class
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter with_class(com.fhir.Coding value) {
    if (this._class == value) return this;
    com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "_class");
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        newValue,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        newValue,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        value,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withAccount(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        newValue,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withAccount(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        value,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#classHistory() classHistory} attribute.
   * @param value The value for classHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withClassHistory(java.util.List<com.fhir.Encounter_ClassHistory> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_ClassHistory> newValue = java.util.Objects.requireNonNull(value, "classHistory");
    if (this.classHistory == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        newValue,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#classHistory() classHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withClassHistory(java.util.Optional<? extends java.util.List<com.fhir.Encounter_ClassHistory>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_ClassHistory> value = optional.orElse(null);
    if (this.classHistory == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        value,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        newValue,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        value,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withLocation(java.util.List<com.fhir.Encounter_Location> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Location> newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        newValue,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withLocation(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Location>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Location> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        value,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withDiagnosis(java.util.List<com.fhir.Encounter_Diagnosis> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Diagnosis> newValue = java.util.Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        newValue,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withDiagnosis(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Diagnosis>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        value,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        newValue,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#hospitalization() hospitalization} attribute.
   * @param value The value for hospitalization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withHospitalization(com.fhir.Encounter_Hospitalization value) {
    @javax.annotation.Nullable com.fhir.Encounter_Hospitalization newValue = java.util.Objects.requireNonNull(value, "hospitalization");
    if (this.hospitalization == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        newValue,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#hospitalization() hospitalization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hospitalization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withHospitalization(java.util.Optional<? extends com.fhir.Encounter_Hospitalization> optional) {
    @javax.annotation.Nullable com.fhir.Encounter_Hospitalization value = optional.orElse(null);
    if (this.hospitalization == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        value,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#serviceProvider() serviceProvider} attribute.
   * @param value The value for serviceProvider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withServiceProvider(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "serviceProvider");
    if (this.serviceProvider == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        newValue,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#serviceProvider() serviceProvider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for serviceProvider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withServiceProvider(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.serviceProvider == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        value,
        this.partOf,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withPartOf(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        newValue,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withPartOf(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        value,
        this.appointment,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#appointment() appointment} attribute.
   * @param value The value for appointment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withAppointment(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "appointment");
    if (this.appointment == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        newValue,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#appointment() appointment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appointment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withAppointment(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.appointment == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        value,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter withParticipant(java.util.List<com.fhir.Encounter_Participant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Participant> newValue = java.util.Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter withParticipant(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Participant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableEncounter(
        this.priority,
        this.type,
        this.reasonCode,
        this.subject,
        this.basedOn,
        this.episodeOfCare,
        this.meta,
        this.language,
        this.contained,
        this.length,
        this.status,
        this.serviceType,
        this.modifierExtension,
        this.reasonReference,
        this.identifier,
        this.period,
        this.id,
        this.implicitRules,
        this.statusHistory,
        this._class,
        this.text,
        this.account,
        this.classHistory,
        this.extension,
        this.location,
        this.diagnosis,
        this.resourceType,
        this.hospitalization,
        this.serviceProvider,
        this.partOf,
        this.appointment,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter
        && equalTo((ImmutableEncounter) another);
  }

  private boolean equalTo(ImmutableEncounter another) {
    return java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(episodeOfCare, another.episodeOfCare)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(length, another.length)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(serviceType, another.serviceType)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(statusHistory, another.statusHistory)
        && _class.equals(another._class)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(account, another.account)
        && java.util.Objects.equals(classHistory, another.classHistory)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(diagnosis, another.diagnosis)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(hospitalization, another.hospitalization)
        && java.util.Objects.equals(serviceProvider, another.serviceProvider)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(appointment, another.appointment)
        && java.util.Objects.equals(participant, another.participant);
  }

  /**
   * Computes a hash code from attributes: {@code priority}, {@code type}, {@code reasonCode}, {@code subject}, {@code basedOn}, {@code episodeOfCare}, {@code meta}, {@code language}, {@code contained}, {@code length}, {@code status}, {@code serviceType}, {@code modifierExtension}, {@code reasonReference}, {@code identifier}, {@code period}, {@code id}, {@code implicitRules}, {@code statusHistory}, {@code _class}, {@code text}, {@code account}, {@code classHistory}, {@code extension}, {@code location}, {@code diagnosis}, {@code resourceType}, {@code hospitalization}, {@code serviceProvider}, {@code partOf}, {@code appointment}, {@code participant}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(episodeOfCare);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(length);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(serviceType);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(statusHistory);
    h += (h << 5) + _class.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(account);
    h += (h << 5) + java.util.Objects.hashCode(classHistory);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(diagnosis);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(hospitalization);
    h += (h << 5) + java.util.Objects.hashCode(serviceProvider);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(appointment);
    h += (h << 5) + java.util.Objects.hashCode(participant);
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Encounter{");
    if (priority != null) {
      builder.append("priority=").append(priority);
    }
    if (type != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (reasonCode != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (subject != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (basedOn != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (episodeOfCare != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("episodeOfCare=").append(episodeOfCare);
    }
    if (meta != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (length != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("length=").append(length);
    }
    if (status != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (serviceType != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("serviceType=").append(serviceType);
    }
    if (modifierExtension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (reasonReference != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (identifier != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (period != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (id != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (statusHistory != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("statusHistory=").append(statusHistory);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("_class=").append(_class);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (account != null) {
      builder.append(", ");
      builder.append("account=").append(account);
    }
    if (classHistory != null) {
      builder.append(", ");
      builder.append("classHistory=").append(classHistory);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (diagnosis != null) {
      builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (hospitalization != null) {
      builder.append(", ");
      builder.append("hospitalization=").append(hospitalization);
    }
    if (serviceProvider != null) {
      builder.append(", ");
      builder.append("serviceProvider=").append(serviceProvider);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (appointment != null) {
      builder.append(", ");
      builder.append("appointment=").append(appointment);
    }
    if (participant != null) {
      builder.append(", ");
      builder.append("participant=").append(participant);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Encounter", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Encounter {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> episodeOfCare = java.util.Optional.empty();
    boolean episodeOfCareIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> length = java.util.Optional.empty();
    boolean lengthIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EncounterStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> serviceType = java.util.Optional.empty();
    boolean serviceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Encounter_StatusHistory>> statusHistory = java.util.Optional.empty();
    boolean statusHistoryIsSet;
    @javax.annotation.Nullable com.fhir.Coding _class;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> account = java.util.Optional.empty();
    boolean accountIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Encounter_ClassHistory>> classHistory = java.util.Optional.empty();
    boolean classHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Encounter_Location>> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Encounter_Diagnosis>> diagnosis = java.util.Optional.empty();
    boolean diagnosisIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Encounter_Hospitalization> hospitalization = java.util.Optional.empty();
    boolean hospitalizationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> serviceProvider = java.util.Optional.empty();
    boolean serviceProviderIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> appointment = java.util.Optional.empty();
    boolean appointmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Encounter_Participant>> participant = java.util.Optional.empty();
    boolean participantIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("episodeOfCare")
    public void setEpisodeOfCare(java.util.Optional<java.util.List<com.fhir.Reference>> episodeOfCare) {
      this.episodeOfCare = episodeOfCare;
      this.episodeOfCareIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    public void setLength(java.util.Optional<com.fhir.Duration> length) {
      this.length = length;
      this.lengthIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.EncounterStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    public void setServiceType(java.util.Optional<com.fhir.CodeableConcept> serviceType) {
      this.serviceType = serviceType;
      this.serviceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("statusHistory")
    public void setStatusHistory(java.util.Optional<java.util.List<com.fhir.Encounter_StatusHistory>> statusHistory) {
      this.statusHistory = statusHistory;
      this.statusHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    public void set_class(com.fhir.Coding _class) {
      this._class = _class;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public void setAccount(java.util.Optional<java.util.List<com.fhir.Reference>> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("classHistory")
    public void setClassHistory(java.util.Optional<java.util.List<com.fhir.Encounter_ClassHistory>> classHistory) {
      this.classHistory = classHistory;
      this.classHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<java.util.List<com.fhir.Encounter_Location>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public void setDiagnosis(java.util.Optional<java.util.List<com.fhir.Encounter_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("hospitalization")
    public void setHospitalization(java.util.Optional<com.fhir.Encounter_Hospitalization> hospitalization) {
      this.hospitalization = hospitalization;
      this.hospitalizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProvider")
    public void setServiceProvider(java.util.Optional<com.fhir.Reference> serviceProvider) {
      this.serviceProvider = serviceProvider;
      this.serviceProviderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<com.fhir.Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("appointment")
    public void setAppointment(java.util.Optional<java.util.List<com.fhir.Reference>> appointment) {
      this.appointment = appointment;
      this.appointmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public void setParticipant(java.util.Optional<java.util.List<com.fhir.Encounter_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> episodeOfCare() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> length() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EncounterStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> serviceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Encounter_StatusHistory>> statusHistory() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Coding _class() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> account() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Encounter_ClassHistory>> classHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Encounter_Location>> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Encounter_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Encounter_Hospitalization> hospitalization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> serviceProvider() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> appointment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Encounter_Participant>> participant() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableEncounter fromJson(Json json) {
    ImmutableEncounter.Builder builder = ((ImmutableEncounter.Builder) ImmutableEncounter.builder());
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.episodeOfCareIsSet) {
      builder.episodeOfCare(json.episodeOfCare);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.lengthIsSet) {
      builder.length(json.length);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.serviceTypeIsSet) {
      builder.serviceType(json.serviceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusHistoryIsSet) {
      builder.statusHistory(json.statusHistory);
    }
    if (json._class != null) {
      builder._class(json._class);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.classHistoryIsSet) {
      builder.classHistory(json.classHistory);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.hospitalizationIsSet) {
      builder.hospitalization(json.hospitalization);
    }
    if (json.serviceProviderIsSet) {
      builder.serviceProvider(json.serviceProvider);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.appointmentIsSet) {
      builder.appointment(json.appointment);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    return (ImmutableEncounter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter instance
   */
  public static Encounter copyOf(Encounter instance) {
    if (instance instanceof ImmutableEncounter) {
      return (ImmutableEncounter) instance;
    }
    return ((ImmutableEncounter.Builder) ImmutableEncounter.builder())
        .priority(instance.priority())
        .type(instance.type())
        .reasonCode(instance.reasonCode())
        .subject(instance.subject())
        .basedOn(instance.basedOn())
        .episodeOfCare(instance.episodeOfCare())
        .meta(instance.meta())
        .language(instance.language())
        .contained(instance.contained())
        .length(instance.length())
        .status(instance.status())
        .serviceType(instance.serviceType())
        .modifierExtension(instance.modifierExtension())
        .reasonReference(instance.reasonReference())
        .identifier(instance.identifier())
        .period(instance.period())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .statusHistory(instance.statusHistory())
        ._class(instance._class())
        .text(instance.text())
        .account(instance.account())
        .classHistory(instance.classHistory())
        .extension(instance.extension())
        .location(instance.location())
        .diagnosis(instance.diagnosis())
        .resourceType(instance.resourceType())
        .hospitalization(instance.hospitalization())
        .serviceProvider(instance.serviceProvider())
        .partOf(instance.partOf())
        .appointment(instance.appointment())
        .participant(instance.participant())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter Encounter}.
   * <pre>
   * ImmutableEncounter.builder()
   *    .priority(com.fhir.CodeableConcept) // optional {@link Encounter#priority() priority}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter#type() type}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter#reasonCode() reasonCode}
   *    .subject(com.fhir.Reference) // optional {@link Encounter#subject() subject}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Encounter#basedOn() basedOn}
   *    .episodeOfCare(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Encounter#episodeOfCare() episodeOfCare}
   *    .meta(com.fhir.Meta) // optional {@link Encounter#meta() meta}
   *    .language(com.fhir.code) // optional {@link Encounter#language() language}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Encounter#contained() contained}
   *    .length(com.fhir.Duration) // optional {@link Encounter#length() length}
   *    .status(com.fhir.EncounterStatus) // optional {@link Encounter#status() status}
   *    .serviceType(com.fhir.CodeableConcept) // optional {@link Encounter#serviceType() serviceType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Encounter#modifierExtension() modifierExtension}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Encounter#reasonReference() reasonReference}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Encounter#identifier() identifier}
   *    .period(com.fhir.Period) // optional {@link Encounter#period() period}
   *    .id(com.fhir.id) // optional {@link Encounter#id() id}
   *    .implicitRules(com.fhir.uri) // optional {@link Encounter#implicitRules() implicitRules}
   *    .statusHistory(List&amp;lt;com.fhir.Encounter_StatusHistory&amp;gt;) // optional {@link Encounter#statusHistory() statusHistory}
   *    ._class(com.fhir.Coding) // required {@link Encounter#_class() _class}
   *    .text(com.fhir.Narrative) // optional {@link Encounter#text() text}
   *    .account(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Encounter#account() account}
   *    .classHistory(List&amp;lt;com.fhir.Encounter_ClassHistory&amp;gt;) // optional {@link Encounter#classHistory() classHistory}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Encounter#extension() extension}
   *    .location(List&amp;lt;com.fhir.Encounter_Location&amp;gt;) // optional {@link Encounter#location() location}
   *    .diagnosis(List&amp;lt;com.fhir.Encounter_Diagnosis&amp;gt;) // optional {@link Encounter#diagnosis() diagnosis}
   *    .resourceType(String) // required {@link Encounter#resourceType() resourceType}
   *    .hospitalization(com.fhir.Encounter_Hospitalization) // optional {@link Encounter#hospitalization() hospitalization}
   *    .serviceProvider(com.fhir.Reference) // optional {@link Encounter#serviceProvider() serviceProvider}
   *    .partOf(com.fhir.Reference) // optional {@link Encounter#partOf() partOf}
   *    .appointment(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Encounter#appointment() appointment}
   *    .participant(List&amp;lt;com.fhir.Encounter_Participant&amp;gt;) // optional {@link Encounter#participant() participant}
   *    .build();
   * </pre>
   * @return A new Encounter builder
   */
  public static _classBuildStage builder() {
    return new ImmutableEncounter.Builder();
  }

  /**
   * Builds instances of type {@link Encounter Encounter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Encounter", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements _classBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT__CLASS = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_PRIORITY = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_REASON_CODE = 0x4L;
    private static final long OPT_BIT_SUBJECT = 0x8L;
    private static final long OPT_BIT_BASED_ON = 0x10L;
    private static final long OPT_BIT_EPISODE_OF_CARE = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_LENGTH = 0x200L;
    private static final long OPT_BIT_STATUS = 0x400L;
    private static final long OPT_BIT_SERVICE_TYPE = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_PERIOD = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_STATUS_HISTORY = 0x40000L;
    private static final long OPT_BIT_TEXT = 0x80000L;
    private static final long OPT_BIT_ACCOUNT = 0x100000L;
    private static final long OPT_BIT_CLASS_HISTORY = 0x200000L;
    private static final long OPT_BIT_EXTENSION = 0x400000L;
    private static final long OPT_BIT_LOCATION = 0x800000L;
    private static final long OPT_BIT_DIAGNOSIS = 0x1000000L;
    private static final long OPT_BIT_HOSPITALIZATION = 0x2000000L;
    private static final long OPT_BIT_SERVICE_PROVIDER = 0x4000000L;
    private static final long OPT_BIT_PART_OF = 0x8000000L;
    private static final long OPT_BIT_APPOINTMENT = 0x10000000L;
    private static final long OPT_BIT_PARTICIPANT = 0x20000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> episodeOfCare;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Duration length;
    private @javax.annotation.Nullable com.fhir.EncounterStatus status;
    private @javax.annotation.Nullable com.fhir.CodeableConcept serviceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Encounter_StatusHistory> statusHistory;
    private @javax.annotation.Nullable com.fhir.Coding _class;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> account;
    private @javax.annotation.Nullable java.util.List<com.fhir.Encounter_ClassHistory> classHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Location> location;
    private @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Diagnosis> diagnosis;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Encounter_Hospitalization hospitalization;
    private @javax.annotation.Nullable com.fhir.Reference serviceProvider;
    private @javax.annotation.Nullable com.fhir.Reference partOf;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> appointment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Encounter_Participant> participant;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.CodeableConcept> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for chained invocation
     */
    public final Builder episodeOfCare(java.util.List<com.fhir.Reference> episodeOfCare) {
      checkNotIsSet(episodeOfCareIsSet(), "episodeOfCare");
      this.episodeOfCare = java.util.Objects.requireNonNull(episodeOfCare, "episodeOfCare");
      optBits |= OPT_BIT_EPISODE_OF_CARE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("episodeOfCare")
    public final Builder episodeOfCare(java.util.Optional<? extends java.util.List<com.fhir.Reference>> episodeOfCare) {
      checkNotIsSet(episodeOfCareIsSet(), "episodeOfCare");
      this.episodeOfCare = episodeOfCare.orElse(null);
      optBits |= OPT_BIT_EPISODE_OF_CARE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
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
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
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
     * Initializes the optional value {@link Encounter#language() language} to language.
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
     * Initializes the optional value {@link Encounter#language() language} to language.
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
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
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
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
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
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for chained invocation
     */
    public final Builder length(com.fhir.Duration length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = java.util.Objects.requireNonNull(length, "length");
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    public final Builder length(java.util.Optional<? extends com.fhir.Duration> length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = length.orElse(null);
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.EncounterStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.EncounterStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceType(com.fhir.CodeableConcept serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = java.util.Objects.requireNonNull(serviceType, "serviceType");
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    public final Builder serviceType(java.util.Optional<? extends com.fhir.CodeableConcept> serviceType) {
      checkNotIsSet(serviceTypeIsSet(), "serviceType");
      this.serviceType = serviceType.orElse(null);
      optBits |= OPT_BIT_SERVICE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Encounter#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#id() id} to id.
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
     * Initializes the optional value {@link Encounter#id() id} to id.
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
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusHistory(java.util.List<com.fhir.Encounter_StatusHistory> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = java.util.Objects.requireNonNull(statusHistory, "statusHistory");
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusHistory")
    public final Builder statusHistory(java.util.Optional<? extends java.util.List<com.fhir.Encounter_StatusHistory>> statusHistory) {
      checkNotIsSet(statusHistoryIsSet(), "statusHistory");
      this.statusHistory = statusHistory.orElse(null);
      optBits |= OPT_BIT_STATUS_HISTORY;
      return this;
    }

    /**
     * Initializes the value for the {@link Encounter#_class() _class} attribute.
     * @param _class The value for _class 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    public final Builder _class(com.fhir.Coding _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = java.util.Objects.requireNonNull(_class, "_class");
      initBits &= ~INIT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#text() text} to text.
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
     * Initializes the optional value {@link Encounter#text() text} to text.
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
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(java.util.List<com.fhir.Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = java.util.Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public final Builder account(java.util.Optional<? extends java.util.List<com.fhir.Reference>> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder classHistory(java.util.List<com.fhir.Encounter_ClassHistory> classHistory) {
      checkNotIsSet(classHistoryIsSet(), "classHistory");
      this.classHistory = java.util.Objects.requireNonNull(classHistory, "classHistory");
      optBits |= OPT_BIT_CLASS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("classHistory")
    public final Builder classHistory(java.util.Optional<? extends java.util.List<com.fhir.Encounter_ClassHistory>> classHistory) {
      checkNotIsSet(classHistoryIsSet(), "classHistory");
      this.classHistory = classHistory.orElse(null);
      optBits |= OPT_BIT_CLASS_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(java.util.List<com.fhir.Encounter_Location> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Location>> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(java.util.List<com.fhir.Encounter_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = java.util.Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public final Builder diagnosis(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the value for the {@link Encounter#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for chained invocation
     */
    public final Builder hospitalization(com.fhir.Encounter_Hospitalization hospitalization) {
      checkNotIsSet(hospitalizationIsSet(), "hospitalization");
      this.hospitalization = java.util.Objects.requireNonNull(hospitalization, "hospitalization");
      optBits |= OPT_BIT_HOSPITALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hospitalization")
    public final Builder hospitalization(java.util.Optional<? extends com.fhir.Encounter_Hospitalization> hospitalization) {
      checkNotIsSet(hospitalizationIsSet(), "hospitalization");
      this.hospitalization = hospitalization.orElse(null);
      optBits |= OPT_BIT_HOSPITALIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for chained invocation
     */
    public final Builder serviceProvider(com.fhir.Reference serviceProvider) {
      checkNotIsSet(serviceProviderIsSet(), "serviceProvider");
      this.serviceProvider = java.util.Objects.requireNonNull(serviceProvider, "serviceProvider");
      optBits |= OPT_BIT_SERVICE_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProvider")
    public final Builder serviceProvider(java.util.Optional<? extends com.fhir.Reference> serviceProvider) {
      checkNotIsSet(serviceProviderIsSet(), "serviceProvider");
      this.serviceProvider = serviceProvider.orElse(null);
      optBits |= OPT_BIT_SERVICE_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(com.fhir.Reference partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for chained invocation
     */
    public final Builder appointment(java.util.List<com.fhir.Reference> appointment) {
      checkNotIsSet(appointmentIsSet(), "appointment");
      this.appointment = java.util.Objects.requireNonNull(appointment, "appointment");
      optBits |= OPT_BIT_APPOINTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appointment")
    public final Builder appointment(java.util.Optional<? extends java.util.List<com.fhir.Reference>> appointment) {
      checkNotIsSet(appointmentIsSet(), "appointment");
      this.appointment = appointment.orElse(null);
      optBits |= OPT_BIT_APPOINTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(java.util.List<com.fhir.Encounter_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = java.util.Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public final Builder participant(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Builds a new {@link Encounter Encounter}.
     * @return An immutable instance of Encounter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Encounter build() {
      checkRequiredAttributes();
      return new ImmutableEncounter(
          priority,
          type,
          reasonCode,
          subject,
          basedOn,
          episodeOfCare,
          meta,
          language,
          contained,
          length,
          status,
          serviceType,
          modifierExtension,
          reasonReference,
          identifier,
          period,
          id,
          implicitRules,
          statusHistory,
          _class,
          text,
          account,
          classHistory,
          extension,
          location,
          diagnosis,
          resourceType,
          hospitalization,
          serviceProvider,
          partOf,
          appointment,
          participant);
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean episodeOfCareIsSet() {
      return (optBits & OPT_BIT_EPISODE_OF_CARE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean lengthIsSet() {
      return (optBits & OPT_BIT_LENGTH) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean serviceTypeIsSet() {
      return (optBits & OPT_BIT_SERVICE_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusHistoryIsSet() {
      return (optBits & OPT_BIT_STATUS_HISTORY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean classHistoryIsSet() {
      return (optBits & OPT_BIT_CLASS_HISTORY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean hospitalizationIsSet() {
      return (optBits & OPT_BIT_HOSPITALIZATION) != 0;
    }

    private boolean serviceProviderIsSet() {
      return (optBits & OPT_BIT_SERVICE_PROVIDER) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean appointmentIsSet() {
      return (optBits & OPT_BIT_APPOINTMENT) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean _classIsSet() {
      return (initBits & INIT_BIT__CLASS) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Encounter is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!_classIsSet()) attributes.add("_class");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Encounter, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Encounter", generator = "Immutables")
  public interface _classBuildStage {
    /**
     * Initializes the value for the {@link Encounter#_class() _class} attribute.
     * @param _class The value for _class 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage _class(com.fhir.Coding _class);
  }

  @org.immutables.value.Generated(from = "Encounter", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Encounter#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Encounter", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.CodeableConcept priority);

    /**
     * Initializes the optional value {@link Encounter#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.CodeableConcept> priority);

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(java.util.List<com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Encounter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type);

    /**
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Encounter#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link Encounter#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link Encounter#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for chained invocation
     */
    BuildFinal episodeOfCare(java.util.List<com.fhir.Reference> episodeOfCare);

    /**
     * Initializes the optional value {@link Encounter#episodeOfCare() episodeOfCare} to episodeOfCare.
     * @param episodeOfCare The value for episodeOfCare
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal episodeOfCare(java.util.Optional<? extends java.util.List<com.fhir.Reference>> episodeOfCare);

    /**
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Encounter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Encounter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Encounter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Encounter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for chained invocation
     */
    BuildFinal length(com.fhir.Duration length);

    /**
     * Initializes the optional value {@link Encounter#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal length(java.util.Optional<? extends com.fhir.Duration> length);

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.EncounterStatus status);

    /**
     * Initializes the optional value {@link Encounter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.EncounterStatus> status);

    /**
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceType(com.fhir.CodeableConcept serviceType);

    /**
     * Initializes the optional value {@link Encounter#serviceType() serviceType} to serviceType.
     * @param serviceType The value for serviceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceType(java.util.Optional<? extends com.fhir.CodeableConcept> serviceType);

    /**
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link Encounter#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Encounter#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Encounter#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link Encounter#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link Encounter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Encounter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Encounter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusHistory(java.util.List<com.fhir.Encounter_StatusHistory> statusHistory);

    /**
     * Initializes the optional value {@link Encounter#statusHistory() statusHistory} to statusHistory.
     * @param statusHistory The value for statusHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusHistory(java.util.Optional<? extends java.util.List<com.fhir.Encounter_StatusHistory>> statusHistory);

    /**
     * Initializes the optional value {@link Encounter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Encounter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(java.util.List<com.fhir.Reference> account);

    /**
     * Initializes the optional value {@link Encounter#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(java.util.Optional<? extends java.util.List<com.fhir.Reference>> account);

    /**
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal classHistory(java.util.List<com.fhir.Encounter_ClassHistory> classHistory);

    /**
     * Initializes the optional value {@link Encounter#classHistory() classHistory} to classHistory.
     * @param classHistory The value for classHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal classHistory(java.util.Optional<? extends java.util.List<com.fhir.Encounter_ClassHistory>> classHistory);

    /**
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Encounter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(java.util.List<com.fhir.Encounter_Location> location);

    /**
     * Initializes the optional value {@link Encounter#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Location>> location);

    /**
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(java.util.List<com.fhir.Encounter_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link Encounter#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal hospitalization(com.fhir.Encounter_Hospitalization hospitalization);

    /**
     * Initializes the optional value {@link Encounter#hospitalization() hospitalization} to hospitalization.
     * @param hospitalization The value for hospitalization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal hospitalization(java.util.Optional<? extends com.fhir.Encounter_Hospitalization> hospitalization);

    /**
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal serviceProvider(com.fhir.Reference serviceProvider);

    /**
     * Initializes the optional value {@link Encounter#serviceProvider() serviceProvider} to serviceProvider.
     * @param serviceProvider The value for serviceProvider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal serviceProvider(java.util.Optional<? extends com.fhir.Reference> serviceProvider);

    /**
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(com.fhir.Reference partOf);

    /**
     * Initializes the optional value {@link Encounter#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appointment(java.util.List<com.fhir.Reference> appointment);

    /**
     * Initializes the optional value {@link Encounter#appointment() appointment} to appointment.
     * @param appointment The value for appointment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appointment(java.util.Optional<? extends java.util.List<com.fhir.Reference>> appointment);

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(java.util.List<com.fhir.Encounter_Participant> participant);

    /**
     * Initializes the optional value {@link Encounter#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(java.util.Optional<? extends java.util.List<com.fhir.Encounter_Participant>> participant);

    /**
     * Builds a new {@link Encounter Encounter}.
     * @return An immutable instance of Encounter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Encounter build();
  }
}
