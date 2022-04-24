//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RiskEvidenceSynthesis_RiskEstimate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskEvidenceSynthesis_RiskEstimate.builder()}.
 */
@org.immutables.value.Generated(from = "RiskEvidenceSynthesis_RiskEstimate", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskEvidenceSynthesis_RiskEstimate
    implements com.fhir.RiskEvidenceSynthesis_RiskEstimate {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept unitOfMeasure;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.decimal value;
  private final @javax.annotation.Nullable java.lang.Integer numeratorCount;
  private final @javax.annotation.Nullable java.lang.Integer denominatorCount;

  private ImmutableRiskEvidenceSynthesis_RiskEstimate(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept unitOfMeasure,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.decimal value,
      @javax.annotation.Nullable java.lang.Integer numeratorCount,
      @javax.annotation.Nullable java.lang.Integer denominatorCount) {
    this.modifierExtension = modifierExtension;
    this.unitOfMeasure = unitOfMeasure;
    this.extension = extension;
    this.type = type;
    this.precisionEstimate = precisionEstimate;
    this.id = id;
    this.description = description;
    this.value = value;
    this.numeratorCount = numeratorCount;
    this.denominatorCount = denominatorCount;
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
   * @return The value of the {@code unitOfMeasure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> unitOfMeasure() {
    return java.util.Optional.ofNullable(unitOfMeasure);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code precisionEstimate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("precisionEstimate")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate() {
    return java.util.Optional.ofNullable(precisionEstimate);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<com.fhir.decimal> value() {
    return java.util.Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code numeratorCount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("numeratorCount")
  @Override
  public java.util.Optional<java.lang.Integer> numeratorCount() {
    return java.util.Optional.ofNullable(numeratorCount);
  }

  /**
   * @return The value of the {@code denominatorCount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("denominatorCount")
  @Override
  public java.util.Optional<java.lang.Integer> denominatorCount() {
    return java.util.Optional.ofNullable(denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        newValue,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        value,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} attribute.
   * @param value The value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withUnitOfMeasure(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "unitOfMeasure");
    if (this.unitOfMeasure == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        newValue,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitOfMeasure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withUnitOfMeasure(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.unitOfMeasure == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        value,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        newValue,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        value,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        newValue,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        value,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} attribute.
   * @param value The value for precisionEstimate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withPrecisionEstimate(java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate> newValue = java.util.Objects.requireNonNull(value, "precisionEstimate");
    if (this.precisionEstimate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        newValue,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precisionEstimate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withPrecisionEstimate(java.util.Optional<? extends java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate> value = optional.orElse(null);
    if (this.precisionEstimate == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        value,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        newValue,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        value,
        this.description,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        newValue,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        value,
        this.value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withValue(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        newValue,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withValue(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        value,
        this.numeratorCount,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} attribute.
   * @param value The value for numeratorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withNumeratorCount(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.numeratorCount, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        newValue,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numeratorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withNumeratorCount(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.numeratorCount, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        value,
        this.denominatorCount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} attribute.
   * @param value The value for denominatorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDenominatorCount(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.denominatorCount, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for denominatorCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_RiskEstimate withDenominatorCount(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.denominatorCount, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
        this.modifierExtension,
        this.unitOfMeasure,
        this.extension,
        this.type,
        this.precisionEstimate,
        this.id,
        this.description,
        this.value,
        this.numeratorCount,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskEvidenceSynthesis_RiskEstimate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskEvidenceSynthesis_RiskEstimate
        && equalTo((ImmutableRiskEvidenceSynthesis_RiskEstimate) another);
  }

  private boolean equalTo(ImmutableRiskEvidenceSynthesis_RiskEstimate another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(unitOfMeasure, another.unitOfMeasure)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(precisionEstimate, another.precisionEstimate)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(numeratorCount, another.numeratorCount)
        && java.util.Objects.equals(denominatorCount, another.denominatorCount);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code unitOfMeasure}, {@code extension}, {@code type}, {@code precisionEstimate}, {@code id}, {@code description}, {@code value}, {@code numeratorCount}, {@code denominatorCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(unitOfMeasure);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(precisionEstimate);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(numeratorCount);
    h += (h << 5) + java.util.Objects.hashCode(denominatorCount);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskEvidenceSynthesis_RiskEstimate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RiskEvidenceSynthesis_RiskEstimate{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (unitOfMeasure != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("unitOfMeasure=").append(unitOfMeasure);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (precisionEstimate != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("precisionEstimate=").append(precisionEstimate);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (value != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (numeratorCount != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("numeratorCount=").append(numeratorCount);
    }
    if (denominatorCount != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("denominatorCount=").append(denominatorCount);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis_RiskEstimate", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RiskEvidenceSynthesis_RiskEstimate {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> unitOfMeasure = java.util.Optional.empty();
    boolean unitOfMeasureIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate = java.util.Optional.empty();
    boolean precisionEstimateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> numeratorCount = java.util.Optional.empty();
    boolean numeratorCountIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> denominatorCount = java.util.Optional.empty();
    boolean denominatorCountIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(java.util.Optional<com.fhir.CodeableConcept> unitOfMeasure) {
      this.unitOfMeasure = unitOfMeasure;
      this.unitOfMeasureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("precisionEstimate")
    public void setPrecisionEstimate(java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate) {
      this.precisionEstimate = precisionEstimate;
      this.precisionEstimateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<com.fhir.decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("numeratorCount")
    public void setNumeratorCount(java.util.Optional<java.lang.Integer> numeratorCount) {
      this.numeratorCount = numeratorCount;
      this.numeratorCountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("denominatorCount")
    public void setDenominatorCount(java.util.Optional<java.lang.Integer> denominatorCount) {
      this.denominatorCount = denominatorCount;
      this.denominatorCountIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> unitOfMeasure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> numeratorCount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> denominatorCount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRiskEvidenceSynthesis_RiskEstimate fromJson(Json json) {
    ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder builder = ImmutableRiskEvidenceSynthesis_RiskEstimate.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.unitOfMeasureIsSet) {
      builder.unitOfMeasure(json.unitOfMeasure);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.precisionEstimateIsSet) {
      builder.precisionEstimate(json.precisionEstimate);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.numeratorCountIsSet) {
      builder.numeratorCount(json.numeratorCount);
    }
    if (json.denominatorCountIsSet) {
      builder.denominatorCount(json.denominatorCount);
    }
    return (ImmutableRiskEvidenceSynthesis_RiskEstimate) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskEvidenceSynthesis_RiskEstimate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskEvidenceSynthesis_RiskEstimate instance
   */
  public static RiskEvidenceSynthesis_RiskEstimate copyOf(RiskEvidenceSynthesis_RiskEstimate instance) {
    if (instance instanceof ImmutableRiskEvidenceSynthesis_RiskEstimate) {
      return (ImmutableRiskEvidenceSynthesis_RiskEstimate) instance;
    }
    return ImmutableRiskEvidenceSynthesis_RiskEstimate.builder()
        .modifierExtension(instance.modifierExtension())
        .unitOfMeasure(instance.unitOfMeasure())
        .extension(instance.extension())
        .type(instance.type())
        .precisionEstimate(instance.precisionEstimate())
        .id(instance.id())
        .description(instance.description())
        .value(instance.value())
        .numeratorCount(instance.numeratorCount())
        .denominatorCount(instance.denominatorCount())
        .build();
  }

  /**
   * Creates a builder for {@link RiskEvidenceSynthesis_RiskEstimate RiskEvidenceSynthesis_RiskEstimate}.
   * <pre>
   * ImmutableRiskEvidenceSynthesis_RiskEstimate.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension}
   *    .unitOfMeasure(com.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension}
   *    .type(com.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis_RiskEstimate#type() type}
   *    .precisionEstimate(List&amp;lt;com.fhir.RiskEvidenceSynthesis_PrecisionEstimate&amp;gt;) // optional {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate}
   *    .id(String) // optional {@link RiskEvidenceSynthesis_RiskEstimate#id() id}
   *    .description(String) // optional {@link RiskEvidenceSynthesis_RiskEstimate#description() description}
   *    .value(com.fhir.decimal) // optional {@link RiskEvidenceSynthesis_RiskEstimate#value() value}
   *    .numeratorCount(Integer) // optional {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount}
   *    .denominatorCount(Integer) // optional {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount}
   *    .build();
   * </pre>
   * @return A new RiskEvidenceSynthesis_RiskEstimate builder
   */
  public static ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder builder() {
    return new ImmutableRiskEvidenceSynthesis_RiskEstimate.Builder();
  }

  /**
   * Builds instances of type {@link RiskEvidenceSynthesis_RiskEstimate RiskEvidenceSynthesis_RiskEstimate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis_RiskEstimate", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_UNIT_OF_MEASURE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_PRECISION_ESTIMATE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private static final long OPT_BIT_VALUE = 0x80L;
    private static final long OPT_BIT_NUMERATOR_COUNT = 0x100L;
    private static final long OPT_BIT_DENOMINATOR_COUNT = 0x200L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept unitOfMeasure;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.decimal value;
    private @javax.annotation.Nullable java.lang.Integer numeratorCount;
    private @javax.annotation.Nullable java.lang.Integer denominatorCount;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
     * @param unitOfMeasure The value for unitOfMeasure
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitOfMeasure(com.fhir.CodeableConcept unitOfMeasure) {
      checkNotIsSet(unitOfMeasureIsSet(), "unitOfMeasure");
      this.unitOfMeasure = java.util.Objects.requireNonNull(unitOfMeasure, "unitOfMeasure");
      optBits |= OPT_BIT_UNIT_OF_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#unitOfMeasure() unitOfMeasure} to unitOfMeasure.
     * @param unitOfMeasure The value for unitOfMeasure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    public final Builder unitOfMeasure(java.util.Optional<? extends com.fhir.CodeableConcept> unitOfMeasure) {
      checkNotIsSet(unitOfMeasureIsSet(), "unitOfMeasure");
      this.unitOfMeasure = unitOfMeasure.orElse(null);
      optBits |= OPT_BIT_UNIT_OF_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} to precisionEstimate.
     * @param precisionEstimate The value for precisionEstimate
     * @return {@code this} builder for chained invocation
     */
    public final Builder precisionEstimate(java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate> precisionEstimate) {
      checkNotIsSet(precisionEstimateIsSet(), "precisionEstimate");
      this.precisionEstimate = java.util.Objects.requireNonNull(precisionEstimate, "precisionEstimate");
      optBits |= OPT_BIT_PRECISION_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#precisionEstimate() precisionEstimate} to precisionEstimate.
     * @param precisionEstimate The value for precisionEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("precisionEstimate")
    public final Builder precisionEstimate(java.util.Optional<? extends java.util.List<com.fhir.RiskEvidenceSynthesis_PrecisionEstimate>> precisionEstimate) {
      checkNotIsSet(precisionEstimateIsSet(), "precisionEstimate");
      this.precisionEstimate = precisionEstimate.orElse(null);
      optBits |= OPT_BIT_PRECISION_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(com.fhir.decimal value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<? extends com.fhir.decimal> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} to numeratorCount.
     * @param numeratorCount The value for numeratorCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder numeratorCount(int numeratorCount) {
      checkNotIsSet(numeratorCountIsSet(), "numeratorCount");
      this.numeratorCount = numeratorCount;
      optBits |= OPT_BIT_NUMERATOR_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#numeratorCount() numeratorCount} to numeratorCount.
     * @param numeratorCount The value for numeratorCount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numeratorCount")
    public final Builder numeratorCount(java.util.Optional<java.lang.Integer> numeratorCount) {
      checkNotIsSet(numeratorCountIsSet(), "numeratorCount");
      this.numeratorCount = numeratorCount.orElse(null);
      optBits |= OPT_BIT_NUMERATOR_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} to denominatorCount.
     * @param denominatorCount The value for denominatorCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder denominatorCount(int denominatorCount) {
      checkNotIsSet(denominatorCountIsSet(), "denominatorCount");
      this.denominatorCount = denominatorCount;
      optBits |= OPT_BIT_DENOMINATOR_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_RiskEstimate#denominatorCount() denominatorCount} to denominatorCount.
     * @param denominatorCount The value for denominatorCount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("denominatorCount")
    public final Builder denominatorCount(java.util.Optional<java.lang.Integer> denominatorCount) {
      checkNotIsSet(denominatorCountIsSet(), "denominatorCount");
      this.denominatorCount = denominatorCount.orElse(null);
      optBits |= OPT_BIT_DENOMINATOR_COUNT;
      return this;
    }

    /**
     * Builds a new {@link RiskEvidenceSynthesis_RiskEstimate RiskEvidenceSynthesis_RiskEstimate}.
     * @return An immutable instance of RiskEvidenceSynthesis_RiskEstimate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RiskEvidenceSynthesis_RiskEstimate build() {
      return new ImmutableRiskEvidenceSynthesis_RiskEstimate(
          modifierExtension,
          unitOfMeasure,
          extension,
          type,
          precisionEstimate,
          id,
          description,
          value,
          numeratorCount,
          denominatorCount);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean unitOfMeasureIsSet() {
      return (optBits & OPT_BIT_UNIT_OF_MEASURE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean precisionEstimateIsSet() {
      return (optBits & OPT_BIT_PRECISION_ESTIMATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean numeratorCountIsSet() {
      return (optBits & OPT_BIT_NUMERATOR_COUNT) != 0;
    }

    private boolean denominatorCountIsSet() {
      return (optBits & OPT_BIT_DENOMINATOR_COUNT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RiskEvidenceSynthesis_RiskEstimate is strict, attribute is already set: ".concat(name));
    }
  }
}
