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
 * Immutable implementation of {@link Range}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRange.builder()}.
 */
@Generated(from = "Range", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRange implements Range {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Quantity low;
  private final @Nullable Quantity high;

  private ImmutableRange(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Quantity low,
      @Nullable Quantity high) {
    this.id = id;
    this.extension = extension;
    this.low = low;
    this.high = high;
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
   * @return The value of the {@code low} attribute
   */
  @JsonProperty("low")
  @Override
  public Optional<Quantity> low() {
    return Optional.ofNullable(low);
  }

  /**
   * @return The value of the {@code high} attribute
   */
  @JsonProperty("high")
  @Override
  public Optional<Quantity> high() {
    return Optional.ofNullable(high);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Range#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRange withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRange(newValue, this.extension, this.low, this.high);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Range#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRange withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRange(value, this.extension, this.low, this.high);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Range#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRange withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRange(this.id, newValue, this.low, this.high);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Range#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRange withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRange(this.id, value, this.low, this.high);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Range#low() low} attribute.
   * @param value The value for low
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRange withLow(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "low");
    if (this.low == newValue) return this;
    return new ImmutableRange(this.id, this.extension, newValue, this.high);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Range#low() low} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for low
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRange withLow(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.low == value) return this;
    return new ImmutableRange(this.id, this.extension, value, this.high);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Range#high() high} attribute.
   * @param value The value for high
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRange withHigh(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "high");
    if (this.high == newValue) return this;
    return new ImmutableRange(this.id, this.extension, this.low, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Range#high() high} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for high
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRange withHigh(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.high == value) return this;
    return new ImmutableRange(this.id, this.extension, this.low, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRange} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRange
        && equalTo((ImmutableRange) another);
  }

  private boolean equalTo(ImmutableRange another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(low, another.low)
        && Objects.equals(high, another.high);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code low}, {@code high}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(low);
    h += (h << 5) + Objects.hashCode(high);
    return h;
  }

  /**
   * Prints the immutable value {@code Range} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Range{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (low != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("low=").append(low);
    }
    if (high != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("high=").append(high);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Range", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Range {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Quantity> low = Optional.empty();
    boolean lowIsSet;
    @Nullable Optional<Quantity> high = Optional.empty();
    boolean highIsSet;
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
    @JsonProperty("low")
    public void setLow(Optional<Quantity> low) {
      this.low = low;
      this.lowIsSet = true;
    }
    @JsonProperty("high")
    public void setHigh(Optional<Quantity> high) {
      this.high = high;
      this.highIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> low() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> high() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRange fromJson(Json json) {
    ImmutableRange.Builder builder = ImmutableRange.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.lowIsSet) {
      builder.low(json.low);
    }
    if (json.highIsSet) {
      builder.high(json.high);
    }
    return (ImmutableRange) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Range} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Range instance
   */
  public static Range copyOf(Range instance) {
    if (instance instanceof ImmutableRange) {
      return (ImmutableRange) instance;
    }
    return ImmutableRange.builder()
        .id(instance.id())
        .extension(instance.extension())
        .low(instance.low())
        .high(instance.high())
        .build();
  }

  /**
   * Creates a builder for {@link Range Range}.
   * <pre>
   * ImmutableRange.builder()
   *    .id(String) // optional {@link Range#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Range#extension() extension}
   *    .low(com.fhir.types.fhir.Quantity) // optional {@link Range#low() low}
   *    .high(com.fhir.types.fhir.Quantity) // optional {@link Range#high() high}
   *    .build();
   * </pre>
   * @return A new Range builder
   */
  public static ImmutableRange.Builder builder() {
    return new ImmutableRange.Builder();
  }

  /**
   * Builds instances of type {@link Range Range}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Range", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_LOW = 0x4L;
    private static final long OPT_BIT_HIGH = 0x8L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Quantity low;
    private @Nullable Quantity high;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Range#id() id} to id.
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
     * Initializes the optional value {@link Range#id() id} to id.
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
     * Initializes the optional value {@link Range#extension() extension} to extension.
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
     * Initializes the optional value {@link Range#extension() extension} to extension.
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
     * Initializes the optional value {@link Range#low() low} to low.
     * @param low The value for low
     * @return {@code this} builder for chained invocation
     */
    public final Builder low(Quantity low) {
      checkNotIsSet(lowIsSet(), "low");
      this.low = Objects.requireNonNull(low, "low");
      optBits |= OPT_BIT_LOW;
      return this;
    }

    /**
     * Initializes the optional value {@link Range#low() low} to low.
     * @param low The value for low
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("low")
    public final Builder low(Optional<? extends Quantity> low) {
      checkNotIsSet(lowIsSet(), "low");
      this.low = low.orElse(null);
      optBits |= OPT_BIT_LOW;
      return this;
    }

    /**
     * Initializes the optional value {@link Range#high() high} to high.
     * @param high The value for high
     * @return {@code this} builder for chained invocation
     */
    public final Builder high(Quantity high) {
      checkNotIsSet(highIsSet(), "high");
      this.high = Objects.requireNonNull(high, "high");
      optBits |= OPT_BIT_HIGH;
      return this;
    }

    /**
     * Initializes the optional value {@link Range#high() high} to high.
     * @param high The value for high
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("high")
    public final Builder high(Optional<? extends Quantity> high) {
      checkNotIsSet(highIsSet(), "high");
      this.high = high.orElse(null);
      optBits |= OPT_BIT_HIGH;
      return this;
    }

    /**
     * Builds a new {@link Range Range}.
     * @return An immutable instance of Range
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Range build() {
      return new ImmutableRange(id, extension, low, high);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean lowIsSet() {
      return (optBits & OPT_BIT_LOW) != 0;
    }

    private boolean highIsSet() {
      return (optBits & OPT_BIT_HIGH) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Range is strict, attribute is already set: ".concat(name));
    }
  }
}
