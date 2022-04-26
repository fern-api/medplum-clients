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
 * Immutable implementation of {@link HealthcareService_AvailableTime}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHealthcareService_AvailableTime.builder()}.
 */
@Generated(from = "HealthcareService_AvailableTime", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableHealthcareService_AvailableTime
    implements HealthcareService_AvailableTime {
  private final @Nullable String id;
  private final @Nullable Boolean allDay;
  private final @Nullable List<Healthcareservice_AvailabletimeDaysofweekItem> daysOfWeek;
  private final @Nullable Time availableStartTime;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Time availableEndTime;
  private final @Nullable List<Extension> extension;

  private ImmutableHealthcareService_AvailableTime(
      @Nullable String id,
      @Nullable Boolean allDay,
      @Nullable List<Healthcareservice_AvailabletimeDaysofweekItem> daysOfWeek,
      @Nullable Time availableStartTime,
      @Nullable List<Extension> modifierExtension,
      @Nullable Time availableEndTime,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.allDay = allDay;
    this.daysOfWeek = daysOfWeek;
    this.availableStartTime = availableStartTime;
    this.modifierExtension = modifierExtension;
    this.availableEndTime = availableEndTime;
    this.extension = extension;
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
   * @return The value of the {@code allDay} attribute
   */
  @JsonProperty("allDay")
  @Override
  public Optional<Boolean> allDay() {
    return Optional.ofNullable(allDay);
  }

  /**
   * @return The value of the {@code daysOfWeek} attribute
   */
  @JsonProperty("daysOfWeek")
  @Override
  public Optional<List<Healthcareservice_AvailabletimeDaysofweekItem>> daysOfWeek() {
    return Optional.ofNullable(daysOfWeek);
  }

  /**
   * @return The value of the {@code availableStartTime} attribute
   */
  @JsonProperty("availableStartTime")
  @Override
  public Optional<Time> availableStartTime() {
    return Optional.ofNullable(availableStartTime);
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
   * @return The value of the {@code availableEndTime} attribute
   */
  @JsonProperty("availableEndTime")
  @Override
  public Optional<Time> availableEndTime() {
    return Optional.ofNullable(availableEndTime);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_AvailableTime#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableHealthcareService_AvailableTime(
        newValue,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_AvailableTime#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableHealthcareService_AvailableTime(
        value,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_AvailableTime#allDay() allDay} attribute.
   * @param value The value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withAllDay(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.allDay, newValue)) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        newValue,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_AvailableTime#allDay() allDay} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withAllDay(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.allDay, value)) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        value,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_AvailableTime#daysOfWeek() daysOfWeek} attribute.
   * @param value The value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withDaysOfWeek(List<Healthcareservice_AvailabletimeDaysofweekItem> value) {
    @Nullable List<Healthcareservice_AvailabletimeDaysofweekItem> newValue = Objects.requireNonNull(value, "daysOfWeek");
    if (this.daysOfWeek == newValue) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        newValue,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_AvailableTime#daysOfWeek() daysOfWeek} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_AvailableTime withDaysOfWeek(Optional<? extends List<Healthcareservice_AvailabletimeDaysofweekItem>> optional) {
    @Nullable List<Healthcareservice_AvailabletimeDaysofweekItem> value = optional.orElse(null);
    if (this.daysOfWeek == value) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        value,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_AvailableTime#availableStartTime() availableStartTime} attribute.
   * @param value The value for availableStartTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withAvailableStartTime(Time value) {
    @Nullable Time newValue = Objects.requireNonNull(value, "availableStartTime");
    if (this.availableStartTime == newValue) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        newValue,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_AvailableTime#availableStartTime() availableStartTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableStartTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_AvailableTime withAvailableStartTime(Optional<? extends Time> optional) {
    @Nullable Time value = optional.orElse(null);
    if (this.availableStartTime == value) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        value,
        this.modifierExtension,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_AvailableTime#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        newValue,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_AvailableTime#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_AvailableTime withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        value,
        this.availableEndTime,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_AvailableTime#availableEndTime() availableEndTime} attribute.
   * @param value The value for availableEndTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withAvailableEndTime(Time value) {
    @Nullable Time newValue = Objects.requireNonNull(value, "availableEndTime");
    if (this.availableEndTime == newValue) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_AvailableTime#availableEndTime() availableEndTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for availableEndTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_AvailableTime withAvailableEndTime(Optional<? extends Time> optional) {
    @Nullable Time value = optional.orElse(null);
    if (this.availableEndTime == value) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HealthcareService_AvailableTime#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHealthcareService_AvailableTime withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HealthcareService_AvailableTime#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHealthcareService_AvailableTime withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableHealthcareService_AvailableTime(
        this.id,
        this.allDay,
        this.daysOfWeek,
        this.availableStartTime,
        this.modifierExtension,
        this.availableEndTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHealthcareService_AvailableTime} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHealthcareService_AvailableTime
        && equalTo((ImmutableHealthcareService_AvailableTime) another);
  }

  private boolean equalTo(ImmutableHealthcareService_AvailableTime another) {
    return Objects.equals(id, another.id)
        && Objects.equals(allDay, another.allDay)
        && Objects.equals(daysOfWeek, another.daysOfWeek)
        && Objects.equals(availableStartTime, another.availableStartTime)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(availableEndTime, another.availableEndTime)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code allDay}, {@code daysOfWeek}, {@code availableStartTime}, {@code modifierExtension}, {@code availableEndTime}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(allDay);
    h += (h << 5) + Objects.hashCode(daysOfWeek);
    h += (h << 5) + Objects.hashCode(availableStartTime);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(availableEndTime);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code HealthcareService_AvailableTime} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("HealthcareService_AvailableTime{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (allDay != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("allDay=").append(allDay);
    }
    if (daysOfWeek != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("daysOfWeek=").append(daysOfWeek);
    }
    if (availableStartTime != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("availableStartTime=").append(availableStartTime);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (availableEndTime != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("availableEndTime=").append(availableEndTime);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "HealthcareService_AvailableTime", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements HealthcareService_AvailableTime {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> allDay = Optional.empty();
    boolean allDayIsSet;
    @Nullable Optional<List<Healthcareservice_AvailabletimeDaysofweekItem>> daysOfWeek = Optional.empty();
    boolean daysOfWeekIsSet;
    @Nullable Optional<Time> availableStartTime = Optional.empty();
    boolean availableStartTimeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Time> availableEndTime = Optional.empty();
    boolean availableEndTimeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("allDay")
    public void setAllDay(Optional<Boolean> allDay) {
      this.allDay = allDay;
      this.allDayIsSet = true;
    }
    @JsonProperty("daysOfWeek")
    public void setDaysOfWeek(Optional<List<Healthcareservice_AvailabletimeDaysofweekItem>> daysOfWeek) {
      this.daysOfWeek = daysOfWeek;
      this.daysOfWeekIsSet = true;
    }
    @JsonProperty("availableStartTime")
    public void setAvailableStartTime(Optional<Time> availableStartTime) {
      this.availableStartTime = availableStartTime;
      this.availableStartTimeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("availableEndTime")
    public void setAvailableEndTime(Optional<Time> availableEndTime) {
      this.availableEndTime = availableEndTime;
      this.availableEndTimeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> allDay() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Healthcareservice_AvailabletimeDaysofweekItem>> daysOfWeek() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Time> availableStartTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Time> availableEndTime() { throw new UnsupportedOperationException(); }
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
  static ImmutableHealthcareService_AvailableTime fromJson(Json json) {
    ImmutableHealthcareService_AvailableTime.Builder builder = ImmutableHealthcareService_AvailableTime.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.allDayIsSet) {
      builder.allDay(json.allDay);
    }
    if (json.daysOfWeekIsSet) {
      builder.daysOfWeek(json.daysOfWeek);
    }
    if (json.availableStartTimeIsSet) {
      builder.availableStartTime(json.availableStartTime);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.availableEndTimeIsSet) {
      builder.availableEndTime(json.availableEndTime);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableHealthcareService_AvailableTime) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HealthcareService_AvailableTime} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HealthcareService_AvailableTime instance
   */
  public static HealthcareService_AvailableTime copyOf(HealthcareService_AvailableTime instance) {
    if (instance instanceof ImmutableHealthcareService_AvailableTime) {
      return (ImmutableHealthcareService_AvailableTime) instance;
    }
    return ImmutableHealthcareService_AvailableTime.builder()
        .id(instance.id())
        .allDay(instance.allDay())
        .daysOfWeek(instance.daysOfWeek())
        .availableStartTime(instance.availableStartTime())
        .modifierExtension(instance.modifierExtension())
        .availableEndTime(instance.availableEndTime())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link HealthcareService_AvailableTime HealthcareService_AvailableTime}.
   * <pre>
   * ImmutableHealthcareService_AvailableTime.builder()
   *    .id(String) // optional {@link HealthcareService_AvailableTime#id() id}
   *    .allDay(Boolean) // optional {@link HealthcareService_AvailableTime#allDay() allDay}
   *    .daysOfWeek(List&amp;lt;Healthcareservice_AvailabletimeDaysofweekItem&amp;gt;) // optional {@link HealthcareService_AvailableTime#daysOfWeek() daysOfWeek}
   *    .availableStartTime(com.fhir.types.fhir.Time) // optional {@link HealthcareService_AvailableTime#availableStartTime() availableStartTime}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link HealthcareService_AvailableTime#modifierExtension() modifierExtension}
   *    .availableEndTime(com.fhir.types.fhir.Time) // optional {@link HealthcareService_AvailableTime#availableEndTime() availableEndTime}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link HealthcareService_AvailableTime#extension() extension}
   *    .build();
   * </pre>
   * @return A new HealthcareService_AvailableTime builder
   */
  public static ImmutableHealthcareService_AvailableTime.Builder builder() {
    return new ImmutableHealthcareService_AvailableTime.Builder();
  }

  /**
   * Builds instances of type {@link HealthcareService_AvailableTime HealthcareService_AvailableTime}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "HealthcareService_AvailableTime", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_ALL_DAY = 0x2L;
    private static final long OPT_BIT_DAYS_OF_WEEK = 0x4L;
    private static final long OPT_BIT_AVAILABLE_START_TIME = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_AVAILABLE_END_TIME = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Boolean allDay;
    private @Nullable List<Healthcareservice_AvailabletimeDaysofweekItem> daysOfWeek;
    private @Nullable Time availableStartTime;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Time availableEndTime;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#id() id} to id.
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
     * Initializes the optional value {@link HealthcareService_AvailableTime#id() id} to id.
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
     * Initializes the optional value {@link HealthcareService_AvailableTime#allDay() allDay} to allDay.
     * @param allDay The value for allDay
     * @return {@code this} builder for chained invocation
     */
    public final Builder allDay(boolean allDay) {
      checkNotIsSet(allDayIsSet(), "allDay");
      this.allDay = allDay;
      optBits |= OPT_BIT_ALL_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#allDay() allDay} to allDay.
     * @param allDay The value for allDay
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allDay")
    public final Builder allDay(Optional<Boolean> allDay) {
      checkNotIsSet(allDayIsSet(), "allDay");
      this.allDay = allDay.orElse(null);
      optBits |= OPT_BIT_ALL_DAY;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#daysOfWeek() daysOfWeek} to daysOfWeek.
     * @param daysOfWeek The value for daysOfWeek
     * @return {@code this} builder for chained invocation
     */
    public final Builder daysOfWeek(List<Healthcareservice_AvailabletimeDaysofweekItem> daysOfWeek) {
      checkNotIsSet(daysOfWeekIsSet(), "daysOfWeek");
      this.daysOfWeek = Objects.requireNonNull(daysOfWeek, "daysOfWeek");
      optBits |= OPT_BIT_DAYS_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#daysOfWeek() daysOfWeek} to daysOfWeek.
     * @param daysOfWeek The value for daysOfWeek
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("daysOfWeek")
    public final Builder daysOfWeek(Optional<? extends List<Healthcareservice_AvailabletimeDaysofweekItem>> daysOfWeek) {
      checkNotIsSet(daysOfWeekIsSet(), "daysOfWeek");
      this.daysOfWeek = daysOfWeek.orElse(null);
      optBits |= OPT_BIT_DAYS_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#availableStartTime() availableStartTime} to availableStartTime.
     * @param availableStartTime The value for availableStartTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableStartTime(Time availableStartTime) {
      checkNotIsSet(availableStartTimeIsSet(), "availableStartTime");
      this.availableStartTime = Objects.requireNonNull(availableStartTime, "availableStartTime");
      optBits |= OPT_BIT_AVAILABLE_START_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#availableStartTime() availableStartTime} to availableStartTime.
     * @param availableStartTime The value for availableStartTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("availableStartTime")
    public final Builder availableStartTime(Optional<? extends Time> availableStartTime) {
      checkNotIsSet(availableStartTimeIsSet(), "availableStartTime");
      this.availableStartTime = availableStartTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_START_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService_AvailableTime#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link HealthcareService_AvailableTime#availableEndTime() availableEndTime} to availableEndTime.
     * @param availableEndTime The value for availableEndTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder availableEndTime(Time availableEndTime) {
      checkNotIsSet(availableEndTimeIsSet(), "availableEndTime");
      this.availableEndTime = Objects.requireNonNull(availableEndTime, "availableEndTime");
      optBits |= OPT_BIT_AVAILABLE_END_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#availableEndTime() availableEndTime} to availableEndTime.
     * @param availableEndTime The value for availableEndTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("availableEndTime")
    public final Builder availableEndTime(Optional<? extends Time> availableEndTime) {
      checkNotIsSet(availableEndTimeIsSet(), "availableEndTime");
      this.availableEndTime = availableEndTime.orElse(null);
      optBits |= OPT_BIT_AVAILABLE_END_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link HealthcareService_AvailableTime#extension() extension} to extension.
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
     * Initializes the optional value {@link HealthcareService_AvailableTime#extension() extension} to extension.
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
     * Builds a new {@link HealthcareService_AvailableTime HealthcareService_AvailableTime}.
     * @return An immutable instance of HealthcareService_AvailableTime
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public HealthcareService_AvailableTime build() {
      return new ImmutableHealthcareService_AvailableTime(id, allDay, daysOfWeek, availableStartTime, modifierExtension, availableEndTime, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean allDayIsSet() {
      return (optBits & OPT_BIT_ALL_DAY) != 0;
    }

    private boolean daysOfWeekIsSet() {
      return (optBits & OPT_BIT_DAYS_OF_WEEK) != 0;
    }

    private boolean availableStartTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_START_TIME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean availableEndTimeIsSet() {
      return (optBits & OPT_BIT_AVAILABLE_END_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of HealthcareService_AvailableTime is strict, attribute is already set: ".concat(name));
    }
  }
}
