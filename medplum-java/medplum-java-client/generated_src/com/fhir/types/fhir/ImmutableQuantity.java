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
 * Immutable implementation of {@link Quantity}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuantity.builder()}.
 */
@Generated(from = "Quantity", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuantity implements Quantity {
  private final @Nullable String id;
  private final @Nullable Decimal value;
  private final @Nullable QuantityComparator comparator;
  private final @Nullable Uri system;
  private final @Nullable String unit;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code code;

  private ImmutableQuantity(
      @Nullable String id,
      @Nullable Decimal value,
      @Nullable QuantityComparator comparator,
      @Nullable Uri system,
      @Nullable String unit,
      @Nullable List<Extension> extension,
      @Nullable Code code) {
    this.id = id;
    this.value = value;
    this.comparator = comparator;
    this.system = system;
    this.unit = unit;
    this.extension = extension;
    this.code = code;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<Decimal> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code comparator} attribute
   */
  @JsonProperty("comparator")
  @Override
  public Optional<QuantityComparator> comparator() {
    return Optional.ofNullable(comparator);
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
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public Optional<String> unit() {
    return Optional.ofNullable(unit);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Quantity#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableQuantity(newValue, this.value, this.comparator, this.system, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Quantity#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableQuantity(value, this.value, this.comparator, this.system, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Quantity#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableQuantity(this.id, newValue, this.comparator, this.system, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Quantity#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuantity withValue(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableQuantity(this.id, value, this.comparator, this.system, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Quantity#comparator() comparator} attribute.
   * @param value The value for comparator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withComparator(QuantityComparator value) {
    @Nullable QuantityComparator newValue = Objects.requireNonNull(value, "comparator");
    if (this.comparator == newValue) return this;
    return new ImmutableQuantity(this.id, this.value, newValue, this.system, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Quantity#comparator() comparator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comparator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuantity withComparator(Optional<? extends QuantityComparator> optional) {
    @Nullable QuantityComparator value = optional.orElse(null);
    if (this.comparator == value) return this;
    return new ImmutableQuantity(this.id, this.value, value, this.system, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Quantity#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withSystem(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, newValue, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Quantity#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuantity withSystem(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, value, this.unit, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Quantity#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withUnit(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "unit");
    if (Objects.equals(this.unit, newValue)) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, this.system, newValue, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Quantity#unit() unit} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withUnit(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.unit, value)) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, this.system, value, this.extension, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Quantity#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, this.system, this.unit, newValue, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Quantity#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuantity withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, this.system, this.unit, value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Quantity#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuantity withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, this.system, this.unit, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Quantity#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuantity withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableQuantity(this.id, this.value, this.comparator, this.system, this.unit, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuantity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuantity
        && equalTo((ImmutableQuantity) another);
  }

  private boolean equalTo(ImmutableQuantity another) {
    return Objects.equals(id, another.id)
        && Objects.equals(value, another.value)
        && Objects.equals(comparator, another.comparator)
        && Objects.equals(system, another.system)
        && Objects.equals(unit, another.unit)
        && Objects.equals(extension, another.extension)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code value}, {@code comparator}, {@code system}, {@code unit}, {@code extension}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(comparator);
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(unit);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code Quantity} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Quantity{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (value != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (comparator != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("comparator=").append(comparator);
    }
    if (system != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (unit != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("unit=").append(unit);
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
  @Generated(from = "Quantity", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Quantity {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<QuantityComparator> comparator = Optional.empty();
    boolean comparatorIsSet;
    @Nullable Optional<Uri> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<String> unit = Optional.empty();
    boolean unitIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("comparator")
    public void setComparator(Optional<QuantityComparator> comparator) {
      this.comparator = comparator;
      this.comparatorIsSet = true;
    }
    @JsonProperty("system")
    public void setSystem(Optional<Uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("unit")
    public void setUnit(Optional<String> unit) {
      this.unit = unit;
      this.unitIsSet = true;
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
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<QuantityComparator> comparator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> unit() { throw new UnsupportedOperationException(); }
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
  static ImmutableQuantity fromJson(Json json) {
    ImmutableQuantity.Builder builder = ImmutableQuantity.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.comparatorIsSet) {
      builder.comparator(json.comparator);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableQuantity) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Quantity} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Quantity instance
   */
  public static Quantity copyOf(Quantity instance) {
    if (instance instanceof ImmutableQuantity) {
      return (ImmutableQuantity) instance;
    }
    return ImmutableQuantity.builder()
        .id(instance.id())
        .value(instance.value())
        .comparator(instance.comparator())
        .system(instance.system())
        .unit(instance.unit())
        .extension(instance.extension())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link Quantity Quantity}.
   * <pre>
   * ImmutableQuantity.builder()
   *    .id(String) // optional {@link Quantity#id() id}
   *    .value(com.fhir.types.fhir.Decimal) // optional {@link Quantity#value() value}
   *    .comparator(com.fhir.types.fhir.QuantityComparator) // optional {@link Quantity#comparator() comparator}
   *    .system(com.fhir.types.fhir.Uri) // optional {@link Quantity#system() system}
   *    .unit(String) // optional {@link Quantity#unit() unit}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Quantity#extension() extension}
   *    .code(com.fhir.types.fhir.Code) // optional {@link Quantity#code() code}
   *    .build();
   * </pre>
   * @return A new Quantity builder
   */
  public static ImmutableQuantity.Builder builder() {
    return new ImmutableQuantity.Builder();
  }

  /**
   * Builds instances of type {@link Quantity Quantity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Quantity", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_COMPARATOR = 0x4L;
    private static final long OPT_BIT_SYSTEM = 0x8L;
    private static final long OPT_BIT_UNIT = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_CODE = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Decimal value;
    private @Nullable QuantityComparator comparator;
    private @Nullable Uri system;
    private @Nullable String unit;
    private @Nullable List<Extension> extension;
    private @Nullable Code code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Quantity#id() id} to id.
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
     * Initializes the optional value {@link Quantity#id() id} to id.
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
     * Initializes the optional value {@link Quantity#value() value} to value.
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
     * Initializes the optional value {@link Quantity#value() value} to value.
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
     * Initializes the optional value {@link Quantity#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    public final Builder comparator(QuantityComparator comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = Objects.requireNonNull(comparator, "comparator");
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Quantity#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comparator")
    public final Builder comparator(Optional<? extends QuantityComparator> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = comparator.orElse(null);
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Quantity#system() system} to system.
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
     * Initializes the optional value {@link Quantity#system() system} to system.
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
     * Initializes the optional value {@link Quantity#unit() unit} to unit.
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
     * Initializes the optional value {@link Quantity#unit() unit} to unit.
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
     * Initializes the optional value {@link Quantity#extension() extension} to extension.
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
     * Initializes the optional value {@link Quantity#extension() extension} to extension.
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
     * Initializes the optional value {@link Quantity#code() code} to code.
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
     * Initializes the optional value {@link Quantity#code() code} to code.
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
     * Builds a new {@link Quantity Quantity}.
     * @return An immutable instance of Quantity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Quantity build() {
      return new ImmutableQuantity(id, value, comparator, system, unit, extension, code);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean comparatorIsSet() {
      return (optBits & OPT_BIT_COMPARATOR) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Quantity is strict, attribute is already set: ".concat(name));
    }
  }
}
