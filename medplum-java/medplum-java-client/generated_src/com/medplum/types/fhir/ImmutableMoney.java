package com.medplum.types.fhir;

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
  private final @Nullable String id;
  private final @Nullable Decimal value;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code currency;

  private ImmutableMoney(
      @Nullable String id,
      @Nullable Decimal value,
      @Nullable List<Extension> extension,
      @Nullable Code currency) {
    this.id = id;
    this.value = value;
    this.extension = extension;
    this.currency = currency;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMoney(newValue, this.value, this.extension, this.currency);
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
    return new ImmutableMoney(value, this.value, this.extension, this.currency);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableMoney(this.id, newValue, this.extension, this.currency);
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
    return new ImmutableMoney(this.id, value, this.extension, this.currency);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMoney(this.id, this.value, newValue, this.currency);
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
    return new ImmutableMoney(this.id, this.value, value, this.currency);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#currency() currency} attribute.
   * @param value The value for currency
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withCurrency(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "currency");
    if (this.currency == newValue) return this;
    return new ImmutableMoney(this.id, this.value, this.extension, newValue);
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
    return new ImmutableMoney(this.id, this.value, this.extension, value);
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
    return Objects.equals(id, another.id)
        && Objects.equals(value, another.value)
        && Objects.equals(extension, another.extension)
        && Objects.equals(currency, another.currency);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code value}, {@code extension}, {@code currency}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(currency);
    return h;
  }

  /**
   * Prints the immutable value {@code Money} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Money{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (value != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (extension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (currency != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("currency=").append(currency);
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
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> currency = Optional.empty();
    boolean currencyIsSet;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("currency")
    public void setCurrency(Optional<Code> currency) {
      this.currency = currency;
      this.currencyIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> currency() { throw new UnsupportedOperationException(); }
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
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.currencyIsSet) {
      builder.currency(json.currency);
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
        .id(instance.id())
        .value(instance.value())
        .extension(instance.extension())
        .currency(instance.currency())
        .build();
  }

  /**
   * Creates a builder for {@link Money Money}.
   * <pre>
   * ImmutableMoney.builder()
   *    .id(String) // optional {@link Money#id() id}
   *    .value(com.medplum.types.fhir.Decimal) // optional {@link Money#value() value}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Money#extension() extension}
   *    .currency(com.medplum.types.fhir.Code) // optional {@link Money#currency() currency}
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
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_CURRENCY = 0x8L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Decimal value;
    private @Nullable List<Extension> extension;
    private @Nullable Code currency;

    private Builder() {
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
     * Builds a new {@link Money Money}.
     * @return An immutable instance of Money
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Money build() {
      return new ImmutableMoney(id, value, extension, currency);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean currencyIsSet() {
      return (optBits & OPT_BIT_CURRENCY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Money is strict, attribute is already set: ".concat(name));
    }
  }
}
