//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DetectedIssue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDetectedIssue.builder()}.
 */
@org.immutables.value.Generated(from = "DetectedIssue", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDetectedIssue implements com.fhir.DetectedIssue {
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Period identifiedPeriod;
  private final @javax.annotation.Nullable com.fhir.uri reference;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Mitigation> mitigation;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.lang.String identifiedDateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> implicated;
  private final @javax.annotation.Nullable java.lang.String detail;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Evidence> evidence;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.DetectedissueSeverity severity;
  private final @javax.annotation.Nullable com.fhir.Reference author;

  private ImmutableDetectedIssue(
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Period identifiedPeriod,
      @javax.annotation.Nullable com.fhir.uri reference,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Mitigation> mitigation,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.lang.String identifiedDateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> implicated,
      @javax.annotation.Nullable java.lang.String detail,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Evidence> evidence,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.DetectedissueSeverity severity,
      @javax.annotation.Nullable com.fhir.Reference author) {
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.contained = contained;
    this.identifiedPeriod = identifiedPeriod;
    this.reference = reference;
    this.meta = meta;
    this.code = code;
    this.patient = patient;
    this.mitigation = mitigation;
    this.status = status;
    this.identifiedDateTime = identifiedDateTime;
    this.extension = extension;
    this.implicated = implicated;
    this.detail = detail;
    this.identifier = identifier;
    this.text = text;
    this.id = id;
    this.language = language;
    this.evidence = evidence;
    this.resourceType = resourceType;
    this.severity = severity;
    this.author = author;
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
   * @return The value of the {@code identifiedPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifiedPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> identifiedPeriod() {
    return java.util.Optional.ofNullable(identifiedPeriod);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reference")
  @Override
  public java.util.Optional<com.fhir.uri> reference() {
    return java.util.Optional.ofNullable(reference);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public java.util.Optional<com.fhir.Reference> patient() {
    return java.util.Optional.ofNullable(patient);
  }

  /**
   * @return The value of the {@code mitigation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mitigation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DetectedIssue_Mitigation>> mitigation() {
    return java.util.Optional.ofNullable(mitigation);
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
   * @return The value of the {@code identifiedDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifiedDateTime")
  @Override
  public java.util.Optional<java.lang.String> identifiedDateTime() {
    return java.util.Optional.ofNullable(identifiedDateTime);
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
   * @return The value of the {@code implicated} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicated")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> implicated() {
    return java.util.Optional.ofNullable(implicated);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detail")
  @Override
  public java.util.Optional<java.lang.String> detail() {
    return java.util.Optional.ofNullable(detail);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code evidence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("evidence")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DetectedIssue_Evidence>> evidence() {
    return java.util.Optional.ofNullable(evidence);
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
   * @return The value of the {@code severity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("severity")
  @Override
  public java.util.Optional<com.fhir.DetectedissueSeverity> severity() {
    return java.util.Optional.ofNullable(severity);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<com.fhir.Reference> author() {
    return java.util.Optional.ofNullable(author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDetectedIssue(
        newValue,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDetectedIssue(
        value,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        newValue,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        value,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        value,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#identifiedPeriod() identifiedPeriod} attribute.
   * @param value The value for identifiedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifiedPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "identifiedPeriod");
    if (this.identifiedPeriod == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        newValue,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#identifiedPeriod() identifiedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifiedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withIdentifiedPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.identifiedPeriod == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        value,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withReference(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "reference");
    if (this.reference == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        newValue,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#reference() reference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withReference(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.reference == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        value,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        newValue,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        value,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        newValue,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        value,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withPatient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        newValue,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withPatient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        value,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#mitigation() mitigation} attribute.
   * @param value The value for mitigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withMitigation(java.util.List<com.fhir.DetectedIssue_Mitigation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Mitigation> newValue = java.util.Objects.requireNonNull(value, "mitigation");
    if (this.mitigation == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        newValue,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#mitigation() mitigation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mitigation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withMitigation(java.util.Optional<? extends java.util.List<com.fhir.DetectedIssue_Mitigation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Mitigation> value = optional.orElse(null);
    if (this.mitigation == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        value,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        newValue,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        value,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#identifiedDateTime() identifiedDateTime} attribute.
   * @param value The value for identifiedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifiedDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "identifiedDateTime");
    if (java.util.Objects.equals(this.identifiedDateTime, newValue)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        newValue,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#identifiedDateTime() identifiedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifiedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifiedDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.identifiedDateTime, value)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        value,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        newValue,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        value,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#implicated() implicated} attribute.
   * @param value The value for implicated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withImplicated(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "implicated");
    if (this.implicated == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        newValue,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#implicated() implicated} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicated
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withImplicated(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.implicated == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        value,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withDetail(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "detail");
    if (java.util.Objects.equals(this.detail, newValue)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        newValue,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#detail() detail} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withDetail(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.detail, value)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        value,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        newValue,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        value,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        newValue,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        value,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        newValue,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        value,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        newValue,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        value,
        this.evidence,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#evidence() evidence} attribute.
   * @param value The value for evidence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withEvidence(java.util.List<com.fhir.DetectedIssue_Evidence> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Evidence> newValue = java.util.Objects.requireNonNull(value, "evidence");
    if (this.evidence == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        newValue,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#evidence() evidence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evidence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withEvidence(java.util.Optional<? extends java.util.List<com.fhir.DetectedIssue_Evidence>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Evidence> value = optional.orElse(null);
    if (this.evidence == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        value,
        this.resourceType,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DetectedIssue#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDetectedIssue withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        newValue,
        this.severity,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withSeverity(com.fhir.DetectedissueSeverity value) {
    @javax.annotation.Nullable com.fhir.DetectedissueSeverity newValue = java.util.Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        newValue,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withSeverity(java.util.Optional<? extends com.fhir.DetectedissueSeverity> optional) {
    @javax.annotation.Nullable com.fhir.DetectedissueSeverity value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        value,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableDetectedIssue(
        this.implicitRules,
        this.modifierExtension,
        this.contained,
        this.identifiedPeriod,
        this.reference,
        this.meta,
        this.code,
        this.patient,
        this.mitigation,
        this.status,
        this.identifiedDateTime,
        this.extension,
        this.implicated,
        this.detail,
        this.identifier,
        this.text,
        this.id,
        this.language,
        this.evidence,
        this.resourceType,
        this.severity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDetectedIssue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDetectedIssue
        && equalTo((ImmutableDetectedIssue) another);
  }

  private boolean equalTo(ImmutableDetectedIssue another) {
    return java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(identifiedPeriod, another.identifiedPeriod)
        && java.util.Objects.equals(reference, another.reference)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(patient, another.patient)
        && java.util.Objects.equals(mitigation, another.mitigation)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(identifiedDateTime, another.identifiedDateTime)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(implicated, another.implicated)
        && java.util.Objects.equals(detail, another.detail)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(evidence, another.evidence)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(severity, another.severity)
        && java.util.Objects.equals(author, another.author);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code modifierExtension}, {@code contained}, {@code identifiedPeriod}, {@code reference}, {@code meta}, {@code code}, {@code patient}, {@code mitigation}, {@code status}, {@code identifiedDateTime}, {@code extension}, {@code implicated}, {@code detail}, {@code identifier}, {@code text}, {@code id}, {@code language}, {@code evidence}, {@code resourceType}, {@code severity}, {@code author}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(identifiedPeriod);
    h += (h << 5) + java.util.Objects.hashCode(reference);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(patient);
    h += (h << 5) + java.util.Objects.hashCode(mitigation);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(identifiedDateTime);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(implicated);
    h += (h << 5) + java.util.Objects.hashCode(detail);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(evidence);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(severity);
    h += (h << 5) + java.util.Objects.hashCode(author);
    return h;
  }

  /**
   * Prints the immutable value {@code DetectedIssue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DetectedIssue{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifiedPeriod != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifiedPeriod=").append(identifiedPeriod);
    }
    if (reference != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reference=").append(reference);
    }
    if (meta != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (code != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (patient != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (mitigation != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("mitigation=").append(mitigation);
    }
    if (status != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (identifiedDateTime != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifiedDateTime=").append(identifiedDateTime);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (implicated != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicated=").append(implicated);
    }
    if (detail != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (identifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (evidence != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("evidence=").append(evidence);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (severity != null) {
      builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DetectedIssue", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DetectedIssue {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> identifiedPeriod = java.util.Optional.empty();
    boolean identifiedPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> reference = java.util.Optional.empty();
    boolean referenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> patient = java.util.Optional.empty();
    boolean patientIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DetectedIssue_Mitigation>> mitigation = java.util.Optional.empty();
    boolean mitigationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> identifiedDateTime = java.util.Optional.empty();
    boolean identifiedDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> implicated = java.util.Optional.empty();
    boolean implicatedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> detail = java.util.Optional.empty();
    boolean detailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DetectedIssue_Evidence>> evidence = java.util.Optional.empty();
    boolean evidenceIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DetectedissueSeverity> severity = java.util.Optional.empty();
    boolean severityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("identifiedPeriod")
    public void setIdentifiedPeriod(java.util.Optional<com.fhir.Period> identifiedPeriod) {
      this.identifiedPeriod = identifiedPeriod;
      this.identifiedPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public void setReference(java.util.Optional<com.fhir.uri> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(java.util.Optional<com.fhir.Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mitigation")
    public void setMitigation(java.util.Optional<java.util.List<com.fhir.DetectedIssue_Mitigation>> mitigation) {
      this.mitigation = mitigation;
      this.mitigationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifiedDateTime")
    public void setIdentifiedDateTime(java.util.Optional<java.lang.String> identifiedDateTime) {
      this.identifiedDateTime = identifiedDateTime;
      this.identifiedDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicated")
    public void setImplicated(java.util.Optional<java.util.List<com.fhir.Reference>> implicated) {
      this.implicated = implicated;
      this.implicatedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(java.util.Optional<java.lang.String> detail) {
      this.detail = detail;
      this.detailIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("evidence")
    public void setEvidence(java.util.Optional<java.util.List<com.fhir.DetectedIssue_Evidence>> evidence) {
      this.evidence = evidence;
      this.evidenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public void setSeverity(java.util.Optional<com.fhir.DetectedissueSeverity> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> identifiedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> reference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DetectedIssue_Mitigation>> mitigation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> identifiedDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> implicated() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> detail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DetectedIssue_Evidence>> evidence() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DetectedissueSeverity> severity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDetectedIssue fromJson(Json json) {
    ImmutableDetectedIssue.Builder builder = ((ImmutableDetectedIssue.Builder) ImmutableDetectedIssue.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifiedPeriodIsSet) {
      builder.identifiedPeriod(json.identifiedPeriod);
    }
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.mitigationIsSet) {
      builder.mitigation(json.mitigation);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.identifiedDateTimeIsSet) {
      builder.identifiedDateTime(json.identifiedDateTime);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.implicatedIsSet) {
      builder.implicated(json.implicated);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.evidenceIsSet) {
      builder.evidence(json.evidence);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    return (ImmutableDetectedIssue) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DetectedIssue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DetectedIssue instance
   */
  public static DetectedIssue copyOf(DetectedIssue instance) {
    if (instance instanceof ImmutableDetectedIssue) {
      return (ImmutableDetectedIssue) instance;
    }
    return ((ImmutableDetectedIssue.Builder) ImmutableDetectedIssue.builder())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .contained(instance.contained())
        .identifiedPeriod(instance.identifiedPeriod())
        .reference(instance.reference())
        .meta(instance.meta())
        .code(instance.code())
        .patient(instance.patient())
        .mitigation(instance.mitigation())
        .status(instance.status())
        .identifiedDateTime(instance.identifiedDateTime())
        .extension(instance.extension())
        .implicated(instance.implicated())
        .detail(instance.detail())
        .identifier(instance.identifier())
        .text(instance.text())
        .id(instance.id())
        .language(instance.language())
        .evidence(instance.evidence())
        .resourceType(instance.resourceType())
        .severity(instance.severity())
        .author(instance.author())
        .build();
  }

  /**
   * Creates a builder for {@link DetectedIssue DetectedIssue}.
   * <pre>
   * ImmutableDetectedIssue.builder()
   *    .implicitRules(com.fhir.uri) // optional {@link DetectedIssue#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DetectedIssue#modifierExtension() modifierExtension}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DetectedIssue#contained() contained}
   *    .identifiedPeriod(com.fhir.Period) // optional {@link DetectedIssue#identifiedPeriod() identifiedPeriod}
   *    .reference(com.fhir.uri) // optional {@link DetectedIssue#reference() reference}
   *    .meta(com.fhir.Meta) // optional {@link DetectedIssue#meta() meta}
   *    .code(com.fhir.CodeableConcept) // optional {@link DetectedIssue#code() code}
   *    .patient(com.fhir.Reference) // optional {@link DetectedIssue#patient() patient}
   *    .mitigation(List&amp;lt;com.fhir.DetectedIssue_Mitigation&amp;gt;) // optional {@link DetectedIssue#mitigation() mitigation}
   *    .status(com.fhir.code) // optional {@link DetectedIssue#status() status}
   *    .identifiedDateTime(String) // optional {@link DetectedIssue#identifiedDateTime() identifiedDateTime}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DetectedIssue#extension() extension}
   *    .implicated(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DetectedIssue#implicated() implicated}
   *    .detail(String) // optional {@link DetectedIssue#detail() detail}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DetectedIssue#identifier() identifier}
   *    .text(com.fhir.Narrative) // optional {@link DetectedIssue#text() text}
   *    .id(com.fhir.id) // optional {@link DetectedIssue#id() id}
   *    .language(com.fhir.code) // optional {@link DetectedIssue#language() language}
   *    .evidence(List&amp;lt;com.fhir.DetectedIssue_Evidence&amp;gt;) // optional {@link DetectedIssue#evidence() evidence}
   *    .resourceType(String) // required {@link DetectedIssue#resourceType() resourceType}
   *    .severity(com.fhir.DetectedissueSeverity) // optional {@link DetectedIssue#severity() severity}
   *    .author(com.fhir.Reference) // optional {@link DetectedIssue#author() author}
   *    .build();
   * </pre>
   * @return A new DetectedIssue builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDetectedIssue.Builder();
  }

  /**
   * Builds instances of type {@link DetectedIssue DetectedIssue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DetectedIssue", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_IDENTIFIED_PERIOD = 0x8L;
    private static final long OPT_BIT_REFERENCE = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_CODE = 0x40L;
    private static final long OPT_BIT_PATIENT = 0x80L;
    private static final long OPT_BIT_MITIGATION = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_IDENTIFIED_DATE_TIME = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_IMPLICATED = 0x1000L;
    private static final long OPT_BIT_DETAIL = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000L;
    private static final long OPT_BIT_EVIDENCE = 0x40000L;
    private static final long OPT_BIT_SEVERITY = 0x80000L;
    private static final long OPT_BIT_AUTHOR = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Period identifiedPeriod;
    private @javax.annotation.Nullable com.fhir.uri reference;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Mitigation> mitigation;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.lang.String identifiedDateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> implicated;
    private @javax.annotation.Nullable java.lang.String detail;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.DetectedIssue_Evidence> evidence;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.DetectedissueSeverity severity;
    private @javax.annotation.Nullable com.fhir.Reference author;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
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
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
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
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifiedPeriod(com.fhir.Period identifiedPeriod) {
      checkNotIsSet(identifiedPeriodIsSet(), "identifiedPeriod");
      this.identifiedPeriod = java.util.Objects.requireNonNull(identifiedPeriod, "identifiedPeriod");
      optBits |= OPT_BIT_IDENTIFIED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifiedPeriod")
    public final Builder identifiedPeriod(java.util.Optional<? extends com.fhir.Period> identifiedPeriod) {
      checkNotIsSet(identifiedPeriodIsSet(), "identifiedPeriod");
      this.identifiedPeriod = identifiedPeriod.orElse(null);
      optBits |= OPT_BIT_IDENTIFIED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(com.fhir.uri reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = java.util.Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public final Builder reference(java.util.Optional<? extends com.fhir.uri> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
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
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
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
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
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
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
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
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(java.util.Optional<? extends com.fhir.Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    public final Builder mitigation(java.util.List<com.fhir.DetectedIssue_Mitigation> mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = java.util.Objects.requireNonNull(mitigation, "mitigation");
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mitigation")
    public final Builder mitigation(java.util.Optional<? extends java.util.List<com.fhir.DetectedIssue_Mitigation>> mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = mitigation.orElse(null);
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
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
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
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
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifiedDateTime(java.lang.String identifiedDateTime) {
      checkNotIsSet(identifiedDateTimeIsSet(), "identifiedDateTime");
      this.identifiedDateTime = java.util.Objects.requireNonNull(identifiedDateTime, "identifiedDateTime");
      optBits |= OPT_BIT_IDENTIFIED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifiedDateTime")
    public final Builder identifiedDateTime(java.util.Optional<java.lang.String> identifiedDateTime) {
      checkNotIsSet(identifiedDateTimeIsSet(), "identifiedDateTime");
      this.identifiedDateTime = identifiedDateTime.orElse(null);
      optBits |= OPT_BIT_IDENTIFIED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
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
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
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
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicated(java.util.List<com.fhir.Reference> implicated) {
      checkNotIsSet(implicatedIsSet(), "implicated");
      this.implicated = java.util.Objects.requireNonNull(implicated, "implicated");
      optBits |= OPT_BIT_IMPLICATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicated")
    public final Builder implicated(java.util.Optional<? extends java.util.List<com.fhir.Reference>> implicated) {
      checkNotIsSet(implicatedIsSet(), "implicated");
      this.implicated = implicated.orElse(null);
      optBits |= OPT_BIT_IMPLICATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(java.lang.String detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = java.util.Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public final Builder detail(java.util.Optional<java.lang.String> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
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
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
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
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
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
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
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
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
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
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
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
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    public final Builder evidence(java.util.List<com.fhir.DetectedIssue_Evidence> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = java.util.Objects.requireNonNull(evidence, "evidence");
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evidence")
    public final Builder evidence(java.util.Optional<? extends java.util.List<com.fhir.DetectedIssue_Evidence>> evidence) {
      checkNotIsSet(evidenceIsSet(), "evidence");
      this.evidence = evidence.orElse(null);
      optBits |= OPT_BIT_EVIDENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link DetectedIssue#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(com.fhir.DetectedissueSeverity severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = java.util.Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public final Builder severity(java.util.Optional<? extends com.fhir.DetectedissueSeverity> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(com.fhir.Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Builds a new {@link DetectedIssue DetectedIssue}.
     * @return An immutable instance of DetectedIssue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DetectedIssue build() {
      checkRequiredAttributes();
      return new ImmutableDetectedIssue(
          implicitRules,
          modifierExtension,
          contained,
          identifiedPeriod,
          reference,
          meta,
          code,
          patient,
          mitigation,
          status,
          identifiedDateTime,
          extension,
          implicated,
          detail,
          identifier,
          text,
          id,
          language,
          evidence,
          resourceType,
          severity,
          author);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifiedPeriodIsSet() {
      return (optBits & OPT_BIT_IDENTIFIED_PERIOD) != 0;
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean mitigationIsSet() {
      return (optBits & OPT_BIT_MITIGATION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifiedDateTimeIsSet() {
      return (optBits & OPT_BIT_IDENTIFIED_DATE_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean implicatedIsSet() {
      return (optBits & OPT_BIT_IMPLICATED) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean evidenceIsSet() {
      return (optBits & OPT_BIT_EVIDENCE) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DetectedIssue is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DetectedIssue, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DetectedIssue", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DetectedIssue#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DetectedIssue", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DetectedIssue#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DetectedIssue#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DetectedIssue#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifiedPeriod(com.fhir.Period identifiedPeriod);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedPeriod() identifiedPeriod} to identifiedPeriod.
     * @param identifiedPeriod The value for identifiedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifiedPeriod(java.util.Optional<? extends com.fhir.Period> identifiedPeriod);

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reference(com.fhir.uri reference);

    /**
     * Initializes the optional value {@link DetectedIssue#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reference(java.util.Optional<? extends com.fhir.uri> reference);

    /**
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DetectedIssue#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link DetectedIssue#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);

    /**
     * Initializes the optional value {@link DetectedIssue#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(java.util.Optional<? extends com.fhir.Reference> patient);

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mitigation(java.util.List<com.fhir.DetectedIssue_Mitigation> mitigation);

    /**
     * Initializes the optional value {@link DetectedIssue#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mitigation(java.util.Optional<? extends java.util.List<com.fhir.DetectedIssue_Mitigation>> mitigation);

    /**
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link DetectedIssue#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifiedDateTime(java.lang.String identifiedDateTime);

    /**
     * Initializes the optional value {@link DetectedIssue#identifiedDateTime() identifiedDateTime} to identifiedDateTime.
     * @param identifiedDateTime The value for identifiedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifiedDateTime(java.util.Optional<java.lang.String> identifiedDateTime);

    /**
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DetectedIssue#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicated(java.util.List<com.fhir.Reference> implicated);

    /**
     * Initializes the optional value {@link DetectedIssue#implicated() implicated} to implicated.
     * @param implicated The value for implicated
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicated(java.util.Optional<? extends java.util.List<com.fhir.Reference>> implicated);

    /**
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(java.lang.String detail);

    /**
     * Initializes the optional value {@link DetectedIssue#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(java.util.Optional<java.lang.String> detail);

    /**
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DetectedIssue#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DetectedIssue#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DetectedIssue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DetectedIssue#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evidence(java.util.List<com.fhir.DetectedIssue_Evidence> evidence);

    /**
     * Initializes the optional value {@link DetectedIssue#evidence() evidence} to evidence.
     * @param evidence The value for evidence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evidence(java.util.Optional<? extends java.util.List<com.fhir.DetectedIssue_Evidence>> evidence);

    /**
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal severity(com.fhir.DetectedissueSeverity severity);

    /**
     * Initializes the optional value {@link DetectedIssue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal severity(java.util.Optional<? extends com.fhir.DetectedissueSeverity> severity);

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link DetectedIssue#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Builds a new {@link DetectedIssue DetectedIssue}.
     * @return An immutable instance of DetectedIssue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DetectedIssue build();
  }
}
