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
 * Immutable implementation of {@link Distance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDistance.builder()}.
 */
@Generated(from = "Distance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDistance implements Distance {
  private final @Nullable Uri system;
  private final @Nullable DistanceComparator comparator;
  private final @Nullable Decimal value;
  private final @Nullable String unit;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code code;

  private ImmutableDistance(
      @Nullable Uri system,
      @Nullable DistanceComparator comparator,
      @Nullable Decimal value,
      @Nullable String unit,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Code code) {
    this.system = system;
    this.comparator = comparator;
    this.value = value;
    this.unit = unit;
    this.id = id;
    this.extension = extension;
    this.code = code;
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<Uri> system() {
    return Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code comparator} attribute
   */
  @JsonProperty("comparator")
  @Override
  public Optional<DistanceComparator> comparator() {
    return Optional.ofNullable(comparator);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<Decimal> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public Optional<String> unit() {
    return Optional.ofNullable(unit);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Distance#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withSystem(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableDistance(newValue, this.comparator, this.value, this.unit, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Distance#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDistance withSystem(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableDistance(value, this.comparator, this.value, this.unit, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Distance#comparator() comparator} attribute.
   * @param value The value for comparator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withComparator(DistanceComparator value) {
    @Nullable DistanceComparator newValue = Objects.requireNonNull(value, "comparator");
    if (this.comparator == newValue) return this;
    return new ImmutableDistance(this.system, newValue, this.value, this.unit, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Distance#comparator() comparator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comparator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDistance withComparator(Optional<? extends DistanceComparator> optional) {
    @Nullable DistanceComparator value = optional.orElse(null);
    if (this.comparator == value) return this;
    return new ImmutableDistance(this.system, value, this.value, this.unit, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Distance#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableDistance(this.system, this.comparator, newValue, this.unit, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Distance#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDistance withValue(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableDistance(this.system, this.comparator, value, this.unit, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Distance#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withUnit(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "unit");
    if (Objects.equals(this.unit, newValue)) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, newValue, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Distance#unit() unit} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withUnit(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.unit, value)) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, value, this.id, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Distance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, this.unit, newValue, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Distance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, this.unit, value, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Distance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, this.unit, this.id, newValue, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Distance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDistance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, this.unit, this.id, value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Distance#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDistance withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, this.unit, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Distance#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDistance withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDistance(this.system, this.comparator, this.value, this.unit, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDistance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDistance
        && equalTo((ImmutableDistance) another);
  }

  private boolean equalTo(ImmutableDistance another) {
    return Objects.equals(system, another.system)
        && Objects.equals(comparator, another.comparator)
        && Objects.equals(value, another.value)
        && Objects.equals(unit, another.unit)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code system}, {@code comparator}, {@code value}, {@code unit}, {@code id}, {@code extension}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(comparator);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(unit);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code Distance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Distance{");
    if (system != null) {
      builder.append("system=").append(system);
    }
    if (comparator != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("comparator=").append(comparator);
    }
    if (value != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (unit != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("unit=").append(unit);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Distance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Distance {
    @Nullable Optional<Uri> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<DistanceComparator> comparator = Optional.empty();
    boolean comparatorIsSet;
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> unit = Optional.empty();
    boolean unitIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @JsonProperty("system")
    public void setSystem(Optional<Uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("comparator")
    public void setComparator(Optional<DistanceComparator> comparator) {
      this.comparator = comparator;
      this.comparatorIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("unit")
    public void setUnit(Optional<String> unit) {
      this.unit = unit;
      this.unitIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<Uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DistanceComparator> comparator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> unit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDistance fromJson(Json json) {
    ImmutableDistance.Builder builder = ImmutableDistance.builder();
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.comparatorIsSet) {
      builder.comparator(json.comparator);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableDistance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Distance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Distance instance
   */
  public static Distance copyOf(Distance instance) {
    if (instance instanceof ImmutableDistance) {
      return (ImmutableDistance) instance;
    }
    return ImmutableDistance.builder()
        .system(instance.system())
        .comparator(instance.comparator())
        .value(instance.value())
        .unit(instance.unit())
        .id(instance.id())
        .extension(instance.extension())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link Distance Distance}.
   * <pre>
   * ImmutableDistance.builder()
   *    .system(com.fhir.types.fhir.Uri) // optional {@link Distance#system() system}
   *    .comparator(com.fhir.types.fhir.DistanceComparator) // optional {@link Distance#comparator() comparator}
   *    .value(com.fhir.types.fhir.Decimal) // optional {@link Distance#value() value}
   *    .unit(String) // optional {@link Distance#unit() unit}
   *    .id(String) // optional {@link Distance#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Distance#extension() extension}
   *    .code(com.fhir.types.fhir.Code) // optional {@link Distance#code() code}
   *    .build();
   * </pre>
   * @return A new Distance builder
   */
  public static ImmutableDistance.Builder builder() {
    return new ImmutableDistance.Builder();
  }

  /**
   * Builds instances of type {@link Distance Distance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Distance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SYSTEM = 0x1L;
    private static final long OPT_BIT_COMPARATOR = 0x2L;
    private static final long OPT_BIT_VALUE = 0x4L;
    private static final long OPT_BIT_UNIT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_CODE = 0x40L;
    private long optBits;

    private @Nullable Uri system;
    private @Nullable DistanceComparator comparator;
    private @Nullable Decimal value;
    private @Nullable String unit;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Code code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Distance#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(Uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<? extends Uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    public final Builder comparator(DistanceComparator comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = Objects.requireNonNull(comparator, "comparator");
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comparator")
    public final Builder comparator(Optional<? extends DistanceComparator> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = comparator.orElse(null);
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(Decimal value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends Decimal> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(String unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unit")
    public final Builder unit(Optional<String> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#id() id} to id.
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
     * Initializes the optional value {@link Distance#id() id} to id.
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
     * Initializes the optional value {@link Distance#extension() extension} to extension.
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
     * Initializes the optional value {@link Distance#extension() extension} to extension.
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
     * Initializes the optional value {@link Distance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Distance#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link Distance Distance}.
     * @return An immutable instance of Distance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Distance build() {
      return new ImmutableDistance(system, comparator, value, unit, id, extension, code);
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean comparatorIsSet() {
      return (optBits & OPT_BIT_COMPARATOR) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Distance is strict, attribute is already set: ".concat(name));
    }
  }
}
