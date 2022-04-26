package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Location_HoursOfOperation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLocation_HoursOfOperation.builder()}.
 */
@Generated(from = "Location_HoursOfOperation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLocation_HoursOfOperation
    implements Location_HoursOfOperation {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Code> daysOfWeek;
  private final @Nullable String id;
  private final @Nullable Time openingTime;
  private final @Nullable Boolean allDay;
  private final @Nullable Time closingTime;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableLocation_HoursOfOperation(
      @Nullable List<Extension> extension,
      @Nullable List<Code> daysOfWeek,
      @Nullable String id,
      @Nullable Time openingTime,
      @Nullable Boolean allDay,
      @Nullable Time closingTime,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.daysOfWeek = daysOfWeek;
    this.id = id;
    this.openingTime = openingTime;
    this.allDay = allDay;
    this.closingTime = closingTime;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code daysOfWeek} attribute
   */
  @JsonProperty("daysOfWeek")
  @Override
  public Optional<List<Code>> daysOfWeek() {
    return Optional.ofNullable(daysOfWeek);
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
   * @return The value of the {@code openingTime} attribute
   */
  @JsonProperty("openingTime")
  @Override
  public Optional<Time> openingTime() {
    return Optional.ofNullable(openingTime);
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
   * @return The value of the {@code closingTime} attribute
   */
  @JsonProperty("closingTime")
  @Override
  public Optional<Time> closingTime() {
    return Optional.ofNullable(closingTime);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        newValue,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        value,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} attribute.
   * @param value The value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withDaysOfWeek(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "daysOfWeek");
    if (this.daysOfWeek == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        newValue,
        this.id,
        this.openingTime,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for daysOfWeek
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withDaysOfWeek(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.daysOfWeek == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        value,
        this.id,
        this.openingTime,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        newValue,
        this.openingTime,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        value,
        this.openingTime,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#openingTime() openingTime} attribute.
   * @param value The value for openingTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withOpeningTime(Time value) {
    @Nullable Time newValue = Objects.requireNonNull(value, "openingTime");
    if (this.openingTime == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        newValue,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#openingTime() openingTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for openingTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withOpeningTime(Optional<? extends Time> optional) {
    @Nullable Time value = optional.orElse(null);
    if (this.openingTime == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        value,
        this.allDay,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#allDay() allDay} attribute.
   * @param value The value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withAllDay(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.allDay, newValue)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        newValue,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#allDay() allDay} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allDay
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withAllDay(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.allDay, value)) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        value,
        this.closingTime,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#closingTime() closingTime} attribute.
   * @param value The value for closingTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withClosingTime(Time value) {
    @Nullable Time newValue = Objects.requireNonNull(value, "closingTime");
    if (this.closingTime == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        this.allDay,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#closingTime() closingTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for closingTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withClosingTime(Optional<? extends Time> optional) {
    @Nullable Time value = optional.orElse(null);
    if (this.closingTime == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        this.allDay,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_HoursOfOperation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_HoursOfOperation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        this.allDay,
        this.closingTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_HoursOfOperation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_HoursOfOperation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLocation_HoursOfOperation(
        this.extension,
        this.daysOfWeek,
        this.id,
        this.openingTime,
        this.allDay,
        this.closingTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLocation_HoursOfOperation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLocation_HoursOfOperation
        && equalTo((ImmutableLocation_HoursOfOperation) another);
  }

  private boolean equalTo(ImmutableLocation_HoursOfOperation another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(daysOfWeek, another.daysOfWeek)
        && Objects.equals(id, another.id)
        && Objects.equals(openingTime, another.openingTime)
        && Objects.equals(allDay, another.allDay)
        && Objects.equals(closingTime, another.closingTime)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code daysOfWeek}, {@code id}, {@code openingTime}, {@code allDay}, {@code closingTime}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(daysOfWeek);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(openingTime);
    h += (h << 5) + Objects.hashCode(allDay);
    h += (h << 5) + Objects.hashCode(closingTime);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Location_HoursOfOperation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Location_HoursOfOperation{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (daysOfWeek != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("daysOfWeek=").append(daysOfWeek);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (openingTime != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("openingTime=").append(openingTime);
    }
    if (allDay != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("allDay=").append(allDay);
    }
    if (closingTime != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("closingTime=").append(closingTime);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Location_HoursOfOperation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Location_HoursOfOperation {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Code>> daysOfWeek = Optional.empty();
    boolean daysOfWeekIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Time> openingTime = Optional.empty();
    boolean openingTimeIsSet;
    @Nullable Optional<Boolean> allDay = Optional.empty();
    boolean allDayIsSet;
    @Nullable Optional<Time> closingTime = Optional.empty();
    boolean closingTimeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("daysOfWeek")
    public void setDaysOfWeek(Optional<List<Code>> daysOfWeek) {
      this.daysOfWeek = daysOfWeek;
      this.daysOfWeekIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("openingTime")
    public void setOpeningTime(Optional<Time> openingTime) {
      this.openingTime = openingTime;
      this.openingTimeIsSet = true;
    }
    @JsonProperty("allDay")
    public void setAllDay(Optional<Boolean> allDay) {
      this.allDay = allDay;
      this.allDayIsSet = true;
    }
    @JsonProperty("closingTime")
    public void setClosingTime(Optional<Time> closingTime) {
      this.closingTime = closingTime;
      this.closingTimeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> daysOfWeek() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Time> openingTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> allDay() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Time> closingTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLocation_HoursOfOperation fromJson(Json json) {
    ImmutableLocation_HoursOfOperation.Builder builder = ImmutableLocation_HoursOfOperation.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.daysOfWeekIsSet) {
      builder.daysOfWeek(json.daysOfWeek);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.openingTimeIsSet) {
      builder.openingTime(json.openingTime);
    }
    if (json.allDayIsSet) {
      builder.allDay(json.allDay);
    }
    if (json.closingTimeIsSet) {
      builder.closingTime(json.closingTime);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableLocation_HoursOfOperation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Location_HoursOfOperation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Location_HoursOfOperation instance
   */
  public static Location_HoursOfOperation copyOf(Location_HoursOfOperation instance) {
    if (instance instanceof ImmutableLocation_HoursOfOperation) {
      return (ImmutableLocation_HoursOfOperation) instance;
    }
    return ImmutableLocation_HoursOfOperation.builder()
        .extension(instance.extension())
        .daysOfWeek(instance.daysOfWeek())
        .id(instance.id())
        .openingTime(instance.openingTime())
        .allDay(instance.allDay())
        .closingTime(instance.closingTime())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Location_HoursOfOperation Location_HoursOfOperation}.
   * <pre>
   * ImmutableLocation_HoursOfOperation.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Location_HoursOfOperation#extension() extension}
   *    .daysOfWeek(List&amp;lt;com.medplum.types.fhir.Code&amp;gt;) // optional {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek}
   *    .id(String) // optional {@link Location_HoursOfOperation#id() id}
   *    .openingTime(com.medplum.types.fhir.Time) // optional {@link Location_HoursOfOperation#openingTime() openingTime}
   *    .allDay(Boolean) // optional {@link Location_HoursOfOperation#allDay() allDay}
   *    .closingTime(com.medplum.types.fhir.Time) // optional {@link Location_HoursOfOperation#closingTime() closingTime}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Location_HoursOfOperation#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Location_HoursOfOperation builder
   */
  public static ImmutableLocation_HoursOfOperation.Builder builder() {
    return new ImmutableLocation_HoursOfOperation.Builder();
  }

  /**
   * Builds instances of type {@link Location_HoursOfOperation Location_HoursOfOperation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Location_HoursOfOperation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_DAYS_OF_WEEK = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_OPENING_TIME = 0x8L;
    private static final long OPT_BIT_ALL_DAY = 0x10L;
    private static final long OPT_BIT_CLOSING_TIME = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Code> daysOfWeek;
    private @Nullable String id;
    private @Nullable Time openingTime;
    private @Nullable Boolean allDay;
    private @Nullable Time closingTime;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link Location_HoursOfOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} to daysOfWeek.
     * @param daysOfWeek The value for daysOfWeek
     * @return {@code this} builder for chained invocation
     */
    public final Builder daysOfWeek(List<Code> daysOfWeek) {
      checkNotIsSet(daysOfWeekIsSet(), "daysOfWeek");
      this.daysOfWeek = Objects.requireNonNull(daysOfWeek, "daysOfWeek");
      optBits |= OPT_BIT_DAYS_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#daysOfWeek() daysOfWeek} to daysOfWeek.
     * @param daysOfWeek The value for daysOfWeek
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("daysOfWeek")
    public final Builder daysOfWeek(Optional<? extends List<Code>> daysOfWeek) {
      checkNotIsSet(daysOfWeekIsSet(), "daysOfWeek");
      this.daysOfWeek = daysOfWeek.orElse(null);
      optBits |= OPT_BIT_DAYS_OF_WEEK;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#id() id} to id.
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
     * Initializes the optional value {@link Location_HoursOfOperation#id() id} to id.
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
     * Initializes the optional value {@link Location_HoursOfOperation#openingTime() openingTime} to openingTime.
     * @param openingTime The value for openingTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder openingTime(Time openingTime) {
      checkNotIsSet(openingTimeIsSet(), "openingTime");
      this.openingTime = Objects.requireNonNull(openingTime, "openingTime");
      optBits |= OPT_BIT_OPENING_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#openingTime() openingTime} to openingTime.
     * @param openingTime The value for openingTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("openingTime")
    public final Builder openingTime(Optional<? extends Time> openingTime) {
      checkNotIsSet(openingTimeIsSet(), "openingTime");
      this.openingTime = openingTime.orElse(null);
      optBits |= OPT_BIT_OPENING_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#allDay() allDay} to allDay.
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
     * Initializes the optional value {@link Location_HoursOfOperation#allDay() allDay} to allDay.
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
     * Initializes the optional value {@link Location_HoursOfOperation#closingTime() closingTime} to closingTime.
     * @param closingTime The value for closingTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder closingTime(Time closingTime) {
      checkNotIsSet(closingTimeIsSet(), "closingTime");
      this.closingTime = Objects.requireNonNull(closingTime, "closingTime");
      optBits |= OPT_BIT_CLOSING_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#closingTime() closingTime} to closingTime.
     * @param closingTime The value for closingTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("closingTime")
    public final Builder closingTime(Optional<? extends Time> closingTime) {
      checkNotIsSet(closingTimeIsSet(), "closingTime");
      this.closingTime = closingTime.orElse(null);
      optBits |= OPT_BIT_CLOSING_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_HoursOfOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Location_HoursOfOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Location_HoursOfOperation Location_HoursOfOperation}.
     * @return An immutable instance of Location_HoursOfOperation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Location_HoursOfOperation build() {
      return new ImmutableLocation_HoursOfOperation(extension, daysOfWeek, id, openingTime, allDay, closingTime, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean daysOfWeekIsSet() {
      return (optBits & OPT_BIT_DAYS_OF_WEEK) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean openingTimeIsSet() {
      return (optBits & OPT_BIT_OPENING_TIME) != 0;
    }

    private boolean allDayIsSet() {
      return (optBits & OPT_BIT_ALL_DAY) != 0;
    }

    private boolean closingTimeIsSet() {
      return (optBits & OPT_BIT_CLOSING_TIME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Location_HoursOfOperation is strict, attribute is already set: ".concat(name));
    }
  }
}
