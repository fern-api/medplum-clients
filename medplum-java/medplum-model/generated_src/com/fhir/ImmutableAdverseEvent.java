//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link AdverseEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdverseEvent.builder()}.
 */
@org.immutables.value.Generated(from = "AdverseEvent", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAdverseEvent implements com.fhir.AdverseEvent {
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept event;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subjectMedicalHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> contributor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.AdverseEvent_SuspectEntity> suspectEntity;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept severity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> referenceDocument;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> resultingCondition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept outcome;
  private final @javax.annotation.Nullable com.fhir.dateTime recordedDate;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept seriousness;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> study;
  private final @javax.annotation.Nullable com.fhir.Reference recorder;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable com.fhir.dateTime detected;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.AdverseeventActuality actuality;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;

  private ImmutableAdverseEvent(
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept event,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subjectMedicalHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> contributor,
      @javax.annotation.Nullable java.util.List<com.fhir.AdverseEvent_SuspectEntity> suspectEntity,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept severity,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> referenceDocument,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> resultingCondition,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.CodeableConcept outcome,
      @javax.annotation.Nullable com.fhir.dateTime recordedDate,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept seriousness,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> study,
      @javax.annotation.Nullable com.fhir.Reference recorder,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable com.fhir.dateTime detected,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.AdverseeventActuality actuality,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category) {
    this.identifier = identifier;
    this.event = event;
    this.subjectMedicalHistory = subjectMedicalHistory;
    this.contributor = contributor;
    this.suspectEntity = suspectEntity;
    this.implicitRules = implicitRules;
    this.severity = severity;
    this.extension = extension;
    this.language = language;
    this.referenceDocument = referenceDocument;
    this.resultingCondition = resultingCondition;
    this.contained = contained;
    this.subject = subject;
    this.date = date;
    this.outcome = outcome;
    this.recordedDate = recordedDate;
    this.text = text;
    this.seriousness = seriousness;
    this.id = id;
    this.encounter = encounter;
    this.resourceType = resourceType;
    this.study = study;
    this.recorder = recorder;
    this.meta = meta;
    this.location = location;
    this.detected = detected;
    this.modifierExtension = modifierExtension;
    this.actuality = actuality;
    this.category = category;
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code event} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("event")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> event() {
    return java.util.Optional.ofNullable(event);
  }

  /**
   * @return The value of the {@code subjectMedicalHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectMedicalHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subjectMedicalHistory() {
    return java.util.Optional.ofNullable(subjectMedicalHistory);
  }

  /**
   * @return The value of the {@code contributor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contributor")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> contributor() {
    return java.util.Optional.ofNullable(contributor);
  }

  /**
   * @return The value of the {@code suspectEntity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("suspectEntity")
  @Override
  public java.util.Optional<java.util.List<com.fhir.AdverseEvent_SuspectEntity>> suspectEntity() {
    return java.util.Optional.ofNullable(suspectEntity);
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
   * @return The value of the {@code severity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("severity")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> severity() {
    return java.util.Optional.ofNullable(severity);
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
   * @return The value of the {@code referenceDocument} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referenceDocument")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> referenceDocument() {
    return java.util.Optional.ofNullable(referenceDocument);
  }

  /**
   * @return The value of the {@code resultingCondition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resultingCondition")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> resultingCondition() {
    return java.util.Optional.ofNullable(resultingCondition);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> outcome() {
    return java.util.Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code recordedDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recordedDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> recordedDate() {
    return java.util.Optional.ofNullable(recordedDate);
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
   * @return The value of the {@code seriousness} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("seriousness")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> seriousness() {
    return java.util.Optional.ofNullable(seriousness);
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
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code study} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("study")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> study() {
    return java.util.Optional.ofNullable(study);
  }

  /**
   * @return The value of the {@code recorder} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recorder")
  @Override
  public java.util.Optional<com.fhir.Reference> recorder() {
    return java.util.Optional.ofNullable(recorder);
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
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.Reference> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code detected} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detected")
  @Override
  public java.util.Optional<com.fhir.dateTime> detected() {
    return java.util.Optional.ofNullable(detected);
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
   * @return The value of the {@code actuality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("actuality")
  @Override
  public java.util.Optional<com.fhir.AdverseeventActuality> actuality() {
    return java.util.Optional.ofNullable(actuality);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAdverseEvent(
        newValue,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAdverseEvent(
        value,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#event() event} attribute.
   * @param value The value for event
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withEvent(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "event");
    if (this.event == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        newValue,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#event() event} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for event
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withEvent(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.event == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        value,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} attribute.
   * @param value The value for subjectMedicalHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSubjectMedicalHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subjectMedicalHistory");
    if (this.subjectMedicalHistory == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        newValue,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectMedicalHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSubjectMedicalHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subjectMedicalHistory == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        value,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#contributor() contributor} attribute.
   * @param value The value for contributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withContributor(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "contributor");
    if (this.contributor == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        newValue,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#contributor() contributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withContributor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.contributor == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        value,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#suspectEntity() suspectEntity} attribute.
   * @param value The value for suspectEntity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSuspectEntity(java.util.List<com.fhir.AdverseEvent_SuspectEntity> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.AdverseEvent_SuspectEntity> newValue = java.util.Objects.requireNonNull(value, "suspectEntity");
    if (this.suspectEntity == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        newValue,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#suspectEntity() suspectEntity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for suspectEntity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSuspectEntity(java.util.Optional<? extends java.util.List<com.fhir.AdverseEvent_SuspectEntity>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.AdverseEvent_SuspectEntity> value = optional.orElse(null);
    if (this.suspectEntity == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        value,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        newValue,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        value,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSeverity(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        newValue,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSeverity(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        value,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        newValue,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        value,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        newValue,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        value,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#referenceDocument() referenceDocument} attribute.
   * @param value The value for referenceDocument
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withReferenceDocument(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "referenceDocument");
    if (this.referenceDocument == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        newValue,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#referenceDocument() referenceDocument} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceDocument
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withReferenceDocument(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.referenceDocument == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        value,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#resultingCondition() resultingCondition} attribute.
   * @param value The value for resultingCondition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withResultingCondition(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "resultingCondition");
    if (this.resultingCondition == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        newValue,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#resultingCondition() resultingCondition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resultingCondition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withResultingCondition(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.resultingCondition == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        value,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        newValue,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        value,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdverseEvent#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdverseEvent withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        newValue,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        newValue,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        value,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withOutcome(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        newValue,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withOutcome(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        value,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#recordedDate() recordedDate} attribute.
   * @param value The value for recordedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withRecordedDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "recordedDate");
    if (this.recordedDate == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        newValue,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#recordedDate() recordedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withRecordedDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.recordedDate == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        value,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        newValue,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        value,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#seriousness() seriousness} attribute.
   * @param value The value for seriousness
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSeriousness(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "seriousness");
    if (this.seriousness == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        newValue,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#seriousness() seriousness} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriousness
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSeriousness(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.seriousness == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        value,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        newValue,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        value,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        newValue,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        value,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdverseEvent#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdverseEvent withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        newValue,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#study() study} attribute.
   * @param value The value for study
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withStudy(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "study");
    if (this.study == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        newValue,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#study() study} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for study
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withStudy(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.study == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        value,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withRecorder(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        newValue,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withRecorder(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        value,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        newValue,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        value,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        newValue,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        value,
        this.detected,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#detected() detected} attribute.
   * @param value The value for detected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withDetected(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "detected");
    if (this.detected == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        newValue,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#detected() detected} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detected
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withDetected(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.detected == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        value,
        this.modifierExtension,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        newValue,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        value,
        this.actuality,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#actuality() actuality} attribute.
   * @param value The value for actuality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withActuality(com.fhir.AdverseeventActuality value) {
    @javax.annotation.Nullable com.fhir.AdverseeventActuality newValue = java.util.Objects.requireNonNull(value, "actuality");
    if (this.actuality == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        newValue,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#actuality() actuality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actuality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withActuality(java.util.Optional<? extends com.fhir.AdverseeventActuality> optional) {
    @javax.annotation.Nullable com.fhir.AdverseeventActuality value = optional.orElse(null);
    if (this.actuality == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        value,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableAdverseEvent(
        this.identifier,
        this.event,
        this.subjectMedicalHistory,
        this.contributor,
        this.suspectEntity,
        this.implicitRules,
        this.severity,
        this.extension,
        this.language,
        this.referenceDocument,
        this.resultingCondition,
        this.contained,
        this.subject,
        this.date,
        this.outcome,
        this.recordedDate,
        this.text,
        this.seriousness,
        this.id,
        this.encounter,
        this.resourceType,
        this.study,
        this.recorder,
        this.meta,
        this.location,
        this.detected,
        this.modifierExtension,
        this.actuality,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdverseEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdverseEvent
        && equalTo((ImmutableAdverseEvent) another);
  }

  private boolean equalTo(ImmutableAdverseEvent another) {
    return java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(event, another.event)
        && java.util.Objects.equals(subjectMedicalHistory, another.subjectMedicalHistory)
        && java.util.Objects.equals(contributor, another.contributor)
        && java.util.Objects.equals(suspectEntity, another.suspectEntity)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(severity, another.severity)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(referenceDocument, another.referenceDocument)
        && java.util.Objects.equals(resultingCondition, another.resultingCondition)
        && java.util.Objects.equals(contained, another.contained)
        && subject.equals(another.subject)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(recordedDate, another.recordedDate)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(seriousness, another.seriousness)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(encounter, another.encounter)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(study, another.study)
        && java.util.Objects.equals(recorder, another.recorder)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(detected, another.detected)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(actuality, another.actuality)
        && java.util.Objects.equals(category, another.category);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code event}, {@code subjectMedicalHistory}, {@code contributor}, {@code suspectEntity}, {@code implicitRules}, {@code severity}, {@code extension}, {@code language}, {@code referenceDocument}, {@code resultingCondition}, {@code contained}, {@code subject}, {@code date}, {@code outcome}, {@code recordedDate}, {@code text}, {@code seriousness}, {@code id}, {@code encounter}, {@code resourceType}, {@code study}, {@code recorder}, {@code meta}, {@code location}, {@code detected}, {@code modifierExtension}, {@code actuality}, {@code category}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(event);
    h += (h << 5) + java.util.Objects.hashCode(subjectMedicalHistory);
    h += (h << 5) + java.util.Objects.hashCode(contributor);
    h += (h << 5) + java.util.Objects.hashCode(suspectEntity);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(severity);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(referenceDocument);
    h += (h << 5) + java.util.Objects.hashCode(resultingCondition);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(recordedDate);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(seriousness);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(study);
    h += (h << 5) + java.util.Objects.hashCode(recorder);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(detected);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(actuality);
    h += (h << 5) + java.util.Objects.hashCode(category);
    return h;
  }

  /**
   * Prints the immutable value {@code AdverseEvent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("AdverseEvent{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (event != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("event=").append(event);
    }
    if (subjectMedicalHistory != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("subjectMedicalHistory=").append(subjectMedicalHistory);
    }
    if (contributor != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contributor=").append(contributor);
    }
    if (suspectEntity != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("suspectEntity=").append(suspectEntity);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (severity != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (referenceDocument != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("referenceDocument=").append(referenceDocument);
    }
    if (resultingCondition != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("resultingCondition=").append(resultingCondition);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("subject=").append(subject);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (recordedDate != null) {
      builder.append(", ");
      builder.append("recordedDate=").append(recordedDate);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (seriousness != null) {
      builder.append(", ");
      builder.append("seriousness=").append(seriousness);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (study != null) {
      builder.append(", ");
      builder.append("study=").append(study);
    }
    if (recorder != null) {
      builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (detected != null) {
      builder.append(", ");
      builder.append("detected=").append(detected);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (actuality != null) {
      builder.append(", ");
      builder.append("actuality=").append(actuality);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "AdverseEvent", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.AdverseEvent {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> event = java.util.Optional.empty();
    boolean eventIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subjectMedicalHistory = java.util.Optional.empty();
    boolean subjectMedicalHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> contributor = java.util.Optional.empty();
    boolean contributorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.AdverseEvent_SuspectEntity>> suspectEntity = java.util.Optional.empty();
    boolean suspectEntityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> severity = java.util.Optional.empty();
    boolean severityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> referenceDocument = java.util.Optional.empty();
    boolean referenceDocumentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> resultingCondition = java.util.Optional.empty();
    boolean resultingConditionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> recordedDate = java.util.Optional.empty();
    boolean recordedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> seriousness = java.util.Optional.empty();
    boolean seriousnessIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> study = java.util.Optional.empty();
    boolean studyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> recorder = java.util.Optional.empty();
    boolean recorderIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> detected = java.util.Optional.empty();
    boolean detectedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.AdverseeventActuality> actuality = java.util.Optional.empty();
    boolean actualityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("event")
    public void setEvent(java.util.Optional<com.fhir.CodeableConcept> event) {
      this.event = event;
      this.eventIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectMedicalHistory")
    public void setSubjectMedicalHistory(java.util.Optional<java.util.List<com.fhir.Reference>> subjectMedicalHistory) {
      this.subjectMedicalHistory = subjectMedicalHistory;
      this.subjectMedicalHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contributor")
    public void setContributor(java.util.Optional<java.util.List<com.fhir.Reference>> contributor) {
      this.contributor = contributor;
      this.contributorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("suspectEntity")
    public void setSuspectEntity(java.util.Optional<java.util.List<com.fhir.AdverseEvent_SuspectEntity>> suspectEntity) {
      this.suspectEntity = suspectEntity;
      this.suspectEntityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public void setSeverity(java.util.Optional<com.fhir.CodeableConcept> severity) {
      this.severity = severity;
      this.severityIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("referenceDocument")
    public void setReferenceDocument(java.util.Optional<java.util.List<com.fhir.Reference>> referenceDocument) {
      this.referenceDocument = referenceDocument;
      this.referenceDocumentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resultingCondition")
    public void setResultingCondition(java.util.Optional<java.util.List<com.fhir.Reference>> resultingCondition) {
      this.resultingCondition = resultingCondition;
      this.resultingConditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.CodeableConcept> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recordedDate")
    public void setRecordedDate(java.util.Optional<com.fhir.dateTime> recordedDate) {
      this.recordedDate = recordedDate;
      this.recordedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("seriousness")
    public void setSeriousness(java.util.Optional<com.fhir.CodeableConcept> seriousness) {
      this.seriousness = seriousness;
      this.seriousnessIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("study")
    public void setStudy(java.util.Optional<java.util.List<com.fhir.Reference>> study) {
      this.study = study;
      this.studyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorder")
    public void setRecorder(java.util.Optional<com.fhir.Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detected")
    public void setDetected(java.util.Optional<com.fhir.dateTime> detected) {
      this.detected = detected;
      this.detectedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("actuality")
    public void setActuality(java.util.Optional<com.fhir.AdverseeventActuality> actuality) {
      this.actuality = actuality;
      this.actualityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> event() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> subjectMedicalHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> contributor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.AdverseEvent_SuspectEntity>> suspectEntity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> severity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> referenceDocument() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> resultingCondition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> recordedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> seriousness() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> study() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> detected() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.AdverseeventActuality> actuality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAdverseEvent fromJson(Json json) {
    ImmutableAdverseEvent.Builder builder = ((ImmutableAdverseEvent.Builder) ImmutableAdverseEvent.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.eventIsSet) {
      builder.event(json.event);
    }
    if (json.subjectMedicalHistoryIsSet) {
      builder.subjectMedicalHistory(json.subjectMedicalHistory);
    }
    if (json.contributorIsSet) {
      builder.contributor(json.contributor);
    }
    if (json.suspectEntityIsSet) {
      builder.suspectEntity(json.suspectEntity);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.referenceDocumentIsSet) {
      builder.referenceDocument(json.referenceDocument);
    }
    if (json.resultingConditionIsSet) {
      builder.resultingCondition(json.resultingCondition);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.recordedDateIsSet) {
      builder.recordedDate(json.recordedDate);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.seriousnessIsSet) {
      builder.seriousness(json.seriousness);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.studyIsSet) {
      builder.study(json.study);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.detectedIsSet) {
      builder.detected(json.detected);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.actualityIsSet) {
      builder.actuality(json.actuality);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    return (ImmutableAdverseEvent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdverseEvent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AdverseEvent instance
   */
  public static AdverseEvent copyOf(AdverseEvent instance) {
    if (instance instanceof ImmutableAdverseEvent) {
      return (ImmutableAdverseEvent) instance;
    }
    return ((ImmutableAdverseEvent.Builder) ImmutableAdverseEvent.builder())
        .identifier(instance.identifier())
        .event(instance.event())
        .subjectMedicalHistory(instance.subjectMedicalHistory())
        .contributor(instance.contributor())
        .suspectEntity(instance.suspectEntity())
        .implicitRules(instance.implicitRules())
        .severity(instance.severity())
        .extension(instance.extension())
        .language(instance.language())
        .referenceDocument(instance.referenceDocument())
        .resultingCondition(instance.resultingCondition())
        .contained(instance.contained())
        .subject(instance.subject())
        .date(instance.date())
        .outcome(instance.outcome())
        .recordedDate(instance.recordedDate())
        .text(instance.text())
        .seriousness(instance.seriousness())
        .id(instance.id())
        .encounter(instance.encounter())
        .resourceType(instance.resourceType())
        .study(instance.study())
        .recorder(instance.recorder())
        .meta(instance.meta())
        .location(instance.location())
        .detected(instance.detected())
        .modifierExtension(instance.modifierExtension())
        .actuality(instance.actuality())
        .category(instance.category())
        .build();
  }

  /**
   * Creates a builder for {@link AdverseEvent AdverseEvent}.
   * <pre>
   * ImmutableAdverseEvent.builder()
   *    .identifier(com.fhir.Identifier) // optional {@link AdverseEvent#identifier() identifier}
   *    .event(com.fhir.CodeableConcept) // optional {@link AdverseEvent#event() event}
   *    .subjectMedicalHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory}
   *    .contributor(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#contributor() contributor}
   *    .suspectEntity(List&amp;lt;com.fhir.AdverseEvent_SuspectEntity&amp;gt;) // optional {@link AdverseEvent#suspectEntity() suspectEntity}
   *    .implicitRules(com.fhir.uri) // optional {@link AdverseEvent#implicitRules() implicitRules}
   *    .severity(com.fhir.CodeableConcept) // optional {@link AdverseEvent#severity() severity}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AdverseEvent#extension() extension}
   *    .language(com.fhir.code) // optional {@link AdverseEvent#language() language}
   *    .referenceDocument(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#referenceDocument() referenceDocument}
   *    .resultingCondition(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#resultingCondition() resultingCondition}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link AdverseEvent#contained() contained}
   *    .subject(com.fhir.Reference) // required {@link AdverseEvent#subject() subject}
   *    .date(com.fhir.dateTime) // optional {@link AdverseEvent#date() date}
   *    .outcome(com.fhir.CodeableConcept) // optional {@link AdverseEvent#outcome() outcome}
   *    .recordedDate(com.fhir.dateTime) // optional {@link AdverseEvent#recordedDate() recordedDate}
   *    .text(com.fhir.Narrative) // optional {@link AdverseEvent#text() text}
   *    .seriousness(com.fhir.CodeableConcept) // optional {@link AdverseEvent#seriousness() seriousness}
   *    .id(com.fhir.id) // optional {@link AdverseEvent#id() id}
   *    .encounter(com.fhir.Reference) // optional {@link AdverseEvent#encounter() encounter}
   *    .resourceType(String) // required {@link AdverseEvent#resourceType() resourceType}
   *    .study(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#study() study}
   *    .recorder(com.fhir.Reference) // optional {@link AdverseEvent#recorder() recorder}
   *    .meta(com.fhir.Meta) // optional {@link AdverseEvent#meta() meta}
   *    .location(com.fhir.Reference) // optional {@link AdverseEvent#location() location}
   *    .detected(com.fhir.dateTime) // optional {@link AdverseEvent#detected() detected}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AdverseEvent#modifierExtension() modifierExtension}
   *    .actuality(com.fhir.AdverseeventActuality) // optional {@link AdverseEvent#actuality() actuality}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link AdverseEvent#category() category}
   *    .build();
   * </pre>
   * @return A new AdverseEvent builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableAdverseEvent.Builder();
  }

  /**
   * Builds instances of type {@link AdverseEvent AdverseEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "AdverseEvent", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_EVENT = 0x2L;
    private static final long OPT_BIT_SUBJECT_MEDICAL_HISTORY = 0x4L;
    private static final long OPT_BIT_CONTRIBUTOR = 0x8L;
    private static final long OPT_BIT_SUSPECT_ENTITY = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_SEVERITY = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_REFERENCE_DOCUMENT = 0x200L;
    private static final long OPT_BIT_RESULTING_CONDITION = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_DATE = 0x1000L;
    private static final long OPT_BIT_OUTCOME = 0x2000L;
    private static final long OPT_BIT_RECORDED_DATE = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_SERIOUSNESS = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_ENCOUNTER = 0x40000L;
    private static final long OPT_BIT_STUDY = 0x80000L;
    private static final long OPT_BIT_RECORDER = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_LOCATION = 0x400000L;
    private static final long OPT_BIT_DETECTED = 0x800000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000000L;
    private static final long OPT_BIT_ACTUALITY = 0x2000000L;
    private static final long OPT_BIT_CATEGORY = 0x4000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept event;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subjectMedicalHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> contributor;
    private @javax.annotation.Nullable java.util.List<com.fhir.AdverseEvent_SuspectEntity> suspectEntity;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept severity;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> referenceDocument;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> resultingCondition;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.CodeableConcept outcome;
    private @javax.annotation.Nullable com.fhir.dateTime recordedDate;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept seriousness;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> study;
    private @javax.annotation.Nullable com.fhir.Reference recorder;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable com.fhir.dateTime detected;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.AdverseeventActuality actuality;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    public final Builder event(com.fhir.CodeableConcept event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = java.util.Objects.requireNonNull(event, "event");
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("event")
    public final Builder event(java.util.Optional<? extends com.fhir.CodeableConcept> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = event.orElse(null);
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectMedicalHistory(java.util.List<com.fhir.Reference> subjectMedicalHistory) {
      checkNotIsSet(subjectMedicalHistoryIsSet(), "subjectMedicalHistory");
      this.subjectMedicalHistory = java.util.Objects.requireNonNull(subjectMedicalHistory, "subjectMedicalHistory");
      optBits |= OPT_BIT_SUBJECT_MEDICAL_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectMedicalHistory")
    public final Builder subjectMedicalHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subjectMedicalHistory) {
      checkNotIsSet(subjectMedicalHistoryIsSet(), "subjectMedicalHistory");
      this.subjectMedicalHistory = subjectMedicalHistory.orElse(null);
      optBits |= OPT_BIT_SUBJECT_MEDICAL_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder contributor(java.util.List<com.fhir.Reference> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = java.util.Objects.requireNonNull(contributor, "contributor");
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contributor")
    public final Builder contributor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = contributor.orElse(null);
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for chained invocation
     */
    public final Builder suspectEntity(java.util.List<com.fhir.AdverseEvent_SuspectEntity> suspectEntity) {
      checkNotIsSet(suspectEntityIsSet(), "suspectEntity");
      this.suspectEntity = java.util.Objects.requireNonNull(suspectEntity, "suspectEntity");
      optBits |= OPT_BIT_SUSPECT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("suspectEntity")
    public final Builder suspectEntity(java.util.Optional<? extends java.util.List<com.fhir.AdverseEvent_SuspectEntity>> suspectEntity) {
      checkNotIsSet(suspectEntityIsSet(), "suspectEntity");
      this.suspectEntity = suspectEntity.orElse(null);
      optBits |= OPT_BIT_SUSPECT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(com.fhir.CodeableConcept severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = java.util.Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public final Builder severity(java.util.Optional<? extends com.fhir.CodeableConcept> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
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
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
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
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceDocument(java.util.List<com.fhir.Reference> referenceDocument) {
      checkNotIsSet(referenceDocumentIsSet(), "referenceDocument");
      this.referenceDocument = java.util.Objects.requireNonNull(referenceDocument, "referenceDocument");
      optBits |= OPT_BIT_REFERENCE_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceDocument")
    public final Builder referenceDocument(java.util.Optional<? extends java.util.List<com.fhir.Reference>> referenceDocument) {
      checkNotIsSet(referenceDocumentIsSet(), "referenceDocument");
      this.referenceDocument = referenceDocument.orElse(null);
      optBits |= OPT_BIT_REFERENCE_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for chained invocation
     */
    public final Builder resultingCondition(java.util.List<com.fhir.Reference> resultingCondition) {
      checkNotIsSet(resultingConditionIsSet(), "resultingCondition");
      this.resultingCondition = java.util.Objects.requireNonNull(resultingCondition, "resultingCondition");
      optBits |= OPT_BIT_RESULTING_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resultingCondition")
    public final Builder resultingCondition(java.util.Optional<? extends java.util.List<com.fhir.Reference>> resultingCondition) {
      checkNotIsSet(resultingConditionIsSet(), "resultingCondition");
      this.resultingCondition = resultingCondition.orElse(null);
      optBits |= OPT_BIT_RESULTING_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
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
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
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
     * Initializes the value for the {@link AdverseEvent#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.CodeableConcept outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.CodeableConcept> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder recordedDate(com.fhir.dateTime recordedDate) {
      checkNotIsSet(recordedDateIsSet(), "recordedDate");
      this.recordedDate = java.util.Objects.requireNonNull(recordedDate, "recordedDate");
      optBits |= OPT_BIT_RECORDED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recordedDate")
    public final Builder recordedDate(java.util.Optional<? extends com.fhir.dateTime> recordedDate) {
      checkNotIsSet(recordedDateIsSet(), "recordedDate");
      this.recordedDate = recordedDate.orElse(null);
      optBits |= OPT_BIT_RECORDED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
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
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
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
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriousness(com.fhir.CodeableConcept seriousness) {
      checkNotIsSet(seriousnessIsSet(), "seriousness");
      this.seriousness = java.util.Objects.requireNonNull(seriousness, "seriousness");
      optBits |= OPT_BIT_SERIOUSNESS;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seriousness")
    public final Builder seriousness(java.util.Optional<? extends com.fhir.CodeableConcept> seriousness) {
      checkNotIsSet(seriousnessIsSet(), "seriousness");
      this.seriousness = seriousness.orElse(null);
      optBits |= OPT_BIT_SERIOUSNESS;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
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
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
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
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the value for the {@link AdverseEvent#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for chained invocation
     */
    public final Builder study(java.util.List<com.fhir.Reference> study) {
      checkNotIsSet(studyIsSet(), "study");
      this.study = java.util.Objects.requireNonNull(study, "study");
      optBits |= OPT_BIT_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("study")
    public final Builder study(java.util.Optional<? extends java.util.List<com.fhir.Reference>> study) {
      checkNotIsSet(studyIsSet(), "study");
      this.study = study.orElse(null);
      optBits |= OPT_BIT_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorder(com.fhir.Reference recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = java.util.Objects.requireNonNull(recorder, "recorder");
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recorder")
    public final Builder recorder(java.util.Optional<? extends com.fhir.Reference> recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = recorder.orElse(null);
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
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
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
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
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for chained invocation
     */
    public final Builder detected(com.fhir.dateTime detected) {
      checkNotIsSet(detectedIsSet(), "detected");
      this.detected = java.util.Objects.requireNonNull(detected, "detected");
      optBits |= OPT_BIT_DETECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detected")
    public final Builder detected(java.util.Optional<? extends com.fhir.dateTime> detected) {
      checkNotIsSet(detectedIsSet(), "detected");
      this.detected = detected.orElse(null);
      optBits |= OPT_BIT_DETECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for chained invocation
     */
    public final Builder actuality(com.fhir.AdverseeventActuality actuality) {
      checkNotIsSet(actualityIsSet(), "actuality");
      this.actuality = java.util.Objects.requireNonNull(actuality, "actuality");
      optBits |= OPT_BIT_ACTUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actuality")
    public final Builder actuality(java.util.Optional<? extends com.fhir.AdverseeventActuality> actuality) {
      checkNotIsSet(actualityIsSet(), "actuality");
      this.actuality = actuality.orElse(null);
      optBits |= OPT_BIT_ACTUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Builds a new {@link AdverseEvent AdverseEvent}.
     * @return An immutable instance of AdverseEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.AdverseEvent build() {
      checkRequiredAttributes();
      return new ImmutableAdverseEvent(
          identifier,
          event,
          subjectMedicalHistory,
          contributor,
          suspectEntity,
          implicitRules,
          severity,
          extension,
          language,
          referenceDocument,
          resultingCondition,
          contained,
          subject,
          date,
          outcome,
          recordedDate,
          text,
          seriousness,
          id,
          encounter,
          resourceType,
          study,
          recorder,
          meta,
          location,
          detected,
          modifierExtension,
          actuality,
          category);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean eventIsSet() {
      return (optBits & OPT_BIT_EVENT) != 0;
    }

    private boolean subjectMedicalHistoryIsSet() {
      return (optBits & OPT_BIT_SUBJECT_MEDICAL_HISTORY) != 0;
    }

    private boolean contributorIsSet() {
      return (optBits & OPT_BIT_CONTRIBUTOR) != 0;
    }

    private boolean suspectEntityIsSet() {
      return (optBits & OPT_BIT_SUSPECT_ENTITY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean referenceDocumentIsSet() {
      return (optBits & OPT_BIT_REFERENCE_DOCUMENT) != 0;
    }

    private boolean resultingConditionIsSet() {
      return (optBits & OPT_BIT_RESULTING_CONDITION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean recordedDateIsSet() {
      return (optBits & OPT_BIT_RECORDED_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean seriousnessIsSet() {
      return (optBits & OPT_BIT_SERIOUSNESS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean studyIsSet() {
      return (optBits & OPT_BIT_STUDY) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean detectedIsSet() {
      return (optBits & OPT_BIT_DETECTED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean actualityIsSet() {
      return (optBits & OPT_BIT_ACTUALITY) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of AdverseEvent is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build AdverseEvent, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "AdverseEvent", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link AdverseEvent#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "AdverseEvent", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AdverseEvent#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "AdverseEvent", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link AdverseEvent#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    BuildFinal event(com.fhir.CodeableConcept event);

    /**
     * Initializes the optional value {@link AdverseEvent#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal event(java.util.Optional<? extends com.fhir.CodeableConcept> event);

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectMedicalHistory(java.util.List<com.fhir.Reference> subjectMedicalHistory);

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectMedicalHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subjectMedicalHistory);

    /**
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contributor(java.util.List<com.fhir.Reference> contributor);

    /**
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contributor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contributor);

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal suspectEntity(java.util.List<com.fhir.AdverseEvent_SuspectEntity> suspectEntity);

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal suspectEntity(java.util.Optional<? extends java.util.List<com.fhir.AdverseEvent_SuspectEntity>> suspectEntity);

    /**
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal severity(com.fhir.CodeableConcept severity);

    /**
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal severity(java.util.Optional<? extends com.fhir.CodeableConcept> severity);

    /**
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceDocument(java.util.List<com.fhir.Reference> referenceDocument);

    /**
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceDocument(java.util.Optional<? extends java.util.List<com.fhir.Reference>> referenceDocument);

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resultingCondition(java.util.List<com.fhir.Reference> resultingCondition);

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resultingCondition(java.util.Optional<? extends java.util.List<com.fhir.Reference>> resultingCondition);

    /**
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.CodeableConcept outcome);

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.CodeableConcept> outcome);

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedDate(com.fhir.dateTime recordedDate);

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedDate(java.util.Optional<? extends com.fhir.dateTime> recordedDate);

    /**
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for chained invocation
     */
    BuildFinal seriousness(com.fhir.CodeableConcept seriousness);

    /**
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal seriousness(java.util.Optional<? extends com.fhir.CodeableConcept> seriousness);

    /**
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for chained invocation
     */
    BuildFinal study(java.util.List<com.fhir.Reference> study);

    /**
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal study(java.util.Optional<? extends java.util.List<com.fhir.Reference>> study);

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(com.fhir.Reference recorder);

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(java.util.Optional<? extends com.fhir.Reference> recorder);

    /**
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detected(com.fhir.dateTime detected);

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detected(java.util.Optional<? extends com.fhir.dateTime> detected);

    /**
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actuality(com.fhir.AdverseeventActuality actuality);

    /**
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actuality(java.util.Optional<? extends com.fhir.AdverseeventActuality> actuality);

    /**
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Builds a new {@link AdverseEvent AdverseEvent}.
     * @return An immutable instance of AdverseEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AdverseEvent build();
  }
}
