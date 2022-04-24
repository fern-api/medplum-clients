//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SampledData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSampledData.builder()}.
 */
@org.immutables.value.Generated(from = "SampledData", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSampledData implements com.fhir.SampledData {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.decimal upperLimit;
  private final @javax.annotation.Nullable com.fhir.decimal factor;
  private final com.fhir.Quantity origin;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String data;
  private final @javax.annotation.Nullable com.fhir.decimal period;
  private final @javax.annotation.Nullable com.fhir.decimal lowerLimit;
  private final @javax.annotation.Nullable com.fhir.positiveInt dimensions;

  private ImmutableSampledData(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.decimal upperLimit,
      @javax.annotation.Nullable com.fhir.decimal factor,
      com.fhir.Quantity origin,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String data,
      @javax.annotation.Nullable com.fhir.decimal period,
      @javax.annotation.Nullable com.fhir.decimal lowerLimit,
      @javax.annotation.Nullable com.fhir.positiveInt dimensions) {
    this.id = id;
    this.upperLimit = upperLimit;
    this.factor = factor;
    this.origin = origin;
    this.extension = extension;
    this.data = data;
    this.period = period;
    this.lowerLimit = lowerLimit;
    this.dimensions = dimensions;
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
   * @return The value of the {@code upperLimit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("upperLimit")
  @Override
  public java.util.Optional<com.fhir.decimal> upperLimit() {
    return java.util.Optional.ofNullable(upperLimit);
  }

  /**
   * @return The value of the {@code factor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("factor")
  @Override
  public java.util.Optional<com.fhir.decimal> factor() {
    return java.util.Optional.ofNullable(factor);
  }

  /**
   * @return The value of the {@code origin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("origin")
  @Override
  public com.fhir.Quantity origin() {
    return origin;
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
   * @return The value of the {@code data} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("data")
  @Override
  public java.util.Optional<java.lang.String> data() {
    return java.util.Optional.ofNullable(data);
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
   * @return The value of the {@code lowerLimit} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lowerLimit")
  @Override
  public java.util.Optional<com.fhir.decimal> lowerLimit() {
    return java.util.Optional.ofNullable(lowerLimit);
  }

  /**
   * @return The value of the {@code dimensions} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
  @Override
  public java.util.Optional<com.fhir.positiveInt> dimensions() {
    return java.util.Optional.ofNullable(dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableSampledData(
        newValue,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableSampledData(
        value,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#upperLimit() upperLimit} attribute.
   * @param value The value for upperLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withUpperLimit(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "upperLimit");
    if (this.upperLimit == newValue) return this;
    return new ImmutableSampledData(
        this.id,
        newValue,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#upperLimit() upperLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for upperLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withUpperLimit(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.upperLimit == value) return this;
    return new ImmutableSampledData(
        this.id,
        value,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        newValue,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        value,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SampledData#origin() origin} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for origin
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSampledData withOrigin(com.fhir.Quantity value) {
    if (this.origin == value) return this;
    com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "origin");
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        newValue,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        newValue,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        value,
        this.data,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withData(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "data");
    if (java.util.Objects.equals(this.data, newValue)) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        newValue,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#data() data} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withData(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.data, value)) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        value,
        this.period,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withPeriod(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        newValue,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withPeriod(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        value,
        this.lowerLimit,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#lowerLimit() lowerLimit} attribute.
   * @param value The value for lowerLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withLowerLimit(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "lowerLimit");
    if (this.lowerLimit == newValue) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        newValue,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#lowerLimit() lowerLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lowerLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withLowerLimit(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.lowerLimit == value) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        value,
        this.dimensions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#dimensions() dimensions} attribute.
   * @param value The value for dimensions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withDimensions(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "dimensions");
    if (this.dimensions == newValue) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#dimensions() dimensions} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dimensions
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withDimensions(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.dimensions == value) return this;
    return new ImmutableSampledData(
        this.id,
        this.upperLimit,
        this.factor,
        this.origin,
        this.extension,
        this.data,
        this.period,
        this.lowerLimit,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSampledData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSampledData
        && equalTo((ImmutableSampledData) another);
  }

  private boolean equalTo(ImmutableSampledData another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(upperLimit, another.upperLimit)
        && java.util.Objects.equals(factor, another.factor)
        && origin.equals(another.origin)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(data, another.data)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(lowerLimit, another.lowerLimit)
        && java.util.Objects.equals(dimensions, another.dimensions);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code upperLimit}, {@code factor}, {@code origin}, {@code extension}, {@code data}, {@code period}, {@code lowerLimit}, {@code dimensions}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(upperLimit);
    h += (h << 5) + java.util.Objects.hashCode(factor);
    h += (h << 5) + origin.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(data);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(lowerLimit);
    h += (h << 5) + java.util.Objects.hashCode(dimensions);
    return h;
  }

  /**
   * Prints the immutable value {@code SampledData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SampledData{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (upperLimit != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("upperLimit=").append(upperLimit);
    }
    if (factor != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("origin=").append(origin);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (data != null) {
      builder.append(", ");
      builder.append("data=").append(data);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (lowerLimit != null) {
      builder.append(", ");
      builder.append("lowerLimit=").append(lowerLimit);
    }
    if (dimensions != null) {
      builder.append(", ");
      builder.append("dimensions=").append(dimensions);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SampledData", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SampledData {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> upperLimit = java.util.Optional.empty();
    boolean upperLimitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factor = java.util.Optional.empty();
    boolean factorIsSet;
    @javax.annotation.Nullable com.fhir.Quantity origin;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> data = java.util.Optional.empty();
    boolean dataIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> lowerLimit = java.util.Optional.empty();
    boolean lowerLimitIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> dimensions = java.util.Optional.empty();
    boolean dimensionsIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("upperLimit")
    public void setUpperLimit(java.util.Optional<com.fhir.decimal> upperLimit) {
      this.upperLimit = upperLimit;
      this.upperLimitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public void setFactor(java.util.Optional<com.fhir.decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public void setOrigin(com.fhir.Quantity origin) {
      this.origin = origin;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public void setData(java.util.Optional<java.lang.String> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.decimal> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lowerLimit")
    public void setLowerLimit(java.util.Optional<com.fhir.decimal> lowerLimit) {
      this.lowerLimit = lowerLimit;
      this.lowerLimitIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    public void setDimensions(java.util.Optional<com.fhir.positiveInt> dimensions) {
      this.dimensions = dimensions;
      this.dimensionsIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> upperLimit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Quantity origin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> data() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> lowerLimit() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> dimensions() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSampledData fromJson(Json json) {
    ImmutableSampledData.Builder builder = ((ImmutableSampledData.Builder) ImmutableSampledData.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.upperLimitIsSet) {
      builder.upperLimit(json.upperLimit);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.origin != null) {
      builder.origin(json.origin);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.lowerLimitIsSet) {
      builder.lowerLimit(json.lowerLimit);
    }
    if (json.dimensionsIsSet) {
      builder.dimensions(json.dimensions);
    }
    return (ImmutableSampledData) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SampledData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SampledData instance
   */
  public static SampledData copyOf(SampledData instance) {
    if (instance instanceof ImmutableSampledData) {
      return (ImmutableSampledData) instance;
    }
    return ((ImmutableSampledData.Builder) ImmutableSampledData.builder())
        .id(instance.id())
        .upperLimit(instance.upperLimit())
        .factor(instance.factor())
        .origin(instance.origin())
        .extension(instance.extension())
        .data(instance.data())
        .period(instance.period())
        .lowerLimit(instance.lowerLimit())
        .dimensions(instance.dimensions())
        .build();
  }

  /**
   * Creates a builder for {@link SampledData SampledData}.
   * <pre>
   * ImmutableSampledData.builder()
   *    .id(String) // optional {@link SampledData#id() id}
   *    .upperLimit(com.fhir.decimal) // optional {@link SampledData#upperLimit() upperLimit}
   *    .factor(com.fhir.decimal) // optional {@link SampledData#factor() factor}
   *    .origin(com.fhir.Quantity) // required {@link SampledData#origin() origin}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SampledData#extension() extension}
   *    .data(String) // optional {@link SampledData#data() data}
   *    .period(com.fhir.decimal) // optional {@link SampledData#period() period}
   *    .lowerLimit(com.fhir.decimal) // optional {@link SampledData#lowerLimit() lowerLimit}
   *    .dimensions(com.fhir.positiveInt) // optional {@link SampledData#dimensions() dimensions}
   *    .build();
   * </pre>
   * @return A new SampledData builder
   */
  public static OriginBuildStage builder() {
    return new ImmutableSampledData.Builder();
  }

  /**
   * Builds instances of type {@link SampledData SampledData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SampledData", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements OriginBuildStage, BuildFinal {
    private static final long INIT_BIT_ORIGIN = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_UPPER_LIMIT = 0x2L;
    private static final long OPT_BIT_FACTOR = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DATA = 0x10L;
    private static final long OPT_BIT_PERIOD = 0x20L;
    private static final long OPT_BIT_LOWER_LIMIT = 0x40L;
    private static final long OPT_BIT_DIMENSIONS = 0x80L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.decimal upperLimit;
    private @javax.annotation.Nullable com.fhir.decimal factor;
    private @javax.annotation.Nullable com.fhir.Quantity origin;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String data;
    private @javax.annotation.Nullable com.fhir.decimal period;
    private @javax.annotation.Nullable com.fhir.decimal lowerLimit;
    private @javax.annotation.Nullable com.fhir.positiveInt dimensions;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SampledData#id() id} to id.
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
     * Initializes the optional value {@link SampledData#id() id} to id.
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
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder upperLimit(com.fhir.decimal upperLimit) {
      checkNotIsSet(upperLimitIsSet(), "upperLimit");
      this.upperLimit = java.util.Objects.requireNonNull(upperLimit, "upperLimit");
      optBits |= OPT_BIT_UPPER_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upperLimit")
    public final Builder upperLimit(java.util.Optional<? extends com.fhir.decimal> upperLimit) {
      checkNotIsSet(upperLimitIsSet(), "upperLimit");
      this.upperLimit = upperLimit.orElse(null);
      optBits |= OPT_BIT_UPPER_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    public final Builder factor(com.fhir.decimal factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = java.util.Objects.requireNonNull(factor, "factor");
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public final Builder factor(java.util.Optional<? extends com.fhir.decimal> factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = factor.orElse(null);
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the value for the {@link SampledData#origin() origin} attribute.
     * @param origin The value for origin 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public final Builder origin(com.fhir.Quantity origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = java.util.Objects.requireNonNull(origin, "origin");
      initBits &= ~INIT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
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
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
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
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(java.lang.String data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = java.util.Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public final Builder data(java.util.Optional<java.lang.String> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#period() period} to period.
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
     * Initializes the optional value {@link SampledData#period() period} to period.
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
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder lowerLimit(com.fhir.decimal lowerLimit) {
      checkNotIsSet(lowerLimitIsSet(), "lowerLimit");
      this.lowerLimit = java.util.Objects.requireNonNull(lowerLimit, "lowerLimit");
      optBits |= OPT_BIT_LOWER_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lowerLimit")
    public final Builder lowerLimit(java.util.Optional<? extends com.fhir.decimal> lowerLimit) {
      checkNotIsSet(lowerLimitIsSet(), "lowerLimit");
      this.lowerLimit = lowerLimit.orElse(null);
      optBits |= OPT_BIT_LOWER_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#dimensions() dimensions} to dimensions.
     * @param dimensions The value for dimensions
     * @return {@code this} builder for chained invocation
     */
    public final Builder dimensions(com.fhir.positiveInt dimensions) {
      checkNotIsSet(dimensionsIsSet(), "dimensions");
      this.dimensions = java.util.Objects.requireNonNull(dimensions, "dimensions");
      optBits |= OPT_BIT_DIMENSIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#dimensions() dimensions} to dimensions.
     * @param dimensions The value for dimensions
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    public final Builder dimensions(java.util.Optional<? extends com.fhir.positiveInt> dimensions) {
      checkNotIsSet(dimensionsIsSet(), "dimensions");
      this.dimensions = dimensions.orElse(null);
      optBits |= OPT_BIT_DIMENSIONS;
      return this;
    }

    /**
     * Builds a new {@link SampledData SampledData}.
     * @return An immutable instance of SampledData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SampledData build() {
      checkRequiredAttributes();
      return new ImmutableSampledData(id, upperLimit, factor, origin, extension, data, period, lowerLimit, dimensions);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean upperLimitIsSet() {
      return (optBits & OPT_BIT_UPPER_LIMIT) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean lowerLimitIsSet() {
      return (optBits & OPT_BIT_LOWER_LIMIT) != 0;
    }

    private boolean dimensionsIsSet() {
      return (optBits & OPT_BIT_DIMENSIONS) != 0;
    }

    private boolean originIsSet() {
      return (initBits & INIT_BIT_ORIGIN) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SampledData is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!originIsSet()) attributes.add("origin");
      return "Cannot build SampledData, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SampledData", generator = "Immutables")
  public interface OriginBuildStage {
    /**
     * Initializes the value for the {@link SampledData#origin() origin} attribute.
     * @param origin The value for origin 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal origin(com.fhir.Quantity origin);
  }

  @org.immutables.value.Generated(from = "SampledData", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SampledData#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link SampledData#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal upperLimit(com.fhir.decimal upperLimit);

    /**
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal upperLimit(java.util.Optional<? extends com.fhir.decimal> upperLimit);

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(com.fhir.decimal factor);

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(java.util.Optional<? extends com.fhir.decimal> factor);

    /**
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    BuildFinal data(java.lang.String data);

    /**
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal data(java.util.Optional<java.lang.String> data);

    /**
     * Initializes the optional value {@link SampledData#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.decimal period);

    /**
     * Initializes the optional value {@link SampledData#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.decimal> period);

    /**
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lowerLimit(com.fhir.decimal lowerLimit);

    /**
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lowerLimit(java.util.Optional<? extends com.fhir.decimal> lowerLimit);

    /**
     * Initializes the optional value {@link SampledData#dimensions() dimensions} to dimensions.
     * @param dimensions The value for dimensions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dimensions(com.fhir.positiveInt dimensions);

    /**
     * Initializes the optional value {@link SampledData#dimensions() dimensions} to dimensions.
     * @param dimensions The value for dimensions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dimensions(java.util.Optional<? extends com.fhir.positiveInt> dimensions);

    /**
     * Builds a new {@link SampledData SampledData}.
     * @return An immutable instance of SampledData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SampledData build();
  }
}
