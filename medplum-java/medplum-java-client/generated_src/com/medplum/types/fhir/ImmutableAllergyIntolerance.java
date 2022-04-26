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
 * Immutable implementation of {@link AllergyIntolerance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAllergyIntolerance.builder()}.
 */
@Generated(from = "AllergyIntolerance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAllergyIntolerance implements AllergyIntolerance {
  private final @Nullable Meta meta;
  private final @Nullable DateTime lastOccurrence;
  private final @Nullable CodeableConcept verificationStatus;
  private final @Nullable Range onsetRange;
  private final @Nullable Reference asserter;
  private final @Nullable String onsetDateTime;
  private final @Nullable List<AllergyIntolerance_Reaction> reaction;
  private final @Nullable CodeableConcept code;
  private final @Nullable Age onsetAge;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable CodeableConcept clinicalStatus;
  private final @Nullable Reference recorder;
  private final @Nullable List<Identifier> identifier;
  private final Reference patient;
  private final @Nullable DateTime recordedDate;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<AllergyintoleranceCategoryItem> category;
  private final @Nullable AllergyintoleranceCriticality criticality;
  private final @Nullable Reference encounter;
  private final @Nullable AllergyintoleranceType type;
  private final @Nullable Period onsetPeriod;
  private final @Nullable String onsetString;

  private ImmutableAllergyIntolerance(
      @Nullable Meta meta,
      @Nullable DateTime lastOccurrence,
      @Nullable CodeableConcept verificationStatus,
      @Nullable Range onsetRange,
      @Nullable Reference asserter,
      @Nullable String onsetDateTime,
      @Nullable List<AllergyIntolerance_Reaction> reaction,
      @Nullable CodeableConcept code,
      @Nullable Age onsetAge,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable CodeableConcept clinicalStatus,
      @Nullable Reference recorder,
      @Nullable List<Identifier> identifier,
      Reference patient,
      @Nullable DateTime recordedDate,
      String resourceType,
      @Nullable Code language,
      @Nullable List<Extension> extension,
      @Nullable List<Annotation> note,
      @Nullable List<AllergyintoleranceCategoryItem> category,
      @Nullable AllergyintoleranceCriticality criticality,
      @Nullable Reference encounter,
      @Nullable AllergyintoleranceType type,
      @Nullable Period onsetPeriod,
      @Nullable String onsetString) {
    this.meta = meta;
    this.lastOccurrence = lastOccurrence;
    this.verificationStatus = verificationStatus;
    this.onsetRange = onsetRange;
    this.asserter = asserter;
    this.onsetDateTime = onsetDateTime;
    this.reaction = reaction;
    this.code = code;
    this.onsetAge = onsetAge;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.text = text;
    this.clinicalStatus = clinicalStatus;
    this.recorder = recorder;
    this.identifier = identifier;
    this.patient = patient;
    this.recordedDate = recordedDate;
    this.resourceType = resourceType;
    this.language = language;
    this.extension = extension;
    this.note = note;
    this.category = category;
    this.criticality = criticality;
    this.encounter = encounter;
    this.type = type;
    this.onsetPeriod = onsetPeriod;
    this.onsetString = onsetString;
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
   * @return The value of the {@code lastOccurrence} attribute
   */
  @JsonProperty("lastOccurrence")
  @Override
  public Optional<DateTime> lastOccurrence() {
    return Optional.ofNullable(lastOccurrence);
  }

  /**
   * @return The value of the {@code verificationStatus} attribute
   */
  @JsonProperty("verificationStatus")
  @Override
  public Optional<CodeableConcept> verificationStatus() {
    return Optional.ofNullable(verificationStatus);
  }

  /**
   * @return The value of the {@code onsetRange} attribute
   */
  @JsonProperty("onsetRange")
  @Override
  public Optional<Range> onsetRange() {
    return Optional.ofNullable(onsetRange);
  }

  /**
   * @return The value of the {@code asserter} attribute
   */
  @JsonProperty("asserter")
  @Override
  public Optional<Reference> asserter() {
    return Optional.ofNullable(asserter);
  }

  /**
   * @return The value of the {@code onsetDateTime} attribute
   */
  @JsonProperty("onsetDateTime")
  @Override
  public Optional<String> onsetDateTime() {
    return Optional.ofNullable(onsetDateTime);
  }

  /**
   * @return The value of the {@code reaction} attribute
   */
  @JsonProperty("reaction")
  @Override
  public Optional<List<AllergyIntolerance_Reaction>> reaction() {
    return Optional.ofNullable(reaction);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code onsetAge} attribute
   */
  @JsonProperty("onsetAge")
  @Override
  public Optional<Age> onsetAge() {
    return Optional.ofNullable(onsetAge);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code clinicalStatus} attribute
   */
  @JsonProperty("clinicalStatus")
  @Override
  public Optional<CodeableConcept> clinicalStatus() {
    return Optional.ofNullable(clinicalStatus);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<AllergyintoleranceCategoryItem>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code criticality} attribute
   */
  @JsonProperty("criticality")
  @Override
  public Optional<AllergyintoleranceCriticality> criticality() {
    return Optional.ofNullable(criticality);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<AllergyintoleranceType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code onsetPeriod} attribute
   */
  @JsonProperty("onsetPeriod")
  @Override
  public Optional<Period> onsetPeriod() {
    return Optional.ofNullable(onsetPeriod);
  }

  /**
   * @return The value of the {@code onsetString} attribute
   */
  @JsonProperty("onsetString")
  @Override
  public Optional<String> onsetString() {
    return Optional.ofNullable(onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAllergyIntolerance(
        newValue,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAllergyIntolerance(
        value,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#lastOccurrence() lastOccurrence} attribute.
   * @param value The value for lastOccurrence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withLastOccurrence(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "lastOccurrence");
    if (this.lastOccurrence == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        newValue,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#lastOccurrence() lastOccurrence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastOccurrence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withLastOccurrence(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.lastOccurrence == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        value,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#verificationStatus() verificationStatus} attribute.
   * @param value The value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withVerificationStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "verificationStatus");
    if (this.verificationStatus == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        newValue,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#verificationStatus() verificationStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withVerificationStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.verificationStatus == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        value,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetRange() onsetRange} attribute.
   * @param value The value for onsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "onsetRange");
    if (this.onsetRange == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        newValue,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetRange() onsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withOnsetRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.onsetRange == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        value,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#asserter() asserter} attribute.
   * @param value The value for asserter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withAsserter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "asserter");
    if (this.asserter == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        newValue,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#asserter() asserter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asserter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withAsserter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.asserter == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        value,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetDateTime() onsetDateTime} attribute.
   * @param value The value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "onsetDateTime");
    if (Objects.equals(this.onsetDateTime, newValue)) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        newValue,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetDateTime() onsetDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.onsetDateTime, value)) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        value,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#reaction() reaction} attribute.
   * @param value The value for reaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withReaction(List<AllergyIntolerance_Reaction> value) {
    @Nullable List<AllergyIntolerance_Reaction> newValue = Objects.requireNonNull(value, "reaction");
    if (this.reaction == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        newValue,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#reaction() reaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withReaction(Optional<? extends List<AllergyIntolerance_Reaction>> optional) {
    @Nullable List<AllergyIntolerance_Reaction> value = optional.orElse(null);
    if (this.reaction == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        value,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        newValue,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        value,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetAge() onsetAge} attribute.
   * @param value The value for onsetAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "onsetAge");
    if (this.onsetAge == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        newValue,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetAge() onsetAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withOnsetAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.onsetAge == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        value,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        newValue,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        value,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        newValue,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        value,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        newValue,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        value,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        newValue,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        value,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        newValue,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        value,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#clinicalStatus() clinicalStatus} attribute.
   * @param value The value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withClinicalStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "clinicalStatus");
    if (this.clinicalStatus == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        newValue,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#clinicalStatus() clinicalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withClinicalStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.clinicalStatus == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        value,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withRecorder(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        newValue,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withRecorder(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        value,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        newValue,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        value,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AllergyIntolerance#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAllergyIntolerance withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        newValue,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#recordedDate() recordedDate} attribute.
   * @param value The value for recordedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withRecordedDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "recordedDate");
    if (this.recordedDate == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        newValue,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#recordedDate() recordedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withRecordedDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.recordedDate == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        value,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AllergyIntolerance#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAllergyIntolerance withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        newValue,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        newValue,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        value,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        newValue,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        value,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        newValue,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        value,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withCategory(List<AllergyintoleranceCategoryItem> value) {
    @Nullable List<AllergyintoleranceCategoryItem> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        newValue,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withCategory(Optional<? extends List<AllergyintoleranceCategoryItem>> optional) {
    @Nullable List<AllergyintoleranceCategoryItem> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        value,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#criticality() criticality} attribute.
   * @param value The value for criticality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withCriticality(AllergyintoleranceCriticality value) {
    @Nullable AllergyintoleranceCriticality newValue = Objects.requireNonNull(value, "criticality");
    if (this.criticality == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        newValue,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#criticality() criticality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criticality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withCriticality(Optional<? extends AllergyintoleranceCriticality> optional) {
    @Nullable AllergyintoleranceCriticality value = optional.orElse(null);
    if (this.criticality == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        value,
        this.encounter,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        newValue,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        value,
        this.type,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withType(AllergyintoleranceType value) {
    @Nullable AllergyintoleranceType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        newValue,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withType(Optional<? extends AllergyintoleranceType> optional) {
    @Nullable AllergyintoleranceType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        value,
        this.onsetPeriod,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetPeriod() onsetPeriod} attribute.
   * @param value The value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "onsetPeriod");
    if (this.onsetPeriod == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        newValue,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetPeriod() onsetPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withOnsetPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.onsetPeriod == value) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        value,
        this.onsetString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetString() onsetString} attribute.
   * @param value The value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "onsetString");
    if (Objects.equals(this.onsetString, newValue)) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetString() onsetString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.onsetString, value)) return this;
    return new ImmutableAllergyIntolerance(
        this.meta,
        this.lastOccurrence,
        this.verificationStatus,
        this.onsetRange,
        this.asserter,
        this.onsetDateTime,
        this.reaction,
        this.code,
        this.onsetAge,
        this.implicitRules,
        this.contained,
        this.modifierExtension,
        this.id,
        this.text,
        this.clinicalStatus,
        this.recorder,
        this.identifier,
        this.patient,
        this.recordedDate,
        this.resourceType,
        this.language,
        this.extension,
        this.note,
        this.category,
        this.criticality,
        this.encounter,
        this.type,
        this.onsetPeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAllergyIntolerance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAllergyIntolerance
        && equalTo((ImmutableAllergyIntolerance) another);
  }

  private boolean equalTo(ImmutableAllergyIntolerance another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(lastOccurrence, another.lastOccurrence)
        && Objects.equals(verificationStatus, another.verificationStatus)
        && Objects.equals(onsetRange, another.onsetRange)
        && Objects.equals(asserter, another.asserter)
        && Objects.equals(onsetDateTime, another.onsetDateTime)
        && Objects.equals(reaction, another.reaction)
        && Objects.equals(code, another.code)
        && Objects.equals(onsetAge, another.onsetAge)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(clinicalStatus, another.clinicalStatus)
        && Objects.equals(recorder, another.recorder)
        && Objects.equals(identifier, another.identifier)
        && patient.equals(another.patient)
        && Objects.equals(recordedDate, another.recordedDate)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && Objects.equals(note, another.note)
        && Objects.equals(category, another.category)
        && Objects.equals(criticality, another.criticality)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(type, another.type)
        && Objects.equals(onsetPeriod, another.onsetPeriod)
        && Objects.equals(onsetString, another.onsetString);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code lastOccurrence}, {@code verificationStatus}, {@code onsetRange}, {@code asserter}, {@code onsetDateTime}, {@code reaction}, {@code code}, {@code onsetAge}, {@code implicitRules}, {@code contained}, {@code modifierExtension}, {@code id}, {@code text}, {@code clinicalStatus}, {@code recorder}, {@code identifier}, {@code patient}, {@code recordedDate}, {@code resourceType}, {@code language}, {@code extension}, {@code note}, {@code category}, {@code criticality}, {@code encounter}, {@code type}, {@code onsetPeriod}, {@code onsetString}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(lastOccurrence);
    h += (h << 5) + Objects.hashCode(verificationStatus);
    h += (h << 5) + Objects.hashCode(onsetRange);
    h += (h << 5) + Objects.hashCode(asserter);
    h += (h << 5) + Objects.hashCode(onsetDateTime);
    h += (h << 5) + Objects.hashCode(reaction);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(onsetAge);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(clinicalStatus);
    h += (h << 5) + Objects.hashCode(recorder);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(recordedDate);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(criticality);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(onsetPeriod);
    h += (h << 5) + Objects.hashCode(onsetString);
    return h;
  }

  /**
   * Prints the immutable value {@code AllergyIntolerance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AllergyIntolerance{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (lastOccurrence != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("lastOccurrence=").append(lastOccurrence);
    }
    if (verificationStatus != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("verificationStatus=").append(verificationStatus);
    }
    if (onsetRange != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("onsetRange=").append(onsetRange);
    }
    if (asserter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("asserter=").append(asserter);
    }
    if (onsetDateTime != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("onsetDateTime=").append(onsetDateTime);
    }
    if (reaction != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("reaction=").append(reaction);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (onsetAge != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("onsetAge=").append(onsetAge);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (clinicalStatus != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("clinicalStatus=").append(clinicalStatus);
    }
    if (recorder != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("patient=").append(patient);
    if (recordedDate != null) {
      builder.append(", ");
      builder.append("recordedDate=").append(recordedDate);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (criticality != null) {
      builder.append(", ");
      builder.append("criticality=").append(criticality);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (onsetPeriod != null) {
      builder.append(", ");
      builder.append("onsetPeriod=").append(onsetPeriod);
    }
    if (onsetString != null) {
      builder.append(", ");
      builder.append("onsetString=").append(onsetString);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AllergyIntolerance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AllergyIntolerance {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<DateTime> lastOccurrence = Optional.empty();
    boolean lastOccurrenceIsSet;
    @Nullable Optional<CodeableConcept> verificationStatus = Optional.empty();
    boolean verificationStatusIsSet;
    @Nullable Optional<Range> onsetRange = Optional.empty();
    boolean onsetRangeIsSet;
    @Nullable Optional<Reference> asserter = Optional.empty();
    boolean asserterIsSet;
    @Nullable Optional<String> onsetDateTime = Optional.empty();
    boolean onsetDateTimeIsSet;
    @Nullable Optional<List<AllergyIntolerance_Reaction>> reaction = Optional.empty();
    boolean reactionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Age> onsetAge = Optional.empty();
    boolean onsetAgeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CodeableConcept> clinicalStatus = Optional.empty();
    boolean clinicalStatusIsSet;
    @Nullable Optional<Reference> recorder = Optional.empty();
    boolean recorderIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Reference patient;
    @Nullable Optional<DateTime> recordedDate = Optional.empty();
    boolean recordedDateIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<AllergyintoleranceCategoryItem>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<AllergyintoleranceCriticality> criticality = Optional.empty();
    boolean criticalityIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<AllergyintoleranceType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Period> onsetPeriod = Optional.empty();
    boolean onsetPeriodIsSet;
    @Nullable Optional<String> onsetString = Optional.empty();
    boolean onsetStringIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("lastOccurrence")
    public void setLastOccurrence(Optional<DateTime> lastOccurrence) {
      this.lastOccurrence = lastOccurrence;
      this.lastOccurrenceIsSet = true;
    }
    @JsonProperty("verificationStatus")
    public void setVerificationStatus(Optional<CodeableConcept> verificationStatus) {
      this.verificationStatus = verificationStatus;
      this.verificationStatusIsSet = true;
    }
    @JsonProperty("onsetRange")
    public void setOnsetRange(Optional<Range> onsetRange) {
      this.onsetRange = onsetRange;
      this.onsetRangeIsSet = true;
    }
    @JsonProperty("asserter")
    public void setAsserter(Optional<Reference> asserter) {
      this.asserter = asserter;
      this.asserterIsSet = true;
    }
    @JsonProperty("onsetDateTime")
    public void setOnsetDateTime(Optional<String> onsetDateTime) {
      this.onsetDateTime = onsetDateTime;
      this.onsetDateTimeIsSet = true;
    }
    @JsonProperty("reaction")
    public void setReaction(Optional<List<AllergyIntolerance_Reaction>> reaction) {
      this.reaction = reaction;
      this.reactionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("onsetAge")
    public void setOnsetAge(Optional<Age> onsetAge) {
      this.onsetAge = onsetAge;
      this.onsetAgeIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
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
    @JsonProperty("clinicalStatus")
    public void setClinicalStatus(Optional<CodeableConcept> clinicalStatus) {
      this.clinicalStatus = clinicalStatus;
      this.clinicalStatusIsSet = true;
    }
    @JsonProperty("recorder")
    public void setRecorder(Optional<Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("recordedDate")
    public void setRecordedDate(Optional<DateTime> recordedDate) {
      this.recordedDate = recordedDate;
      this.recordedDateIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<AllergyintoleranceCategoryItem>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("criticality")
    public void setCriticality(Optional<AllergyintoleranceCriticality> criticality) {
      this.criticality = criticality;
      this.criticalityIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<AllergyintoleranceType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("onsetPeriod")
    public void setOnsetPeriod(Optional<Period> onsetPeriod) {
      this.onsetPeriod = onsetPeriod;
      this.onsetPeriodIsSet = true;
    }
    @JsonProperty("onsetString")
    public void setOnsetString(Optional<String> onsetString) {
      this.onsetString = onsetString;
      this.onsetStringIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> lastOccurrence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> verificationStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> onsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> asserter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> onsetDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<AllergyIntolerance_Reaction>> reaction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> onsetAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> clinicalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> recordedDate() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<AllergyintoleranceCategoryItem>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AllergyintoleranceCriticality> criticality() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<AllergyintoleranceType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> onsetPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> onsetString() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAllergyIntolerance fromJson(Json json) {
    ImmutableAllergyIntolerance.Builder builder = ((ImmutableAllergyIntolerance.Builder) ImmutableAllergyIntolerance.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.lastOccurrenceIsSet) {
      builder.lastOccurrence(json.lastOccurrence);
    }
    if (json.verificationStatusIsSet) {
      builder.verificationStatus(json.verificationStatus);
    }
    if (json.onsetRangeIsSet) {
      builder.onsetRange(json.onsetRange);
    }
    if (json.asserterIsSet) {
      builder.asserter(json.asserter);
    }
    if (json.onsetDateTimeIsSet) {
      builder.onsetDateTime(json.onsetDateTime);
    }
    if (json.reactionIsSet) {
      builder.reaction(json.reaction);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.onsetAgeIsSet) {
      builder.onsetAge(json.onsetAge);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.clinicalStatusIsSet) {
      builder.clinicalStatus(json.clinicalStatus);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.recordedDateIsSet) {
      builder.recordedDate(json.recordedDate);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.criticalityIsSet) {
      builder.criticality(json.criticality);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.onsetPeriodIsSet) {
      builder.onsetPeriod(json.onsetPeriod);
    }
    if (json.onsetStringIsSet) {
      builder.onsetString(json.onsetString);
    }
    return (ImmutableAllergyIntolerance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AllergyIntolerance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AllergyIntolerance instance
   */
  public static AllergyIntolerance copyOf(AllergyIntolerance instance) {
    if (instance instanceof ImmutableAllergyIntolerance) {
      return (ImmutableAllergyIntolerance) instance;
    }
    return ((ImmutableAllergyIntolerance.Builder) ImmutableAllergyIntolerance.builder())
        .meta(instance.meta())
        .lastOccurrence(instance.lastOccurrence())
        .verificationStatus(instance.verificationStatus())
        .onsetRange(instance.onsetRange())
        .asserter(instance.asserter())
        .onsetDateTime(instance.onsetDateTime())
        .reaction(instance.reaction())
        .code(instance.code())
        .onsetAge(instance.onsetAge())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .text(instance.text())
        .clinicalStatus(instance.clinicalStatus())
        .recorder(instance.recorder())
        .identifier(instance.identifier())
        .patient(instance.patient())
        .recordedDate(instance.recordedDate())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .extension(instance.extension())
        .note(instance.note())
        .category(instance.category())
        .criticality(instance.criticality())
        .encounter(instance.encounter())
        .type(instance.type())
        .onsetPeriod(instance.onsetPeriod())
        .onsetString(instance.onsetString())
        .build();
  }

  /**
   * Creates a builder for {@link AllergyIntolerance AllergyIntolerance}.
   * <pre>
   * ImmutableAllergyIntolerance.builder()
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link AllergyIntolerance#meta() meta}
   *    .lastOccurrence(com.medplum.types.fhir.DateTime) // optional {@link AllergyIntolerance#lastOccurrence() lastOccurrence}
   *    .verificationStatus(com.medplum.types.fhir.CodeableConcept) // optional {@link AllergyIntolerance#verificationStatus() verificationStatus}
   *    .onsetRange(com.medplum.types.fhir.Range) // optional {@link AllergyIntolerance#onsetRange() onsetRange}
   *    .asserter(com.medplum.types.fhir.Reference) // optional {@link AllergyIntolerance#asserter() asserter}
   *    .onsetDateTime(String) // optional {@link AllergyIntolerance#onsetDateTime() onsetDateTime}
   *    .reaction(List&amp;lt;com.medplum.types.fhir.AllergyIntolerance_Reaction&amp;gt;) // optional {@link AllergyIntolerance#reaction() reaction}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link AllergyIntolerance#code() code}
   *    .onsetAge(com.medplum.types.fhir.Age) // optional {@link AllergyIntolerance#onsetAge() onsetAge}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link AllergyIntolerance#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link AllergyIntolerance#contained() contained}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance#modifierExtension() modifierExtension}
   *    .id(com.medplum.types.fhir.Id) // optional {@link AllergyIntolerance#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link AllergyIntolerance#text() text}
   *    .clinicalStatus(com.medplum.types.fhir.CodeableConcept) // optional {@link AllergyIntolerance#clinicalStatus() clinicalStatus}
   *    .recorder(com.medplum.types.fhir.Reference) // optional {@link AllergyIntolerance#recorder() recorder}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link AllergyIntolerance#identifier() identifier}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link AllergyIntolerance#patient() patient}
   *    .recordedDate(com.medplum.types.fhir.DateTime) // optional {@link AllergyIntolerance#recordedDate() recordedDate}
   *    .resourceType(String) // required {@link AllergyIntolerance#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link AllergyIntolerance#language() language}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance#extension() extension}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link AllergyIntolerance#note() note}
   *    .category(List&amp;lt;com.medplum.types.fhir.AllergyintoleranceCategoryItem&amp;gt;) // optional {@link AllergyIntolerance#category() category}
   *    .criticality(com.medplum.types.fhir.AllergyintoleranceCriticality) // optional {@link AllergyIntolerance#criticality() criticality}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link AllergyIntolerance#encounter() encounter}
   *    .type(com.medplum.types.fhir.AllergyintoleranceType) // optional {@link AllergyIntolerance#type() type}
   *    .onsetPeriod(com.medplum.types.fhir.Period) // optional {@link AllergyIntolerance#onsetPeriod() onsetPeriod}
   *    .onsetString(String) // optional {@link AllergyIntolerance#onsetString() onsetString}
   *    .build();
   * </pre>
   * @return A new AllergyIntolerance builder
   */
  public static PatientBuildStage builder() {
    return new ImmutableAllergyIntolerance.Builder();
  }

  /**
   * Builds instances of type {@link AllergyIntolerance AllergyIntolerance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AllergyIntolerance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PatientBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PATIENT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_LAST_OCCURRENCE = 0x2L;
    private static final long OPT_BIT_VERIFICATION_STATUS = 0x4L;
    private static final long OPT_BIT_ONSET_RANGE = 0x8L;
    private static final long OPT_BIT_ASSERTER = 0x10L;
    private static final long OPT_BIT_ONSET_DATE_TIME = 0x20L;
    private static final long OPT_BIT_REACTION = 0x40L;
    private static final long OPT_BIT_CODE = 0x80L;
    private static final long OPT_BIT_ONSET_AGE = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_TEXT = 0x2000L;
    private static final long OPT_BIT_CLINICAL_STATUS = 0x4000L;
    private static final long OPT_BIT_RECORDER = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_RECORDED_DATE = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_NOTE = 0x100000L;
    private static final long OPT_BIT_CATEGORY = 0x200000L;
    private static final long OPT_BIT_CRITICALITY = 0x400000L;
    private static final long OPT_BIT_ENCOUNTER = 0x800000L;
    private static final long OPT_BIT_TYPE = 0x1000000L;
    private static final long OPT_BIT_ONSET_PERIOD = 0x2000000L;
    private static final long OPT_BIT_ONSET_STRING = 0x4000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable DateTime lastOccurrence;
    private @Nullable CodeableConcept verificationStatus;
    private @Nullable Range onsetRange;
    private @Nullable Reference asserter;
    private @Nullable String onsetDateTime;
    private @Nullable List<AllergyIntolerance_Reaction> reaction;
    private @Nullable CodeableConcept code;
    private @Nullable Age onsetAge;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable CodeableConcept clinicalStatus;
    private @Nullable Reference recorder;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference patient;
    private @Nullable DateTime recordedDate;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable List<Annotation> note;
    private @Nullable List<AllergyintoleranceCategoryItem> category;
    private @Nullable AllergyintoleranceCriticality criticality;
    private @Nullable Reference encounter;
    private @Nullable AllergyintoleranceType type;
    private @Nullable Period onsetPeriod;
    private @Nullable String onsetString;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
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
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
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
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastOccurrence(DateTime lastOccurrence) {
      checkNotIsSet(lastOccurrenceIsSet(), "lastOccurrence");
      this.lastOccurrence = Objects.requireNonNull(lastOccurrence, "lastOccurrence");
      optBits |= OPT_BIT_LAST_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastOccurrence")
    public final Builder lastOccurrence(Optional<? extends DateTime> lastOccurrence) {
      checkNotIsSet(lastOccurrenceIsSet(), "lastOccurrence");
      this.lastOccurrence = lastOccurrence.orElse(null);
      optBits |= OPT_BIT_LAST_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder verificationStatus(CodeableConcept verificationStatus) {
      checkNotIsSet(verificationStatusIsSet(), "verificationStatus");
      this.verificationStatus = Objects.requireNonNull(verificationStatus, "verificationStatus");
      optBits |= OPT_BIT_VERIFICATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("verificationStatus")
    public final Builder verificationStatus(Optional<? extends CodeableConcept> verificationStatus) {
      checkNotIsSet(verificationStatusIsSet(), "verificationStatus");
      this.verificationStatus = verificationStatus.orElse(null);
      optBits |= OPT_BIT_VERIFICATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetRange(Range onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = Objects.requireNonNull(onsetRange, "onsetRange");
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetRange")
    public final Builder onsetRange(Optional<? extends Range> onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = onsetRange.orElse(null);
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    public final Builder asserter(Reference asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = Objects.requireNonNull(asserter, "asserter");
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("asserter")
    public final Builder asserter(Optional<? extends Reference> asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = asserter.orElse(null);
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetDateTime(String onsetDateTime) {
      checkNotIsSet(onsetDateTimeIsSet(), "onsetDateTime");
      this.onsetDateTime = Objects.requireNonNull(onsetDateTime, "onsetDateTime");
      optBits |= OPT_BIT_ONSET_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetDateTime")
    public final Builder onsetDateTime(Optional<String> onsetDateTime) {
      checkNotIsSet(onsetDateTimeIsSet(), "onsetDateTime");
      this.onsetDateTime = onsetDateTime.orElse(null);
      optBits |= OPT_BIT_ONSET_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder reaction(List<AllergyIntolerance_Reaction> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = Objects.requireNonNull(reaction, "reaction");
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reaction")
    public final Builder reaction(Optional<? extends List<AllergyIntolerance_Reaction>> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = reaction.orElse(null);
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetAge(Age onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = Objects.requireNonNull(onsetAge, "onsetAge");
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetAge")
    public final Builder onsetAge(Optional<? extends Age> onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = onsetAge.orElse(null);
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
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
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
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
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
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
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
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
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
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
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
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
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder clinicalStatus(CodeableConcept clinicalStatus) {
      checkNotIsSet(clinicalStatusIsSet(), "clinicalStatus");
      this.clinicalStatus = Objects.requireNonNull(clinicalStatus, "clinicalStatus");
      optBits |= OPT_BIT_CLINICAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("clinicalStatus")
    public final Builder clinicalStatus(Optional<? extends CodeableConcept> clinicalStatus) {
      checkNotIsSet(clinicalStatusIsSet(), "clinicalStatus");
      this.clinicalStatus = clinicalStatus.orElse(null);
      optBits |= OPT_BIT_CLINICAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link AllergyIntolerance#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
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
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
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
     * Initializes the value for the {@link AllergyIntolerance#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
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
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
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
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<AllergyintoleranceCategoryItem> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<AllergyintoleranceCategoryItem>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for chained invocation
     */
    public final Builder criticality(AllergyintoleranceCriticality criticality) {
      checkNotIsSet(criticalityIsSet(), "criticality");
      this.criticality = Objects.requireNonNull(criticality, "criticality");
      optBits |= OPT_BIT_CRITICALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criticality")
    public final Builder criticality(Optional<? extends AllergyintoleranceCriticality> criticality) {
      checkNotIsSet(criticalityIsSet(), "criticality");
      this.criticality = criticality.orElse(null);
      optBits |= OPT_BIT_CRITICALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(AllergyintoleranceType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends AllergyintoleranceType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetPeriod(Period onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = Objects.requireNonNull(onsetPeriod, "onsetPeriod");
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetPeriod")
    public final Builder onsetPeriod(Optional<? extends Period> onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = onsetPeriod.orElse(null);
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetString(String onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = Objects.requireNonNull(onsetString, "onsetString");
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onsetString")
    public final Builder onsetString(Optional<String> onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = onsetString.orElse(null);
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Builds a new {@link AllergyIntolerance AllergyIntolerance}.
     * @return An immutable instance of AllergyIntolerance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AllergyIntolerance build() {
      checkRequiredAttributes();
      return new ImmutableAllergyIntolerance(
          meta,
          lastOccurrence,
          verificationStatus,
          onsetRange,
          asserter,
          onsetDateTime,
          reaction,
          code,
          onsetAge,
          implicitRules,
          contained,
          modifierExtension,
          id,
          text,
          clinicalStatus,
          recorder,
          identifier,
          patient,
          recordedDate,
          resourceType,
          language,
          extension,
          note,
          category,
          criticality,
          encounter,
          type,
          onsetPeriod,
          onsetString);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean lastOccurrenceIsSet() {
      return (optBits & OPT_BIT_LAST_OCCURRENCE) != 0;
    }

    private boolean verificationStatusIsSet() {
      return (optBits & OPT_BIT_VERIFICATION_STATUS) != 0;
    }

    private boolean onsetRangeIsSet() {
      return (optBits & OPT_BIT_ONSET_RANGE) != 0;
    }

    private boolean asserterIsSet() {
      return (optBits & OPT_BIT_ASSERTER) != 0;
    }

    private boolean onsetDateTimeIsSet() {
      return (optBits & OPT_BIT_ONSET_DATE_TIME) != 0;
    }

    private boolean reactionIsSet() {
      return (optBits & OPT_BIT_REACTION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean onsetAgeIsSet() {
      return (optBits & OPT_BIT_ONSET_AGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean clinicalStatusIsSet() {
      return (optBits & OPT_BIT_CLINICAL_STATUS) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean recordedDateIsSet() {
      return (optBits & OPT_BIT_RECORDED_DATE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean criticalityIsSet() {
      return (optBits & OPT_BIT_CRITICALITY) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean onsetPeriodIsSet() {
      return (optBits & OPT_BIT_ONSET_PERIOD) != 0;
    }

    private boolean onsetStringIsSet() {
      return (optBits & OPT_BIT_ONSET_STRING) != 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AllergyIntolerance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!patientIsSet()) attributes.add("patient");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build AllergyIntolerance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "AllergyIntolerance", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link AllergyIntolerance#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage patient(Reference patient);
  }

  @Generated(from = "AllergyIntolerance", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AllergyIntolerance#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "AllergyIntolerance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastOccurrence(DateTime lastOccurrence);

    /**
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastOccurrence(Optional<? extends DateTime> lastOccurrence);

    /**
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal verificationStatus(CodeableConcept verificationStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal verificationStatus(Optional<? extends CodeableConcept> verificationStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetRange(Range onsetRange);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetRange(Optional<? extends Range> onsetRange);

    /**
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asserter(Reference asserter);

    /**
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asserter(Optional<? extends Reference> asserter);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetDateTime(String onsetDateTime);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetDateTime(Optional<String> onsetDateTime);

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reaction(List<AllergyIntolerance_Reaction> reaction);

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reaction(Optional<? extends List<AllergyIntolerance_Reaction>> reaction);

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetAge(Age onsetAge);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetAge(Optional<? extends Age> onsetAge);

    /**
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal clinicalStatus(CodeableConcept clinicalStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal clinicalStatus(Optional<? extends CodeableConcept> clinicalStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(Reference recorder);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(Optional<? extends Reference> recorder);

    /**
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedDate(DateTime recordedDate);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedDate(Optional<? extends DateTime> recordedDate);

    /**
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<AllergyintoleranceCategoryItem> category);

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<AllergyintoleranceCategoryItem>> category);

    /**
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal criticality(AllergyintoleranceCriticality criticality);

    /**
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal criticality(Optional<? extends AllergyintoleranceCriticality> criticality);

    /**
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(AllergyintoleranceType type);

    /**
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends AllergyintoleranceType> type);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetPeriod(Period onsetPeriod);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetPeriod(Optional<? extends Period> onsetPeriod);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetString(String onsetString);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetString(Optional<String> onsetString);

    /**
     * Builds a new {@link AllergyIntolerance AllergyIntolerance}.
     * @return An immutable instance of AllergyIntolerance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AllergyIntolerance build();
  }
}
