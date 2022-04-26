package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ImmunizationEvaluation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunizationEvaluation.builder()}.
 */
@Generated(from = "ImmunizationEvaluation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunizationEvaluation implements ImmunizationEvaluation {
  private final @Nullable DateTime date;
  private final @Nullable Reference authority;
  private final @Nullable List<ResourceList> contained;
  private final Reference immunizationEvent;
  private final @Nullable String doseNumberString;
  private final @Nullable String series;
  private final @Nullable Double doseNumberPositiveInt;
  private final @Nullable Code status;
  private final @Nullable String description;
  private final Reference patient;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable List<CodeableConcept> doseStatusReason;
  private final CodeableConcept targetDisease;
  private final @Nullable Uri implicitRules;
  private final @Nullable String seriesDosesString;
  private final @Nullable List<Identifier> identifier;
  private final CodeableConcept doseStatus;
  private final @Nullable Meta meta;
  private final @Nullable Double seriesDosesPositiveInt;
  private final @Nullable List<Extension> extension;

  private ImmutableImmunizationEvaluation(
      @Nullable DateTime date,
      @Nullable Reference authority,
      @Nullable List<ResourceList> contained,
      Reference immunizationEvent,
      @Nullable String doseNumberString,
      @Nullable String series,
      @Nullable Double doseNumberPositiveInt,
      @Nullable Code status,
      @Nullable String description,
      Reference patient,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      String resourceType,
      @Nullable Id id,
      @Nullable List<CodeableConcept> doseStatusReason,
      CodeableConcept targetDisease,
      @Nullable Uri implicitRules,
      @Nullable String seriesDosesString,
      @Nullable List<Identifier> identifier,
      CodeableConcept doseStatus,
      @Nullable Meta meta,
      @Nullable Double seriesDosesPositiveInt,
      @Nullable List<Extension> extension) {
    this.date = date;
    this.authority = authority;
    this.contained = contained;
    this.immunizationEvent = immunizationEvent;
    this.doseNumberString = doseNumberString;
    this.series = series;
    this.doseNumberPositiveInt = doseNumberPositiveInt;
    this.status = status;
    this.description = description;
    this.patient = patient;
    this.language = language;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.id = id;
    this.doseStatusReason = doseStatusReason;
    this.targetDisease = targetDisease;
    this.implicitRules = implicitRules;
    this.seriesDosesString = seriesDosesString;
    this.identifier = identifier;
    this.doseStatus = doseStatus;
    this.meta = meta;
    this.seriesDosesPositiveInt = seriesDosesPositiveInt;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code authority} attribute
   */
  @JsonProperty("authority")
  @Override
  public Optional<Reference> authority() {
    return Optional.ofNullable(authority);
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
   * @return The value of the {@code immunizationEvent} attribute
   */
  @JsonProperty("immunizationEvent")
  @Override
  public Reference immunizationEvent() {
    return immunizationEvent;
  }

  /**
   * @return The value of the {@code doseNumberString} attribute
   */
  @JsonProperty("doseNumberString")
  @Override
  public Optional<String> doseNumberString() {
    return Optional.ofNullable(doseNumberString);
  }

  /**
   * @return The value of the {@code series} attribute
   */
  @JsonProperty("series")
  @Override
  public Optional<String> series() {
    return Optional.ofNullable(series);
  }

  /**
   * @return The value of the {@code doseNumberPositiveInt} attribute
   */
  @JsonProperty("doseNumberPositiveInt")
  @Override
  public Optional<Double> doseNumberPositiveInt() {
    return Optional.ofNullable(doseNumberPositiveInt);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code doseStatusReason} attribute
   */
  @JsonProperty("doseStatusReason")
  @Override
  public Optional<List<CodeableConcept>> doseStatusReason() {
    return Optional.ofNullable(doseStatusReason);
  }

  /**
   * @return The value of the {@code targetDisease} attribute
   */
  @JsonProperty("targetDisease")
  @Override
  public CodeableConcept targetDisease() {
    return targetDisease;
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
   * @return The value of the {@code seriesDosesString} attribute
   */
  @JsonProperty("seriesDosesString")
  @Override
  public Optional<String> seriesDosesString() {
    return Optional.ofNullable(seriesDosesString);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code doseStatus} attribute
   */
  @JsonProperty("doseStatus")
  @Override
  public CodeableConcept doseStatus() {
    return doseStatus;
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
   * @return The value of the {@code seriesDosesPositiveInt} attribute
   */
  @JsonProperty("seriesDosesPositiveInt")
  @Override
  public Optional<Double> seriesDosesPositiveInt() {
    return Optional.ofNullable(seriesDosesPositiveInt);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        newValue,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableImmunizationEvaluation(
        value,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withAuthority(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        newValue,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withAuthority(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        value,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        newValue,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        value,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for immunizationEvent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withImmunizationEvent(Reference value) {
    if (this.immunizationEvent == value) return this;
    Reference newValue = Objects.requireNonNull(value, "immunizationEvent");
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        newValue,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#doseNumberString() doseNumberString} attribute.
   * @param value The value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "doseNumberString");
    if (Objects.equals(this.doseNumberString, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        newValue,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#doseNumberString() doseNumberString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.doseNumberString, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        value,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#series() series} attribute.
   * @param value The value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeries(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "series");
    if (Objects.equals(this.series, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        newValue,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#series() series} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeries(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.series, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        value,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * @param value The value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberPositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.doseNumberPositiveInt, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        newValue,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseNumberPositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.doseNumberPositiveInt, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        value,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        newValue,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        value,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        newValue,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        value,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        newValue,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        newValue,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        value,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        value,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        newValue,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        value,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        newValue,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        value,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} attribute.
   * @param value The value for doseStatusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseStatusReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "doseStatusReason");
    if (this.doseStatusReason == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        newValue,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseStatusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withDoseStatusReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.doseStatusReason == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        value,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#targetDisease() targetDisease} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for targetDisease
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withTargetDisease(CodeableConcept value) {
    if (this.targetDisease == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "targetDisease");
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        newValue,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        newValue,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        value,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} attribute.
   * @param value The value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "seriesDosesString");
    if (Objects.equals(this.seriesDosesString, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        newValue,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.seriesDosesString, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        value,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        newValue,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        value,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationEvaluation#doseStatus() doseStatus} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for doseStatus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationEvaluation withDoseStatus(CodeableConcept value) {
    if (this.doseStatus == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "doseStatus");
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        newValue,
        this.meta,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        newValue,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        value,
        this.seriesDosesPositiveInt,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * @param value The value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesPositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.seriesDosesPositiveInt, newValue)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withSeriesDosesPositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.seriesDosesPositiveInt, value)) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationEvaluation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationEvaluation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunizationEvaluation(
        this.date,
        this.authority,
        this.contained,
        this.immunizationEvent,
        this.doseNumberString,
        this.series,
        this.doseNumberPositiveInt,
        this.status,
        this.description,
        this.patient,
        this.language,
        this.text,
        this.modifierExtension,
        this.resourceType,
        this.id,
        this.doseStatusReason,
        this.targetDisease,
        this.implicitRules,
        this.seriesDosesString,
        this.identifier,
        this.doseStatus,
        this.meta,
        this.seriesDosesPositiveInt,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunizationEvaluation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunizationEvaluation
        && equalTo((ImmutableImmunizationEvaluation) another);
  }

  private boolean equalTo(ImmutableImmunizationEvaluation another) {
    return Objects.equals(date, another.date)
        && Objects.equals(authority, another.authority)
        && Objects.equals(contained, another.contained)
        && immunizationEvent.equals(another.immunizationEvent)
        && Objects.equals(doseNumberString, another.doseNumberString)
        && Objects.equals(series, another.series)
        && Objects.equals(doseNumberPositiveInt, another.doseNumberPositiveInt)
        && Objects.equals(status, another.status)
        && Objects.equals(description, another.description)
        && patient.equals(another.patient)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(doseStatusReason, another.doseStatusReason)
        && targetDisease.equals(another.targetDisease)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(seriesDosesString, another.seriesDosesString)
        && Objects.equals(identifier, another.identifier)
        && doseStatus.equals(another.doseStatus)
        && Objects.equals(meta, another.meta)
        && Objects.equals(seriesDosesPositiveInt, another.seriesDosesPositiveInt)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code authority}, {@code contained}, {@code immunizationEvent}, {@code doseNumberString}, {@code series}, {@code doseNumberPositiveInt}, {@code status}, {@code description}, {@code patient}, {@code language}, {@code text}, {@code modifierExtension}, {@code resourceType}, {@code id}, {@code doseStatusReason}, {@code targetDisease}, {@code implicitRules}, {@code seriesDosesString}, {@code identifier}, {@code doseStatus}, {@code meta}, {@code seriesDosesPositiveInt}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(authority);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + immunizationEvent.hashCode();
    h += (h << 5) + Objects.hashCode(doseNumberString);
    h += (h << 5) + Objects.hashCode(series);
    h += (h << 5) + Objects.hashCode(doseNumberPositiveInt);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(doseStatusReason);
    h += (h << 5) + targetDisease.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(seriesDosesString);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + doseStatus.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(seriesDosesPositiveInt);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImmunizationEvaluation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImmunizationEvaluation{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (authority != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("authority=").append(authority);
    }
    if (contained != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("immunizationEvent=").append(immunizationEvent);
    if (doseNumberString != null) {
      builder.append(", ");
      builder.append("doseNumberString=").append(doseNumberString);
    }
    if (series != null) {
      builder.append(", ");
      builder.append("series=").append(series);
    }
    if (doseNumberPositiveInt != null) {
      builder.append(", ");
      builder.append("doseNumberPositiveInt=").append(doseNumberPositiveInt);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (doseStatusReason != null) {
      builder.append(", ");
      builder.append("doseStatusReason=").append(doseStatusReason);
    }
    builder.append(", ");
    builder.append("targetDisease=").append(targetDisease);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (seriesDosesString != null) {
      builder.append(", ");
      builder.append("seriesDosesString=").append(seriesDosesString);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("doseStatus=").append(doseStatus);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (seriesDosesPositiveInt != null) {
      builder.append(", ");
      builder.append("seriesDosesPositiveInt=").append(seriesDosesPositiveInt);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImmunizationEvaluation {
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Reference> authority = Optional.empty();
    boolean authorityIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Reference immunizationEvent;
    @Nullable Optional<String> doseNumberString = Optional.empty();
    boolean doseNumberStringIsSet;
    @Nullable Optional<String> series = Optional.empty();
    boolean seriesIsSet;
    @Nullable Optional<Double> doseNumberPositiveInt = Optional.empty();
    boolean doseNumberPositiveIntIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Reference patient;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> doseStatusReason = Optional.empty();
    boolean doseStatusReasonIsSet;
    @Nullable CodeableConcept targetDisease;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> seriesDosesString = Optional.empty();
    boolean seriesDosesStringIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable CodeableConcept doseStatus;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Double> seriesDosesPositiveInt = Optional.empty();
    boolean seriesDosesPositiveIntIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("authority")
    public void setAuthority(Optional<Reference> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("immunizationEvent")
    public void setImmunizationEvent(Reference immunizationEvent) {
      this.immunizationEvent = immunizationEvent;
    }
    @JsonProperty("doseNumberString")
    public void setDoseNumberString(Optional<String> doseNumberString) {
      this.doseNumberString = doseNumberString;
      this.doseNumberStringIsSet = true;
    }
    @JsonProperty("series")
    public void setSeries(Optional<String> series) {
      this.series = series;
      this.seriesIsSet = true;
    }
    @JsonProperty("doseNumberPositiveInt")
    public void setDoseNumberPositiveInt(Optional<Double> doseNumberPositiveInt) {
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      this.doseNumberPositiveIntIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("doseStatusReason")
    public void setDoseStatusReason(Optional<List<CodeableConcept>> doseStatusReason) {
      this.doseStatusReason = doseStatusReason;
      this.doseStatusReasonIsSet = true;
    }
    @JsonProperty("targetDisease")
    public void setTargetDisease(CodeableConcept targetDisease) {
      this.targetDisease = targetDisease;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("seriesDosesString")
    public void setSeriesDosesString(Optional<String> seriesDosesString) {
      this.seriesDosesString = seriesDosesString;
      this.seriesDosesStringIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("doseStatus")
    public void setDoseStatus(CodeableConcept doseStatus) {
      this.doseStatus = doseStatus;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("seriesDosesPositiveInt")
    public void setSeriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt) {
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      this.seriesDosesPositiveIntIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> authority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Reference immunizationEvent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> doseNumberString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> series() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> doseNumberPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> doseStatusReason() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept targetDisease() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> seriesDosesString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept doseStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> seriesDosesPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunizationEvaluation fromJson(Json json) {
    ImmutableImmunizationEvaluation.Builder builder = ((ImmutableImmunizationEvaluation.Builder) ImmutableImmunizationEvaluation.builder());
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.immunizationEvent != null) {
      builder.immunizationEvent(json.immunizationEvent);
    }
    if (json.doseNumberStringIsSet) {
      builder.doseNumberString(json.doseNumberString);
    }
    if (json.seriesIsSet) {
      builder.series(json.series);
    }
    if (json.doseNumberPositiveIntIsSet) {
      builder.doseNumberPositiveInt(json.doseNumberPositiveInt);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.doseStatusReasonIsSet) {
      builder.doseStatusReason(json.doseStatusReason);
    }
    if (json.targetDisease != null) {
      builder.targetDisease(json.targetDisease);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.seriesDosesStringIsSet) {
      builder.seriesDosesString(json.seriesDosesString);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.doseStatus != null) {
      builder.doseStatus(json.doseStatus);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.seriesDosesPositiveIntIsSet) {
      builder.seriesDosesPositiveInt(json.seriesDosesPositiveInt);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .date(instance.date())
        .authority(instance.authority())
        .contained(instance.contained())
        .immunizationEvent(instance.immunizationEvent())
        .doseNumberString(instance.doseNumberString())
        .series(instance.series())
        .doseNumberPositiveInt(instance.doseNumberPositiveInt())
        .status(instance.status())
        .description(instance.description())
        .patient(instance.patient())
        .language(instance.language())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .doseStatusReason(instance.doseStatusReason())
        .targetDisease(instance.targetDisease())
        .implicitRules(instance.implicitRules())
        .seriesDosesString(instance.seriesDosesString())
        .identifier(instance.identifier())
        .doseStatus(instance.doseStatus())
        .meta(instance.meta())
        .seriesDosesPositiveInt(instance.seriesDosesPositiveInt())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ImmunizationEvaluation ImmunizationEvaluation}.
   * <pre>
   * ImmutableImmunizationEvaluation.builder()
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link ImmunizationEvaluation#date() date}
   *    .authority(com.fhir.types.fhir.Reference) // optional {@link ImmunizationEvaluation#authority() authority}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link ImmunizationEvaluation#contained() contained}
   *    .immunizationEvent(com.fhir.types.fhir.Reference) // required {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent}
   *    .doseNumberString(String) // optional {@link ImmunizationEvaluation#doseNumberString() doseNumberString}
   *    .series(String) // optional {@link ImmunizationEvaluation#series() series}
   *    .doseNumberPositiveInt(Double) // optional {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt}
   *    .status(com.fhir.types.fhir.Code) // optional {@link ImmunizationEvaluation#status() status}
   *    .description(String) // optional {@link ImmunizationEvaluation#description() description}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link ImmunizationEvaluation#patient() patient}
   *    .language(com.fhir.types.fhir.Code) // optional {@link ImmunizationEvaluation#language() language}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link ImmunizationEvaluation#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationEvaluation#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link ImmunizationEvaluation#resourceType() resourceType}
   *    .id(com.fhir.types.fhir.Id) // optional {@link ImmunizationEvaluation#id() id}
   *    .doseStatusReason(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason}
   *    .targetDisease(com.fhir.types.fhir.CodeableConcept) // required {@link ImmunizationEvaluation#targetDisease() targetDisease}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link ImmunizationEvaluation#implicitRules() implicitRules}
   *    .seriesDosesString(String) // optional {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link ImmunizationEvaluation#identifier() identifier}
   *    .doseStatus(com.fhir.types.fhir.CodeableConcept) // required {@link ImmunizationEvaluation#doseStatus() doseStatus}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link ImmunizationEvaluation#meta() meta}
   *    .seriesDosesPositiveInt(Double) // optional {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationEvaluation#extension() extension}
   *    .build();
   * </pre>
   * @return A new ImmunizationEvaluation builder
   */
  public static ImmunizationEventBuildStage builder() {
    return new ImmutableImmunizationEvaluation.Builder();
  }

  /**
   * Builds instances of type {@link ImmunizationEvaluation ImmunizationEvaluation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements ImmunizationEventBuildStage, PatientBuildStage, ResourceTypeBuildStage, TargetDiseaseBuildStage, DoseStatusBuildStage, BuildFinal {
    private static final long INIT_BIT_IMMUNIZATION_EVENT = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long INIT_BIT_TARGET_DISEASE = 0x8L;
    private static final long INIT_BIT_DOSE_STATUS = 0x10L;
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_AUTHORITY = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_DOSE_NUMBER_STRING = 0x8L;
    private static final long OPT_BIT_SERIES = 0x10L;
    private static final long OPT_BIT_DOSE_NUMBER_POSITIVE_INT = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_DOSE_STATUS_REASON = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_SERIES_DOSES_STRING = 0x4000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000L;
    private static final long OPT_BIT_META = 0x10000L;
    private static final long OPT_BIT_SERIES_DOSES_POSITIVE_INT = 0x20000L;
    private static final long OPT_BIT_EXTENSION = 0x40000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @Nullable DateTime date;
    private @Nullable Reference authority;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference immunizationEvent;
    private @Nullable String doseNumberString;
    private @Nullable String series;
    private @Nullable Double doseNumberPositiveInt;
    private @Nullable Code status;
    private @Nullable String description;
    private @Nullable Reference patient;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable List<CodeableConcept> doseStatusReason;
    private @Nullable CodeableConcept targetDisease;
    private @Nullable Uri implicitRules;
    private @Nullable String seriesDosesString;
    private @Nullable List<Identifier> identifier;
    private @Nullable CodeableConcept doseStatus;
    private @Nullable Meta meta;
    private @Nullable Double seriesDosesPositiveInt;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(Reference authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authority")
    public final Builder authority(Optional<? extends Reference> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = authority.orElse(null);
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
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
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
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
     * Initializes the value for the {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent} attribute.
     * @param immunizationEvent The value for immunizationEvent 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("immunizationEvent")
    public final Builder immunizationEvent(Reference immunizationEvent) {
      checkNotIsSet(immunizationEventIsSet(), "immunizationEvent");
      this.immunizationEvent = Objects.requireNonNull(immunizationEvent, "immunizationEvent");
      initBits &= ~INIT_BIT_IMMUNIZATION_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseNumberString(String doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = Objects.requireNonNull(doseNumberString, "doseNumberString");
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseNumberString")
    public final Builder doseNumberString(Optional<String> doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = doseNumberString.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    public final Builder series(String series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = Objects.requireNonNull(series, "series");
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("series")
    public final Builder series(Optional<String> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = series.orElse(null);
      optBits |= OPT_BIT_SERIES;
      return this;
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
    @JsonProperty("doseNumberPositiveInt")
    public final Builder doseNumberPositiveInt(Optional<Double> doseNumberPositiveInt) {
      checkNotIsSet(doseNumberPositiveIntIsSet(), "doseNumberPositiveInt");
      this.doseNumberPositiveInt = doseNumberPositiveInt.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
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
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
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
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationEvaluation#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
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
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
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
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
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
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
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
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link ImmunizationEvaluation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
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
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseStatusReason(List<CodeableConcept> doseStatusReason) {
      checkNotIsSet(doseStatusReasonIsSet(), "doseStatusReason");
      this.doseStatusReason = Objects.requireNonNull(doseStatusReason, "doseStatusReason");
      optBits |= OPT_BIT_DOSE_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseStatusReason")
    public final Builder doseStatusReason(Optional<? extends List<CodeableConcept>> doseStatusReason) {
      checkNotIsSet(doseStatusReasonIsSet(), "doseStatusReason");
      this.doseStatusReason = doseStatusReason.orElse(null);
      optBits |= OPT_BIT_DOSE_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationEvaluation#targetDisease() targetDisease} attribute.
     * @param targetDisease The value for targetDisease 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetDisease")
    public final Builder targetDisease(CodeableConcept targetDisease) {
      checkNotIsSet(targetDiseaseIsSet(), "targetDisease");
      this.targetDisease = Objects.requireNonNull(targetDisease, "targetDisease");
      initBits &= ~INIT_BIT_TARGET_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriesDosesString(String seriesDosesString) {
      checkNotIsSet(seriesDosesStringIsSet(), "seriesDosesString");
      this.seriesDosesString = Objects.requireNonNull(seriesDosesString, "seriesDosesString");
      optBits |= OPT_BIT_SERIES_DOSES_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("seriesDosesString")
    public final Builder seriesDosesString(Optional<String> seriesDosesString) {
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
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationEvaluation#doseStatus() doseStatus} attribute.
     * @param doseStatus The value for doseStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseStatus")
    public final Builder doseStatus(CodeableConcept doseStatus) {
      checkNotIsSet(doseStatusIsSet(), "doseStatus");
      this.doseStatus = Objects.requireNonNull(doseStatus, "doseStatus");
      initBits &= ~INIT_BIT_DOSE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
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
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
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
    @JsonProperty("seriesDosesPositiveInt")
    public final Builder seriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt) {
      checkNotIsSet(seriesDosesPositiveIntIsSet(), "seriesDosesPositiveInt");
      this.seriesDosesPositiveInt = seriesDosesPositiveInt.orElse(null);
      optBits |= OPT_BIT_SERIES_DOSES_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
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
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
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
     * Builds a new {@link ImmunizationEvaluation ImmunizationEvaluation}.
     * @return An immutable instance of ImmunizationEvaluation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmunizationEvaluation build() {
      checkRequiredAttributes();
      return new ImmutableImmunizationEvaluation(
          date,
          authority,
          contained,
          immunizationEvent,
          doseNumberString,
          series,
          doseNumberPositiveInt,
          status,
          description,
          patient,
          language,
          text,
          modifierExtension,
          resourceType,
          id,
          doseStatusReason,
          targetDisease,
          implicitRules,
          seriesDosesString,
          identifier,
          doseStatus,
          meta,
          seriesDosesPositiveInt,
          extension);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean doseNumberStringIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_STRING) != 0;
    }

    private boolean seriesIsSet() {
      return (optBits & OPT_BIT_SERIES) != 0;
    }

    private boolean doseNumberPositiveIntIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_POSITIVE_INT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean doseStatusReasonIsSet() {
      return (optBits & OPT_BIT_DOSE_STATUS_REASON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean seriesDosesStringIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_STRING) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean seriesDosesPositiveIntIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_POSITIVE_INT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean immunizationEventIsSet() {
      return (initBits & INIT_BIT_IMMUNIZATION_EVENT) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean targetDiseaseIsSet() {
      return (initBits & INIT_BIT_TARGET_DISEASE) == 0;
    }

    private boolean doseStatusIsSet() {
      return (initBits & INIT_BIT_DOSE_STATUS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImmunizationEvaluation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!immunizationEventIsSet()) attributes.add("immunizationEvent");
      if (!patientIsSet()) attributes.add("patient");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!targetDiseaseIsSet()) attributes.add("targetDisease");
      if (!doseStatusIsSet()) attributes.add("doseStatus");
      return "Cannot build ImmunizationEvaluation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface ImmunizationEventBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent} attribute.
     * @param immunizationEvent The value for immunizationEvent 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage immunizationEvent(Reference immunizationEvent);
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage patient(Reference patient);
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    TargetDiseaseBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface TargetDiseaseBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#targetDisease() targetDisease} attribute.
     * @param targetDisease The value for targetDisease 
     * @return {@code this} builder for use in a chained invocation
     */
    DoseStatusBuildStage targetDisease(CodeableConcept targetDisease);
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface DoseStatusBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#doseStatus() doseStatus} attribute.
     * @param doseStatus The value for doseStatus 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseStatus(CodeableConcept doseStatus);
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authority(Reference authority);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authority(Optional<? extends Reference> authority);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseNumberString(String doseNumberString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseNumberString(Optional<String> doseNumberString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    BuildFinal series(String series);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal series(Optional<String> series);

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
    BuildFinal doseNumberPositiveInt(Optional<Double> doseNumberPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseStatusReason(List<CodeableConcept> doseStatusReason);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason} to doseStatusReason.
     * @param doseStatusReason The value for doseStatusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseStatusReason(Optional<? extends List<CodeableConcept>> doseStatusReason);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal seriesDosesString(String seriesDosesString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal seriesDosesString(Optional<String> seriesDosesString);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

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
    BuildFinal seriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImmunizationEvaluation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link ImmunizationEvaluation ImmunizationEvaluation}.
     * @return An immutable instance of ImmunizationEvaluation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImmunizationEvaluation build();
  }
}
