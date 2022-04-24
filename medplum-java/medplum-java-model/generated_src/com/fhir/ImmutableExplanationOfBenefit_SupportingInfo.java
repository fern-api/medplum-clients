//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExplanationOfBenefit_SupportingInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_SupportingInfo.builder()}.
 */
@org.immutables.value.Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_SupportingInfo
    implements com.fhir.ExplanationOfBenefit_SupportingInfo {
  private final @javax.annotation.Nullable java.lang.Boolean valueBoolean;
  private final @javax.annotation.Nullable com.fhir.Attachment valueAttachment;
  private final @javax.annotation.Nullable java.lang.String timingDate;
  private final com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable com.fhir.Reference valueReference;
  private final @javax.annotation.Nullable com.fhir.Period timingPeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Quantity valueQuantity;
  private final @javax.annotation.Nullable com.fhir.Coding reason;
  private final @javax.annotation.Nullable java.lang.String valueString;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableExplanationOfBenefit_SupportingInfo(
      @javax.annotation.Nullable java.lang.Boolean valueBoolean,
      @javax.annotation.Nullable com.fhir.Attachment valueAttachment,
      @javax.annotation.Nullable java.lang.String timingDate,
      com.fhir.CodeableConcept category,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable com.fhir.Reference valueReference,
      @javax.annotation.Nullable com.fhir.Period timingPeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Quantity valueQuantity,
      @javax.annotation.Nullable com.fhir.Coding reason,
      @javax.annotation.Nullable java.lang.String valueString,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id) {
    this.valueBoolean = valueBoolean;
    this.valueAttachment = valueAttachment;
    this.timingDate = timingDate;
    this.category = category;
    this.code = code;
    this.sequence = sequence;
    this.valueReference = valueReference;
    this.timingPeriod = timingPeriod;
    this.modifierExtension = modifierExtension;
    this.valueQuantity = valueQuantity;
    this.reason = reason;
    this.valueString = valueString;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> valueBoolean() {
    return java.util.Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valueAttachment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueAttachment")
  @Override
  public java.util.Optional<com.fhir.Attachment> valueAttachment() {
    return java.util.Optional.ofNullable(valueAttachment);
  }

  /**
   * @return The value of the {@code timingDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingDate")
  @Override
  public java.util.Optional<java.lang.String> timingDate() {
    return java.util.Optional.ofNullable(timingDate);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public com.fhir.CodeableConcept category() {
    return category;
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
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code valueReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueReference")
  @Override
  public java.util.Optional<com.fhir.Reference> valueReference() {
    return java.util.Optional.ofNullable(valueReference);
  }

  /**
   * @return The value of the {@code timingPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> timingPeriod() {
    return java.util.Optional.ofNullable(timingPeriod);
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
   * @return The value of the {@code valueQuantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> valueQuantity() {
    return java.util.Optional.ofNullable(valueQuantity);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @Override
  public java.util.Optional<com.fhir.Coding> reason() {
    return java.util.Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueString")
  @Override
  public java.util.Optional<java.lang.String> valueString() {
    return java.util.Optional.ofNullable(valueString);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        newValue,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        value,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueAttachment(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        newValue,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueAttachment(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        value,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} attribute.
   * @param value The value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "timingDate");
    if (java.util.Objects.equals(this.timingDate, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        newValue,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.timingDate, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        value,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_SupportingInfo#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withCategory(com.fhir.CodeableConcept value) {
    if (this.category == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        newValue,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        newValue,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        value,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        newValue,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        value,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        newValue,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        value,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        newValue,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withTimingPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        value,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        newValue,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        value,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        newValue,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        value,
        this.reason,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withReason(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        newValue,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withReason(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        value,
        this.valueString,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueString");
    if (java.util.Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        newValue,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withValueString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueString, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        value,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SupportingInfo withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SupportingInfo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SupportingInfo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SupportingInfo withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_SupportingInfo(
        this.valueBoolean,
        this.valueAttachment,
        this.timingDate,
        this.category,
        this.code,
        this.sequence,
        this.valueReference,
        this.timingPeriod,
        this.modifierExtension,
        this.valueQuantity,
        this.reason,
        this.valueString,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_SupportingInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_SupportingInfo
        && equalTo((ImmutableExplanationOfBenefit_SupportingInfo) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_SupportingInfo another) {
    return java.util.Objects.equals(valueBoolean, another.valueBoolean)
        && java.util.Objects.equals(valueAttachment, another.valueAttachment)
        && java.util.Objects.equals(timingDate, another.timingDate)
        && category.equals(another.category)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(valueReference, another.valueReference)
        && java.util.Objects.equals(timingPeriod, another.timingPeriod)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(valueQuantity, another.valueQuantity)
        && java.util.Objects.equals(reason, another.reason)
        && java.util.Objects.equals(valueString, another.valueString)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code valueBoolean}, {@code valueAttachment}, {@code timingDate}, {@code category}, {@code code}, {@code sequence}, {@code valueReference}, {@code timingPeriod}, {@code modifierExtension}, {@code valueQuantity}, {@code reason}, {@code valueString}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(valueBoolean);
    h += (h << 5) + java.util.Objects.hashCode(valueAttachment);
    h += (h << 5) + java.util.Objects.hashCode(timingDate);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(valueReference);
    h += (h << 5) + java.util.Objects.hashCode(timingPeriod);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(valueQuantity);
    h += (h << 5) + java.util.Objects.hashCode(reason);
    h += (h << 5) + java.util.Objects.hashCode(valueString);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_SupportingInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExplanationOfBenefit_SupportingInfo{");
    if (valueBoolean != null) {
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueAttachment != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (timingDate != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("timingDate=").append(timingDate);
    }
    if (builder.length() > 36) builder.append(", ");
    builder.append("category=").append(category);
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (valueReference != null) {
      builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (timingPeriod != null) {
      builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueQuantity != null) {
      builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (valueString != null) {
      builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
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
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExplanationOfBenefit_SupportingInfo {
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> valueBoolean = java.util.Optional.empty();
    boolean valueBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> valueAttachment = java.util.Optional.empty();
    boolean valueAttachmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> timingDate = java.util.Optional.empty();
    boolean timingDateIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept category;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> valueReference = java.util.Optional.empty();
    boolean valueReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> timingPeriod = java.util.Optional.empty();
    boolean timingPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> valueQuantity = java.util.Optional.empty();
    boolean valueQuantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> reason = java.util.Optional.empty();
    boolean reasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueString = java.util.Optional.empty();
    boolean valueStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public void setValueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueAttachment")
    public void setValueAttachment(java.util.Optional<com.fhir.Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingDate")
    public void setTimingDate(java.util.Optional<java.lang.String> timingDate) {
      this.timingDate = timingDate;
      this.timingDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(com.fhir.CodeableConcept category) {
      this.category = category;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueReference")
    public void setValueReference(java.util.Optional<com.fhir.Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public void setTimingPeriod(java.util.Optional<com.fhir.Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
    public void setValueQuantity(java.util.Optional<com.fhir.Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(java.util.Optional<com.fhir.Coding> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public void setValueString(java.util.Optional<java.lang.String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> timingDate() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> reason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_SupportingInfo fromJson(Json json) {
    ImmutableExplanationOfBenefit_SupportingInfo.Builder builder = ((ImmutableExplanationOfBenefit_SupportingInfo.Builder) ImmutableExplanationOfBenefit_SupportingInfo.builder());
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.timingDateIsSet) {
      builder.timingDate(json.timingDate);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableExplanationOfBenefit_SupportingInfo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_SupportingInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_SupportingInfo instance
   */
  public static ExplanationOfBenefit_SupportingInfo copyOf(ExplanationOfBenefit_SupportingInfo instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_SupportingInfo) {
      return (ImmutableExplanationOfBenefit_SupportingInfo) instance;
    }
    return ((ImmutableExplanationOfBenefit_SupportingInfo.Builder) ImmutableExplanationOfBenefit_SupportingInfo.builder())
        .valueBoolean(instance.valueBoolean())
        .valueAttachment(instance.valueAttachment())
        .timingDate(instance.timingDate())
        .category(instance.category())
        .code(instance.code())
        .sequence(instance.sequence())
        .valueReference(instance.valueReference())
        .timingPeriod(instance.timingPeriod())
        .modifierExtension(instance.modifierExtension())
        .valueQuantity(instance.valueQuantity())
        .reason(instance.reason())
        .valueString(instance.valueString())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
   * <pre>
   * ImmutableExplanationOfBenefit_SupportingInfo.builder()
   *    .valueBoolean(Boolean) // optional {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean}
   *    .valueAttachment(com.fhir.Attachment) // optional {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment}
   *    .timingDate(String) // optional {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate}
   *    .category(com.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_SupportingInfo#category() category}
   *    .code(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_SupportingInfo#code() code}
   *    .sequence(com.fhir.positiveInt) // optional {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence}
   *    .valueReference(com.fhir.Reference) // optional {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference}
   *    .timingPeriod(com.fhir.Period) // optional {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension}
   *    .valueQuantity(com.fhir.Quantity) // optional {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity}
   *    .reason(com.fhir.Coding) // optional {@link ExplanationOfBenefit_SupportingInfo#reason() reason}
   *    .valueString(String) // optional {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SupportingInfo#extension() extension}
   *    .id(String) // optional {@link ExplanationOfBenefit_SupportingInfo#id() id}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_SupportingInfo builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableExplanationOfBenefit_SupportingInfo.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x1L;
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x2L;
    private static final long OPT_BIT_TIMING_DATE = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_SEQUENCE = 0x10L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x20L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x100L;
    private static final long OPT_BIT_REASON = 0x200L;
    private static final long OPT_BIT_VALUE_STRING = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.Boolean valueBoolean;
    private @javax.annotation.Nullable com.fhir.Attachment valueAttachment;
    private @javax.annotation.Nullable java.lang.String timingDate;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable com.fhir.Reference valueReference;
    private @javax.annotation.Nullable com.fhir.Period timingPeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Quantity valueQuantity;
    private @javax.annotation.Nullable com.fhir.Coding reason;
    private @javax.annotation.Nullable java.lang.String valueString;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBoolean(boolean valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean;
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public final Builder valueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAttachment(com.fhir.Attachment valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = java.util.Objects.requireNonNull(valueAttachment, "valueAttachment");
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueAttachment")
    public final Builder valueAttachment(java.util.Optional<? extends com.fhir.Attachment> valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = valueAttachment.orElse(null);
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDate(java.lang.String timingDate) {
      checkNotIsSet(timingDateIsSet(), "timingDate");
      this.timingDate = java.util.Objects.requireNonNull(timingDate, "timingDate");
      optBits |= OPT_BIT_TIMING_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingDate")
    public final Builder timingDate(java.util.Optional<java.lang.String> timingDate) {
      checkNotIsSet(timingDateIsSet(), "timingDate");
      this.timingDate = timingDate.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit_SupportingInfo#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(com.fhir.CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueReference(com.fhir.Reference valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = java.util.Objects.requireNonNull(valueReference, "valueReference");
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueReference")
    public final Builder valueReference(java.util.Optional<? extends com.fhir.Reference> valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = valueReference.orElse(null);
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(com.fhir.Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = java.util.Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public final Builder timingPeriod(java.util.Optional<? extends com.fhir.Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(com.fhir.Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = java.util.Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
    public final Builder valueQuantity(java.util.Optional<? extends com.fhir.Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(com.fhir.Coding reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = java.util.Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public final Builder reason(java.util.Optional<? extends com.fhir.Coding> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(java.lang.String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = java.util.Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public final Builder valueString(java.util.Optional<java.lang.String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
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
     * Builds a new {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
     * @return An immutable instance of ExplanationOfBenefit_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExplanationOfBenefit_SupportingInfo build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_SupportingInfo(
          valueBoolean,
          valueAttachment,
          timingDate,
          category,
          code,
          sequence,
          valueReference,
          timingPeriod,
          modifierExtension,
          valueQuantity,
          reason,
          valueString,
          extension,
          id);
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean timingDateIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExplanationOfBenefit_SupportingInfo is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build ExplanationOfBenefit_SupportingInfo, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_SupportingInfo#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SupportingInfo", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueBoolean(boolean valueBoolean);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueAttachment(com.fhir.Attachment valueAttachment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueAttachment(java.util.Optional<? extends com.fhir.Attachment> valueAttachment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDate(java.lang.String timingDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDate(java.util.Optional<java.lang.String> timingDate);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(com.fhir.positiveInt sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueReference(com.fhir.Reference valueReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueReference(java.util.Optional<? extends com.fhir.Reference> valueReference);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingPeriod(com.fhir.Period timingPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingPeriod(java.util.Optional<? extends com.fhir.Period> timingPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(com.fhir.Quantity valueQuantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(java.util.Optional<? extends com.fhir.Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(com.fhir.Coding reason);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(java.util.Optional<? extends com.fhir.Coding> reason);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueString(java.lang.String valueString);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueString(java.util.Optional<java.lang.String> valueString);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Builds a new {@link ExplanationOfBenefit_SupportingInfo ExplanationOfBenefit_SupportingInfo}.
     * @return An immutable instance of ExplanationOfBenefit_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_SupportingInfo build();
  }
}
