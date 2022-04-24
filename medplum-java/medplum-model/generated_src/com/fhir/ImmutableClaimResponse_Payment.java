//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClaimResponse_Payment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Payment.builder()}.
 */
@org.immutables.value.Generated(from = "ClaimResponse_Payment", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Payment implements com.fhir.ClaimResponse_Payment {
  private final com.fhir.Money amount;
  private final @javax.annotation.Nullable com.fhir.Money adjustment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.date date;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept adjustmentReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableClaimResponse_Payment(
      com.fhir.Money amount,
      @javax.annotation.Nullable com.fhir.Money adjustment,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.date date,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.CodeableConcept adjustmentReason,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.amount = amount;
    this.adjustment = adjustment;
    this.extension = extension;
    this.type = type;
    this.date = date;
    this.identifier = identifier;
    this.id = id;
    this.adjustmentReason = adjustmentReason;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("amount")
  @Override
  public com.fhir.Money amount() {
    return amount;
  }

  /**
   * @return The value of the {@code adjustment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjustment")
  @Override
  public java.util.Optional<com.fhir.Money> adjustment() {
    return java.util.Optional.ofNullable(adjustment);
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
  public com.fhir.CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.date> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code adjustmentReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjustmentReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> adjustmentReason() {
    return java.util.Optional.ofNullable(adjustmentReason);
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
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Payment#amount() amount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Payment withAmount(com.fhir.Money value) {
    if (this.amount == value) return this;
    com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "amount");
    return new ImmutableClaimResponse_Payment(
        newValue,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#adjustment() adjustment} attribute.
   * @param value The value for adjustment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withAdjustment(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "adjustment");
    if (this.adjustment == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        newValue,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#adjustment() adjustment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjustment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withAdjustment(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.adjustment == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        value,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        newValue,
        this.type,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        value,
        this.type,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Payment#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Payment withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        newValue,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        newValue,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        value,
        this.identifier,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        newValue,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        value,
        this.id,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        newValue,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        value,
        this.adjustmentReason,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} attribute.
   * @param value The value for adjustmentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withAdjustmentReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "adjustmentReason");
    if (this.adjustmentReason == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjustmentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withAdjustmentReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.adjustmentReason == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        this.id,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.amount,
        this.adjustment,
        this.extension,
        this.type,
        this.date,
        this.identifier,
        this.id,
        this.adjustmentReason,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Payment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Payment
        && equalTo((ImmutableClaimResponse_Payment) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Payment another) {
    return amount.equals(another.amount)
        && java.util.Objects.equals(adjustment, another.adjustment)
        && java.util.Objects.equals(extension, another.extension)
        && type.equals(another.type)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(adjustmentReason, another.adjustmentReason)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code amount}, {@code adjustment}, {@code extension}, {@code type}, {@code date}, {@code identifier}, {@code id}, {@code adjustmentReason}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(adjustment);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(adjustmentReason);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Payment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ClaimResponse_Payment{");
    builder.append("amount=").append(amount);
    if (adjustment != null) {
      builder.append(", ");
      builder.append("adjustment=").append(adjustment);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (adjustmentReason != null) {
      builder.append(", ");
      builder.append("adjustmentReason=").append(adjustmentReason);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ClaimResponse_Payment {
    @javax.annotation.Nullable com.fhir.Money amount;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> adjustment = java.util.Optional.empty();
    boolean adjustmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> adjustmentReason = java.util.Optional.empty();
    boolean adjustmentReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public void setAmount(com.fhir.Money amount) {
      this.amount = amount;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjustment")
    public void setAdjustment(java.util.Optional<com.fhir.Money> adjustment) {
      this.adjustment = adjustment;
      this.adjustmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjustmentReason")
    public void setAdjustmentReason(java.util.Optional<com.fhir.CodeableConcept> adjustmentReason) {
      this.adjustmentReason = adjustmentReason;
      this.adjustmentReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public com.fhir.Money amount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> adjustment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> adjustmentReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Payment fromJson(Json json) {
    ImmutableClaimResponse_Payment.Builder builder = ((ImmutableClaimResponse_Payment.Builder) ImmutableClaimResponse_Payment.builder());
    if (json.amount != null) {
      builder.amount(json.amount);
    }
    if (json.adjustmentIsSet) {
      builder.adjustment(json.adjustment);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.adjustmentReasonIsSet) {
      builder.adjustmentReason(json.adjustmentReason);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableClaimResponse_Payment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Payment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Payment instance
   */
  public static ClaimResponse_Payment copyOf(ClaimResponse_Payment instance) {
    if (instance instanceof ImmutableClaimResponse_Payment) {
      return (ImmutableClaimResponse_Payment) instance;
    }
    return ((ImmutableClaimResponse_Payment.Builder) ImmutableClaimResponse_Payment.builder())
        .amount(instance.amount())
        .adjustment(instance.adjustment())
        .extension(instance.extension())
        .type(instance.type())
        .date(instance.date())
        .identifier(instance.identifier())
        .id(instance.id())
        .adjustmentReason(instance.adjustmentReason())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Payment ClaimResponse_Payment}.
   * <pre>
   * ImmutableClaimResponse_Payment.builder()
   *    .amount(com.fhir.Money) // required {@link ClaimResponse_Payment#amount() amount}
   *    .adjustment(com.fhir.Money) // optional {@link ClaimResponse_Payment#adjustment() adjustment}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Payment#extension() extension}
   *    .type(com.fhir.CodeableConcept) // required {@link ClaimResponse_Payment#type() type}
   *    .date(com.fhir.date) // optional {@link ClaimResponse_Payment#date() date}
   *    .identifier(com.fhir.Identifier) // optional {@link ClaimResponse_Payment#identifier() identifier}
   *    .id(String) // optional {@link ClaimResponse_Payment#id() id}
   *    .adjustmentReason(com.fhir.CodeableConcept) // optional {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Payment#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Payment builder
   */
  public static AmountBuildStage builder() {
    return new ImmutableClaimResponse_Payment.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Payment ClaimResponse_Payment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements AmountBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_AMOUNT = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_ADJUSTMENT = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_ADJUSTMENT_REASON = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Money amount;
    private @javax.annotation.Nullable com.fhir.Money adjustment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.date date;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept adjustmentReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ClaimResponse_Payment#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public final Builder amount(com.fhir.Money amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = java.util.Objects.requireNonNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjustment(com.fhir.Money adjustment) {
      checkNotIsSet(adjustmentIsSet(), "adjustment");
      this.adjustment = java.util.Objects.requireNonNull(adjustment, "adjustment");
      optBits |= OPT_BIT_ADJUSTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adjustment")
    public final Builder adjustment(java.util.Optional<? extends com.fhir.Money> adjustment) {
      checkNotIsSet(adjustmentIsSet(), "adjustment");
      this.adjustment = adjustment.orElse(null);
      optBits |= OPT_BIT_ADJUSTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
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
     * Initializes the value for the {@link ClaimResponse_Payment#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.date date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.date> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjustmentReason(com.fhir.CodeableConcept adjustmentReason) {
      checkNotIsSet(adjustmentReasonIsSet(), "adjustmentReason");
      this.adjustmentReason = java.util.Objects.requireNonNull(adjustmentReason, "adjustmentReason");
      optBits |= OPT_BIT_ADJUSTMENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adjustmentReason")
    public final Builder adjustmentReason(java.util.Optional<? extends com.fhir.CodeableConcept> adjustmentReason) {
      checkNotIsSet(adjustmentReasonIsSet(), "adjustmentReason");
      this.adjustmentReason = adjustmentReason.orElse(null);
      optBits |= OPT_BIT_ADJUSTMENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ClaimResponse_Payment ClaimResponse_Payment}.
     * @return An immutable instance of ClaimResponse_Payment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ClaimResponse_Payment build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_Payment(
          amount,
          adjustment,
          extension,
          type,
          date,
          identifier,
          id,
          adjustmentReason,
          modifierExtension);
    }

    private boolean adjustmentIsSet() {
      return (optBits & OPT_BIT_ADJUSTMENT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean adjustmentReasonIsSet() {
      return (optBits & OPT_BIT_ADJUSTMENT_REASON) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean amountIsSet() {
      return (initBits & INIT_BIT_AMOUNT) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ClaimResponse_Payment is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!amountIsSet()) attributes.add("amount");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build ClaimResponse_Payment, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  public interface AmountBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Payment#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage amount(com.fhir.Money amount);
  }

  @org.immutables.value.Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Payment#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjustment(com.fhir.Money adjustment);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjustment(java.util.Optional<? extends com.fhir.Money> adjustment);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.date date);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.date> date);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjustmentReason(com.fhir.CodeableConcept adjustmentReason);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjustmentReason(java.util.Optional<? extends com.fhir.CodeableConcept> adjustmentReason);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link ClaimResponse_Payment ClaimResponse_Payment}.
     * @return An immutable instance of ClaimResponse_Payment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_Payment build();
  }
}
