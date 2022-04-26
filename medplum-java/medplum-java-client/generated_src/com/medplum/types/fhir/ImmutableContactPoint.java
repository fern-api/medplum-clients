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
 * Immutable implementation of {@link ContactPoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContactPoint.builder()}.
 */
@Generated(from = "ContactPoint", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContactPoint implements ContactPoint {
  private final @Nullable ContactpointSystem system;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period period;
  private final @Nullable String value;
  private final @Nullable String id;
  private final @Nullable PositiveInt rank;
  private final @Nullable ContactpointUse use;

  private ImmutableContactPoint(
      @Nullable ContactpointSystem system,
      @Nullable List<Extension> extension,
      @Nullable Period period,
      @Nullable String value,
      @Nullable String id,
      @Nullable PositiveInt rank,
      @Nullable ContactpointUse use) {
    this.system = system;
    this.extension = extension;
    this.period = period;
    this.value = value;
    this.id = id;
    this.rank = rank;
    this.use = use;
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<ContactpointSystem> system() {
    return Optional.ofNullable(system);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
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
   * @return The value of the {@code rank} attribute
   */
  @JsonProperty("rank")
  @Override
  public Optional<PositiveInt> rank() {
    return Optional.ofNullable(rank);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<ContactpointUse> use() {
    return Optional.ofNullable(use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withSystem(ContactpointSystem value) {
    @Nullable ContactpointSystem newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableContactPoint(newValue, this.extension, this.period, this.value, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withSystem(Optional<? extends ContactpointSystem> optional) {
    @Nullable ContactpointSystem value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableContactPoint(value, this.extension, this.period, this.value, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContactPoint(this.system, newValue, this.period, this.value, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContactPoint(this.system, value, this.period, this.value, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableContactPoint(this.system, this.extension, newValue, this.value, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableContactPoint(this.system, this.extension, value, this.value, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, newValue, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, value, this.id, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, this.value, newValue, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, this.value, value, this.rank, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#rank() rank} attribute.
   * @param value The value for rank
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withRank(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "rank");
    if (this.rank == newValue) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, this.value, this.id, newValue, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#rank() rank} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rank
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withRank(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.rank == value) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, this.value, this.id, value, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withUse(ContactpointUse value) {
    @Nullable ContactpointUse newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, this.value, this.id, this.rank, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withUse(Optional<? extends ContactpointUse> optional) {
    @Nullable ContactpointUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableContactPoint(this.system, this.extension, this.period, this.value, this.id, this.rank, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContactPoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContactPoint
        && equalTo((ImmutableContactPoint) another);
  }

  private boolean equalTo(ImmutableContactPoint another) {
    return Objects.equals(system, another.system)
        && Objects.equals(extension, another.extension)
        && Objects.equals(period, another.period)
        && Objects.equals(value, another.value)
        && Objects.equals(id, another.id)
        && Objects.equals(rank, another.rank)
        && Objects.equals(use, another.use);
  }

  /**
   * Computes a hash code from attributes: {@code system}, {@code extension}, {@code period}, {@code value}, {@code id}, {@code rank}, {@code use}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(rank);
    h += (h << 5) + Objects.hashCode(use);
    return h;
  }

  /**
   * Prints the immutable value {@code ContactPoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ContactPoint{");
    if (system != null) {
      builder.append("system=").append(system);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (period != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (value != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (rank != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("rank=").append(rank);
    }
    if (use != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("use=").append(use);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ContactPoint", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ContactPoint {
    @Nullable Optional<ContactpointSystem> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<PositiveInt> rank = Optional.empty();
    boolean rankIsSet;
    @Nullable Optional<ContactpointUse> use = Optional.empty();
    boolean useIsSet;
    @JsonProperty("system")
    public void setSystem(Optional<ContactpointSystem> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("rank")
    public void setRank(Optional<PositiveInt> rank) {
      this.rank = rank;
      this.rankIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<ContactpointUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @Override
    public Optional<ContactpointSystem> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> rank() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactpointUse> use() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContactPoint fromJson(Json json) {
    ImmutableContactPoint.Builder builder = ImmutableContactPoint.builder();
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.rankIsSet) {
      builder.rank(json.rank);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    return (ImmutableContactPoint) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ContactPoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ContactPoint instance
   */
  public static ContactPoint copyOf(ContactPoint instance) {
    if (instance instanceof ImmutableContactPoint) {
      return (ImmutableContactPoint) instance;
    }
    return ImmutableContactPoint.builder()
        .system(instance.system())
        .extension(instance.extension())
        .period(instance.period())
        .value(instance.value())
        .id(instance.id())
        .rank(instance.rank())
        .use(instance.use())
        .build();
  }

  /**
   * Creates a builder for {@link ContactPoint ContactPoint}.
   * <pre>
   * ImmutableContactPoint.builder()
   *    .system(com.medplum.types.fhir.ContactpointSystem) // optional {@link ContactPoint#system() system}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ContactPoint#extension() extension}
   *    .period(com.medplum.types.fhir.Period) // optional {@link ContactPoint#period() period}
   *    .value(String) // optional {@link ContactPoint#value() value}
   *    .id(String) // optional {@link ContactPoint#id() id}
   *    .rank(com.medplum.types.fhir.PositiveInt) // optional {@link ContactPoint#rank() rank}
   *    .use(com.medplum.types.fhir.ContactpointUse) // optional {@link ContactPoint#use() use}
   *    .build();
   * </pre>
   * @return A new ContactPoint builder
   */
  public static ImmutableContactPoint.Builder builder() {
    return new ImmutableContactPoint.Builder();
  }

  /**
   * Builds instances of type {@link ContactPoint ContactPoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ContactPoint", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SYSTEM = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_PERIOD = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_RANK = 0x20L;
    private static final long OPT_BIT_USE = 0x40L;
    private long optBits;

    private @Nullable ContactpointSystem system;
    private @Nullable List<Extension> extension;
    private @Nullable Period period;
    private @Nullable String value;
    private @Nullable String id;
    private @Nullable PositiveInt rank;
    private @Nullable ContactpointUse use;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ContactPoint#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(ContactpointSystem system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<? extends ContactpointSystem> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#extension() extension} to extension.
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
     * Initializes the optional value {@link ContactPoint#extension() extension} to extension.
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
     * Initializes the optional value {@link ContactPoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#id() id} to id.
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
     * Initializes the optional value {@link ContactPoint#id() id} to id.
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
     * Initializes the optional value {@link ContactPoint#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    public final Builder rank(PositiveInt rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = Objects.requireNonNull(rank, "rank");
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rank")
    public final Builder rank(Optional<? extends PositiveInt> rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = rank.orElse(null);
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(ContactpointUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends ContactpointUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Builds a new {@link ContactPoint ContactPoint}.
     * @return An immutable instance of ContactPoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ContactPoint build() {
      return new ImmutableContactPoint(system, extension, period, value, id, rank, use);
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean rankIsSet() {
      return (optBits & OPT_BIT_RANK) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ContactPoint is strict, attribute is already set: ".concat(name));
    }
  }
}
