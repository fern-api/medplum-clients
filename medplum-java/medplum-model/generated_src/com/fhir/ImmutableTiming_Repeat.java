//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Timing_Repeat}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTiming_Repeat.builder()}.
 */
@org.immutables.value.Generated(from = "Timing_Repeat", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTiming_Repeat implements com.fhir.Timing_Repeat {
  private final @javax.annotation.Nullable com.fhir.decimal duration;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.positiveInt frequency;
  private final @javax.annotation.Nullable com.fhir.Timing_repeatPeriodunit periodUnit;
  private final @javax.annotation.Nullable com.fhir.positiveInt count;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> dayOfWeek;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.unsignedInt offset;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Timing_repeatWhenItem> when;
  private final @javax.annotation.Nullable com.fhir.decimal periodMax;
  private final @javax.annotation.Nullable com.fhir.Range boundsRange;
  private final @javax.annotation.Nullable com.fhir.positiveInt countMax;
  private final @javax.annotation.Nullable com.fhir.Duration boundsDuration;
  private final @javax.annotation.Nullable com.fhir.Period boundsPeriod;
  private final @javax.annotation.Nullable com.fhir.decimal durationMax;
  private final @javax.annotation.Nullable com.fhir.Timing_repeatDurationunit durationUnit;
  private final @javax.annotation.Nullable com.fhir.positiveInt frequencyMax;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.decimal period;
  private final @javax.annotation.Nullable java.util.List<com.fhir.time> timeOfDay;

  private ImmutableTiming_Repeat(
      @javax.annotation.Nullable com.fhir.decimal duration,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.positiveInt frequency,
      @javax.annotation.Nullable com.fhir.Timing_repeatPeriodunit periodUnit,
      @javax.annotation.Nullable com.fhir.positiveInt count,
      @javax.annotation.Nullable java.util.List<com.fhir.code> dayOfWeek,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.unsignedInt offset,
      @javax.annotation.Nullable java.util.List<com.fhir.Timing_repeatWhenItem> when,
      @javax.annotation.Nullable com.fhir.decimal periodMax,
      @javax.annotation.Nullable com.fhir.Range boundsRange,
      @javax.annotation.Nullable com.fhir.positiveInt countMax,
      @javax.annotation.Nullable com.fhir.Duration boundsDuration,
      @javax.annotation.Nullable com.fhir.Period boundsPeriod,
      @javax.annotation.Nullable com.fhir.decimal durationMax,
      @javax.annotation.Nullable com.fhir.Timing_repeatDurationunit durationUnit,
      @javax.annotation.Nullable com.fhir.positiveInt frequencyMax,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.decimal period,
      @javax.annotation.Nullable java.util.List<com.fhir.time> timeOfDay) {
    this.duration = duration;
    this.id = id;
    this.frequency = frequency;
    this.periodUnit = periodUnit;
    this.count = count;
    this.dayOfWeek = dayOfWeek;
    this.modifierExtension = modifierExtension;
    this.offset = offset;
    this.when = when;
    this.periodMax = periodMax;
    this.boundsRange = boundsRange;
    this.countMax = countMax;
    this.boundsDuration = boundsDuration;
    this.boundsPeriod = boundsPeriod;
    this.durationMax = durationMax;
    this.durationUnit = durationUnit;
    this.frequencyMax = frequencyMax;
    this.extension = extension;
    this.period = period;
    this.timeOfDay = timeOfDay;
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("duration")
  @Override
  public java.util.Optional<com.fhir.decimal> duration() {
    return java.util.Optional.ofNullable(duration);
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
   * @return The value of the {@code frequency} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("frequency")
  @Override
  public java.util.Optional<com.fhir.positiveInt> frequency() {
    return java.util.Optional.ofNullable(frequency);
  }

  /**
   * @return The value of the {@code periodUnit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("periodUnit")
  @Override
  public java.util.Optional<com.fhir.Timing_repeatPeriodunit> periodUnit() {
    return java.util.Optional.ofNullable(periodUnit);
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("count")
  @Override
  public java.util.Optional<com.fhir.positiveInt> count() {
    return java.util.Optional.ofNullable(count);
  }

  /**
   * @return The value of the {@code dayOfWeek} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> dayOfWeek() {
    return java.util.Optional.ofNullable(dayOfWeek);
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
   * @return The value of the {@code offset} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("offset")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> offset() {
    return java.util.Optional.ofNullable(offset);
  }

  /**
   * @return The value of the {@code when} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("when")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Timing_repeatWhenItem>> when() {
    return java.util.Optional.ofNullable(when);
  }

  /**
   * @return The value of the {@code periodMax} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("periodMax")
  @Override
  public java.util.Optional<com.fhir.decimal> periodMax() {
    return java.util.Optional.ofNullable(periodMax);
  }

  /**
   * @return The value of the {@code boundsRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("boundsRange")
  @Override
  public java.util.Optional<com.fhir.Range> boundsRange() {
    return java.util.Optional.ofNullable(boundsRange);
  }

  /**
   * @return The value of the {@code countMax} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("countMax")
  @Override
  public java.util.Optional<com.fhir.positiveInt> countMax() {
    return java.util.Optional.ofNullable(countMax);
  }

  /**
   * @return The value of the {@code boundsDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("boundsDuration")
  @Override
  public java.util.Optional<com.fhir.Duration> boundsDuration() {
    return java.util.Optional.ofNullable(boundsDuration);
  }

  /**
   * @return The value of the {@code boundsPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("boundsPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> boundsPeriod() {
    return java.util.Optional.ofNullable(boundsPeriod);
  }

  /**
   * @return The value of the {@code durationMax} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("durationMax")
  @Override
  public java.util.Optional<com.fhir.decimal> durationMax() {
    return java.util.Optional.ofNullable(durationMax);
  }

  /**
   * @return The value of the {@code durationUnit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("durationUnit")
  @Override
  public java.util.Optional<com.fhir.Timing_repeatDurationunit> durationUnit() {
    return java.util.Optional.ofNullable(durationUnit);
  }

  /**
   * @return The value of the {@code frequencyMax} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("frequencyMax")
  @Override
  public java.util.Optional<com.fhir.positiveInt> frequencyMax() {
    return java.util.Optional.ofNullable(frequencyMax);
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
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.decimal> period() {
    return java.util.Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code timeOfDay} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timeOfDay")
  @Override
  public java.util.Optional<java.util.List<com.fhir.time>> timeOfDay() {
    return java.util.Optional.ofNullable(timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDuration(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableTiming_Repeat(
        newValue,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDuration(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableTiming_Repeat(
        value,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        newValue,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        value,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#frequency() frequency} attribute.
   * @param value The value for frequency
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withFrequency(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "frequency");
    if (this.frequency == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        newValue,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#frequency() frequency} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequency
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withFrequency(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.frequency == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        value,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#periodUnit() periodUnit} attribute.
   * @param value The value for periodUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withPeriodUnit(com.fhir.Timing_repeatPeriodunit value) {
    @javax.annotation.Nullable com.fhir.Timing_repeatPeriodunit newValue = java.util.Objects.requireNonNull(value, "periodUnit");
    if (this.periodUnit == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        newValue,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#periodUnit() periodUnit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for periodUnit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withPeriodUnit(java.util.Optional<? extends com.fhir.Timing_repeatPeriodunit> optional) {
    @javax.annotation.Nullable com.fhir.Timing_repeatPeriodunit value = optional.orElse(null);
    if (this.periodUnit == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        value,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#count() count} attribute.
   * @param value The value for count
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withCount(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "count");
    if (this.count == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        newValue,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#count() count} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for count
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withCount(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.count == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        value,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#dayOfWeek() dayOfWeek} attribute.
   * @param value The value for dayOfWeek
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDayOfWeek(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "dayOfWeek");
    if (this.dayOfWeek == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        newValue,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#dayOfWeek() dayOfWeek} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dayOfWeek
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDayOfWeek(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.dayOfWeek == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        value,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        newValue,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        value,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#offset() offset} attribute.
   * @param value The value for offset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withOffset(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "offset");
    if (this.offset == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        newValue,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#offset() offset} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offset
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withOffset(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.offset == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        value,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#when() when} attribute.
   * @param value The value for when
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withWhen(java.util.List<com.fhir.Timing_repeatWhenItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Timing_repeatWhenItem> newValue = java.util.Objects.requireNonNull(value, "when");
    if (this.when == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        newValue,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#when() when} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for when
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withWhen(java.util.Optional<? extends java.util.List<com.fhir.Timing_repeatWhenItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Timing_repeatWhenItem> value = optional.orElse(null);
    if (this.when == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        value,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#periodMax() periodMax} attribute.
   * @param value The value for periodMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withPeriodMax(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "periodMax");
    if (this.periodMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        newValue,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#periodMax() periodMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for periodMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withPeriodMax(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.periodMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        value,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#boundsRange() boundsRange} attribute.
   * @param value The value for boundsRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withBoundsRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "boundsRange");
    if (this.boundsRange == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        newValue,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#boundsRange() boundsRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for boundsRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withBoundsRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.boundsRange == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        value,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#countMax() countMax} attribute.
   * @param value The value for countMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withCountMax(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "countMax");
    if (this.countMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        newValue,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#countMax() countMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for countMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withCountMax(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.countMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        value,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#boundsDuration() boundsDuration} attribute.
   * @param value The value for boundsDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withBoundsDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "boundsDuration");
    if (this.boundsDuration == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        newValue,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#boundsDuration() boundsDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for boundsDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withBoundsDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.boundsDuration == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        value,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#boundsPeriod() boundsPeriod} attribute.
   * @param value The value for boundsPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withBoundsPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "boundsPeriod");
    if (this.boundsPeriod == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        newValue,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#boundsPeriod() boundsPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for boundsPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withBoundsPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.boundsPeriod == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        value,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#durationMax() durationMax} attribute.
   * @param value The value for durationMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDurationMax(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "durationMax");
    if (this.durationMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        newValue,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#durationMax() durationMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for durationMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDurationMax(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.durationMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        value,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#durationUnit() durationUnit} attribute.
   * @param value The value for durationUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDurationUnit(com.fhir.Timing_repeatDurationunit value) {
    @javax.annotation.Nullable com.fhir.Timing_repeatDurationunit newValue = java.util.Objects.requireNonNull(value, "durationUnit");
    if (this.durationUnit == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        newValue,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#durationUnit() durationUnit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for durationUnit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDurationUnit(java.util.Optional<? extends com.fhir.Timing_repeatDurationunit> optional) {
    @javax.annotation.Nullable com.fhir.Timing_repeatDurationunit value = optional.orElse(null);
    if (this.durationUnit == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        value,
        this.frequencyMax,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#frequencyMax() frequencyMax} attribute.
   * @param value The value for frequencyMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withFrequencyMax(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "frequencyMax");
    if (this.frequencyMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        newValue,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#frequencyMax() frequencyMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequencyMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withFrequencyMax(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.frequencyMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        value,
        this.extension,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        newValue,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        value,
        this.period,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withPeriod(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        newValue,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withPeriod(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        value,
        this.timeOfDay);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#timeOfDay() timeOfDay} attribute.
   * @param value The value for timeOfDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withTimeOfDay(java.util.List<com.fhir.time> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.time> newValue = java.util.Objects.requireNonNull(value, "timeOfDay");
    if (this.timeOfDay == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#timeOfDay() timeOfDay} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timeOfDay
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withTimeOfDay(java.util.Optional<? extends java.util.List<com.fhir.time>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.time> value = optional.orElse(null);
    if (this.timeOfDay == value) return this;
    return new ImmutableTiming_Repeat(
        this.duration,
        this.id,
        this.frequency,
        this.periodUnit,
        this.count,
        this.dayOfWeek,
        this.modifierExtension,
        this.offset,
        this.when,
        this.periodMax,
        this.boundsRange,
        this.countMax,
        this.boundsDuration,
        this.boundsPeriod,
        this.durationMax,
        this.durationUnit,
        this.frequencyMax,
        this.extension,
        this.period,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTiming_Repeat} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTiming_Repeat
        && equalTo((ImmutableTiming_Repeat) another);
  }

  private boolean equalTo(ImmutableTiming_Repeat another) {
    return java.util.Objects.equals(duration, another.duration)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(frequency, another.frequency)
        && java.util.Objects.equals(periodUnit, another.periodUnit)
        && java.util.Objects.equals(count, another.count)
        && java.util.Objects.equals(dayOfWeek, another.dayOfWeek)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(offset, another.offset)
        && java.util.Objects.equals(when, another.when)
        && java.util.Objects.equals(periodMax, another.periodMax)
        && java.util.Objects.equals(boundsRange, another.boundsRange)
        && java.util.Objects.equals(countMax, another.countMax)
        && java.util.Objects.equals(boundsDuration, another.boundsDuration)
        && java.util.Objects.equals(boundsPeriod, another.boundsPeriod)
        && java.util.Objects.equals(durationMax, another.durationMax)
        && java.util.Objects.equals(durationUnit, another.durationUnit)
        && java.util.Objects.equals(frequencyMax, another.frequencyMax)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(timeOfDay, another.timeOfDay);
  }

  /**
   * Computes a hash code from attributes: {@code duration}, {@code id}, {@code frequency}, {@code periodUnit}, {@code count}, {@code dayOfWeek}, {@code modifierExtension}, {@code offset}, {@code when}, {@code periodMax}, {@code boundsRange}, {@code countMax}, {@code boundsDuration}, {@code boundsPeriod}, {@code durationMax}, {@code durationUnit}, {@code frequencyMax}, {@code extension}, {@code period}, {@code timeOfDay}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(duration);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(frequency);
    h += (h << 5) + java.util.Objects.hashCode(periodUnit);
    h += (h << 5) + java.util.Objects.hashCode(count);
    h += (h << 5) + java.util.Objects.hashCode(dayOfWeek);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(offset);
    h += (h << 5) + java.util.Objects.hashCode(when);
    h += (h << 5) + java.util.Objects.hashCode(periodMax);
    h += (h << 5) + java.util.Objects.hashCode(boundsRange);
    h += (h << 5) + java.util.Objects.hashCode(countMax);
    h += (h << 5) + java.util.Objects.hashCode(boundsDuration);
    h += (h << 5) + java.util.Objects.hashCode(boundsPeriod);
    h += (h << 5) + java.util.Objects.hashCode(durationMax);
    h += (h << 5) + java.util.Objects.hashCode(durationUnit);
    h += (h << 5) + java.util.Objects.hashCode(frequencyMax);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(timeOfDay);
    return h;
  }

  /**
   * Prints the immutable value {@code Timing_Repeat} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Timing_Repeat{");
    if (duration != null) {
      builder.append("duration=").append(duration);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (frequency != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("frequency=").append(frequency);
    }
    if (periodUnit != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("periodUnit=").append(periodUnit);
    }
    if (count != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("count=").append(count);
    }
    if (dayOfWeek != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("dayOfWeek=").append(dayOfWeek);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (offset != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("offset=").append(offset);
    }
    if (when != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("when=").append(when);
    }
    if (periodMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("periodMax=").append(periodMax);
    }
    if (boundsRange != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("boundsRange=").append(boundsRange);
    }
    if (countMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("countMax=").append(countMax);
    }
    if (boundsDuration != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("boundsDuration=").append(boundsDuration);
    }
    if (boundsPeriod != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("boundsPeriod=").append(boundsPeriod);
    }
    if (durationMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("durationMax=").append(durationMax);
    }
    if (durationUnit != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("durationUnit=").append(durationUnit);
    }
    if (frequencyMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("frequencyMax=").append(frequencyMax);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (period != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (timeOfDay != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("timeOfDay=").append(timeOfDay);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Timing_Repeat", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Timing_Repeat {
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> duration = java.util.Optional.empty();
    boolean durationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> frequency = java.util.Optional.empty();
    boolean frequencyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing_repeatPeriodunit> periodUnit = java.util.Optional.empty();
    boolean periodUnitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> count = java.util.Optional.empty();
    boolean countIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> dayOfWeek = java.util.Optional.empty();
    boolean dayOfWeekIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> offset = java.util.Optional.empty();
    boolean offsetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Timing_repeatWhenItem>> when = java.util.Optional.empty();
    boolean whenIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> periodMax = java.util.Optional.empty();
    boolean periodMaxIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> boundsRange = java.util.Optional.empty();
    boolean boundsRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> countMax = java.util.Optional.empty();
    boolean countMaxIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> boundsDuration = java.util.Optional.empty();
    boolean boundsDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> boundsPeriod = java.util.Optional.empty();
    boolean boundsPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> durationMax = java.util.Optional.empty();
    boolean durationMaxIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing_repeatDurationunit> durationUnit = java.util.Optional.empty();
    boolean durationUnitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> frequencyMax = java.util.Optional.empty();
    boolean frequencyMaxIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.time>> timeOfDay = java.util.Optional.empty();
    boolean timeOfDayIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public void setDuration(java.util.Optional<com.fhir.decimal> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    public void setFrequency(java.util.Optional<com.fhir.positiveInt> frequency) {
      this.frequency = frequency;
      this.frequencyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("periodUnit")
    public void setPeriodUnit(java.util.Optional<com.fhir.Timing_repeatPeriodunit> periodUnit) {
      this.periodUnit = periodUnit;
      this.periodUnitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    public void setCount(java.util.Optional<com.fhir.positiveInt> count) {
      this.count = count;
      this.countIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    public void setDayOfWeek(java.util.Optional<java.util.List<com.fhir.code>> dayOfWeek) {
      this.dayOfWeek = dayOfWeek;
      this.dayOfWeekIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    public void setOffset(java.util.Optional<com.fhir.unsignedInt> offset) {
      this.offset = offset;
      this.offsetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("when")
    public void setWhen(java.util.Optional<java.util.List<com.fhir.Timing_repeatWhenItem>> when) {
      this.when = when;
      this.whenIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("periodMax")
    public void setPeriodMax(java.util.Optional<com.fhir.decimal> periodMax) {
      this.periodMax = periodMax;
      this.periodMaxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("boundsRange")
    public void setBoundsRange(java.util.Optional<com.fhir.Range> boundsRange) {
      this.boundsRange = boundsRange;
      this.boundsRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("countMax")
    public void setCountMax(java.util.Optional<com.fhir.positiveInt> countMax) {
      this.countMax = countMax;
      this.countMaxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("boundsDuration")
    public void setBoundsDuration(java.util.Optional<com.fhir.Duration> boundsDuration) {
      this.boundsDuration = boundsDuration;
      this.boundsDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("boundsPeriod")
    public void setBoundsPeriod(java.util.Optional<com.fhir.Period> boundsPeriod) {
      this.boundsPeriod = boundsPeriod;
      this.boundsPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("durationMax")
    public void setDurationMax(java.util.Optional<com.fhir.decimal> durationMax) {
      this.durationMax = durationMax;
      this.durationMaxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("durationUnit")
    public void setDurationUnit(java.util.Optional<com.fhir.Timing_repeatDurationunit> durationUnit) {
      this.durationUnit = durationUnit;
      this.durationUnitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyMax")
    public void setFrequencyMax(java.util.Optional<com.fhir.positiveInt> frequencyMax) {
      this.frequencyMax = frequencyMax;
      this.frequencyMaxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.decimal> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDay")
    public void setTimeOfDay(java.util.Optional<java.util.List<com.fhir.time>> timeOfDay) {
      this.timeOfDay = timeOfDay;
      this.timeOfDayIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.decimal> duration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> frequency() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing_repeatPeriodunit> periodUnit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> count() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> dayOfWeek() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> offset() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Timing_repeatWhenItem>> when() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> periodMax() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> boundsRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> countMax() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> boundsDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> boundsPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> durationMax() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing_repeatDurationunit> durationUnit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> frequencyMax() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.time>> timeOfDay() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTiming_Repeat fromJson(Json json) {
    ImmutableTiming_Repeat.Builder builder = ImmutableTiming_Repeat.builder();
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.frequencyIsSet) {
      builder.frequency(json.frequency);
    }
    if (json.periodUnitIsSet) {
      builder.periodUnit(json.periodUnit);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    if (json.dayOfWeekIsSet) {
      builder.dayOfWeek(json.dayOfWeek);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.offsetIsSet) {
      builder.offset(json.offset);
    }
    if (json.whenIsSet) {
      builder.when(json.when);
    }
    if (json.periodMaxIsSet) {
      builder.periodMax(json.periodMax);
    }
    if (json.boundsRangeIsSet) {
      builder.boundsRange(json.boundsRange);
    }
    if (json.countMaxIsSet) {
      builder.countMax(json.countMax);
    }
    if (json.boundsDurationIsSet) {
      builder.boundsDuration(json.boundsDuration);
    }
    if (json.boundsPeriodIsSet) {
      builder.boundsPeriod(json.boundsPeriod);
    }
    if (json.durationMaxIsSet) {
      builder.durationMax(json.durationMax);
    }
    if (json.durationUnitIsSet) {
      builder.durationUnit(json.durationUnit);
    }
    if (json.frequencyMaxIsSet) {
      builder.frequencyMax(json.frequencyMax);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.timeOfDayIsSet) {
      builder.timeOfDay(json.timeOfDay);
    }
    return (ImmutableTiming_Repeat) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Timing_Repeat} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Timing_Repeat instance
   */
  public static Timing_Repeat copyOf(Timing_Repeat instance) {
    if (instance instanceof ImmutableTiming_Repeat) {
      return (ImmutableTiming_Repeat) instance;
    }
    return ImmutableTiming_Repeat.builder()
        .duration(instance.duration())
        .id(instance.id())
        .frequency(instance.frequency())
        .periodUnit(instance.periodUnit())
        .count(instance.count())
        .dayOfWeek(instance.dayOfWeek())
        .modifierExtension(instance.modifierExtension())
        .offset(instance.offset())
        .when(instance.when())
        .periodMax(instance.periodMax())
        .boundsRange(instance.boundsRange())
        .countMax(instance.countMax())
        .boundsDuration(instance.boundsDuration())
        .boundsPeriod(instance.boundsPeriod())
        .durationMax(instance.durationMax())
        .durationUnit(instance.durationUnit())
        .frequencyMax(instance.frequencyMax())
        .extension(instance.extension())
        .period(instance.period())
        .timeOfDay(instance.timeOfDay())
        .build();
  }

  /**
   * Creates a builder for {@link Timing_Repeat Timing_Repeat}.
   * <pre>
   * ImmutableTiming_Repeat.builder()
   *    .duration(com.fhir.decimal) // optional {@link Timing_Repeat#duration() duration}
   *    .id(String) // optional {@link Timing_Repeat#id() id}
   *    .frequency(com.fhir.positiveInt) // optional {@link Timing_Repeat#frequency() frequency}
   *    .periodUnit(com.fhir.Timing_repeatPeriodunit) // optional {@link Timing_Repeat#periodUnit() periodUnit}
   *    .count(com.fhir.positiveInt) // optional {@link Timing_Repeat#count() count}
   *    .dayOfWeek(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link Timing_Repeat#dayOfWeek() dayOfWeek}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Timing_Repeat#modifierExtension() modifierExtension}
   *    .offset(com.fhir.unsignedInt) // optional {@link Timing_Repeat#offset() offset}
   *    .when(List&amp;lt;com.fhir.Timing_repeatWhenItem&amp;gt;) // optional {@link Timing_Repeat#when() when}
   *    .periodMax(com.fhir.decimal) // optional {@link Timing_Repeat#periodMax() periodMax}
   *    .boundsRange(com.fhir.Range) // optional {@link Timing_Repeat#boundsRange() boundsRange}
   *    .countMax(com.fhir.positiveInt) // optional {@link Timing_Repeat#countMax() countMax}
   *    .boundsDuration(com.fhir.Duration) // optional {@link Timing_Repeat#boundsDuration() boundsDuration}
   *    .boundsPeriod(com.fhir.Period) // optional {@link Timing_Repeat#boundsPeriod() boundsPeriod}
   *    .durationMax(com.fhir.decimal) // optional {@link Timing_Repeat#durationMax() durationMax}
   *    .durationUnit(com.fhir.Timing_repeatDurationunit) // optional {@link Timing_Repeat#durationUnit() durationUnit}
   *    .frequencyMax(com.fhir.positiveInt) // optional {@link Timing_Repeat#frequencyMax() frequencyMax}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Timing_Repeat#extension() extension}
   *    .period(com.fhir.decimal) // optional {@link Timing_Repeat#period() period}
   *    .timeOfDay(List&amp;lt;com.fhir.time&amp;gt;) // optional {@link Timing_Repeat#timeOfDay() timeOfDay}
   *    .build();
   * </pre>
   * @return A new Timing_Repeat builder
   */
  public static ImmutableTiming_Repeat.Builder builder() {
    return new ImmutableTiming_Repeat.Builder();
  }

  /**
   * Builds instances of type {@link Timing_Repeat Timing_Repeat}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Timing_Repeat", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DURATION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_FREQUENCY = 0x4L;
    private static final long OPT_BIT_PERIOD_UNIT = 0x8L;
    private static final long OPT_BIT_COUNT = 0x10L;
    private static final long OPT_BIT_DAY_OF_WEEK = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_OFFSET = 0x80L;
    private static final long OPT_BIT_WHEN = 0x100L;
    private static final long OPT_BIT_PERIOD_MAX = 0x200L;
    private static final long OPT_BIT_BOUNDS_RANGE = 0x400L;
    private static final long OPT_BIT_COUNT_MAX = 0x800L;
    private static final long OPT_BIT_BOUNDS_DURATION = 0x1000L;
    private static final long OPT_BIT_BOUNDS_PERIOD = 0x2000L;
    private static final long OPT_BIT_DURATION_MAX = 0x4000L;
    private static final long OPT_BIT_DURATION_UNIT = 0x8000L;
    private static final long OPT_BIT_FREQUENCY_MAX = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_PERIOD = 0x40000L;
    private static final long OPT_BIT_TIME_OF_DAY = 0x80000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.decimal duration;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.positiveInt frequency;
    private @javax.annotation.Nullable com.fhir.Timing_repeatPeriodunit periodUnit;
    private @javax.annotation.Nullable com.fhir.positiveInt count;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> dayOfWeek;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.unsignedInt offset;
    private @javax.annotation.Nullable java.util.List<com.fhir.Timing_repeatWhenItem> when;
    private @javax.annotation.Nullable com.fhir.decimal periodMax;
    private @javax.annotation.Nullable com.fhir.Range boundsRange;
    private @javax.annotation.Nullable com.fhir.positiveInt countMax;
    private @javax.annotation.Nullable com.fhir.Duration boundsDuration;
    private @javax.annotation.Nullable com.fhir.Period boundsPeriod;
    private @javax.annotation.Nullable com.fhir.decimal durationMax;
    private @javax.annotation.Nullable com.fhir.Timing_repeatDurationunit durationUnit;
    private @javax.annotation.Nullable com.fhir.positiveInt frequencyMax;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.decimal period;
    private @javax.annotation.Nullable java.util.List<com.fhir.time> timeOfDay;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(com.fhir.decimal duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = java.util.Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public final Builder duration(java.util.Optional<? extends com.fhir.decimal> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#id() id} to id.
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
     * Initializes the optional value {@link Timing_Repeat#id() id} to id.
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
     * Initializes the optional value {@link Timing_Repeat#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequency(com.fhir.positiveInt frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = java.util.Objects.requireNonNull(frequency, "frequency");
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    public final Builder frequency(java.util.Optional<? extends com.fhir.positiveInt> frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = frequency.orElse(null);
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodUnit() periodUnit} to periodUnit.
     * @param periodUnit The value for periodUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder periodUnit(com.fhir.Timing_repeatPeriodunit periodUnit) {
      checkNotIsSet(periodUnitIsSet(), "periodUnit");
      this.periodUnit = java.util.Objects.requireNonNull(periodUnit, "periodUnit");
      optBits |= OPT_BIT_PERIOD_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodUnit() periodUnit} to periodUnit.
     * @param periodUnit The value for periodUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("periodUnit")
    public final Builder periodUnit(java.util.Optional<? extends com.fhir.Timing_repeatPeriodunit> periodUnit) {
      checkNotIsSet(periodUnitIsSet(), "periodUnit");
      this.periodUnit = periodUnit.orElse(null);
      optBits |= OPT_BIT_PERIOD_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for chained invocation
     */
    public final Builder count(com.fhir.positiveInt count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = java.util.Objects.requireNonNull(count, "count");
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    public final Builder count(java.util.Optional<? extends com.fhir.positiveInt> count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = count.orElse(null);
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#dayOfWeek() dayOfWeek} to dayOfWeek.
     * @param dayOfWeek The value for dayOfWeek
     * @return {@code this} builder for chained invocation
     */
    public final Builder dayOfWeek(java.util.List<com.fhir.code> dayOfWeek) {
      checkNotIsSet(dayOfWeekIsSet(), "dayOfWeek");
      this.dayOfWeek = java.util.Objects.requireNonNull(dayOfWeek, "dayOfWeek");
      optBits |= OPT_BIT_DAY_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#dayOfWeek() dayOfWeek} to dayOfWeek.
     * @param dayOfWeek The value for dayOfWeek
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    public final Builder dayOfWeek(java.util.Optional<? extends java.util.List<com.fhir.code>> dayOfWeek) {
      checkNotIsSet(dayOfWeekIsSet(), "dayOfWeek");
      this.dayOfWeek = dayOfWeek.orElse(null);
      optBits |= OPT_BIT_DAY_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Timing_Repeat#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Timing_Repeat#offset() offset} to offset.
     * @param offset The value for offset
     * @return {@code this} builder for chained invocation
     */
    public final Builder offset(com.fhir.unsignedInt offset) {
      checkNotIsSet(offsetIsSet(), "offset");
      this.offset = java.util.Objects.requireNonNull(offset, "offset");
      optBits |= OPT_BIT_OFFSET;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#offset() offset} to offset.
     * @param offset The value for offset
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    public final Builder offset(java.util.Optional<? extends com.fhir.unsignedInt> offset) {
      checkNotIsSet(offsetIsSet(), "offset");
      this.offset = offset.orElse(null);
      optBits |= OPT_BIT_OFFSET;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for chained invocation
     */
    public final Builder when(java.util.List<com.fhir.Timing_repeatWhenItem> when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = java.util.Objects.requireNonNull(when, "when");
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("when")
    public final Builder when(java.util.Optional<? extends java.util.List<com.fhir.Timing_repeatWhenItem>> when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = when.orElse(null);
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodMax() periodMax} to periodMax.
     * @param periodMax The value for periodMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder periodMax(com.fhir.decimal periodMax) {
      checkNotIsSet(periodMaxIsSet(), "periodMax");
      this.periodMax = java.util.Objects.requireNonNull(periodMax, "periodMax");
      optBits |= OPT_BIT_PERIOD_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodMax() periodMax} to periodMax.
     * @param periodMax The value for periodMax
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("periodMax")
    public final Builder periodMax(java.util.Optional<? extends com.fhir.decimal> periodMax) {
      checkNotIsSet(periodMaxIsSet(), "periodMax");
      this.periodMax = periodMax.orElse(null);
      optBits |= OPT_BIT_PERIOD_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsRange() boundsRange} to boundsRange.
     * @param boundsRange The value for boundsRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder boundsRange(com.fhir.Range boundsRange) {
      checkNotIsSet(boundsRangeIsSet(), "boundsRange");
      this.boundsRange = java.util.Objects.requireNonNull(boundsRange, "boundsRange");
      optBits |= OPT_BIT_BOUNDS_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsRange() boundsRange} to boundsRange.
     * @param boundsRange The value for boundsRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("boundsRange")
    public final Builder boundsRange(java.util.Optional<? extends com.fhir.Range> boundsRange) {
      checkNotIsSet(boundsRangeIsSet(), "boundsRange");
      this.boundsRange = boundsRange.orElse(null);
      optBits |= OPT_BIT_BOUNDS_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#countMax() countMax} to countMax.
     * @param countMax The value for countMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder countMax(com.fhir.positiveInt countMax) {
      checkNotIsSet(countMaxIsSet(), "countMax");
      this.countMax = java.util.Objects.requireNonNull(countMax, "countMax");
      optBits |= OPT_BIT_COUNT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#countMax() countMax} to countMax.
     * @param countMax The value for countMax
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("countMax")
    public final Builder countMax(java.util.Optional<? extends com.fhir.positiveInt> countMax) {
      checkNotIsSet(countMaxIsSet(), "countMax");
      this.countMax = countMax.orElse(null);
      optBits |= OPT_BIT_COUNT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsDuration() boundsDuration} to boundsDuration.
     * @param boundsDuration The value for boundsDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder boundsDuration(com.fhir.Duration boundsDuration) {
      checkNotIsSet(boundsDurationIsSet(), "boundsDuration");
      this.boundsDuration = java.util.Objects.requireNonNull(boundsDuration, "boundsDuration");
      optBits |= OPT_BIT_BOUNDS_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsDuration() boundsDuration} to boundsDuration.
     * @param boundsDuration The value for boundsDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("boundsDuration")
    public final Builder boundsDuration(java.util.Optional<? extends com.fhir.Duration> boundsDuration) {
      checkNotIsSet(boundsDurationIsSet(), "boundsDuration");
      this.boundsDuration = boundsDuration.orElse(null);
      optBits |= OPT_BIT_BOUNDS_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsPeriod() boundsPeriod} to boundsPeriod.
     * @param boundsPeriod The value for boundsPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder boundsPeriod(com.fhir.Period boundsPeriod) {
      checkNotIsSet(boundsPeriodIsSet(), "boundsPeriod");
      this.boundsPeriod = java.util.Objects.requireNonNull(boundsPeriod, "boundsPeriod");
      optBits |= OPT_BIT_BOUNDS_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsPeriod() boundsPeriod} to boundsPeriod.
     * @param boundsPeriod The value for boundsPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("boundsPeriod")
    public final Builder boundsPeriod(java.util.Optional<? extends com.fhir.Period> boundsPeriod) {
      checkNotIsSet(boundsPeriodIsSet(), "boundsPeriod");
      this.boundsPeriod = boundsPeriod.orElse(null);
      optBits |= OPT_BIT_BOUNDS_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#durationMax() durationMax} to durationMax.
     * @param durationMax The value for durationMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder durationMax(com.fhir.decimal durationMax) {
      checkNotIsSet(durationMaxIsSet(), "durationMax");
      this.durationMax = java.util.Objects.requireNonNull(durationMax, "durationMax");
      optBits |= OPT_BIT_DURATION_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#durationMax() durationMax} to durationMax.
     * @param durationMax The value for durationMax
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("durationMax")
    public final Builder durationMax(java.util.Optional<? extends com.fhir.decimal> durationMax) {
      checkNotIsSet(durationMaxIsSet(), "durationMax");
      this.durationMax = durationMax.orElse(null);
      optBits |= OPT_BIT_DURATION_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#durationUnit() durationUnit} to durationUnit.
     * @param durationUnit The value for durationUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder durationUnit(com.fhir.Timing_repeatDurationunit durationUnit) {
      checkNotIsSet(durationUnitIsSet(), "durationUnit");
      this.durationUnit = java.util.Objects.requireNonNull(durationUnit, "durationUnit");
      optBits |= OPT_BIT_DURATION_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#durationUnit() durationUnit} to durationUnit.
     * @param durationUnit The value for durationUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("durationUnit")
    public final Builder durationUnit(java.util.Optional<? extends com.fhir.Timing_repeatDurationunit> durationUnit) {
      checkNotIsSet(durationUnitIsSet(), "durationUnit");
      this.durationUnit = durationUnit.orElse(null);
      optBits |= OPT_BIT_DURATION_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#frequencyMax() frequencyMax} to frequencyMax.
     * @param frequencyMax The value for frequencyMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequencyMax(com.fhir.positiveInt frequencyMax) {
      checkNotIsSet(frequencyMaxIsSet(), "frequencyMax");
      this.frequencyMax = java.util.Objects.requireNonNull(frequencyMax, "frequencyMax");
      optBits |= OPT_BIT_FREQUENCY_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#frequencyMax() frequencyMax} to frequencyMax.
     * @param frequencyMax The value for frequencyMax
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyMax")
    public final Builder frequencyMax(java.util.Optional<? extends com.fhir.positiveInt> frequencyMax) {
      checkNotIsSet(frequencyMaxIsSet(), "frequencyMax");
      this.frequencyMax = frequencyMax.orElse(null);
      optBits |= OPT_BIT_FREQUENCY_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#extension() extension} to extension.
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
     * Initializes the optional value {@link Timing_Repeat#extension() extension} to extension.
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
     * Initializes the optional value {@link Timing_Repeat#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.decimal period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.decimal> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#timeOfDay() timeOfDay} to timeOfDay.
     * @param timeOfDay The value for timeOfDay
     * @return {@code this} builder for chained invocation
     */
    public final Builder timeOfDay(java.util.List<com.fhir.time> timeOfDay) {
      checkNotIsSet(timeOfDayIsSet(), "timeOfDay");
      this.timeOfDay = java.util.Objects.requireNonNull(timeOfDay, "timeOfDay");
      optBits |= OPT_BIT_TIME_OF_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#timeOfDay() timeOfDay} to timeOfDay.
     * @param timeOfDay The value for timeOfDay
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDay")
    public final Builder timeOfDay(java.util.Optional<? extends java.util.List<com.fhir.time>> timeOfDay) {
      checkNotIsSet(timeOfDayIsSet(), "timeOfDay");
      this.timeOfDay = timeOfDay.orElse(null);
      optBits |= OPT_BIT_TIME_OF_DAY;
      return this;
    }

    /**
     * Builds a new {@link Timing_Repeat Timing_Repeat}.
     * @return An immutable instance of Timing_Repeat
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Timing_Repeat build() {
      return new ImmutableTiming_Repeat(
          duration,
          id,
          frequency,
          periodUnit,
          count,
          dayOfWeek,
          modifierExtension,
          offset,
          when,
          periodMax,
          boundsRange,
          countMax,
          boundsDuration,
          boundsPeriod,
          durationMax,
          durationUnit,
          frequencyMax,
          extension,
          period,
          timeOfDay);
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean frequencyIsSet() {
      return (optBits & OPT_BIT_FREQUENCY) != 0;
    }

    private boolean periodUnitIsSet() {
      return (optBits & OPT_BIT_PERIOD_UNIT) != 0;
    }

    private boolean countIsSet() {
      return (optBits & OPT_BIT_COUNT) != 0;
    }

    private boolean dayOfWeekIsSet() {
      return (optBits & OPT_BIT_DAY_OF_WEEK) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean offsetIsSet() {
      return (optBits & OPT_BIT_OFFSET) != 0;
    }

    private boolean whenIsSet() {
      return (optBits & OPT_BIT_WHEN) != 0;
    }

    private boolean periodMaxIsSet() {
      return (optBits & OPT_BIT_PERIOD_MAX) != 0;
    }

    private boolean boundsRangeIsSet() {
      return (optBits & OPT_BIT_BOUNDS_RANGE) != 0;
    }

    private boolean countMaxIsSet() {
      return (optBits & OPT_BIT_COUNT_MAX) != 0;
    }

    private boolean boundsDurationIsSet() {
      return (optBits & OPT_BIT_BOUNDS_DURATION) != 0;
    }

    private boolean boundsPeriodIsSet() {
      return (optBits & OPT_BIT_BOUNDS_PERIOD) != 0;
    }

    private boolean durationMaxIsSet() {
      return (optBits & OPT_BIT_DURATION_MAX) != 0;
    }

    private boolean durationUnitIsSet() {
      return (optBits & OPT_BIT_DURATION_UNIT) != 0;
    }

    private boolean frequencyMaxIsSet() {
      return (optBits & OPT_BIT_FREQUENCY_MAX) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean timeOfDayIsSet() {
      return (optBits & OPT_BIT_TIME_OF_DAY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Timing_Repeat is strict, attribute is already set: ".concat(name));
    }
  }
}
