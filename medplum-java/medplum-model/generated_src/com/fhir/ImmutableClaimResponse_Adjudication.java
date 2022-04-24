//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClaimResponse_Adjudication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Adjudication.builder()}.
 */
@org.immutables.value.Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Adjudication implements com.fhir.ClaimResponse_Adjudication {
  private final com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept reason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.decimal value;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Money amount;

  private ImmutableClaimResponse_Adjudication(
      com.fhir.CodeableConcept category,
      @javax.annotation.Nullable com.fhir.CodeableConcept reason,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.decimal value,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Money amount) {
    this.category = category;
    this.reason = reason;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.value = value;
    this.id = id;
    this.amount = amount;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public com.fhir.CodeableConcept category() {
    return category;
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> reason() {
    return java.util.Optional.ofNullable(reason);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Adjudication#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withCategory(com.fhir.CodeableConcept value) {
    if (this.category == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    return new ImmutableClaimResponse_Adjudication(newValue, this.reason, this.extension, this.modifierExtension, this.value, this.id, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.category,
        newValue,
        this.extension,
        this.modifierExtension,
        this.value,
        this.id,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.category, value, this.extension, this.modifierExtension, this.value, this.id, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(this.category, this.reason, newValue, this.modifierExtension, this.value, this.id, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.category, this.reason, value, this.modifierExtension, this.value, this.id, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(this.category, this.reason, this.extension, newValue, this.value, this.id, this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.category, this.reason, this.extension, value, this.value, this.id, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withValue(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.category,
        this.reason,
        this.extension,
        this.modifierExtension,
        newValue,
        this.id,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withValue(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.category, this.reason, this.extension, this.modifierExtension, value, this.id, this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.category,
        this.reason,
        this.extension,
        this.modifierExtension,
        this.value,
        newValue,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.category,
        this.reason,
        this.extension,
        this.modifierExtension,
        this.value,
        value,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withAmount(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.category,
        this.reason,
        this.extension,
        this.modifierExtension,
        this.value,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withAmount(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.category, this.reason, this.extension, this.modifierExtension, this.value, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Adjudication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Adjudication
        && equalTo((ImmutableClaimResponse_Adjudication) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Adjudication another) {
    return category.equals(another.category)
        && java.util.Objects.equals(reason, another.reason)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(amount, another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code category}, {@code reason}, {@code extension}, {@code modifierExtension}, {@code value}, {@code id}, {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + category.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(reason);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(amount);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Adjudication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ClaimResponse_Adjudication{");
    builder.append("category=").append(category);
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (value != null) {
      builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (amount != null) {
      builder.append(", ");
      builder.append("amount=").append(amount);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ClaimResponse_Adjudication {
    @javax.annotation.Nullable com.fhir.CodeableConcept category;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> reason = java.util.Optional.empty();
    boolean reasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> amount = java.util.Optional.empty();
    boolean amountIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(com.fhir.CodeableConcept category) {
      this.category = category;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(java.util.Optional<com.fhir.CodeableConcept> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<com.fhir.decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public void setAmount(java.util.Optional<com.fhir.Money> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @Override
    public com.fhir.CodeableConcept category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> reason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> amount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Adjudication fromJson(Json json) {
    ImmutableClaimResponse_Adjudication.Builder builder = ((ImmutableClaimResponse_Adjudication.Builder) ImmutableClaimResponse_Adjudication.builder());
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    return (ImmutableClaimResponse_Adjudication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Adjudication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Adjudication instance
   */
  public static ClaimResponse_Adjudication copyOf(ClaimResponse_Adjudication instance) {
    if (instance instanceof ImmutableClaimResponse_Adjudication) {
      return (ImmutableClaimResponse_Adjudication) instance;
    }
    return ((ImmutableClaimResponse_Adjudication.Builder) ImmutableClaimResponse_Adjudication.builder())
        .category(instance.category())
        .reason(instance.reason())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .value(instance.value())
        .id(instance.id())
        .amount(instance.amount())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
   * <pre>
   * ImmutableClaimResponse_Adjudication.builder()
   *    .category(com.fhir.CodeableConcept) // required {@link ClaimResponse_Adjudication#category() category}
   *    .reason(com.fhir.CodeableConcept) // optional {@link ClaimResponse_Adjudication#reason() reason}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Adjudication#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension}
   *    .value(com.fhir.decimal) // optional {@link ClaimResponse_Adjudication#value() value}
   *    .id(String) // optional {@link ClaimResponse_Adjudication#id() id}
   *    .amount(com.fhir.Money) // optional {@link ClaimResponse_Adjudication#amount() amount}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Adjudication builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableClaimResponse_Adjudication.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_REASON = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_AMOUNT = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.CodeableConcept reason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.decimal value;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Money amount;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ClaimResponse_Adjudication#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(com.fhir.CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(com.fhir.CodeableConcept reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = java.util.Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public final Builder reason(java.util.Optional<? extends com.fhir.CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
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
     * Builds a new {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
     * @return An immutable instance of ClaimResponse_Adjudication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ClaimResponse_Adjudication build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_Adjudication(category, reason, extension, modifierExtension, value, id, amount);
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ClaimResponse_Adjudication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build ClaimResponse_Adjudication, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Adjudication#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);
  }

  @org.immutables.value.Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(com.fhir.CodeableConcept reason);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(java.util.Optional<? extends com.fhir.CodeableConcept> reason);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    BuildFinal value(com.fhir.decimal value);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(java.util.Optional<? extends com.fhir.decimal> value);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(com.fhir.Money amount);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(java.util.Optional<? extends com.fhir.Money> amount);

    /**
     * Builds a new {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
     * @return An immutable instance of ClaimResponse_Adjudication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_Adjudication build();
  }
}
