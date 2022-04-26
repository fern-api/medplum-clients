package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link SampledData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSampledData.builder()}.
 */
@Generated(from = "SampledData", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSampledData implements SampledData {
  private final @Nullable Decimal upperLimit;
  private final Quantity origin;
  private final @Nullable Decimal lowerLimit;
  private final @Nullable PositiveInt dimensions;
  private final @Nullable Decimal factor;
  private final @Nullable String id;
  private final @Nullable String data;
  private final @Nullable List<Extension> extension;
  private final @Nullable Decimal period;

  private ImmutableSampledData(
      @Nullable Decimal upperLimit,
      Quantity origin,
      @Nullable Decimal lowerLimit,
      @Nullable PositiveInt dimensions,
      @Nullable Decimal factor,
      @Nullable String id,
      @Nullable String data,
      @Nullable List<Extension> extension,
      @Nullable Decimal period) {
    this.upperLimit = upperLimit;
    this.origin = origin;
    this.lowerLimit = lowerLimit;
    this.dimensions = dimensions;
    this.factor = factor;
    this.id = id;
    this.data = data;
    this.extension = extension;
    this.period = period;
  }

  /**
   * @return The value of the {@code upperLimit} attribute
   */
  @JsonProperty("upperLimit")
  @Override
  public Optional<Decimal> upperLimit() {
    return Optional.ofNullable(upperLimit);
  }

  /**
   * @return The value of the {@code origin} attribute
   */
  @JsonProperty("origin")
  @Override
  public Quantity origin() {
    return origin;
  }

  /**
   * @return The value of the {@code lowerLimit} attribute
   */
  @JsonProperty("lowerLimit")
  @Override
  public Optional<Decimal> lowerLimit() {
    return Optional.ofNullable(lowerLimit);
  }

  /**
   * @return The value of the {@code dimensions} attribute
   */
  @JsonProperty("dimensions")
  @Override
  public Optional<PositiveInt> dimensions() {
    return Optional.ofNullable(dimensions);
  }

  /**
   * @return The value of the {@code factor} attribute
   */
  @JsonProperty("factor")
  @Override
  public Optional<Decimal> factor() {
    return Optional.ofNullable(factor);
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
   * @return The value of the {@code data} attribute
   */
  @JsonProperty("data")
  @Override
  public Optional<String> data() {
    return Optional.ofNullable(data);
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
  public Optional<Decimal> period() {
    return Optional.ofNullable(period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#upperLimit() upperLimit} attribute.
   * @param value The value for upperLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withUpperLimit(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "upperLimit");
    if (this.upperLimit == newValue) return this;
    return new ImmutableSampledData(
        newValue,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#upperLimit() upperLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for upperLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withUpperLimit(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.upperLimit == value) return this;
    return new ImmutableSampledData(
        value,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SampledData#origin() origin} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for origin
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSampledData withOrigin(Quantity value) {
    if (this.origin == value) return this;
    Quantity newValue = Objects.requireNonNull(value, "origin");
    return new ImmutableSampledData(
        this.upperLimit,
        newValue,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#lowerLimit() lowerLimit} attribute.
   * @param value The value for lowerLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withLowerLimit(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "lowerLimit");
    if (this.lowerLimit == newValue) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        newValue,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#lowerLimit() lowerLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lowerLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withLowerLimit(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.lowerLimit == value) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        value,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#dimensions() dimensions} attribute.
   * @param value The value for dimensions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withDimensions(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "dimensions");
    if (this.dimensions == newValue) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        newValue,
        this.factor,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#dimensions() dimensions} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dimensions
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withDimensions(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.dimensions == value) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        value,
        this.factor,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        newValue,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        value,
        this.id,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        newValue,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        value,
        this.data,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withData(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "data");
    if (Objects.equals(this.data, newValue)) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        newValue,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#data() data} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withData(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.data, value)) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        value,
        this.extension,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        value,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SampledData#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSampledData withPeriod(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SampledData#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSampledData withPeriod(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableSampledData(
        this.upperLimit,
        this.origin,
        this.lowerLimit,
        this.dimensions,
        this.factor,
        this.id,
        this.data,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSampledData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSampledData
        && equalTo((ImmutableSampledData) another);
  }

  private boolean equalTo(ImmutableSampledData another) {
    return Objects.equals(upperLimit, another.upperLimit)
        && origin.equals(another.origin)
        && Objects.equals(lowerLimit, another.lowerLimit)
        && Objects.equals(dimensions, another.dimensions)
        && Objects.equals(factor, another.factor)
        && Objects.equals(id, another.id)
        && Objects.equals(data, another.data)
        && Objects.equals(extension, another.extension)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code upperLimit}, {@code origin}, {@code lowerLimit}, {@code dimensions}, {@code factor}, {@code id}, {@code data}, {@code extension}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(upperLimit);
    h += (h << 5) + origin.hashCode();
    h += (h << 5) + Objects.hashCode(lowerLimit);
    h += (h << 5) + Objects.hashCode(dimensions);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(data);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code SampledData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SampledData{");
    if (upperLimit != null) {
      builder.append("upperLimit=").append(upperLimit);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("origin=").append(origin);
    if (lowerLimit != null) {
      builder.append(", ");
      builder.append("lowerLimit=").append(lowerLimit);
    }
    if (dimensions != null) {
      builder.append(", ");
      builder.append("dimensions=").append(dimensions);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (data != null) {
      builder.append(", ");
      builder.append("data=").append(data);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SampledData", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SampledData {
    @Nullable Optional<Decimal> upperLimit = Optional.empty();
    boolean upperLimitIsSet;
    @Nullable Quantity origin;
    @Nullable Optional<Decimal> lowerLimit = Optional.empty();
    boolean lowerLimitIsSet;
    @Nullable Optional<PositiveInt> dimensions = Optional.empty();
    boolean dimensionsIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> data = Optional.empty();
    boolean dataIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Decimal> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("upperLimit")
    public void setUpperLimit(Optional<Decimal> upperLimit) {
      this.upperLimit = upperLimit;
      this.upperLimitIsSet = true;
    }
    @JsonProperty("origin")
    public void setOrigin(Quantity origin) {
      this.origin = origin;
    }
    @JsonProperty("lowerLimit")
    public void setLowerLimit(Optional<Decimal> lowerLimit) {
      this.lowerLimit = lowerLimit;
      this.lowerLimitIsSet = true;
    }
    @JsonProperty("dimensions")
    public void setDimensions(Optional<PositiveInt> dimensions) {
      this.dimensions = dimensions;
      this.dimensionsIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("data")
    public void setData(Optional<String> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Decimal> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<Decimal> upperLimit() { throw new UnsupportedOperationException(); }
    @Override
    public Quantity origin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> lowerLimit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> dimensions() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> data() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableSampledData fromJson(Json json) {
    ImmutableSampledData.Builder builder = ((ImmutableSampledData.Builder) ImmutableSampledData.builder());
    if (json.upperLimitIsSet) {
      builder.upperLimit(json.upperLimit);
    }
    if (json.origin != null) {
      builder.origin(json.origin);
    }
    if (json.lowerLimitIsSet) {
      builder.lowerLimit(json.lowerLimit);
    }
    if (json.dimensionsIsSet) {
      builder.dimensions(json.dimensions);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
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
        .upperLimit(instance.upperLimit())
        .origin(instance.origin())
        .lowerLimit(instance.lowerLimit())
        .dimensions(instance.dimensions())
        .factor(instance.factor())
        .id(instance.id())
        .data(instance.data())
        .extension(instance.extension())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link SampledData SampledData}.
   * <pre>
   * ImmutableSampledData.builder()
   *    .upperLimit(com.fhir.types.fhir.Decimal) // optional {@link SampledData#upperLimit() upperLimit}
   *    .origin(com.fhir.types.fhir.Quantity) // required {@link SampledData#origin() origin}
   *    .lowerLimit(com.fhir.types.fhir.Decimal) // optional {@link SampledData#lowerLimit() lowerLimit}
   *    .dimensions(com.fhir.types.fhir.PositiveInt) // optional {@link SampledData#dimensions() dimensions}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link SampledData#factor() factor}
   *    .id(String) // optional {@link SampledData#id() id}
   *    .data(String) // optional {@link SampledData#data() data}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SampledData#extension() extension}
   *    .period(com.fhir.types.fhir.Decimal) // optional {@link SampledData#period() period}
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
  @Generated(from = "SampledData", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements OriginBuildStage, BuildFinal {
    private static final long INIT_BIT_ORIGIN = 0x1L;
    private static final long OPT_BIT_UPPER_LIMIT = 0x1L;
    private static final long OPT_BIT_LOWER_LIMIT = 0x2L;
    private static final long OPT_BIT_DIMENSIONS = 0x4L;
    private static final long OPT_BIT_FACTOR = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_DATA = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_PERIOD = 0x80L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Decimal upperLimit;
    private @Nullable Quantity origin;
    private @Nullable Decimal lowerLimit;
    private @Nullable PositiveInt dimensions;
    private @Nullable Decimal factor;
    private @Nullable String id;
    private @Nullable String data;
    private @Nullable List<Extension> extension;
    private @Nullable Decimal period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder upperLimit(Decimal upperLimit) {
      checkNotIsSet(upperLimitIsSet(), "upperLimit");
      this.upperLimit = Objects.requireNonNull(upperLimit, "upperLimit");
      optBits |= OPT_BIT_UPPER_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("upperLimit")
    public final Builder upperLimit(Optional<? extends Decimal> upperLimit) {
      checkNotIsSet(upperLimitIsSet(), "upperLimit");
      this.upperLimit = upperLimit.orElse(null);
      optBits |= OPT_BIT_UPPER_LIMIT;
      return this;
    }

    /**
     * Initializes the value for the {@link SampledData#origin() origin} attribute.
     * @param origin The value for origin 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("origin")
    public final Builder origin(Quantity origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = Objects.requireNonNull(origin, "origin");
      initBits &= ~INIT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder lowerLimit(Decimal lowerLimit) {
      checkNotIsSet(lowerLimitIsSet(), "lowerLimit");
      this.lowerLimit = Objects.requireNonNull(lowerLimit, "lowerLimit");
      optBits |= OPT_BIT_LOWER_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lowerLimit")
    public final Builder lowerLimit(Optional<? extends Decimal> lowerLimit) {
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
    public final Builder dimensions(PositiveInt dimensions) {
      checkNotIsSet(dimensionsIsSet(), "dimensions");
      this.dimensions = Objects.requireNonNull(dimensions, "dimensions");
      optBits |= OPT_BIT_DIMENSIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#dimensions() dimensions} to dimensions.
     * @param dimensions The value for dimensions
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dimensions")
    public final Builder dimensions(Optional<? extends PositiveInt> dimensions) {
      checkNotIsSet(dimensionsIsSet(), "dimensions");
      this.dimensions = dimensions.orElse(null);
      optBits |= OPT_BIT_DIMENSIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    public final Builder factor(Decimal factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = Objects.requireNonNull(factor, "factor");
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("factor")
    public final Builder factor(Optional<? extends Decimal> factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = factor.orElse(null);
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#id() id} to id.
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
     * Initializes the optional value {@link SampledData#id() id} to id.
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
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(String data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("data")
    public final Builder data(Optional<String> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
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
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
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
     * Initializes the optional value {@link SampledData#period() period} to period.
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
     * Initializes the optional value {@link SampledData#period() period} to period.
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
     * Builds a new {@link SampledData SampledData}.
     * @return An immutable instance of SampledData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SampledData build() {
      checkRequiredAttributes();
      return new ImmutableSampledData(upperLimit, origin, lowerLimit, dimensions, factor, id, data, extension, period);
    }

    private boolean upperLimitIsSet() {
      return (optBits & OPT_BIT_UPPER_LIMIT) != 0;
    }

    private boolean lowerLimitIsSet() {
      return (optBits & OPT_BIT_LOWER_LIMIT) != 0;
    }

    private boolean dimensionsIsSet() {
      return (optBits & OPT_BIT_DIMENSIONS) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean originIsSet() {
      return (initBits & INIT_BIT_ORIGIN) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SampledData is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!originIsSet()) attributes.add("origin");
      return "Cannot build SampledData, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SampledData", generator = "Immutables")
  public interface OriginBuildStage {
    /**
     * Initializes the value for the {@link SampledData#origin() origin} attribute.
     * @param origin The value for origin 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal origin(Quantity origin);
  }

  @Generated(from = "SampledData", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal upperLimit(Decimal upperLimit);

    /**
     * Initializes the optional value {@link SampledData#upperLimit() upperLimit} to upperLimit.
     * @param upperLimit The value for upperLimit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal upperLimit(Optional<? extends Decimal> upperLimit);

    /**
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lowerLimit(Decimal lowerLimit);

    /**
     * Initializes the optional value {@link SampledData#lowerLimit() lowerLimit} to lowerLimit.
     * @param lowerLimit The value for lowerLimit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lowerLimit(Optional<? extends Decimal> lowerLimit);

    /**
     * Initializes the optional value {@link SampledData#dimensions() dimensions} to dimensions.
     * @param dimensions The value for dimensions
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dimensions(PositiveInt dimensions);

    /**
     * Initializes the optional value {@link SampledData#dimensions() dimensions} to dimensions.
     * @param dimensions The value for dimensions
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dimensions(Optional<? extends PositiveInt> dimensions);

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link SampledData#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Initializes the optional value {@link SampledData#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link SampledData#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    BuildFinal data(String data);

    /**
     * Initializes the optional value {@link SampledData#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal data(Optional<String> data);

    /**
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SampledData#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SampledData#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Decimal period);

    /**
     * Initializes the optional value {@link SampledData#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Decimal> period);

    /**
     * Builds a new {@link SampledData SampledData}.
     * @return An immutable instance of SampledData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SampledData build();
  }
}
