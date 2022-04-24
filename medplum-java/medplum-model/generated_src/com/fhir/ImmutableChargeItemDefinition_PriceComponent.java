//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ChargeItemDefinition_PriceComponent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeItemDefinition_PriceComponent.builder()}.
 */
@org.immutables.value.Generated(from = "ChargeItemDefinition_PriceComponent", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableChargeItemDefinition_PriceComponent
    implements com.fhir.ChargeItemDefinition_PriceComponent {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Money amount;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code type;
  private final @javax.annotation.Nullable com.fhir.decimal factor;

  private ImmutableChargeItemDefinition_PriceComponent(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Money amount,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code type,
      @javax.annotation.Nullable com.fhir.decimal factor) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.amount = amount;
    this.extension = extension;
    this.type = type;
    this.factor = factor;
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("amount")
  @Override
  public java.util.Optional<com.fhir.Money> amount() {
    return java.util.Optional.ofNullable(amount);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.code> type() {
    return java.util.Optional.ofNullable(type);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PriceComponent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(
        newValue,
        this.modifierExtension,
        this.code,
        this.amount,
        this.extension,
        this.type,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PriceComponent#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(value, this.modifierExtension, this.code, this.amount, this.extension, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PriceComponent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, newValue, this.code, this.amount, this.extension, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PriceComponent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PriceComponent withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, value, this.code, this.amount, this.extension, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PriceComponent#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, newValue, this.amount, this.extension, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PriceComponent#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PriceComponent withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, value, this.amount, this.extension, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PriceComponent#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withAmount(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, newValue, this.extension, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PriceComponent#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PriceComponent withAmount(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, value, this.extension, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PriceComponent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, this.amount, newValue, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PriceComponent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PriceComponent withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, this.amount, value, this.type, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PriceComponent#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, this.amount, this.extension, newValue, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PriceComponent#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PriceComponent withType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, this.amount, this.extension, value, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_PriceComponent#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_PriceComponent withFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, this.amount, this.extension, this.type, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_PriceComponent#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_PriceComponent withFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableChargeItemDefinition_PriceComponent(this.id, this.modifierExtension, this.code, this.amount, this.extension, this.type, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeItemDefinition_PriceComponent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeItemDefinition_PriceComponent
        && equalTo((ImmutableChargeItemDefinition_PriceComponent) another);
  }

  private boolean equalTo(ImmutableChargeItemDefinition_PriceComponent another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(amount, another.amount)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(factor, another.factor);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code code}, {@code amount}, {@code extension}, {@code type}, {@code factor}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(amount);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(factor);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeItemDefinition_PriceComponent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ChargeItemDefinition_PriceComponent{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (amount != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (extension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (factor != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ChargeItemDefinition_PriceComponent", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ChargeItemDefinition_PriceComponent {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> amount = java.util.Optional.empty();
    boolean amountIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factor = java.util.Optional.empty();
    boolean factorIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public void setAmount(java.util.Optional<com.fhir.Money> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public void setFactor(java.util.Optional<com.fhir.decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> amount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factor() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableChargeItemDefinition_PriceComponent fromJson(Json json) {
    ImmutableChargeItemDefinition_PriceComponent.Builder builder = ImmutableChargeItemDefinition_PriceComponent.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    return (ImmutableChargeItemDefinition_PriceComponent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChargeItemDefinition_PriceComponent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeItemDefinition_PriceComponent instance
   */
  public static ChargeItemDefinition_PriceComponent copyOf(ChargeItemDefinition_PriceComponent instance) {
    if (instance instanceof ImmutableChargeItemDefinition_PriceComponent) {
      return (ImmutableChargeItemDefinition_PriceComponent) instance;
    }
    return ImmutableChargeItemDefinition_PriceComponent.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .amount(instance.amount())
        .extension(instance.extension())
        .type(instance.type())
        .factor(instance.factor())
        .build();
  }

  /**
   * Creates a builder for {@link ChargeItemDefinition_PriceComponent ChargeItemDefinition_PriceComponent}.
   * <pre>
   * ImmutableChargeItemDefinition_PriceComponent.builder()
   *    .id(String) // optional {@link ChargeItemDefinition_PriceComponent#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition_PriceComponent#modifierExtension() modifierExtension}
   *    .code(com.fhir.CodeableConcept) // optional {@link ChargeItemDefinition_PriceComponent#code() code}
   *    .amount(com.fhir.Money) // optional {@link ChargeItemDefinition_PriceComponent#amount() amount}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition_PriceComponent#extension() extension}
   *    .type(com.fhir.code) // optional {@link ChargeItemDefinition_PriceComponent#type() type}
   *    .factor(com.fhir.decimal) // optional {@link ChargeItemDefinition_PriceComponent#factor() factor}
   *    .build();
   * </pre>
   * @return A new ChargeItemDefinition_PriceComponent builder
   */
  public static ImmutableChargeItemDefinition_PriceComponent.Builder builder() {
    return new ImmutableChargeItemDefinition_PriceComponent.Builder();
  }

  /**
   * Builds instances of type {@link ChargeItemDefinition_PriceComponent ChargeItemDefinition_PriceComponent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ChargeItemDefinition_PriceComponent", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_AMOUNT = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_FACTOR = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Money amount;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code type;
    private @javax.annotation.Nullable com.fhir.decimal factor;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(com.fhir.Money amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = java.util.Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public final Builder amount(java.util.Optional<? extends com.fhir.Money> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#factor() factor} to factor.
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
     * Initializes the optional value {@link ChargeItemDefinition_PriceComponent#factor() factor} to factor.
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
     * Builds a new {@link ChargeItemDefinition_PriceComponent ChargeItemDefinition_PriceComponent}.
     * @return An immutable instance of ChargeItemDefinition_PriceComponent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ChargeItemDefinition_PriceComponent build() {
      return new ImmutableChargeItemDefinition_PriceComponent(id, modifierExtension, code, amount, extension, type, factor);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ChargeItemDefinition_PriceComponent is strict, attribute is already set: ".concat(name));
    }
  }
}
