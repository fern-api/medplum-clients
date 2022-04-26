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
 * Immutable implementation of {@link Money}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMoney.builder()}.
 */
@Generated(from = "Money", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMoney implements Money {
  private final @Nullable Code currency;
  private final @Nullable List<Extension> extension;
  private final @Nullable Decimal value;
  private final @Nullable String id;

  private ImmutableMoney(
      @Nullable Code currency,
      @Nullable List<Extension> extension,
      @Nullable Decimal value,
      @Nullable String id) {
    this.currency = currency;
    this.extension = extension;
    this.value = value;
    this.id = id;
  }

  /**
   * @return The value of the {@code currency} attribute
   */
  @JsonProperty("currency")
  @Override
  public Optional<Code> currency() {
    return Optional.ofNullable(currency);
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<Decimal> value() {
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#currency() currency} attribute.
   * @param value The value for currency
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withCurrency(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "currency");
    if (this.currency == newValue) return this;
    return new ImmutableMoney(newValue, this.extension, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#currency() currency} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for currency
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMoney withCurrency(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.currency == value) return this;
    return new ImmutableMoney(value, this.extension, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMoney(this.currency, newValue, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMoney withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMoney(this.currency, value, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableMoney(this.currency, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMoney withValue(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableMoney(this.currency, this.extension, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMoney(this.currency, this.extension, this.value, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMoney(this.currency, this.extension, this.value, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMoney} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMoney
        && equalTo((ImmutableMoney) another);
  }

  private boolean equalTo(ImmutableMoney another) {
    return Objects.equals(currency, another.currency)
        && Objects.equals(extension, another.extension)
        && Objects.equals(value, another.value)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code currency}, {@code extension}, {@code value}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(currency);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Money} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Money{");
    if (currency != null) {
      builder.append("currency=").append(currency);
    }
    if (extension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Money", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Money {
    @Nullable Optional<Code> currency = Optional.empty();
    boolean currencyIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("currency")
    public void setCurrency(Optional<Code> currency) {
      this.currency = currency;
      this.currencyIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Code> currency() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMoney fromJson(Json json) {
    ImmutableMoney.Builder builder = ImmutableMoney.builder();
    if (json.currencyIsSet) {
      builder.currency(json.currency);
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
    return (ImmutableMoney) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Money} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Money instance
   */
  public static Money copyOf(Money instance) {
    if (instance instanceof ImmutableMoney) {
      return (ImmutableMoney) instance;
    }
    return ImmutableMoney.builder()
        .currency(instance.currency())
        .extension(instance.extension())
        .value(instance.value())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Money Money}.
   * <pre>
   * ImmutableMoney.builder()
   *    .currency(com.fhir.types.fhir.Code) // optional {@link Money#currency() currency}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Money#extension() extension}
   *    .value(com.fhir.types.fhir.Decimal) // optional {@link Money#value() value}
   *    .id(String) // optional {@link Money#id() id}
   *    .build();
   * </pre>
   * @return A new Money builder
   */
  public static ImmutableMoney.Builder builder() {
    return new ImmutableMoney.Builder();
  }

  /**
   * Builds instances of type {@link Money Money}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Money", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CURRENCY = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_VALUE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long optBits;

    private @Nullable Code currency;
    private @Nullable List<Extension> extension;
    private @Nullable Decimal value;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Money#currency() currency} to currency.
     * @param currency The value for currency
     * @return {@code this} builder for chained invocation
     */
    public final Builder currency(Code currency) {
      checkNotIsSet(currencyIsSet(), "currency");
      this.currency = Objects.requireNonNull(currency, "currency");
      optBits |= OPT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Money#currency() currency} to currency.
     * @param currency The value for currency
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("currency")
    public final Builder currency(Optional<? extends Code> currency) {
      checkNotIsSet(currencyIsSet(), "currency");
      this.currency = currency.orElse(null);
      optBits |= OPT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Money#extension() extension} to extension.
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
     * Initializes the optional value {@link Money#extension() extension} to extension.
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
     * Initializes the optional value {@link Money#value() value} to value.
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
     * Initializes the optional value {@link Money#value() value} to value.
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
     * Initializes the optional value {@link Money#id() id} to id.
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
     * Initializes the optional value {@link Money#id() id} to id.
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
     * Builds a new {@link Money Money}.
     * @return An immutable instance of Money
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Money build() {
      return new ImmutableMoney(currency, extension, value, id);
    }

    private boolean currencyIsSet() {
      return (optBits & OPT_BIT_CURRENCY) != 0;
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

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Money is strict, attribute is already set: ".concat(name));
    }
  }
}
