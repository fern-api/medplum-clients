//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Money}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMoney.builder()}.
 */
@org.immutables.value.Generated(from = "Money", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMoney implements com.fhir.Money {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code currency;
  private final @javax.annotation.Nullable com.fhir.decimal value;

  private ImmutableMoney(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code currency,
      @javax.annotation.Nullable com.fhir.decimal value) {
    this.id = id;
    this.extension = extension;
    this.currency = currency;
    this.value = value;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code currency} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("currency")
  @Override
  public java.util.Optional<com.fhir.code> currency() {
    return java.util.Optional.ofNullable(currency);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMoney(newValue, this.extension, this.currency, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMoney(value, this.extension, this.currency, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMoney(this.id, newValue, this.currency, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMoney withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMoney(this.id, value, this.currency, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#currency() currency} attribute.
   * @param value The value for currency
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withCurrency(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "currency");
    if (this.currency == newValue) return this;
    return new ImmutableMoney(this.id, this.extension, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#currency() currency} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for currency
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMoney withCurrency(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.currency == value) return this;
    return new ImmutableMoney(this.id, this.extension, value, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Money#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMoney withValue(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableMoney(this.id, this.extension, this.currency, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Money#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMoney withValue(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableMoney(this.id, this.extension, this.currency, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMoney} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMoney
        && equalTo((ImmutableMoney) another);
  }

  private boolean equalTo(ImmutableMoney another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(currency, another.currency)
        && java.util.Objects.equals(value, another.value);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code currency}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(currency);
    h += (h << 5) + java.util.Objects.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code Money} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Money{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (currency != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("currency=").append(currency);
    }
    if (value != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("value=").append(value);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Money", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Money {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> currency = java.util.Optional.empty();
    boolean currencyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> value = java.util.Optional.empty();
    boolean valueIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    public void setCurrency(java.util.Optional<com.fhir.code> currency) {
      this.currency = currency;
      this.currencyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<com.fhir.decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> currency() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMoney fromJson(Json json) {
    ImmutableMoney.Builder builder = ImmutableMoney.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.currencyIsSet) {
      builder.currency(json.currency);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
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
        .extension(instance.extension())
        .currency(instance.currency())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link Money Money}.
   * <pre>
   * ImmutableMoney.builder()
   *    .id(String) // optional {@link Money#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Money#extension() extension}
   *    .currency(com.fhir.code) // optional {@link Money#currency() currency}
   *    .value(com.fhir.decimal) // optional {@link Money#value() value}
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
  @org.immutables.value.Generated(from = "Money", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_CURRENCY = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code currency;
    private @javax.annotation.Nullable com.fhir.decimal value;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Money#id() id} to id.
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
     * Initializes the optional value {@link Money#id() id} to id.
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
     * Initializes the optional value {@link Money#extension() extension} to extension.
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
     * Initializes the optional value {@link Money#extension() extension} to extension.
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
     * Initializes the optional value {@link Money#currency() currency} to currency.
     * @param currency The value for currency
     * @return {@code this} builder for chained invocation
     */
    public final Builder currency(com.fhir.code currency) {
      checkNotIsSet(currencyIsSet(), "currency");
      this.currency = java.util.Objects.requireNonNull(currency, "currency");
      optBits |= OPT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Money#currency() currency} to currency.
     * @param currency The value for currency
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    public final Builder currency(java.util.Optional<? extends com.fhir.code> currency) {
      checkNotIsSet(currencyIsSet(), "currency");
      this.currency = currency.orElse(null);
      optBits |= OPT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the optional value {@link Money#value() value} to value.
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
     * Initializes the optional value {@link Money#value() value} to value.
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
     * Builds a new {@link Money Money}.
     * @return An immutable instance of Money
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Money build() {
      return new ImmutableMoney(id, extension, currency, value);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean currencyIsSet() {
      return (optBits & OPT_BIT_CURRENCY) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Money is strict, attribute is already set: ".concat(name));
    }
  }
}
