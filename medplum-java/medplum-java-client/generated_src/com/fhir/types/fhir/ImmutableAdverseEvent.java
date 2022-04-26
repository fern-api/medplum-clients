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
 * Immutable implementation of {@link AdverseEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdverseEvent.builder()}.
 */
@Generated(from = "AdverseEvent", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAdverseEvent implements AdverseEvent {
  private final @Nullable CodeableConcept seriousness;
  private final @Nullable List<Reference> subjectMedicalHistory;
  private final @Nullable AdverseeventActuality actuality;
  private final @Nullable DateTime detected;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Identifier identifier;
  private final @Nullable CodeableConcept event;
  private final @Nullable Reference encounter;
  private final @Nullable CodeableConcept severity;
  private final @Nullable Reference recorder;
  private final @Nullable List<Reference> referenceDocument;
  private final @Nullable CodeableConcept outcome;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final Reference subject;
  private final @Nullable Meta meta;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable DateTime recordedDate;
  private final @Nullable Id id;
  private final String resourceType;
  private final @Nullable Narrative text;
  private final @Nullable DateTime date;
  private final @Nullable List<Reference> study;
  private final @Nullable Reference location;
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> contributor;
  private final @Nullable List<Reference> resultingCondition;
  private final @Nullable List<AdverseEvent_SuspectEntity> suspectEntity;

  private ImmutableAdverseEvent(
      @Nullable CodeableConcept seriousness,
      @Nullable List<Reference> subjectMedicalHistory,
      @Nullable AdverseeventActuality actuality,
      @Nullable DateTime detected,
      @Nullable List<ResourceList> contained,
      @Nullable Identifier identifier,
      @Nullable CodeableConcept event,
      @Nullable Reference encounter,
      @Nullable CodeableConcept severity,
      @Nullable Reference recorder,
      @Nullable List<Reference> referenceDocument,
      @Nullable CodeableConcept outcome,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      Reference subject,
      @Nullable Meta meta,
      @Nullable List<CodeableConcept> category,
      @Nullable DateTime recordedDate,
      @Nullable Id id,
      String resourceType,
      @Nullable Narrative text,
      @Nullable DateTime date,
      @Nullable List<Reference> study,
      @Nullable Reference location,
      @Nullable Code language,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> contributor,
      @Nullable List<Reference> resultingCondition,
      @Nullable List<AdverseEvent_SuspectEntity> suspectEntity) {
    this.seriousness = seriousness;
    this.subjectMedicalHistory = subjectMedicalHistory;
    this.actuality = actuality;
    this.detected = detected;
    this.contained = contained;
    this.identifier = identifier;
    this.event = event;
    this.encounter = encounter;
    this.severity = severity;
    this.recorder = recorder;
    this.referenceDocument = referenceDocument;
    this.outcome = outcome;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.subject = subject;
    this.meta = meta;
    this.category = category;
    this.recordedDate = recordedDate;
    this.id = id;
    this.resourceType = resourceType;
    this.text = text;
    this.date = date;
    this.study = study;
    this.location = location;
    this.language = language;
    this.extension = extension;
    this.contributor = contributor;
    this.resultingCondition = resultingCondition;
    this.suspectEntity = suspectEntity;
  }

  /**
   * @return The value of the {@code seriousness} attribute
   */
  @JsonProperty("seriousness")
  @Override
  public Optional<CodeableConcept> seriousness() {
    return Optional.ofNullable(seriousness);
  }

  /**
   * @return The value of the {@code subjectMedicalHistory} attribute
   */
  @JsonProperty("subjectMedicalHistory")
  @Override
  public Optional<List<Reference>> subjectMedicalHistory() {
    return Optional.ofNullable(subjectMedicalHistory);
  }

  /**
   * @return The value of the {@code actuality} attribute
   */
  @JsonProperty("actuality")
  @Override
  public Optional<AdverseeventActuality> actuality() {
    return Optional.ofNullable(actuality);
  }

  /**
   * @return The value of the {@code detected} attribute
   */
  @JsonProperty("detected")
  @Override
  public Optional<DateTime> detected() {
    return Optional.ofNullable(detected);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code event} attribute
   */
  @JsonProperty("event")
  @Override
  public Optional<CodeableConcept> event() {
    return Optional.ofNullable(event);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Optional<CodeableConcept> severity() {
    return Optional.ofNullable(severity);
  }

  /**
   * @return The value of the {@code recorder} attribute
   */
  @JsonProperty("recorder")
  @Override
  public Optional<Reference> recorder() {
    return Optional.ofNullable(recorder);
  }

  /**
   * @return The value of the {@code referenceDocument} attribute
   */
  @JsonProperty("referenceDocument")
  @Override
  public Optional<List<Reference>> referenceDocument() {
    return Optional.ofNullable(referenceDocument);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<CodeableConcept> outcome() {
    return Optional.ofNullable(outcome);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code recordedDate} attribute
   */
  @JsonProperty("recordedDate")
  @Override
  public Optional<DateTime> recordedDate() {
    return Optional.ofNullable(recordedDate);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code study} attribute
   */
  @JsonProperty("study")
  @Override
  public Optional<List<Reference>> study() {
    return Optional.ofNullable(study);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code contributor} attribute
   */
  @JsonProperty("contributor")
  @Override
  public Optional<List<Reference>> contributor() {
    return Optional.ofNullable(contributor);
  }

  /**
   * @return The value of the {@code resultingCondition} attribute
   */
  @JsonProperty("resultingCondition")
  @Override
  public Optional<List<Reference>> resultingCondition() {
    return Optional.ofNullable(resultingCondition);
  }

  /**
   * @return The value of the {@code suspectEntity} attribute
   */
  @JsonProperty("suspectEntity")
  @Override
  public Optional<List<AdverseEvent_SuspectEntity>> suspectEntity() {
    return Optional.ofNullable(suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#seriousness() seriousness} attribute.
   * @param value The value for seriousness
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSeriousness(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "seriousness");
    if (this.seriousness == newValue) return this;
    return new ImmutableAdverseEvent(
        newValue,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#seriousness() seriousness} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriousness
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSeriousness(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.seriousness == value) return this;
    return new ImmutableAdverseEvent(
        value,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} attribute.
   * @param value The value for subjectMedicalHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSubjectMedicalHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subjectMedicalHistory");
    if (this.subjectMedicalHistory == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        newValue,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectMedicalHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSubjectMedicalHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subjectMedicalHistory == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        value,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#actuality() actuality} attribute.
   * @param value The value for actuality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withActuality(AdverseeventActuality value) {
    @Nullable AdverseeventActuality newValue = Objects.requireNonNull(value, "actuality");
    if (this.actuality == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        newValue,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#actuality() actuality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actuality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withActuality(Optional<? extends AdverseeventActuality> optional) {
    @Nullable AdverseeventActuality value = optional.orElse(null);
    if (this.actuality == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        value,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#detected() detected} attribute.
   * @param value The value for detected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withDetected(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "detected");
    if (this.detected == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        newValue,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#detected() detected} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detected
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withDetected(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.detected == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        value,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        newValue,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        value,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        newValue,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        value,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#event() event} attribute.
   * @param value The value for event
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withEvent(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "event");
    if (this.event == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        newValue,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#event() event} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for event
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withEvent(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.event == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        value,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        newValue,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        value,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSeverity(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        newValue,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSeverity(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        value,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withRecorder(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        newValue,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withRecorder(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        value,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#referenceDocument() referenceDocument} attribute.
   * @param value The value for referenceDocument
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withReferenceDocument(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "referenceDocument");
    if (this.referenceDocument == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        newValue,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#referenceDocument() referenceDocument} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceDocument
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withReferenceDocument(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.referenceDocument == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        value,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withOutcome(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withOutcome(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        newValue,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        value,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        newValue,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        value,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdverseEvent#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdverseEvent withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        newValue,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        value,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        newValue,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        value,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#recordedDate() recordedDate} attribute.
   * @param value The value for recordedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withRecordedDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "recordedDate");
    if (this.recordedDate == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        newValue,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#recordedDate() recordedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withRecordedDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.recordedDate == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        value,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        newValue,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        value,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AdverseEvent#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAdverseEvent withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        newValue,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        newValue,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        value,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        newValue,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        value,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#study() study} attribute.
   * @param value The value for study
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withStudy(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "study");
    if (this.study == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        newValue,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#study() study} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for study
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withStudy(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.study == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        value,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        newValue,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        value,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        newValue,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        value,
        this.extension,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        newValue,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        value,
        this.contributor,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#contributor() contributor} attribute.
   * @param value The value for contributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withContributor(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "contributor");
    if (this.contributor == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        newValue,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#contributor() contributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withContributor(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.contributor == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        value,
        this.resultingCondition,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#resultingCondition() resultingCondition} attribute.
   * @param value The value for resultingCondition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withResultingCondition(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "resultingCondition");
    if (this.resultingCondition == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        newValue,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#resultingCondition() resultingCondition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resultingCondition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withResultingCondition(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.resultingCondition == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        value,
        this.suspectEntity);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent#suspectEntity() suspectEntity} attribute.
   * @param value The value for suspectEntity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent withSuspectEntity(List<AdverseEvent_SuspectEntity> value) {
    @Nullable List<AdverseEvent_SuspectEntity> newValue = Objects.requireNonNull(value, "suspectEntity");
    if (this.suspectEntity == newValue) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent#suspectEntity() suspectEntity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for suspectEntity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent withSuspectEntity(Optional<? extends List<AdverseEvent_SuspectEntity>> optional) {
    @Nullable List<AdverseEvent_SuspectEntity> value = optional.orElse(null);
    if (this.suspectEntity == value) return this;
    return new ImmutableAdverseEvent(
        this.seriousness,
        this.subjectMedicalHistory,
        this.actuality,
        this.detected,
        this.contained,
        this.identifier,
        this.event,
        this.encounter,
        this.severity,
        this.recorder,
        this.referenceDocument,
        this.outcome,
        this.implicitRules,
        this.modifierExtension,
        this.subject,
        this.meta,
        this.category,
        this.recordedDate,
        this.id,
        this.resourceType,
        this.text,
        this.date,
        this.study,
        this.location,
        this.language,
        this.extension,
        this.contributor,
        this.resultingCondition,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdverseEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdverseEvent
        && equalTo((ImmutableAdverseEvent) another);
  }

  private boolean equalTo(ImmutableAdverseEvent another) {
    return Objects.equals(seriousness, another.seriousness)
        && Objects.equals(subjectMedicalHistory, another.subjectMedicalHistory)
        && Objects.equals(actuality, another.actuality)
        && Objects.equals(detected, another.detected)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(event, another.event)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(severity, another.severity)
        && Objects.equals(recorder, another.recorder)
        && Objects.equals(referenceDocument, another.referenceDocument)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && subject.equals(another.subject)
        && Objects.equals(meta, another.meta)
        && Objects.equals(category, another.category)
        && Objects.equals(recordedDate, another.recordedDate)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && Objects.equals(text, another.text)
        && Objects.equals(date, another.date)
        && Objects.equals(study, another.study)
        && Objects.equals(location, another.location)
        && Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contributor, another.contributor)
        && Objects.equals(resultingCondition, another.resultingCondition)
        && Objects.equals(suspectEntity, another.suspectEntity);
  }

  /**
   * Computes a hash code from attributes: {@code seriousness}, {@code subjectMedicalHistory}, {@code actuality}, {@code detected}, {@code contained}, {@code identifier}, {@code event}, {@code encounter}, {@code severity}, {@code recorder}, {@code referenceDocument}, {@code outcome}, {@code implicitRules}, {@code modifierExtension}, {@code subject}, {@code meta}, {@code category}, {@code recordedDate}, {@code id}, {@code resourceType}, {@code text}, {@code date}, {@code study}, {@code location}, {@code language}, {@code extension}, {@code contributor}, {@code resultingCondition}, {@code suspectEntity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(seriousness);
    h += (h << 5) + Objects.hashCode(subjectMedicalHistory);
    h += (h << 5) + Objects.hashCode(actuality);
    h += (h << 5) + Objects.hashCode(detected);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(event);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(severity);
    h += (h << 5) + Objects.hashCode(recorder);
    h += (h << 5) + Objects.hashCode(referenceDocument);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(recordedDate);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(study);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contributor);
    h += (h << 5) + Objects.hashCode(resultingCondition);
    h += (h << 5) + Objects.hashCode(suspectEntity);
    return h;
  }

  /**
   * Prints the immutable value {@code AdverseEvent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AdverseEvent{");
    if (seriousness != null) {
      builder.append("seriousness=").append(seriousness);
    }
    if (subjectMedicalHistory != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("subjectMedicalHistory=").append(subjectMedicalHistory);
    }
    if (actuality != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("actuality=").append(actuality);
    }
    if (detected != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("detected=").append(detected);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (event != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("event=").append(event);
    }
    if (encounter != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (severity != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (recorder != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (referenceDocument != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("referenceDocument=").append(referenceDocument);
    }
    if (outcome != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("subject=").append(subject);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (recordedDate != null) {
      builder.append(", ");
      builder.append("recordedDate=").append(recordedDate);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (study != null) {
      builder.append(", ");
      builder.append("study=").append(study);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contributor != null) {
      builder.append(", ");
      builder.append("contributor=").append(contributor);
    }
    if (resultingCondition != null) {
      builder.append(", ");
      builder.append("resultingCondition=").append(resultingCondition);
    }
    if (suspectEntity != null) {
      builder.append(", ");
      builder.append("suspectEntity=").append(suspectEntity);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AdverseEvent", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdverseEvent {
    @Nullable Optional<CodeableConcept> seriousness = Optional.empty();
    boolean seriousnessIsSet;
    @Nullable Optional<List<Reference>> subjectMedicalHistory = Optional.empty();
    boolean subjectMedicalHistoryIsSet;
    @Nullable Optional<AdverseeventActuality> actuality = Optional.empty();
    boolean actualityIsSet;
    @Nullable Optional<DateTime> detected = Optional.empty();
    boolean detectedIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<CodeableConcept> event = Optional.empty();
    boolean eventIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<CodeableConcept> severity = Optional.empty();
    boolean severityIsSet;
    @Nullable Optional<Reference> recorder = Optional.empty();
    boolean recorderIsSet;
    @Nullable Optional<List<Reference>> referenceDocument = Optional.empty();
    boolean referenceDocumentIsSet;
    @Nullable Optional<CodeableConcept> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<DateTime> recordedDate = Optional.empty();
    boolean recordedDateIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<Reference>> study = Optional.empty();
    boolean studyIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> contributor = Optional.empty();
    boolean contributorIsSet;
    @Nullable Optional<List<Reference>> resultingCondition = Optional.empty();
    boolean resultingConditionIsSet;
    @Nullable Optional<List<AdverseEvent_SuspectEntity>> suspectEntity = Optional.empty();
    boolean suspectEntityIsSet;
    @JsonProperty("seriousness")
    public void setSeriousness(Optional<CodeableConcept> seriousness) {
      this.seriousness = seriousness;
      this.seriousnessIsSet = true;
    }
    @JsonProperty("subjectMedicalHistory")
    public void setSubjectMedicalHistory(Optional<List<Reference>> subjectMedicalHistory) {
      this.subjectMedicalHistory = subjectMedicalHistory;
      this.subjectMedicalHistoryIsSet = true;
    }
    @JsonProperty("actuality")
    public void setActuality(Optional<AdverseeventActuality> actuality) {
      this.actuality = actuality;
      this.actualityIsSet = true;
    }
    @JsonProperty("detected")
    public void setDetected(Optional<DateTime> detected) {
      this.detected = detected;
      this.detectedIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("event")
    public void setEvent(Optional<CodeableConcept> event) {
      this.event = event;
      this.eventIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("severity")
    public void setSeverity(Optional<CodeableConcept> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @JsonProperty("recorder")
    public void setRecorder(Optional<Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @JsonProperty("referenceDocument")
    public void setReferenceDocument(Optional<List<Reference>> referenceDocument) {
      this.referenceDocument = referenceDocument;
      this.referenceDocumentIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<CodeableConcept> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("recordedDate")
    public void setRecordedDate(Optional<DateTime> recordedDate) {
      this.recordedDate = recordedDate;
      this.recordedDateIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("study")
    public void setStudy(Optional<List<Reference>> study) {
      this.study = study;
      this.studyIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contributor")
    public void setContributor(Optional<List<Reference>> contributor) {
      this.contributor = contributor;
      this.contributorIsSet = true;
    }
    @JsonProperty("resultingCondition")
    public void setResultingCondition(Optional<List<Reference>> resultingCondition) {
      this.resultingCondition = resultingCondition;
      this.resultingConditionIsSet = true;
    }
    @JsonProperty("suspectEntity")
    public void setSuspectEntity(Optional<List<AdverseEvent_SuspectEntity>> suspectEntity) {
      this.suspectEntity = suspectEntity;
      this.suspectEntityIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> seriousness() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> subjectMedicalHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AdverseeventActuality> actuality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> detected() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> event() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> severity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> referenceDocument() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> recordedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> study() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> contributor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> resultingCondition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<AdverseEvent_SuspectEntity>> suspectEntity() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAdverseEvent fromJson(Json json) {
    ImmutableAdverseEvent.Builder builder = ((ImmutableAdverseEvent.Builder) ImmutableAdverseEvent.builder());
    if (json.seriousnessIsSet) {
      builder.seriousness(json.seriousness);
    }
    if (json.subjectMedicalHistoryIsSet) {
      builder.subjectMedicalHistory(json.subjectMedicalHistory);
    }
    if (json.actualityIsSet) {
      builder.actuality(json.actuality);
    }
    if (json.detectedIsSet) {
      builder.detected(json.detected);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.eventIsSet) {
      builder.event(json.event);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.referenceDocumentIsSet) {
      builder.referenceDocument(json.referenceDocument);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.recordedDateIsSet) {
      builder.recordedDate(json.recordedDate);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.studyIsSet) {
      builder.study(json.study);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.contributorIsSet) {
      builder.contributor(json.contributor);
    }
    if (json.resultingConditionIsSet) {
      builder.resultingCondition(json.resultingCondition);
    }
    if (json.suspectEntityIsSet) {
      builder.suspectEntity(json.suspectEntity);
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
        .seriousness(instance.seriousness())
        .subjectMedicalHistory(instance.subjectMedicalHistory())
        .actuality(instance.actuality())
        .detected(instance.detected())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .event(instance.event())
        .encounter(instance.encounter())
        .severity(instance.severity())
        .recorder(instance.recorder())
        .referenceDocument(instance.referenceDocument())
        .outcome(instance.outcome())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .subject(instance.subject())
        .meta(instance.meta())
        .category(instance.category())
        .recordedDate(instance.recordedDate())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .date(instance.date())
        .study(instance.study())
        .location(instance.location())
        .language(instance.language())
        .extension(instance.extension())
        .contributor(instance.contributor())
        .resultingCondition(instance.resultingCondition())
        .suspectEntity(instance.suspectEntity())
        .build();
  }

  /**
   * Creates a builder for {@link AdverseEvent AdverseEvent}.
   * <pre>
   * ImmutableAdverseEvent.builder()
   *    .seriousness(com.fhir.types.fhir.CodeableConcept) // optional {@link AdverseEvent#seriousness() seriousness}
   *    .subjectMedicalHistory(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory}
   *    .actuality(com.fhir.types.fhir.AdverseeventActuality) // optional {@link AdverseEvent#actuality() actuality}
   *    .detected(com.fhir.types.fhir.DateTime) // optional {@link AdverseEvent#detected() detected}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link AdverseEvent#contained() contained}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link AdverseEvent#identifier() identifier}
   *    .event(com.fhir.types.fhir.CodeableConcept) // optional {@link AdverseEvent#event() event}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link AdverseEvent#encounter() encounter}
   *    .severity(com.fhir.types.fhir.CodeableConcept) // optional {@link AdverseEvent#severity() severity}
   *    .recorder(com.fhir.types.fhir.Reference) // optional {@link AdverseEvent#recorder() recorder}
   *    .referenceDocument(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#referenceDocument() referenceDocument}
   *    .outcome(com.fhir.types.fhir.CodeableConcept) // optional {@link AdverseEvent#outcome() outcome}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link AdverseEvent#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AdverseEvent#modifierExtension() modifierExtension}
   *    .subject(com.fhir.types.fhir.Reference) // required {@link AdverseEvent#subject() subject}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link AdverseEvent#meta() meta}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link AdverseEvent#category() category}
   *    .recordedDate(com.fhir.types.fhir.DateTime) // optional {@link AdverseEvent#recordedDate() recordedDate}
   *    .id(com.fhir.types.fhir.Id) // optional {@link AdverseEvent#id() id}
   *    .resourceType(String) // required {@link AdverseEvent#resourceType() resourceType}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link AdverseEvent#text() text}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link AdverseEvent#date() date}
   *    .study(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#study() study}
   *    .location(com.fhir.types.fhir.Reference) // optional {@link AdverseEvent#location() location}
   *    .language(com.fhir.types.fhir.Code) // optional {@link AdverseEvent#language() language}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AdverseEvent#extension() extension}
   *    .contributor(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#contributor() contributor}
   *    .resultingCondition(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link AdverseEvent#resultingCondition() resultingCondition}
   *    .suspectEntity(List&amp;lt;com.fhir.types.fhir.AdverseEvent_SuspectEntity&amp;gt;) // optional {@link AdverseEvent#suspectEntity() suspectEntity}
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
  @Generated(from = "AdverseEvent", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_SERIOUSNESS = 0x1L;
    private static final long OPT_BIT_SUBJECT_MEDICAL_HISTORY = 0x2L;
    private static final long OPT_BIT_ACTUALITY = 0x4L;
    private static final long OPT_BIT_DETECTED = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_EVENT = 0x40L;
    private static final long OPT_BIT_ENCOUNTER = 0x80L;
    private static final long OPT_BIT_SEVERITY = 0x100L;
    private static final long OPT_BIT_RECORDER = 0x200L;
    private static final long OPT_BIT_REFERENCE_DOCUMENT = 0x400L;
    private static final long OPT_BIT_OUTCOME = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_CATEGORY = 0x8000L;
    private static final long OPT_BIT_RECORDED_DATE = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_DATE = 0x80000L;
    private static final long OPT_BIT_STUDY = 0x100000L;
    private static final long OPT_BIT_LOCATION = 0x200000L;
    private static final long OPT_BIT_LANGUAGE = 0x400000L;
    private static final long OPT_BIT_EXTENSION = 0x800000L;
    private static final long OPT_BIT_CONTRIBUTOR = 0x1000000L;
    private static final long OPT_BIT_RESULTING_CONDITION = 0x2000000L;
    private static final long OPT_BIT_SUSPECT_ENTITY = 0x4000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable CodeableConcept seriousness;
    private @Nullable List<Reference> subjectMedicalHistory;
    private @Nullable AdverseeventActuality actuality;
    private @Nullable DateTime detected;
    private @Nullable List<ResourceList> contained;
    private @Nullable Identifier identifier;
    private @Nullable CodeableConcept event;
    private @Nullable Reference encounter;
    private @Nullable CodeableConcept severity;
    private @Nullable Reference recorder;
    private @Nullable List<Reference> referenceDocument;
    private @Nullable CodeableConcept outcome;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference subject;
    private @Nullable Meta meta;
    private @Nullable List<CodeableConcept> category;
    private @Nullable DateTime recordedDate;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable Narrative text;
    private @Nullable DateTime date;
    private @Nullable List<Reference> study;
    private @Nullable Reference location;
    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> contributor;
    private @Nullable List<Reference> resultingCondition;
    private @Nullable List<AdverseEvent_SuspectEntity> suspectEntity;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriousness(CodeableConcept seriousness) {
      checkNotIsSet(seriousnessIsSet(), "seriousness");
      this.seriousness = Objects.requireNonNull(seriousness, "seriousness");
      optBits |= OPT_BIT_SERIOUSNESS;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("seriousness")
    public final Builder seriousness(Optional<? extends CodeableConcept> seriousness) {
      checkNotIsSet(seriousnessIsSet(), "seriousness");
      this.seriousness = seriousness.orElse(null);
      optBits |= OPT_BIT_SERIOUSNESS;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectMedicalHistory(List<Reference> subjectMedicalHistory) {
      checkNotIsSet(subjectMedicalHistoryIsSet(), "subjectMedicalHistory");
      this.subjectMedicalHistory = Objects.requireNonNull(subjectMedicalHistory, "subjectMedicalHistory");
      optBits |= OPT_BIT_SUBJECT_MEDICAL_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectMedicalHistory")
    public final Builder subjectMedicalHistory(Optional<? extends List<Reference>> subjectMedicalHistory) {
      checkNotIsSet(subjectMedicalHistoryIsSet(), "subjectMedicalHistory");
      this.subjectMedicalHistory = subjectMedicalHistory.orElse(null);
      optBits |= OPT_BIT_SUBJECT_MEDICAL_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for chained invocation
     */
    public final Builder actuality(AdverseeventActuality actuality) {
      checkNotIsSet(actualityIsSet(), "actuality");
      this.actuality = Objects.requireNonNull(actuality, "actuality");
      optBits |= OPT_BIT_ACTUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actuality")
    public final Builder actuality(Optional<? extends AdverseeventActuality> actuality) {
      checkNotIsSet(actualityIsSet(), "actuality");
      this.actuality = actuality.orElse(null);
      optBits |= OPT_BIT_ACTUALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for chained invocation
     */
    public final Builder detected(DateTime detected) {
      checkNotIsSet(detectedIsSet(), "detected");
      this.detected = Objects.requireNonNull(detected, "detected");
      optBits |= OPT_BIT_DETECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detected")
    public final Builder detected(Optional<? extends DateTime> detected) {
      checkNotIsSet(detectedIsSet(), "detected");
      this.detected = detected.orElse(null);
      optBits |= OPT_BIT_DETECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
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
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
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
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
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
    public final Builder event(CodeableConcept event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = Objects.requireNonNull(event, "event");
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("event")
    public final Builder event(Optional<? extends CodeableConcept> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = event.orElse(null);
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(CodeableConcept severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Optional<? extends CodeableConcept> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorder(Reference recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = Objects.requireNonNull(recorder, "recorder");
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recorder")
    public final Builder recorder(Optional<? extends Reference> recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = recorder.orElse(null);
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceDocument(List<Reference> referenceDocument) {
      checkNotIsSet(referenceDocumentIsSet(), "referenceDocument");
      this.referenceDocument = Objects.requireNonNull(referenceDocument, "referenceDocument");
      optBits |= OPT_BIT_REFERENCE_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceDocument")
    public final Builder referenceDocument(Optional<? extends List<Reference>> referenceDocument) {
      checkNotIsSet(referenceDocumentIsSet(), "referenceDocument");
      this.referenceDocument = referenceDocument.orElse(null);
      optBits |= OPT_BIT_REFERENCE_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(CodeableConcept outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends CodeableConcept> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link AdverseEvent#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
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
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
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
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder recordedDate(DateTime recordedDate) {
      checkNotIsSet(recordedDateIsSet(), "recordedDate");
      this.recordedDate = Objects.requireNonNull(recordedDate, "recordedDate");
      optBits |= OPT_BIT_RECORDED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recordedDate")
    public final Builder recordedDate(Optional<? extends DateTime> recordedDate) {
      checkNotIsSet(recordedDateIsSet(), "recordedDate");
      this.recordedDate = recordedDate.orElse(null);
      optBits |= OPT_BIT_RECORDED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
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
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
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
     * Initializes the value for the {@link AdverseEvent#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
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
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
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
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for chained invocation
     */
    public final Builder study(List<Reference> study) {
      checkNotIsSet(studyIsSet(), "study");
      this.study = Objects.requireNonNull(study, "study");
      optBits |= OPT_BIT_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("study")
    public final Builder study(Optional<? extends List<Reference>> study) {
      checkNotIsSet(studyIsSet(), "study");
      this.study = study.orElse(null);
      optBits |= OPT_BIT_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
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
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
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
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
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
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder contributor(List<Reference> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = Objects.requireNonNull(contributor, "contributor");
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contributor")
    public final Builder contributor(Optional<? extends List<Reference>> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = contributor.orElse(null);
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for chained invocation
     */
    public final Builder resultingCondition(List<Reference> resultingCondition) {
      checkNotIsSet(resultingConditionIsSet(), "resultingCondition");
      this.resultingCondition = Objects.requireNonNull(resultingCondition, "resultingCondition");
      optBits |= OPT_BIT_RESULTING_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resultingCondition")
    public final Builder resultingCondition(Optional<? extends List<Reference>> resultingCondition) {
      checkNotIsSet(resultingConditionIsSet(), "resultingCondition");
      this.resultingCondition = resultingCondition.orElse(null);
      optBits |= OPT_BIT_RESULTING_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for chained invocation
     */
    public final Builder suspectEntity(List<AdverseEvent_SuspectEntity> suspectEntity) {
      checkNotIsSet(suspectEntityIsSet(), "suspectEntity");
      this.suspectEntity = Objects.requireNonNull(suspectEntity, "suspectEntity");
      optBits |= OPT_BIT_SUSPECT_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("suspectEntity")
    public final Builder suspectEntity(Optional<? extends List<AdverseEvent_SuspectEntity>> suspectEntity) {
      checkNotIsSet(suspectEntityIsSet(), "suspectEntity");
      this.suspectEntity = suspectEntity.orElse(null);
      optBits |= OPT_BIT_SUSPECT_ENTITY;
      return this;
    }

    /**
     * Builds a new {@link AdverseEvent AdverseEvent}.
     * @return An immutable instance of AdverseEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AdverseEvent build() {
      checkRequiredAttributes();
      return new ImmutableAdverseEvent(
          seriousness,
          subjectMedicalHistory,
          actuality,
          detected,
          contained,
          identifier,
          event,
          encounter,
          severity,
          recorder,
          referenceDocument,
          outcome,
          implicitRules,
          modifierExtension,
          subject,
          meta,
          category,
          recordedDate,
          id,
          resourceType,
          text,
          date,
          study,
          location,
          language,
          extension,
          contributor,
          resultingCondition,
          suspectEntity);
    }

    private boolean seriousnessIsSet() {
      return (optBits & OPT_BIT_SERIOUSNESS) != 0;
    }

    private boolean subjectMedicalHistoryIsSet() {
      return (optBits & OPT_BIT_SUBJECT_MEDICAL_HISTORY) != 0;
    }

    private boolean actualityIsSet() {
      return (optBits & OPT_BIT_ACTUALITY) != 0;
    }

    private boolean detectedIsSet() {
      return (optBits & OPT_BIT_DETECTED) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean eventIsSet() {
      return (optBits & OPT_BIT_EVENT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean referenceDocumentIsSet() {
      return (optBits & OPT_BIT_REFERENCE_DOCUMENT) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean recordedDateIsSet() {
      return (optBits & OPT_BIT_RECORDED_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean studyIsSet() {
      return (optBits & OPT_BIT_STUDY) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean contributorIsSet() {
      return (optBits & OPT_BIT_CONTRIBUTOR) != 0;
    }

    private boolean resultingConditionIsSet() {
      return (optBits & OPT_BIT_RESULTING_CONDITION) != 0;
    }

    private boolean suspectEntityIsSet() {
      return (optBits & OPT_BIT_SUSPECT_ENTITY) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AdverseEvent is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build AdverseEvent, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "AdverseEvent", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link AdverseEvent#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "AdverseEvent", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AdverseEvent#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "AdverseEvent", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for chained invocation
     */
    BuildFinal seriousness(CodeableConcept seriousness);

    /**
     * Initializes the optional value {@link AdverseEvent#seriousness() seriousness} to seriousness.
     * @param seriousness The value for seriousness
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal seriousness(Optional<? extends CodeableConcept> seriousness);

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectMedicalHistory(List<Reference> subjectMedicalHistory);

    /**
     * Initializes the optional value {@link AdverseEvent#subjectMedicalHistory() subjectMedicalHistory} to subjectMedicalHistory.
     * @param subjectMedicalHistory The value for subjectMedicalHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectMedicalHistory(Optional<? extends List<Reference>> subjectMedicalHistory);

    /**
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actuality(AdverseeventActuality actuality);

    /**
     * Initializes the optional value {@link AdverseEvent#actuality() actuality} to actuality.
     * @param actuality The value for actuality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actuality(Optional<? extends AdverseeventActuality> actuality);

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detected(DateTime detected);

    /**
     * Initializes the optional value {@link AdverseEvent#detected() detected} to detected.
     * @param detected The value for detected
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detected(Optional<? extends DateTime> detected);

    /**
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link AdverseEvent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link AdverseEvent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link AdverseEvent#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    BuildFinal event(CodeableConcept event);

    /**
     * Initializes the optional value {@link AdverseEvent#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal event(Optional<? extends CodeableConcept> event);

    /**
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link AdverseEvent#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal severity(CodeableConcept severity);

    /**
     * Initializes the optional value {@link AdverseEvent#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal severity(Optional<? extends CodeableConcept> severity);

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(Reference recorder);

    /**
     * Initializes the optional value {@link AdverseEvent#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(Optional<? extends Reference> recorder);

    /**
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceDocument(List<Reference> referenceDocument);

    /**
     * Initializes the optional value {@link AdverseEvent#referenceDocument() referenceDocument} to referenceDocument.
     * @param referenceDocument The value for referenceDocument
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceDocument(Optional<? extends List<Reference>> referenceDocument);

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(CodeableConcept outcome);

    /**
     * Initializes the optional value {@link AdverseEvent#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends CodeableConcept> outcome);

    /**
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link AdverseEvent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AdverseEvent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link AdverseEvent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link AdverseEvent#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedDate(DateTime recordedDate);

    /**
     * Initializes the optional value {@link AdverseEvent#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedDate(Optional<? extends DateTime> recordedDate);

    /**
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link AdverseEvent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link AdverseEvent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link AdverseEvent#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for chained invocation
     */
    BuildFinal study(List<Reference> study);

    /**
     * Initializes the optional value {@link AdverseEvent#study() study} to study.
     * @param study The value for study
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal study(Optional<? extends List<Reference>> study);

    /**
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link AdverseEvent#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link AdverseEvent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link AdverseEvent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contributor(List<Reference> contributor);

    /**
     * Initializes the optional value {@link AdverseEvent#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contributor(Optional<? extends List<Reference>> contributor);

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resultingCondition(List<Reference> resultingCondition);

    /**
     * Initializes the optional value {@link AdverseEvent#resultingCondition() resultingCondition} to resultingCondition.
     * @param resultingCondition The value for resultingCondition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resultingCondition(Optional<? extends List<Reference>> resultingCondition);

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal suspectEntity(List<AdverseEvent_SuspectEntity> suspectEntity);

    /**
     * Initializes the optional value {@link AdverseEvent#suspectEntity() suspectEntity} to suspectEntity.
     * @param suspectEntity The value for suspectEntity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal suspectEntity(Optional<? extends List<AdverseEvent_SuspectEntity>> suspectEntity);

    /**
     * Builds a new {@link AdverseEvent AdverseEvent}.
     * @return An immutable instance of AdverseEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AdverseEvent build();
  }
}
