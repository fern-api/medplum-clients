//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RiskAssessment_Prediction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskAssessment_Prediction.builder()}.
 */
@org.immutables.value.Generated(from = "RiskAssessment_Prediction", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskAssessment_Prediction implements com.fhir.RiskAssessment_Prediction {
  private final @javax.annotation.Nullable com.fhir.decimal relativeRisk;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Period whenPeriod;
  private final @javax.annotation.Nullable java.lang.String rationale;
  private final @javax.annotation.Nullable com.fhir.Range probabilityRange;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept qualitativeRisk;
  private final @javax.annotation.Nullable com.fhir.Range whenRange;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept outcome;
  private final @javax.annotation.Nullable java.lang.Double probabilityDecimal;

  private ImmutableRiskAssessment_Prediction(
      @javax.annotation.Nullable com.fhir.decimal relativeRisk,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Period whenPeriod,
      @javax.annotation.Nullable java.lang.String rationale,
      @javax.annotation.Nullable com.fhir.Range probabilityRange,
      @javax.annotation.Nullable com.fhir.CodeableConcept qualitativeRisk,
      @javax.annotation.Nullable com.fhir.Range whenRange,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept outcome,
      @javax.annotation.Nullable java.lang.Double probabilityDecimal) {
    this.relativeRisk = relativeRisk;
    this.extension = extension;
    this.whenPeriod = whenPeriod;
    this.rationale = rationale;
    this.probabilityRange = probabilityRange;
    this.qualitativeRisk = qualitativeRisk;
    this.whenRange = whenRange;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.outcome = outcome;
    this.probabilityDecimal = probabilityDecimal;
  }

  /**
   * @return The value of the {@code relativeRisk} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relativeRisk")
  @Override
  public java.util.Optional<com.fhir.decimal> relativeRisk() {
    return java.util.Optional.ofNullable(relativeRisk);
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
   * @return The value of the {@code whenPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("whenPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> whenPeriod() {
    return java.util.Optional.ofNullable(whenPeriod);
  }

  /**
   * @return The value of the {@code rationale} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rationale")
  @Override
  public java.util.Optional<java.lang.String> rationale() {
    return java.util.Optional.ofNullable(rationale);
  }

  /**
   * @return The value of the {@code probabilityRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("probabilityRange")
  @Override
  public java.util.Optional<com.fhir.Range> probabilityRange() {
    return java.util.Optional.ofNullable(probabilityRange);
  }

  /**
   * @return The value of the {@code qualitativeRisk} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("qualitativeRisk")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> qualitativeRisk() {
    return java.util.Optional.ofNullable(qualitativeRisk);
  }

  /**
   * @return The value of the {@code whenRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("whenRange")
  @Override
  public java.util.Optional<com.fhir.Range> whenRange() {
    return java.util.Optional.ofNullable(whenRange);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> outcome() {
    return java.util.Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code probabilityDecimal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("probabilityDecimal")
  @Override
  public java.util.Optional<java.lang.Double> probabilityDecimal() {
    return java.util.Optional.ofNullable(probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} attribute.
   * @param value The value for relativeRisk
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withRelativeRisk(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "relativeRisk");
    if (this.relativeRisk == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        newValue,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relativeRisk
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withRelativeRisk(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.relativeRisk == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        value,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        newValue,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        value,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} attribute.
   * @param value The value for whenPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withWhenPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "whenPeriod");
    if (this.whenPeriod == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        newValue,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withWhenPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.whenPeriod == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        value,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#rationale() rationale} attribute.
   * @param value The value for rationale
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withRationale(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "rationale");
    if (java.util.Objects.equals(this.rationale, newValue)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        newValue,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#rationale() rationale} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rationale
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withRationale(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.rationale, value)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        value,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} attribute.
   * @param value The value for probabilityRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withProbabilityRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "probabilityRange");
    if (this.probabilityRange == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        newValue,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for probabilityRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withProbabilityRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.probabilityRange == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        value,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} attribute.
   * @param value The value for qualitativeRisk
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withQualitativeRisk(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "qualitativeRisk");
    if (this.qualitativeRisk == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        newValue,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualitativeRisk
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withQualitativeRisk(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.qualitativeRisk == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        value,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#whenRange() whenRange} attribute.
   * @param value The value for whenRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withWhenRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "whenRange");
    if (this.whenRange == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        newValue,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#whenRange() whenRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withWhenRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.whenRange == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        value,
        this.id,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        newValue,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        value,
        this.modifierExtension,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        newValue,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        value,
        this.outcome,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withOutcome(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        newValue,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment_Prediction withOutcome(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        value,
        this.probabilityDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} attribute.
   * @param value The value for probabilityDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withProbabilityDecimal(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.probabilityDecimal, newValue)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for probabilityDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment_Prediction withProbabilityDecimal(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.probabilityDecimal, value)) return this;
    return new ImmutableRiskAssessment_Prediction(
        this.relativeRisk,
        this.extension,
        this.whenPeriod,
        this.rationale,
        this.probabilityRange,
        this.qualitativeRisk,
        this.whenRange,
        this.id,
        this.modifierExtension,
        this.outcome,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskAssessment_Prediction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskAssessment_Prediction
        && equalTo((ImmutableRiskAssessment_Prediction) another);
  }

  private boolean equalTo(ImmutableRiskAssessment_Prediction another) {
    return java.util.Objects.equals(relativeRisk, another.relativeRisk)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(whenPeriod, another.whenPeriod)
        && java.util.Objects.equals(rationale, another.rationale)
        && java.util.Objects.equals(probabilityRange, another.probabilityRange)
        && java.util.Objects.equals(qualitativeRisk, another.qualitativeRisk)
        && java.util.Objects.equals(whenRange, another.whenRange)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(probabilityDecimal, another.probabilityDecimal);
  }

  /**
   * Computes a hash code from attributes: {@code relativeRisk}, {@code extension}, {@code whenPeriod}, {@code rationale}, {@code probabilityRange}, {@code qualitativeRisk}, {@code whenRange}, {@code id}, {@code modifierExtension}, {@code outcome}, {@code probabilityDecimal}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(relativeRisk);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(whenPeriod);
    h += (h << 5) + java.util.Objects.hashCode(rationale);
    h += (h << 5) + java.util.Objects.hashCode(probabilityRange);
    h += (h << 5) + java.util.Objects.hashCode(qualitativeRisk);
    h += (h << 5) + java.util.Objects.hashCode(whenRange);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(probabilityDecimal);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskAssessment_Prediction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RiskAssessment_Prediction{");
    if (relativeRisk != null) {
      builder.append("relativeRisk=").append(relativeRisk);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (whenPeriod != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("whenPeriod=").append(whenPeriod);
    }
    if (rationale != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("rationale=").append(rationale);
    }
    if (probabilityRange != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("probabilityRange=").append(probabilityRange);
    }
    if (qualitativeRisk != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("qualitativeRisk=").append(qualitativeRisk);
    }
    if (whenRange != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("whenRange=").append(whenRange);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (outcome != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (probabilityDecimal != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("probabilityDecimal=").append(probabilityDecimal);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RiskAssessment_Prediction", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RiskAssessment_Prediction {
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> relativeRisk = java.util.Optional.empty();
    boolean relativeRiskIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> whenPeriod = java.util.Optional.empty();
    boolean whenPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> rationale = java.util.Optional.empty();
    boolean rationaleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> probabilityRange = java.util.Optional.empty();
    boolean probabilityRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> qualitativeRisk = java.util.Optional.empty();
    boolean qualitativeRiskIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> whenRange = java.util.Optional.empty();
    boolean whenRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> probabilityDecimal = java.util.Optional.empty();
    boolean probabilityDecimalIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("relativeRisk")
    public void setRelativeRisk(java.util.Optional<com.fhir.decimal> relativeRisk) {
      this.relativeRisk = relativeRisk;
      this.relativeRiskIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("whenPeriod")
    public void setWhenPeriod(java.util.Optional<com.fhir.Period> whenPeriod) {
      this.whenPeriod = whenPeriod;
      this.whenPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rationale")
    public void setRationale(java.util.Optional<java.lang.String> rationale) {
      this.rationale = rationale;
      this.rationaleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("probabilityRange")
    public void setProbabilityRange(java.util.Optional<com.fhir.Range> probabilityRange) {
      this.probabilityRange = probabilityRange;
      this.probabilityRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("qualitativeRisk")
    public void setQualitativeRisk(java.util.Optional<com.fhir.CodeableConcept> qualitativeRisk) {
      this.qualitativeRisk = qualitativeRisk;
      this.qualitativeRiskIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("whenRange")
    public void setWhenRange(java.util.Optional<com.fhir.Range> whenRange) {
      this.whenRange = whenRange;
      this.whenRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.CodeableConcept> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("probabilityDecimal")
    public void setProbabilityDecimal(java.util.Optional<java.lang.Double> probabilityDecimal) {
      this.probabilityDecimal = probabilityDecimal;
      this.probabilityDecimalIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.decimal> relativeRisk() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> whenPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> rationale() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> probabilityRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> qualitativeRisk() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> whenRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> probabilityDecimal() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRiskAssessment_Prediction fromJson(Json json) {
    ImmutableRiskAssessment_Prediction.Builder builder = ImmutableRiskAssessment_Prediction.builder();
    if (json.relativeRiskIsSet) {
      builder.relativeRisk(json.relativeRisk);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.whenPeriodIsSet) {
      builder.whenPeriod(json.whenPeriod);
    }
    if (json.rationaleIsSet) {
      builder.rationale(json.rationale);
    }
    if (json.probabilityRangeIsSet) {
      builder.probabilityRange(json.probabilityRange);
    }
    if (json.qualitativeRiskIsSet) {
      builder.qualitativeRisk(json.qualitativeRisk);
    }
    if (json.whenRangeIsSet) {
      builder.whenRange(json.whenRange);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.probabilityDecimalIsSet) {
      builder.probabilityDecimal(json.probabilityDecimal);
    }
    return (ImmutableRiskAssessment_Prediction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskAssessment_Prediction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskAssessment_Prediction instance
   */
  public static RiskAssessment_Prediction copyOf(RiskAssessment_Prediction instance) {
    if (instance instanceof ImmutableRiskAssessment_Prediction) {
      return (ImmutableRiskAssessment_Prediction) instance;
    }
    return ImmutableRiskAssessment_Prediction.builder()
        .relativeRisk(instance.relativeRisk())
        .extension(instance.extension())
        .whenPeriod(instance.whenPeriod())
        .rationale(instance.rationale())
        .probabilityRange(instance.probabilityRange())
        .qualitativeRisk(instance.qualitativeRisk())
        .whenRange(instance.whenRange())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .outcome(instance.outcome())
        .probabilityDecimal(instance.probabilityDecimal())
        .build();
  }

  /**
   * Creates a builder for {@link RiskAssessment_Prediction RiskAssessment_Prediction}.
   * <pre>
   * ImmutableRiskAssessment_Prediction.builder()
   *    .relativeRisk(com.fhir.decimal) // optional {@link RiskAssessment_Prediction#relativeRisk() relativeRisk}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskAssessment_Prediction#extension() extension}
   *    .whenPeriod(com.fhir.Period) // optional {@link RiskAssessment_Prediction#whenPeriod() whenPeriod}
   *    .rationale(String) // optional {@link RiskAssessment_Prediction#rationale() rationale}
   *    .probabilityRange(com.fhir.Range) // optional {@link RiskAssessment_Prediction#probabilityRange() probabilityRange}
   *    .qualitativeRisk(com.fhir.CodeableConcept) // optional {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk}
   *    .whenRange(com.fhir.Range) // optional {@link RiskAssessment_Prediction#whenRange() whenRange}
   *    .id(String) // optional {@link RiskAssessment_Prediction#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskAssessment_Prediction#modifierExtension() modifierExtension}
   *    .outcome(com.fhir.CodeableConcept) // optional {@link RiskAssessment_Prediction#outcome() outcome}
   *    .probabilityDecimal(Double) // optional {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal}
   *    .build();
   * </pre>
   * @return A new RiskAssessment_Prediction builder
   */
  public static ImmutableRiskAssessment_Prediction.Builder builder() {
    return new ImmutableRiskAssessment_Prediction.Builder();
  }

  /**
   * Builds instances of type {@link RiskAssessment_Prediction RiskAssessment_Prediction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RiskAssessment_Prediction", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RELATIVE_RISK = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_WHEN_PERIOD = 0x4L;
    private static final long OPT_BIT_RATIONALE = 0x8L;
    private static final long OPT_BIT_PROBABILITY_RANGE = 0x10L;
    private static final long OPT_BIT_QUALITATIVE_RISK = 0x20L;
    private static final long OPT_BIT_WHEN_RANGE = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_OUTCOME = 0x200L;
    private static final long OPT_BIT_PROBABILITY_DECIMAL = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.decimal relativeRisk;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Period whenPeriod;
    private @javax.annotation.Nullable java.lang.String rationale;
    private @javax.annotation.Nullable com.fhir.Range probabilityRange;
    private @javax.annotation.Nullable com.fhir.CodeableConcept qualitativeRisk;
    private @javax.annotation.Nullable com.fhir.Range whenRange;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept outcome;
    private @javax.annotation.Nullable java.lang.Double probabilityDecimal;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} to relativeRisk.
     * @param relativeRisk The value for relativeRisk
     * @return {@code this} builder for chained invocation
     */
    public final Builder relativeRisk(com.fhir.decimal relativeRisk) {
      checkNotIsSet(relativeRiskIsSet(), "relativeRisk");
      this.relativeRisk = java.util.Objects.requireNonNull(relativeRisk, "relativeRisk");
      optBits |= OPT_BIT_RELATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#relativeRisk() relativeRisk} to relativeRisk.
     * @param relativeRisk The value for relativeRisk
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relativeRisk")
    public final Builder relativeRisk(java.util.Optional<? extends com.fhir.decimal> relativeRisk) {
      checkNotIsSet(relativeRiskIsSet(), "relativeRisk");
      this.relativeRisk = relativeRisk.orElse(null);
      optBits |= OPT_BIT_RELATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} to whenPeriod.
     * @param whenPeriod The value for whenPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenPeriod(com.fhir.Period whenPeriod) {
      checkNotIsSet(whenPeriodIsSet(), "whenPeriod");
      this.whenPeriod = java.util.Objects.requireNonNull(whenPeriod, "whenPeriod");
      optBits |= OPT_BIT_WHEN_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#whenPeriod() whenPeriod} to whenPeriod.
     * @param whenPeriod The value for whenPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("whenPeriod")
    public final Builder whenPeriod(java.util.Optional<? extends com.fhir.Period> whenPeriod) {
      checkNotIsSet(whenPeriodIsSet(), "whenPeriod");
      this.whenPeriod = whenPeriod.orElse(null);
      optBits |= OPT_BIT_WHEN_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for chained invocation
     */
    public final Builder rationale(java.lang.String rationale) {
      checkNotIsSet(rationaleIsSet(), "rationale");
      this.rationale = java.util.Objects.requireNonNull(rationale, "rationale");
      optBits |= OPT_BIT_RATIONALE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rationale")
    public final Builder rationale(java.util.Optional<java.lang.String> rationale) {
      checkNotIsSet(rationaleIsSet(), "rationale");
      this.rationale = rationale.orElse(null);
      optBits |= OPT_BIT_RATIONALE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} to probabilityRange.
     * @param probabilityRange The value for probabilityRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder probabilityRange(com.fhir.Range probabilityRange) {
      checkNotIsSet(probabilityRangeIsSet(), "probabilityRange");
      this.probabilityRange = java.util.Objects.requireNonNull(probabilityRange, "probabilityRange");
      optBits |= OPT_BIT_PROBABILITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityRange() probabilityRange} to probabilityRange.
     * @param probabilityRange The value for probabilityRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("probabilityRange")
    public final Builder probabilityRange(java.util.Optional<? extends com.fhir.Range> probabilityRange) {
      checkNotIsSet(probabilityRangeIsSet(), "probabilityRange");
      this.probabilityRange = probabilityRange.orElse(null);
      optBits |= OPT_BIT_PROBABILITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} to qualitativeRisk.
     * @param qualitativeRisk The value for qualitativeRisk
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualitativeRisk(com.fhir.CodeableConcept qualitativeRisk) {
      checkNotIsSet(qualitativeRiskIsSet(), "qualitativeRisk");
      this.qualitativeRisk = java.util.Objects.requireNonNull(qualitativeRisk, "qualitativeRisk");
      optBits |= OPT_BIT_QUALITATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#qualitativeRisk() qualitativeRisk} to qualitativeRisk.
     * @param qualitativeRisk The value for qualitativeRisk
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("qualitativeRisk")
    public final Builder qualitativeRisk(java.util.Optional<? extends com.fhir.CodeableConcept> qualitativeRisk) {
      checkNotIsSet(qualitativeRiskIsSet(), "qualitativeRisk");
      this.qualitativeRisk = qualitativeRisk.orElse(null);
      optBits |= OPT_BIT_QUALITATIVE_RISK;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#whenRange() whenRange} to whenRange.
     * @param whenRange The value for whenRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenRange(com.fhir.Range whenRange) {
      checkNotIsSet(whenRangeIsSet(), "whenRange");
      this.whenRange = java.util.Objects.requireNonNull(whenRange, "whenRange");
      optBits |= OPT_BIT_WHEN_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#whenRange() whenRange} to whenRange.
     * @param whenRange The value for whenRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("whenRange")
    public final Builder whenRange(java.util.Optional<? extends com.fhir.Range> whenRange) {
      checkNotIsSet(whenRangeIsSet(), "whenRange");
      this.whenRange = whenRange.orElse(null);
      optBits |= OPT_BIT_WHEN_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#outcome() outcome} to outcome.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#outcome() outcome} to outcome.
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
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} to probabilityDecimal.
     * @param probabilityDecimal The value for probabilityDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder probabilityDecimal(double probabilityDecimal) {
      checkNotIsSet(probabilityDecimalIsSet(), "probabilityDecimal");
      this.probabilityDecimal = probabilityDecimal;
      optBits |= OPT_BIT_PROBABILITY_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment_Prediction#probabilityDecimal() probabilityDecimal} to probabilityDecimal.
     * @param probabilityDecimal The value for probabilityDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("probabilityDecimal")
    public final Builder probabilityDecimal(java.util.Optional<java.lang.Double> probabilityDecimal) {
      checkNotIsSet(probabilityDecimalIsSet(), "probabilityDecimal");
      this.probabilityDecimal = probabilityDecimal.orElse(null);
      optBits |= OPT_BIT_PROBABILITY_DECIMAL;
      return this;
    }

    /**
     * Builds a new {@link RiskAssessment_Prediction RiskAssessment_Prediction}.
     * @return An immutable instance of RiskAssessment_Prediction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RiskAssessment_Prediction build() {
      return new ImmutableRiskAssessment_Prediction(
          relativeRisk,
          extension,
          whenPeriod,
          rationale,
          probabilityRange,
          qualitativeRisk,
          whenRange,
          id,
          modifierExtension,
          outcome,
          probabilityDecimal);
    }

    private boolean relativeRiskIsSet() {
      return (optBits & OPT_BIT_RELATIVE_RISK) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean whenPeriodIsSet() {
      return (optBits & OPT_BIT_WHEN_PERIOD) != 0;
    }

    private boolean rationaleIsSet() {
      return (optBits & OPT_BIT_RATIONALE) != 0;
    }

    private boolean probabilityRangeIsSet() {
      return (optBits & OPT_BIT_PROBABILITY_RANGE) != 0;
    }

    private boolean qualitativeRiskIsSet() {
      return (optBits & OPT_BIT_QUALITATIVE_RISK) != 0;
    }

    private boolean whenRangeIsSet() {
      return (optBits & OPT_BIT_WHEN_RANGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean probabilityDecimalIsSet() {
      return (optBits & OPT_BIT_PROBABILITY_DECIMAL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RiskAssessment_Prediction is strict, attribute is already set: ".concat(name));
    }
  }
}
