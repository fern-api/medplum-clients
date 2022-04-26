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
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;
  private final @Nullable String series;
  private final @Nullable Double seriesDosesPositiveInt;
  private final @Nullable String seriesDosesString;
  private final @Nullable DateTime date;
  private final @Nullable Double doseNumberPositiveInt;
  private final @Nullable String description;
  private final @Nullable Code language;
  private final @Nullable String doseNumberString;
  private final @Nullable Reference authority;
  private final @Nullable Narrative text;
  private final @Nullable Code status;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Extension> extension;
  private final Reference patient;
  private final Reference immunizationEvent;
  private final CodeableConcept targetDisease;
  private final @Nullable Meta meta;
  private final CodeableConcept doseStatus;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> doseStatusReason;
  private final @Nullable Id id;
  private final @Nullable List<ResourceList> contained;

  private ImmutableImmunizationEvaluation(
      @Nullable List<Extension> modifierExtension,
      String resourceType,
      @Nullable String series,
      @Nullable Double seriesDosesPositiveInt,
      @Nullable String seriesDosesString,
      @Nullable DateTime date,
      @Nullable Double doseNumberPositiveInt,
      @Nullable String description,
      @Nullable Code language,
      @Nullable String doseNumberString,
      @Nullable Reference authority,
      @Nullable Narrative text,
      @Nullable Code status,
      @Nullable List<Identifier> identifier,
      @Nullable List<Extension> extension,
      Reference patient,
      Reference immunizationEvent,
      CodeableConcept targetDisease,
      @Nullable Meta meta,
      CodeableConcept doseStatus,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> doseStatusReason,
      @Nullable Id id,
      @Nullable List<ResourceList> contained) {
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.series = series;
    this.seriesDosesPositiveInt = seriesDosesPositiveInt;
    this.seriesDosesString = seriesDosesString;
    this.date = date;
    this.doseNumberPositiveInt = doseNumberPositiveInt;
    this.description = description;
    this.language = language;
    this.doseNumberString = doseNumberString;
    this.authority = authority;
    this.text = text;
    this.status = status;
    this.identifier = identifier;
    this.extension = extension;
    this.patient = patient;
    this.immunizationEvent = immunizationEvent;
    this.targetDisease = targetDisease;
    this.meta = meta;
    this.doseStatus = doseStatus;
    this.implicitRules = implicitRules;
    this.doseStatusReason = doseStatusReason;
    this.id = id;
    this.contained = contained;
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
   * @return The value of the {@code series} attribute
   */
  @JsonProperty("series")
  @Override
  public Optional<String> series() {
    return Optional.ofNullable(series);
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
   * @return The value of the {@code seriesDosesString} attribute
   */
  @JsonProperty("seriesDosesString")
  @Override
  public Optional<String> seriesDosesString() {
    return Optional.ofNullable(seriesDosesString);
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
   * @return The value of the {@code doseNumberPositiveInt} attribute
   */
  @JsonProperty("doseNumberPositiveInt")
  @Override
  public Optional<Double> doseNumberPositiveInt() {
    return Optional.ofNullable(doseNumberPositiveInt);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code authority} attribute
   */
  @JsonProperty("authority")
  @Override
  public Optional<Reference> authority() {
    return Optional.ofNullable(authority);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code immunizationEvent} attribute
   */
  @JsonProperty("immunizationEvent")
  @Override
  public Reference immunizationEvent() {
    return immunizationEvent;
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationEvaluation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationEvaluation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunizationEvaluation(
        newValue,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        value,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        newValue,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        value,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        newValue,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        value,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        newValue,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        value,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        newValue,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        value,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        newValue,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        value,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        newValue,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        value,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        newValue,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        value,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        newValue,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        value,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        newValue,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        value,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        newValue,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        value,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        newValue,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        value,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        newValue,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        value,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        newValue,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        value,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        newValue,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        newValue,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        newValue,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        newValue,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        value,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        newValue,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        newValue,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        value,
        this.doseStatusReason,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        newValue,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        value,
        this.id,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        newValue,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        value,
        this.contained);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
        newValue);
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
        this.modifierExtension,
        this.resourceType,
        this.series,
        this.seriesDosesPositiveInt,
        this.seriesDosesString,
        this.date,
        this.doseNumberPositiveInt,
        this.description,
        this.language,
        this.doseNumberString,
        this.authority,
        this.text,
        this.status,
        this.identifier,
        this.extension,
        this.patient,
        this.immunizationEvent,
        this.targetDisease,
        this.meta,
        this.doseStatus,
        this.implicitRules,
        this.doseStatusReason,
        this.id,
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
    return Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && Objects.equals(series, another.series)
        && Objects.equals(seriesDosesPositiveInt, another.seriesDosesPositiveInt)
        && Objects.equals(seriesDosesString, another.seriesDosesString)
        && Objects.equals(date, another.date)
        && Objects.equals(doseNumberPositiveInt, another.doseNumberPositiveInt)
        && Objects.equals(description, another.description)
        && Objects.equals(language, another.language)
        && Objects.equals(doseNumberString, another.doseNumberString)
        && Objects.equals(authority, another.authority)
        && Objects.equals(text, another.text)
        && Objects.equals(status, another.status)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(extension, another.extension)
        && patient.equals(another.patient)
        && immunizationEvent.equals(another.immunizationEvent)
        && targetDisease.equals(another.targetDisease)
        && Objects.equals(meta, another.meta)
        && doseStatus.equals(another.doseStatus)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(doseStatusReason, another.doseStatusReason)
        && Objects.equals(id, another.id)
        && Objects.equals(contained, another.contained);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code resourceType}, {@code series}, {@code seriesDosesPositiveInt}, {@code seriesDosesString}, {@code date}, {@code doseNumberPositiveInt}, {@code description}, {@code language}, {@code doseNumberString}, {@code authority}, {@code text}, {@code status}, {@code identifier}, {@code extension}, {@code patient}, {@code immunizationEvent}, {@code targetDisease}, {@code meta}, {@code doseStatus}, {@code implicitRules}, {@code doseStatusReason}, {@code id}, {@code contained}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(series);
    h += (h << 5) + Objects.hashCode(seriesDosesPositiveInt);
    h += (h << 5) + Objects.hashCode(seriesDosesString);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(doseNumberPositiveInt);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(doseNumberString);
    h += (h << 5) + Objects.hashCode(authority);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + immunizationEvent.hashCode();
    h += (h << 5) + targetDisease.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + doseStatus.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(doseStatusReason);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contained);
    return h;
  }

  /**
   * Prints the immutable value {@code ImmunizationEvaluation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImmunizationEvaluation{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (series != null) {
      builder.append(", ");
      builder.append("series=").append(series);
    }
    if (seriesDosesPositiveInt != null) {
      builder.append(", ");
      builder.append("seriesDosesPositiveInt=").append(seriesDosesPositiveInt);
    }
    if (seriesDosesString != null) {
      builder.append(", ");
      builder.append("seriesDosesString=").append(seriesDosesString);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (doseNumberPositiveInt != null) {
      builder.append(", ");
      builder.append("doseNumberPositiveInt=").append(doseNumberPositiveInt);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (doseNumberString != null) {
      builder.append(", ");
      builder.append("doseNumberString=").append(doseNumberString);
    }
    if (authority != null) {
      builder.append(", ");
      builder.append("authority=").append(authority);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    builder.append(", ");
    builder.append("immunizationEvent=").append(immunizationEvent);
    builder.append(", ");
    builder.append("targetDisease=").append(targetDisease);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("doseStatus=").append(doseStatus);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (doseStatusReason != null) {
      builder.append(", ");
      builder.append("doseStatusReason=").append(doseStatusReason);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
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
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<String> series = Optional.empty();
    boolean seriesIsSet;
    @Nullable Optional<Double> seriesDosesPositiveInt = Optional.empty();
    boolean seriesDosesPositiveIntIsSet;
    @Nullable Optional<String> seriesDosesString = Optional.empty();
    boolean seriesDosesStringIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Double> doseNumberPositiveInt = Optional.empty();
    boolean doseNumberPositiveIntIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> doseNumberString = Optional.empty();
    boolean doseNumberStringIsSet;
    @Nullable Optional<Reference> authority = Optional.empty();
    boolean authorityIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference patient;
    @Nullable Reference immunizationEvent;
    @Nullable CodeableConcept targetDisease;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable CodeableConcept doseStatus;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> doseStatusReason = Optional.empty();
    boolean doseStatusReasonIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("series")
    public void setSeries(Optional<String> series) {
      this.series = series;
      this.seriesIsSet = true;
    }
    @JsonProperty("seriesDosesPositiveInt")
    public void setSeriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt) {
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      this.seriesDosesPositiveIntIsSet = true;
    }
    @JsonProperty("seriesDosesString")
    public void setSeriesDosesString(Optional<String> seriesDosesString) {
      this.seriesDosesString = seriesDosesString;
      this.seriesDosesStringIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("doseNumberPositiveInt")
    public void setDoseNumberPositiveInt(Optional<Double> doseNumberPositiveInt) {
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      this.doseNumberPositiveIntIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("doseNumberString")
    public void setDoseNumberString(Optional<String> doseNumberString) {
      this.doseNumberString = doseNumberString;
      this.doseNumberStringIsSet = true;
    }
    @JsonProperty("authority")
    public void setAuthority(Optional<Reference> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("immunizationEvent")
    public void setImmunizationEvent(Reference immunizationEvent) {
      this.immunizationEvent = immunizationEvent;
    }
    @JsonProperty("targetDisease")
    public void setTargetDisease(CodeableConcept targetDisease) {
      this.targetDisease = targetDisease;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("doseStatus")
    public void setDoseStatus(CodeableConcept doseStatus) {
      this.doseStatus = doseStatus;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("doseStatusReason")
    public void setDoseStatusReason(Optional<List<CodeableConcept>> doseStatusReason) {
      this.doseStatusReason = doseStatusReason;
      this.doseStatusReasonIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> series() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> seriesDosesPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> seriesDosesString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> doseNumberPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> doseNumberString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> authority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Reference immunizationEvent() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept targetDisease() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept doseStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> doseStatusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
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
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.seriesIsSet) {
      builder.series(json.series);
    }
    if (json.seriesDosesPositiveIntIsSet) {
      builder.seriesDosesPositiveInt(json.seriesDosesPositiveInt);
    }
    if (json.seriesDosesStringIsSet) {
      builder.seriesDosesString(json.seriesDosesString);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.doseNumberPositiveIntIsSet) {
      builder.doseNumberPositiveInt(json.doseNumberPositiveInt);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.doseNumberStringIsSet) {
      builder.doseNumberString(json.doseNumberString);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.immunizationEvent != null) {
      builder.immunizationEvent(json.immunizationEvent);
    }
    if (json.targetDisease != null) {
      builder.targetDisease(json.targetDisease);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.doseStatus != null) {
      builder.doseStatus(json.doseStatus);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.doseStatusReasonIsSet) {
      builder.doseStatusReason(json.doseStatusReason);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
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
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .series(instance.series())
        .seriesDosesPositiveInt(instance.seriesDosesPositiveInt())
        .seriesDosesString(instance.seriesDosesString())
        .date(instance.date())
        .doseNumberPositiveInt(instance.doseNumberPositiveInt())
        .description(instance.description())
        .language(instance.language())
        .doseNumberString(instance.doseNumberString())
        .authority(instance.authority())
        .text(instance.text())
        .status(instance.status())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .patient(instance.patient())
        .immunizationEvent(instance.immunizationEvent())
        .targetDisease(instance.targetDisease())
        .meta(instance.meta())
        .doseStatus(instance.doseStatus())
        .implicitRules(instance.implicitRules())
        .doseStatusReason(instance.doseStatusReason())
        .id(instance.id())
        .contained(instance.contained())
        .build();
  }

  /**
   * Creates a builder for {@link ImmunizationEvaluation ImmunizationEvaluation}.
   * <pre>
   * ImmutableImmunizationEvaluation.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationEvaluation#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link ImmunizationEvaluation#resourceType() resourceType}
   *    .series(String) // optional {@link ImmunizationEvaluation#series() series}
   *    .seriesDosesPositiveInt(Double) // optional {@link ImmunizationEvaluation#seriesDosesPositiveInt() seriesDosesPositiveInt}
   *    .seriesDosesString(String) // optional {@link ImmunizationEvaluation#seriesDosesString() seriesDosesString}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ImmunizationEvaluation#date() date}
   *    .doseNumberPositiveInt(Double) // optional {@link ImmunizationEvaluation#doseNumberPositiveInt() doseNumberPositiveInt}
   *    .description(String) // optional {@link ImmunizationEvaluation#description() description}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ImmunizationEvaluation#language() language}
   *    .doseNumberString(String) // optional {@link ImmunizationEvaluation#doseNumberString() doseNumberString}
   *    .authority(com.medplum.types.fhir.Reference) // optional {@link ImmunizationEvaluation#authority() authority}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ImmunizationEvaluation#text() text}
   *    .status(com.medplum.types.fhir.Code) // optional {@link ImmunizationEvaluation#status() status}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ImmunizationEvaluation#identifier() identifier}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImmunizationEvaluation#extension() extension}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link ImmunizationEvaluation#patient() patient}
   *    .immunizationEvent(com.medplum.types.fhir.Reference) // required {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent}
   *    .targetDisease(com.medplum.types.fhir.CodeableConcept) // required {@link ImmunizationEvaluation#targetDisease() targetDisease}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ImmunizationEvaluation#meta() meta}
   *    .doseStatus(com.medplum.types.fhir.CodeableConcept) // required {@link ImmunizationEvaluation#doseStatus() doseStatus}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ImmunizationEvaluation#implicitRules() implicitRules}
   *    .doseStatusReason(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImmunizationEvaluation#doseStatusReason() doseStatusReason}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ImmunizationEvaluation#id() id}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ImmunizationEvaluation#contained() contained}
   *    .build();
   * </pre>
   * @return A new ImmunizationEvaluation builder
   */
  public static ResourceTypeBuildStage builder() {
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
      implements ResourceTypeBuildStage, PatientBuildStage, ImmunizationEventBuildStage, TargetDiseaseBuildStage, DoseStatusBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PATIENT = 0x2L;
    private static final long INIT_BIT_IMMUNIZATION_EVENT = 0x4L;
    private static final long INIT_BIT_TARGET_DISEASE = 0x8L;
    private static final long INIT_BIT_DOSE_STATUS = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_SERIES = 0x2L;
    private static final long OPT_BIT_SERIES_DOSES_POSITIVE_INT = 0x4L;
    private static final long OPT_BIT_SERIES_DOSES_STRING = 0x8L;
    private static final long OPT_BIT_DATE = 0x10L;
    private static final long OPT_BIT_DOSE_NUMBER_POSITIVE_INT = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_DOSE_NUMBER_STRING = 0x100L;
    private static final long OPT_BIT_AUTHORITY = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_STATUS = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_DOSE_STATUS_REASON = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;
    private @Nullable String series;
    private @Nullable Double seriesDosesPositiveInt;
    private @Nullable String seriesDosesString;
    private @Nullable DateTime date;
    private @Nullable Double doseNumberPositiveInt;
    private @Nullable String description;
    private @Nullable Code language;
    private @Nullable String doseNumberString;
    private @Nullable Reference authority;
    private @Nullable Narrative text;
    private @Nullable Code status;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Extension> extension;
    private @Nullable Reference patient;
    private @Nullable Reference immunizationEvent;
    private @Nullable CodeableConcept targetDisease;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept doseStatus;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> doseStatusReason;
    private @Nullable Id id;
    private @Nullable List<ResourceList> contained;

    private Builder() {
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
     * Builds a new {@link ImmunizationEvaluation ImmunizationEvaluation}.
     * @return An immutable instance of ImmunizationEvaluation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmunizationEvaluation build() {
      checkRequiredAttributes();
      return new ImmutableImmunizationEvaluation(
          modifierExtension,
          resourceType,
          series,
          seriesDosesPositiveInt,
          seriesDosesString,
          date,
          doseNumberPositiveInt,
          description,
          language,
          doseNumberString,
          authority,
          text,
          status,
          identifier,
          extension,
          patient,
          immunizationEvent,
          targetDisease,
          meta,
          doseStatus,
          implicitRules,
          doseStatusReason,
          id,
          contained);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean seriesIsSet() {
      return (optBits & OPT_BIT_SERIES) != 0;
    }

    private boolean seriesDosesPositiveIntIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_POSITIVE_INT) != 0;
    }

    private boolean seriesDosesStringIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_STRING) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean doseNumberPositiveIntIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_POSITIVE_INT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean doseNumberStringIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_STRING) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean doseStatusReasonIsSet() {
      return (optBits & OPT_BIT_DOSE_STATUS_REASON) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean immunizationEventIsSet() {
      return (initBits & INIT_BIT_IMMUNIZATION_EVENT) == 0;
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
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!patientIsSet()) attributes.add("patient");
      if (!immunizationEventIsSet()) attributes.add("immunizationEvent");
      if (!targetDiseaseIsSet()) attributes.add("targetDisease");
      if (!doseStatusIsSet()) attributes.add("doseStatus");
      return "Cannot build ImmunizationEvaluation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    ImmunizationEventBuildStage patient(Reference patient);
  }

  @Generated(from = "ImmunizationEvaluation", generator = "Immutables")
  public interface ImmunizationEventBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationEvaluation#immunizationEvent() immunizationEvent} attribute.
     * @param immunizationEvent The value for immunizationEvent 
     * @return {@code this} builder for use in a chained invocation
     */
    TargetDiseaseBuildStage immunizationEvent(Reference immunizationEvent);
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
     * Builds a new {@link ImmunizationEvaluation ImmunizationEvaluation}.
     * @return An immutable instance of ImmunizationEvaluation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImmunizationEvaluation build();
  }
}
