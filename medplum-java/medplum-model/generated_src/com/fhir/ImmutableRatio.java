package com.fhir;

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
 * Immutable implementation of {@link Ratio}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRatio.builder()}.
 */
@Generated(from = "Ratio", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRatio implements Ratio {
  private final @Nullable Quantity denominator;
  private final @Nullable Quantity numerator;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableRatio(
      @Nullable Quantity denominator,
      @Nullable Quantity numerator,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.denominator = denominator;
    this.numerator = numerator;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code denominator} attribute
   */
  @JsonProperty("denominator")
  @Override
  public Optional<Quantity> denominator() {
    return Optional.ofNullable(denominator);
  }

  /**
   * @return The value of the {@code numerator} attribute
   */
  @JsonProperty("numerator")
  @Override
  public Optional<Quantity> numerator() {
    return Optional.ofNullable(numerator);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Ratio#denominator() denominator} attribute.
   * @param value The value for denominator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatio withDenominator(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "denominator");
    if (this.denominator == newValue) return this;
    return new ImmutableRatio(newValue, this.numerator, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Ratio#denominator() denominator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for denominator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRatio withDenominator(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.denominator == value) return this;
    return new ImmutableRatio(value, this.numerator, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Ratio#numerator() numerator} attribute.
   * @param value The value for numerator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatio withNumerator(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "numerator");
    if (this.numerator == newValue) return this;
    return new ImmutableRatio(this.denominator, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Ratio#numerator() numerator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numerator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRatio withNumerator(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.numerator == value) return this;
    return new ImmutableRatio(this.denominator, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Ratio#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatio withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRatio(this.denominator, this.numerator, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Ratio#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatio withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRatio(this.denominator, this.numerator, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Ratio#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRatio withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRatio(this.denominator, this.numerator, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Ratio#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRatio withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRatio(this.denominator, this.numerator, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRatio} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRatio
        && equalTo((ImmutableRatio) another);
  }

  private boolean equalTo(ImmutableRatio another) {
    return Objects.equals(denominator, another.denominator)
        && Objects.equals(numerator, another.numerator)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code denominator}, {@code numerator}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(denominator);
    h += (h << 5) + Objects.hashCode(numerator);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Ratio} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Ratio{");
    if (denominator != null) {
      builder.append("denominator=").append(denominator);
    }
    if (numerator != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("numerator=").append(numerator);
    }
    if (id != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Ratio", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Ratio {
    @Nullable Optional<Quantity> denominator = Optional.empty();
    boolean denominatorIsSet;
    @Nullable Optional<Quantity> numerator = Optional.empty();
    boolean numeratorIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("denominator")
    public void setDenominator(Optional<Quantity> denominator) {
      this.denominator = denominator;
      this.denominatorIsSet = true;
    }
    @JsonProperty("numerator")
    public void setNumerator(Optional<Quantity> numerator) {
      this.numerator = numerator;
      this.numeratorIsSet = true;
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
    @Override
    public Optional<Quantity> denominator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> numerator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRatio fromJson(Json json) {
    ImmutableRatio.Builder builder = ImmutableRatio.builder();
    if (json.denominatorIsSet) {
      builder.denominator(json.denominator);
    }
    if (json.numeratorIsSet) {
      builder.numerator(json.numerator);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableRatio) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Ratio} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Ratio instance
   */
  public static Ratio copyOf(Ratio instance) {
    if (instance instanceof ImmutableRatio) {
      return (ImmutableRatio) instance;
    }
    return ImmutableRatio.builder()
        .denominator(instance.denominator())
        .numerator(instance.numerator())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Ratio Ratio}.
   * <pre>
   * ImmutableRatio.builder()
   *    .denominator(com.fhir.Quantity) // optional {@link Ratio#denominator() denominator}
   *    .numerator(com.fhir.Quantity) // optional {@link Ratio#numerator() numerator}
   *    .id(String) // optional {@link Ratio#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Ratio#extension() extension}
   *    .build();
   * </pre>
   * @return A new Ratio builder
   */
  public static ImmutableRatio.Builder builder() {
    return new ImmutableRatio.Builder();
  }

  /**
   * Builds instances of type {@link Ratio Ratio}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Ratio", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DENOMINATOR = 0x1L;
    private static final long OPT_BIT_NUMERATOR = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long optBits;

    private @Nullable Quantity denominator;
    private @Nullable Quantity numerator;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Ratio#denominator() denominator} to denominator.
     * @param denominator The value for denominator
     * @return {@code this} builder for chained invocation
     */
    public final Builder denominator(Quantity denominator) {
      checkNotIsSet(denominatorIsSet(), "denominator");
      this.denominator = Objects.requireNonNull(denominator, "denominator");
      optBits |= OPT_BIT_DENOMINATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Ratio#denominator() denominator} to denominator.
     * @param denominator The value for denominator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("denominator")
    public final Builder denominator(Optional<? extends Quantity> denominator) {
      checkNotIsSet(denominatorIsSet(), "denominator");
      this.denominator = denominator.orElse(null);
      optBits |= OPT_BIT_DENOMINATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Ratio#numerator() numerator} to numerator.
     * @param numerator The value for numerator
     * @return {@code this} builder for chained invocation
     */
    public final Builder numerator(Quantity numerator) {
      checkNotIsSet(numeratorIsSet(), "numerator");
      this.numerator = Objects.requireNonNull(numerator, "numerator");
      optBits |= OPT_BIT_NUMERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Ratio#numerator() numerator} to numerator.
     * @param numerator The value for numerator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numerator")
    public final Builder numerator(Optional<? extends Quantity> numerator) {
      checkNotIsSet(numeratorIsSet(), "numerator");
      this.numerator = numerator.orElse(null);
      optBits |= OPT_BIT_NUMERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Ratio#id() id} to id.
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
     * Initializes the optional value {@link Ratio#id() id} to id.
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
     * Initializes the optional value {@link Ratio#extension() extension} to extension.
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
     * Initializes the optional value {@link Ratio#extension() extension} to extension.
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
     * Builds a new {@link Ratio Ratio}.
     * @return An immutable instance of Ratio
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Ratio build() {
      return new ImmutableRatio(denominator, numerator, id, extension);
    }

    private boolean denominatorIsSet() {
      return (optBits & OPT_BIT_DENOMINATOR) != 0;
    }

    private boolean numeratorIsSet() {
      return (optBits & OPT_BIT_NUMERATOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Ratio is strict, attribute is already set: ".concat(name));
    }
  }
}
