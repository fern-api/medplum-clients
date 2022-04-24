//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Age}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAge.builder()}.
 */
@org.immutables.value.Generated(from = "Age", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAge implements com.fhir.Age {
  private final @javax.annotation.Nullable java.lang.String unit;
  private final @javax.annotation.Nullable com.fhir.uri system;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.decimal value;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable com.fhir.AgeComparator comparator;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableAge(
      @javax.annotation.Nullable java.lang.String unit,
      @javax.annotation.Nullable com.fhir.uri system,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.decimal value,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable com.fhir.AgeComparator comparator,
      @javax.annotation.Nullable java.lang.String id) {
    this.unit = unit;
    this.system = system;
    this.extension = extension;
    this.value = value;
    this.code = code;
    this.comparator = comparator;
    this.id = id;
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
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<com.fhir.uri> system() {
    return java.util.Optional.ofNullable(system);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code comparator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comparator")
  @Override
  public java.util.Optional<com.fhir.AgeComparator> comparator() {
    return java.util.Optional.ofNullable(comparator);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Age#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withUnit(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "unit");
    if (java.util.Objects.equals(this.unit, newValue)) return this;
    return new ImmutableAge(newValue, this.system, this.extension, this.value, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Age#unit() unit} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withUnit(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.unit, value)) return this;
    return new ImmutableAge(value, this.system, this.extension, this.value, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Age#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withSystem(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableAge(this.unit, newValue, this.extension, this.value, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Age#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAge withSystem(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableAge(this.unit, value, this.extension, this.value, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Age#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAge(this.unit, this.system, newValue, this.value, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Age#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAge withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAge(this.unit, this.system, value, this.value, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Age#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withValue(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, newValue, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Age#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAge withValue(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, value, this.code, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Age#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, this.value, newValue, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Age#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAge withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, this.value, value, this.comparator, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Age#comparator() comparator} attribute.
   * @param value The value for comparator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withComparator(com.fhir.AgeComparator value) {
    @javax.annotation.Nullable com.fhir.AgeComparator newValue = java.util.Objects.requireNonNull(value, "comparator");
    if (this.comparator == newValue) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, this.value, this.code, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Age#comparator() comparator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comparator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAge withComparator(java.util.Optional<? extends com.fhir.AgeComparator> optional) {
    @javax.annotation.Nullable com.fhir.AgeComparator value = optional.orElse(null);
    if (this.comparator == value) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, this.value, this.code, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Age#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, this.value, this.code, this.comparator, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Age#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAge withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableAge(this.unit, this.system, this.extension, this.value, this.code, this.comparator, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAge} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAge
        && equalTo((ImmutableAge) another);
  }

  private boolean equalTo(ImmutableAge another) {
    return java.util.Objects.equals(unit, another.unit)
        && java.util.Objects.equals(system, another.system)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(comparator, another.comparator)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code unit}, {@code system}, {@code extension}, {@code value}, {@code code}, {@code comparator}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(unit);
    h += (h << 5) + java.util.Objects.hashCode(system);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(comparator);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Age} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Age{");
    if (unit != null) {
      builder.append("unit=").append(unit);
    }
    if (system != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (extension != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (code != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (comparator != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("comparator=").append(comparator);
    }
    if (id != null) {
      if (builder.length() > 4) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Age", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Age {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> unit = java.util.Optional.empty();
    boolean unitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> system = java.util.Optional.empty();
    boolean systemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.AgeComparator> comparator = java.util.Optional.empty();
    boolean comparatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    public void setUnit(java.util.Optional<java.lang.String> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<com.fhir.uri> system) {
      this.system = system;
      this.systemIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comparator")
    public void setComparator(java.util.Optional<com.fhir.AgeComparator> comparator) {
      this.comparator = comparator;
      this.comparatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> unit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.AgeComparator> comparator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAge fromJson(Json json) {
    ImmutableAge.Builder builder = ImmutableAge.builder();
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.comparatorIsSet) {
      builder.comparator(json.comparator);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableAge) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Age} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Age instance
   */
  public static Age copyOf(Age instance) {
    if (instance instanceof ImmutableAge) {
      return (ImmutableAge) instance;
    }
    return ImmutableAge.builder()
        .unit(instance.unit())
        .system(instance.system())
        .extension(instance.extension())
        .value(instance.value())
        .code(instance.code())
        .comparator(instance.comparator())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Age Age}.
   * <pre>
   * ImmutableAge.builder()
   *    .unit(String) // optional {@link Age#unit() unit}
   *    .system(com.fhir.uri) // optional {@link Age#system() system}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Age#extension() extension}
   *    .value(com.fhir.decimal) // optional {@link Age#value() value}
   *    .code(com.fhir.code) // optional {@link Age#code() code}
   *    .comparator(com.fhir.AgeComparator) // optional {@link Age#comparator() comparator}
   *    .id(String) // optional {@link Age#id() id}
   *    .build();
   * </pre>
   * @return A new Age builder
   */
  public static ImmutableAge.Builder builder() {
    return new ImmutableAge.Builder();
  }

  /**
   * Builds instances of type {@link Age Age}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Age", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_UNIT = 0x1L;
    private static final long OPT_BIT_SYSTEM = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_COMPARATOR = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String unit;
    private @javax.annotation.Nullable com.fhir.uri system;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.decimal value;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable com.fhir.AgeComparator comparator;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Age#unit() unit} to unit.
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
     * Initializes the optional value {@link Age#unit() unit} to unit.
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
     * Initializes the optional value {@link Age#system() system} to system.
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
     * Initializes the optional value {@link Age#system() system} to system.
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
     * Initializes the optional value {@link Age#extension() extension} to extension.
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
     * Initializes the optional value {@link Age#extension() extension} to extension.
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
     * Initializes the optional value {@link Age#value() value} to value.
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
     * Initializes the optional value {@link Age#value() value} to value.
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
     * Initializes the optional value {@link Age#code() code} to code.
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
     * Initializes the optional value {@link Age#code() code} to code.
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
     * Initializes the optional value {@link Age#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    public final Builder comparator(com.fhir.AgeComparator comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = java.util.Objects.requireNonNull(comparator, "comparator");
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Age#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comparator")
    public final Builder comparator(java.util.Optional<? extends com.fhir.AgeComparator> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = comparator.orElse(null);
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Age#id() id} to id.
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
     * Initializes the optional value {@link Age#id() id} to id.
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
     * Builds a new {@link Age Age}.
     * @return An immutable instance of Age
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Age build() {
      return new ImmutableAge(unit, system, extension, value, code, comparator, id);
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean comparatorIsSet() {
      return (optBits & OPT_BIT_COMPARATOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Age is strict, attribute is already set: ".concat(name));
    }
  }
}