package com.fhir;

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
 * Immutable implementation of {@link Observation_Component}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservation_Component.builder()}.
 */
@Generated(from = "Observation_Component", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservation_Component implements Observation_Component {
  private final @Nullable List<CodeableConcept> interpretation;
  private final @Nullable CodeableConcept dataAbsentReason;
  private final @Nullable String valueDateTime;
  private final @Nullable List<Observation_ReferenceRange> referenceRange;
  private final @Nullable String valueString;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable Ratio valueRatio;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Range valueRange;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period valuePeriod;
  private final @Nullable CodeableConcept valueCodeableConcept;
  private final @Nullable Double valueInteger;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable SampledData valueSampledData;
  private final CodeableConcept code;
  private final @Nullable String valueTime;

  private ImmutableObservation_Component(
      @Nullable List<CodeableConcept> interpretation,
      @Nullable CodeableConcept dataAbsentReason,
      @Nullable String valueDateTime,
      @Nullable List<Observation_ReferenceRange> referenceRange,
      @Nullable String valueString,
      @Nullable Quantity valueQuantity,
      @Nullable Ratio valueRatio,
      @Nullable List<Extension> modifierExtension,
      @Nullable Range valueRange,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Period valuePeriod,
      @Nullable CodeableConcept valueCodeableConcept,
      @Nullable Double valueInteger,
      @Nullable Boolean valueBoolean,
      @Nullable SampledData valueSampledData,
      CodeableConcept code,
      @Nullable String valueTime) {
    this.interpretation = interpretation;
    this.dataAbsentReason = dataAbsentReason;
    this.valueDateTime = valueDateTime;
    this.referenceRange = referenceRange;
    this.valueString = valueString;
    this.valueQuantity = valueQuantity;
    this.valueRatio = valueRatio;
    this.modifierExtension = modifierExtension;
    this.valueRange = valueRange;
    this.id = id;
    this.extension = extension;
    this.valuePeriod = valuePeriod;
    this.valueCodeableConcept = valueCodeableConcept;
    this.valueInteger = valueInteger;
    this.valueBoolean = valueBoolean;
    this.valueSampledData = valueSampledData;
    this.code = code;
    this.valueTime = valueTime;
  }

  /**
   * @return The value of the {@code interpretation} attribute
   */
  @JsonProperty("interpretation")
  @Override
  public Optional<List<CodeableConcept>> interpretation() {
    return Optional.ofNullable(interpretation);
  }

  /**
   * @return The value of the {@code dataAbsentReason} attribute
   */
  @JsonProperty("dataAbsentReason")
  @Override
  public Optional<CodeableConcept> dataAbsentReason() {
    return Optional.ofNullable(dataAbsentReason);
  }

  /**
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
  }

  /**
   * @return The value of the {@code referenceRange} attribute
   */
  @JsonProperty("referenceRange")
  @Override
  public Optional<List<Observation_ReferenceRange>> referenceRange() {
    return Optional.ofNullable(referenceRange);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
  }

  /**
   * @return The value of the {@code valueRatio} attribute
   */
  @JsonProperty("valueRatio")
  @Override
  public Optional<Ratio> valueRatio() {
    return Optional.ofNullable(valueRatio);
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
   * @return The value of the {@code valueRange} attribute
   */
  @JsonProperty("valueRange")
  @Override
  public Optional<Range> valueRange() {
    return Optional.ofNullable(valueRange);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code valuePeriod} attribute
   */
  @JsonProperty("valuePeriod")
  @Override
  public Optional<Period> valuePeriod() {
    return Optional.ofNullable(valuePeriod);
  }

  /**
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @JsonProperty("valueBoolean")
  @Override
  public Optional<Boolean> valueBoolean() {
    return Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valueSampledData} attribute
   */
  @JsonProperty("valueSampledData")
  @Override
  public Optional<SampledData> valueSampledData() {
    return Optional.ofNullable(valueSampledData);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code valueTime} attribute
   */
  @JsonProperty("valueTime")
  @Override
  public Optional<String> valueTime() {
    return Optional.ofNullable(valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#interpretation() interpretation} attribute.
   * @param value The value for interpretation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withInterpretation(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "interpretation");
    if (this.interpretation == newValue) return this;
    return new ImmutableObservation_Component(
        newValue,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#interpretation() interpretation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interpretation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withInterpretation(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.interpretation == value) return this;
    return new ImmutableObservation_Component(
        value,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#dataAbsentReason() dataAbsentReason} attribute.
   * @param value The value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withDataAbsentReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "dataAbsentReason");
    if (this.dataAbsentReason == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        newValue,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#dataAbsentReason() dataAbsentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataAbsentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withDataAbsentReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.dataAbsentReason == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        value,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        newValue,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        value,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#referenceRange() referenceRange} attribute.
   * @param value The value for referenceRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withReferenceRange(List<Observation_ReferenceRange> value) {
    @Nullable List<Observation_ReferenceRange> newValue = Objects.requireNonNull(value, "referenceRange");
    if (this.referenceRange == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        newValue,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#referenceRange() referenceRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withReferenceRange(Optional<? extends List<Observation_ReferenceRange>> optional) {
    @Nullable List<Observation_ReferenceRange> value = optional.orElse(null);
    if (this.referenceRange == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        value,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        newValue,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        value,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        newValue,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        value,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueRatio() valueRatio} attribute.
   * @param value The value for valueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "valueRatio");
    if (this.valueRatio == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        newValue,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueRatio() valueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withValueRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.valueRatio == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        value,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        newValue,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        value,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        newValue,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        value,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        newValue,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        value,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        newValue,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        value,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValuePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        newValue,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withValuePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        value,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        newValue,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        value,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        newValue,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        value,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        newValue,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        value,
        this.valueSampledData,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueSampledData() valueSampledData} attribute.
   * @param value The value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueSampledData(SampledData value) {
    @Nullable SampledData newValue = Objects.requireNonNull(value, "valueSampledData");
    if (this.valueSampledData == newValue) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        newValue,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueSampledData() valueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservation_Component withValueSampledData(Optional<? extends SampledData> optional) {
    @Nullable SampledData value = optional.orElse(null);
    if (this.valueSampledData == value) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        value,
        this.code,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Observation_Component#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservation_Component withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        newValue,
        this.valueTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Observation_Component#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueTime");
    if (Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Observation_Component#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservation_Component withValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueTime, value)) return this;
    return new ImmutableObservation_Component(
        this.interpretation,
        this.dataAbsentReason,
        this.valueDateTime,
        this.referenceRange,
        this.valueString,
        this.valueQuantity,
        this.valueRatio,
        this.modifierExtension,
        this.valueRange,
        this.id,
        this.extension,
        this.valuePeriod,
        this.valueCodeableConcept,
        this.valueInteger,
        this.valueBoolean,
        this.valueSampledData,
        this.code,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservation_Component} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservation_Component
        && equalTo((ImmutableObservation_Component) another);
  }

  private boolean equalTo(ImmutableObservation_Component another) {
    return Objects.equals(interpretation, another.interpretation)
        && Objects.equals(dataAbsentReason, another.dataAbsentReason)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(referenceRange, another.referenceRange)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueRatio, another.valueRatio)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(valuePeriod, another.valuePeriod)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueSampledData, another.valueSampledData)
        && code.equals(another.code)
        && Objects.equals(valueTime, another.valueTime);
  }

  /**
   * Computes a hash code from attributes: {@code interpretation}, {@code dataAbsentReason}, {@code valueDateTime}, {@code referenceRange}, {@code valueString}, {@code valueQuantity}, {@code valueRatio}, {@code modifierExtension}, {@code valueRange}, {@code id}, {@code extension}, {@code valuePeriod}, {@code valueCodeableConcept}, {@code valueInteger}, {@code valueBoolean}, {@code valueSampledData}, {@code code}, {@code valueTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(interpretation);
    h += (h << 5) + Objects.hashCode(dataAbsentReason);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(referenceRange);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueRatio);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valuePeriod);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueSampledData);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(valueTime);
    return h;
  }

  /**
   * Prints the immutable value {@code Observation_Component} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Observation_Component{");
    if (interpretation != null) {
      builder.append("interpretation=").append(interpretation);
    }
    if (dataAbsentReason != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("dataAbsentReason=").append(dataAbsentReason);
    }
    if (valueDateTime != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (referenceRange != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("referenceRange=").append(referenceRange);
    }
    if (valueString != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueQuantity != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueRatio != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueRatio=").append(valueRatio);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueRange != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valuePeriod != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (valueCodeableConcept != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (valueInteger != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueBoolean != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueSampledData != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("valueSampledData=").append(valueSampledData);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("code=").append(code);
    if (valueTime != null) {
      builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Observation_Component", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Observation_Component {
    @Nullable Optional<List<CodeableConcept>> interpretation = Optional.empty();
    boolean interpretationIsSet;
    @Nullable Optional<CodeableConcept> dataAbsentReason = Optional.empty();
    boolean dataAbsentReasonIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<List<Observation_ReferenceRange>> referenceRange = Optional.empty();
    boolean referenceRangeIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<Ratio> valueRatio = Optional.empty();
    boolean valueRatioIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> valuePeriod = Optional.empty();
    boolean valuePeriodIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<SampledData> valueSampledData = Optional.empty();
    boolean valueSampledDataIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<String> valueTime = Optional.empty();
    boolean valueTimeIsSet;
    @JsonProperty("interpretation")
    public void setInterpretation(Optional<List<CodeableConcept>> interpretation) {
      this.interpretation = interpretation;
      this.interpretationIsSet = true;
    }
    @JsonProperty("dataAbsentReason")
    public void setDataAbsentReason(Optional<CodeableConcept> dataAbsentReason) {
      this.dataAbsentReason = dataAbsentReason;
      this.dataAbsentReasonIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("referenceRange")
    public void setReferenceRange(Optional<List<Observation_ReferenceRange>> referenceRange) {
      this.referenceRange = referenceRange;
      this.referenceRangeIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueRatio")
    public void setValueRatio(Optional<Ratio> valueRatio) {
      this.valueRatio = valueRatio;
      this.valueRatioIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Optional<Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valueSampledData")
    public void setValueSampledData(Optional<SampledData> valueSampledData) {
      this.valueSampledData = valueSampledData;
      this.valueSampledDataIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("valueTime")
    public void setValueTime(Optional<String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> interpretation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> dataAbsentReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Observation_ReferenceRange>> referenceRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> valueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SampledData> valueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueTime() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableObservation_Component fromJson(Json json) {
    ImmutableObservation_Component.Builder builder = ((ImmutableObservation_Component.Builder) ImmutableObservation_Component.builder());
    if (json.interpretationIsSet) {
      builder.interpretation(json.interpretation);
    }
    if (json.dataAbsentReasonIsSet) {
      builder.dataAbsentReason(json.dataAbsentReason);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.referenceRangeIsSet) {
      builder.referenceRange(json.referenceRange);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueRatioIsSet) {
      builder.valueRatio(json.valueRatio);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueSampledDataIsSet) {
      builder.valueSampledData(json.valueSampledData);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    return (ImmutableObservation_Component) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Observation_Component} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Observation_Component instance
   */
  public static Observation_Component copyOf(Observation_Component instance) {
    if (instance instanceof ImmutableObservation_Component) {
      return (ImmutableObservation_Component) instance;
    }
    return ((ImmutableObservation_Component.Builder) ImmutableObservation_Component.builder())
        .interpretation(instance.interpretation())
        .dataAbsentReason(instance.dataAbsentReason())
        .valueDateTime(instance.valueDateTime())
        .referenceRange(instance.referenceRange())
        .valueString(instance.valueString())
        .valueQuantity(instance.valueQuantity())
        .valueRatio(instance.valueRatio())
        .modifierExtension(instance.modifierExtension())
        .valueRange(instance.valueRange())
        .id(instance.id())
        .extension(instance.extension())
        .valuePeriod(instance.valuePeriod())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .valueInteger(instance.valueInteger())
        .valueBoolean(instance.valueBoolean())
        .valueSampledData(instance.valueSampledData())
        .code(instance.code())
        .valueTime(instance.valueTime())
        .build();
  }

  /**
   * Creates a builder for {@link Observation_Component Observation_Component}.
   * <pre>
   * ImmutableObservation_Component.builder()
   *    .interpretation(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Observation_Component#interpretation() interpretation}
   *    .dataAbsentReason(com.fhir.CodeableConcept) // optional {@link Observation_Component#dataAbsentReason() dataAbsentReason}
   *    .valueDateTime(String) // optional {@link Observation_Component#valueDateTime() valueDateTime}
   *    .referenceRange(List&amp;lt;com.fhir.Observation_ReferenceRange&amp;gt;) // optional {@link Observation_Component#referenceRange() referenceRange}
   *    .valueString(String) // optional {@link Observation_Component#valueString() valueString}
   *    .valueQuantity(com.fhir.Quantity) // optional {@link Observation_Component#valueQuantity() valueQuantity}
   *    .valueRatio(com.fhir.Ratio) // optional {@link Observation_Component#valueRatio() valueRatio}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Observation_Component#modifierExtension() modifierExtension}
   *    .valueRange(com.fhir.Range) // optional {@link Observation_Component#valueRange() valueRange}
   *    .id(String) // optional {@link Observation_Component#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Observation_Component#extension() extension}
   *    .valuePeriod(com.fhir.Period) // optional {@link Observation_Component#valuePeriod() valuePeriod}
   *    .valueCodeableConcept(com.fhir.CodeableConcept) // optional {@link Observation_Component#valueCodeableConcept() valueCodeableConcept}
   *    .valueInteger(Double) // optional {@link Observation_Component#valueInteger() valueInteger}
   *    .valueBoolean(Boolean) // optional {@link Observation_Component#valueBoolean() valueBoolean}
   *    .valueSampledData(com.fhir.SampledData) // optional {@link Observation_Component#valueSampledData() valueSampledData}
   *    .code(com.fhir.CodeableConcept) // required {@link Observation_Component#code() code}
   *    .valueTime(String) // optional {@link Observation_Component#valueTime() valueTime}
   *    .build();
   * </pre>
   * @return A new Observation_Component builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableObservation_Component.Builder();
  }

  /**
   * Builds instances of type {@link Observation_Component Observation_Component}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Observation_Component", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_INTERPRETATION = 0x1L;
    private static final long OPT_BIT_DATA_ABSENT_REASON = 0x2L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x4L;
    private static final long OPT_BIT_REFERENCE_RANGE = 0x8L;
    private static final long OPT_BIT_VALUE_STRING = 0x10L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x20L;
    private static final long OPT_BIT_VALUE_RATIO = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_VALUE_RANGE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x800L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x1000L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x2000L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x4000L;
    private static final long OPT_BIT_VALUE_SAMPLED_DATA = 0x8000L;
    private static final long OPT_BIT_VALUE_TIME = 0x10000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<CodeableConcept> interpretation;
    private @Nullable CodeableConcept dataAbsentReason;
    private @Nullable String valueDateTime;
    private @Nullable List<Observation_ReferenceRange> referenceRange;
    private @Nullable String valueString;
    private @Nullable Quantity valueQuantity;
    private @Nullable Ratio valueRatio;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Range valueRange;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Period valuePeriod;
    private @Nullable CodeableConcept valueCodeableConcept;
    private @Nullable Double valueInteger;
    private @Nullable Boolean valueBoolean;
    private @Nullable SampledData valueSampledData;
    private @Nullable CodeableConcept code;
    private @Nullable String valueTime;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Observation_Component#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for chained invocation
     */
    public final Builder interpretation(List<CodeableConcept> interpretation) {
      checkNotIsSet(interpretationIsSet(), "interpretation");
      this.interpretation = Objects.requireNonNull(interpretation, "interpretation");
      optBits |= OPT_BIT_INTERPRETATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("interpretation")
    public final Builder interpretation(Optional<? extends List<CodeableConcept>> interpretation) {
      checkNotIsSet(interpretationIsSet(), "interpretation");
      this.interpretation = interpretation.orElse(null);
      optBits |= OPT_BIT_INTERPRETATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataAbsentReason(CodeableConcept dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = Objects.requireNonNull(dataAbsentReason, "dataAbsentReason");
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataAbsentReason")
    public final Builder dataAbsentReason(Optional<? extends CodeableConcept> dataAbsentReason) {
      checkNotIsSet(dataAbsentReasonIsSet(), "dataAbsentReason");
      this.dataAbsentReason = dataAbsentReason.orElse(null);
      optBits |= OPT_BIT_DATA_ABSENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDateTime")
    public final Builder valueDateTime(Optional<String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceRange(List<Observation_ReferenceRange> referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = Objects.requireNonNull(referenceRange, "referenceRange");
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceRange")
    public final Builder referenceRange(Optional<? extends List<Observation_ReferenceRange>> referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = referenceRange.orElse(null);
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRatio(Ratio valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = Objects.requireNonNull(valueRatio, "valueRatio");
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRatio")
    public final Builder valueRatio(Optional<? extends Ratio> valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = valueRatio.orElse(null);
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation_Component#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Observation_Component#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRange(Range valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = Objects.requireNonNull(valueRange, "valueRange");
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRange")
    public final Builder valueRange(Optional<? extends Range> valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = valueRange.orElse(null);
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation_Component#extension() extension} to extension.
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
     * Initializes the optional value {@link Observation_Component#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuePeriod(Period valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = Objects.requireNonNull(valuePeriod, "valuePeriod");
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valuePeriod")
    public final Builder valuePeriod(Optional<? extends Period> valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = valuePeriod.orElse(null);
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInteger(double valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger;
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link Observation_Component#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBoolean")
    public final Builder valueBoolean(Optional<Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSampledData(SampledData valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = Objects.requireNonNull(valueSampledData, "valueSampledData");
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSampledData")
    public final Builder valueSampledData(Optional<? extends SampledData> valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = valueSampledData.orElse(null);
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the value for the {@link Observation_Component#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTime(String valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = Objects.requireNonNull(valueTime, "valueTime");
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Observation_Component#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueTime")
    public final Builder valueTime(Optional<String> valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = valueTime.orElse(null);
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Builds a new {@link Observation_Component Observation_Component}.
     * @return An immutable instance of Observation_Component
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Observation_Component build() {
      checkRequiredAttributes();
      return new ImmutableObservation_Component(
          interpretation,
          dataAbsentReason,
          valueDateTime,
          referenceRange,
          valueString,
          valueQuantity,
          valueRatio,
          modifierExtension,
          valueRange,
          id,
          extension,
          valuePeriod,
          valueCodeableConcept,
          valueInteger,
          valueBoolean,
          valueSampledData,
          code,
          valueTime);
    }

    private boolean interpretationIsSet() {
      return (optBits & OPT_BIT_INTERPRETATION) != 0;
    }

    private boolean dataAbsentReasonIsSet() {
      return (optBits & OPT_BIT_DATA_ABSENT_REASON) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean referenceRangeIsSet() {
      return (optBits & OPT_BIT_REFERENCE_RANGE) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueRatioIsSet() {
      return (optBits & OPT_BIT_VALUE_RATIO) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueSampledDataIsSet() {
      return (optBits & OPT_BIT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Observation_Component is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build Observation_Component, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Observation_Component", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link Observation_Component#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(CodeableConcept code);
  }

  @Generated(from = "Observation_Component", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Observation_Component#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal interpretation(List<CodeableConcept> interpretation);

    /**
     * Initializes the optional value {@link Observation_Component#interpretation() interpretation} to interpretation.
     * @param interpretation The value for interpretation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal interpretation(Optional<? extends List<CodeableConcept>> interpretation);

    /**
     * Initializes the optional value {@link Observation_Component#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataAbsentReason(CodeableConcept dataAbsentReason);

    /**
     * Initializes the optional value {@link Observation_Component#dataAbsentReason() dataAbsentReason} to dataAbsentReason.
     * @param dataAbsentReason The value for dataAbsentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataAbsentReason(Optional<? extends CodeableConcept> dataAbsentReason);

    /**
     * Initializes the optional value {@link Observation_Component#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDateTime(String valueDateTime);

    /**
     * Initializes the optional value {@link Observation_Component#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDateTime(Optional<String> valueDateTime);

    /**
     * Initializes the optional value {@link Observation_Component#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceRange(List<Observation_ReferenceRange> referenceRange);

    /**
     * Initializes the optional value {@link Observation_Component#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceRange(Optional<? extends List<Observation_ReferenceRange>> referenceRange);

    /**
     * Initializes the optional value {@link Observation_Component#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueString(String valueString);

    /**
     * Initializes the optional value {@link Observation_Component#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueString(Optional<String> valueString);

    /**
     * Initializes the optional value {@link Observation_Component#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(Quantity valueQuantity);

    /**
     * Initializes the optional value {@link Observation_Component#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(Optional<? extends Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link Observation_Component#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRatio(Ratio valueRatio);

    /**
     * Initializes the optional value {@link Observation_Component#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRatio(Optional<? extends Ratio> valueRatio);

    /**
     * Initializes the optional value {@link Observation_Component#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Observation_Component#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Observation_Component#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRange(Range valueRange);

    /**
     * Initializes the optional value {@link Observation_Component#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRange(Optional<? extends Range> valueRange);

    /**
     * Initializes the optional value {@link Observation_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Observation_Component#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Observation_Component#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Observation_Component#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Observation_Component#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valuePeriod(Period valuePeriod);

    /**
     * Initializes the optional value {@link Observation_Component#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valuePeriod(Optional<? extends Period> valuePeriod);

    /**
     * Initializes the optional value {@link Observation_Component#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCodeableConcept(CodeableConcept valueCodeableConcept);

    /**
     * Initializes the optional value {@link Observation_Component#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept);

    /**
     * Initializes the optional value {@link Observation_Component#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueInteger(double valueInteger);

    /**
     * Initializes the optional value {@link Observation_Component#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueInteger(Optional<Double> valueInteger);

    /**
     * Initializes the optional value {@link Observation_Component#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueBoolean(boolean valueBoolean);

    /**
     * Initializes the optional value {@link Observation_Component#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueBoolean(Optional<Boolean> valueBoolean);

    /**
     * Initializes the optional value {@link Observation_Component#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueSampledData(SampledData valueSampledData);

    /**
     * Initializes the optional value {@link Observation_Component#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSampledData(Optional<? extends SampledData> valueSampledData);

    /**
     * Initializes the optional value {@link Observation_Component#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueTime(String valueTime);

    /**
     * Initializes the optional value {@link Observation_Component#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueTime(Optional<String> valueTime);

    /**
     * Builds a new {@link Observation_Component Observation_Component}.
     * @return An immutable instance of Observation_Component
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Observation_Component build();
  }
}
