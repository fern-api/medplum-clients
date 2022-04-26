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
 * Immutable implementation of {@link VerificationResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVerificationResult.builder()}.
 */
@Generated(from = "VerificationResult", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVerificationResult implements VerificationResult {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable VerificationResult_Attestation attestation;
  private final @Nullable CodeableConcept validationType;
  private final @Nullable Code language;
  private final @Nullable Date nextScheduled;
  private final @Nullable Narrative text;
  private final @Nullable DateTime lastPerformed;
  private final @Nullable List<VerificationResult_Validator> validator;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<VerificationResult_PrimarySource> primarySource;
  private final @Nullable List<CodeableConcept> validationProcess;
  private final String resourceType;
  private final @Nullable DateTime statusDate;
  private final @Nullable Timing frequency;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<String> targetLocation;
  private final @Nullable CodeableConcept failureAction;
  private final @Nullable List<Reference> target;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept need;
  private final @Nullable Code status;

  private ImmutableVerificationResult(
      @Nullable List<Extension> modifierExtension,
      @Nullable VerificationResult_Attestation attestation,
      @Nullable CodeableConcept validationType,
      @Nullable Code language,
      @Nullable Date nextScheduled,
      @Nullable Narrative text,
      @Nullable DateTime lastPerformed,
      @Nullable List<VerificationResult_Validator> validator,
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable Uri implicitRules,
      @Nullable List<VerificationResult_PrimarySource> primarySource,
      @Nullable List<CodeableConcept> validationProcess,
      String resourceType,
      @Nullable DateTime statusDate,
      @Nullable Timing frequency,
      @Nullable List<ResourceList> contained,
      @Nullable List<String> targetLocation,
      @Nullable CodeableConcept failureAction,
      @Nullable List<Reference> target,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept need,
      @Nullable Code status) {
    this.modifierExtension = modifierExtension;
    this.attestation = attestation;
    this.validationType = validationType;
    this.language = language;
    this.nextScheduled = nextScheduled;
    this.text = text;
    this.lastPerformed = lastPerformed;
    this.validator = validator;
    this.meta = meta;
    this.id = id;
    this.implicitRules = implicitRules;
    this.primarySource = primarySource;
    this.validationProcess = validationProcess;
    this.resourceType = resourceType;
    this.statusDate = statusDate;
    this.frequency = frequency;
    this.contained = contained;
    this.targetLocation = targetLocation;
    this.failureAction = failureAction;
    this.target = target;
    this.extension = extension;
    this.need = need;
    this.status = status;
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
   * @return The value of the {@code attestation} attribute
   */
  @JsonProperty("attestation")
  @Override
  public Optional<VerificationResult_Attestation> attestation() {
    return Optional.ofNullable(attestation);
  }

  /**
   * @return The value of the {@code validationType} attribute
   */
  @JsonProperty("validationType")
  @Override
  public Optional<CodeableConcept> validationType() {
    return Optional.ofNullable(validationType);
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
   * @return The value of the {@code nextScheduled} attribute
   */
  @JsonProperty("nextScheduled")
  @Override
  public Optional<Date> nextScheduled() {
    return Optional.ofNullable(nextScheduled);
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
   * @return The value of the {@code lastPerformed} attribute
   */
  @JsonProperty("lastPerformed")
  @Override
  public Optional<DateTime> lastPerformed() {
    return Optional.ofNullable(lastPerformed);
  }

  /**
   * @return The value of the {@code validator} attribute
   */
  @JsonProperty("validator")
  @Override
  public Optional<List<VerificationResult_Validator>> validator() {
    return Optional.ofNullable(validator);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code primarySource} attribute
   */
  @JsonProperty("primarySource")
  @Override
  public Optional<List<VerificationResult_PrimarySource>> primarySource() {
    return Optional.ofNullable(primarySource);
  }

  /**
   * @return The value of the {@code validationProcess} attribute
   */
  @JsonProperty("validationProcess")
  @Override
  public Optional<List<CodeableConcept>> validationProcess() {
    return Optional.ofNullable(validationProcess);
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
   * @return The value of the {@code statusDate} attribute
   */
  @JsonProperty("statusDate")
  @Override
  public Optional<DateTime> statusDate() {
    return Optional.ofNullable(statusDate);
  }

  /**
   * @return The value of the {@code frequency} attribute
   */
  @JsonProperty("frequency")
  @Override
  public Optional<Timing> frequency() {
    return Optional.ofNullable(frequency);
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
   * @return The value of the {@code targetLocation} attribute
   */
  @JsonProperty("targetLocation")
  @Override
  public Optional<List<String>> targetLocation() {
    return Optional.ofNullable(targetLocation);
  }

  /**
   * @return The value of the {@code failureAction} attribute
   */
  @JsonProperty("failureAction")
  @Override
  public Optional<CodeableConcept> failureAction() {
    return Optional.ofNullable(failureAction);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<Reference>> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code need} attribute
   */
  @JsonProperty("need")
  @Override
  public Optional<CodeableConcept> need() {
    return Optional.ofNullable(need);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVerificationResult(
        newValue,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVerificationResult(
        value,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#attestation() attestation} attribute.
   * @param value The value for attestation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withAttestation(VerificationResult_Attestation value) {
    @Nullable VerificationResult_Attestation newValue = Objects.requireNonNull(value, "attestation");
    if (this.attestation == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        newValue,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#attestation() attestation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attestation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withAttestation(Optional<? extends VerificationResult_Attestation> optional) {
    @Nullable VerificationResult_Attestation value = optional.orElse(null);
    if (this.attestation == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        value,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#validationType() validationType} attribute.
   * @param value The value for validationType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withValidationType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "validationType");
    if (this.validationType == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        newValue,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#validationType() validationType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withValidationType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.validationType == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        value,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        newValue,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        value,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#nextScheduled() nextScheduled} attribute.
   * @param value The value for nextScheduled
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withNextScheduled(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "nextScheduled");
    if (this.nextScheduled == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        newValue,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#nextScheduled() nextScheduled} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nextScheduled
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withNextScheduled(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.nextScheduled == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        value,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        newValue,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        value,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#lastPerformed() lastPerformed} attribute.
   * @param value The value for lastPerformed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withLastPerformed(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "lastPerformed");
    if (this.lastPerformed == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        newValue,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#lastPerformed() lastPerformed} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastPerformed
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withLastPerformed(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.lastPerformed == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        value,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#validator() validator} attribute.
   * @param value The value for validator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withValidator(List<VerificationResult_Validator> value) {
    @Nullable List<VerificationResult_Validator> newValue = Objects.requireNonNull(value, "validator");
    if (this.validator == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        newValue,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#validator() validator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withValidator(Optional<? extends List<VerificationResult_Validator>> optional) {
    @Nullable List<VerificationResult_Validator> value = optional.orElse(null);
    if (this.validator == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        value,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        newValue,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        value,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        newValue,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        value,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        newValue,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        value,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#primarySource() primarySource} attribute.
   * @param value The value for primarySource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withPrimarySource(List<VerificationResult_PrimarySource> value) {
    @Nullable List<VerificationResult_PrimarySource> newValue = Objects.requireNonNull(value, "primarySource");
    if (this.primarySource == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        newValue,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#primarySource() primarySource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for primarySource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withPrimarySource(Optional<? extends List<VerificationResult_PrimarySource>> optional) {
    @Nullable List<VerificationResult_PrimarySource> value = optional.orElse(null);
    if (this.primarySource == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        value,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#validationProcess() validationProcess} attribute.
   * @param value The value for validationProcess
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withValidationProcess(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "validationProcess");
    if (this.validationProcess == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        newValue,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#validationProcess() validationProcess} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationProcess
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withValidationProcess(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.validationProcess == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        value,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link VerificationResult#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableVerificationResult withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        newValue,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#statusDate() statusDate} attribute.
   * @param value The value for statusDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withStatusDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "statusDate");
    if (this.statusDate == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        newValue,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#statusDate() statusDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withStatusDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.statusDate == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        value,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#frequency() frequency} attribute.
   * @param value The value for frequency
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withFrequency(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "frequency");
    if (this.frequency == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        newValue,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#frequency() frequency} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequency
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withFrequency(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.frequency == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        value,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        newValue,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        value,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#targetLocation() targetLocation} attribute.
   * @param value The value for targetLocation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withTargetLocation(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "targetLocation");
    if (this.targetLocation == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        newValue,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#targetLocation() targetLocation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetLocation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withTargetLocation(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.targetLocation == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        value,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#failureAction() failureAction} attribute.
   * @param value The value for failureAction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withFailureAction(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "failureAction");
    if (this.failureAction == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        newValue,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#failureAction() failureAction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for failureAction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withFailureAction(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.failureAction == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        value,
        this.target,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withTarget(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        newValue,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withTarget(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        value,
        this.extension,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        newValue,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        value,
        this.need,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#need() need} attribute.
   * @param value The value for need
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withNeed(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "need");
    if (this.need == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#need() need} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for need
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withNeed(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.need == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        value,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableVerificationResult(
        this.modifierExtension,
        this.attestation,
        this.validationType,
        this.language,
        this.nextScheduled,
        this.text,
        this.lastPerformed,
        this.validator,
        this.meta,
        this.id,
        this.implicitRules,
        this.primarySource,
        this.validationProcess,
        this.resourceType,
        this.statusDate,
        this.frequency,
        this.contained,
        this.targetLocation,
        this.failureAction,
        this.target,
        this.extension,
        this.need,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVerificationResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVerificationResult
        && equalTo((ImmutableVerificationResult) another);
  }

  private boolean equalTo(ImmutableVerificationResult another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(attestation, another.attestation)
        && Objects.equals(validationType, another.validationType)
        && Objects.equals(language, another.language)
        && Objects.equals(nextScheduled, another.nextScheduled)
        && Objects.equals(text, another.text)
        && Objects.equals(lastPerformed, another.lastPerformed)
        && Objects.equals(validator, another.validator)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(primarySource, another.primarySource)
        && Objects.equals(validationProcess, another.validationProcess)
        && resourceType.equals(another.resourceType)
        && Objects.equals(statusDate, another.statusDate)
        && Objects.equals(frequency, another.frequency)
        && Objects.equals(contained, another.contained)
        && Objects.equals(targetLocation, another.targetLocation)
        && Objects.equals(failureAction, another.failureAction)
        && Objects.equals(target, another.target)
        && Objects.equals(extension, another.extension)
        && Objects.equals(need, another.need)
        && Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code attestation}, {@code validationType}, {@code language}, {@code nextScheduled}, {@code text}, {@code lastPerformed}, {@code validator}, {@code meta}, {@code id}, {@code implicitRules}, {@code primarySource}, {@code validationProcess}, {@code resourceType}, {@code statusDate}, {@code frequency}, {@code contained}, {@code targetLocation}, {@code failureAction}, {@code target}, {@code extension}, {@code need}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(attestation);
    h += (h << 5) + Objects.hashCode(validationType);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(nextScheduled);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(lastPerformed);
    h += (h << 5) + Objects.hashCode(validator);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(primarySource);
    h += (h << 5) + Objects.hashCode(validationProcess);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(statusDate);
    h += (h << 5) + Objects.hashCode(frequency);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(targetLocation);
    h += (h << 5) + Objects.hashCode(failureAction);
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(need);
    h += (h << 5) + Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VerificationResult{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (attestation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("attestation=").append(attestation);
    }
    if (validationType != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("validationType=").append(validationType);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (nextScheduled != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("nextScheduled=").append(nextScheduled);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (lastPerformed != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("lastPerformed=").append(lastPerformed);
    }
    if (validator != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("validator=").append(validator);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (primarySource != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("primarySource=").append(primarySource);
    }
    if (validationProcess != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("validationProcess=").append(validationProcess);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (statusDate != null) {
      builder.append(", ");
      builder.append("statusDate=").append(statusDate);
    }
    if (frequency != null) {
      builder.append(", ");
      builder.append("frequency=").append(frequency);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (targetLocation != null) {
      builder.append(", ");
      builder.append("targetLocation=").append(targetLocation);
    }
    if (failureAction != null) {
      builder.append(", ");
      builder.append("failureAction=").append(failureAction);
    }
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (need != null) {
      builder.append(", ");
      builder.append("need=").append(need);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "VerificationResult", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements VerificationResult {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<VerificationResult_Attestation> attestation = Optional.empty();
    boolean attestationIsSet;
    @Nullable Optional<CodeableConcept> validationType = Optional.empty();
    boolean validationTypeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Date> nextScheduled = Optional.empty();
    boolean nextScheduledIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<DateTime> lastPerformed = Optional.empty();
    boolean lastPerformedIsSet;
    @Nullable Optional<List<VerificationResult_Validator>> validator = Optional.empty();
    boolean validatorIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<VerificationResult_PrimarySource>> primarySource = Optional.empty();
    boolean primarySourceIsSet;
    @Nullable Optional<List<CodeableConcept>> validationProcess = Optional.empty();
    boolean validationProcessIsSet;
    @Nullable String resourceType;
    @Nullable Optional<DateTime> statusDate = Optional.empty();
    boolean statusDateIsSet;
    @Nullable Optional<Timing> frequency = Optional.empty();
    boolean frequencyIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<String>> targetLocation = Optional.empty();
    boolean targetLocationIsSet;
    @Nullable Optional<CodeableConcept> failureAction = Optional.empty();
    boolean failureActionIsSet;
    @Nullable Optional<List<Reference>> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> need = Optional.empty();
    boolean needIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("attestation")
    public void setAttestation(Optional<VerificationResult_Attestation> attestation) {
      this.attestation = attestation;
      this.attestationIsSet = true;
    }
    @JsonProperty("validationType")
    public void setValidationType(Optional<CodeableConcept> validationType) {
      this.validationType = validationType;
      this.validationTypeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("nextScheduled")
    public void setNextScheduled(Optional<Date> nextScheduled) {
      this.nextScheduled = nextScheduled;
      this.nextScheduledIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("lastPerformed")
    public void setLastPerformed(Optional<DateTime> lastPerformed) {
      this.lastPerformed = lastPerformed;
      this.lastPerformedIsSet = true;
    }
    @JsonProperty("validator")
    public void setValidator(Optional<List<VerificationResult_Validator>> validator) {
      this.validator = validator;
      this.validatorIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("primarySource")
    public void setPrimarySource(Optional<List<VerificationResult_PrimarySource>> primarySource) {
      this.primarySource = primarySource;
      this.primarySourceIsSet = true;
    }
    @JsonProperty("validationProcess")
    public void setValidationProcess(Optional<List<CodeableConcept>> validationProcess) {
      this.validationProcess = validationProcess;
      this.validationProcessIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("statusDate")
    public void setStatusDate(Optional<DateTime> statusDate) {
      this.statusDate = statusDate;
      this.statusDateIsSet = true;
    }
    @JsonProperty("frequency")
    public void setFrequency(Optional<Timing> frequency) {
      this.frequency = frequency;
      this.frequencyIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("targetLocation")
    public void setTargetLocation(Optional<List<String>> targetLocation) {
      this.targetLocation = targetLocation;
      this.targetLocationIsSet = true;
    }
    @JsonProperty("failureAction")
    public void setFailureAction(Optional<CodeableConcept> failureAction) {
      this.failureAction = failureAction;
      this.failureActionIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<List<Reference>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("need")
    public void setNeed(Optional<CodeableConcept> need) {
      this.need = need;
      this.needIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<VerificationResult_Attestation> attestation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> validationType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> nextScheduled() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> lastPerformed() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<VerificationResult_Validator>> validator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<VerificationResult_PrimarySource>> primarySource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> validationProcess() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> statusDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> frequency() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> targetLocation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> failureAction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> need() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVerificationResult fromJson(Json json) {
    ImmutableVerificationResult.Builder builder = ((ImmutableVerificationResult.Builder) ImmutableVerificationResult.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.attestationIsSet) {
      builder.attestation(json.attestation);
    }
    if (json.validationTypeIsSet) {
      builder.validationType(json.validationType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.nextScheduledIsSet) {
      builder.nextScheduled(json.nextScheduled);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.lastPerformedIsSet) {
      builder.lastPerformed(json.lastPerformed);
    }
    if (json.validatorIsSet) {
      builder.validator(json.validator);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.primarySourceIsSet) {
      builder.primarySource(json.primarySource);
    }
    if (json.validationProcessIsSet) {
      builder.validationProcess(json.validationProcess);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusDateIsSet) {
      builder.statusDate(json.statusDate);
    }
    if (json.frequencyIsSet) {
      builder.frequency(json.frequency);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.targetLocationIsSet) {
      builder.targetLocation(json.targetLocation);
    }
    if (json.failureActionIsSet) {
      builder.failureAction(json.failureAction);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.needIsSet) {
      builder.need(json.need);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
        .modifierExtension(instance.modifierExtension())
        .attestation(instance.attestation())
        .validationType(instance.validationType())
        .language(instance.language())
        .nextScheduled(instance.nextScheduled())
        .text(instance.text())
        .lastPerformed(instance.lastPerformed())
        .validator(instance.validator())
        .meta(instance.meta())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .primarySource(instance.primarySource())
        .validationProcess(instance.validationProcess())
        .resourceType(instance.resourceType())
        .statusDate(instance.statusDate())
        .frequency(instance.frequency())
        .contained(instance.contained())
        .targetLocation(instance.targetLocation())
        .failureAction(instance.failureAction())
        .target(instance.target())
        .extension(instance.extension())
        .need(instance.need())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult VerificationResult}.
   * <pre>
   * ImmutableVerificationResult.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult#modifierExtension() modifierExtension}
   *    .attestation(com.medplum.types.fhir.VerificationResult_Attestation) // optional {@link VerificationResult#attestation() attestation}
   *    .validationType(com.medplum.types.fhir.CodeableConcept) // optional {@link VerificationResult#validationType() validationType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link VerificationResult#language() language}
   *    .nextScheduled(com.medplum.types.fhir.Date) // optional {@link VerificationResult#nextScheduled() nextScheduled}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link VerificationResult#text() text}
   *    .lastPerformed(com.medplum.types.fhir.DateTime) // optional {@link VerificationResult#lastPerformed() lastPerformed}
   *    .validator(List&amp;lt;com.medplum.types.fhir.VerificationResult_Validator&amp;gt;) // optional {@link VerificationResult#validator() validator}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link VerificationResult#meta() meta}
   *    .id(com.medplum.types.fhir.Id) // optional {@link VerificationResult#id() id}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link VerificationResult#implicitRules() implicitRules}
   *    .primarySource(List&amp;lt;com.medplum.types.fhir.VerificationResult_PrimarySource&amp;gt;) // optional {@link VerificationResult#primarySource() primarySource}
   *    .validationProcess(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult#validationProcess() validationProcess}
   *    .resourceType(String) // required {@link VerificationResult#resourceType() resourceType}
   *    .statusDate(com.medplum.types.fhir.DateTime) // optional {@link VerificationResult#statusDate() statusDate}
   *    .frequency(com.medplum.types.fhir.Timing) // optional {@link VerificationResult#frequency() frequency}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link VerificationResult#contained() contained}
   *    .targetLocation(List&amp;lt;String&amp;gt;) // optional {@link VerificationResult#targetLocation() targetLocation}
   *    .failureAction(com.medplum.types.fhir.CodeableConcept) // optional {@link VerificationResult#failureAction() failureAction}
   *    .target(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link VerificationResult#target() target}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult#extension() extension}
   *    .need(com.medplum.types.fhir.CodeableConcept) // optional {@link VerificationResult#need() need}
   *    .status(com.medplum.types.fhir.Code) // optional {@link VerificationResult#status() status}
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
  @Generated(from = "VerificationResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ATTESTATION = 0x2L;
    private static final long OPT_BIT_VALIDATION_TYPE = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_NEXT_SCHEDULED = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_LAST_PERFORMED = 0x40L;
    private static final long OPT_BIT_VALIDATOR = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_PRIMARY_SOURCE = 0x800L;
    private static final long OPT_BIT_VALIDATION_PROCESS = 0x1000L;
    private static final long OPT_BIT_STATUS_DATE = 0x2000L;
    private static final long OPT_BIT_FREQUENCY = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_TARGET_LOCATION = 0x10000L;
    private static final long OPT_BIT_FAILURE_ACTION = 0x20000L;
    private static final long OPT_BIT_TARGET = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_NEED = 0x100000L;
    private static final long OPT_BIT_STATUS = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable VerificationResult_Attestation attestation;
    private @Nullable CodeableConcept validationType;
    private @Nullable Code language;
    private @Nullable Date nextScheduled;
    private @Nullable Narrative text;
    private @Nullable DateTime lastPerformed;
    private @Nullable List<VerificationResult_Validator> validator;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable Uri implicitRules;
    private @Nullable List<VerificationResult_PrimarySource> primarySource;
    private @Nullable List<CodeableConcept> validationProcess;
    private @Nullable String resourceType;
    private @Nullable DateTime statusDate;
    private @Nullable Timing frequency;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<String> targetLocation;
    private @Nullable CodeableConcept failureAction;
    private @Nullable List<Reference> target;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept need;
    private @Nullable Code status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for chained invocation
     */
    public final Builder attestation(VerificationResult_Attestation attestation) {
      checkNotIsSet(attestationIsSet(), "attestation");
      this.attestation = Objects.requireNonNull(attestation, "attestation");
      optBits |= OPT_BIT_ATTESTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attestation")
    public final Builder attestation(Optional<? extends VerificationResult_Attestation> attestation) {
      checkNotIsSet(attestationIsSet(), "attestation");
      this.attestation = attestation.orElse(null);
      optBits |= OPT_BIT_ATTESTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationType(CodeableConcept validationType) {
      checkNotIsSet(validationTypeIsSet(), "validationType");
      this.validationType = Objects.requireNonNull(validationType, "validationType");
      optBits |= OPT_BIT_VALIDATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validationType")
    public final Builder validationType(Optional<? extends CodeableConcept> validationType) {
      checkNotIsSet(validationTypeIsSet(), "validationType");
      this.validationType = validationType.orElse(null);
      optBits |= OPT_BIT_VALIDATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#language() language} to language.
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
     * Initializes the optional value {@link VerificationResult#language() language} to language.
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
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for chained invocation
     */
    public final Builder nextScheduled(Date nextScheduled) {
      checkNotIsSet(nextScheduledIsSet(), "nextScheduled");
      this.nextScheduled = Objects.requireNonNull(nextScheduled, "nextScheduled");
      optBits |= OPT_BIT_NEXT_SCHEDULED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nextScheduled")
    public final Builder nextScheduled(Optional<? extends Date> nextScheduled) {
      checkNotIsSet(nextScheduledIsSet(), "nextScheduled");
      this.nextScheduled = nextScheduled.orElse(null);
      optBits |= OPT_BIT_NEXT_SCHEDULED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#text() text} to text.
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
     * Initializes the optional value {@link VerificationResult#text() text} to text.
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
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastPerformed(DateTime lastPerformed) {
      checkNotIsSet(lastPerformedIsSet(), "lastPerformed");
      this.lastPerformed = Objects.requireNonNull(lastPerformed, "lastPerformed");
      optBits |= OPT_BIT_LAST_PERFORMED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastPerformed")
    public final Builder lastPerformed(Optional<? extends DateTime> lastPerformed) {
      checkNotIsSet(lastPerformedIsSet(), "lastPerformed");
      this.lastPerformed = lastPerformed.orElse(null);
      optBits |= OPT_BIT_LAST_PERFORMED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for chained invocation
     */
    public final Builder validator(List<VerificationResult_Validator> validator) {
      checkNotIsSet(validatorIsSet(), "validator");
      this.validator = Objects.requireNonNull(validator, "validator");
      optBits |= OPT_BIT_VALIDATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validator")
    public final Builder validator(Optional<? extends List<VerificationResult_Validator>> validator) {
      checkNotIsSet(validatorIsSet(), "validator");
      this.validator = validator.orElse(null);
      optBits |= OPT_BIT_VALIDATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
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
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
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
     * Initializes the optional value {@link VerificationResult#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for chained invocation
     */
    public final Builder primarySource(List<VerificationResult_PrimarySource> primarySource) {
      checkNotIsSet(primarySourceIsSet(), "primarySource");
      this.primarySource = Objects.requireNonNull(primarySource, "primarySource");
      optBits |= OPT_BIT_PRIMARY_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("primarySource")
    public final Builder primarySource(Optional<? extends List<VerificationResult_PrimarySource>> primarySource) {
      checkNotIsSet(primarySourceIsSet(), "primarySource");
      this.primarySource = primarySource.orElse(null);
      optBits |= OPT_BIT_PRIMARY_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationProcess(List<CodeableConcept> validationProcess) {
      checkNotIsSet(validationProcessIsSet(), "validationProcess");
      this.validationProcess = Objects.requireNonNull(validationProcess, "validationProcess");
      optBits |= OPT_BIT_VALIDATION_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validationProcess")
    public final Builder validationProcess(Optional<? extends List<CodeableConcept>> validationProcess) {
      checkNotIsSet(validationProcessIsSet(), "validationProcess");
      this.validationProcess = validationProcess.orElse(null);
      optBits |= OPT_BIT_VALIDATION_PROCESS;
      return this;
    }

    /**
     * Initializes the value for the {@link VerificationResult#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusDate(DateTime statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = Objects.requireNonNull(statusDate, "statusDate");
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusDate")
    public final Builder statusDate(Optional<? extends DateTime> statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = statusDate.orElse(null);
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequency(Timing frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = Objects.requireNonNull(frequency, "frequency");
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequency")
    public final Builder frequency(Optional<? extends Timing> frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = frequency.orElse(null);
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
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
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
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
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetLocation(List<String> targetLocation) {
      checkNotIsSet(targetLocationIsSet(), "targetLocation");
      this.targetLocation = Objects.requireNonNull(targetLocation, "targetLocation");
      optBits |= OPT_BIT_TARGET_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetLocation")
    public final Builder targetLocation(Optional<? extends List<String>> targetLocation) {
      checkNotIsSet(targetLocationIsSet(), "targetLocation");
      this.targetLocation = targetLocation.orElse(null);
      optBits |= OPT_BIT_TARGET_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for chained invocation
     */
    public final Builder failureAction(CodeableConcept failureAction) {
      checkNotIsSet(failureActionIsSet(), "failureAction");
      this.failureAction = Objects.requireNonNull(failureAction, "failureAction");
      optBits |= OPT_BIT_FAILURE_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("failureAction")
    public final Builder failureAction(Optional<? extends CodeableConcept> failureAction) {
      checkNotIsSet(failureActionIsSet(), "failureAction");
      this.failureAction = failureAction.orElse(null);
      optBits |= OPT_BIT_FAILURE_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<Reference> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<Reference>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for chained invocation
     */
    public final Builder need(CodeableConcept need) {
      checkNotIsSet(needIsSet(), "need");
      this.need = Objects.requireNonNull(need, "need");
      optBits |= OPT_BIT_NEED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("need")
    public final Builder need(Optional<? extends CodeableConcept> need) {
      checkNotIsSet(needIsSet(), "need");
      this.need = need.orElse(null);
      optBits |= OPT_BIT_NEED;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link VerificationResult VerificationResult}.
     * @return An immutable instance of VerificationResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VerificationResult build() {
      checkRequiredAttributes();
      return new ImmutableVerificationResult(
          modifierExtension,
          attestation,
          validationType,
          language,
          nextScheduled,
          text,
          lastPerformed,
          validator,
          meta,
          id,
          implicitRules,
          primarySource,
          validationProcess,
          resourceType,
          statusDate,
          frequency,
          contained,
          targetLocation,
          failureAction,
          target,
          extension,
          need,
          status);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean attestationIsSet() {
      return (optBits & OPT_BIT_ATTESTATION) != 0;
    }

    private boolean validationTypeIsSet() {
      return (optBits & OPT_BIT_VALIDATION_TYPE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean nextScheduledIsSet() {
      return (optBits & OPT_BIT_NEXT_SCHEDULED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean lastPerformedIsSet() {
      return (optBits & OPT_BIT_LAST_PERFORMED) != 0;
    }

    private boolean validatorIsSet() {
      return (optBits & OPT_BIT_VALIDATOR) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean primarySourceIsSet() {
      return (optBits & OPT_BIT_PRIMARY_SOURCE) != 0;
    }

    private boolean validationProcessIsSet() {
      return (optBits & OPT_BIT_VALIDATION_PROCESS) != 0;
    }

    private boolean statusDateIsSet() {
      return (optBits & OPT_BIT_STATUS_DATE) != 0;
    }

    private boolean frequencyIsSet() {
      return (optBits & OPT_BIT_FREQUENCY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean targetLocationIsSet() {
      return (optBits & OPT_BIT_TARGET_LOCATION) != 0;
    }

    private boolean failureActionIsSet() {
      return (optBits & OPT_BIT_FAILURE_ACTION) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean needIsSet() {
      return (optBits & OPT_BIT_NEED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of VerificationResult is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build VerificationResult, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "VerificationResult", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link VerificationResult#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "VerificationResult", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link VerificationResult#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal attestation(VerificationResult_Attestation attestation);

    /**
     * Initializes the optional value {@link VerificationResult#attestation() attestation} to attestation.
     * @param attestation The value for attestation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attestation(Optional<? extends VerificationResult_Attestation> attestation);

    /**
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validationType(CodeableConcept validationType);

    /**
     * Initializes the optional value {@link VerificationResult#validationType() validationType} to validationType.
     * @param validationType The value for validationType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validationType(Optional<? extends CodeableConcept> validationType);

    /**
     * Initializes the optional value {@link VerificationResult#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link VerificationResult#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for chained invocation
     */
    BuildFinal nextScheduled(Date nextScheduled);

    /**
     * Initializes the optional value {@link VerificationResult#nextScheduled() nextScheduled} to nextScheduled.
     * @param nextScheduled The value for nextScheduled
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal nextScheduled(Optional<? extends Date> nextScheduled);

    /**
     * Initializes the optional value {@link VerificationResult#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link VerificationResult#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastPerformed(DateTime lastPerformed);

    /**
     * Initializes the optional value {@link VerificationResult#lastPerformed() lastPerformed} to lastPerformed.
     * @param lastPerformed The value for lastPerformed
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastPerformed(Optional<? extends DateTime> lastPerformed);

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validator(List<VerificationResult_Validator> validator);

    /**
     * Initializes the optional value {@link VerificationResult#validator() validator} to validator.
     * @param validator The value for validator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validator(Optional<? extends List<VerificationResult_Validator>> validator);

    /**
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link VerificationResult#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link VerificationResult#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link VerificationResult#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link VerificationResult#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal primarySource(List<VerificationResult_PrimarySource> primarySource);

    /**
     * Initializes the optional value {@link VerificationResult#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal primarySource(Optional<? extends List<VerificationResult_PrimarySource>> primarySource);

    /**
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validationProcess(List<CodeableConcept> validationProcess);

    /**
     * Initializes the optional value {@link VerificationResult#validationProcess() validationProcess} to validationProcess.
     * @param validationProcess The value for validationProcess
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validationProcess(Optional<? extends List<CodeableConcept>> validationProcess);

    /**
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusDate(DateTime statusDate);

    /**
     * Initializes the optional value {@link VerificationResult#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusDate(Optional<? extends DateTime> statusDate);

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for chained invocation
     */
    BuildFinal frequency(Timing frequency);

    /**
     * Initializes the optional value {@link VerificationResult#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal frequency(Optional<? extends Timing> frequency);

    /**
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link VerificationResult#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetLocation(List<String> targetLocation);

    /**
     * Initializes the optional value {@link VerificationResult#targetLocation() targetLocation} to targetLocation.
     * @param targetLocation The value for targetLocation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetLocation(Optional<? extends List<String>> targetLocation);

    /**
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal failureAction(CodeableConcept failureAction);

    /**
     * Initializes the optional value {@link VerificationResult#failureAction() failureAction} to failureAction.
     * @param failureAction The value for failureAction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal failureAction(Optional<? extends CodeableConcept> failureAction);

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(List<Reference> target);

    /**
     * Initializes the optional value {@link VerificationResult#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(Optional<? extends List<Reference>> target);

    /**
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link VerificationResult#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for chained invocation
     */
    BuildFinal need(CodeableConcept need);

    /**
     * Initializes the optional value {@link VerificationResult#need() need} to need.
     * @param need The value for need
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal need(Optional<? extends CodeableConcept> need);

    /**
     * Initializes the optional value {@link VerificationResult#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link VerificationResult#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Builds a new {@link VerificationResult VerificationResult}.
     * @return An immutable instance of VerificationResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    VerificationResult build();
  }
}
