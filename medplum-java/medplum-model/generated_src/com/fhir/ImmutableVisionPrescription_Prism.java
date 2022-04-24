//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link VisionPrescription_Prism}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVisionPrescription_Prism.builder()}.
 */
@org.immutables.value.Generated(from = "VisionPrescription_Prism", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVisionPrescription_Prism implements com.fhir.VisionPrescription_Prism {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Visionprescription_prismBase base;
  private final @javax.annotation.Nullable com.fhir.decimal amount;

  private ImmutableVisionPrescription_Prism(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Visionprescription_prismBase base,
      @javax.annotation.Nullable com.fhir.decimal amount) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.base = base;
    this.amount = amount;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code base} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("base")
  @Override
  public java.util.Optional<com.fhir.Visionprescription_prismBase> base() {
    return java.util.Optional.ofNullable(base);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("amount")
  @Override
  public java.util.Optional<com.fhir.decimal> amount() {
    return java.util.Optional.ofNullable(amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableVisionPrescription_Prism(newValue, this.modifierExtension, this.extension, this.base, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableVisionPrescription_Prism(value, this.modifierExtension, this.extension, this.base, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVisionPrescription_Prism(this.id, newValue, this.extension, this.base, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVisionPrescription_Prism(this.id, value, this.extension, this.base, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVisionPrescription_Prism(this.id, this.modifierExtension, newValue, this.base, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVisionPrescription_Prism(this.id, this.modifierExtension, value, this.base, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withBase(com.fhir.Visionprescription_prismBase value) {
    @javax.annotation.Nullable com.fhir.Visionprescription_prismBase newValue = java.util.Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableVisionPrescription_Prism(this.id, this.modifierExtension, this.extension, newValue, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withBase(java.util.Optional<? extends com.fhir.Visionprescription_prismBase> optional) {
    @javax.annotation.Nullable com.fhir.Visionprescription_prismBase value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableVisionPrescription_Prism(this.id, this.modifierExtension, this.extension, value, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VisionPrescription_Prism#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVisionPrescription_Prism withAmount(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableVisionPrescription_Prism(this.id, this.modifierExtension, this.extension, this.base, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VisionPrescription_Prism#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVisionPrescription_Prism withAmount(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableVisionPrescription_Prism(this.id, this.modifierExtension, this.extension, this.base, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVisionPrescription_Prism} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVisionPrescription_Prism
        && equalTo((ImmutableVisionPrescription_Prism) another);
  }

  private boolean equalTo(ImmutableVisionPrescription_Prism another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(base, another.base)
        && java.util.Objects.equals(amount, another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code extension}, {@code base}, {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(base);
    h += (h << 5) + java.util.Objects.hashCode(amount);
    return h;
  }

  /**
   * Prints the immutable value {@code VisionPrescription_Prism} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("VisionPrescription_Prism{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (base != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("base=").append(base);
    }
    if (amount != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "VisionPrescription_Prism", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.VisionPrescription_Prism {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Visionprescription_prismBase> base = java.util.Optional.empty();
    boolean baseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> amount = java.util.Optional.empty();
    boolean amountIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("base")
    public void setBase(java.util.Optional<com.fhir.Visionprescription_prismBase> base) {
      this.base = base;
      this.baseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public void setAmount(java.util.Optional<com.fhir.decimal> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Visionprescription_prismBase> base() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> amount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableVisionPrescription_Prism fromJson(Json json) {
    ImmutableVisionPrescription_Prism.Builder builder = ImmutableVisionPrescription_Prism.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    return (ImmutableVisionPrescription_Prism) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VisionPrescription_Prism} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VisionPrescription_Prism instance
   */
  public static VisionPrescription_Prism copyOf(VisionPrescription_Prism instance) {
    if (instance instanceof ImmutableVisionPrescription_Prism) {
      return (ImmutableVisionPrescription_Prism) instance;
    }
    return ImmutableVisionPrescription_Prism.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .base(instance.base())
        .amount(instance.amount())
        .build();
  }

  /**
   * Creates a builder for {@link VisionPrescription_Prism VisionPrescription_Prism}.
   * <pre>
   * ImmutableVisionPrescription_Prism.builder()
   *    .id(String) // optional {@link VisionPrescription_Prism#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_Prism#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VisionPrescription_Prism#extension() extension}
   *    .base(com.fhir.Visionprescription_prismBase) // optional {@link VisionPrescription_Prism#base() base}
   *    .amount(com.fhir.decimal) // optional {@link VisionPrescription_Prism#amount() amount}
   *    .build();
   * </pre>
   * @return A new VisionPrescription_Prism builder
   */
  public static ImmutableVisionPrescription_Prism.Builder builder() {
    return new ImmutableVisionPrescription_Prism.Builder();
  }

  /**
   * Builds instances of type {@link VisionPrescription_Prism VisionPrescription_Prism}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "VisionPrescription_Prism", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_BASE = 0x8L;
    private static final long OPT_BIT_AMOUNT = 0x10L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Visionprescription_prismBase base;
    private @javax.annotation.Nullable com.fhir.decimal amount;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#id() id} to id.
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
     * Initializes the optional value {@link VisionPrescription_Prism#id() id} to id.
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
     * Initializes the optional value {@link VisionPrescription_Prism#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_Prism#extension() extension} to extension.
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
     * Initializes the optional value {@link VisionPrescription_Prism#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    public final Builder base(com.fhir.Visionprescription_prismBase base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = java.util.Objects.requireNonNull(base, "base");
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("base")
    public final Builder base(java.util.Optional<? extends com.fhir.Visionprescription_prismBase> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = base.orElse(null);
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(com.fhir.decimal amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = java.util.Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link VisionPrescription_Prism#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public final Builder amount(java.util.Optional<? extends com.fhir.decimal> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link VisionPrescription_Prism VisionPrescription_Prism}.
     * @return An immutable instance of VisionPrescription_Prism
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.VisionPrescription_Prism build() {
      return new ImmutableVisionPrescription_Prism(id, modifierExtension, extension, base, amount);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of VisionPrescription_Prism is strict, attribute is already set: ".concat(name));
    }
  }
}
