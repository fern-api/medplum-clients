package com.fhir;

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
 * Immutable implementation of {@link Specimen_Collection}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimen_Collection.builder()}.
 */
@Generated(from = "Specimen_Collection", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimen_Collection implements Specimen_Collection {
  private final @Nullable Duration duration;
  private final @Nullable Reference collector;
  private final @Nullable Period collectedPeriod;
  private final @Nullable Quantity quantity;
  private final @Nullable Duration fastingStatusDuration;
  private final @Nullable CodeableConcept fastingStatusCodeableConcept;
  private final @Nullable String id;
  private final @Nullable CodeableConcept method;
  private final @Nullable CodeableConcept bodySite;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String collectedDateTime;
  private final @Nullable List<Extension> extension;

  private ImmutableSpecimen_Collection(
      @Nullable Duration duration,
      @Nullable Reference collector,
      @Nullable Period collectedPeriod,
      @Nullable Quantity quantity,
      @Nullable Duration fastingStatusDuration,
      @Nullable CodeableConcept fastingStatusCodeableConcept,
      @Nullable String id,
      @Nullable CodeableConcept method,
      @Nullable CodeableConcept bodySite,
      @Nullable List<Extension> modifierExtension,
      @Nullable String collectedDateTime,
      @Nullable List<Extension> extension) {
    this.duration = duration;
    this.collector = collector;
    this.collectedPeriod = collectedPeriod;
    this.quantity = quantity;
    this.fastingStatusDuration = fastingStatusDuration;
    this.fastingStatusCodeableConcept = fastingStatusCodeableConcept;
    this.id = id;
    this.method = method;
    this.bodySite = bodySite;
    this.modifierExtension = modifierExtension;
    this.collectedDateTime = collectedDateTime;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @JsonProperty("duration")
  @Override
  public Optional<Duration> duration() {
    return Optional.ofNullable(duration);
  }

  /**
   * @return The value of the {@code collector} attribute
   */
  @JsonProperty("collector")
  @Override
  public Optional<Reference> collector() {
    return Optional.ofNullable(collector);
  }

  /**
   * @return The value of the {@code collectedPeriod} attribute
   */
  @JsonProperty("collectedPeriod")
  @Override
  public Optional<Period> collectedPeriod() {
    return Optional.ofNullable(collectedPeriod);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code fastingStatusDuration} attribute
   */
  @JsonProperty("fastingStatusDuration")
  @Override
  public Optional<Duration> fastingStatusDuration() {
    return Optional.ofNullable(fastingStatusDuration);
  }

  /**
   * @return The value of the {@code fastingStatusCodeableConcept} attribute
   */
  @JsonProperty("fastingStatusCodeableConcept")
  @Override
  public Optional<CodeableConcept> fastingStatusCodeableConcept() {
    return Optional.ofNullable(fastingStatusCodeableConcept);
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
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<CodeableConcept> bodySite() {
    return Optional.ofNullable(bodySite);
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
   * @return The value of the {@code collectedDateTime} attribute
   */
  @JsonProperty("collectedDateTime")
  @Override
  public Optional<String> collectedDateTime() {
    return Optional.ofNullable(collectedDateTime);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableSpecimen_Collection(
        newValue,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableSpecimen_Collection(
        value,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#collector() collector} attribute.
   * @param value The value for collector
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withCollector(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "collector");
    if (this.collector == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        newValue,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#collector() collector} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collector
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withCollector(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.collector == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        value,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#collectedPeriod() collectedPeriod} attribute.
   * @param value The value for collectedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withCollectedPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "collectedPeriod");
    if (this.collectedPeriod == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        newValue,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#collectedPeriod() collectedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collectedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withCollectedPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.collectedPeriod == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        value,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        newValue,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        value,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#fastingStatusDuration() fastingStatusDuration} attribute.
   * @param value The value for fastingStatusDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withFastingStatusDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "fastingStatusDuration");
    if (this.fastingStatusDuration == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        newValue,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#fastingStatusDuration() fastingStatusDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fastingStatusDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withFastingStatusDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.fastingStatusDuration == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        value,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#fastingStatusCodeableConcept() fastingStatusCodeableConcept} attribute.
   * @param value The value for fastingStatusCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withFastingStatusCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "fastingStatusCodeableConcept");
    if (this.fastingStatusCodeableConcept == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        newValue,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#fastingStatusCodeableConcept() fastingStatusCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fastingStatusCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withFastingStatusCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.fastingStatusCodeableConcept == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        value,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        newValue,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        value,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        newValue,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        value,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withBodySite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        newValue,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withBodySite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        value,
        this.modifierExtension,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        newValue,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        value,
        this.collectedDateTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#collectedDateTime() collectedDateTime} attribute.
   * @param value The value for collectedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withCollectedDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "collectedDateTime");
    if (Objects.equals(this.collectedDateTime, newValue)) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#collectedDateTime() collectedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collectedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withCollectedDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.collectedDateTime, value)) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Collection#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Collection withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Collection#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Collection withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimen_Collection(
        this.duration,
        this.collector,
        this.collectedPeriod,
        this.quantity,
        this.fastingStatusDuration,
        this.fastingStatusCodeableConcept,
        this.id,
        this.method,
        this.bodySite,
        this.modifierExtension,
        this.collectedDateTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimen_Collection} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimen_Collection
        && equalTo((ImmutableSpecimen_Collection) another);
  }

  private boolean equalTo(ImmutableSpecimen_Collection another) {
    return Objects.equals(duration, another.duration)
        && Objects.equals(collector, another.collector)
        && Objects.equals(collectedPeriod, another.collectedPeriod)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(fastingStatusDuration, another.fastingStatusDuration)
        && Objects.equals(fastingStatusCodeableConcept, another.fastingStatusCodeableConcept)
        && Objects.equals(id, another.id)
        && Objects.equals(method, another.method)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(collectedDateTime, another.collectedDateTime)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code duration}, {@code collector}, {@code collectedPeriod}, {@code quantity}, {@code fastingStatusDuration}, {@code fastingStatusCodeableConcept}, {@code id}, {@code method}, {@code bodySite}, {@code modifierExtension}, {@code collectedDateTime}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(duration);
    h += (h << 5) + Objects.hashCode(collector);
    h += (h << 5) + Objects.hashCode(collectedPeriod);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(fastingStatusDuration);
    h += (h << 5) + Objects.hashCode(fastingStatusCodeableConcept);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(collectedDateTime);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Specimen_Collection} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Specimen_Collection{");
    if (duration != null) {
      builder.append("duration=").append(duration);
    }
    if (collector != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("collector=").append(collector);
    }
    if (collectedPeriod != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("collectedPeriod=").append(collectedPeriod);
    }
    if (quantity != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (fastingStatusDuration != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("fastingStatusDuration=").append(fastingStatusDuration);
    }
    if (fastingStatusCodeableConcept != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("fastingStatusCodeableConcept=").append(fastingStatusCodeableConcept);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (method != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (bodySite != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (collectedDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("collectedDateTime=").append(collectedDateTime);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Specimen_Collection", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Specimen_Collection {
    @Nullable Optional<Duration> duration = Optional.empty();
    boolean durationIsSet;
    @Nullable Optional<Reference> collector = Optional.empty();
    boolean collectorIsSet;
    @Nullable Optional<Period> collectedPeriod = Optional.empty();
    boolean collectedPeriodIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Duration> fastingStatusDuration = Optional.empty();
    boolean fastingStatusDurationIsSet;
    @Nullable Optional<CodeableConcept> fastingStatusCodeableConcept = Optional.empty();
    boolean fastingStatusCodeableConceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<CodeableConcept> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> collectedDateTime = Optional.empty();
    boolean collectedDateTimeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("duration")
    public void setDuration(Optional<Duration> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @JsonProperty("collector")
    public void setCollector(Optional<Reference> collector) {
      this.collector = collector;
      this.collectorIsSet = true;
    }
    @JsonProperty("collectedPeriod")
    public void setCollectedPeriod(Optional<Period> collectedPeriod) {
      this.collectedPeriod = collectedPeriod;
      this.collectedPeriodIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("fastingStatusDuration")
    public void setFastingStatusDuration(Optional<Duration> fastingStatusDuration) {
      this.fastingStatusDuration = fastingStatusDuration;
      this.fastingStatusDurationIsSet = true;
    }
    @JsonProperty("fastingStatusCodeableConcept")
    public void setFastingStatusCodeableConcept(Optional<CodeableConcept> fastingStatusCodeableConcept) {
      this.fastingStatusCodeableConcept = fastingStatusCodeableConcept;
      this.fastingStatusCodeableConceptIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<CodeableConcept> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("collectedDateTime")
    public void setCollectedDateTime(Optional<String> collectedDateTime) {
      this.collectedDateTime = collectedDateTime;
      this.collectedDateTimeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Duration> duration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> collector() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> collectedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> fastingStatusDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> fastingStatusCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> collectedDateTime() { throw new UnsupportedOperationException(); }
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
  static ImmutableSpecimen_Collection fromJson(Json json) {
    ImmutableSpecimen_Collection.Builder builder = ImmutableSpecimen_Collection.builder();
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.collectorIsSet) {
      builder.collector(json.collector);
    }
    if (json.collectedPeriodIsSet) {
      builder.collectedPeriod(json.collectedPeriod);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.fastingStatusDurationIsSet) {
      builder.fastingStatusDuration(json.fastingStatusDuration);
    }
    if (json.fastingStatusCodeableConceptIsSet) {
      builder.fastingStatusCodeableConcept(json.fastingStatusCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.collectedDateTimeIsSet) {
      builder.collectedDateTime(json.collectedDateTime);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSpecimen_Collection) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Specimen_Collection} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Specimen_Collection instance
   */
  public static Specimen_Collection copyOf(Specimen_Collection instance) {
    if (instance instanceof ImmutableSpecimen_Collection) {
      return (ImmutableSpecimen_Collection) instance;
    }
    return ImmutableSpecimen_Collection.builder()
        .duration(instance.duration())
        .collector(instance.collector())
        .collectedPeriod(instance.collectedPeriod())
        .quantity(instance.quantity())
        .fastingStatusDuration(instance.fastingStatusDuration())
        .fastingStatusCodeableConcept(instance.fastingStatusCodeableConcept())
        .id(instance.id())
        .method(instance.method())
        .bodySite(instance.bodySite())
        .modifierExtension(instance.modifierExtension())
        .collectedDateTime(instance.collectedDateTime())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Specimen_Collection Specimen_Collection}.
   * <pre>
   * ImmutableSpecimen_Collection.builder()
   *    .duration(com.fhir.Duration) // optional {@link Specimen_Collection#duration() duration}
   *    .collector(com.fhir.Reference) // optional {@link Specimen_Collection#collector() collector}
   *    .collectedPeriod(com.fhir.Period) // optional {@link Specimen_Collection#collectedPeriod() collectedPeriod}
   *    .quantity(com.fhir.Quantity) // optional {@link Specimen_Collection#quantity() quantity}
   *    .fastingStatusDuration(com.fhir.Duration) // optional {@link Specimen_Collection#fastingStatusDuration() fastingStatusDuration}
   *    .fastingStatusCodeableConcept(com.fhir.CodeableConcept) // optional {@link Specimen_Collection#fastingStatusCodeableConcept() fastingStatusCodeableConcept}
   *    .id(String) // optional {@link Specimen_Collection#id() id}
   *    .method(com.fhir.CodeableConcept) // optional {@link Specimen_Collection#method() method}
   *    .bodySite(com.fhir.CodeableConcept) // optional {@link Specimen_Collection#bodySite() bodySite}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen_Collection#modifierExtension() modifierExtension}
   *    .collectedDateTime(String) // optional {@link Specimen_Collection#collectedDateTime() collectedDateTime}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen_Collection#extension() extension}
   *    .build();
   * </pre>
   * @return A new Specimen_Collection builder
   */
  public static ImmutableSpecimen_Collection.Builder builder() {
    return new ImmutableSpecimen_Collection.Builder();
  }

  /**
   * Builds instances of type {@link Specimen_Collection Specimen_Collection}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Specimen_Collection", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DURATION = 0x1L;
    private static final long OPT_BIT_COLLECTOR = 0x2L;
    private static final long OPT_BIT_COLLECTED_PERIOD = 0x4L;
    private static final long OPT_BIT_QUANTITY = 0x8L;
    private static final long OPT_BIT_FASTING_STATUS_DURATION = 0x10L;
    private static final long OPT_BIT_FASTING_STATUS_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_METHOD = 0x80L;
    private static final long OPT_BIT_BODY_SITE = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_COLLECTED_DATE_TIME = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private long optBits;

    private @Nullable Duration duration;
    private @Nullable Reference collector;
    private @Nullable Period collectedPeriod;
    private @Nullable Quantity quantity;
    private @Nullable Duration fastingStatusDuration;
    private @Nullable CodeableConcept fastingStatusCodeableConcept;
    private @Nullable String id;
    private @Nullable CodeableConcept method;
    private @Nullable CodeableConcept bodySite;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String collectedDateTime;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(Duration duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("duration")
    public final Builder duration(Optional<? extends Duration> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#collector() collector} to collector.
     * @param collector The value for collector
     * @return {@code this} builder for chained invocation
     */
    public final Builder collector(Reference collector) {
      checkNotIsSet(collectorIsSet(), "collector");
      this.collector = Objects.requireNonNull(collector, "collector");
      optBits |= OPT_BIT_COLLECTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#collector() collector} to collector.
     * @param collector The value for collector
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collector")
    public final Builder collector(Optional<? extends Reference> collector) {
      checkNotIsSet(collectorIsSet(), "collector");
      this.collector = collector.orElse(null);
      optBits |= OPT_BIT_COLLECTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#collectedPeriod() collectedPeriod} to collectedPeriod.
     * @param collectedPeriod The value for collectedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder collectedPeriod(Period collectedPeriod) {
      checkNotIsSet(collectedPeriodIsSet(), "collectedPeriod");
      this.collectedPeriod = Objects.requireNonNull(collectedPeriod, "collectedPeriod");
      optBits |= OPT_BIT_COLLECTED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#collectedPeriod() collectedPeriod} to collectedPeriod.
     * @param collectedPeriod The value for collectedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collectedPeriod")
    public final Builder collectedPeriod(Optional<? extends Period> collectedPeriod) {
      checkNotIsSet(collectedPeriodIsSet(), "collectedPeriod");
      this.collectedPeriod = collectedPeriod.orElse(null);
      optBits |= OPT_BIT_COLLECTED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#fastingStatusDuration() fastingStatusDuration} to fastingStatusDuration.
     * @param fastingStatusDuration The value for fastingStatusDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder fastingStatusDuration(Duration fastingStatusDuration) {
      checkNotIsSet(fastingStatusDurationIsSet(), "fastingStatusDuration");
      this.fastingStatusDuration = Objects.requireNonNull(fastingStatusDuration, "fastingStatusDuration");
      optBits |= OPT_BIT_FASTING_STATUS_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#fastingStatusDuration() fastingStatusDuration} to fastingStatusDuration.
     * @param fastingStatusDuration The value for fastingStatusDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fastingStatusDuration")
    public final Builder fastingStatusDuration(Optional<? extends Duration> fastingStatusDuration) {
      checkNotIsSet(fastingStatusDurationIsSet(), "fastingStatusDuration");
      this.fastingStatusDuration = fastingStatusDuration.orElse(null);
      optBits |= OPT_BIT_FASTING_STATUS_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#fastingStatusCodeableConcept() fastingStatusCodeableConcept} to fastingStatusCodeableConcept.
     * @param fastingStatusCodeableConcept The value for fastingStatusCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder fastingStatusCodeableConcept(CodeableConcept fastingStatusCodeableConcept) {
      checkNotIsSet(fastingStatusCodeableConceptIsSet(), "fastingStatusCodeableConcept");
      this.fastingStatusCodeableConcept = Objects.requireNonNull(fastingStatusCodeableConcept, "fastingStatusCodeableConcept");
      optBits |= OPT_BIT_FASTING_STATUS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#fastingStatusCodeableConcept() fastingStatusCodeableConcept} to fastingStatusCodeableConcept.
     * @param fastingStatusCodeableConcept The value for fastingStatusCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fastingStatusCodeableConcept")
    public final Builder fastingStatusCodeableConcept(Optional<? extends CodeableConcept> fastingStatusCodeableConcept) {
      checkNotIsSet(fastingStatusCodeableConceptIsSet(), "fastingStatusCodeableConcept");
      this.fastingStatusCodeableConcept = fastingStatusCodeableConcept.orElse(null);
      optBits |= OPT_BIT_FASTING_STATUS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#id() id} to id.
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
     * Initializes the optional value {@link Specimen_Collection#id() id} to id.
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
     * Initializes the optional value {@link Specimen_Collection#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(CodeableConcept bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodySite")
    public final Builder bodySite(Optional<? extends CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Specimen_Collection#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Specimen_Collection#collectedDateTime() collectedDateTime} to collectedDateTime.
     * @param collectedDateTime The value for collectedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder collectedDateTime(String collectedDateTime) {
      checkNotIsSet(collectedDateTimeIsSet(), "collectedDateTime");
      this.collectedDateTime = Objects.requireNonNull(collectedDateTime, "collectedDateTime");
      optBits |= OPT_BIT_COLLECTED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#collectedDateTime() collectedDateTime} to collectedDateTime.
     * @param collectedDateTime The value for collectedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("collectedDateTime")
    public final Builder collectedDateTime(Optional<String> collectedDateTime) {
      checkNotIsSet(collectedDateTimeIsSet(), "collectedDateTime");
      this.collectedDateTime = collectedDateTime.orElse(null);
      optBits |= OPT_BIT_COLLECTED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Collection#extension() extension} to extension.
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
     * Initializes the optional value {@link Specimen_Collection#extension() extension} to extension.
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
     * Builds a new {@link Specimen_Collection Specimen_Collection}.
     * @return An immutable instance of Specimen_Collection
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Specimen_Collection build() {
      return new ImmutableSpecimen_Collection(
          duration,
          collector,
          collectedPeriod,
          quantity,
          fastingStatusDuration,
          fastingStatusCodeableConcept,
          id,
          method,
          bodySite,
          modifierExtension,
          collectedDateTime,
          extension);
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean collectorIsSet() {
      return (optBits & OPT_BIT_COLLECTOR) != 0;
    }

    private boolean collectedPeriodIsSet() {
      return (optBits & OPT_BIT_COLLECTED_PERIOD) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean fastingStatusDurationIsSet() {
      return (optBits & OPT_BIT_FASTING_STATUS_DURATION) != 0;
    }

    private boolean fastingStatusCodeableConceptIsSet() {
      return (optBits & OPT_BIT_FASTING_STATUS_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean collectedDateTimeIsSet() {
      return (optBits & OPT_BIT_COLLECTED_DATE_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Specimen_Collection is strict, attribute is already set: ".concat(name));
    }
  }
}
