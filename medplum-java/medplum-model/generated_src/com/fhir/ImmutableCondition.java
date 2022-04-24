//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Condition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCondition.builder()}.
 */
@org.immutables.value.Generated(from = "Condition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCondition implements com.fhir.Condition {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Condition_Stage> stage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept severity;
  private final @javax.annotation.Nullable java.lang.String onsetString;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String abatementDateTime;
  private final @javax.annotation.Nullable com.fhir.Range abatementRange;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Reference asserter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable com.fhir.Age onsetAge;
  private final @javax.annotation.Nullable com.fhir.Reference recorder;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Range onsetRange;
  private final @javax.annotation.Nullable java.lang.String onsetDateTime;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.String abatementString;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept clinicalStatus;
  private final @javax.annotation.Nullable com.fhir.Age abatementAge;
  private final @javax.annotation.Nullable com.fhir.Period onsetPeriod;
  private final @javax.annotation.Nullable com.fhir.Period abatementPeriod;
  private final @javax.annotation.Nullable com.fhir.dateTime recordedDate;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept verificationStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Condition_Evidence> evidence;

  private ImmutableCondition(
      @javax.annotation.Nullable java.util.List<com.fhir.Condition_Stage> stage,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept severity,
      @javax.annotation.Nullable java.lang.String onsetString,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String abatementDateTime,
      @javax.annotation.Nullable com.fhir.Range abatementRange,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Reference asserter,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable com.fhir.Age onsetAge,
      @javax.annotation.Nullable com.fhir.Reference recorder,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Range onsetRange,
      @javax.annotation.Nullable java.lang.String onsetDateTime,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.String abatementString,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.CodeableConcept clinicalStatus,
      @javax.annotation.Nullable com.fhir.Age abatementAge,
      @javax.annotation.Nullable com.fhir.Period onsetPeriod,
      @javax.annotation.Nullable com.fhir.Period abatementPeriod,
      @javax.annotation.Nullable com.fhir.dateTime recordedDate,
      @javax.annotation.Nullable com.fhir.CodeableConcept verificationStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.Condition_Evidence> evidence) {
    this.stage = stage;
    this.extension = extension;
    this.severity = severity;
    this.onsetString = onsetString;
    this.code = code;
    this.subject = subject;
    this.encounter = encounter;
    this.id = id;
    this.bodySite = bodySite;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.identifier = identifier;
    this.text = text;
    this.abatementDateTime = abatementDateTime;
    this.abatementRange = abatementRange;
    this.language = language;
    this.asserter = asserter;
    this.note = note;
    this.category = category;
    this.onsetAge = onsetAge;
    this.recorder = recorder;
    this.modifierExtension = modifierExtension;
    this.onsetRange = onsetRange;
    this.onsetDateTime = onsetDateTime;
    this.resourceType = resourceType;
    this.abatementString = abatementString;
    this.contained = contained;
    this.clinicalStatus = clinicalStatus;
    this.abatementAge = abatementAge;
    this.onsetPeriod = onsetPeriod;
    this.abatementPeriod = abatementPeriod;
    this.recordedDate = recordedDate;
    this.verificationStatus = verificationStatus;
    this.evidence = evidence;
  }

  /**
   * @return The value of the {@code stage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("stage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Condition_Stage>> stage() {
    return java.util.Optional.ofNullable(stage);
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
   * @return The value of the {@code severity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("severity")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> severity() {
    return java.util.Optional.ofNullable(severity);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code abatementDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abatementDateTime")
  @Override
  public java.util.Optional<java.lang.String> abatementDateTime() {
    return java.util.Optional.ofNullable(abatementDateTime);
  }

  /**
   * @return The value of the {@code abatementRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abatementRange")
  @Override
  public java.util.Optional<com.fhir.Range> abatementRange() {
    return java.util.Optional.ofNullable(abatementRange);
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
   * @return The value of the {@code asserter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("asserter")
  @Override
  public java.util.Optional<com.fhir.Reference> asserter() {
    return java.util.Optional.ofNullable(asserter);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
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
   * @return The value of the {@code recorder} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recorder")
  @Override
  public java.util.Optional<com.fhir.Reference> recorder() {
    return java.util.Optional.ofNullable(recorder);
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
   * @return The value of the {@code onsetRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onsetRange")
  @Override
  public java.util.Optional<com.fhir.Range> onsetRange() {
    return java.util.Optional.ofNullable(onsetRange);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code abatementString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abatementString")
  @Override
  public java.util.Optional<java.lang.String> abatementString() {
    return java.util.Optional.ofNullable(abatementString);
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
   * @return The value of the {@code clinicalStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("clinicalStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> clinicalStatus() {
    return java.util.Optional.ofNullable(clinicalStatus);
  }

  /**
   * @return The value of the {@code abatementAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abatementAge")
  @Override
  public java.util.Optional<com.fhir.Age> abatementAge() {
    return java.util.Optional.ofNullable(abatementAge);
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
   * @return The value of the {@code abatementPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("abatementPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> abatementPeriod() {
    return java.util.Optional.ofNullable(abatementPeriod);
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
   * @return The value of the {@code verificationStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("verificationStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> verificationStatus() {
    return java.util.Optional.ofNullable(verificationStatus);
  }

  /**
   * @return The value of the {@code evidence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("evidence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Condition_Evidence>> evidence() {
    return java.util.Optional.ofNullable(evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#stage() stage} attribute.
   * @param value The value for stage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withStage(java.util.List<com.fhir.Condition_Stage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Condition_Stage> newValue = java.util.Objects.requireNonNull(value, "stage");
    if (this.stage == newValue) return this;
    return new ImmutableCondition(
        newValue,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#stage() stage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withStage(java.util.Optional<? extends java.util.List<com.fhir.Condition_Stage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Condition_Stage> value = optional.orElse(null);
    if (this.stage == value) return this;
    return new ImmutableCondition(
        value,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        newValue,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCondition(
        this.stage,
        value,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withSeverity(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        newValue,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withSeverity(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        value,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetString() onsetString} attribute.
   * @param value The value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "onsetString");
    if (java.util.Objects.equals(this.onsetString, newValue)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        newValue,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetString() onsetString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.onsetString, value)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        value,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        newValue,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        value,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Condition#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCondition withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        newValue,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        newValue,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        value,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        newValue,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        value,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withBodySite(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        newValue,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withBodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        value,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        newValue,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        value,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        newValue,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        value,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        newValue,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        value,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        newValue,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        value,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementDateTime() abatementDateTime} attribute.
   * @param value The value for abatementDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "abatementDateTime");
    if (java.util.Objects.equals(this.abatementDateTime, newValue)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        newValue,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementDateTime() abatementDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.abatementDateTime, value)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        value,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementRange() abatementRange} attribute.
   * @param value The value for abatementRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "abatementRange");
    if (this.abatementRange == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        newValue,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementRange() abatementRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAbatementRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.abatementRange == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        value,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        newValue,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        value,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#asserter() asserter} attribute.
   * @param value The value for asserter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAsserter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "asserter");
    if (this.asserter == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        newValue,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#asserter() asserter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asserter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAsserter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.asserter == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        value,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        newValue,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        value,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        newValue,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        value,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetAge() onsetAge} attribute.
   * @param value The value for onsetAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "onsetAge");
    if (this.onsetAge == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        newValue,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetAge() onsetAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withOnsetAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.onsetAge == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        value,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withRecorder(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        newValue,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withRecorder(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        value,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        newValue,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        value,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetRange() onsetRange} attribute.
   * @param value The value for onsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "onsetRange");
    if (this.onsetRange == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        newValue,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetRange() onsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withOnsetRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.onsetRange == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        value,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetDateTime() onsetDateTime} attribute.
   * @param value The value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "onsetDateTime");
    if (java.util.Objects.equals(this.onsetDateTime, newValue)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        newValue,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetDateTime() onsetDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.onsetDateTime, value)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        value,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Condition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCondition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        newValue,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementString() abatementString} attribute.
   * @param value The value for abatementString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "abatementString");
    if (java.util.Objects.equals(this.abatementString, newValue)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        newValue,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementString() abatementString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.abatementString, value)) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        value,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        newValue,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        value,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#clinicalStatus() clinicalStatus} attribute.
   * @param value The value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withClinicalStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "clinicalStatus");
    if (this.clinicalStatus == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        newValue,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#clinicalStatus() clinicalStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for clinicalStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withClinicalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.clinicalStatus == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        value,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementAge() abatementAge} attribute.
   * @param value The value for abatementAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "abatementAge");
    if (this.abatementAge == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        newValue,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementAge() abatementAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAbatementAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.abatementAge == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        value,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#onsetPeriod() onsetPeriod} attribute.
   * @param value The value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withOnsetPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "onsetPeriod");
    if (this.onsetPeriod == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        newValue,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#onsetPeriod() onsetPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onsetPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withOnsetPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.onsetPeriod == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        value,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#abatementPeriod() abatementPeriod} attribute.
   * @param value The value for abatementPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withAbatementPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "abatementPeriod");
    if (this.abatementPeriod == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        newValue,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#abatementPeriod() abatementPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abatementPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withAbatementPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.abatementPeriod == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        value,
        this.recordedDate,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#recordedDate() recordedDate} attribute.
   * @param value The value for recordedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withRecordedDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "recordedDate");
    if (this.recordedDate == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        newValue,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#recordedDate() recordedDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recordedDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withRecordedDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.recordedDate == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        value,
        this.verificationStatus,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#verificationStatus() verificationStatus} attribute.
   * @param value The value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withVerificationStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "verificationStatus");
    if (this.verificationStatus == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        newValue,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#verificationStatus() verificationStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verificationStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withVerificationStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.verificationStatus == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        value,
        this.evidence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition#evidence() evidence} attribute.
   * @param value The value for evidence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition withEvidence(java.util.List<com.fhir.Condition_Evidence> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Condition_Evidence> newValue = java.util.Objects.requireNonNull(value, "evidence");
    if (this.evidence == newValue) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition#evidence() evidence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evidence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition withEvidence(java.util.Optional<? extends java.util.List<com.fhir.Condition_Evidence>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Condition_Evidence> value = optional.orElse(null);
    if (this.evidence == value) return this;
    return new ImmutableCondition(
        this.stage,
        this.extension,
        this.severity,
        this.onsetString,
        this.code,
        this.subject,
        this.encounter,
        this.id,
        this.bodySite,
        this.implicitRules,
        this.meta,
        this.identifier,
        this.text,
        this.abatementDateTime,
        this.abatementRange,
        this.language,
        this.asserter,
        this.note,
        this.category,
        this.onsetAge,
        this.recorder,
        this.modifierExtension,
        this.onsetRange,
        this.onsetDateTime,
        this.resourceType,
        this.abatementString,
        this.contained,
        this.clinicalStatus,
        this.abatementAge,
        this.onsetPeriod,
        this.abatementPeriod,
        this.recordedDate,
        this.verificationStatus,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCondition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCondition
        && equalTo((ImmutableCondition) another);
  }

  private boolean equalTo(ImmutableCondition another) {
    return java.util.Objects.equals(stage, another.stage)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(severity, another.severity)
        && java.util.Objects.equals(onsetString, another.onsetString)
        && java.util.Objects.equals(code, another.code)
        && subject.equals(another.subject)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(abatementDateTime, another.abatementDateTime)
        && java.util.Objects.equals(abatementRange, another.abatementRange)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(asserter, another.asserter)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(onsetAge, another.onsetAge)
        && java.util.Objects.equals(recorder, another.recorder)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(onsetRange, another.onsetRange)
        && java.util.Objects.equals(onsetDateTime, another.onsetDateTime)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(abatementString, another.abatementString)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(clinicalStatus, another.clinicalStatus)
        && java.util.Objects.equals(abatementAge, another.abatementAge)
        && java.util.Objects.equals(onsetPeriod, another.onsetPeriod)
        && java.util.Objects.equals(abatementPeriod, another.abatementPeriod)
        && java.util.Objects.equals(recordedDate, another.recordedDate)
        && java.util.Objects.equals(verificationStatus, another.verificationStatus)
        && java.util.Objects.equals(evidence, another.evidence);
  }

  /**
   * Computes a hash code from attributes: {@code stage}, {@code extension}, {@code severity}, {@code onsetString}, {@code code}, {@code subject}, {@code encounter}, {@code id}, {@code bodySite}, {@code implicitRules}, {@code meta}, {@code identifier}, {@code text}, {@code abatementDateTime}, {@code abatementRange}, {@code language}, {@code asserter}, {@code note}, {@code category}, {@code onsetAge}, {@code recorder}, {@code modifierExtension}, {@code onsetRange}, {@code onsetDateTime}, {@code resourceType}, {@code abatementString}, {@code contained}, {@code clinicalStatus}, {@code abatementAge}, {@code onsetPeriod}, {@code abatementPeriod}, {@code recordedDate}, {@code verificationStatus}, {@code evidence}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(stage);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(severity);
    h += (h << 5) + java.util.Objects.hashCode(onsetString);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(abatementDateTime);
    h += (h << 5) + java.util.Objects.hashCode(abatementRange);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(asserter);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(onsetAge);
    h += (h << 5) + java.util.Objects.hashCode(recorder);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(onsetRange);
    h += (h << 5) + java.util.Objects.hashCode(onsetDateTime);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(abatementString);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(clinicalStatus);
    h += (h << 5) + java.util.Objects.hashCode(abatementAge);
    h += (h << 5) + java.util.Objects.hashCode(onsetPeriod);
    h += (h << 5) + java.util.Objects.hashCode(abatementPeriod);
    h += (h << 5) + java.util.Objects.hashCode(recordedDate);
    h += (h << 5) + java.util.Objects.hashCode(verificationStatus);
    h += (h << 5) + java.util.Objects.hashCode(evidence);
    return h;
  }

  /**
   * Prints the immutable value {@code Condition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Condition{");
    if (stage != null) {
      builder.append("stage=").append(stage);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (severity != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (onsetString != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("onsetString=").append(onsetString);
    }
    if (code != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("subject=").append(subject);
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (abatementDateTime != null) {
      builder.append(", ");
      builder.append("abatementDateTime=").append(abatementDateTime);
    }
    if (abatementRange != null) {
      builder.append(", ");
      builder.append("abatementRange=").append(abatementRange);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (asserter != null) {
      builder.append(", ");
      builder.append("asserter=").append(asserter);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (onsetAge != null) {
      builder.append(", ");
      builder.append("onsetAge=").append(onsetAge);
    }
    if (recorder != null) {
      builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (onsetRange != null) {
      builder.append(", ");
      builder.append("onsetRange=").append(onsetRange);
    }
    if (onsetDateTime != null) {
      builder.append(", ");
      builder.append("onsetDateTime=").append(onsetDateTime);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (abatementString != null) {
      builder.append(", ");
      builder.append("abatementString=").append(abatementString);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (clinicalStatus != null) {
      builder.append(", ");
      builder.append("clinicalStatus=").append(clinicalStatus);
    }
    if (abatementAge != null) {
      builder.append(", ");
      builder.append("abatementAge=").append(abatementAge);
    }
    if (onsetPeriod != null) {
      builder.append(", ");
      builder.append("onsetPeriod=").append(onsetPeriod);
    }
    if (abatementPeriod != null) {
      builder.append(", ");
      builder.append("abatementPeriod=").append(abatementPeriod);
    }
    if (recordedDate != null) {
      builder.append(", ");
      builder.append("recordedDate=").append(recordedDate);
    }
    if (verificationStatus != null) {
      builder.append(", ");
      builder.append("verificationStatus=").append(verificationStatus);
    }
    if (evidence != null) {
      builder.append(", ");
      builder.append("evidence=").append(evidence);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Condition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Condition {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Condition_Stage>> stage = java.util.Optional.empty();
    boolean stageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> severity = java.util.Optional.empty();
    boolean severityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> onsetString = java.util.Optional.empty();
    boolean onsetStringIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> abatementDateTime = java.util.Optional.empty();
    boolean abatementDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> abatementRange = java.util.Optional.empty();
    boolean abatementRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> asserter = java.util.Optional.empty();
    boolean asserterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> onsetAge = java.util.Optional.empty();
    boolean onsetAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> recorder = java.util.Optional.empty();
    boolean recorderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> onsetRange = java.util.Optional.empty();
    boolean onsetRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> onsetDateTime = java.util.Optional.empty();
    boolean onsetDateTimeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> abatementString = java.util.Optional.empty();
    boolean abatementStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> clinicalStatus = java.util.Optional.empty();
    boolean clinicalStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> abatementAge = java.util.Optional.empty();
    boolean abatementAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> onsetPeriod = java.util.Optional.empty();
    boolean onsetPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> abatementPeriod = java.util.Optional.empty();
    boolean abatementPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> recordedDate = java.util.Optional.empty();
    boolean recordedDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> verificationStatus = java.util.Optional.empty();
    boolean verificationStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Condition_Evidence>> evidence = java.util.Optional.empty();
    boolean evidenceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("stage")
    public void setStage(java.util.Optional<java.util.List<com.fhir.Condition_Stage>> stage) {
      this.stage = stage;
      this.stageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public void setSeverity(java.util.Optional<com.fhir.CodeableConcept> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetString")
    public void setOnsetString(java.util.Optional<java.lang.String> onsetString) {
      this.onsetString = onsetString;
      this.onsetStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abatementDateTime")
    public void setAbatementDateTime(java.util.Optional<java.lang.String> abatementDateTime) {
      this.abatementDateTime = abatementDateTime;
      this.abatementDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abatementRange")
    public void setAbatementRange(java.util.Optional<com.fhir.Range> abatementRange) {
      this.abatementRange = abatementRange;
      this.abatementRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("asserter")
    public void setAsserter(java.util.Optional<com.fhir.Reference> asserter) {
      this.asserter = asserter;
      this.asserterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetAge")
    public void setOnsetAge(java.util.Optional<com.fhir.Age> onsetAge) {
      this.onsetAge = onsetAge;
      this.onsetAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorder")
    public void setRecorder(java.util.Optional<com.fhir.Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetRange")
    public void setOnsetRange(java.util.Optional<com.fhir.Range> onsetRange) {
      this.onsetRange = onsetRange;
      this.onsetRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetDateTime")
    public void setOnsetDateTime(java.util.Optional<java.lang.String> onsetDateTime) {
      this.onsetDateTime = onsetDateTime;
      this.onsetDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abatementString")
    public void setAbatementString(java.util.Optional<java.lang.String> abatementString) {
      this.abatementString = abatementString;
      this.abatementStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("clinicalStatus")
    public void setClinicalStatus(java.util.Optional<com.fhir.CodeableConcept> clinicalStatus) {
      this.clinicalStatus = clinicalStatus;
      this.clinicalStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abatementAge")
    public void setAbatementAge(java.util.Optional<com.fhir.Age> abatementAge) {
      this.abatementAge = abatementAge;
      this.abatementAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onsetPeriod")
    public void setOnsetPeriod(java.util.Optional<com.fhir.Period> onsetPeriod) {
      this.onsetPeriod = onsetPeriod;
      this.onsetPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("abatementPeriod")
    public void setAbatementPeriod(java.util.Optional<com.fhir.Period> abatementPeriod) {
      this.abatementPeriod = abatementPeriod;
      this.abatementPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recordedDate")
    public void setRecordedDate(java.util.Optional<com.fhir.dateTime> recordedDate) {
      this.recordedDate = recordedDate;
      this.recordedDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("verificationStatus")
    public void setVerificationStatus(java.util.Optional<com.fhir.CodeableConcept> verificationStatus) {
      this.verificationStatus = verificationStatus;
      this.verificationStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("evidence")
    public void setEvidence(java.util.Optional<java.util.List<com.fhir.Condition_Evidence>> evidence) {
      this.evidence = evidence;
      this.evidenceIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Condition_Stage>> stage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> severity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> onsetString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> abatementDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> abatementRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> asserter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> onsetAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> onsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> onsetDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> abatementString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> clinicalStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> abatementAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> onsetPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> abatementPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> recordedDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> verificationStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Condition_Evidence>> evidence() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCondition fromJson(Json json) {
    ImmutableCondition.Builder builder = ((ImmutableCondition.Builder) ImmutableCondition.builder());
    if (json.stageIsSet) {
      builder.stage(json.stage);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.onsetStringIsSet) {
      builder.onsetString(json.onsetString);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.abatementDateTimeIsSet) {
      builder.abatementDateTime(json.abatementDateTime);
    }
    if (json.abatementRangeIsSet) {
      builder.abatementRange(json.abatementRange);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.asserterIsSet) {
      builder.asserter(json.asserter);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.onsetAgeIsSet) {
      builder.onsetAge(json.onsetAge);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.onsetRangeIsSet) {
      builder.onsetRange(json.onsetRange);
    }
    if (json.onsetDateTimeIsSet) {
      builder.onsetDateTime(json.onsetDateTime);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.abatementStringIsSet) {
      builder.abatementString(json.abatementString);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.clinicalStatusIsSet) {
      builder.clinicalStatus(json.clinicalStatus);
    }
    if (json.abatementAgeIsSet) {
      builder.abatementAge(json.abatementAge);
    }
    if (json.onsetPeriodIsSet) {
      builder.onsetPeriod(json.onsetPeriod);
    }
    if (json.abatementPeriodIsSet) {
      builder.abatementPeriod(json.abatementPeriod);
    }
    if (json.recordedDateIsSet) {
      builder.recordedDate(json.recordedDate);
    }
    if (json.verificationStatusIsSet) {
      builder.verificationStatus(json.verificationStatus);
    }
    if (json.evidenceIsSet) {
      builder.evidence(json.evidence);
    }
    return (ImmutableCondition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Condition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Condition instance
   */
  public static Condition copyOf(Condition instance) {
    if (instance instanceof ImmutableCondition) {
      return (ImmutableCondition) instance;
    }
    return ((ImmutableCondition.Builder) ImmutableCondition.builder())
        .stage(instance.stage())
        .extension(instance.extension())
        .severity(instance.severity())
        .onsetString(instance.onsetString())
        .code(instance.code())
        .subject(instance.subject())
        .encounter(instance.encounter())
        .id(instance.id())
        .bodySite(instance.bodySite())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .text(instance.text())
        .abatementDateTime(instance.abatementDateTime())
        .abatementRange(instance.abatementRange())
        .language(instance.language())
        .asserter(instance.asserter())
        .note(instance.note())
        .category(instance.category())
        .onsetAge(instance.onsetAge())
        .recorder(instance.recorder())
        .modifierExtension(instance.modifierExtension())
        .onsetRange(instance.onsetRange())
        .onsetDateTime(instance.onsetDateTime())
        .resourceType(instance.resourceType())
        .abatementString(instance.abatementString())
        .contained(instance.contained())
        .clinicalStatus(instance.clinicalStatus())
        .abatementAge(instance.abatementAge())
        .onsetPeriod(instance.onsetPeriod())
        .abatementPeriod(instance.abatementPeriod())
        .recordedDate(instance.recordedDate())
        .verificationStatus(instance.verificationStatus())
        .evidence(instance.evidence())
        .build();
  }

  /**
   * Creates a builder for {@link Condition Condition}.
   * <pre>
   * ImmutableCondition.builder()
   *    .stage(List&amp;lt;com.fhir.Condition_Stage&amp;gt;) // optional {@link Condition#stage() stage}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Condition#extension() extension}
   *    .severity(com.fhir.CodeableConcept) // optional {@link Condition#severity() severity}
   *    .onsetString(String) // optional {@link Condition#onsetString() onsetString}
   *    .code(com.fhir.CodeableConcept) // optional {@link Condition#code() code}
   *    .subject(com.fhir.Reference) // required {@link Condition#subject() subject}
   *    .encounter(com.fhir.Reference) // optional {@link Condition#encounter() encounter}
   *    .id(com.fhir.id) // optional {@link Condition#id() id}
   *    .bodySite(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Condition#bodySite() bodySite}
   *    .implicitRules(com.fhir.uri) // optional {@link Condition#implicitRules() implicitRules}
   *    .meta(com.fhir.Meta) // optional {@link Condition#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Condition#identifier() identifier}
   *    .text(com.fhir.Narrative) // optional {@link Condition#text() text}
   *    .abatementDateTime(String) // optional {@link Condition#abatementDateTime() abatementDateTime}
   *    .abatementRange(com.fhir.Range) // optional {@link Condition#abatementRange() abatementRange}
   *    .language(com.fhir.code) // optional {@link Condition#language() language}
   *    .asserter(com.fhir.Reference) // optional {@link Condition#asserter() asserter}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Condition#note() note}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Condition#category() category}
   *    .onsetAge(com.fhir.Age) // optional {@link Condition#onsetAge() onsetAge}
   *    .recorder(com.fhir.Reference) // optional {@link Condition#recorder() recorder}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Condition#modifierExtension() modifierExtension}
   *    .onsetRange(com.fhir.Range) // optional {@link Condition#onsetRange() onsetRange}
   *    .onsetDateTime(String) // optional {@link Condition#onsetDateTime() onsetDateTime}
   *    .resourceType(String) // required {@link Condition#resourceType() resourceType}
   *    .abatementString(String) // optional {@link Condition#abatementString() abatementString}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Condition#contained() contained}
   *    .clinicalStatus(com.fhir.CodeableConcept) // optional {@link Condition#clinicalStatus() clinicalStatus}
   *    .abatementAge(com.fhir.Age) // optional {@link Condition#abatementAge() abatementAge}
   *    .onsetPeriod(com.fhir.Period) // optional {@link Condition#onsetPeriod() onsetPeriod}
   *    .abatementPeriod(com.fhir.Period) // optional {@link Condition#abatementPeriod() abatementPeriod}
   *    .recordedDate(com.fhir.dateTime) // optional {@link Condition#recordedDate() recordedDate}
   *    .verificationStatus(com.fhir.CodeableConcept) // optional {@link Condition#verificationStatus() verificationStatus}
   *    .evidence(List&amp;lt;com.fhir.Condition_Evidence&amp;gt;) // optional {@link Condition#evidence() evidence}
   *    .build();
   * </pre>
   * @return A new Condition builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableCondition.Builder();
  }

  /**
   * Builds instances of type {@link Condition Condition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Condition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_STAGE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_SEVERITY = 0x4L;
    private static final long OPT_BIT_ONSET_STRING = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_ENCOUNTER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_BODY_SITE = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_ABATEMENT_DATE_TIME = 0x1000L;
    private static final long OPT_BIT_ABATEMENT_RANGE = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_ASSERTER = 0x8000L;
    private static final long OPT_BIT_NOTE = 0x10000L;
    private static final long OPT_BIT_CATEGORY = 0x20000L;
    private static final long OPT_BIT_ONSET_AGE = 0x40000L;
    private static final long OPT_BIT_RECORDER = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private static final long OPT_BIT_ONSET_RANGE = 0x200000L;
    private static final long OPT_BIT_ONSET_DATE_TIME = 0x400000L;
    private static final long OPT_BIT_ABATEMENT_STRING = 0x800000L;
    private static final long OPT_BIT_CONTAINED = 0x1000000L;
    private static final long OPT_BIT_CLINICAL_STATUS = 0x2000000L;
    private static final long OPT_BIT_ABATEMENT_AGE = 0x4000000L;
    private static final long OPT_BIT_ONSET_PERIOD = 0x8000000L;
    private static final long OPT_BIT_ABATEMENT_PERIOD = 0x10000000L;
    private static final long OPT_BIT_RECORDED_DATE = 0x20000000L;
    private static final long OPT_BIT_VERIFICATION_STATUS = 0x40000000L;
    private static final long OPT_BIT_EVIDENCE = 0x80000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Condition_Stage> stage;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept severity;
    private @javax.annotation.Nullable java.lang.String onsetString;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String abatementDateTime;
    private @javax.annotation.Nullable com.fhir.Range abatementRange;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference asserter;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable com.fhir.Age onsetAge;
    private @javax.annotation.Nullable com.fhir.Reference recorder;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Range onsetRange;
    private @javax.annotation.Nullable java.lang.String onsetDateTime;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.String abatementString;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept clinicalStatus;
    private @javax.annotation.Nullable com.fhir.Age abatementAge;
    private @javax.annotation.Nullable com.fhir.Period onsetPeriod;
    private @javax.annotation.Nullable com.fhir.Period abatementPeriod;
    private @javax.annotation.Nullable com.fhir.dateTime recordedDate;
    private @javax.annotation.Nullable com.fhir.CodeableConcept verificationStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.Condition_Evidence> evidence;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for chained invocation
     */
    public final Builder stage(java.util.List<com.fhir.Condition_Stage> stage) {
      checkNotIsSet(stageIsSet(), "stage");
      this.stage = java.util.Objects.requireNonNull(stage, "stage");
      optBits |= OPT_BIT_STAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stage")
    public final Builder stage(java.util.Optional<? extends java.util.List<com.fhir.Condition_Stage>> stage) {
      checkNotIsSet(stageIsSet(), "stage");
      this.stage = stage.orElse(null);
      optBits |= OPT_BIT_STAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link Condition#severity() severity} to severity.
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
     * Initializes the optional value {@link Condition#severity() severity} to severity.
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
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
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
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
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
     * Initializes the optional value {@link Condition#code() code} to code.
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
     * Initializes the optional value {@link Condition#code() code} to code.
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
     * Initializes the value for the {@link Condition#subject() subject} attribute.
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
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Condition#id() id} to id.
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
     * Initializes the optional value {@link Condition#id() id} to id.
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
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(java.util.List<com.fhir.CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = java.util.Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public final Builder bodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Condition#meta() meta} to meta.
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
     * Initializes the optional value {@link Condition#meta() meta} to meta.
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
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Condition#text() text} to text.
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
     * Initializes the optional value {@link Condition#text() text} to text.
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
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementDateTime(java.lang.String abatementDateTime) {
      checkNotIsSet(abatementDateTimeIsSet(), "abatementDateTime");
      this.abatementDateTime = java.util.Objects.requireNonNull(abatementDateTime, "abatementDateTime");
      optBits |= OPT_BIT_ABATEMENT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abatementDateTime")
    public final Builder abatementDateTime(java.util.Optional<java.lang.String> abatementDateTime) {
      checkNotIsSet(abatementDateTimeIsSet(), "abatementDateTime");
      this.abatementDateTime = abatementDateTime.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementRange(com.fhir.Range abatementRange) {
      checkNotIsSet(abatementRangeIsSet(), "abatementRange");
      this.abatementRange = java.util.Objects.requireNonNull(abatementRange, "abatementRange");
      optBits |= OPT_BIT_ABATEMENT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abatementRange")
    public final Builder abatementRange(java.util.Optional<? extends com.fhir.Range> abatementRange) {
      checkNotIsSet(abatementRangeIsSet(), "abatementRange");
      this.abatementRange = abatementRange.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#language() language} to language.
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
     * Initializes the optional value {@link Condition#language() language} to language.
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
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
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
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
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
     * Initializes the optional value {@link Condition#note() note} to note.
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
     * Initializes the optional value {@link Condition#note() note} to note.
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
     * Initializes the optional value {@link Condition#category() category} to category.
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
     * Initializes the optional value {@link Condition#category() category} to category.
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
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
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
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
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
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
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
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
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
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
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
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
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
     * Initializes the value for the {@link Condition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementString(java.lang.String abatementString) {
      checkNotIsSet(abatementStringIsSet(), "abatementString");
      this.abatementString = java.util.Objects.requireNonNull(abatementString, "abatementString");
      optBits |= OPT_BIT_ABATEMENT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abatementString")
    public final Builder abatementString(java.util.Optional<java.lang.String> abatementString) {
      checkNotIsSet(abatementStringIsSet(), "abatementString");
      this.abatementString = abatementString.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#contained() contained} to contained.
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
     * Initializes the optional value {@link Condition#contained() contained} to contained.
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
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
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
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
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
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementAge(com.fhir.Age abatementAge) {
      checkNotIsSet(abatementAgeIsSet(), "abatementAge");
      this.abatementAge = java.util.Objects.requireNonNull(abatementAge, "abatementAge");
      optBits |= OPT_BIT_ABATEMENT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abatementAge")
    public final Builder abatementAge(java.util.Optional<? extends com.fhir.Age> abatementAge) {
      checkNotIsSet(abatementAgeIsSet(), "abatementAge");
      this.abatementAge = abatementAge.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
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
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
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
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder abatementPeriod(com.fhir.Period abatementPeriod) {
      checkNotIsSet(abatementPeriodIsSet(), "abatementPeriod");
      this.abatementPeriod = java.util.Objects.requireNonNull(abatementPeriod, "abatementPeriod");
      optBits |= OPT_BIT_ABATEMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abatementPeriod")
    public final Builder abatementPeriod(java.util.Optional<? extends com.fhir.Period> abatementPeriod) {
      checkNotIsSet(abatementPeriodIsSet(), "abatementPeriod");
      this.abatementPeriod = abatementPeriod.orElse(null);
      optBits |= OPT_BIT_ABATEMENT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
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
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
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
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
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
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
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
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    public final Builder evidence(java.util.List<com.fhir.Condition_Evidence> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = java.util.Objects.requireNonNull(evidence, "evidence");
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evidence")
    public final Builder evidence(java.util.Optional<? extends java.util.List<com.fhir.Condition_Evidence>> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = evidence.orElse(null);
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Builds a new {@link Condition Condition}.
     * @return An immutable instance of Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Condition build() {
      checkRequiredAttributes();
      return new ImmutableCondition(
          stage,
          extension,
          severity,
          onsetString,
          code,
          subject,
          encounter,
          id,
          bodySite,
          implicitRules,
          meta,
          identifier,
          text,
          abatementDateTime,
          abatementRange,
          language,
          asserter,
          note,
          category,
          onsetAge,
          recorder,
          modifierExtension,
          onsetRange,
          onsetDateTime,
          resourceType,
          abatementString,
          contained,
          clinicalStatus,
          abatementAge,
          onsetPeriod,
          abatementPeriod,
          recordedDate,
          verificationStatus,
          evidence);
    }

    private boolean stageIsSet() {
      return (optBits & OPT_BIT_STAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean onsetStringIsSet() {
      return (optBits & OPT_BIT_ONSET_STRING) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean abatementDateTimeIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_DATE_TIME) != 0;
    }

    private boolean abatementRangeIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_RANGE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean asserterIsSet() {
      return (optBits & OPT_BIT_ASSERTER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean onsetAgeIsSet() {
      return (optBits & OPT_BIT_ONSET_AGE) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean onsetRangeIsSet() {
      return (optBits & OPT_BIT_ONSET_RANGE) != 0;
    }

    private boolean onsetDateTimeIsSet() {
      return (optBits & OPT_BIT_ONSET_DATE_TIME) != 0;
    }

    private boolean abatementStringIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_STRING) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean clinicalStatusIsSet() {
      return (optBits & OPT_BIT_CLINICAL_STATUS) != 0;
    }

    private boolean abatementAgeIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_AGE) != 0;
    }

    private boolean onsetPeriodIsSet() {
      return (optBits & OPT_BIT_ONSET_PERIOD) != 0;
    }

    private boolean abatementPeriodIsSet() {
      return (optBits & OPT_BIT_ABATEMENT_PERIOD) != 0;
    }

    private boolean recordedDateIsSet() {
      return (optBits & OPT_BIT_RECORDED_DATE) != 0;
    }

    private boolean verificationStatusIsSet() {
      return (optBits & OPT_BIT_VERIFICATION_STATUS) != 0;
    }

    private boolean evidenceIsSet() {
      return (optBits & OPT_BIT_EVIDENCE) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Condition is strict, attribute is already set: ".concat(name));
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
      return "Cannot build Condition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Condition", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Condition#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "Condition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Condition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Condition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal stage(java.util.List<com.fhir.Condition_Stage> stage);

    /**
     * Initializes the optional value {@link Condition#stage() stage} to stage.
     * @param stage The value for stage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal stage(java.util.Optional<? extends java.util.List<com.fhir.Condition_Stage>> stage);

    /**
     * Initializes the optional value {@link Condition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Condition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Condition#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal severity(com.fhir.CodeableConcept severity);

    /**
     * Initializes the optional value {@link Condition#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal severity(java.util.Optional<? extends com.fhir.CodeableConcept> severity);

    /**
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetString(java.lang.String onsetString);

    /**
     * Initializes the optional value {@link Condition#onsetString() onsetString} to onsetString.
     * @param onsetString The value for onsetString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetString(java.util.Optional<java.lang.String> onsetString);

    /**
     * Initializes the optional value {@link Condition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link Condition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Condition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Condition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Condition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(java.util.List<com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Condition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Condition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Condition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Condition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Condition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Condition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Condition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementDateTime(java.lang.String abatementDateTime);

    /**
     * Initializes the optional value {@link Condition#abatementDateTime() abatementDateTime} to abatementDateTime.
     * @param abatementDateTime The value for abatementDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementDateTime(java.util.Optional<java.lang.String> abatementDateTime);

    /**
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementRange(com.fhir.Range abatementRange);

    /**
     * Initializes the optional value {@link Condition#abatementRange() abatementRange} to abatementRange.
     * @param abatementRange The value for abatementRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementRange(java.util.Optional<? extends com.fhir.Range> abatementRange);

    /**
     * Initializes the optional value {@link Condition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Condition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asserter(com.fhir.Reference asserter);

    /**
     * Initializes the optional value {@link Condition#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asserter(java.util.Optional<? extends com.fhir.Reference> asserter);

    /**
     * Initializes the optional value {@link Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Condition#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Condition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Condition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetAge(com.fhir.Age onsetAge);

    /**
     * Initializes the optional value {@link Condition#onsetAge() onsetAge} to onsetAge.
     * @param onsetAge The value for onsetAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetAge(java.util.Optional<? extends com.fhir.Age> onsetAge);

    /**
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(com.fhir.Reference recorder);

    /**
     * Initializes the optional value {@link Condition#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(java.util.Optional<? extends com.fhir.Reference> recorder);

    /**
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Condition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetRange(com.fhir.Range onsetRange);

    /**
     * Initializes the optional value {@link Condition#onsetRange() onsetRange} to onsetRange.
     * @param onsetRange The value for onsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetRange(java.util.Optional<? extends com.fhir.Range> onsetRange);

    /**
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetDateTime(java.lang.String onsetDateTime);

    /**
     * Initializes the optional value {@link Condition#onsetDateTime() onsetDateTime} to onsetDateTime.
     * @param onsetDateTime The value for onsetDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetDateTime(java.util.Optional<java.lang.String> onsetDateTime);

    /**
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementString(java.lang.String abatementString);

    /**
     * Initializes the optional value {@link Condition#abatementString() abatementString} to abatementString.
     * @param abatementString The value for abatementString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementString(java.util.Optional<java.lang.String> abatementString);

    /**
     * Initializes the optional value {@link Condition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Condition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal clinicalStatus(com.fhir.CodeableConcept clinicalStatus);

    /**
     * Initializes the optional value {@link Condition#clinicalStatus() clinicalStatus} to clinicalStatus.
     * @param clinicalStatus The value for clinicalStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal clinicalStatus(java.util.Optional<? extends com.fhir.CodeableConcept> clinicalStatus);

    /**
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementAge(com.fhir.Age abatementAge);

    /**
     * Initializes the optional value {@link Condition#abatementAge() abatementAge} to abatementAge.
     * @param abatementAge The value for abatementAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementAge(java.util.Optional<? extends com.fhir.Age> abatementAge);

    /**
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onsetPeriod(com.fhir.Period onsetPeriod);

    /**
     * Initializes the optional value {@link Condition#onsetPeriod() onsetPeriod} to onsetPeriod.
     * @param onsetPeriod The value for onsetPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onsetPeriod(java.util.Optional<? extends com.fhir.Period> onsetPeriod);

    /**
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abatementPeriod(com.fhir.Period abatementPeriod);

    /**
     * Initializes the optional value {@link Condition#abatementPeriod() abatementPeriod} to abatementPeriod.
     * @param abatementPeriod The value for abatementPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abatementPeriod(java.util.Optional<? extends com.fhir.Period> abatementPeriod);

    /**
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recordedDate(com.fhir.dateTime recordedDate);

    /**
     * Initializes the optional value {@link Condition#recordedDate() recordedDate} to recordedDate.
     * @param recordedDate The value for recordedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recordedDate(java.util.Optional<? extends com.fhir.dateTime> recordedDate);

    /**
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal verificationStatus(com.fhir.CodeableConcept verificationStatus);

    /**
     * Initializes the optional value {@link Condition#verificationStatus() verificationStatus} to verificationStatus.
     * @param verificationStatus The value for verificationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal verificationStatus(java.util.Optional<? extends com.fhir.CodeableConcept> verificationStatus);

    /**
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evidence(java.util.List<com.fhir.Condition_Evidence> evidence);

    /**
     * Initializes the optional value {@link Condition#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evidence(java.util.Optional<? extends java.util.List<com.fhir.Condition_Evidence>> evidence);

    /**
     * Builds a new {@link Condition Condition}.
     * @return An immutable instance of Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Condition build();
  }
}
