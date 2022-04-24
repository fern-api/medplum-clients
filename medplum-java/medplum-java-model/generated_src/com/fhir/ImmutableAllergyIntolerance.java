//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link AllergyIntolerance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAllergyIntolerance.builder()}.
 */
@org.immutables.value.Generated(from = "AllergyIntolerance", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAllergyIntolerance implements com.fhir.AllergyIntolerance {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference recorder;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.dateTime recordedDate;
  private final @javax.annotation.Nullable com.fhir.Reference asserter;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Period onsetPeriod;
  private final @javax.annotation.Nullable com.fhir.dateTime lastOccurrence;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.AllergyintoleranceCriticality criticality;
  private final @javax.annotation.Nullable java.util.List<com.fhir.AllergyIntolerance_Reaction> reaction;
  private final @javax.annotation.Nullable com.fhir.Range onsetRange;
  private final @javax.annotation.Nullable java.lang.String onsetString;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.AllergyintoleranceType type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.AllergyintoleranceCategoryItem> category;
  private final @javax.annotation.Nullable com.fhir.Age onsetAge;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept verificationStatus;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept clinicalStatus;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.lang.String onsetDateTime;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;

  private ImmutableAllergyIntolerance(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference recorder,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.dateTime recordedDate,
      @javax.annotation.Nullable com.fhir.Reference asserter,
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Period onsetPeriod,
      @javax.annotation.Nullable com.fhir.dateTime lastOccurrence,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.AllergyintoleranceCriticality criticality,
      @javax.annotation.Nullable java.util.List<com.fhir.AllergyIntolerance_Reaction> reaction,
      @javax.annotation.Nullable com.fhir.Range onsetRange,
      @javax.annotation.Nullable java.lang.String onsetString,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.AllergyintoleranceType type,
      @javax.annotation.Nullable java.util.List<com.fhir.AllergyintoleranceCategoryItem> category,
      @javax.annotation.Nullable com.fhir.Age onsetAge,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept verificationStatus,
      @javax.annotation.Nullable com.fhir.CodeableConcept clinicalStatus,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.lang.String onsetDateTime,
      @javax.annotation.Nullable com.fhir.Reference encounter) {
    this.language = language;
    this.contained = contained;
    this.text = text;
    this.recorder = recorder;
    this.implicitRules = implicitRules;
    this.recordedDate = recordedDate;
    this.asserter = asserter;
    this.patient = patient;
    this.note = note;
    this.extension = extension;
    this.onsetPeriod = onsetPeriod;
    this.lastOccurrence = lastOccurrence;
    this.id = id;
    this.criticality = criticality;
    this.reaction = reaction;
    this.onsetRange = onsetRange;
    this.onsetString = onsetString;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.category = category;
    this.onsetAge = onsetAge;
    this.meta = meta;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.verificationStatus = verificationStatus;
    this.clinicalStatus = clinicalStatus;
    this.code = code;
    this.onsetDateTime = onsetDateTime;
    this.encounter = encounter;
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code asserter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("asserter")
  @Override
  public java.util.Optional<com.fhir.Reference> asserter() {
    return java.util.Optional.ofNullable(asserter);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code onsetPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onsetPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> onsetPeriod() {
    return java.util.Optional.ofNullable(onsetPeriod);
  }

  /**
   * @return The value of the {@code lastOccurrence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastOccurrence")
  @Override
  public java.util.Optional<com.fhir.dateTime> lastOccurrence() {
    return java.util.Optional.ofNullable(lastOccurrence);
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
   * @return The value of the {@code criticality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("criticality")
  @Override
  public java.util.Optional<com.fhir.AllergyintoleranceCriticality> criticality() {
    return java.util.Optional.ofNullable(criticality);
  }

  /**
   * @return The value of the {@code reaction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reaction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.AllergyIntolerance_Reaction>> reaction() {
    return java.util.Optional.ofNullable(reaction);
  }

  /**
   * @return The value of the {@code onsetRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onsetRange")
  @Override
  public java.util.Optional<com.fhir.Range> onsetRange() {
    return java.util.Optional.ofNullable(onsetRange);
  }

  /**
   * @return The value of the {@code onsetString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onsetString")
  @Override
  public java.util.Optional<java.lang.String> onsetString() {
    return java.util.Optional.ofNullable(onsetString);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.AllergyintoleranceType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.AllergyintoleranceCategoryItem>> category() {
    return java.util.Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code onsetAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onsetAge")
  @Override
  public java.util.Optional<com.fhir.Age> onsetAge() {
    return java.util.Optional.ofNullable(onsetAge);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code verificationStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("verificationStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> verificationStatus() {
    return java.util.Optional.ofNullable(verificationStatus);
  }

  /**
   * @return The value of the {@code clinicalStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("clinicalStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> clinicalStatus() {
    return java.util.Optional.ofNullable(clinicalStatus);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code onsetDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onsetDateTime")
  @Override
  public java.util.Optional<java.lang.String> onsetDateTime() {
    return java.util.Optional.ofNullable(onsetDateTime);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAllergyIntolerance(
        newValue,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAllergyIntolerance(
        value,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        newValue,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        value,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        newValue,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        value,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withRecorder(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        newValue,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withRecorder(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        value,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        newValue,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        value,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#recordedDate() recordedDate} attribute.
   * @param value The value for recordedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withRecordedDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "recordedDate");
    if (this.recordedDate == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        newValue,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#recordedDate() recordedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withRecordedDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.recordedDate == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        value,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#asserter() asserter} attribute.
   * @param value The value for asserter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withAsserter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "asserter");
    if (this.asserter == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        newValue,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#asserter() asserter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asserter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withAsserter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.asserter == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        value,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AllergyIntolerance#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAllergyIntolerance withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        newValue,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        newValue,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        value,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        newValue,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        value,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetPeriod() onsetPeriod} attribute.
   * @param value The value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "onsetPeriod");
    if (this.onsetPeriod == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        newValue,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetPeriod() onsetPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withOnsetPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.onsetPeriod == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        value,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#lastOccurrence() lastOccurrence} attribute.
   * @param value The value for lastOccurrence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withLastOccurrence(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "lastOccurrence");
    if (this.lastOccurrence == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        newValue,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#lastOccurrence() lastOccurrence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastOccurrence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withLastOccurrence(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.lastOccurrence == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        value,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        newValue,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        value,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#criticality() criticality} attribute.
   * @param value The value for criticality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withCriticality(com.fhir.AllergyintoleranceCriticality value) {
    @javax.annotation.Nullable com.fhir.AllergyintoleranceCriticality newValue = java.util.Objects.requireNonNull(value, "criticality");
    if (this.criticality == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        newValue,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#criticality() criticality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criticality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withCriticality(java.util.Optional<? extends com.fhir.AllergyintoleranceCriticality> optional) {
    @javax.annotation.Nullable com.fhir.AllergyintoleranceCriticality value = optional.orElse(null);
    if (this.criticality == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        value,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#reaction() reaction} attribute.
   * @param value The value for reaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withReaction(java.util.List<com.fhir.AllergyIntolerance_Reaction> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.AllergyIntolerance_Reaction> newValue = java.util.Objects.requireNonNull(value, "reaction");
    if (this.reaction == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        newValue,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#reaction() reaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withReaction(java.util.Optional<? extends java.util.List<com.fhir.AllergyIntolerance_Reaction>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.AllergyIntolerance_Reaction> value = optional.orElse(null);
    if (this.reaction == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        value,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetRange() onsetRange} attribute.
   * @param value The value for onsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "onsetRange");
    if (this.onsetRange == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        newValue,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetRange() onsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withOnsetRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.onsetRange == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        value,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetString() onsetString} attribute.
   * @param value The value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "onsetString");
    if (java.util.Objects.equals(this.onsetString, newValue)) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        newValue,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetString() onsetString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.onsetString, value)) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        value,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        newValue,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        value,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withType(com.fhir.AllergyintoleranceType value) {
    @javax.annotation.Nullable com.fhir.AllergyintoleranceType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        newValue,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withType(java.util.Optional<? extends com.fhir.AllergyintoleranceType> optional) {
    @javax.annotation.Nullable com.fhir.AllergyintoleranceType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        value,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withCategory(java.util.List<com.fhir.AllergyintoleranceCategoryItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.AllergyintoleranceCategoryItem> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        newValue,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withCategory(java.util.Optional<? extends java.util.List<com.fhir.AllergyintoleranceCategoryItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.AllergyintoleranceCategoryItem> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        value,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetAge() onsetAge} attribute.
   * @param value The value for onsetAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "onsetAge");
    if (this.onsetAge == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        newValue,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetAge() onsetAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withOnsetAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.onsetAge == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        value,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        newValue,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        value,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AllergyIntolerance#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAllergyIntolerance withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        newValue,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        newValue,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        value,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#verificationStatus() verificationStatus} attribute.
   * @param value The value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withVerificationStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "verificationStatus");
    if (this.verificationStatus == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        newValue,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#verificationStatus() verificationStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withVerificationStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.verificationStatus == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        value,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#clinicalStatus() clinicalStatus} attribute.
   * @param value The value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withClinicalStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "clinicalStatus");
    if (this.clinicalStatus == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        newValue,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#clinicalStatus() clinicalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withClinicalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.clinicalStatus == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        value,
        this.code,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        newValue,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        value,
        this.onsetDateTime,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#onsetDateTime() onsetDateTime} attribute.
   * @param value The value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "onsetDateTime");
    if (java.util.Objects.equals(this.onsetDateTime, newValue)) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        newValue,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#onsetDateTime() onsetDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withOnsetDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.onsetDateTime, value)) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        value,
        this.encounter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableAllergyIntolerance(
        this.language,
        this.contained,
        this.text,
        this.recorder,
        this.implicitRules,
        this.recordedDate,
        this.asserter,
        this.patient,
        this.note,
        this.extension,
        this.onsetPeriod,
        this.lastOccurrence,
        this.id,
        this.criticality,
        this.reaction,
        this.onsetRange,
        this.onsetString,
        this.modifierExtension,
        this.type,
        this.category,
        this.onsetAge,
        this.meta,
        this.resourceType,
        this.identifier,
        this.verificationStatus,
        this.clinicalStatus,
        this.code,
        this.onsetDateTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAllergyIntolerance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAllergyIntolerance
        && equalTo((ImmutableAllergyIntolerance) another);
  }

  private boolean equalTo(ImmutableAllergyIntolerance another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(recorder, another.recorder)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(recordedDate, another.recordedDate)
        && java.util.Objects.equals(asserter, another.asserter)
        && patient.equals(another.patient)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(onsetPeriod, another.onsetPeriod)
        && java.util.Objects.equals(lastOccurrence, another.lastOccurrence)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(criticality, another.criticality)
        && java.util.Objects.equals(reaction, another.reaction)
        && java.util.Objects.equals(onsetRange, another.onsetRange)
        && java.util.Objects.equals(onsetString, another.onsetString)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(onsetAge, another.onsetAge)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(verificationStatus, another.verificationStatus)
        && java.util.Objects.equals(clinicalStatus, another.clinicalStatus)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(onsetDateTime, another.onsetDateTime)
        && java.util.Objects.equals(encounter, another.encounter);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code contained}, {@code text}, {@code recorder}, {@code implicitRules}, {@code recordedDate}, {@code asserter}, {@code patient}, {@code note}, {@code extension}, {@code onsetPeriod}, {@code lastOccurrence}, {@code id}, {@code criticality}, {@code reaction}, {@code onsetRange}, {@code onsetString}, {@code modifierExtension}, {@code type}, {@code category}, {@code onsetAge}, {@code meta}, {@code resourceType}, {@code identifier}, {@code verificationStatus}, {@code clinicalStatus}, {@code code}, {@code onsetDateTime}, {@code encounter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(recorder);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(recordedDate);
    h += (h << 5) + java.util.Objects.hashCode(asserter);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(onsetPeriod);
    h += (h << 5) + java.util.Objects.hashCode(lastOccurrence);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(criticality);
    h += (h << 5) + java.util.Objects.hashCode(reaction);
    h += (h << 5) + java.util.Objects.hashCode(onsetRange);
    h += (h << 5) + java.util.Objects.hashCode(onsetString);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(onsetAge);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(verificationStatus);
    h += (h << 5) + java.util.Objects.hashCode(clinicalStatus);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(onsetDateTime);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    return h;
  }

  /**
   * Prints the immutable value {@code AllergyIntolerance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("AllergyIntolerance{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (recorder != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (recordedDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("recordedDate=").append(recordedDate);
    }
    if (asserter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("asserter=").append(asserter);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("patient=").append(patient);
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (onsetPeriod != null) {
      builder.append(", ");
      builder.append("onsetPeriod=").append(onsetPeriod);
    }
    if (lastOccurrence != null) {
      builder.append(", ");
      builder.append("lastOccurrence=").append(lastOccurrence);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (criticality != null) {
      builder.append(", ");
      builder.append("criticality=").append(criticality);
    }
    if (reaction != null) {
      builder.append(", ");
      builder.append("reaction=").append(reaction);
    }
    if (onsetRange != null) {
      builder.append(", ");
      builder.append("onsetRange=").append(onsetRange);
    }
    if (onsetString != null) {
      builder.append(", ");
      builder.append("onsetString=").append(onsetString);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (onsetAge != null) {
      builder.append(", ");
      builder.append("onsetAge=").append(onsetAge);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (verificationStatus != null) {
      builder.append(", ");
      builder.append("verificationStatus=").append(verificationStatus);
    }
    if (clinicalStatus != null) {
      builder.append(", ");
      builder.append("clinicalStatus=").append(clinicalStatus);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (onsetDateTime != null) {
      builder.append(", ");
      builder.append("onsetDateTime=").append(onsetDateTime);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "AllergyIntolerance", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.AllergyIntolerance {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> recorder = java.util.Optional.empty();
    boolean recorderIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> recordedDate = java.util.Optional.empty();
    boolean recordedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> asserter = java.util.Optional.empty();
    boolean asserterIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> onsetPeriod = java.util.Optional.empty();
    boolean onsetPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> lastOccurrence = java.util.Optional.empty();
    boolean lastOccurrenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.AllergyintoleranceCriticality> criticality = java.util.Optional.empty();
    boolean criticalityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.AllergyIntolerance_Reaction>> reaction = java.util.Optional.empty();
    boolean reactionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> onsetRange = java.util.Optional.empty();
    boolean onsetRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> onsetString = java.util.Optional.empty();
    boolean onsetStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.AllergyintoleranceType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.AllergyintoleranceCategoryItem>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> onsetAge = java.util.Optional.empty();
    boolean onsetAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> verificationStatus = java.util.Optional.empty();
    boolean verificationStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> clinicalStatus = java.util.Optional.empty();
    boolean clinicalStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> onsetDateTime = java.util.Optional.empty();
    boolean onsetDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorder")
    public void setRecorder(java.util.Optional<com.fhir.Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recordedDate")
    public void setRecordedDate(java.util.Optional<com.fhir.dateTime> recordedDate) {
      this.recordedDate = recordedDate;
      this.recordedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("asserter")
    public void setAsserter(java.util.Optional<com.fhir.Reference> asserter) {
      this.asserter = asserter;
      this.asserterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetPeriod")
    public void setOnsetPeriod(java.util.Optional<com.fhir.Period> onsetPeriod) {
      this.onsetPeriod = onsetPeriod;
      this.onsetPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastOccurrence")
    public void setLastOccurrence(java.util.Optional<com.fhir.dateTime> lastOccurrence) {
      this.lastOccurrence = lastOccurrence;
      this.lastOccurrenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("criticality")
    public void setCriticality(java.util.Optional<com.fhir.AllergyintoleranceCriticality> criticality) {
      this.criticality = criticality;
      this.criticalityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reaction")
    public void setReaction(java.util.Optional<java.util.List<com.fhir.AllergyIntolerance_Reaction>> reaction) {
      this.reaction = reaction;
      this.reactionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetRange")
    public void setOnsetRange(java.util.Optional<com.fhir.Range> onsetRange) {
      this.onsetRange = onsetRange;
      this.onsetRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetString")
    public void setOnsetString(java.util.Optional<java.lang.String> onsetString) {
      this.onsetString = onsetString;
      this.onsetStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.AllergyintoleranceType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.AllergyintoleranceCategoryItem>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetAge")
    public void setOnsetAge(java.util.Optional<com.fhir.Age> onsetAge) {
      this.onsetAge = onsetAge;
      this.onsetAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("verificationStatus")
    public void setVerificationStatus(java.util.Optional<com.fhir.CodeableConcept> verificationStatus) {
      this.verificationStatus = verificationStatus;
      this.verificationStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("clinicalStatus")
    public void setClinicalStatus(java.util.Optional<com.fhir.CodeableConcept> clinicalStatus) {
      this.clinicalStatus = clinicalStatus;
      this.clinicalStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetDateTime")
    public void setOnsetDateTime(java.util.Optional<java.lang.String> onsetDateTime) {
      this.onsetDateTime = onsetDateTime;
      this.onsetDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> recordedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> asserter() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> onsetPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> lastOccurrence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.AllergyintoleranceCriticality> criticality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.AllergyIntolerance_Reaction>> reaction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> onsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> onsetString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.AllergyintoleranceType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.AllergyintoleranceCategoryItem>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> onsetAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> verificationStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> clinicalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> onsetDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAllergyIntolerance fromJson(Json json) {
    ImmutableAllergyIntolerance.Builder builder = ((ImmutableAllergyIntolerance.Builder) ImmutableAllergyIntolerance.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.recordedDateIsSet) {
      builder.recordedDate(json.recordedDate);
    }
    if (json.asserterIsSet) {
      builder.asserter(json.asserter);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.onsetPeriodIsSet) {
      builder.onsetPeriod(json.onsetPeriod);
    }
    if (json.lastOccurrenceIsSet) {
      builder.lastOccurrence(json.lastOccurrence);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.criticalityIsSet) {
      builder.criticality(json.criticality);
    }
    if (json.reactionIsSet) {
      builder.reaction(json.reaction);
    }
    if (json.onsetRangeIsSet) {
      builder.onsetRange(json.onsetRange);
    }
    if (json.onsetStringIsSet) {
      builder.onsetString(json.onsetString);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.onsetAgeIsSet) {
      builder.onsetAge(json.onsetAge);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.verificationStatusIsSet) {
      builder.verificationStatus(json.verificationStatus);
    }
    if (json.clinicalStatusIsSet) {
      builder.clinicalStatus(json.clinicalStatus);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.onsetDateTimeIsSet) {
      builder.onsetDateTime(json.onsetDateTime);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
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
        .language(instance.language())
        .contained(instance.contained())
        .text(instance.text())
        .recorder(instance.recorder())
        .implicitRules(instance.implicitRules())
        .recordedDate(instance.recordedDate())
        .asserter(instance.asserter())
        .patient(instance.patient())
        .note(instance.note())
        .extension(instance.extension())
        .onsetPeriod(instance.onsetPeriod())
        .lastOccurrence(instance.lastOccurrence())
        .id(instance.id())
        .criticality(instance.criticality())
        .reaction(instance.reaction())
        .onsetRange(instance.onsetRange())
        .onsetString(instance.onsetString())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .category(instance.category())
        .onsetAge(instance.onsetAge())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .verificationStatus(instance.verificationStatus())
        .clinicalStatus(instance.clinicalStatus())
        .code(instance.code())
        .onsetDateTime(instance.onsetDateTime())
        .encounter(instance.encounter())
        .build();
  }

  /**
   * Creates a builder for {@link AllergyIntolerance AllergyIntolerance}.
   * <pre>
   * ImmutableAllergyIntolerance.builder()
   *    .language(com.fhir.code) // optional {@link AllergyIntolerance#language() language}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link AllergyIntolerance#contained() contained}
   *    .text(com.fhir.Narrative) // optional {@link AllergyIntolerance#text() text}
   *    .recorder(com.fhir.Reference) // optional {@link AllergyIntolerance#recorder() recorder}
   *    .implicitRules(com.fhir.uri) // optional {@link AllergyIntolerance#implicitRules() implicitRules}
   *    .recordedDate(com.fhir.dateTime) // optional {@link AllergyIntolerance#recordedDate() recordedDate}
   *    .asserter(com.fhir.Reference) // optional {@link AllergyIntolerance#asserter() asserter}
   *    .patient(com.fhir.Reference) // required {@link AllergyIntolerance#patient() patient}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link AllergyIntolerance#note() note}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance#extension() extension}
   *    .onsetPeriod(com.fhir.Period) // optional {@link AllergyIntolerance#onsetPeriod() onsetPeriod}
   *    .lastOccurrence(com.fhir.dateTime) // optional {@link AllergyIntolerance#lastOccurrence() lastOccurrence}
   *    .id(com.fhir.id) // optional {@link AllergyIntolerance#id() id}
   *    .criticality(com.fhir.AllergyintoleranceCriticality) // optional {@link AllergyIntolerance#criticality() criticality}
   *    .reaction(List&amp;lt;com.fhir.AllergyIntolerance_Reaction&amp;gt;) // optional {@link AllergyIntolerance#reaction() reaction}
   *    .onsetRange(com.fhir.Range) // optional {@link AllergyIntolerance#onsetRange() onsetRange}
   *    .onsetString(String) // optional {@link AllergyIntolerance#onsetString() onsetString}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance#modifierExtension() modifierExtension}
   *    .type(com.fhir.AllergyintoleranceType) // optional {@link AllergyIntolerance#type() type}
   *    .category(List&amp;lt;com.fhir.AllergyintoleranceCategoryItem&amp;gt;) // optional {@link AllergyIntolerance#category() category}
   *    .onsetAge(com.fhir.Age) // optional {@link AllergyIntolerance#onsetAge() onsetAge}
   *    .meta(com.fhir.Meta) // optional {@link AllergyIntolerance#meta() meta}
   *    .resourceType(String) // required {@link AllergyIntolerance#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link AllergyIntolerance#identifier() identifier}
   *    .verificationStatus(com.fhir.CodeableConcept) // optional {@link AllergyIntolerance#verificationStatus() verificationStatus}
   *    .clinicalStatus(com.fhir.CodeableConcept) // optional {@link AllergyIntolerance#clinicalStatus() clinicalStatus}
   *    .code(com.fhir.CodeableConcept) // optional {@link AllergyIntolerance#code() code}
   *    .onsetDateTime(String) // optional {@link AllergyIntolerance#onsetDateTime() onsetDateTime}
   *    .encounter(com.fhir.Reference) // optional {@link AllergyIntolerance#encounter() encounter}
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
  @org.immutables.value.Generated(from = "AllergyIntolerance", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PatientBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PATIENT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_RECORDER = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_RECORDED_DATE = 0x20L;
    private static final long OPT_BIT_ASSERTER = 0x40L;
    private static final long OPT_BIT_NOTE = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_ONSET_PERIOD = 0x200L;
    private static final long OPT_BIT_LAST_OCCURRENCE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_CRITICALITY = 0x1000L;
    private static final long OPT_BIT_REACTION = 0x2000L;
    private static final long OPT_BIT_ONSET_RANGE = 0x4000L;
    private static final long OPT_BIT_ONSET_STRING = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_TYPE = 0x20000L;
    private static final long OPT_BIT_CATEGORY = 0x40000L;
    private static final long OPT_BIT_ONSET_AGE = 0x80000L;
    private static final long OPT_BIT_META = 0x100000L;
    private static final long OPT_BIT_IDENTIFIER = 0x200000L;
    private static final long OPT_BIT_VERIFICATION_STATUS = 0x400000L;
    private static final long OPT_BIT_CLINICAL_STATUS = 0x800000L;
    private static final long OPT_BIT_CODE = 0x1000000L;
    private static final long OPT_BIT_ONSET_DATE_TIME = 0x2000000L;
    private static final long OPT_BIT_ENCOUNTER = 0x4000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference recorder;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.dateTime recordedDate;
    private @javax.annotation.Nullable com.fhir.Reference asserter;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Period onsetPeriod;
    private @javax.annotation.Nullable com.fhir.dateTime lastOccurrence;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.AllergyintoleranceCriticality criticality;
    private @javax.annotation.Nullable java.util.List<com.fhir.AllergyIntolerance_Reaction> reaction;
    private @javax.annotation.Nullable com.fhir.Range onsetRange;
    private @javax.annotation.Nullable java.lang.String onsetString;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.AllergyintoleranceType type;
    private @javax.annotation.Nullable java.util.List<com.fhir.AllergyintoleranceCategoryItem> category;
    private @javax.annotation.Nullable com.fhir.Age onsetAge;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept verificationStatus;
    private @javax.annotation.Nullable com.fhir.CodeableConcept clinicalStatus;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.lang.String onsetDateTime;
    private @javax.annotation.Nullable com.fhir.Reference encounter;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
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
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
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
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
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
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
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
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
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
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
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
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
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
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
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
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    public final Builder asserter(com.fhir.Reference asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = java.util.Objects.requireNonNull(asserter, "asserter");
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("asserter")
    public final Builder asserter(java.util.Optional<? extends com.fhir.Reference> asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = asserter.orElse(null);
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the value for the {@link AllergyIntolerance#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetPeriod(com.fhir.Period onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = java.util.Objects.requireNonNull(onsetPeriod, "onsetPeriod");
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsetPeriod")
    public final Builder onsetPeriod(java.util.Optional<? extends com.fhir.Period> onsetPeriod) {
      checkNotIsSet(onsetPeriodIsSet(), "onsetPeriod");
      this.onsetPeriod = onsetPeriod.orElse(null);
      optBits |= OPT_BIT_ONSET_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastOccurrence(com.fhir.dateTime lastOccurrence) {
      checkNotIsSet(lastOccurrenceIsSet(), "lastOccurrence");
      this.lastOccurrence = java.util.Objects.requireNonNull(lastOccurrence, "lastOccurrence");
      optBits |= OPT_BIT_LAST_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastOccurrence")
    public final Builder lastOccurrence(java.util.Optional<? extends com.fhir.dateTime> lastOccurrence) {
      checkNotIsSet(lastOccurrenceIsSet(), "lastOccurrence");
      this.lastOccurrence = lastOccurrence.orElse(null);
      optBits |= OPT_BIT_LAST_OCCURRENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
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
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
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
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for chained invocation
     */
    public final Builder criticality(com.fhir.AllergyintoleranceCriticality criticality) {
      checkNotIsSet(criticalityIsSet(), "criticality");
      this.criticality = java.util.Objects.requireNonNull(criticality, "criticality");
      optBits |= OPT_BIT_CRITICALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("criticality")
    public final Builder criticality(java.util.Optional<? extends com.fhir.AllergyintoleranceCriticality> criticality) {
      checkNotIsSet(criticalityIsSet(), "criticality");
      this.criticality = criticality.orElse(null);
      optBits |= OPT_BIT_CRITICALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder reaction(java.util.List<com.fhir.AllergyIntolerance_Reaction> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = java.util.Objects.requireNonNull(reaction, "reaction");
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reaction")
    public final Builder reaction(java.util.Optional<? extends java.util.List<com.fhir.AllergyIntolerance_Reaction>> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = reaction.orElse(null);
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetRange(com.fhir.Range onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = java.util.Objects.requireNonNull(onsetRange, "onsetRange");
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsetRange")
    public final Builder onsetRange(java.util.Optional<? extends com.fhir.Range> onsetRange) {
      checkNotIsSet(onsetRangeIsSet(), "onsetRange");
      this.onsetRange = onsetRange.orElse(null);
      optBits |= OPT_BIT_ONSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetString(java.lang.String onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = java.util.Objects.requireNonNull(onsetString, "onsetString");
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsetString")
    public final Builder onsetString(java.util.Optional<java.lang.String> onsetString) {
      checkNotIsSet(onsetStringIsSet(), "onsetString");
      this.onsetString = onsetString.orElse(null);
      optBits |= OPT_BIT_ONSET_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.AllergyintoleranceType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.AllergyintoleranceType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.AllergyintoleranceCategoryItem> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.AllergyintoleranceCategoryItem>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetAge(com.fhir.Age onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = java.util.Objects.requireNonNull(onsetAge, "onsetAge");
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsetAge")
    public final Builder onsetAge(java.util.Optional<? extends com.fhir.Age> onsetAge) {
      checkNotIsSet(onsetAgeIsSet(), "onsetAge");
      this.onsetAge = onsetAge.orElse(null);
      optBits |= OPT_BIT_ONSET_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
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
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
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
     * Initializes the value for the {@link AllergyIntolerance#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder verificationStatus(com.fhir.CodeableConcept verificationStatus) {
      checkNotIsSet(verificationStatusIsSet(), "verificationStatus");
      this.verificationStatus = java.util.Objects.requireNonNull(verificationStatus, "verificationStatus");
      optBits |= OPT_BIT_VERIFICATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verificationStatus")
    public final Builder verificationStatus(java.util.Optional<? extends com.fhir.CodeableConcept> verificationStatus) {
      checkNotIsSet(verificationStatusIsSet(), "verificationStatus");
      this.verificationStatus = verificationStatus.orElse(null);
      optBits |= OPT_BIT_VERIFICATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder clinicalStatus(com.fhir.CodeableConcept clinicalStatus) {
      checkNotIsSet(clinicalStatusIsSet(), "clinicalStatus");
      this.clinicalStatus = java.util.Objects.requireNonNull(clinicalStatus, "clinicalStatus");
      optBits |= OPT_BIT_CLINICAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clinicalStatus")
    public final Builder clinicalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> clinicalStatus) {
      checkNotIsSet(clinicalStatusIsSet(), "clinicalStatus");
      this.clinicalStatus = clinicalStatus.orElse(null);
      optBits |= OPT_BIT_CLINICAL_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder onsetDateTime(java.lang.String onsetDateTime) {
      checkNotIsSet(onsetDateTimeIsSet(), "onsetDateTime");
      this.onsetDateTime = java.util.Objects.requireNonNull(onsetDateTime, "onsetDateTime");
      optBits |= OPT_BIT_ONSET_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onsetDateTime")
    public final Builder onsetDateTime(java.util.Optional<java.lang.String> onsetDateTime) {
      checkNotIsSet(onsetDateTimeIsSet(), "onsetDateTime");
      this.onsetDateTime = onsetDateTime.orElse(null);
      optBits |= OPT_BIT_ONSET_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
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
     * Builds a new {@link AllergyIntolerance AllergyIntolerance}.
     * @return An immutable instance of AllergyIntolerance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.AllergyIntolerance build() {
      checkRequiredAttributes();
      return new ImmutableAllergyIntolerance(
          language,
          contained,
          text,
          recorder,
          implicitRules,
          recordedDate,
          asserter,
          patient,
          note,
          extension,
          onsetPeriod,
          lastOccurrence,
          id,
          criticality,
          reaction,
          onsetRange,
          onsetString,
          modifierExtension,
          type,
          category,
          onsetAge,
          meta,
          resourceType,
          identifier,
          verificationStatus,
          clinicalStatus,
          code,
          onsetDateTime,
          encounter);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean recordedDateIsSet() {
      return (optBits & OPT_BIT_RECORDED_DATE) != 0;
    }

    private boolean asserterIsSet() {
      return (optBits & OPT_BIT_ASSERTER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean onsetPeriodIsSet() {
      return (optBits & OPT_BIT_ONSET_PERIOD) != 0;
    }

    private boolean lastOccurrenceIsSet() {
      return (optBits & OPT_BIT_LAST_OCCURRENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean criticalityIsSet() {
      return (optBits & OPT_BIT_CRITICALITY) != 0;
    }

    private boolean reactionIsSet() {
      return (optBits & OPT_BIT_REACTION) != 0;
    }

    private boolean onsetRangeIsSet() {
      return (optBits & OPT_BIT_ONSET_RANGE) != 0;
    }

    private boolean onsetStringIsSet() {
      return (optBits & OPT_BIT_ONSET_STRING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean onsetAgeIsSet() {
      return (optBits & OPT_BIT_ONSET_AGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean verificationStatusIsSet() {
      return (optBits & OPT_BIT_VERIFICATION_STATUS) != 0;
    }

    private boolean clinicalStatusIsSet() {
      return (optBits & OPT_BIT_CLINICAL_STATUS) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean onsetDateTimeIsSet() {
      return (optBits & OPT_BIT_ONSET_DATE_TIME) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of AllergyIntolerance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!patientIsSet()) attributes.add("patient");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build AllergyIntolerance, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "AllergyIntolerance", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link AllergyIntolerance#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "AllergyIntolerance", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link AllergyIntolerance#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "AllergyIntolerance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link AllergyIntolerance#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link AllergyIntolerance#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link AllergyIntolerance#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(com.fhir.Reference recorder);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(java.util.Optional<? extends com.fhir.Reference> recorder);

    /**
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link AllergyIntolerance#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedDate(com.fhir.dateTime recordedDate);

    /**
     * Initializes the optional value {@link AllergyIntolerance#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedDate(java.util.Optional<? extends com.fhir.dateTime> recordedDate);

    /**
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asserter(com.fhir.Reference asserter);

    /**
     * Initializes the optional value {@link AllergyIntolerance#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asserter(java.util.Optional<? extends com.fhir.Reference> asserter);

    /**
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link AllergyIntolerance#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetPeriod(com.fhir.Period onsetPeriod);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetPeriod(java.util.Optional<? extends com.fhir.Period> onsetPeriod);

    /**
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastOccurrence(com.fhir.dateTime lastOccurrence);

    /**
     * Initializes the optional value {@link AllergyIntolerance#lastOccurrence() lastOccurrence} to lastOccurrence.
     * @param lastOccurrence The value for lastOccurrence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastOccurrence(java.util.Optional<? extends com.fhir.dateTime> lastOccurrence);

    /**
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link AllergyIntolerance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal criticality(com.fhir.AllergyintoleranceCriticality criticality);

    /**
     * Initializes the optional value {@link AllergyIntolerance#criticality() criticality} to criticality.
     * @param criticality The value for criticality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal criticality(java.util.Optional<? extends com.fhir.AllergyintoleranceCriticality> criticality);

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reaction(java.util.List<com.fhir.AllergyIntolerance_Reaction> reaction);

    /**
     * Initializes the optional value {@link AllergyIntolerance#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reaction(java.util.Optional<? extends java.util.List<com.fhir.AllergyIntolerance_Reaction>> reaction);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetRange(com.fhir.Range onsetRange);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetRange(java.util.Optional<? extends com.fhir.Range> onsetRange);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetString(java.lang.String onsetString);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetString(java.util.Optional<java.lang.String> onsetString);

    /**
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.AllergyintoleranceType type);

    /**
     * Initializes the optional value {@link AllergyIntolerance#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.AllergyintoleranceType> type);

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.AllergyintoleranceCategoryItem> category);

    /**
     * Initializes the optional value {@link AllergyIntolerance#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.AllergyintoleranceCategoryItem>> category);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetAge(com.fhir.Age onsetAge);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetAge(java.util.Optional<? extends com.fhir.Age> onsetAge);

    /**
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link AllergyIntolerance#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link AllergyIntolerance#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal verificationStatus(com.fhir.CodeableConcept verificationStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal verificationStatus(java.util.Optional<? extends com.fhir.CodeableConcept> verificationStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal clinicalStatus(com.fhir.CodeableConcept clinicalStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal clinicalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> clinicalStatus);

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link AllergyIntolerance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetDateTime(java.lang.String onsetDateTime);

    /**
     * Initializes the optional value {@link AllergyIntolerance#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetDateTime(java.util.Optional<java.lang.String> onsetDateTime);

    /**
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link AllergyIntolerance#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Builds a new {@link AllergyIntolerance AllergyIntolerance}.
     * @return An immutable instance of AllergyIntolerance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AllergyIntolerance build();
  }
}
