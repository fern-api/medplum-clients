//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DiagnosticReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiagnosticReport.builder()}.
 */
@org.immutables.value.Generated(from = "DiagnosticReport", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDiagnosticReport implements com.fhir.DiagnosticReport {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.DiagnosticreportStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Attachment> presentedForm;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable com.fhir.instant issued;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
  private final @javax.annotation.Nullable java.lang.String conclusion;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> conclusionCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> resultsInterpreter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DiagnosticReport_Media> media;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> result;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.lang.String effectiveDateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> imagingStudy;

  private ImmutableDiagnosticReport(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.DiagnosticreportStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Attachment> presentedForm,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable com.fhir.instant issued,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer,
      @javax.annotation.Nullable java.lang.String conclusion,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> conclusionCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> resultsInterpreter,
      @javax.annotation.Nullable java.util.List<com.fhir.DiagnosticReport_Media> media,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> result,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.lang.String effectiveDateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> imagingStudy) {
    this.modifierExtension = modifierExtension;
    this.contained = contained;
    this.resourceType = resourceType;
    this.status = status;
    this.presentedForm = presentedForm;
    this.category = category;
    this.issued = issued;
    this.extension = extension;
    this.code = code;
    this.meta = meta;
    this.language = language;
    this.specimen = specimen;
    this.subject = subject;
    this.basedOn = basedOn;
    this.implicitRules = implicitRules;
    this.performer = performer;
    this.conclusion = conclusion;
    this.text = text;
    this.identifier = identifier;
    this.conclusionCode = conclusionCode;
    this.resultsInterpreter = resultsInterpreter;
    this.media = media;
    this.result = result;
    this.encounter = encounter;
    this.id = id;
    this.effectivePeriod = effectivePeriod;
    this.effectiveDateTime = effectiveDateTime;
    this.imagingStudy = imagingStudy;
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.DiagnosticreportStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code presentedForm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("presentedForm")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Attachment>> presentedForm() {
    return java.util.Optional.ofNullable(presentedForm);
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
   * @return The value of the {@code issued} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issued")
  @Override
  public java.util.Optional<com.fhir.instant> issued() {
    return java.util.Optional.ofNullable(issued);
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
  public com.fhir.CodeableConcept code() {
    return code;
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
   * @return The value of the {@code specimen} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specimen")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> specimen() {
    return java.util.Optional.ofNullable(specimen);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> performer() {
    return java.util.Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code conclusion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conclusion")
  @Override
  public java.util.Optional<java.lang.String> conclusion() {
    return java.util.Optional.ofNullable(conclusion);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code conclusionCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conclusionCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> conclusionCode() {
    return java.util.Optional.ofNullable(conclusionCode);
  }

  /**
   * @return The value of the {@code resultsInterpreter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resultsInterpreter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> resultsInterpreter() {
    return java.util.Optional.ofNullable(resultsInterpreter);
  }

  /**
   * @return The value of the {@code media} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("media")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DiagnosticReport_Media>> media() {
    return java.util.Optional.ofNullable(media);
  }

  /**
   * @return The value of the {@code result} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("result")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> result() {
    return java.util.Optional.ofNullable(result);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code imagingStudy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("imagingStudy")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> imagingStudy() {
    return java.util.Optional.ofNullable(imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDiagnosticReport(
        newValue,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDiagnosticReport(
        value,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        newValue,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        value,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiagnosticReport#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiagnosticReport withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        newValue,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withStatus(com.fhir.DiagnosticreportStatus value) {
    @javax.annotation.Nullable com.fhir.DiagnosticreportStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        newValue,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withStatus(java.util.Optional<? extends com.fhir.DiagnosticreportStatus> optional) {
    @javax.annotation.Nullable com.fhir.DiagnosticreportStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        value,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#presentedForm() presentedForm} attribute.
   * @param value The value for presentedForm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withPresentedForm(java.util.List<com.fhir.Attachment> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> newValue = java.util.Objects.requireNonNull(value, "presentedForm");
    if (this.presentedForm == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        newValue,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#presentedForm() presentedForm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for presentedForm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withPresentedForm(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> value = optional.orElse(null);
    if (this.presentedForm == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        value,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        newValue,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        value,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withIssued(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        newValue,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withIssued(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        value,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        newValue,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        value,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiagnosticReport#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiagnosticReport withCode(com.fhir.CodeableConcept value) {
    if (this.code == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        newValue,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        newValue,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        value,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        newValue,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        value,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withSpecimen(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        newValue,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withSpecimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        value,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        newValue,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        value,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        newValue,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        value,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        newValue,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        value,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withPerformer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        newValue,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withPerformer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        value,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#conclusion() conclusion} attribute.
   * @param value The value for conclusion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withConclusion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "conclusion");
    if (java.util.Objects.equals(this.conclusion, newValue)) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        newValue,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#conclusion() conclusion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conclusion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withConclusion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.conclusion, value)) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        value,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        newValue,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        value,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        newValue,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        value,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#conclusionCode() conclusionCode} attribute.
   * @param value The value for conclusionCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withConclusionCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "conclusionCode");
    if (this.conclusionCode == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        newValue,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#conclusionCode() conclusionCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conclusionCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withConclusionCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.conclusionCode == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        value,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} attribute.
   * @param value The value for resultsInterpreter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withResultsInterpreter(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "resultsInterpreter");
    if (this.resultsInterpreter == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        newValue,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resultsInterpreter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withResultsInterpreter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.resultsInterpreter == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        value,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#media() media} attribute.
   * @param value The value for media
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withMedia(java.util.List<com.fhir.DiagnosticReport_Media> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DiagnosticReport_Media> newValue = java.util.Objects.requireNonNull(value, "media");
    if (this.media == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        newValue,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#media() media} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for media
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withMedia(java.util.Optional<? extends java.util.List<com.fhir.DiagnosticReport_Media>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DiagnosticReport_Media> value = optional.orElse(null);
    if (this.media == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        value,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withResult(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        newValue,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withResult(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        value,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        newValue,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        value,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        newValue,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        value,
        this.effectivePeriod,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        newValue,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        value,
        this.effectiveDateTime,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEffectiveDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "effectiveDateTime");
    if (java.util.Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        newValue,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withEffectiveDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        value,
        this.imagingStudy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport#imagingStudy() imagingStudy} attribute.
   * @param value The value for imagingStudy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport withImagingStudy(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "imagingStudy");
    if (this.imagingStudy == newValue) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport#imagingStudy() imagingStudy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for imagingStudy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport withImagingStudy(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.imagingStudy == value) return this;
    return new ImmutableDiagnosticReport(
        this.modifierExtension,
        this.contained,
        this.resourceType,
        this.status,
        this.presentedForm,
        this.category,
        this.issued,
        this.extension,
        this.code,
        this.meta,
        this.language,
        this.specimen,
        this.subject,
        this.basedOn,
        this.implicitRules,
        this.performer,
        this.conclusion,
        this.text,
        this.identifier,
        this.conclusionCode,
        this.resultsInterpreter,
        this.media,
        this.result,
        this.encounter,
        this.id,
        this.effectivePeriod,
        this.effectiveDateTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiagnosticReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiagnosticReport
        && equalTo((ImmutableDiagnosticReport) another);
  }

  private boolean equalTo(ImmutableDiagnosticReport another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(presentedForm, another.presentedForm)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(issued, another.issued)
        && java.util.Objects.equals(extension, another.extension)
        && code.equals(another.code)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(specimen, another.specimen)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(conclusion, another.conclusion)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(conclusionCode, another.conclusionCode)
        && java.util.Objects.equals(resultsInterpreter, another.resultsInterpreter)
        && java.util.Objects.equals(media, another.media)
        && java.util.Objects.equals(result, another.result)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && java.util.Objects.equals(imagingStudy, another.imagingStudy);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code contained}, {@code resourceType}, {@code status}, {@code presentedForm}, {@code category}, {@code issued}, {@code extension}, {@code code}, {@code meta}, {@code language}, {@code specimen}, {@code subject}, {@code basedOn}, {@code implicitRules}, {@code performer}, {@code conclusion}, {@code text}, {@code identifier}, {@code conclusionCode}, {@code resultsInterpreter}, {@code media}, {@code result}, {@code encounter}, {@code id}, {@code effectivePeriod}, {@code effectiveDateTime}, {@code imagingStudy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(presentedForm);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(issued);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(specimen);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(conclusion);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(conclusionCode);
    h += (h << 5) + java.util.Objects.hashCode(resultsInterpreter);
    h += (h << 5) + java.util.Objects.hashCode(media);
    h += (h << 5) + java.util.Objects.hashCode(result);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(effectiveDateTime);
    h += (h << 5) + java.util.Objects.hashCode(imagingStudy);
    return h;
  }

  /**
   * Prints the immutable value {@code DiagnosticReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DiagnosticReport{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contained != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (presentedForm != null) {
      builder.append(", ");
      builder.append("presentedForm=").append(presentedForm);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (issued != null) {
      builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("code=").append(code);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (specimen != null) {
      builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (conclusion != null) {
      builder.append(", ");
      builder.append("conclusion=").append(conclusion);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (conclusionCode != null) {
      builder.append(", ");
      builder.append("conclusionCode=").append(conclusionCode);
    }
    if (resultsInterpreter != null) {
      builder.append(", ");
      builder.append("resultsInterpreter=").append(resultsInterpreter);
    }
    if (media != null) {
      builder.append(", ");
      builder.append("media=").append(media);
    }
    if (result != null) {
      builder.append(", ");
      builder.append("result=").append(result);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (effectiveDateTime != null) {
      builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (imagingStudy != null) {
      builder.append(", ");
      builder.append("imagingStudy=").append(imagingStudy);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DiagnosticReport", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DiagnosticReport {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DiagnosticreportStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Attachment>> presentedForm = java.util.Optional.empty();
    boolean presentedFormIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> issued = java.util.Optional.empty();
    boolean issuedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept code;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> specimen = java.util.Optional.empty();
    boolean specimenIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> conclusion = java.util.Optional.empty();
    boolean conclusionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> conclusionCode = java.util.Optional.empty();
    boolean conclusionCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> resultsInterpreter = java.util.Optional.empty();
    boolean resultsInterpreterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DiagnosticReport_Media>> media = java.util.Optional.empty();
    boolean mediaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> result = java.util.Optional.empty();
    boolean resultIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> effectiveDateTime = java.util.Optional.empty();
    boolean effectiveDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> imagingStudy = java.util.Optional.empty();
    boolean imagingStudyIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.DiagnosticreportStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("presentedForm")
    public void setPresentedForm(java.util.Optional<java.util.List<com.fhir.Attachment>> presentedForm) {
      this.presentedForm = presentedForm;
      this.presentedFormIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public void setIssued(java.util.Optional<com.fhir.instant> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(com.fhir.CodeableConcept code) {
      this.code = code;
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
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public void setSpecimen(java.util.Optional<java.util.List<com.fhir.Reference>> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("conclusion")
    public void setConclusion(java.util.Optional<java.lang.String> conclusion) {
      this.conclusion = conclusion;
      this.conclusionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("conclusionCode")
    public void setConclusionCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> conclusionCode) {
      this.conclusionCode = conclusionCode;
      this.conclusionCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resultsInterpreter")
    public void setResultsInterpreter(java.util.Optional<java.util.List<com.fhir.Reference>> resultsInterpreter) {
      this.resultsInterpreter = resultsInterpreter;
      this.resultsInterpreterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("media")
    public void setMedia(java.util.Optional<java.util.List<com.fhir.DiagnosticReport_Media>> media) {
      this.media = media;
      this.mediaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public void setResult(java.util.Optional<java.util.List<com.fhir.Reference>> result) {
      this.result = result;
      this.resultIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("imagingStudy")
    public void setImagingStudy(java.util.Optional<java.util.List<com.fhir.Reference>> imagingStudy) {
      this.imagingStudy = imagingStudy;
      this.imagingStudyIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DiagnosticreportStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Attachment>> presentedForm() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> issued() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> conclusion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> conclusionCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> resultsInterpreter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DiagnosticReport_Media>> media() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> result() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> imagingStudy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDiagnosticReport fromJson(Json json) {
    ImmutableDiagnosticReport.Builder builder = ((ImmutableDiagnosticReport.Builder) ImmutableDiagnosticReport.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.presentedFormIsSet) {
      builder.presentedForm(json.presentedForm);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.conclusionIsSet) {
      builder.conclusion(json.conclusion);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.conclusionCodeIsSet) {
      builder.conclusionCode(json.conclusionCode);
    }
    if (json.resultsInterpreterIsSet) {
      builder.resultsInterpreter(json.resultsInterpreter);
    }
    if (json.mediaIsSet) {
      builder.media(json.media);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.imagingStudyIsSet) {
      builder.imagingStudy(json.imagingStudy);
    }
    return (ImmutableDiagnosticReport) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DiagnosticReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiagnosticReport instance
   */
  public static DiagnosticReport copyOf(DiagnosticReport instance) {
    if (instance instanceof ImmutableDiagnosticReport) {
      return (ImmutableDiagnosticReport) instance;
    }
    return ((ImmutableDiagnosticReport.Builder) ImmutableDiagnosticReport.builder())
        .modifierExtension(instance.modifierExtension())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .status(instance.status())
        .presentedForm(instance.presentedForm())
        .category(instance.category())
        .issued(instance.issued())
        .extension(instance.extension())
        .code(instance.code())
        .meta(instance.meta())
        .language(instance.language())
        .specimen(instance.specimen())
        .subject(instance.subject())
        .basedOn(instance.basedOn())
        .implicitRules(instance.implicitRules())
        .performer(instance.performer())
        .conclusion(instance.conclusion())
        .text(instance.text())
        .identifier(instance.identifier())
        .conclusionCode(instance.conclusionCode())
        .resultsInterpreter(instance.resultsInterpreter())
        .media(instance.media())
        .result(instance.result())
        .encounter(instance.encounter())
        .id(instance.id())
        .effectivePeriod(instance.effectivePeriod())
        .effectiveDateTime(instance.effectiveDateTime())
        .imagingStudy(instance.imagingStudy())
        .build();
  }

  /**
   * Creates a builder for {@link DiagnosticReport DiagnosticReport}.
   * <pre>
   * ImmutableDiagnosticReport.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DiagnosticReport#modifierExtension() modifierExtension}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DiagnosticReport#contained() contained}
   *    .resourceType(String) // required {@link DiagnosticReport#resourceType() resourceType}
   *    .status(com.fhir.DiagnosticreportStatus) // optional {@link DiagnosticReport#status() status}
   *    .presentedForm(List&amp;lt;com.fhir.Attachment&amp;gt;) // optional {@link DiagnosticReport#presentedForm() presentedForm}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DiagnosticReport#category() category}
   *    .issued(com.fhir.instant) // optional {@link DiagnosticReport#issued() issued}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DiagnosticReport#extension() extension}
   *    .code(com.fhir.CodeableConcept) // required {@link DiagnosticReport#code() code}
   *    .meta(com.fhir.Meta) // optional {@link DiagnosticReport#meta() meta}
   *    .language(com.fhir.code) // optional {@link DiagnosticReport#language() language}
   *    .specimen(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#specimen() specimen}
   *    .subject(com.fhir.Reference) // optional {@link DiagnosticReport#subject() subject}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#basedOn() basedOn}
   *    .implicitRules(com.fhir.uri) // optional {@link DiagnosticReport#implicitRules() implicitRules}
   *    .performer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#performer() performer}
   *    .conclusion(String) // optional {@link DiagnosticReport#conclusion() conclusion}
   *    .text(com.fhir.Narrative) // optional {@link DiagnosticReport#text() text}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DiagnosticReport#identifier() identifier}
   *    .conclusionCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DiagnosticReport#conclusionCode() conclusionCode}
   *    .resultsInterpreter(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#resultsInterpreter() resultsInterpreter}
   *    .media(List&amp;lt;com.fhir.DiagnosticReport_Media&amp;gt;) // optional {@link DiagnosticReport#media() media}
   *    .result(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#result() result}
   *    .encounter(com.fhir.Reference) // optional {@link DiagnosticReport#encounter() encounter}
   *    .id(com.fhir.id) // optional {@link DiagnosticReport#id() id}
   *    .effectivePeriod(com.fhir.Period) // optional {@link DiagnosticReport#effectivePeriod() effectivePeriod}
   *    .effectiveDateTime(String) // optional {@link DiagnosticReport#effectiveDateTime() effectiveDateTime}
   *    .imagingStudy(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DiagnosticReport#imagingStudy() imagingStudy}
   *    .build();
   * </pre>
   * @return A new DiagnosticReport builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDiagnosticReport.Builder();
  }

  /**
   * Builds instances of type {@link DiagnosticReport DiagnosticReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DiagnosticReport", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_PRESENTED_FORM = 0x8L;
    private static final long OPT_BIT_CATEGORY = 0x10L;
    private static final long OPT_BIT_ISSUED = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_SPECIMEN = 0x200L;
    private static final long OPT_BIT_SUBJECT = 0x400L;
    private static final long OPT_BIT_BASED_ON = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_PERFORMER = 0x2000L;
    private static final long OPT_BIT_CONCLUSION = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_CONCLUSION_CODE = 0x20000L;
    private static final long OPT_BIT_RESULTS_INTERPRETER = 0x40000L;
    private static final long OPT_BIT_MEDIA = 0x80000L;
    private static final long OPT_BIT_RESULT = 0x100000L;
    private static final long OPT_BIT_ENCOUNTER = 0x200000L;
    private static final long OPT_BIT_ID = 0x400000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x800000L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x1000000L;
    private static final long OPT_BIT_IMAGING_STUDY = 0x2000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.DiagnosticreportStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Attachment> presentedForm;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable com.fhir.instant issued;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
    private @javax.annotation.Nullable java.lang.String conclusion;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> conclusionCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> resultsInterpreter;
    private @javax.annotation.Nullable java.util.List<com.fhir.DiagnosticReport_Media> media;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> result;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.lang.String effectiveDateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> imagingStudy;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
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
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
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
     * Initializes the value for the {@link DiagnosticReport#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.DiagnosticreportStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.DiagnosticreportStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for chained invocation
     */
    public final Builder presentedForm(java.util.List<com.fhir.Attachment> presentedForm) {
      checkNotIsSet(presentedFormIsSet(), "presentedForm");
      this.presentedForm = java.util.Objects.requireNonNull(presentedForm, "presentedForm");
      optBits |= OPT_BIT_PRESENTED_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("presentedForm")
    public final Builder presentedForm(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> presentedForm) {
      checkNotIsSet(presentedFormIsSet(), "presentedForm");
      this.presentedForm = presentedForm.orElse(null);
      optBits |= OPT_BIT_PRESENTED_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
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
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
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
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(com.fhir.instant issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = java.util.Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public final Builder issued(java.util.Optional<? extends com.fhir.instant> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
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
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
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
     * Initializes the value for the {@link DiagnosticReport#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
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
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
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
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
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
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
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
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(java.util.List<com.fhir.Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = java.util.Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public final Builder specimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
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
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
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
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for chained invocation
     */
    public final Builder conclusion(java.lang.String conclusion) {
      checkNotIsSet(conclusionIsSet(), "conclusion");
      this.conclusion = java.util.Objects.requireNonNull(conclusion, "conclusion");
      optBits |= OPT_BIT_CONCLUSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conclusion")
    public final Builder conclusion(java.util.Optional<java.lang.String> conclusion) {
      checkNotIsSet(conclusionIsSet(), "conclusion");
      this.conclusion = conclusion.orElse(null);
      optBits |= OPT_BIT_CONCLUSION;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
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
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
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
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder conclusionCode(java.util.List<com.fhir.CodeableConcept> conclusionCode) {
      checkNotIsSet(conclusionCodeIsSet(), "conclusionCode");
      this.conclusionCode = java.util.Objects.requireNonNull(conclusionCode, "conclusionCode");
      optBits |= OPT_BIT_CONCLUSION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conclusionCode")
    public final Builder conclusionCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> conclusionCode) {
      checkNotIsSet(conclusionCodeIsSet(), "conclusionCode");
      this.conclusionCode = conclusionCode.orElse(null);
      optBits |= OPT_BIT_CONCLUSION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for chained invocation
     */
    public final Builder resultsInterpreter(java.util.List<com.fhir.Reference> resultsInterpreter) {
      checkNotIsSet(resultsInterpreterIsSet(), "resultsInterpreter");
      this.resultsInterpreter = java.util.Objects.requireNonNull(resultsInterpreter, "resultsInterpreter");
      optBits |= OPT_BIT_RESULTS_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resultsInterpreter")
    public final Builder resultsInterpreter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> resultsInterpreter) {
      checkNotIsSet(resultsInterpreterIsSet(), "resultsInterpreter");
      this.resultsInterpreter = resultsInterpreter.orElse(null);
      optBits |= OPT_BIT_RESULTS_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for chained invocation
     */
    public final Builder media(java.util.List<com.fhir.DiagnosticReport_Media> media) {
      checkNotIsSet(mediaIsSet(), "media");
      this.media = java.util.Objects.requireNonNull(media, "media");
      optBits |= OPT_BIT_MEDIA;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("media")
    public final Builder media(java.util.Optional<? extends java.util.List<com.fhir.DiagnosticReport_Media>> media) {
      checkNotIsSet(mediaIsSet(), "media");
      this.media = media.orElse(null);
      optBits |= OPT_BIT_MEDIA;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(java.util.List<com.fhir.Reference> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = java.util.Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public final Builder result(java.util.Optional<? extends java.util.List<com.fhir.Reference>> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
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
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
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
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for chained invocation
     */
    public final Builder imagingStudy(java.util.List<com.fhir.Reference> imagingStudy) {
      checkNotIsSet(imagingStudyIsSet(), "imagingStudy");
      this.imagingStudy = java.util.Objects.requireNonNull(imagingStudy, "imagingStudy");
      optBits |= OPT_BIT_IMAGING_STUDY;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imagingStudy")
    public final Builder imagingStudy(java.util.Optional<? extends java.util.List<com.fhir.Reference>> imagingStudy) {
      checkNotIsSet(imagingStudyIsSet(), "imagingStudy");
      this.imagingStudy = imagingStudy.orElse(null);
      optBits |= OPT_BIT_IMAGING_STUDY;
      return this;
    }

    /**
     * Builds a new {@link DiagnosticReport DiagnosticReport}.
     * @return An immutable instance of DiagnosticReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DiagnosticReport build() {
      checkRequiredAttributes();
      return new ImmutableDiagnosticReport(
          modifierExtension,
          contained,
          resourceType,
          status,
          presentedForm,
          category,
          issued,
          extension,
          code,
          meta,
          language,
          specimen,
          subject,
          basedOn,
          implicitRules,
          performer,
          conclusion,
          text,
          identifier,
          conclusionCode,
          resultsInterpreter,
          media,
          result,
          encounter,
          id,
          effectivePeriod,
          effectiveDateTime,
          imagingStudy);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean presentedFormIsSet() {
      return (optBits & OPT_BIT_PRESENTED_FORM) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean conclusionIsSet() {
      return (optBits & OPT_BIT_CONCLUSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean conclusionCodeIsSet() {
      return (optBits & OPT_BIT_CONCLUSION_CODE) != 0;
    }

    private boolean resultsInterpreterIsSet() {
      return (optBits & OPT_BIT_RESULTS_INTERPRETER) != 0;
    }

    private boolean mediaIsSet() {
      return (optBits & OPT_BIT_MEDIA) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean imagingStudyIsSet() {
      return (optBits & OPT_BIT_IMAGING_STUDY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DiagnosticReport is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build DiagnosticReport, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DiagnosticReport", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DiagnosticReport#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    CodeBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DiagnosticReport", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link DiagnosticReport#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);
  }

  @org.immutables.value.Generated(from = "DiagnosticReport", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DiagnosticReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DiagnosticReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.DiagnosticreportStatus status);

    /**
     * Initializes the optional value {@link DiagnosticReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.DiagnosticreportStatus> status);

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal presentedForm(java.util.List<com.fhir.Attachment> presentedForm);

    /**
     * Initializes the optional value {@link DiagnosticReport#presentedForm() presentedForm} to presentedForm.
     * @param presentedForm The value for presentedForm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal presentedForm(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> presentedForm);

    /**
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link DiagnosticReport#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(com.fhir.instant issued);

    /**
     * Initializes the optional value {@link DiagnosticReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(java.util.Optional<? extends com.fhir.instant> issued);

    /**
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DiagnosticReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DiagnosticReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DiagnosticReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(java.util.List<com.fhir.Reference> specimen);

    /**
     * Initializes the optional value {@link DiagnosticReport#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimen);

    /**
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link DiagnosticReport#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link DiagnosticReport#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DiagnosticReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link DiagnosticReport#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal conclusion(java.lang.String conclusion);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusion() conclusion} to conclusion.
     * @param conclusion The value for conclusion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal conclusion(java.util.Optional<java.lang.String> conclusion);

    /**
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DiagnosticReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DiagnosticReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal conclusionCode(java.util.List<com.fhir.CodeableConcept> conclusionCode);

    /**
     * Initializes the optional value {@link DiagnosticReport#conclusionCode() conclusionCode} to conclusionCode.
     * @param conclusionCode The value for conclusionCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal conclusionCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> conclusionCode);

    /**
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resultsInterpreter(java.util.List<com.fhir.Reference> resultsInterpreter);

    /**
     * Initializes the optional value {@link DiagnosticReport#resultsInterpreter() resultsInterpreter} to resultsInterpreter.
     * @param resultsInterpreter The value for resultsInterpreter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resultsInterpreter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> resultsInterpreter);

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for chained invocation
     */
    BuildFinal media(java.util.List<com.fhir.DiagnosticReport_Media> media);

    /**
     * Initializes the optional value {@link DiagnosticReport#media() media} to media.
     * @param media The value for media
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal media(java.util.Optional<? extends java.util.List<com.fhir.DiagnosticReport_Media>> media);

    /**
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    BuildFinal result(java.util.List<com.fhir.Reference> result);

    /**
     * Initializes the optional value {@link DiagnosticReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal result(java.util.Optional<? extends java.util.List<com.fhir.Reference>> result);

    /**
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link DiagnosticReport#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DiagnosticReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(java.lang.String effectiveDateTime);

    /**
     * Initializes the optional value {@link DiagnosticReport#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime);

    /**
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal imagingStudy(java.util.List<com.fhir.Reference> imagingStudy);

    /**
     * Initializes the optional value {@link DiagnosticReport#imagingStudy() imagingStudy} to imagingStudy.
     * @param imagingStudy The value for imagingStudy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal imagingStudy(java.util.Optional<? extends java.util.List<com.fhir.Reference>> imagingStudy);

    /**
     * Builds a new {@link DiagnosticReport DiagnosticReport}.
     * @return An immutable instance of DiagnosticReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DiagnosticReport build();
  }
}
