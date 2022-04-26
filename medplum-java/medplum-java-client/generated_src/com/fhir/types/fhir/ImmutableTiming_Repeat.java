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
 * Immutable implementation of {@link Timing_Repeat}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTiming_Repeat.builder()}.
 */
@Generated(from = "Timing_Repeat", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTiming_Repeat implements Timing_Repeat {
  private final @Nullable List<Extension> extension;
  private final @Nullable PositiveInt frequencyMax;
  private final @Nullable UnsignedInt offset;
  private final @Nullable Period boundsPeriod;
  private final @Nullable PositiveInt count;
  private final @Nullable List<Time> timeOfDay;
  private final @Nullable PositiveInt frequency;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable PositiveInt countMax;
  private final @Nullable Decimal periodMax;
  private final @Nullable Decimal durationMax;
  private final @Nullable Duration boundsDuration;
  private final @Nullable String id;
  private final @Nullable Timing_RepeatDurationunit durationUnit;
  private final @Nullable List<Code> dayOfWeek;
  private final @Nullable Range boundsRange;
  private final @Nullable Timing_RepeatPeriodunit periodUnit;
  private final @Nullable Decimal duration;
  private final @Nullable List<Timing_RepeatWhenItem> when;
  private final @Nullable Decimal period;

  private ImmutableTiming_Repeat(
      @Nullable List<Extension> extension,
      @Nullable PositiveInt frequencyMax,
      @Nullable UnsignedInt offset,
      @Nullable Period boundsPeriod,
      @Nullable PositiveInt count,
      @Nullable List<Time> timeOfDay,
      @Nullable PositiveInt frequency,
      @Nullable List<Extension> modifierExtension,
      @Nullable PositiveInt countMax,
      @Nullable Decimal periodMax,
      @Nullable Decimal durationMax,
      @Nullable Duration boundsDuration,
      @Nullable String id,
      @Nullable Timing_RepeatDurationunit durationUnit,
      @Nullable List<Code> dayOfWeek,
      @Nullable Range boundsRange,
      @Nullable Timing_RepeatPeriodunit periodUnit,
      @Nullable Decimal duration,
      @Nullable List<Timing_RepeatWhenItem> when,
      @Nullable Decimal period) {
    this.extension = extension;
    this.frequencyMax = frequencyMax;
    this.offset = offset;
    this.boundsPeriod = boundsPeriod;
    this.count = count;
    this.timeOfDay = timeOfDay;
    this.frequency = frequency;
    this.modifierExtension = modifierExtension;
    this.countMax = countMax;
    this.periodMax = periodMax;
    this.durationMax = durationMax;
    this.boundsDuration = boundsDuration;
    this.id = id;
    this.durationUnit = durationUnit;
    this.dayOfWeek = dayOfWeek;
    this.boundsRange = boundsRange;
    this.periodUnit = periodUnit;
    this.duration = duration;
    this.when = when;
    this.period = period;
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
   * @return The value of the {@code frequencyMax} attribute
   */
  @JsonProperty("frequencyMax")
  @Override
  public Optional<PositiveInt> frequencyMax() {
    return Optional.ofNullable(frequencyMax);
  }

  /**
   * @return The value of the {@code offset} attribute
   */
  @JsonProperty("offset")
  @Override
  public Optional<UnsignedInt> offset() {
    return Optional.ofNullable(offset);
  }

  /**
   * @return The value of the {@code boundsPeriod} attribute
   */
  @JsonProperty("boundsPeriod")
  @Override
  public Optional<Period> boundsPeriod() {
    return Optional.ofNullable(boundsPeriod);
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public Optional<PositiveInt> count() {
    return Optional.ofNullable(count);
  }

  /**
   * @return The value of the {@code timeOfDay} attribute
   */
  @JsonProperty("timeOfDay")
  @Override
  public Optional<List<Time>> timeOfDay() {
    return Optional.ofNullable(timeOfDay);
  }

  /**
   * @return The value of the {@code frequency} attribute
   */
  @JsonProperty("frequency")
  @Override
  public Optional<PositiveInt> frequency() {
    return Optional.ofNullable(frequency);
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
   * @return The value of the {@code countMax} attribute
   */
  @JsonProperty("countMax")
  @Override
  public Optional<PositiveInt> countMax() {
    return Optional.ofNullable(countMax);
  }

  /**
   * @return The value of the {@code periodMax} attribute
   */
  @JsonProperty("periodMax")
  @Override
  public Optional<Decimal> periodMax() {
    return Optional.ofNullable(periodMax);
  }

  /**
   * @return The value of the {@code durationMax} attribute
   */
  @JsonProperty("durationMax")
  @Override
  public Optional<Decimal> durationMax() {
    return Optional.ofNullable(durationMax);
  }

  /**
   * @return The value of the {@code boundsDuration} attribute
   */
  @JsonProperty("boundsDuration")
  @Override
  public Optional<Duration> boundsDuration() {
    return Optional.ofNullable(boundsDuration);
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
   * @return The value of the {@code durationUnit} attribute
   */
  @JsonProperty("durationUnit")
  @Override
  public Optional<Timing_RepeatDurationunit> durationUnit() {
    return Optional.ofNullable(durationUnit);
  }

  /**
   * @return The value of the {@code dayOfWeek} attribute
   */
  @JsonProperty("dayOfWeek")
  @Override
  public Optional<List<Code>> dayOfWeek() {
    return Optional.ofNullable(dayOfWeek);
  }

  /**
   * @return The value of the {@code boundsRange} attribute
   */
  @JsonProperty("boundsRange")
  @Override
  public Optional<Range> boundsRange() {
    return Optional.ofNullable(boundsRange);
  }

  /**
   * @return The value of the {@code periodUnit} attribute
   */
  @JsonProperty("periodUnit")
  @Override
  public Optional<Timing_RepeatPeriodunit> periodUnit() {
    return Optional.ofNullable(periodUnit);
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @JsonProperty("duration")
  @Override
  public Optional<Decimal> duration() {
    return Optional.ofNullable(duration);
  }

  /**
   * @return The value of the {@code when} attribute
   */
  @JsonProperty("when")
  @Override
  public Optional<List<Timing_RepeatWhenItem>> when() {
    return Optional.ofNullable(when);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Decimal> period() {
    return Optional.ofNullable(period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTiming_Repeat(
        newValue,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTiming_Repeat(
        value,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#frequencyMax() frequencyMax} attribute.
   * @param value The value for frequencyMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withFrequencyMax(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "frequencyMax");
    if (this.frequencyMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        newValue,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#frequencyMax() frequencyMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequencyMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withFrequencyMax(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.frequencyMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        value,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#offset() offset} attribute.
   * @param value The value for offset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withOffset(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "offset");
    if (this.offset == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        newValue,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#offset() offset} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offset
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withOffset(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.offset == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        value,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#boundsPeriod() boundsPeriod} attribute.
   * @param value The value for boundsPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withBoundsPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "boundsPeriod");
    if (this.boundsPeriod == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        newValue,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#boundsPeriod() boundsPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for boundsPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withBoundsPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.boundsPeriod == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        value,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#count() count} attribute.
   * @param value The value for count
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withCount(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "count");
    if (this.count == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        newValue,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#count() count} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for count
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withCount(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.count == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        value,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#timeOfDay() timeOfDay} attribute.
   * @param value The value for timeOfDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withTimeOfDay(List<Time> value) {
    @Nullable List<Time> newValue = Objects.requireNonNull(value, "timeOfDay");
    if (this.timeOfDay == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        newValue,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#timeOfDay() timeOfDay} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timeOfDay
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withTimeOfDay(Optional<? extends List<Time>> optional) {
    @Nullable List<Time> value = optional.orElse(null);
    if (this.timeOfDay == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        value,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#frequency() frequency} attribute.
   * @param value The value for frequency
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withFrequency(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "frequency");
    if (this.frequency == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        newValue,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#frequency() frequency} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for frequency
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withFrequency(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.frequency == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        value,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        newValue,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        value,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#countMax() countMax} attribute.
   * @param value The value for countMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withCountMax(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "countMax");
    if (this.countMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        newValue,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#countMax() countMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for countMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withCountMax(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.countMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        value,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#periodMax() periodMax} attribute.
   * @param value The value for periodMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withPeriodMax(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "periodMax");
    if (this.periodMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        newValue,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#periodMax() periodMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for periodMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withPeriodMax(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.periodMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        value,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#durationMax() durationMax} attribute.
   * @param value The value for durationMax
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDurationMax(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "durationMax");
    if (this.durationMax == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        newValue,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#durationMax() durationMax} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for durationMax
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDurationMax(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.durationMax == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        value,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#boundsDuration() boundsDuration} attribute.
   * @param value The value for boundsDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withBoundsDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "boundsDuration");
    if (this.boundsDuration == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        newValue,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#boundsDuration() boundsDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for boundsDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withBoundsDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.boundsDuration == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        value,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        newValue,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        value,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#durationUnit() durationUnit} attribute.
   * @param value The value for durationUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDurationUnit(Timing_RepeatDurationunit value) {
    @Nullable Timing_RepeatDurationunit newValue = Objects.requireNonNull(value, "durationUnit");
    if (this.durationUnit == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        newValue,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#durationUnit() durationUnit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for durationUnit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDurationUnit(Optional<? extends Timing_RepeatDurationunit> optional) {
    @Nullable Timing_RepeatDurationunit value = optional.orElse(null);
    if (this.durationUnit == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        value,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#dayOfWeek() dayOfWeek} attribute.
   * @param value The value for dayOfWeek
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDayOfWeek(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "dayOfWeek");
    if (this.dayOfWeek == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        newValue,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#dayOfWeek() dayOfWeek} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dayOfWeek
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDayOfWeek(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.dayOfWeek == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        value,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#boundsRange() boundsRange} attribute.
   * @param value The value for boundsRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withBoundsRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "boundsRange");
    if (this.boundsRange == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        newValue,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#boundsRange() boundsRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for boundsRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withBoundsRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.boundsRange == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        value,
        this.periodUnit,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#periodUnit() periodUnit} attribute.
   * @param value The value for periodUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withPeriodUnit(Timing_RepeatPeriodunit value) {
    @Nullable Timing_RepeatPeriodunit newValue = Objects.requireNonNull(value, "periodUnit");
    if (this.periodUnit == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        newValue,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#periodUnit() periodUnit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for periodUnit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withPeriodUnit(Optional<? extends Timing_RepeatPeriodunit> optional) {
    @Nullable Timing_RepeatPeriodunit value = optional.orElse(null);
    if (this.periodUnit == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        value,
        this.duration,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withDuration(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        newValue,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withDuration(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        value,
        this.when,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#when() when} attribute.
   * @param value The value for when
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withWhen(List<Timing_RepeatWhenItem> value) {
    @Nullable List<Timing_RepeatWhenItem> newValue = Objects.requireNonNull(value, "when");
    if (this.when == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#when() when} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for when
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withWhen(Optional<? extends List<Timing_RepeatWhenItem>> optional) {
    @Nullable List<Timing_RepeatWhenItem> value = optional.orElse(null);
    if (this.when == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        value,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing_Repeat#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming_Repeat withPeriod(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing_Repeat#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming_Repeat withPeriod(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableTiming_Repeat(
        this.extension,
        this.frequencyMax,
        this.offset,
        this.boundsPeriod,
        this.count,
        this.timeOfDay,
        this.frequency,
        this.modifierExtension,
        this.countMax,
        this.periodMax,
        this.durationMax,
        this.boundsDuration,
        this.id,
        this.durationUnit,
        this.dayOfWeek,
        this.boundsRange,
        this.periodUnit,
        this.duration,
        this.when,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTiming_Repeat} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTiming_Repeat
        && equalTo((ImmutableTiming_Repeat) another);
  }

  private boolean equalTo(ImmutableTiming_Repeat another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(frequencyMax, another.frequencyMax)
        && Objects.equals(offset, another.offset)
        && Objects.equals(boundsPeriod, another.boundsPeriod)
        && Objects.equals(count, another.count)
        && Objects.equals(timeOfDay, another.timeOfDay)
        && Objects.equals(frequency, another.frequency)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(countMax, another.countMax)
        && Objects.equals(periodMax, another.periodMax)
        && Objects.equals(durationMax, another.durationMax)
        && Objects.equals(boundsDuration, another.boundsDuration)
        && Objects.equals(id, another.id)
        && Objects.equals(durationUnit, another.durationUnit)
        && Objects.equals(dayOfWeek, another.dayOfWeek)
        && Objects.equals(boundsRange, another.boundsRange)
        && Objects.equals(periodUnit, another.periodUnit)
        && Objects.equals(duration, another.duration)
        && Objects.equals(when, another.when)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code frequencyMax}, {@code offset}, {@code boundsPeriod}, {@code count}, {@code timeOfDay}, {@code frequency}, {@code modifierExtension}, {@code countMax}, {@code periodMax}, {@code durationMax}, {@code boundsDuration}, {@code id}, {@code durationUnit}, {@code dayOfWeek}, {@code boundsRange}, {@code periodUnit}, {@code duration}, {@code when}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(frequencyMax);
    h += (h << 5) + Objects.hashCode(offset);
    h += (h << 5) + Objects.hashCode(boundsPeriod);
    h += (h << 5) + Objects.hashCode(count);
    h += (h << 5) + Objects.hashCode(timeOfDay);
    h += (h << 5) + Objects.hashCode(frequency);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(countMax);
    h += (h << 5) + Objects.hashCode(periodMax);
    h += (h << 5) + Objects.hashCode(durationMax);
    h += (h << 5) + Objects.hashCode(boundsDuration);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(durationUnit);
    h += (h << 5) + Objects.hashCode(dayOfWeek);
    h += (h << 5) + Objects.hashCode(boundsRange);
    h += (h << 5) + Objects.hashCode(periodUnit);
    h += (h << 5) + Objects.hashCode(duration);
    h += (h << 5) + Objects.hashCode(when);
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code Timing_Repeat} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Timing_Repeat{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (frequencyMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("frequencyMax=").append(frequencyMax);
    }
    if (offset != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("offset=").append(offset);
    }
    if (boundsPeriod != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("boundsPeriod=").append(boundsPeriod);
    }
    if (count != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("count=").append(count);
    }
    if (timeOfDay != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("timeOfDay=").append(timeOfDay);
    }
    if (frequency != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("frequency=").append(frequency);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (countMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("countMax=").append(countMax);
    }
    if (periodMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("periodMax=").append(periodMax);
    }
    if (durationMax != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("durationMax=").append(durationMax);
    }
    if (boundsDuration != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("boundsDuration=").append(boundsDuration);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (durationUnit != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("durationUnit=").append(durationUnit);
    }
    if (dayOfWeek != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("dayOfWeek=").append(dayOfWeek);
    }
    if (boundsRange != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("boundsRange=").append(boundsRange);
    }
    if (periodUnit != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("periodUnit=").append(periodUnit);
    }
    if (duration != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (when != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("when=").append(when);
    }
    if (period != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Timing_Repeat", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Timing_Repeat {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<PositiveInt> frequencyMax = Optional.empty();
    boolean frequencyMaxIsSet;
    @Nullable Optional<UnsignedInt> offset = Optional.empty();
    boolean offsetIsSet;
    @Nullable Optional<Period> boundsPeriod = Optional.empty();
    boolean boundsPeriodIsSet;
    @Nullable Optional<PositiveInt> count = Optional.empty();
    boolean countIsSet;
    @Nullable Optional<List<Time>> timeOfDay = Optional.empty();
    boolean timeOfDayIsSet;
    @Nullable Optional<PositiveInt> frequency = Optional.empty();
    boolean frequencyIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<PositiveInt> countMax = Optional.empty();
    boolean countMaxIsSet;
    @Nullable Optional<Decimal> periodMax = Optional.empty();
    boolean periodMaxIsSet;
    @Nullable Optional<Decimal> durationMax = Optional.empty();
    boolean durationMaxIsSet;
    @Nullable Optional<Duration> boundsDuration = Optional.empty();
    boolean boundsDurationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Timing_RepeatDurationunit> durationUnit = Optional.empty();
    boolean durationUnitIsSet;
    @Nullable Optional<List<Code>> dayOfWeek = Optional.empty();
    boolean dayOfWeekIsSet;
    @Nullable Optional<Range> boundsRange = Optional.empty();
    boolean boundsRangeIsSet;
    @Nullable Optional<Timing_RepeatPeriodunit> periodUnit = Optional.empty();
    boolean periodUnitIsSet;
    @Nullable Optional<Decimal> duration = Optional.empty();
    boolean durationIsSet;
    @Nullable Optional<List<Timing_RepeatWhenItem>> when = Optional.empty();
    boolean whenIsSet;
    @Nullable Optional<Decimal> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("frequencyMax")
    public void setFrequencyMax(Optional<PositiveInt> frequencyMax) {
      this.frequencyMax = frequencyMax;
      this.frequencyMaxIsSet = true;
    }
    @JsonProperty("offset")
    public void setOffset(Optional<UnsignedInt> offset) {
      this.offset = offset;
      this.offsetIsSet = true;
    }
    @JsonProperty("boundsPeriod")
    public void setBoundsPeriod(Optional<Period> boundsPeriod) {
      this.boundsPeriod = boundsPeriod;
      this.boundsPeriodIsSet = true;
    }
    @JsonProperty("count")
    public void setCount(Optional<PositiveInt> count) {
      this.count = count;
      this.countIsSet = true;
    }
    @JsonProperty("timeOfDay")
    public void setTimeOfDay(Optional<List<Time>> timeOfDay) {
      this.timeOfDay = timeOfDay;
      this.timeOfDayIsSet = true;
    }
    @JsonProperty("frequency")
    public void setFrequency(Optional<PositiveInt> frequency) {
      this.frequency = frequency;
      this.frequencyIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("countMax")
    public void setCountMax(Optional<PositiveInt> countMax) {
      this.countMax = countMax;
      this.countMaxIsSet = true;
    }
    @JsonProperty("periodMax")
    public void setPeriodMax(Optional<Decimal> periodMax) {
      this.periodMax = periodMax;
      this.periodMaxIsSet = true;
    }
    @JsonProperty("durationMax")
    public void setDurationMax(Optional<Decimal> durationMax) {
      this.durationMax = durationMax;
      this.durationMaxIsSet = true;
    }
    @JsonProperty("boundsDuration")
    public void setBoundsDuration(Optional<Duration> boundsDuration) {
      this.boundsDuration = boundsDuration;
      this.boundsDurationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("durationUnit")
    public void setDurationUnit(Optional<Timing_RepeatDurationunit> durationUnit) {
      this.durationUnit = durationUnit;
      this.durationUnitIsSet = true;
    }
    @JsonProperty("dayOfWeek")
    public void setDayOfWeek(Optional<List<Code>> dayOfWeek) {
      this.dayOfWeek = dayOfWeek;
      this.dayOfWeekIsSet = true;
    }
    @JsonProperty("boundsRange")
    public void setBoundsRange(Optional<Range> boundsRange) {
      this.boundsRange = boundsRange;
      this.boundsRangeIsSet = true;
    }
    @JsonProperty("periodUnit")
    public void setPeriodUnit(Optional<Timing_RepeatPeriodunit> periodUnit) {
      this.periodUnit = periodUnit;
      this.periodUnitIsSet = true;
    }
    @JsonProperty("duration")
    public void setDuration(Optional<Decimal> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @JsonProperty("when")
    public void setWhen(Optional<List<Timing_RepeatWhenItem>> when) {
      this.when = when;
      this.whenIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Decimal> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> frequencyMax() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> offset() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> boundsPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> count() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Time>> timeOfDay() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> frequency() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> countMax() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> periodMax() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> durationMax() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> boundsDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing_RepeatDurationunit> durationUnit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> dayOfWeek() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> boundsRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing_RepeatPeriodunit> periodUnit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> duration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Timing_RepeatWhenItem>> when() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> period() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTiming_Repeat fromJson(Json json) {
    ImmutableTiming_Repeat.Builder builder = ImmutableTiming_Repeat.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.frequencyMaxIsSet) {
      builder.frequencyMax(json.frequencyMax);
    }
    if (json.offsetIsSet) {
      builder.offset(json.offset);
    }
    if (json.boundsPeriodIsSet) {
      builder.boundsPeriod(json.boundsPeriod);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    if (json.timeOfDayIsSet) {
      builder.timeOfDay(json.timeOfDay);
    }
    if (json.frequencyIsSet) {
      builder.frequency(json.frequency);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.countMaxIsSet) {
      builder.countMax(json.countMax);
    }
    if (json.periodMaxIsSet) {
      builder.periodMax(json.periodMax);
    }
    if (json.durationMaxIsSet) {
      builder.durationMax(json.durationMax);
    }
    if (json.boundsDurationIsSet) {
      builder.boundsDuration(json.boundsDuration);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.durationUnitIsSet) {
      builder.durationUnit(json.durationUnit);
    }
    if (json.dayOfWeekIsSet) {
      builder.dayOfWeek(json.dayOfWeek);
    }
    if (json.boundsRangeIsSet) {
      builder.boundsRange(json.boundsRange);
    }
    if (json.periodUnitIsSet) {
      builder.periodUnit(json.periodUnit);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.whenIsSet) {
      builder.when(json.when);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
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
        .extension(instance.extension())
        .frequencyMax(instance.frequencyMax())
        .offset(instance.offset())
        .boundsPeriod(instance.boundsPeriod())
        .count(instance.count())
        .timeOfDay(instance.timeOfDay())
        .frequency(instance.frequency())
        .modifierExtension(instance.modifierExtension())
        .countMax(instance.countMax())
        .periodMax(instance.periodMax())
        .durationMax(instance.durationMax())
        .boundsDuration(instance.boundsDuration())
        .id(instance.id())
        .durationUnit(instance.durationUnit())
        .dayOfWeek(instance.dayOfWeek())
        .boundsRange(instance.boundsRange())
        .periodUnit(instance.periodUnit())
        .duration(instance.duration())
        .when(instance.when())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link Timing_Repeat Timing_Repeat}.
   * <pre>
   * ImmutableTiming_Repeat.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Timing_Repeat#extension() extension}
   *    .frequencyMax(com.fhir.types.fhir.PositiveInt) // optional {@link Timing_Repeat#frequencyMax() frequencyMax}
   *    .offset(com.fhir.types.fhir.UnsignedInt) // optional {@link Timing_Repeat#offset() offset}
   *    .boundsPeriod(com.fhir.types.fhir.Period) // optional {@link Timing_Repeat#boundsPeriod() boundsPeriod}
   *    .count(com.fhir.types.fhir.PositiveInt) // optional {@link Timing_Repeat#count() count}
   *    .timeOfDay(List&amp;lt;com.fhir.types.fhir.Time&amp;gt;) // optional {@link Timing_Repeat#timeOfDay() timeOfDay}
   *    .frequency(com.fhir.types.fhir.PositiveInt) // optional {@link Timing_Repeat#frequency() frequency}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Timing_Repeat#modifierExtension() modifierExtension}
   *    .countMax(com.fhir.types.fhir.PositiveInt) // optional {@link Timing_Repeat#countMax() countMax}
   *    .periodMax(com.fhir.types.fhir.Decimal) // optional {@link Timing_Repeat#periodMax() periodMax}
   *    .durationMax(com.fhir.types.fhir.Decimal) // optional {@link Timing_Repeat#durationMax() durationMax}
   *    .boundsDuration(com.fhir.types.fhir.Duration) // optional {@link Timing_Repeat#boundsDuration() boundsDuration}
   *    .id(String) // optional {@link Timing_Repeat#id() id}
   *    .durationUnit(Timing_RepeatDurationunit) // optional {@link Timing_Repeat#durationUnit() durationUnit}
   *    .dayOfWeek(List&amp;lt;com.fhir.types.fhir.Code&amp;gt;) // optional {@link Timing_Repeat#dayOfWeek() dayOfWeek}
   *    .boundsRange(com.fhir.types.fhir.Range) // optional {@link Timing_Repeat#boundsRange() boundsRange}
   *    .periodUnit(Timing_RepeatPeriodunit) // optional {@link Timing_Repeat#periodUnit() periodUnit}
   *    .duration(com.fhir.types.fhir.Decimal) // optional {@link Timing_Repeat#duration() duration}
   *    .when(List&amp;lt;Timing_RepeatWhenItem&amp;gt;) // optional {@link Timing_Repeat#when() when}
   *    .period(com.fhir.types.fhir.Decimal) // optional {@link Timing_Repeat#period() period}
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
  @Generated(from = "Timing_Repeat", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_FREQUENCY_MAX = 0x2L;
    private static final long OPT_BIT_OFFSET = 0x4L;
    private static final long OPT_BIT_BOUNDS_PERIOD = 0x8L;
    private static final long OPT_BIT_COUNT = 0x10L;
    private static final long OPT_BIT_TIME_OF_DAY = 0x20L;
    private static final long OPT_BIT_FREQUENCY = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_COUNT_MAX = 0x100L;
    private static final long OPT_BIT_PERIOD_MAX = 0x200L;
    private static final long OPT_BIT_DURATION_MAX = 0x400L;
    private static final long OPT_BIT_BOUNDS_DURATION = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_DURATION_UNIT = 0x2000L;
    private static final long OPT_BIT_DAY_OF_WEEK = 0x4000L;
    private static final long OPT_BIT_BOUNDS_RANGE = 0x8000L;
    private static final long OPT_BIT_PERIOD_UNIT = 0x10000L;
    private static final long OPT_BIT_DURATION = 0x20000L;
    private static final long OPT_BIT_WHEN = 0x40000L;
    private static final long OPT_BIT_PERIOD = 0x80000L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable PositiveInt frequencyMax;
    private @Nullable UnsignedInt offset;
    private @Nullable Period boundsPeriod;
    private @Nullable PositiveInt count;
    private @Nullable List<Time> timeOfDay;
    private @Nullable PositiveInt frequency;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable PositiveInt countMax;
    private @Nullable Decimal periodMax;
    private @Nullable Decimal durationMax;
    private @Nullable Duration boundsDuration;
    private @Nullable String id;
    private @Nullable Timing_RepeatDurationunit durationUnit;
    private @Nullable List<Code> dayOfWeek;
    private @Nullable Range boundsRange;
    private @Nullable Timing_RepeatPeriodunit periodUnit;
    private @Nullable Decimal duration;
    private @Nullable List<Timing_RepeatWhenItem> when;
    private @Nullable Decimal period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#extension() extension} to extension.
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
     * Initializes the optional value {@link Timing_Repeat#extension() extension} to extension.
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
     * Initializes the optional value {@link Timing_Repeat#frequencyMax() frequencyMax} to frequencyMax.
     * @param frequencyMax The value for frequencyMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequencyMax(PositiveInt frequencyMax) {
      checkNotIsSet(frequencyMaxIsSet(), "frequencyMax");
      this.frequencyMax = Objects.requireNonNull(frequencyMax, "frequencyMax");
      optBits |= OPT_BIT_FREQUENCY_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#frequencyMax() frequencyMax} to frequencyMax.
     * @param frequencyMax The value for frequencyMax
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequencyMax")
    public final Builder frequencyMax(Optional<? extends PositiveInt> frequencyMax) {
      checkNotIsSet(frequencyMaxIsSet(), "frequencyMax");
      this.frequencyMax = frequencyMax.orElse(null);
      optBits |= OPT_BIT_FREQUENCY_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#offset() offset} to offset.
     * @param offset The value for offset
     * @return {@code this} builder for chained invocation
     */
    public final Builder offset(UnsignedInt offset) {
      checkNotIsSet(offsetIsSet(), "offset");
      this.offset = Objects.requireNonNull(offset, "offset");
      optBits |= OPT_BIT_OFFSET;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#offset() offset} to offset.
     * @param offset The value for offset
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("offset")
    public final Builder offset(Optional<? extends UnsignedInt> offset) {
      checkNotIsSet(offsetIsSet(), "offset");
      this.offset = offset.orElse(null);
      optBits |= OPT_BIT_OFFSET;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsPeriod() boundsPeriod} to boundsPeriod.
     * @param boundsPeriod The value for boundsPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder boundsPeriod(Period boundsPeriod) {
      checkNotIsSet(boundsPeriodIsSet(), "boundsPeriod");
      this.boundsPeriod = Objects.requireNonNull(boundsPeriod, "boundsPeriod");
      optBits |= OPT_BIT_BOUNDS_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsPeriod() boundsPeriod} to boundsPeriod.
     * @param boundsPeriod The value for boundsPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("boundsPeriod")
    public final Builder boundsPeriod(Optional<? extends Period> boundsPeriod) {
      checkNotIsSet(boundsPeriodIsSet(), "boundsPeriod");
      this.boundsPeriod = boundsPeriod.orElse(null);
      optBits |= OPT_BIT_BOUNDS_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for chained invocation
     */
    public final Builder count(PositiveInt count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = Objects.requireNonNull(count, "count");
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder count(Optional<? extends PositiveInt> count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = count.orElse(null);
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#timeOfDay() timeOfDay} to timeOfDay.
     * @param timeOfDay The value for timeOfDay
     * @return {@code this} builder for chained invocation
     */
    public final Builder timeOfDay(List<Time> timeOfDay) {
      checkNotIsSet(timeOfDayIsSet(), "timeOfDay");
      this.timeOfDay = Objects.requireNonNull(timeOfDay, "timeOfDay");
      optBits |= OPT_BIT_TIME_OF_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#timeOfDay() timeOfDay} to timeOfDay.
     * @param timeOfDay The value for timeOfDay
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timeOfDay")
    public final Builder timeOfDay(Optional<? extends List<Time>> timeOfDay) {
      checkNotIsSet(timeOfDayIsSet(), "timeOfDay");
      this.timeOfDay = timeOfDay.orElse(null);
      optBits |= OPT_BIT_TIME_OF_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for chained invocation
     */
    public final Builder frequency(PositiveInt frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = Objects.requireNonNull(frequency, "frequency");
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#frequency() frequency} to frequency.
     * @param frequency The value for frequency
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("frequency")
    public final Builder frequency(Optional<? extends PositiveInt> frequency) {
      checkNotIsSet(frequencyIsSet(), "frequency");
      this.frequency = frequency.orElse(null);
      optBits |= OPT_BIT_FREQUENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Timing_Repeat#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Timing_Repeat#countMax() countMax} to countMax.
     * @param countMax The value for countMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder countMax(PositiveInt countMax) {
      checkNotIsSet(countMaxIsSet(), "countMax");
      this.countMax = Objects.requireNonNull(countMax, "countMax");
      optBits |= OPT_BIT_COUNT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#countMax() countMax} to countMax.
     * @param countMax The value for countMax
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("countMax")
    public final Builder countMax(Optional<? extends PositiveInt> countMax) {
      checkNotIsSet(countMaxIsSet(), "countMax");
      this.countMax = countMax.orElse(null);
      optBits |= OPT_BIT_COUNT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodMax() periodMax} to periodMax.
     * @param periodMax The value for periodMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder periodMax(Decimal periodMax) {
      checkNotIsSet(periodMaxIsSet(), "periodMax");
      this.periodMax = Objects.requireNonNull(periodMax, "periodMax");
      optBits |= OPT_BIT_PERIOD_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodMax() periodMax} to periodMax.
     * @param periodMax The value for periodMax
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("periodMax")
    public final Builder periodMax(Optional<? extends Decimal> periodMax) {
      checkNotIsSet(periodMaxIsSet(), "periodMax");
      this.periodMax = periodMax.orElse(null);
      optBits |= OPT_BIT_PERIOD_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#durationMax() durationMax} to durationMax.
     * @param durationMax The value for durationMax
     * @return {@code this} builder for chained invocation
     */
    public final Builder durationMax(Decimal durationMax) {
      checkNotIsSet(durationMaxIsSet(), "durationMax");
      this.durationMax = Objects.requireNonNull(durationMax, "durationMax");
      optBits |= OPT_BIT_DURATION_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#durationMax() durationMax} to durationMax.
     * @param durationMax The value for durationMax
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("durationMax")
    public final Builder durationMax(Optional<? extends Decimal> durationMax) {
      checkNotIsSet(durationMaxIsSet(), "durationMax");
      this.durationMax = durationMax.orElse(null);
      optBits |= OPT_BIT_DURATION_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsDuration() boundsDuration} to boundsDuration.
     * @param boundsDuration The value for boundsDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder boundsDuration(Duration boundsDuration) {
      checkNotIsSet(boundsDurationIsSet(), "boundsDuration");
      this.boundsDuration = Objects.requireNonNull(boundsDuration, "boundsDuration");
      optBits |= OPT_BIT_BOUNDS_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsDuration() boundsDuration} to boundsDuration.
     * @param boundsDuration The value for boundsDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("boundsDuration")
    public final Builder boundsDuration(Optional<? extends Duration> boundsDuration) {
      checkNotIsSet(boundsDurationIsSet(), "boundsDuration");
      this.boundsDuration = boundsDuration.orElse(null);
      optBits |= OPT_BIT_BOUNDS_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#id() id} to id.
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
     * Initializes the optional value {@link Timing_Repeat#id() id} to id.
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
     * Initializes the optional value {@link Timing_Repeat#durationUnit() durationUnit} to durationUnit.
     * @param durationUnit The value for durationUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder durationUnit(Timing_RepeatDurationunit durationUnit) {
      checkNotIsSet(durationUnitIsSet(), "durationUnit");
      this.durationUnit = Objects.requireNonNull(durationUnit, "durationUnit");
      optBits |= OPT_BIT_DURATION_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#durationUnit() durationUnit} to durationUnit.
     * @param durationUnit The value for durationUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("durationUnit")
    public final Builder durationUnit(Optional<? extends Timing_RepeatDurationunit> durationUnit) {
      checkNotIsSet(durationUnitIsSet(), "durationUnit");
      this.durationUnit = durationUnit.orElse(null);
      optBits |= OPT_BIT_DURATION_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#dayOfWeek() dayOfWeek} to dayOfWeek.
     * @param dayOfWeek The value for dayOfWeek
     * @return {@code this} builder for chained invocation
     */
    public final Builder dayOfWeek(List<Code> dayOfWeek) {
      checkNotIsSet(dayOfWeekIsSet(), "dayOfWeek");
      this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "dayOfWeek");
      optBits |= OPT_BIT_DAY_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#dayOfWeek() dayOfWeek} to dayOfWeek.
     * @param dayOfWeek The value for dayOfWeek
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dayOfWeek")
    public final Builder dayOfWeek(Optional<? extends List<Code>> dayOfWeek) {
      checkNotIsSet(dayOfWeekIsSet(), "dayOfWeek");
      this.dayOfWeek = dayOfWeek.orElse(null);
      optBits |= OPT_BIT_DAY_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsRange() boundsRange} to boundsRange.
     * @param boundsRange The value for boundsRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder boundsRange(Range boundsRange) {
      checkNotIsSet(boundsRangeIsSet(), "boundsRange");
      this.boundsRange = Objects.requireNonNull(boundsRange, "boundsRange");
      optBits |= OPT_BIT_BOUNDS_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#boundsRange() boundsRange} to boundsRange.
     * @param boundsRange The value for boundsRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("boundsRange")
    public final Builder boundsRange(Optional<? extends Range> boundsRange) {
      checkNotIsSet(boundsRangeIsSet(), "boundsRange");
      this.boundsRange = boundsRange.orElse(null);
      optBits |= OPT_BIT_BOUNDS_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodUnit() periodUnit} to periodUnit.
     * @param periodUnit The value for periodUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder periodUnit(Timing_RepeatPeriodunit periodUnit) {
      checkNotIsSet(periodUnitIsSet(), "periodUnit");
      this.periodUnit = Objects.requireNonNull(periodUnit, "periodUnit");
      optBits |= OPT_BIT_PERIOD_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#periodUnit() periodUnit} to periodUnit.
     * @param periodUnit The value for periodUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("periodUnit")
    public final Builder periodUnit(Optional<? extends Timing_RepeatPeriodunit> periodUnit) {
      checkNotIsSet(periodUnitIsSet(), "periodUnit");
      this.periodUnit = periodUnit.orElse(null);
      optBits |= OPT_BIT_PERIOD_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(Decimal duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("duration")
    public final Builder duration(Optional<? extends Decimal> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for chained invocation
     */
    public final Builder when(List<Timing_RepeatWhenItem> when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = Objects.requireNonNull(when, "when");
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("when")
    public final Builder when(Optional<? extends List<Timing_RepeatWhenItem>> when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = when.orElse(null);
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Decimal period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing_Repeat#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Decimal> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Builds a new {@link Timing_Repeat Timing_Repeat}.
     * @return An immutable instance of Timing_Repeat
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Timing_Repeat build() {
      return new ImmutableTiming_Repeat(
          extension,
          frequencyMax,
          offset,
          boundsPeriod,
          count,
          timeOfDay,
          frequency,
          modifierExtension,
          countMax,
          periodMax,
          durationMax,
          boundsDuration,
          id,
          durationUnit,
          dayOfWeek,
          boundsRange,
          periodUnit,
          duration,
          when,
          period);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean frequencyMaxIsSet() {
      return (optBits & OPT_BIT_FREQUENCY_MAX) != 0;
    }

    private boolean offsetIsSet() {
      return (optBits & OPT_BIT_OFFSET) != 0;
    }

    private boolean boundsPeriodIsSet() {
      return (optBits & OPT_BIT_BOUNDS_PERIOD) != 0;
    }

    private boolean countIsSet() {
      return (optBits & OPT_BIT_COUNT) != 0;
    }

    private boolean timeOfDayIsSet() {
      return (optBits & OPT_BIT_TIME_OF_DAY) != 0;
    }

    private boolean frequencyIsSet() {
      return (optBits & OPT_BIT_FREQUENCY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean countMaxIsSet() {
      return (optBits & OPT_BIT_COUNT_MAX) != 0;
    }

    private boolean periodMaxIsSet() {
      return (optBits & OPT_BIT_PERIOD_MAX) != 0;
    }

    private boolean durationMaxIsSet() {
      return (optBits & OPT_BIT_DURATION_MAX) != 0;
    }

    private boolean boundsDurationIsSet() {
      return (optBits & OPT_BIT_BOUNDS_DURATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean durationUnitIsSet() {
      return (optBits & OPT_BIT_DURATION_UNIT) != 0;
    }

    private boolean dayOfWeekIsSet() {
      return (optBits & OPT_BIT_DAY_OF_WEEK) != 0;
    }

    private boolean boundsRangeIsSet() {
      return (optBits & OPT_BIT_BOUNDS_RANGE) != 0;
    }

    private boolean periodUnitIsSet() {
      return (optBits & OPT_BIT_PERIOD_UNIT) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean whenIsSet() {
      return (optBits & OPT_BIT_WHEN) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Timing_Repeat is strict, attribute is already set: ".concat(name));
    }
  }
}
