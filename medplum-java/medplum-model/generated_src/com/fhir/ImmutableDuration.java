//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Duration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDuration.builder()}.
 */
@org.immutables.value.Generated(from = "Duration", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDuration implements com.fhir.Duration {
  private final @javax.annotation.Nullable com.fhir.uri system;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.decimal value;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String unit;
  private final @javax.annotation.Nullable com.fhir.DurationComparator comparator;

  private ImmutableDuration(
      @javax.annotation.Nullable com.fhir.uri system,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.decimal value,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String unit,
      @javax.annotation.Nullable com.fhir.DurationComparator comparator) {
    this.system = system;
    this.code = code;
    this.extension = extension;
    this.value = value;
    this.id = id;
    this.unit = unit;
    this.comparator = comparator;
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<com.fhir.uri> system() {
    return java.util.Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<com.fhir.decimal> value() {
    return java.util.Optional.ofNullable(value);
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
   * @return The value of the {@code unit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unit")
  @Override
  public java.util.Optional<java.lang.String> unit() {
    return java.util.Optional.ofNullable(unit);
  }

  /**
   * @return The value of the {@code comparator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comparator")
  @Override
  public java.util.Optional<com.fhir.DurationComparator> comparator() {
    return java.util.Optional.ofNullable(comparator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Duration#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withSystem(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableDuration(newValue, this.code, this.extension, this.value, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Duration#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDuration withSystem(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableDuration(value, this.code, this.extension, this.value, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Duration#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDuration(this.system, newValue, this.extension, this.value, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Duration#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDuration withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDuration(this.system, value, this.extension, this.value, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Duration#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDuration(this.system, this.code, newValue, this.value, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Duration#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDuration withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDuration(this.system, this.code, value, this.value, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Duration#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withValue(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, newValue, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Duration#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDuration withValue(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, value, this.id, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Duration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, this.value, newValue, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Duration#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, this.value, value, this.unit, this.comparator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Duration#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withUnit(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "unit");
    if (java.util.Objects.equals(this.unit, newValue)) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, this.value, this.id, newValue, this.comparator);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Duration#unit() unit} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withUnit(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.unit, value)) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, this.value, this.id, value, this.comparator);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Duration#comparator() comparator} attribute.
   * @param value The value for comparator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDuration withComparator(com.fhir.DurationComparator value) {
    @javax.annotation.Nullable com.fhir.DurationComparator newValue = java.util.Objects.requireNonNull(value, "comparator");
    if (this.comparator == newValue) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, this.value, this.id, this.unit, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Duration#comparator() comparator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comparator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDuration withComparator(java.util.Optional<? extends com.fhir.DurationComparator> optional) {
    @javax.annotation.Nullable com.fhir.DurationComparator value = optional.orElse(null);
    if (this.comparator == value) return this;
    return new ImmutableDuration(this.system, this.code, this.extension, this.value, this.id, this.unit, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDuration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDuration
        && equalTo((ImmutableDuration) another);
  }

  private boolean equalTo(ImmutableDuration another) {
    return java.util.Objects.equals(system, another.system)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(unit, another.unit)
        && java.util.Objects.equals(comparator, another.comparator);
  }

  /**
   * Computes a hash code from attributes: {@code system}, {@code code}, {@code extension}, {@code value}, {@code id}, {@code unit}, {@code comparator}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(system);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(unit);
    h += (h << 5) + java.util.Objects.hashCode(comparator);
    return h;
  }

  /**
   * Prints the immutable value {@code Duration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Duration{");
    if (system != null) {
      builder.append("system=").append(system);
    }
    if (code != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (extension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (unit != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (comparator != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("comparator=").append(comparator);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Duration", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Duration {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> system = java.util.Optional.empty();
    boolean systemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> unit = java.util.Optional.empty();
    boolean unitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DurationComparator> comparator = java.util.Optional.empty();
    boolean comparatorIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<com.fhir.uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<com.fhir.decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public void setUnit(java.util.Optional<java.lang.String> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comparator")
    public void setComparator(java.util.Optional<com.fhir.DurationComparator> comparator) {
      this.comparator = comparator;
      this.comparatorIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> unit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DurationComparator> comparator() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDuration fromJson(Json json) {
    ImmutableDuration.Builder builder = ImmutableDuration.builder();
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.comparatorIsSet) {
      builder.comparator(json.comparator);
    }
    return (ImmutableDuration) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Duration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Duration instance
   */
  public static Duration copyOf(Duration instance) {
    if (instance instanceof ImmutableDuration) {
      return (ImmutableDuration) instance;
    }
    return ImmutableDuration.builder()
        .system(instance.system())
        .code(instance.code())
        .extension(instance.extension())
        .value(instance.value())
        .id(instance.id())
        .unit(instance.unit())
        .comparator(instance.comparator())
        .build();
  }

  /**
   * Creates a builder for {@link Duration Duration}.
   * <pre>
   * ImmutableDuration.builder()
   *    .system(com.fhir.uri) // optional {@link Duration#system() system}
   *    .code(com.fhir.code) // optional {@link Duration#code() code}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Duration#extension() extension}
   *    .value(com.fhir.decimal) // optional {@link Duration#value() value}
   *    .id(String) // optional {@link Duration#id() id}
   *    .unit(String) // optional {@link Duration#unit() unit}
   *    .comparator(com.fhir.DurationComparator) // optional {@link Duration#comparator() comparator}
   *    .build();
   * </pre>
   * @return A new Duration builder
   */
  public static ImmutableDuration.Builder builder() {
    return new ImmutableDuration.Builder();
  }

  /**
   * Builds instances of type {@link Duration Duration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Duration", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SYSTEM = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_UNIT = 0x20L;
    private static final long OPT_BIT_COMPARATOR = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri system;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.decimal value;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String unit;
    private @javax.annotation.Nullable com.fhir.DurationComparator comparator;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Duration#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(com.fhir.uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = java.util.Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public final Builder system(java.util.Optional<? extends com.fhir.uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#extension() extension} to extension.
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
     * Initializes the optional value {@link Duration#extension() extension} to extension.
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
     * Initializes the optional value {@link Duration#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(com.fhir.decimal value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<? extends com.fhir.decimal> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#id() id} to id.
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
     * Initializes the optional value {@link Duration#id() id} to id.
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
     * Initializes the optional value {@link Duration#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(java.lang.String unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = java.util.Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public final Builder unit(java.util.Optional<java.lang.String> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    public final Builder comparator(com.fhir.DurationComparator comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = java.util.Objects.requireNonNull(comparator, "comparator");
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Duration#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comparator")
    public final Builder comparator(java.util.Optional<? extends com.fhir.DurationComparator> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = comparator.orElse(null);
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Builds a new {@link Duration Duration}.
     * @return An immutable instance of Duration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Duration build() {
      return new ImmutableDuration(system, code, extension, value, id, unit, comparator);
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean comparatorIsSet() {
      return (optBits & OPT_BIT_COMPARATOR) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Duration is strict, attribute is already set: ".concat(name));
    }
  }
}
