//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ContactPoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContactPoint.builder()}.
 */
@org.immutables.value.Generated(from = "ContactPoint", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContactPoint implements com.fhir.ContactPoint {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.positiveInt rank;
  private final @javax.annotation.Nullable com.fhir.ContactpointSystem system;
  private final @javax.annotation.Nullable java.lang.String value;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.ContactpointUse use;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableContactPoint(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.positiveInt rank,
      @javax.annotation.Nullable com.fhir.ContactpointSystem system,
      @javax.annotation.Nullable java.lang.String value,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.ContactpointUse use,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.id = id;
    this.rank = rank;
    this.system = system;
    this.value = value;
    this.period = period;
    this.use = use;
    this.extension = extension;
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
   * @return The value of the {@code rank} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rank")
  @Override
  public java.util.Optional<com.fhir.positiveInt> rank() {
    return java.util.Optional.ofNullable(rank);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<com.fhir.ContactpointSystem> system() {
    return java.util.Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<java.lang.String> value() {
    return java.util.Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.ContactpointUse> use() {
    return java.util.Optional.ofNullable(use);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableContactPoint(newValue, this.rank, this.system, this.value, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableContactPoint(value, this.rank, this.system, this.value, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#rank() rank} attribute.
   * @param value The value for rank
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withRank(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "rank");
    if (this.rank == newValue) return this;
    return new ImmutableContactPoint(this.id, newValue, this.system, this.value, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#rank() rank} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rank
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withRank(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.rank == value) return this;
    return new ImmutableContactPoint(this.id, value, this.system, this.value, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withSystem(com.fhir.ContactpointSystem value) {
    @javax.annotation.Nullable com.fhir.ContactpointSystem newValue = java.util.Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableContactPoint(this.id, this.rank, newValue, this.value, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withSystem(java.util.Optional<? extends com.fhir.ContactpointSystem> optional) {
    @javax.annotation.Nullable com.fhir.ContactpointSystem value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableContactPoint(this.id, this.rank, value, this.value, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withValue(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "value");
    if (java.util.Objects.equals(this.value, newValue)) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, newValue, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withValue(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.value, value)) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, value, this.period, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, this.value, newValue, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, this.value, value, this.use, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withUse(com.fhir.ContactpointUse value) {
    @javax.annotation.Nullable com.fhir.ContactpointUse newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, this.value, this.period, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withUse(java.util.Optional<? extends com.fhir.ContactpointUse> optional) {
    @javax.annotation.Nullable com.fhir.ContactpointUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, this.value, this.period, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ContactPoint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContactPoint withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, this.value, this.period, this.use, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ContactPoint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContactPoint withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContactPoint(this.id, this.rank, this.system, this.value, this.period, this.use, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContactPoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContactPoint
        && equalTo((ImmutableContactPoint) another);
  }

  private boolean equalTo(ImmutableContactPoint another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(rank, another.rank)
        && java.util.Objects.equals(system, another.system)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code rank}, {@code system}, {@code value}, {@code period}, {@code use}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(rank);
    h += (h << 5) + java.util.Objects.hashCode(system);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ContactPoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ContactPoint{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (rank != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("rank=").append(rank);
    }
    if (system != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (value != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (period != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (use != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ContactPoint", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ContactPoint {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> rank = java.util.Optional.empty();
    boolean rankIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ContactpointSystem> system = java.util.Optional.empty();
    boolean systemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ContactpointUse> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rank")
    public void setRank(java.util.Optional<com.fhir.positiveInt> rank) {
      this.rank = rank;
      this.rankIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<com.fhir.ContactpointSystem> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<java.lang.String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.ContactpointUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> rank() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ContactpointSystem> system() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ContactpointUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableContactPoint fromJson(Json json) {
    ImmutableContactPoint.Builder builder = ImmutableContactPoint.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.rankIsSet) {
      builder.rank(json.rank);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .id(instance.id())
        .rank(instance.rank())
        .system(instance.system())
        .value(instance.value())
        .period(instance.period())
        .use(instance.use())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ContactPoint ContactPoint}.
   * <pre>
   * ImmutableContactPoint.builder()
   *    .id(String) // optional {@link ContactPoint#id() id}
   *    .rank(com.fhir.positiveInt) // optional {@link ContactPoint#rank() rank}
   *    .system(com.fhir.ContactpointSystem) // optional {@link ContactPoint#system() system}
   *    .value(String) // optional {@link ContactPoint#value() value}
   *    .period(com.fhir.Period) // optional {@link ContactPoint#period() period}
   *    .use(com.fhir.ContactpointUse) // optional {@link ContactPoint#use() use}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ContactPoint#extension() extension}
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
  @org.immutables.value.Generated(from = "ContactPoint", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_RANK = 0x2L;
    private static final long OPT_BIT_SYSTEM = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_PERIOD = 0x10L;
    private static final long OPT_BIT_USE = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.positiveInt rank;
    private @javax.annotation.Nullable com.fhir.ContactpointSystem system;
    private @javax.annotation.Nullable java.lang.String value;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.ContactpointUse use;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ContactPoint#id() id} to id.
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
     * Initializes the optional value {@link ContactPoint#id() id} to id.
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
     * Initializes the optional value {@link ContactPoint#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    public final Builder rank(com.fhir.positiveInt rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = java.util.Objects.requireNonNull(rank, "rank");
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rank")
    public final Builder rank(java.util.Optional<? extends com.fhir.positiveInt> rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = rank.orElse(null);
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(com.fhir.ContactpointSystem system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = java.util.Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public final Builder system(java.util.Optional<? extends com.fhir.ContactpointSystem> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(java.lang.String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<java.lang.String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.ContactpointUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.ContactpointUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ContactPoint#extension() extension} to extension.
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
     * Initializes the optional value {@link ContactPoint#extension() extension} to extension.
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
     * Builds a new {@link ContactPoint ContactPoint}.
     * @return An immutable instance of ContactPoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ContactPoint build() {
      return new ImmutableContactPoint(id, rank, system, value, period, use, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean rankIsSet() {
      return (optBits & OPT_BIT_RANK) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ContactPoint is strict, attribute is already set: ".concat(name));
    }
  }
}
