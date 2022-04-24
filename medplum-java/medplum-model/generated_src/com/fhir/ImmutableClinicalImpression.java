//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClinicalImpression}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClinicalImpression.builder()}.
 */
@org.immutables.value.Generated(from = "ClinicalImpression", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClinicalImpression implements com.fhir.ClinicalImpression {
  private final @javax.annotation.Nullable java.lang.String effectiveDateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Investigation> investigation;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference assessor;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> prognosisReference;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Reference previous;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String summary;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> prognosisCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> problem;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> protocol;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Finding> finding;
  private final @javax.annotation.Nullable com.fhir.id id;

  private ImmutableClinicalImpression(
      @javax.annotation.Nullable java.lang.String effectiveDateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Investigation> investigation,
      com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference assessor,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> prognosisReference,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Reference previous,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String summary,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> prognosisCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> problem,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> protocol,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Finding> finding,
      @javax.annotation.Nullable com.fhir.id id) {
    this.effectiveDateTime = effectiveDateTime;
    this.investigation = investigation;
    this.subject = subject;
    this.note = note;
    this.text = text;
    this.assessor = assessor;
    this.statusReason = statusReason;
    this.prognosisReference = prognosisReference;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.identifier = identifier;
    this.effectivePeriod = effectivePeriod;
    this.extension = extension;
    this.code = code;
    this.previous = previous;
    this.language = language;
    this.summary = summary;
    this.resourceType = resourceType;
    this.prognosisCodeableConcept = prognosisCodeableConcept;
    this.problem = problem;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.supportingInfo = supportingInfo;
    this.protocol = protocol;
    this.status = status;
    this.encounter = encounter;
    this.date = date;
    this.finding = finding;
    this.id = id;
  }

  /**
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
  @Override
  public java.util.Optional<java.lang.String> effectiveDateTime() {
    return java.util.Optional.ofNullable(effectiveDateTime);
  }

  /**
   * @return The value of the {@code investigation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("investigation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Investigation>> investigation() {
    return java.util.Optional.ofNullable(investigation);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code assessor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("assessor")
  @Override
  public java.util.Optional<com.fhir.Reference> assessor() {
    return java.util.Optional.ofNullable(assessor);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code prognosisReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prognosisReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> prognosisReference() {
    return java.util.Optional.ofNullable(prognosisReference);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code previous} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("previous")
  @Override
  public java.util.Optional<com.fhir.Reference> previous() {
    return java.util.Optional.ofNullable(previous);
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
   * @return The value of the {@code summary} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("summary")
  @Override
  public java.util.Optional<java.lang.String> summary() {
    return java.util.Optional.ofNullable(summary);
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
   * @return The value of the {@code prognosisCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prognosisCodeableConcept")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> prognosisCodeableConcept() {
    return java.util.Optional.ofNullable(prognosisCodeableConcept);
  }

  /**
   * @return The value of the {@code problem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("problem")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> problem() {
    return java.util.Optional.ofNullable(problem);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() {
    return java.util.Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code protocol} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("protocol")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> protocol() {
    return java.util.Optional.ofNullable(protocol);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code finding} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("finding")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Finding>> finding() {
    return java.util.Optional.ofNullable(finding);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEffectiveDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "effectiveDateTime");
    if (java.util.Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableClinicalImpression(
        newValue,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEffectiveDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableClinicalImpression(
        value,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#investigation() investigation} attribute.
   * @param value The value for investigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withInvestigation(java.util.List<com.fhir.ClinicalImpression_Investigation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Investigation> newValue = java.util.Objects.requireNonNull(value, "investigation");
    if (this.investigation == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        newValue,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#investigation() investigation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for investigation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withInvestigation(java.util.Optional<? extends java.util.List<com.fhir.ClinicalImpression_Investigation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Investigation> value = optional.orElse(null);
    if (this.investigation == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        value,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClinicalImpression#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClinicalImpression withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        newValue,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        newValue,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        value,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        newValue,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        value,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#assessor() assessor} attribute.
   * @param value The value for assessor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withAssessor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "assessor");
    if (this.assessor == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        newValue,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#assessor() assessor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assessor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withAssessor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.assessor == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        value,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        newValue,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        value,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#prognosisReference() prognosisReference} attribute.
   * @param value The value for prognosisReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withPrognosisReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "prognosisReference");
    if (this.prognosisReference == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        newValue,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#prognosisReference() prognosisReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prognosisReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withPrognosisReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.prognosisReference == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        value,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        newValue,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        value,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        newValue,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        value,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        newValue,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        value,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        newValue,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        value,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        newValue,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        value,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        newValue,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        value,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#previous() previous} attribute.
   * @param value The value for previous
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withPrevious(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "previous");
    if (this.previous == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        newValue,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#previous() previous} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for previous
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withPrevious(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.previous == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        value,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        newValue,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        value,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#summary() summary} attribute.
   * @param value The value for summary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withSummary(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "summary");
    if (java.util.Objects.equals(this.summary, newValue)) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        newValue,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#summary() summary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for summary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withSummary(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.summary, value)) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        value,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClinicalImpression#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClinicalImpression withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        newValue,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} attribute.
   * @param value The value for prognosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withPrognosisCodeableConcept(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "prognosisCodeableConcept");
    if (this.prognosisCodeableConcept == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        newValue,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prognosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withPrognosisCodeableConcept(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.prognosisCodeableConcept == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        value,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#problem() problem} attribute.
   * @param value The value for problem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withProblem(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "problem");
    if (this.problem == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        newValue,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#problem() problem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for problem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withProblem(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.problem == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        value,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        newValue,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        value,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        newValue,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        value,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        newValue,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        value,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withSupportingInfo(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        newValue,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        value,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#protocol() protocol} attribute.
   * @param value The value for protocol
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withProtocol(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "protocol");
    if (this.protocol == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        newValue,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#protocol() protocol} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protocol
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withProtocol(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.protocol == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        value,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        newValue,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        value,
        this.encounter,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        newValue,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        value,
        this.date,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        newValue,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        value,
        this.finding,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#finding() finding} attribute.
   * @param value The value for finding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withFinding(java.util.List<com.fhir.ClinicalImpression_Finding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Finding> newValue = java.util.Objects.requireNonNull(value, "finding");
    if (this.finding == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#finding() finding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for finding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withFinding(java.util.Optional<? extends java.util.List<com.fhir.ClinicalImpression_Finding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Finding> value = optional.orElse(null);
    if (this.finding == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClinicalImpression#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClinicalImpression withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClinicalImpression#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClinicalImpression withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableClinicalImpression(
        this.effectiveDateTime,
        this.investigation,
        this.subject,
        this.note,
        this.text,
        this.assessor,
        this.statusReason,
        this.prognosisReference,
        this.implicitRules,
        this.contained,
        this.identifier,
        this.effectivePeriod,
        this.extension,
        this.code,
        this.previous,
        this.language,
        this.summary,
        this.resourceType,
        this.prognosisCodeableConcept,
        this.problem,
        this.meta,
        this.modifierExtension,
        this.description,
        this.supportingInfo,
        this.protocol,
        this.status,
        this.encounter,
        this.date,
        this.finding,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClinicalImpression} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClinicalImpression
        && equalTo((ImmutableClinicalImpression) another);
  }

  private boolean equalTo(ImmutableClinicalImpression another) {
    return java.util.Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && java.util.Objects.equals(investigation, another.investigation)
        && subject.equals(another.subject)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(assessor, another.assessor)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(prognosisReference, another.prognosisReference)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(previous, another.previous)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(summary, another.summary)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(prognosisCodeableConcept, another.prognosisCodeableConcept)
        && java.util.Objects.equals(problem, another.problem)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(protocol, another.protocol)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(finding, another.finding)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code effectiveDateTime}, {@code investigation}, {@code subject}, {@code note}, {@code text}, {@code assessor}, {@code statusReason}, {@code prognosisReference}, {@code implicitRules}, {@code contained}, {@code identifier}, {@code effectivePeriod}, {@code extension}, {@code code}, {@code previous}, {@code language}, {@code summary}, {@code resourceType}, {@code prognosisCodeableConcept}, {@code problem}, {@code meta}, {@code modifierExtension}, {@code description}, {@code supportingInfo}, {@code protocol}, {@code status}, {@code encounter}, {@code date}, {@code finding}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(effectiveDateTime);
    h += (h << 5) + java.util.Objects.hashCode(investigation);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(assessor);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(prognosisReference);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(previous);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(summary);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(prognosisCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(problem);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(protocol);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(finding);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ClinicalImpression} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ClinicalImpression{");
    if (effectiveDateTime != null) {
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (investigation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("investigation=").append(investigation);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("subject=").append(subject);
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (assessor != null) {
      builder.append(", ");
      builder.append("assessor=").append(assessor);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (prognosisReference != null) {
      builder.append(", ");
      builder.append("prognosisReference=").append(prognosisReference);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (previous != null) {
      builder.append(", ");
      builder.append("previous=").append(previous);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (summary != null) {
      builder.append(", ");
      builder.append("summary=").append(summary);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (prognosisCodeableConcept != null) {
      builder.append(", ");
      builder.append("prognosisCodeableConcept=").append(prognosisCodeableConcept);
    }
    if (problem != null) {
      builder.append(", ");
      builder.append("problem=").append(problem);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (protocol != null) {
      builder.append(", ");
      builder.append("protocol=").append(protocol);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (finding != null) {
      builder.append(", ");
      builder.append("finding=").append(finding);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ClinicalImpression", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ClinicalImpression {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> effectiveDateTime = java.util.Optional.empty();
    boolean effectiveDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Investigation>> investigation = java.util.Optional.empty();
    boolean investigationIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> assessor = java.util.Optional.empty();
    boolean assessorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> prognosisReference = java.util.Optional.empty();
    boolean prognosisReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> previous = java.util.Optional.empty();
    boolean previousIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> summary = java.util.Optional.empty();
    boolean summaryIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> prognosisCodeableConcept = java.util.Optional.empty();
    boolean prognosisCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> problem = java.util.Optional.empty();
    boolean problemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> protocol = java.util.Optional.empty();
    boolean protocolIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Finding>> finding = java.util.Optional.empty();
    boolean findingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("investigation")
    public void setInvestigation(java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Investigation>> investigation) {
      this.investigation = investigation;
      this.investigationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("assessor")
    public void setAssessor(java.util.Optional<com.fhir.Reference> assessor) {
      this.assessor = assessor;
      this.assessorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prognosisReference")
    public void setPrognosisReference(java.util.Optional<java.util.List<com.fhir.Reference>> prognosisReference) {
      this.prognosisReference = prognosisReference;
      this.prognosisReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("previous")
    public void setPrevious(java.util.Optional<com.fhir.Reference> previous) {
      this.previous = previous;
      this.previousIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    public void setSummary(java.util.Optional<java.lang.String> summary) {
      this.summary = summary;
      this.summaryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prognosisCodeableConcept")
    public void setPrognosisCodeableConcept(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> prognosisCodeableConcept) {
      this.prognosisCodeableConcept = prognosisCodeableConcept;
      this.prognosisCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("problem")
    public void setProblem(java.util.Optional<java.util.List<com.fhir.Reference>> problem) {
      this.problem = problem;
      this.problemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    public void setProtocol(java.util.Optional<java.util.List<com.fhir.uri>> protocol) {
      this.protocol = protocol;
      this.protocolIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("finding")
    public void setFinding(java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Finding>> finding) {
      this.finding = finding;
      this.findingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Investigation>> investigation() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> assessor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> prognosisReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> previous() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> summary() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> prognosisCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> problem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> protocol() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClinicalImpression_Finding>> finding() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClinicalImpression fromJson(Json json) {
    ImmutableClinicalImpression.Builder builder = ((ImmutableClinicalImpression.Builder) ImmutableClinicalImpression.builder());
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.investigationIsSet) {
      builder.investigation(json.investigation);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.assessorIsSet) {
      builder.assessor(json.assessor);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.prognosisReferenceIsSet) {
      builder.prognosisReference(json.prognosisReference);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.previousIsSet) {
      builder.previous(json.previous);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.summaryIsSet) {
      builder.summary(json.summary);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.prognosisCodeableConceptIsSet) {
      builder.prognosisCodeableConcept(json.prognosisCodeableConcept);
    }
    if (json.problemIsSet) {
      builder.problem(json.problem);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.protocolIsSet) {
      builder.protocol(json.protocol);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.findingIsSet) {
      builder.finding(json.finding);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableClinicalImpression) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClinicalImpression} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClinicalImpression instance
   */
  public static ClinicalImpression copyOf(ClinicalImpression instance) {
    if (instance instanceof ImmutableClinicalImpression) {
      return (ImmutableClinicalImpression) instance;
    }
    return ((ImmutableClinicalImpression.Builder) ImmutableClinicalImpression.builder())
        .effectiveDateTime(instance.effectiveDateTime())
        .investigation(instance.investigation())
        .subject(instance.subject())
        .note(instance.note())
        .text(instance.text())
        .assessor(instance.assessor())
        .statusReason(instance.statusReason())
        .prognosisReference(instance.prognosisReference())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .effectivePeriod(instance.effectivePeriod())
        .extension(instance.extension())
        .code(instance.code())
        .previous(instance.previous())
        .language(instance.language())
        .summary(instance.summary())
        .resourceType(instance.resourceType())
        .prognosisCodeableConcept(instance.prognosisCodeableConcept())
        .problem(instance.problem())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .supportingInfo(instance.supportingInfo())
        .protocol(instance.protocol())
        .status(instance.status())
        .encounter(instance.encounter())
        .date(instance.date())
        .finding(instance.finding())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ClinicalImpression ClinicalImpression}.
   * <pre>
   * ImmutableClinicalImpression.builder()
   *    .effectiveDateTime(String) // optional {@link ClinicalImpression#effectiveDateTime() effectiveDateTime}
   *    .investigation(List&amp;lt;com.fhir.ClinicalImpression_Investigation&amp;gt;) // optional {@link ClinicalImpression#investigation() investigation}
   *    .subject(com.fhir.Reference) // required {@link ClinicalImpression#subject() subject}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link ClinicalImpression#note() note}
   *    .text(com.fhir.Narrative) // optional {@link ClinicalImpression#text() text}
   *    .assessor(com.fhir.Reference) // optional {@link ClinicalImpression#assessor() assessor}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link ClinicalImpression#statusReason() statusReason}
   *    .prognosisReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ClinicalImpression#prognosisReference() prognosisReference}
   *    .implicitRules(com.fhir.uri) // optional {@link ClinicalImpression#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ClinicalImpression#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ClinicalImpression#identifier() identifier}
   *    .effectivePeriod(com.fhir.Period) // optional {@link ClinicalImpression#effectivePeriod() effectivePeriod}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClinicalImpression#extension() extension}
   *    .code(com.fhir.CodeableConcept) // optional {@link ClinicalImpression#code() code}
   *    .previous(com.fhir.Reference) // optional {@link ClinicalImpression#previous() previous}
   *    .language(com.fhir.code) // optional {@link ClinicalImpression#language() language}
   *    .summary(String) // optional {@link ClinicalImpression#summary() summary}
   *    .resourceType(String) // required {@link ClinicalImpression#resourceType() resourceType}
   *    .prognosisCodeableConcept(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept}
   *    .problem(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ClinicalImpression#problem() problem}
   *    .meta(com.fhir.Meta) // optional {@link ClinicalImpression#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClinicalImpression#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link ClinicalImpression#description() description}
   *    .supportingInfo(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ClinicalImpression#supportingInfo() supportingInfo}
   *    .protocol(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link ClinicalImpression#protocol() protocol}
   *    .status(com.fhir.code) // optional {@link ClinicalImpression#status() status}
   *    .encounter(com.fhir.Reference) // optional {@link ClinicalImpression#encounter() encounter}
   *    .date(com.fhir.dateTime) // optional {@link ClinicalImpression#date() date}
   *    .finding(List&amp;lt;com.fhir.ClinicalImpression_Finding&amp;gt;) // optional {@link ClinicalImpression#finding() finding}
   *    .id(com.fhir.id) // optional {@link ClinicalImpression#id() id}
   *    .build();
   * </pre>
   * @return A new ClinicalImpression builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableClinicalImpression.Builder();
  }

  /**
   * Builds instances of type {@link ClinicalImpression ClinicalImpression}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClinicalImpression", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x1L;
    private static final long OPT_BIT_INVESTIGATION = 0x2L;
    private static final long OPT_BIT_NOTE = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_ASSESSOR = 0x10L;
    private static final long OPT_BIT_STATUS_REASON = 0x20L;
    private static final long OPT_BIT_PROGNOSIS_REFERENCE = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_CODE = 0x1000L;
    private static final long OPT_BIT_PREVIOUS = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_SUMMARY = 0x8000L;
    private static final long OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT = 0x10000L;
    private static final long OPT_BIT_PROBLEM = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private static final long OPT_BIT_DESCRIPTION = 0x100000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x200000L;
    private static final long OPT_BIT_PROTOCOL = 0x400000L;
    private static final long OPT_BIT_STATUS = 0x800000L;
    private static final long OPT_BIT_ENCOUNTER = 0x1000000L;
    private static final long OPT_BIT_DATE = 0x2000000L;
    private static final long OPT_BIT_FINDING = 0x4000000L;
    private static final long OPT_BIT_ID = 0x8000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String effectiveDateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Investigation> investigation;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference assessor;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> prognosisReference;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Reference previous;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String summary;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> prognosisCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> problem;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> protocol;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClinicalImpression_Finding> finding;
    private @javax.annotation.Nullable com.fhir.id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDateTime(java.lang.String effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = java.util.Objects.requireNonNull(effectiveDateTime, "effectiveDateTime");
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public final Builder effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = effectiveDateTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for chained invocation
     */
    public final Builder investigation(java.util.List<com.fhir.ClinicalImpression_Investigation> investigation) {
      checkNotIsSet(investigationIsSet(), "investigation");
      this.investigation = java.util.Objects.requireNonNull(investigation, "investigation");
      optBits |= OPT_BIT_INVESTIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("investigation")
    public final Builder investigation(java.util.Optional<? extends java.util.List<com.fhir.ClinicalImpression_Investigation>> investigation) {
      checkNotIsSet(investigationIsSet(), "investigation");
      this.investigation = investigation.orElse(null);
      optBits |= OPT_BIT_INVESTIGATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ClinicalImpression#subject() subject} attribute.
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
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
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
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
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
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
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
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
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
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for chained invocation
     */
    public final Builder assessor(com.fhir.Reference assessor) {
      checkNotIsSet(assessorIsSet(), "assessor");
      this.assessor = java.util.Objects.requireNonNull(assessor, "assessor");
      optBits |= OPT_BIT_ASSESSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assessor")
    public final Builder assessor(java.util.Optional<? extends com.fhir.Reference> assessor) {
      checkNotIsSet(assessorIsSet(), "assessor");
      this.assessor = assessor.orElse(null);
      optBits |= OPT_BIT_ASSESSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(com.fhir.CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder prognosisReference(java.util.List<com.fhir.Reference> prognosisReference) {
      checkNotIsSet(prognosisReferenceIsSet(), "prognosisReference");
      this.prognosisReference = java.util.Objects.requireNonNull(prognosisReference, "prognosisReference");
      optBits |= OPT_BIT_PROGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prognosisReference")
    public final Builder prognosisReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> prognosisReference) {
      checkNotIsSet(prognosisReferenceIsSet(), "prognosisReference");
      this.prognosisReference = prognosisReference.orElse(null);
      optBits |= OPT_BIT_PROGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
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
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
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
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(com.fhir.Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = java.util.Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
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
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
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
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
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
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
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
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for chained invocation
     */
    public final Builder previous(com.fhir.Reference previous) {
      checkNotIsSet(previousIsSet(), "previous");
      this.previous = java.util.Objects.requireNonNull(previous, "previous");
      optBits |= OPT_BIT_PREVIOUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("previous")
    public final Builder previous(java.util.Optional<? extends com.fhir.Reference> previous) {
      checkNotIsSet(previousIsSet(), "previous");
      this.previous = previous.orElse(null);
      optBits |= OPT_BIT_PREVIOUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
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
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
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
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for chained invocation
     */
    public final Builder summary(java.lang.String summary) {
      checkNotIsSet(summaryIsSet(), "summary");
      this.summary = java.util.Objects.requireNonNull(summary, "summary");
      optBits |= OPT_BIT_SUMMARY;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    public final Builder summary(java.util.Optional<java.lang.String> summary) {
      checkNotIsSet(summaryIsSet(), "summary");
      this.summary = summary.orElse(null);
      optBits |= OPT_BIT_SUMMARY;
      return this;
    }

    /**
     * Initializes the value for the {@link ClinicalImpression#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder prognosisCodeableConcept(java.util.List<com.fhir.CodeableConcept> prognosisCodeableConcept) {
      checkNotIsSet(prognosisCodeableConceptIsSet(), "prognosisCodeableConcept");
      this.prognosisCodeableConcept = java.util.Objects.requireNonNull(prognosisCodeableConcept, "prognosisCodeableConcept");
      optBits |= OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prognosisCodeableConcept")
    public final Builder prognosisCodeableConcept(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> prognosisCodeableConcept) {
      checkNotIsSet(prognosisCodeableConceptIsSet(), "prognosisCodeableConcept");
      this.prognosisCodeableConcept = prognosisCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for chained invocation
     */
    public final Builder problem(java.util.List<com.fhir.Reference> problem) {
      checkNotIsSet(problemIsSet(), "problem");
      this.problem = java.util.Objects.requireNonNull(problem, "problem");
      optBits |= OPT_BIT_PROBLEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("problem")
    public final Builder problem(java.util.Optional<? extends java.util.List<com.fhir.Reference>> problem) {
      checkNotIsSet(problemIsSet(), "problem");
      this.problem = problem.orElse(null);
      optBits |= OPT_BIT_PROBLEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
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
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
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
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
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
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
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
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(java.util.List<com.fhir.Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = java.util.Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public final Builder supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    public final Builder protocol(java.util.List<com.fhir.uri> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = java.util.Objects.requireNonNull(protocol, "protocol");
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    public final Builder protocol(java.util.Optional<? extends java.util.List<com.fhir.uri>> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = protocol.orElse(null);
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
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
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
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
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for chained invocation
     */
    public final Builder finding(java.util.List<com.fhir.ClinicalImpression_Finding> finding) {
      checkNotIsSet(findingIsSet(), "finding");
      this.finding = java.util.Objects.requireNonNull(finding, "finding");
      optBits |= OPT_BIT_FINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("finding")
    public final Builder finding(java.util.Optional<? extends java.util.List<com.fhir.ClinicalImpression_Finding>> finding) {
      checkNotIsSet(findingIsSet(), "finding");
      this.finding = finding.orElse(null);
      optBits |= OPT_BIT_FINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
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
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
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
     * Builds a new {@link ClinicalImpression ClinicalImpression}.
     * @return An immutable instance of ClinicalImpression
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ClinicalImpression build() {
      checkRequiredAttributes();
      return new ImmutableClinicalImpression(
          effectiveDateTime,
          investigation,
          subject,
          note,
          text,
          assessor,
          statusReason,
          prognosisReference,
          implicitRules,
          contained,
          identifier,
          effectivePeriod,
          extension,
          code,
          previous,
          language,
          summary,
          resourceType,
          prognosisCodeableConcept,
          problem,
          meta,
          modifierExtension,
          description,
          supportingInfo,
          protocol,
          status,
          encounter,
          date,
          finding,
          id);
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean investigationIsSet() {
      return (optBits & OPT_BIT_INVESTIGATION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean assessorIsSet() {
      return (optBits & OPT_BIT_ASSESSOR) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean prognosisReferenceIsSet() {
      return (optBits & OPT_BIT_PROGNOSIS_REFERENCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean previousIsSet() {
      return (optBits & OPT_BIT_PREVIOUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean summaryIsSet() {
      return (optBits & OPT_BIT_SUMMARY) != 0;
    }

    private boolean prognosisCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PROGNOSIS_CODEABLE_CONCEPT) != 0;
    }

    private boolean problemIsSet() {
      return (optBits & OPT_BIT_PROBLEM) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean protocolIsSet() {
      return (optBits & OPT_BIT_PROTOCOL) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean findingIsSet() {
      return (optBits & OPT_BIT_FINDING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ClinicalImpression is strict, attribute is already set: ".concat(name));
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
      return "Cannot build ClinicalImpression, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ClinicalImpression", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ClinicalImpression#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "ClinicalImpression", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ClinicalImpression#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ClinicalImpression", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(java.lang.String effectiveDateTime);

    /**
     * Initializes the optional value {@link ClinicalImpression#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime);

    /**
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal investigation(java.util.List<com.fhir.ClinicalImpression_Investigation> investigation);

    /**
     * Initializes the optional value {@link ClinicalImpression#investigation() investigation} to investigation.
     * @param investigation The value for investigation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal investigation(java.util.Optional<? extends java.util.List<com.fhir.ClinicalImpression_Investigation>> investigation);

    /**
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link ClinicalImpression#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ClinicalImpression#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal assessor(com.fhir.Reference assessor);

    /**
     * Initializes the optional value {@link ClinicalImpression#assessor() assessor} to assessor.
     * @param assessor The value for assessor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal assessor(java.util.Optional<? extends com.fhir.Reference> assessor);

    /**
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(com.fhir.CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link ClinicalImpression#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prognosisReference(java.util.List<com.fhir.Reference> prognosisReference);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisReference() prognosisReference} to prognosisReference.
     * @param prognosisReference The value for prognosisReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prognosisReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> prognosisReference);

    /**
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ClinicalImpression#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ClinicalImpression#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ClinicalImpression#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link ClinicalImpression#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ClinicalImpression#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link ClinicalImpression#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for chained invocation
     */
    BuildFinal previous(com.fhir.Reference previous);

    /**
     * Initializes the optional value {@link ClinicalImpression#previous() previous} to previous.
     * @param previous The value for previous
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal previous(java.util.Optional<? extends com.fhir.Reference> previous);

    /**
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ClinicalImpression#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for chained invocation
     */
    BuildFinal summary(java.lang.String summary);

    /**
     * Initializes the optional value {@link ClinicalImpression#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal summary(java.util.Optional<java.lang.String> summary);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prognosisCodeableConcept(java.util.List<com.fhir.CodeableConcept> prognosisCodeableConcept);

    /**
     * Initializes the optional value {@link ClinicalImpression#prognosisCodeableConcept() prognosisCodeableConcept} to prognosisCodeableConcept.
     * @param prognosisCodeableConcept The value for prognosisCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prognosisCodeableConcept(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> prognosisCodeableConcept);

    /**
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal problem(java.util.List<com.fhir.Reference> problem);

    /**
     * Initializes the optional value {@link ClinicalImpression#problem() problem} to problem.
     * @param problem The value for problem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal problem(java.util.Optional<? extends java.util.List<com.fhir.Reference>> problem);

    /**
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ClinicalImpression#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClinicalImpression#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link ClinicalImpression#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.Reference> supportingInfo);

    /**
     * Initializes the optional value {@link ClinicalImpression#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protocol(java.util.List<com.fhir.uri> protocol);

    /**
     * Initializes the optional value {@link ClinicalImpression#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocol(java.util.Optional<? extends java.util.List<com.fhir.uri>> protocol);

    /**
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link ClinicalImpression#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link ClinicalImpression#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ClinicalImpression#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for chained invocation
     */
    BuildFinal finding(java.util.List<com.fhir.ClinicalImpression_Finding> finding);

    /**
     * Initializes the optional value {@link ClinicalImpression#finding() finding} to finding.
     * @param finding The value for finding
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal finding(java.util.Optional<? extends java.util.List<com.fhir.ClinicalImpression_Finding>> finding);

    /**
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ClinicalImpression#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Builds a new {@link ClinicalImpression ClinicalImpression}.
     * @return An immutable instance of ClinicalImpression
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClinicalImpression build();
  }
}
