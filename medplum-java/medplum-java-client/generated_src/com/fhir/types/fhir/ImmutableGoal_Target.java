package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Goal_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGoal_Target.builder()}.
 */
@Generated(from = "Goal_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGoal_Target implements Goal_Target {
  private final @Nullable CodeableConcept measure;
  private final @Nullable Boolean detailBoolean;
  private final @Nullable Ratio detailRatio;
  private final @Nullable Quantity detailQuantity;
  private final @Nullable String detailString;
  private final @Nullable CodeableConcept detailCodeableConcept;
  private final @Nullable Duration dueDuration;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Range detailRange;
  private final @Nullable String dueDate;
  private final @Nullable Double detailInteger;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableGoal_Target(
      @Nullable CodeableConcept measure,
      @Nullable Boolean detailBoolean,
      @Nullable Ratio detailRatio,
      @Nullable Quantity detailQuantity,
      @Nullable String detailString,
      @Nullable CodeableConcept detailCodeableConcept,
      @Nullable Duration dueDuration,
      @Nullable List<Extension> modifierExtension,
      @Nullable Range detailRange,
      @Nullable String dueDate,
      @Nullable Double detailInteger,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.measure = measure;
    this.detailBoolean = detailBoolean;
    this.detailRatio = detailRatio;
    this.detailQuantity = detailQuantity;
    this.detailString = detailString;
    this.detailCodeableConcept = detailCodeableConcept;
    this.dueDuration = dueDuration;
    this.modifierExtension = modifierExtension;
    this.detailRange = detailRange;
    this.dueDate = dueDate;
    this.detailInteger = detailInteger;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code measure} attribute
   */
  @JsonProperty("measure")
  @Override
  public Optional<CodeableConcept> measure() {
    return Optional.ofNullable(measure);
  }

  /**
   * @return The value of the {@code detailBoolean} attribute
   */
  @JsonProperty("detailBoolean")
  @Override
  public Optional<Boolean> detailBoolean() {
    return Optional.ofNullable(detailBoolean);
  }

  /**
   * @return The value of the {@code detailRatio} attribute
   */
  @JsonProperty("detailRatio")
  @Override
  public Optional<Ratio> detailRatio() {
    return Optional.ofNullable(detailRatio);
  }

  /**
   * @return The value of the {@code detailQuantity} attribute
   */
  @JsonProperty("detailQuantity")
  @Override
  public Optional<Quantity> detailQuantity() {
    return Optional.ofNullable(detailQuantity);
  }

  /**
   * @return The value of the {@code detailString} attribute
   */
  @JsonProperty("detailString")
  @Override
  public Optional<String> detailString() {
    return Optional.ofNullable(detailString);
  }

  /**
   * @return The value of the {@code detailCodeableConcept} attribute
   */
  @JsonProperty("detailCodeableConcept")
  @Override
  public Optional<CodeableConcept> detailCodeableConcept() {
    return Optional.ofNullable(detailCodeableConcept);
  }

  /**
   * @return The value of the {@code dueDuration} attribute
   */
  @JsonProperty("dueDuration")
  @Override
  public Optional<Duration> dueDuration() {
    return Optional.ofNullable(dueDuration);
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
   * @return The value of the {@code detailRange} attribute
   */
  @JsonProperty("detailRange")
  @Override
  public Optional<Range> detailRange() {
    return Optional.ofNullable(detailRange);
  }

  /**
   * @return The value of the {@code dueDate} attribute
   */
  @JsonProperty("dueDate")
  @Override
  public Optional<String> dueDate() {
    return Optional.ofNullable(dueDate);
  }

  /**
   * @return The value of the {@code detailInteger} attribute
   */
  @JsonProperty("detailInteger")
  @Override
  public Optional<Double> detailInteger() {
    return Optional.ofNullable(detailInteger);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#measure() measure} attribute.
   * @param value The value for measure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withMeasure(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "measure");
    if (this.measure == newValue) return this;
    return new ImmutableGoal_Target(
        newValue,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#measure() measure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withMeasure(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.measure == value) return this;
    return new ImmutableGoal_Target(
        value,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#detailBoolean() detailBoolean} attribute.
   * @param value The value for detailBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.detailBoolean, newValue)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        newValue,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#detailBoolean() detailBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.detailBoolean, value)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        value,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#detailRatio() detailRatio} attribute.
   * @param value The value for detailRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "detailRatio");
    if (this.detailRatio == newValue) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        newValue,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#detailRatio() detailRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withDetailRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.detailRatio == value) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        value,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#detailQuantity() detailQuantity} attribute.
   * @param value The value for detailQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "detailQuantity");
    if (this.detailQuantity == newValue) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        newValue,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#detailQuantity() detailQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withDetailQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.detailQuantity == value) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        value,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#detailString() detailString} attribute.
   * @param value The value for detailString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "detailString");
    if (Objects.equals(this.detailString, newValue)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        newValue,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#detailString() detailString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.detailString, value)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        value,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#detailCodeableConcept() detailCodeableConcept} attribute.
   * @param value The value for detailCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "detailCodeableConcept");
    if (this.detailCodeableConcept == newValue) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        newValue,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#detailCodeableConcept() detailCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withDetailCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.detailCodeableConcept == value) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        value,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#dueDuration() dueDuration} attribute.
   * @param value The value for dueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDueDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "dueDuration");
    if (this.dueDuration == newValue) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        newValue,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#dueDuration() dueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withDueDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.dueDuration == value) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        value,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        newValue,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        value,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#detailRange() detailRange} attribute.
   * @param value The value for detailRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "detailRange");
    if (this.detailRange == newValue) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        newValue,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#detailRange() detailRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withDetailRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.detailRange == value) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        value,
        this.dueDate,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#dueDate() dueDate} attribute.
   * @param value The value for dueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDueDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "dueDate");
    if (Objects.equals(this.dueDate, newValue)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        newValue,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#dueDate() dueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDueDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.dueDate, value)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        value,
        this.detailInteger,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#detailInteger() detailInteger} attribute.
   * @param value The value for detailInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.detailInteger, newValue)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        newValue,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#detailInteger() detailInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withDetailInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.detailInteger, value)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        value,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Goal_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGoal_Target withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Goal_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGoal_Target withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGoal_Target(
        this.measure,
        this.detailBoolean,
        this.detailRatio,
        this.detailQuantity,
        this.detailString,
        this.detailCodeableConcept,
        this.dueDuration,
        this.modifierExtension,
        this.detailRange,
        this.dueDate,
        this.detailInteger,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGoal_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGoal_Target
        && equalTo((ImmutableGoal_Target) another);
  }

  private boolean equalTo(ImmutableGoal_Target another) {
    return Objects.equals(measure, another.measure)
        && Objects.equals(detailBoolean, another.detailBoolean)
        && Objects.equals(detailRatio, another.detailRatio)
        && Objects.equals(detailQuantity, another.detailQuantity)
        && Objects.equals(detailString, another.detailString)
        && Objects.equals(detailCodeableConcept, another.detailCodeableConcept)
        && Objects.equals(dueDuration, another.dueDuration)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(detailRange, another.detailRange)
        && Objects.equals(dueDate, another.dueDate)
        && Objects.equals(detailInteger, another.detailInteger)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code measure}, {@code detailBoolean}, {@code detailRatio}, {@code detailQuantity}, {@code detailString}, {@code detailCodeableConcept}, {@code dueDuration}, {@code modifierExtension}, {@code detailRange}, {@code dueDate}, {@code detailInteger}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(measure);
    h += (h << 5) + Objects.hashCode(detailBoolean);
    h += (h << 5) + Objects.hashCode(detailRatio);
    h += (h << 5) + Objects.hashCode(detailQuantity);
    h += (h << 5) + Objects.hashCode(detailString);
    h += (h << 5) + Objects.hashCode(detailCodeableConcept);
    h += (h << 5) + Objects.hashCode(dueDuration);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(detailRange);
    h += (h << 5) + Objects.hashCode(dueDate);
    h += (h << 5) + Objects.hashCode(detailInteger);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Goal_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Goal_Target{");
    if (measure != null) {
      builder.append("measure=").append(measure);
    }
    if (detailBoolean != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("detailBoolean=").append(detailBoolean);
    }
    if (detailRatio != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("detailRatio=").append(detailRatio);
    }
    if (detailQuantity != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("detailQuantity=").append(detailQuantity);
    }
    if (detailString != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("detailString=").append(detailString);
    }
    if (detailCodeableConcept != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("detailCodeableConcept=").append(detailCodeableConcept);
    }
    if (dueDuration != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("dueDuration=").append(dueDuration);
    }
    if (modifierExtension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (detailRange != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("detailRange=").append(detailRange);
    }
    if (dueDate != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("dueDate=").append(dueDate);
    }
    if (detailInteger != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("detailInteger=").append(detailInteger);
    }
    if (id != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Goal_Target", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Goal_Target {
    @Nullable Optional<CodeableConcept> measure = Optional.empty();
    boolean measureIsSet;
    @Nullable Optional<Boolean> detailBoolean = Optional.empty();
    boolean detailBooleanIsSet;
    @Nullable Optional<Ratio> detailRatio = Optional.empty();
    boolean detailRatioIsSet;
    @Nullable Optional<Quantity> detailQuantity = Optional.empty();
    boolean detailQuantityIsSet;
    @Nullable Optional<String> detailString = Optional.empty();
    boolean detailStringIsSet;
    @Nullable Optional<CodeableConcept> detailCodeableConcept = Optional.empty();
    boolean detailCodeableConceptIsSet;
    @Nullable Optional<Duration> dueDuration = Optional.empty();
    boolean dueDurationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Range> detailRange = Optional.empty();
    boolean detailRangeIsSet;
    @Nullable Optional<String> dueDate = Optional.empty();
    boolean dueDateIsSet;
    @Nullable Optional<Double> detailInteger = Optional.empty();
    boolean detailIntegerIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("measure")
    public void setMeasure(Optional<CodeableConcept> measure) {
      this.measure = measure;
      this.measureIsSet = true;
    }
    @JsonProperty("detailBoolean")
    public void setDetailBoolean(Optional<Boolean> detailBoolean) {
      this.detailBoolean = detailBoolean;
      this.detailBooleanIsSet = true;
    }
    @JsonProperty("detailRatio")
    public void setDetailRatio(Optional<Ratio> detailRatio) {
      this.detailRatio = detailRatio;
      this.detailRatioIsSet = true;
    }
    @JsonProperty("detailQuantity")
    public void setDetailQuantity(Optional<Quantity> detailQuantity) {
      this.detailQuantity = detailQuantity;
      this.detailQuantityIsSet = true;
    }
    @JsonProperty("detailString")
    public void setDetailString(Optional<String> detailString) {
      this.detailString = detailString;
      this.detailStringIsSet = true;
    }
    @JsonProperty("detailCodeableConcept")
    public void setDetailCodeableConcept(Optional<CodeableConcept> detailCodeableConcept) {
      this.detailCodeableConcept = detailCodeableConcept;
      this.detailCodeableConceptIsSet = true;
    }
    @JsonProperty("dueDuration")
    public void setDueDuration(Optional<Duration> dueDuration) {
      this.dueDuration = dueDuration;
      this.dueDurationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("detailRange")
    public void setDetailRange(Optional<Range> detailRange) {
      this.detailRange = detailRange;
      this.detailRangeIsSet = true;
    }
    @JsonProperty("dueDate")
    public void setDueDate(Optional<String> dueDate) {
      this.dueDate = dueDate;
      this.dueDateIsSet = true;
    }
    @JsonProperty("detailInteger")
    public void setDetailInteger(Optional<Double> detailInteger) {
      this.detailInteger = detailInteger;
      this.detailIntegerIsSet = true;
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
    @Override
    public Optional<CodeableConcept> measure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> detailBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> detailRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> detailQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> detailString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> detailCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> dueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> detailRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> dueDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> detailInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableGoal_Target fromJson(Json json) {
    ImmutableGoal_Target.Builder builder = ImmutableGoal_Target.builder();
    if (json.measureIsSet) {
      builder.measure(json.measure);
    }
    if (json.detailBooleanIsSet) {
      builder.detailBoolean(json.detailBoolean);
    }
    if (json.detailRatioIsSet) {
      builder.detailRatio(json.detailRatio);
    }
    if (json.detailQuantityIsSet) {
      builder.detailQuantity(json.detailQuantity);
    }
    if (json.detailStringIsSet) {
      builder.detailString(json.detailString);
    }
    if (json.detailCodeableConceptIsSet) {
      builder.detailCodeableConcept(json.detailCodeableConcept);
    }
    if (json.dueDurationIsSet) {
      builder.dueDuration(json.dueDuration);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.detailRangeIsSet) {
      builder.detailRange(json.detailRange);
    }
    if (json.dueDateIsSet) {
      builder.dueDate(json.dueDate);
    }
    if (json.detailIntegerIsSet) {
      builder.detailInteger(json.detailInteger);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableGoal_Target) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Goal_Target} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Goal_Target instance
   */
  public static Goal_Target copyOf(Goal_Target instance) {
    if (instance instanceof ImmutableGoal_Target) {
      return (ImmutableGoal_Target) instance;
    }
    return ImmutableGoal_Target.builder()
        .measure(instance.measure())
        .detailBoolean(instance.detailBoolean())
        .detailRatio(instance.detailRatio())
        .detailQuantity(instance.detailQuantity())
        .detailString(instance.detailString())
        .detailCodeableConcept(instance.detailCodeableConcept())
        .dueDuration(instance.dueDuration())
        .modifierExtension(instance.modifierExtension())
        .detailRange(instance.detailRange())
        .dueDate(instance.dueDate())
        .detailInteger(instance.detailInteger())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Goal_Target Goal_Target}.
   * <pre>
   * ImmutableGoal_Target.builder()
   *    .measure(com.fhir.types.fhir.CodeableConcept) // optional {@link Goal_Target#measure() measure}
   *    .detailBoolean(Boolean) // optional {@link Goal_Target#detailBoolean() detailBoolean}
   *    .detailRatio(com.fhir.types.fhir.Ratio) // optional {@link Goal_Target#detailRatio() detailRatio}
   *    .detailQuantity(com.fhir.types.fhir.Quantity) // optional {@link Goal_Target#detailQuantity() detailQuantity}
   *    .detailString(String) // optional {@link Goal_Target#detailString() detailString}
   *    .detailCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link Goal_Target#detailCodeableConcept() detailCodeableConcept}
   *    .dueDuration(com.fhir.types.fhir.Duration) // optional {@link Goal_Target#dueDuration() dueDuration}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Goal_Target#modifierExtension() modifierExtension}
   *    .detailRange(com.fhir.types.fhir.Range) // optional {@link Goal_Target#detailRange() detailRange}
   *    .dueDate(String) // optional {@link Goal_Target#dueDate() dueDate}
   *    .detailInteger(Double) // optional {@link Goal_Target#detailInteger() detailInteger}
   *    .id(String) // optional {@link Goal_Target#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Goal_Target#extension() extension}
   *    .build();
   * </pre>
   * @return A new Goal_Target builder
   */
  public static ImmutableGoal_Target.Builder builder() {
    return new ImmutableGoal_Target.Builder();
  }

  /**
   * Builds instances of type {@link Goal_Target Goal_Target}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Goal_Target", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MEASURE = 0x1L;
    private static final long OPT_BIT_DETAIL_BOOLEAN = 0x2L;
    private static final long OPT_BIT_DETAIL_RATIO = 0x4L;
    private static final long OPT_BIT_DETAIL_QUANTITY = 0x8L;
    private static final long OPT_BIT_DETAIL_STRING = 0x10L;
    private static final long OPT_BIT_DETAIL_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_DUE_DURATION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_DETAIL_RANGE = 0x100L;
    private static final long OPT_BIT_DUE_DATE = 0x200L;
    private static final long OPT_BIT_DETAIL_INTEGER = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private long optBits;

    private @Nullable CodeableConcept measure;
    private @Nullable Boolean detailBoolean;
    private @Nullable Ratio detailRatio;
    private @Nullable Quantity detailQuantity;
    private @Nullable String detailString;
    private @Nullable CodeableConcept detailCodeableConcept;
    private @Nullable Duration dueDuration;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Range detailRange;
    private @Nullable String dueDate;
    private @Nullable Double detailInteger;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Goal_Target#measure() measure} to measure.
     * @param measure The value for measure
     * @return {@code this} builder for chained invocation
     */
    public final Builder measure(CodeableConcept measure) {
      checkNotIsSet(measureIsSet(), "measure");
      this.measure = Objects.requireNonNull(measure, "measure");
      optBits |= OPT_BIT_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#measure() measure} to measure.
     * @param measure The value for measure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measure")
    public final Builder measure(Optional<? extends CodeableConcept> measure) {
      checkNotIsSet(measureIsSet(), "measure");
      this.measure = measure.orElse(null);
      optBits |= OPT_BIT_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailBoolean() detailBoolean} to detailBoolean.
     * @param detailBoolean The value for detailBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailBoolean(boolean detailBoolean) {
      checkNotIsSet(detailBooleanIsSet(), "detailBoolean");
      this.detailBoolean = detailBoolean;
      optBits |= OPT_BIT_DETAIL_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailBoolean() detailBoolean} to detailBoolean.
     * @param detailBoolean The value for detailBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailBoolean")
    public final Builder detailBoolean(Optional<Boolean> detailBoolean) {
      checkNotIsSet(detailBooleanIsSet(), "detailBoolean");
      this.detailBoolean = detailBoolean.orElse(null);
      optBits |= OPT_BIT_DETAIL_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailRatio() detailRatio} to detailRatio.
     * @param detailRatio The value for detailRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailRatio(Ratio detailRatio) {
      checkNotIsSet(detailRatioIsSet(), "detailRatio");
      this.detailRatio = Objects.requireNonNull(detailRatio, "detailRatio");
      optBits |= OPT_BIT_DETAIL_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailRatio() detailRatio} to detailRatio.
     * @param detailRatio The value for detailRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailRatio")
    public final Builder detailRatio(Optional<? extends Ratio> detailRatio) {
      checkNotIsSet(detailRatioIsSet(), "detailRatio");
      this.detailRatio = detailRatio.orElse(null);
      optBits |= OPT_BIT_DETAIL_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailQuantity() detailQuantity} to detailQuantity.
     * @param detailQuantity The value for detailQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailQuantity(Quantity detailQuantity) {
      checkNotIsSet(detailQuantityIsSet(), "detailQuantity");
      this.detailQuantity = Objects.requireNonNull(detailQuantity, "detailQuantity");
      optBits |= OPT_BIT_DETAIL_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailQuantity() detailQuantity} to detailQuantity.
     * @param detailQuantity The value for detailQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailQuantity")
    public final Builder detailQuantity(Optional<? extends Quantity> detailQuantity) {
      checkNotIsSet(detailQuantityIsSet(), "detailQuantity");
      this.detailQuantity = detailQuantity.orElse(null);
      optBits |= OPT_BIT_DETAIL_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailString() detailString} to detailString.
     * @param detailString The value for detailString
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailString(String detailString) {
      checkNotIsSet(detailStringIsSet(), "detailString");
      this.detailString = Objects.requireNonNull(detailString, "detailString");
      optBits |= OPT_BIT_DETAIL_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailString() detailString} to detailString.
     * @param detailString The value for detailString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailString")
    public final Builder detailString(Optional<String> detailString) {
      checkNotIsSet(detailStringIsSet(), "detailString");
      this.detailString = detailString.orElse(null);
      optBits |= OPT_BIT_DETAIL_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailCodeableConcept() detailCodeableConcept} to detailCodeableConcept.
     * @param detailCodeableConcept The value for detailCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailCodeableConcept(CodeableConcept detailCodeableConcept) {
      checkNotIsSet(detailCodeableConceptIsSet(), "detailCodeableConcept");
      this.detailCodeableConcept = Objects.requireNonNull(detailCodeableConcept, "detailCodeableConcept");
      optBits |= OPT_BIT_DETAIL_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailCodeableConcept() detailCodeableConcept} to detailCodeableConcept.
     * @param detailCodeableConcept The value for detailCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailCodeableConcept")
    public final Builder detailCodeableConcept(Optional<? extends CodeableConcept> detailCodeableConcept) {
      checkNotIsSet(detailCodeableConceptIsSet(), "detailCodeableConcept");
      this.detailCodeableConcept = detailCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DETAIL_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#dueDuration() dueDuration} to dueDuration.
     * @param dueDuration The value for dueDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder dueDuration(Duration dueDuration) {
      checkNotIsSet(dueDurationIsSet(), "dueDuration");
      this.dueDuration = Objects.requireNonNull(dueDuration, "dueDuration");
      optBits |= OPT_BIT_DUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#dueDuration() dueDuration} to dueDuration.
     * @param dueDuration The value for dueDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dueDuration")
    public final Builder dueDuration(Optional<? extends Duration> dueDuration) {
      checkNotIsSet(dueDurationIsSet(), "dueDuration");
      this.dueDuration = dueDuration.orElse(null);
      optBits |= OPT_BIT_DUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Goal_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Goal_Target#detailRange() detailRange} to detailRange.
     * @param detailRange The value for detailRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailRange(Range detailRange) {
      checkNotIsSet(detailRangeIsSet(), "detailRange");
      this.detailRange = Objects.requireNonNull(detailRange, "detailRange");
      optBits |= OPT_BIT_DETAIL_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailRange() detailRange} to detailRange.
     * @param detailRange The value for detailRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailRange")
    public final Builder detailRange(Optional<? extends Range> detailRange) {
      checkNotIsSet(detailRangeIsSet(), "detailRange");
      this.detailRange = detailRange.orElse(null);
      optBits |= OPT_BIT_DETAIL_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#dueDate() dueDate} to dueDate.
     * @param dueDate The value for dueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder dueDate(String dueDate) {
      checkNotIsSet(dueDateIsSet(), "dueDate");
      this.dueDate = Objects.requireNonNull(dueDate, "dueDate");
      optBits |= OPT_BIT_DUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#dueDate() dueDate} to dueDate.
     * @param dueDate The value for dueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dueDate")
    public final Builder dueDate(Optional<String> dueDate) {
      checkNotIsSet(dueDateIsSet(), "dueDate");
      this.dueDate = dueDate.orElse(null);
      optBits |= OPT_BIT_DUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailInteger() detailInteger} to detailInteger.
     * @param detailInteger The value for detailInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailInteger(double detailInteger) {
      checkNotIsSet(detailIntegerIsSet(), "detailInteger");
      this.detailInteger = detailInteger;
      optBits |= OPT_BIT_DETAIL_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#detailInteger() detailInteger} to detailInteger.
     * @param detailInteger The value for detailInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailInteger")
    public final Builder detailInteger(Optional<Double> detailInteger) {
      checkNotIsSet(detailIntegerIsSet(), "detailInteger");
      this.detailInteger = detailInteger.orElse(null);
      optBits |= OPT_BIT_DETAIL_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Goal_Target#id() id} to id.
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
     * Initializes the optional value {@link Goal_Target#id() id} to id.
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
     * Initializes the optional value {@link Goal_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link Goal_Target#extension() extension} to extension.
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
     * Builds a new {@link Goal_Target Goal_Target}.
     * @return An immutable instance of Goal_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Goal_Target build() {
      return new ImmutableGoal_Target(
          measure,
          detailBoolean,
          detailRatio,
          detailQuantity,
          detailString,
          detailCodeableConcept,
          dueDuration,
          modifierExtension,
          detailRange,
          dueDate,
          detailInteger,
          id,
          extension);
    }

    private boolean measureIsSet() {
      return (optBits & OPT_BIT_MEASURE) != 0;
    }

    private boolean detailBooleanIsSet() {
      return (optBits & OPT_BIT_DETAIL_BOOLEAN) != 0;
    }

    private boolean detailRatioIsSet() {
      return (optBits & OPT_BIT_DETAIL_RATIO) != 0;
    }

    private boolean detailQuantityIsSet() {
      return (optBits & OPT_BIT_DETAIL_QUANTITY) != 0;
    }

    private boolean detailStringIsSet() {
      return (optBits & OPT_BIT_DETAIL_STRING) != 0;
    }

    private boolean detailCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DETAIL_CODEABLE_CONCEPT) != 0;
    }

    private boolean dueDurationIsSet() {
      return (optBits & OPT_BIT_DUE_DURATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean detailRangeIsSet() {
      return (optBits & OPT_BIT_DETAIL_RANGE) != 0;
    }

    private boolean dueDateIsSet() {
      return (optBits & OPT_BIT_DUE_DATE) != 0;
    }

    private boolean detailIntegerIsSet() {
      return (optBits & OPT_BIT_DETAIL_INTEGER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Goal_Target is strict, attribute is already set: ".concat(name));
    }
  }
}
