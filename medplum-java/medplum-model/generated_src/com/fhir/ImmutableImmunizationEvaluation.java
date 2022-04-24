//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImmunizationEvaluation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunizationEvaluation.builder()}.
 */
@org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunizationEvaluation implements com.fhir.ImmunizationEvaluation {
  private final @javax.annotation.Nullable java.lang.Double doseNumberPositiveInt;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final com.fhir.CodeableConcept targetDisease;
  private final @javax.annotation.Nullable java.lang.Double seriesDosesPositiveInt;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> doseStatusReason;
  private final @javax.annotation.Nullable java.lang.String doseNumberString;
  private final com.fhir.CodeableConcept doseStatus;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference authority;
  private final com.fhir.Reference immunizationEvent;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String series;
  private final @javax.annotation.Nullable java.lang.String seriesDosesString;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

  private ImmutableImmunizationEvaluation(
      @javax.annotation.Nullable java.lang.Double doseNumberPositiveInt,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      com.fhir.CodeableConcept targetDisease,
      @javax.annotation.Nullable java.lang.Double seriesDosesPositiveInt,
      @javax.annotation.Nullable com.fhir.id id,
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> doseStatusReason,
      @javax.annotation.Nullable java.lang.String doseNumberString,
      com.fhir.CodeableConcept doseStatus,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference authority,
      com.fhir.Reference immunizationEvent,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String series,
      @javax.annotation.Nullable java.lang.String seriesDosesString,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier) {
    this.doseNumberPositiveInt = doseNumberPositiveInt;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.date = date;
    this.contained = contained;
    this.targetDisease = targetDisease;
    this.seriesDosesPositiveInt = seriesDosesPositiveInt;
    this.id = id;
    this.patient = patient;
    this.description = description;
    this.status = status;
    this.doseStatusReason = doseStatusReason;
    this.doseNumberString = doseNumberString;
    this.doseStatus = doseStatus;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.authority = authority;
    this.immunizationEvent = immunizationEvent;
    this.meta = meta;
    this.series = series;
    this.seriesDosesString = seriesDosesString;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code doseNumberPositiveInt} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doseNumberPositiveInt")
  @Override
  public java.util.Optional<java.lang.Double> doseNumberPositiveInt() {
    return java.util.Optional.ofNullable(doseNumberPositiveInt);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code targetDisease} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetDisease")
  @Override
  public com.fhir.CodeableConcept targetDisease() {
    return targetDisease;
  }

  /**
   * @return The value of the {@code seriesDosesPositiveInt} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("seriesDosesPositiveInt")
  @Override
  public java.util.Optional<java.lang.Double> seriesDosesPositiveInt() {
    return java.util.Optional.ofNullable(seriesDosesPositiveInt);
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
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code doseStatusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doseStatusReason")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> doseStatusReason() {
    return java.util.Optional.ofNullable(doseStatusReason);
  }

  /**
   * @return The value of the {@code doseNumberString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doseNumberString")
  @Override
  public java.util.Optional<java.lang.String> doseNumberString() {
    return java.util.Optional.ofNullable(doseNumberString);
  }

  /**
   * @return The value of the {@code doseStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doseStatus")
  @Override
  public com.fhir.CodeableConcept doseStatus() {
    return doseStatus;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code authority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authority")
  @Override
  public java.util.Optional<com.fhir.Reference> authority() {
    return java.util.Optional.ofNullable(authority);
  }

  /**
   * @return The value of the {@code immunizationEvent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("immunizationEvent")
  @Override
  public com.fhir.Reference immunizationEvent() {
    return immunizationEvent;
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
   * @return The value of the {@code series} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("series")
  @Override
  public java.util.Optional<java.lang.String> series() {
    return java.util.Optional.ofNullable(series);
  }

  /**
   * @return The value of the {@code seriesDosesString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("seriesDosesString")
  @Override
  public java.util.Optional<java.lang.String> seriesDosesString() {
    return java.util.Optional.ofNullable(seriesDosesString);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * @param value The value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberPositiveInt(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.doseNumberPositiveInt, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        newValue,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberPositiveInt(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.doseNumberPositiveInt, value)) return this;
    return new ImmutableImmunizationEvaluation(
        value,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        newValue,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        value,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        newValue,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        value,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        newValue,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        value,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        newValue,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        value,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        newValue,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        value,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#targetDisease() targetDisease} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for targetDisease
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withTargetDisease(com.fhir.CodeableConcept value) {
    if (this.targetDisease == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "targetDisease");
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        newValue,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * @param value The value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesPositiveInt(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.seriesDosesPositiveInt, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        newValue,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesPositiveInt(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.seriesDosesPositiveInt, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        value,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        newValue,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        value,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        newValue,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        newValue,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        value,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        newValue,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        value,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} attribute.
   * @param value The value for doseStatusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseStatusReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "doseStatusReason");
    if (this.doseStatusReason == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        newValue,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseStatusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withDoseStatusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.doseStatusReason == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        value,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#doseNumberString() doseNumberString} attribute.
   * @param value The value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "doseNumberString");
    if (java.util.Objects.equals(this.doseNumberString, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        newValue,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#doseNumberString() doseNumberString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.doseNumberString, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        value,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#doseStatus() doseStatus} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for doseStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseStatus(com.fhir.CodeableConcept value) {
    if (this.doseStatus == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "doseStatus");
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        newValue,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        newValue,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        value,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        value,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withAuthority(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        newValue,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withAuthority(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        value,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for immunizationEvent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withImmunizationEvent(com.fhir.Reference value) {
    if (this.immunizationEvent == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "immunizationEvent");
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        newValue,
        this.meta,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        newValue,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        value,
        this.series,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#series() series} attribute.
   * @param value The value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeries(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "series");
    if (java.util.Objects.equals(this.series, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        newValue,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#series() series} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeries(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.series, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        value,
        this.seriesDosesString,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} attribute.
   * @param value The value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "seriesDosesString");
    if (java.util.Objects.equals(this.seriesDosesString, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.seriesDosesString, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.doseNumberPositiveInt,
        this.text,
        this.modifierExtension,
        this.language,
        this.date,
        this.contained,
        this.targetDisease,
        this.seriesDosesPositiveInt,
        this.id,
        this.patient,
        this.description,
        this.status,
        this.doseStatusReason,
        this.doseNumberString,
        this.doseStatus,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.authority,
        this.immunizationEvent,
        this.meta,
        this.series,
        this.seriesDosesString,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunizationEvaluation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunizationEvaluation
        && equalTo((ImmutableImmunizationEvaluation) another);
  }

  private boolean equalTo(ImmutableImmunizationEvaluation another) {
    return java.util.Objects.equals(doseNumberPositiveInt, another.doseNumberPositiveInt)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(contained, another.contained)
        && targetDisease.equals(another.targetDisease)
        && java.util.Objects.equals(seriesDosesPositiveInt, another.seriesDosesPositiveInt)
        && java.util.Objects.equals(id, another.id)
        && patient.equals(another.patient)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(doseStatusReason, another.doseStatusReason)
        && java.util.Objects.equals(doseNumberString, another.doseNumberString)
        && doseStatus.equals(another.doseStatus)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(authority, another.authority)
        && immunizationEvent.equals(another.immunizationEvent)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(series, another.series)
        && java.util.Objects.equals(seriesDosesString, another.seriesDosesString)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code doseNumberPositiveInt}, {@code text}, {@code modifierExtension}, {@code language}, {@code date}, {@code contained}, {@code targetDisease}, {@code seriesDosesPositiveInt}, {@code id}, {@code patient}, {@code description}, {@code status}, {@code doseStatusReason}, {@code doseNumberString}, {@code doseStatus}, {@code resourceType}, {@code implicitRules}, {@code extension}, {@code authority}, {@code immunizationEvent}, {@code meta}, {@code series}, {@code seriesDosesString}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(doseNumberPositiveInt);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + targetDisease.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(seriesDosesPositiveInt);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(doseStatusReason);
    h += (h << 5) + java.util.Objects.hashCode(doseNumberString);
    h += (h << 5) + doseStatus.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(authority);
    h += (h << 5) + immunizationEvent.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(series);
    h += (h << 5) + java.util.Objects.hashCode(seriesDosesString);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code ImmunizationEvaluation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImmunizationEvaluation{");
    if (doseNumberPositiveInt != null) {
      builder.append("doseNumberPositiveInt=").append(doseNumberPositiveInt);
    }
    if (text != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (date != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (contained != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("targetDisease=").append(targetDisease);
    if (seriesDosesPositiveInt != null) {
      builder.append(", ");
      builder.append("seriesDosesPositiveInt=").append(seriesDosesPositiveInt);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (doseStatusReason != null) {
      builder.append(", ");
      builder.append("doseStatusReason=").append(doseStatusReason);
    }
    if (doseNumberString != null) {
      builder.append(", ");
      builder.append("doseNumberString=").append(doseNumberString);
    }
    builder.append(", ");
    builder.append("doseStatus=").append(doseStatus);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (authority != null) {
      builder.append(", ");
      builder.append("authority=").append(authority);
    }
    builder.append(", ");
    builder.append("immunizationEvent=").append(immunizationEvent);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (series != null) {
      builder.append(", ");
      builder.append("series=").append(series);
    }
    if (seriesDosesString != null) {
      builder.append(", ");
      builder.append("seriesDosesString=").append(seriesDosesString);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImmunizationEvaluation {
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> doseNumberPositiveInt = java.util.Optional.empty();
    boolean doseNumberPositiveIntIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept targetDisease;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> seriesDosesPositiveInt = java.util.Optional.empty();
    boolean seriesDosesPositiveIntIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> doseStatusReason = java.util.Optional.empty();
    boolean doseStatusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> doseNumberString = java.util.Optional.empty();
    boolean doseNumberStringIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept doseStatus;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> authority = java.util.Optional.empty();
    boolean authorityIsSet;
    @javax.annotation.Nullable com.fhir.Reference immunizationEvent;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> series = java.util.Optional.empty();
    boolean seriesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> seriesDosesString = java.util.Optional.empty();
    boolean seriesDosesStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("doseNumberPositiveInt")
    public void setDoseNumberPositiveInt(java.util.Optional<java.lang.Double> doseNumberPositiveInt) {
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      this.doseNumberPositiveIntIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetDisease")
    public void setTargetDisease(com.fhir.CodeableConcept targetDisease) {
      this.targetDisease = targetDisease;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("seriesDosesPositiveInt")
    public void setSeriesDosesPositiveInt(java.util.Optional<java.lang.Double> seriesDosesPositiveInt) {
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      this.seriesDosesPositiveIntIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doseStatusReason")
    public void setDoseStatusReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> doseStatusReason) {
      this.doseStatusReason = doseStatusReason;
      this.doseStatusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doseNumberString")
    public void setDoseNumberString(java.util.Optional<java.lang.String> doseNumberString) {
      this.doseNumberString = doseNumberString;
      this.doseNumberStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doseStatus")
    public void setDoseStatus(com.fhir.CodeableConcept doseStatus) {
      this.doseStatus = doseStatus;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authority")
    public void setAuthority(java.util.Optional<com.fhir.Reference> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("immunizationEvent")
    public void setImmunizationEvent(com.fhir.Reference immunizationEvent) {
      this.immunizationEvent = immunizationEvent;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("series")
    public void setSeries(java.util.Optional<java.lang.String> series) {
      this.series = series;
      this.seriesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("seriesDosesString")
    public void setSeriesDosesString(java.util.Optional<java.lang.String> seriesDosesString) {
      this.seriesDosesString = seriesDosesString;
      this.seriesDosesStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.Double> doseNumberPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept targetDisease() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> seriesDosesPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> doseStatusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> doseNumberString() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept doseStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> authority() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference immunizationEvent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> series() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> seriesDosesString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImmunizationEvaluation fromJson(Json json) {
    ImmutableImmunizationEvaluation.Builder builder = ((ImmutableImmunizationEvaluation.Builder) ImmutableImmunizationEvaluation.builder());
    if (json.doseNumberPositiveIntIsSet) {
      builder.doseNumberPositiveInt(json.doseNumberPositiveInt);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.targetDisease != null) {
      builder.targetDisease(json.targetDisease);
    }
    if (json.seriesDosesPositiveIntIsSet) {
      builder.seriesDosesPositiveInt(json.seriesDosesPositiveInt);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.doseStatusReasonIsSet) {
      builder.doseStatusReason(json.doseStatusReason);
    }
    if (json.doseNumberStringIsSet) {
      builder.doseNumberString(json.doseNumberString);
    }
    if (json.doseStatus != null) {
      builder.doseStatus(json.doseStatus);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    if (json.immunizationEvent != null) {
      builder.immunizationEvent(json.immunizationEvent);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.seriesIsSet) {
      builder.series(json.series);
    }
    if (json.seriesDosesStringIsSet) {
      builder.seriesDosesString(json.seriesDosesString);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableImmunizationEvaluation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImmunizationEvaluation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImmunizationEvaluation instance
   */
  public static ImmunizationEvaluation copyOf(ImmunizationEvaluation instance) {
    if (instance instanceof ImmutableImmunizationEvaluation) {
      return (ImmutableImmunizationEvaluation) instance;
    }
    return ((ImmutableImmunizationEvaluation.Builder) ImmutableImmunizationEvaluation.builder())
        .doseNumberPositiveInt(instance.doseNumberPositiveInt())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .date(instance.date())
        .contained(instance.contained())
        .targetDisease(instance.targetDisease())
        .seriesDosesPositiveInt(instance.seriesDosesPositiveInt())
        .id(instance.id())
        .patient(instance.patient())
        .description(instance.description())
        .status(instance.status())
        .doseStatusReason(instance.doseStatusReason())
        .doseNumberString(instance.doseNumberString())
        .doseStatus(instance.doseStatus())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .authority(instance.authority())
        .immunizationEvent(instance.immunizationEvent())
        .meta(instance.meta())
        .series(instance.series())
        .seriesDosesString(instance.seriesDosesString())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link ImmunizationEvaluation ImmunizationEvaluation}.
   * <pre>
   * ImmutableImmunizationEvaluation.builder()
   *    .doseNumberPositiveInt(Double) // optional {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt}
   *    .text(com.fhir.Narrative) // optional {@link ImmunizationEvaluation#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImmunizationEvaluation#modifierExtension() modifierExtension}
   *    .language(com.fhir.code) // optional {@link ImmunizationEvaluation#language() language}
   *    .date(com.fhir.dateTime) // optional {@link ImmunizationEvaluation#date() date}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ImmunizationEvaluation#contained() contained}
   *    .targetDisease(com.fhir.CodeableConcept) // required {@link ImmunizationEvaluation#targetDisease() targetDisease}
   *    .seriesDosesPositiveInt(Double) // optional {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt}
   *    .id(com.fhir.id) // optional {@link ImmunizationEvaluation#id() id}
   *    .patient(com.fhir.Reference) // required {@link ImmunizationEvaluation#patient() patient}
   *    .description(String) // optional {@link ImmunizationEvaluation#description() description}
   *    .status(com.fhir.code) // optional {@link ImmunizationEvaluation#status() status}
   *    .doseStatusReason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason}
   *    .doseNumberString(String) // optional {@link ImmunizationEvaluation#doseNumberString() doseNumberString}
   *    .doseStatus(com.fhir.CodeableConcept) // required {@link ImmunizationEvaluation#doseStatus() doseStatus}
   *    .resourceType(String) // required {@link ImmunizationEvaluation#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link ImmunizationEvaluation#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImmunizationEvaluation#extension() extension}
   *    .authority(com.fhir.Reference) // optional {@link ImmunizationEvaluation#authority() authority}
   *    .immunizationEvent(com.fhir.Reference) // required {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent}
   *    .meta(com.fhir.Meta) // optional {@link ImmunizationEvaluation#meta() meta}
   *    .series(String) // optional {@link ImmunizationEvaluation#series() series}
   *    .seriesDosesString(String) // optional {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ImmunizationEvaluation#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new ImmunizationEvaluation builder
   */
  public static TargetDiseaseBuildStage builder() {
    return new ImmutableImmunizationEvaluation.Builder();
  }

  /**
   * Builds instances of type {@link ImmunizationEvaluation ImmunizationEvaluation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements TargetDiseaseBuildStage, PatientBuildStage, DoseStatusBuildStage, ResourceTypeBuildStage, ImmunizationEventBuildStage, BuildFinal {
    private static final long INIT_BIT_TARGET_DISEASE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long INIT_BIT_DOSE_STATUS = 0x4L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x8L;
    private static final long INIT_BIT_IMMUNIZATION_EVENT = 0x10L;
    private static final long OPT_BIT_DOSE_NUMBER_POSITIVE_INT = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_DATE = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_SERIES_DOSES_POSITIVE_INT = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_DOSE_STATUS_REASON = 0x400L;
    private static final long OPT_BIT_DOSE_NUMBER_STRING = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_AUTHORITY = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_SERIES = 0x10000L;
    private static final long OPT_BIT_SERIES_DOSES_STRING = 0x20000L;
    private static final long OPT_BIT_IDENTIFIER = 0x40000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @javax.annotation.Nullable java.lang.Double doseNumberPositiveInt;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept targetDisease;
    private @javax.annotation.Nullable java.lang.Double seriesDosesPositiveInt;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> doseStatusReason;
    private @javax.annotation.Nullable java.lang.String doseNumberString;
    private @javax.annotation.Nullable com.fhir.CodeableConcept doseStatus;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference authority;
    private @javax.annotation.Nullable com.fhir.Reference immunizationEvent;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String series;
    private @javax.annotation.Nullable java.lang.String seriesDosesString;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseNumberPositiveInt(double doseNumberPositiveInt) {
      checkNotIsSet(doseNumberPositiveIntIsSet(), "doseNumberPositiveInt");
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      optBits |= OPT_BIT_DOSE_NUMBER_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doseNumberPositiveInt")
    public final Builder doseNumberPositiveInt(java.util.Optional<java.lang.Double> doseNumberPositiveInt) {
      checkNotIsSet(doseNumberPositiveIntIsSet(), "doseNumberPositiveInt");
      this.doseNumberPositiveInt = doseNumberPositiveInt.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
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
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
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
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
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
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
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
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
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
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
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
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
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
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
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
     * Initializes the value for the {@link ImmunizationEvaluation#targetDisease() targetDisease} attribute.
     * @param targetDisease The value for targetDisease 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDisease")
    public final Builder targetDisease(com.fhir.CodeableConcept targetDisease) {
      checkNotIsSet(targetDiseaseIsSet(), "targetDisease");
      this.targetDisease = java.util.Objects.requireNonNull(targetDisease, "targetDisease");
      initBits &= ~INIT_BIT_TARGET_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriesDosesPositiveInt(double seriesDosesPositiveInt) {
      checkNotIsSet(seriesDosesPositiveIntIsSet(), "seriesDosesPositiveInt");
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      optBits |= OPT_BIT_SERIES_DOSES_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seriesDosesPositiveInt")
    public final Builder seriesDosesPositiveInt(java.util.Optional<java.lang.Double> seriesDosesPositiveInt) {
      checkNotIsSet(seriesDosesPositiveIntIsSet(), "seriesDosesPositiveInt");
      this.seriesDosesPositiveInt = seriesDosesPositiveInt.orElse(null);
      optBits |= OPT_BIT_SERIES_DOSES_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
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
     * Initializes the value for the {@link ImmunizationEvaluation#patient() patient} attribute.
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
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
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
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
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
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
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
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
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
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseStatusReason(java.util.List<com.fhir.CodeableConcept> doseStatusReason) {
      checkNotIsSet(doseStatusReasonIsSet(), "doseStatusReason");
      this.doseStatusReason = java.util.Objects.requireNonNull(doseStatusReason, "doseStatusReason");
      optBits |= OPT_BIT_DOSE_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doseStatusReason")
    public final Builder doseStatusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> doseStatusReason) {
      checkNotIsSet(doseStatusReasonIsSet(), "doseStatusReason");
      this.doseStatusReason = doseStatusReason.orElse(null);
      optBits |= OPT_BIT_DOSE_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseNumberString(java.lang.String doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = java.util.Objects.requireNonNull(doseNumberString, "doseNumberString");
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doseNumberString")
    public final Builder doseNumberString(java.util.Optional<java.lang.String> doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = doseNumberString.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationEvaluation#doseStatus() doseStatus} attribute.
     * @param doseStatus The value for doseStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doseStatus")
    public final Builder doseStatus(com.fhir.CodeableConcept doseStatus) {
      checkNotIsSet(doseStatusIsSet(), "doseStatus");
      this.doseStatus = java.util.Objects.requireNonNull(doseStatus, "doseStatus");
      initBits &= ~INIT_BIT_DOSE_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationEvaluation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(com.fhir.Reference authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = java.util.Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authority")
    public final Builder authority(java.util.Optional<? extends com.fhir.Reference> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = authority.orElse(null);
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent} attribute.
     * @param immunizationEvent The value for immunizationEvent 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("immunizationEvent")
    public final Builder immunizationEvent(com.fhir.Reference immunizationEvent) {
      checkNotIsSet(immunizationEventIsSet(), "immunizationEvent");
      this.immunizationEvent = java.util.Objects.requireNonNull(immunizationEvent, "immunizationEvent");
      initBits &= ~INIT_BIT_IMMUNIZATION_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
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
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
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
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    public final Builder series(java.lang.String series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = java.util.Objects.requireNonNull(series, "series");
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("series")
    public final Builder series(java.util.Optional<java.lang.String> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = series.orElse(null);
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriesDosesString(java.lang.String seriesDosesString) {
      checkNotIsSet(seriesDosesStringIsSet(), "seriesDosesString");
      this.seriesDosesString = java.util.Objects.requireNonNull(seriesDosesString, "seriesDosesString");
      optBits |= OPT_BIT_SERIES_DOSES_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("seriesDosesString")
    public final Builder seriesDosesString(java.util.Optional<java.lang.String> seriesDosesString) {
      checkNotIsSet(seriesDosesStringIsSet(), "seriesDosesString");
      this.seriesDosesString = seriesDosesString.orElse(null);
      optBits |= OPT_BIT_SERIES_DOSES_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ImmunizationEvaluation#identifier() identifier} to identifier.
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
     * Builds a new {@link ImmunizationEvaluation ImmunizationEvaluation}.
     * @return An immutable instance of ImmunizationEvaluation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImmunizationEvaluation build() {
      checkRequiredAttributes();
      return new ImmutableImmunizationEvaluation(
          doseNumberPositiveInt,
          text,
          modifierExtension,
          language,
          date,
          contained,
          targetDisease,
          seriesDosesPositiveInt,
          id,
          patient,
          description,
          status,
          doseStatusReason,
          doseNumberString,
          doseStatus,
          resourceType,
          implicitRules,
          extension,
          authority,
          immunizationEvent,
          meta,
          series,
          seriesDosesString,
          identifier);
    }

    private boolean doseNumberPositiveIntIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_POSITIVE_INT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean seriesDosesPositiveIntIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_POSITIVE_INT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean doseStatusReasonIsSet() {
      return (optBits & OPT_BIT_DOSE_STATUS_REASON) != 0;
    }

    private boolean doseNumberStringIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_STRING) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean seriesIsSet() {
      return (optBits & OPT_BIT_SERIES) != 0;
    }

    private boolean seriesDosesStringIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_STRING) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean targetDiseaseIsSet() {
      return (initBits & INIT_BIT_TARGET_DISEASE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean doseStatusIsSet() {
      return (initBits & INIT_BIT_DOSE_STATUS) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean immunizationEventIsSet() {
      return (initBits & INIT_BIT_IMMUNIZATION_EVENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImmunizationEvaluation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!targetDiseaseIsSet()) attributes.add("targetDisease");
      if (!patientIsSet()) attributes.add("patient");
      if (!doseStatusIsSet()) attributes.add("doseStatus");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!immunizationEventIsSet()) attributes.add("immunizationEvent");
      return "Cannot build ImmunizationEvaluation, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface TargetDiseaseBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#targetDisease() targetDisease} attribute.
     * @param targetDisease The value for targetDisease 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage targetDisease(com.fhir.CodeableConcept targetDisease);
  }

  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    DoseStatusBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface DoseStatusBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#doseStatus() doseStatus} attribute.
     * @param doseStatus The value for doseStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage doseStatus(com.fhir.CodeableConcept doseStatus);
  }

  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ImmunizationEventBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface ImmunizationEventBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent} attribute.
     * @param immunizationEvent The value for immunizationEvent 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal immunizationEvent(com.fhir.Reference immunizationEvent);
  }

  @org.immutables.value.Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseNumberPositiveInt(double doseNumberPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseNumberPositiveInt(java.util.Optional<java.lang.Double> doseNumberPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal seriesDosesPositiveInt(double seriesDosesPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal seriesDosesPositiveInt(java.util.Optional<java.lang.Double> seriesDosesPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseStatusReason(java.util.List<com.fhir.CodeableConcept> doseStatusReason);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseStatusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> doseStatusReason);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseNumberString(java.lang.String doseNumberString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseNumberString(java.util.Optional<java.lang.String> doseNumberString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authority(com.fhir.Reference authority);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authority(java.util.Optional<? extends com.fhir.Reference> authority);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    BuildFinal series(java.lang.String series);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal series(java.util.Optional<java.lang.String> series);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal seriesDosesString(java.lang.String seriesDosesString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal seriesDosesString(java.util.Optional<java.lang.String> seriesDosesString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Builds a new {@link ImmunizationEvaluation ImmunizationEvaluation}.
     * @return An immutable instance of ImmunizationEvaluation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImmunizationEvaluation build();
  }
}
