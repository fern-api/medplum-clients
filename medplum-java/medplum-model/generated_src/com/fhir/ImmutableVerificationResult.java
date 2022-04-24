//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link VerificationResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVerificationResult.builder()}.
 */
@org.immutables.value.Generated(from = "VerificationResult", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVerificationResult implements com.fhir.VerificationResult {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> target;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> targetLocation;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept validationType;
  private final @javax.annotation.Nullable com.fhir.Timing frequency;
  private final @javax.annotation.Nullable com.fhir.dateTime statusDate;
  private final @javax.annotation.Nullable com.fhir.VerificationResult_Attestation attestation;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> validationProcess;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_PrimarySource> primarySource;
  private final @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_Validator> validator;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.date nextScheduled;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept need;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept failureAction;
  private final @javax.annotation.Nullable com.fhir.dateTime lastPerformed;
  private final java.lang.String resourceType;

  private ImmutableVerificationResult(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> target,
      @javax.annotation.Nullable java.util.List<java.lang.String> targetLocation,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.CodeableConcept validationType,
      @javax.annotation.Nullable com.fhir.Timing frequency,
      @javax.annotation.Nullable com.fhir.dateTime statusDate,
      @javax.annotation.Nullable com.fhir.VerificationResult_Attestation attestation,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> validationProcess,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_PrimarySource> primarySource,
      @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_Validator> validator,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.date nextScheduled,
      @javax.annotation.Nullable com.fhir.CodeableConcept need,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept failureAction,
      @javax.annotation.Nullable com.fhir.dateTime lastPerformed,
      java.lang.String resourceType) {
    this.target = target;
    this.targetLocation = targetLocation;
    this.language = language;
    this.status = status;
    this.extension = extension;
    this.contained = contained;
    this.validationType = validationType;
    this.frequency = frequency;
    this.statusDate = statusDate;
    this.attestation = attestation;
    this.text = text;
    this.validationProcess = validationProcess;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.primarySource = primarySource;
    this.validator = validator;
    this.id = id;
    this.nextScheduled = nextScheduled;
    this.need = need;
    this.meta = meta;
    this.failureAction = failureAction;
    this.lastPerformed = lastPerformed;
    this.resourceType = resourceType;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> target() {
    return java.util.Optional.ofNullable(target);
  }

  /**
   * @return The value of the {@code targetLocation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetLocation")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> targetLocation() {
    return java.util.Optional.ofNullable(targetLocation);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code validationType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validationType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> validationType() {
    return java.util.Optional.ofNullable(validationType);
  }

  /**
   * @return The value of the {@code frequency} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("frequency")
  @Override
  public java.util.Optional<com.fhir.Timing> frequency() {
    return java.util.Optional.ofNullable(frequency);
  }

  /**
   * @return The value of the {@code statusDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> statusDate() {
    return java.util.Optional.ofNullable(statusDate);
  }

  /**
   * @return The value of the {@code attestation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("attestation")
  @Override
  public java.util.Optional<com.fhir.VerificationResult_Attestation> attestation() {
    return java.util.Optional.ofNullable(attestation);
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
   * @return The value of the {@code validationProcess} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validationProcess")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> validationProcess() {
    return java.util.Optional.ofNullable(validationProcess);
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
   * @return The value of the {@code primarySource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("primarySource")
  @Override
  public java.util.Optional<java.util.List<com.fhir.VerificationResult_PrimarySource>> primarySource() {
    return java.util.Optional.ofNullable(primarySource);
  }

  /**
   * @return The value of the {@code validator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validator")
  @Override
  public java.util.Optional<java.util.List<com.fhir.VerificationResult_Validator>> validator() {
    return java.util.Optional.ofNullable(validator);
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
   * @return The value of the {@code nextScheduled} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("nextScheduled")
  @Override
  public java.util.Optional<com.fhir.date> nextScheduled() {
    return java.util.Optional.ofNullable(nextScheduled);
  }

  /**
   * @return The value of the {@code need} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("need")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> need() {
    return java.util.Optional.ofNullable(need);
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
   * @return The value of the {@code failureAction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("failureAction")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> failureAction() {
    return java.util.Optional.ofNullable(failureAction);
  }

  /**
   * @return The value of the {@code lastPerformed} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastPerformed")
  @Override
  public java.util.Optional<com.fhir.dateTime> lastPerformed() {
    return java.util.Optional.ofNullable(lastPerformed);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withTarget(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableVerificationResult(
        newValue,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withTarget(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableVerificationResult(
        value,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#targetLocation() targetLocation} attribute.
   * @param value The value for targetLocation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withTargetLocation(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "targetLocation");
    if (this.targetLocation == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        newValue,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#targetLocation() targetLocation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetLocation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withTargetLocation(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.targetLocation == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        value,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        newValue,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        value,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        newValue,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        value,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        newValue,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        value,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        newValue,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        value,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#validationType() validationType} attribute.
   * @param value The value for validationType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withValidationType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "validationType");
    if (this.validationType == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        newValue,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#validationType() validationType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withValidationType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.validationType == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        value,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#frequency() frequency} attribute.
   * @param value The value for frequency
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withFrequency(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "frequency");
    if (this.frequency == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        newValue,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#frequency() frequency} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequency
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withFrequency(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.frequency == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        value,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#statusDate() statusDate} attribute.
   * @param value The value for statusDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withStatusDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "statusDate");
    if (this.statusDate == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        newValue,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#statusDate() statusDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withStatusDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.statusDate == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        value,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#attestation() attestation} attribute.
   * @param value The value for attestation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withAttestation(com.fhir.VerificationResult_Attestation value) {
    @javax.annotation.Nullable com.fhir.VerificationResult_Attestation newValue = java.util.Objects.requireNonNull(value, "attestation");
    if (this.attestation == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        newValue,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#attestation() attestation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attestation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withAttestation(java.util.Optional<? extends com.fhir.VerificationResult_Attestation> optional) {
    @javax.annotation.Nullable com.fhir.VerificationResult_Attestation value = optional.orElse(null);
    if (this.attestation == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        value,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        newValue,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        value,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#validationProcess() validationProcess} attribute.
   * @param value The value for validationProcess
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withValidationProcess(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "validationProcess");
    if (this.validationProcess == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#validationProcess() validationProcess} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationProcess
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withValidationProcess(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.validationProcess == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        newValue,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        value,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        newValue,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        value,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#primarySource() primarySource} attribute.
   * @param value The value for primarySource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withPrimarySource(java.util.List<com.fhir.VerificationResult_PrimarySource> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_PrimarySource> newValue = java.util.Objects.requireNonNull(value, "primarySource");
    if (this.primarySource == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#primarySource() primarySource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for primarySource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withPrimarySource(java.util.Optional<? extends java.util.List<com.fhir.VerificationResult_PrimarySource>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_PrimarySource> value = optional.orElse(null);
    if (this.primarySource == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#validator() validator} attribute.
   * @param value The value for validator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withValidator(java.util.List<com.fhir.VerificationResult_Validator> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_Validator> newValue = java.util.Objects.requireNonNull(value, "validator");
    if (this.validator == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        newValue,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#validator() validator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withValidator(java.util.Optional<? extends java.util.List<com.fhir.VerificationResult_Validator>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_Validator> value = optional.orElse(null);
    if (this.validator == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        value,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        newValue,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        value,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#nextScheduled() nextScheduled} attribute.
   * @param value The value for nextScheduled
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withNextScheduled(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "nextScheduled");
    if (this.nextScheduled == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        newValue,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#nextScheduled() nextScheduled} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nextScheduled
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withNextScheduled(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.nextScheduled == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        value,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#need() need} attribute.
   * @param value The value for need
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withNeed(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "need");
    if (this.need == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        newValue,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#need() need} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for need
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withNeed(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.need == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        value,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        newValue,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        value,
        this.failureAction,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#failureAction() failureAction} attribute.
   * @param value The value for failureAction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withFailureAction(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "failureAction");
    if (this.failureAction == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        newValue,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#failureAction() failureAction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for failureAction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withFailureAction(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.failureAction == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        value,
        this.lastPerformed,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#lastPerformed() lastPerformed} attribute.
   * @param value The value for lastPerformed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withLastPerformed(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "lastPerformed");
    if (this.lastPerformed == newValue) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#lastPerformed() lastPerformed} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastPerformed
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withLastPerformed(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.lastPerformed == value) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VerificationResult#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVerificationResult withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableVerificationResult(
        this.target,
        this.targetLocation,
        this.language,
        this.status,
        this.extension,
        this.contained,
        this.validationType,
        this.frequency,
        this.statusDate,
        this.attestation,
        this.text,
        this.validationProcess,
        this.implicitRules,
        this.modifierExtension,
        this.primarySource,
        this.validator,
        this.id,
        this.nextScheduled,
        this.need,
        this.meta,
        this.failureAction,
        this.lastPerformed,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVerificationResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVerificationResult
        && equalTo((ImmutableVerificationResult) another);
  }

  private boolean equalTo(ImmutableVerificationResult another) {
    return java.util.Objects.equals(target, another.target)
        && java.util.Objects.equals(targetLocation, another.targetLocation)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(validationType, another.validationType)
        && java.util.Objects.equals(frequency, another.frequency)
        && java.util.Objects.equals(statusDate, another.statusDate)
        && java.util.Objects.equals(attestation, another.attestation)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(validationProcess, another.validationProcess)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(primarySource, another.primarySource)
        && java.util.Objects.equals(validator, another.validator)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(nextScheduled, another.nextScheduled)
        && java.util.Objects.equals(need, another.need)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(failureAction, another.failureAction)
        && java.util.Objects.equals(lastPerformed, another.lastPerformed)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code target}, {@code targetLocation}, {@code language}, {@code status}, {@code extension}, {@code contained}, {@code validationType}, {@code frequency}, {@code statusDate}, {@code attestation}, {@code text}, {@code validationProcess}, {@code implicitRules}, {@code modifierExtension}, {@code primarySource}, {@code validator}, {@code id}, {@code nextScheduled}, {@code need}, {@code meta}, {@code failureAction}, {@code lastPerformed}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(target);
    h += (h << 5) + java.util.Objects.hashCode(targetLocation);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(validationType);
    h += (h << 5) + java.util.Objects.hashCode(frequency);
    h += (h << 5) + java.util.Objects.hashCode(statusDate);
    h += (h << 5) + java.util.Objects.hashCode(attestation);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(validationProcess);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(primarySource);
    h += (h << 5) + java.util.Objects.hashCode(validator);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(nextScheduled);
    h += (h << 5) + java.util.Objects.hashCode(need);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(failureAction);
    h += (h << 5) + java.util.Objects.hashCode(lastPerformed);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("VerificationResult{");
    if (target != null) {
      builder.append("target=").append(target);
    }
    if (targetLocation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("targetLocation=").append(targetLocation);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (validationType != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("validationType=").append(validationType);
    }
    if (frequency != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("frequency=").append(frequency);
    }
    if (statusDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("statusDate=").append(statusDate);
    }
    if (attestation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("attestation=").append(attestation);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (validationProcess != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("validationProcess=").append(validationProcess);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (primarySource != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("primarySource=").append(primarySource);
    }
    if (validator != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("validator=").append(validator);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (nextScheduled != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("nextScheduled=").append(nextScheduled);
    }
    if (need != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("need=").append(need);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (failureAction != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("failureAction=").append(failureAction);
    }
    if (lastPerformed != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("lastPerformed=").append(lastPerformed);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "VerificationResult", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.VerificationResult {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> target = java.util.Optional.empty();
    boolean targetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> targetLocation = java.util.Optional.empty();
    boolean targetLocationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> validationType = java.util.Optional.empty();
    boolean validationTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> frequency = java.util.Optional.empty();
    boolean frequencyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> statusDate = java.util.Optional.empty();
    boolean statusDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.VerificationResult_Attestation> attestation = java.util.Optional.empty();
    boolean attestationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> validationProcess = java.util.Optional.empty();
    boolean validationProcessIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.VerificationResult_PrimarySource>> primarySource = java.util.Optional.empty();
    boolean primarySourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.VerificationResult_Validator>> validator = java.util.Optional.empty();
    boolean validatorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> nextScheduled = java.util.Optional.empty();
    boolean nextScheduledIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> need = java.util.Optional.empty();
    boolean needIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> failureAction = java.util.Optional.empty();
    boolean failureActionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> lastPerformed = java.util.Optional.empty();
    boolean lastPerformedIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public void setTarget(java.util.Optional<java.util.List<com.fhir.Reference>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetLocation")
    public void setTargetLocation(java.util.Optional<java.util.List<java.lang.String>> targetLocation) {
      this.targetLocation = targetLocation;
      this.targetLocationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validationType")
    public void setValidationType(java.util.Optional<com.fhir.CodeableConcept> validationType) {
      this.validationType = validationType;
      this.validationTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    public void setFrequency(java.util.Optional<com.fhir.Timing> frequency) {
      this.frequency = frequency;
      this.frequencyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public void setStatusDate(java.util.Optional<com.fhir.dateTime> statusDate) {
      this.statusDate = statusDate;
      this.statusDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("attestation")
    public void setAttestation(java.util.Optional<com.fhir.VerificationResult_Attestation> attestation) {
      this.attestation = attestation;
      this.attestationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validationProcess")
    public void setValidationProcess(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> validationProcess) {
      this.validationProcess = validationProcess;
      this.validationProcessIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("primarySource")
    public void setPrimarySource(java.util.Optional<java.util.List<com.fhir.VerificationResult_PrimarySource>> primarySource) {
      this.primarySource = primarySource;
      this.primarySourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validator")
    public void setValidator(java.util.Optional<java.util.List<com.fhir.VerificationResult_Validator>> validator) {
      this.validator = validator;
      this.validatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("nextScheduled")
    public void setNextScheduled(java.util.Optional<com.fhir.date> nextScheduled) {
      this.nextScheduled = nextScheduled;
      this.nextScheduledIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("need")
    public void setNeed(java.util.Optional<com.fhir.CodeableConcept> need) {
      this.need = need;
      this.needIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("failureAction")
    public void setFailureAction(java.util.Optional<com.fhir.CodeableConcept> failureAction) {
      this.failureAction = failureAction;
      this.failureActionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastPerformed")
    public void setLastPerformed(java.util.Optional<com.fhir.dateTime> lastPerformed) {
      this.lastPerformed = lastPerformed;
      this.lastPerformedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> target() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> targetLocation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> validationType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> frequency() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> statusDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.VerificationResult_Attestation> attestation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> validationProcess() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.VerificationResult_PrimarySource>> primarySource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.VerificationResult_Validator>> validator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> nextScheduled() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> need() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> failureAction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> lastPerformed() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableVerificationResult fromJson(Json json) {
    ImmutableVerificationResult.Builder builder = ((ImmutableVerificationResult.Builder) ImmutableVerificationResult.builder());
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.targetLocationIsSet) {
      builder.targetLocation(json.targetLocation);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.validationTypeIsSet) {
      builder.validationType(json.validationType);
    }
    if (json.frequencyIsSet) {
      builder.frequency(json.frequency);
    }
    if (json.statusDateIsSet) {
      builder.statusDate(json.statusDate);
    }
    if (json.attestationIsSet) {
      builder.attestation(json.attestation);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.validationProcessIsSet) {
      builder.validationProcess(json.validationProcess);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.primarySourceIsSet) {
      builder.primarySource(json.primarySource);
    }
    if (json.validatorIsSet) {
      builder.validator(json.validator);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nextScheduledIsSet) {
      builder.nextScheduled(json.nextScheduled);
    }
    if (json.needIsSet) {
      builder.need(json.need);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.failureActionIsSet) {
      builder.failureAction(json.failureAction);
    }
    if (json.lastPerformedIsSet) {
      builder.lastPerformed(json.lastPerformed);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableVerificationResult) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VerificationResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VerificationResult instance
   */
  public static VerificationResult copyOf(VerificationResult instance) {
    if (instance instanceof ImmutableVerificationResult) {
      return (ImmutableVerificationResult) instance;
    }
    return ((ImmutableVerificationResult.Builder) ImmutableVerificationResult.builder())
        .target(instance.target())
        .targetLocation(instance.targetLocation())
        .language(instance.language())
        .status(instance.status())
        .extension(instance.extension())
        .contained(instance.contained())
        .validationType(instance.validationType())
        .frequency(instance.frequency())
        .statusDate(instance.statusDate())
        .attestation(instance.attestation())
        .text(instance.text())
        .validationProcess(instance.validationProcess())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .primarySource(instance.primarySource())
        .validator(instance.validator())
        .id(instance.id())
        .nextScheduled(instance.nextScheduled())
        .need(instance.need())
        .meta(instance.meta())
        .failureAction(instance.failureAction())
        .lastPerformed(instance.lastPerformed())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult VerificationResult}.
   * <pre>
   * ImmutableVerificationResult.builder()
   *    .target(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link VerificationResult#target() target}
   *    .targetLocation(List&amp;lt;String&amp;gt;) // optional {@link VerificationResult#targetLocation() targetLocation}
   *    .language(com.fhir.code) // optional {@link VerificationResult#language() language}
   *    .status(com.fhir.code) // optional {@link VerificationResult#status() status}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VerificationResult#extension() extension}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link VerificationResult#contained() contained}
   *    .validationType(com.fhir.CodeableConcept) // optional {@link VerificationResult#validationType() validationType}
   *    .frequency(com.fhir.Timing) // optional {@link VerificationResult#frequency() frequency}
   *    .statusDate(com.fhir.dateTime) // optional {@link VerificationResult#statusDate() statusDate}
   *    .attestation(com.fhir.VerificationResult_Attestation) // optional {@link VerificationResult#attestation() attestation}
   *    .text(com.fhir.Narrative) // optional {@link VerificationResult#text() text}
   *    .validationProcess(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult#validationProcess() validationProcess}
   *    .implicitRules(com.fhir.uri) // optional {@link VerificationResult#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VerificationResult#modifierExtension() modifierExtension}
   *    .primarySource(List&amp;lt;com.fhir.VerificationResult_PrimarySource&amp;gt;) // optional {@link VerificationResult#primarySource() primarySource}
   *    .validator(List&amp;lt;com.fhir.VerificationResult_Validator&amp;gt;) // optional {@link VerificationResult#validator() validator}
   *    .id(com.fhir.id) // optional {@link VerificationResult#id() id}
   *    .nextScheduled(com.fhir.date) // optional {@link VerificationResult#nextScheduled() nextScheduled}
   *    .need(com.fhir.CodeableConcept) // optional {@link VerificationResult#need() need}
   *    .meta(com.fhir.Meta) // optional {@link VerificationResult#meta() meta}
   *    .failureAction(com.fhir.CodeableConcept) // optional {@link VerificationResult#failureAction() failureAction}
   *    .lastPerformed(com.fhir.dateTime) // optional {@link VerificationResult#lastPerformed() lastPerformed}
   *    .resourceType(String) // required {@link VerificationResult#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new VerificationResult builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableVerificationResult.Builder();
  }

  /**
   * Builds instances of type {@link VerificationResult VerificationResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "VerificationResult", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TARGET = 0x1L;
    private static final long OPT_BIT_TARGET_LOCATION = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_VALIDATION_TYPE = 0x40L;
    private static final long OPT_BIT_FREQUENCY = 0x80L;
    private static final long OPT_BIT_STATUS_DATE = 0x100L;
    private static final long OPT_BIT_ATTESTATION = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_VALIDATION_PROCESS = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_PRIMARY_SOURCE = 0x4000L;
    private static final long OPT_BIT_VALIDATOR = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_NEXT_SCHEDULED = 0x20000L;
    private static final long OPT_BIT_NEED = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_FAILURE_ACTION = 0x100000L;
    private static final long OPT_BIT_LAST_PERFORMED = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> target;
    private @javax.annotation.Nullable java.util.List<java.lang.String> targetLocation;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept validationType;
    private @javax.annotation.Nullable com.fhir.Timing frequency;
    private @javax.annotation.Nullable com.fhir.dateTime statusDate;
    private @javax.annotation.Nullable com.fhir.VerificationResult_Attestation attestation;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> validationProcess;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_PrimarySource> primarySource;
    private @javax.annotation.Nullable java.util.List<com.fhir.VerificationResult_Validator> validator;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.date nextScheduled;
    private @javax.annotation.Nullable com.fhir.CodeableConcept need;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept failureAction;
    private @javax.annotation.Nullable com.fhir.dateTime lastPerformed;
    private @javax.annotation.Nullable java.lang.String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(java.util.List<com.fhir.Reference> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = java.util.Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public final Builder target(java.util.Optional<? extends java.util.List<com.fhir.Reference>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetLocation(java.util.List<java.lang.String> targetLocation) {
      checkNotIsSet(targetLocationIsSet(), "targetLocation");
      this.targetLocation = java.util.Objects.requireNonNull(targetLocation, "targetLocation");
      optBits |= OPT_BIT_TARGET_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetLocation")
    public final Builder targetLocation(java.util.Optional<? extends java.util.List<java.lang.String>> targetLocation) {
      checkNotIsSet(targetLocationIsSet(), "targetLocation");
      this.targetLocation = targetLocation.orElse(null);
      optBits |= OPT_BIT_TARGET_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#language() language} to language.
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
     * Initializes the optional value {@link VerificationResult#language() language} to language.
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
     * Initializes the optional value {@link VerificationResult#status() status} to status.
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
     * Initializes the optional value {@link VerificationResult#status() status} to status.
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
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
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
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
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
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationType(com.fhir.CodeableConcept validationType) {
      checkNotIsSet(validationTypeIsSet(), "validationType");
      this.validationType = java.util.Objects.requireNonNull(validationType, "validationType");
      optBits |= OPT_BIT_VALIDATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validationType")
    public final Builder validationType(java.util.Optional<? extends com.fhir.CodeableConcept> validationType) {
      checkNotIsSet(validationTypeIsSet(), "validationType");
      this.validationType = validationType.orElse(null);
      optBits |= OPT_BIT_VALIDATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequency(com.fhir.Timing frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = java.util.Objects.requireNonNull(frequency, "frequency");
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    public final Builder frequency(java.util.Optional<? extends com.fhir.Timing> frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = frequency.orElse(null);
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusDate(com.fhir.dateTime statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = java.util.Objects.requireNonNull(statusDate, "statusDate");
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public final Builder statusDate(java.util.Optional<? extends com.fhir.dateTime> statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = statusDate.orElse(null);
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for chained invocation
     */
    public final Builder attestation(com.fhir.VerificationResult_Attestation attestation) {
      checkNotIsSet(attestationIsSet(), "attestation");
      this.attestation = java.util.Objects.requireNonNull(attestation, "attestation");
      optBits |= OPT_BIT_ATTESTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attestation")
    public final Builder attestation(java.util.Optional<? extends com.fhir.VerificationResult_Attestation> attestation) {
      checkNotIsSet(attestationIsSet(), "attestation");
      this.attestation = attestation.orElse(null);
      optBits |= OPT_BIT_ATTESTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#text() text} to text.
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
     * Initializes the optional value {@link VerificationResult#text() text} to text.
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
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationProcess(java.util.List<com.fhir.CodeableConcept> validationProcess) {
      checkNotIsSet(validationProcessIsSet(), "validationProcess");
      this.validationProcess = java.util.Objects.requireNonNull(validationProcess, "validationProcess");
      optBits |= OPT_BIT_VALIDATION_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validationProcess")
    public final Builder validationProcess(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> validationProcess) {
      checkNotIsSet(validationProcessIsSet(), "validationProcess");
      this.validationProcess = validationProcess.orElse(null);
      optBits |= OPT_BIT_VALIDATION_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for chained invocation
     */
    public final Builder primarySource(java.util.List<com.fhir.VerificationResult_PrimarySource> primarySource) {
      checkNotIsSet(primarySourceIsSet(), "primarySource");
      this.primarySource = java.util.Objects.requireNonNull(primarySource, "primarySource");
      optBits |= OPT_BIT_PRIMARY_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primarySource")
    public final Builder primarySource(java.util.Optional<? extends java.util.List<com.fhir.VerificationResult_PrimarySource>> primarySource) {
      checkNotIsSet(primarySourceIsSet(), "primarySource");
      this.primarySource = primarySource.orElse(null);
      optBits |= OPT_BIT_PRIMARY_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for chained invocation
     */
    public final Builder validator(java.util.List<com.fhir.VerificationResult_Validator> validator) {
      checkNotIsSet(validatorIsSet(), "validator");
      this.validator = java.util.Objects.requireNonNull(validator, "validator");
      optBits |= OPT_BIT_VALIDATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validator")
    public final Builder validator(java.util.Optional<? extends java.util.List<com.fhir.VerificationResult_Validator>> validator) {
      checkNotIsSet(validatorIsSet(), "validator");
      this.validator = validator.orElse(null);
      optBits |= OPT_BIT_VALIDATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for chained invocation
     */
    public final Builder nextScheduled(com.fhir.date nextScheduled) {
      checkNotIsSet(nextScheduledIsSet(), "nextScheduled");
      this.nextScheduled = java.util.Objects.requireNonNull(nextScheduled, "nextScheduled");
      optBits |= OPT_BIT_NEXT_SCHEDULED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextScheduled")
    public final Builder nextScheduled(java.util.Optional<? extends com.fhir.date> nextScheduled) {
      checkNotIsSet(nextScheduledIsSet(), "nextScheduled");
      this.nextScheduled = nextScheduled.orElse(null);
      optBits |= OPT_BIT_NEXT_SCHEDULED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for chained invocation
     */
    public final Builder need(com.fhir.CodeableConcept need) {
      checkNotIsSet(needIsSet(), "need");
      this.need = java.util.Objects.requireNonNull(need, "need");
      optBits |= OPT_BIT_NEED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("need")
    public final Builder need(java.util.Optional<? extends com.fhir.CodeableConcept> need) {
      checkNotIsSet(needIsSet(), "need");
      this.need = need.orElse(null);
      optBits |= OPT_BIT_NEED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
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
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
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
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for chained invocation
     */
    public final Builder failureAction(com.fhir.CodeableConcept failureAction) {
      checkNotIsSet(failureActionIsSet(), "failureAction");
      this.failureAction = java.util.Objects.requireNonNull(failureAction, "failureAction");
      optBits |= OPT_BIT_FAILURE_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureAction")
    public final Builder failureAction(java.util.Optional<? extends com.fhir.CodeableConcept> failureAction) {
      checkNotIsSet(failureActionIsSet(), "failureAction");
      this.failureAction = failureAction.orElse(null);
      optBits |= OPT_BIT_FAILURE_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastPerformed(com.fhir.dateTime lastPerformed) {
      checkNotIsSet(lastPerformedIsSet(), "lastPerformed");
      this.lastPerformed = java.util.Objects.requireNonNull(lastPerformed, "lastPerformed");
      optBits |= OPT_BIT_LAST_PERFORMED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastPerformed")
    public final Builder lastPerformed(java.util.Optional<? extends com.fhir.dateTime> lastPerformed) {
      checkNotIsSet(lastPerformedIsSet(), "lastPerformed");
      this.lastPerformed = lastPerformed.orElse(null);
      optBits |= OPT_BIT_LAST_PERFORMED;
      return this;
    }

    /**
     * Initializes the value for the {@link VerificationResult#resourceType() resourceType} attribute.
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
     * Builds a new {@link VerificationResult VerificationResult}.
     * @return An immutable instance of VerificationResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.VerificationResult build() {
      checkRequiredAttributes();
      return new ImmutableVerificationResult(
          target,
          targetLocation,
          language,
          status,
          extension,
          contained,
          validationType,
          frequency,
          statusDate,
          attestation,
          text,
          validationProcess,
          implicitRules,
          modifierExtension,
          primarySource,
          validator,
          id,
          nextScheduled,
          need,
          meta,
          failureAction,
          lastPerformed,
          resourceType);
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean targetLocationIsSet() {
      return (optBits & OPT_BIT_TARGET_LOCATION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean validationTypeIsSet() {
      return (optBits & OPT_BIT_VALIDATION_TYPE) != 0;
    }

    private boolean frequencyIsSet() {
      return (optBits & OPT_BIT_FREQUENCY) != 0;
    }

    private boolean statusDateIsSet() {
      return (optBits & OPT_BIT_STATUS_DATE) != 0;
    }

    private boolean attestationIsSet() {
      return (optBits & OPT_BIT_ATTESTATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean validationProcessIsSet() {
      return (optBits & OPT_BIT_VALIDATION_PROCESS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean primarySourceIsSet() {
      return (optBits & OPT_BIT_PRIMARY_SOURCE) != 0;
    }

    private boolean validatorIsSet() {
      return (optBits & OPT_BIT_VALIDATOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nextScheduledIsSet() {
      return (optBits & OPT_BIT_NEXT_SCHEDULED) != 0;
    }

    private boolean needIsSet() {
      return (optBits & OPT_BIT_NEED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean failureActionIsSet() {
      return (optBits & OPT_BIT_FAILURE_ACTION) != 0;
    }

    private boolean lastPerformedIsSet() {
      return (optBits & OPT_BIT_LAST_PERFORMED) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of VerificationResult is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build VerificationResult, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "VerificationResult", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link VerificationResult#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "VerificationResult", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(java.util.List<com.fhir.Reference> target);

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(java.util.Optional<? extends java.util.List<com.fhir.Reference>> target);

    /**
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetLocation(java.util.List<java.lang.String> targetLocation);

    /**
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetLocation(java.util.Optional<? extends java.util.List<java.lang.String>> targetLocation);

    /**
     * Initializes the optional value {@link VerificationResult#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link VerificationResult#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link VerificationResult#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link VerificationResult#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validationType(com.fhir.CodeableConcept validationType);

    /**
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validationType(java.util.Optional<? extends com.fhir.CodeableConcept> validationType);

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for chained invocation
     */
    BuildFinal frequency(com.fhir.Timing frequency);

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal frequency(java.util.Optional<? extends com.fhir.Timing> frequency);

    /**
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusDate(com.fhir.dateTime statusDate);

    /**
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusDate(java.util.Optional<? extends com.fhir.dateTime> statusDate);

    /**
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal attestation(com.fhir.VerificationResult_Attestation attestation);

    /**
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attestation(java.util.Optional<? extends com.fhir.VerificationResult_Attestation> attestation);

    /**
     * Initializes the optional value {@link VerificationResult#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link VerificationResult#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validationProcess(java.util.List<com.fhir.CodeableConcept> validationProcess);

    /**
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validationProcess(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> validationProcess);

    /**
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal primarySource(java.util.List<com.fhir.VerificationResult_PrimarySource> primarySource);

    /**
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal primarySource(java.util.Optional<? extends java.util.List<com.fhir.VerificationResult_PrimarySource>> primarySource);

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validator(java.util.List<com.fhir.VerificationResult_Validator> validator);

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validator(java.util.Optional<? extends java.util.List<com.fhir.VerificationResult_Validator>> validator);

    /**
     * Initializes the optional value {@link VerificationResult#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link VerificationResult#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for chained invocation
     */
    BuildFinal nextScheduled(com.fhir.date nextScheduled);

    /**
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal nextScheduled(java.util.Optional<? extends com.fhir.date> nextScheduled);

    /**
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for chained invocation
     */
    BuildFinal need(com.fhir.CodeableConcept need);

    /**
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal need(java.util.Optional<? extends com.fhir.CodeableConcept> need);

    /**
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal failureAction(com.fhir.CodeableConcept failureAction);

    /**
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal failureAction(java.util.Optional<? extends com.fhir.CodeableConcept> failureAction);

    /**
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastPerformed(com.fhir.dateTime lastPerformed);

    /**
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastPerformed(java.util.Optional<? extends com.fhir.dateTime> lastPerformed);

    /**
     * Builds a new {@link VerificationResult VerificationResult}.
     * @return An immutable instance of VerificationResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    VerificationResult build();
  }
}
