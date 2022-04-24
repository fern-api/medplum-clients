//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClaimResponse_SubDetail1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_SubDetail1.builder()}.
 */
@org.immutables.value.Generated(from = "ClaimResponse_SubDetail1", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_SubDetail1 implements com.fhir.ClaimResponse_SubDetail1 {
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
  private final com.fhir.CodeableConcept productOrService;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.decimal factor;
  private final @javax.annotation.Nullable java.lang.String id;
  private final java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Money unitPrice;
  private final @javax.annotation.Nullable com.fhir.Money net;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;

  private ImmutableClaimResponse_SubDetail1(
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier,
      com.fhir.CodeableConcept productOrService,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.decimal factor,
      @javax.annotation.Nullable java.lang.String id,
      java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Money unitPrice,
      @javax.annotation.Nullable com.fhir.Money net,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber) {
    this.modifier = modifier;
    this.productOrService = productOrService;
    this.quantity = quantity;
    this.factor = factor;
    this.id = id;
    this.adjudication = adjudication;
    this.extension = extension;
    this.unitPrice = unitPrice;
    this.net = net;
    this.modifierExtension = modifierExtension;
    this.noteNumber = noteNumber;
  }

  /**
   * @return The value of the {@code modifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() {
    return java.util.Optional.ofNullable(modifier);
  }

  /**
   * @return The value of the {@code productOrService} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
  @Override
  public com.fhir.CodeableConcept productOrService() {
    return productOrService;
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantity() {
    return java.util.Optional.ofNullable(quantity);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code adjudication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
  @Override
  public java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication() {
    return adjudication;
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
   * @return The value of the {@code unitPrice} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
  @Override
  public java.util.Optional<com.fhir.Money> unitPrice() {
    return java.util.Optional.ofNullable(unitPrice);
  }

  /**
   * @return The value of the {@code net} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("net")
  @Override
  public java.util.Optional<com.fhir.Money> net() {
    return java.util.Optional.ofNullable(net);
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
   * @return The value of the {@code noteNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() {
    return java.util.Optional.ofNullable(noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withModifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        newValue,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        value,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_SubDetail1#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withProductOrService(com.fhir.CodeableConcept value) {
    if (this.productOrService == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productOrService");
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        newValue,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        newValue,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        value,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        newValue,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        value,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        newValue,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        value,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_SubDetail1#adjudication() adjudication}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withAdjudication(com.fhir.ClaimResponse_Adjudication... elements) {
    java.util.List<com.fhir.ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        newValue,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_SubDetail1#adjudication() adjudication}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of adjudication elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withAdjudication(Iterable<? extends com.fhir.ClaimResponse_Adjudication> elements) {
    if (this.adjudication == elements) return this;
    java.util.List<com.fhir.ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        newValue,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        newValue,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        value,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withUnitPrice(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        newValue,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withUnitPrice(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        value,
        this.net,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withNet(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        newValue,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withNet(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        value,
        this.modifierExtension,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        newValue,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        value,
        this.noteNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail1#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail1 withNoteNumber(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail1#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail1 withNoteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableClaimResponse_SubDetail1(
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.id,
        this.adjudication,
        this.extension,
        this.unitPrice,
        this.net,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_SubDetail1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_SubDetail1
        && equalTo((ImmutableClaimResponse_SubDetail1) another);
  }

  private boolean equalTo(ImmutableClaimResponse_SubDetail1 another) {
    return java.util.Objects.equals(modifier, another.modifier)
        && productOrService.equals(another.productOrService)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(factor, another.factor)
        && java.util.Objects.equals(id, another.id)
        && adjudication.equals(another.adjudication)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(unitPrice, another.unitPrice)
        && java.util.Objects.equals(net, another.net)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(noteNumber, another.noteNumber);
  }

  /**
   * Computes a hash code from attributes: {@code modifier}, {@code productOrService}, {@code quantity}, {@code factor}, {@code id}, {@code adjudication}, {@code extension}, {@code unitPrice}, {@code net}, {@code modifierExtension}, {@code noteNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifier);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(factor);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + adjudication.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(unitPrice);
    h += (h << 5) + java.util.Objects.hashCode(net);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(noteNumber);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_SubDetail1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ClaimResponse_SubDetail1{");
    if (modifier != null) {
      builder.append("modifier=").append(modifier);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("adjudication=").append(adjudication);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (net != null) {
      builder.append(", ");
      builder.append("net=").append(net);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (noteNumber != null) {
      builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ClaimResponse_SubDetail1", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ClaimResponse_SubDetail1 {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier = java.util.Optional.empty();
    boolean modifierIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factor = java.util.Optional.empty();
    boolean factorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> unitPrice = java.util.Optional.empty();
    boolean unitPriceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> net = java.util.Optional.empty();
    boolean netIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber = java.util.Optional.empty();
    boolean noteNumberIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public void setModifier(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
    public void setProductOrService(com.fhir.CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public void setFactor(java.util.Optional<com.fhir.decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public void setAdjudication(java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication) {
      this.adjudication = adjudication;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    public void setUnitPrice(java.util.Optional<com.fhir.Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("net")
    public void setNet(java.util.Optional<com.fhir.Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public void setNoteNumber(java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_SubDetail1 fromJson(Json json) {
    ImmutableClaimResponse_SubDetail1.Builder builder = ((ImmutableClaimResponse_SubDetail1.Builder) ImmutableClaimResponse_SubDetail1.builder());
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.adjudication != null) {
      builder.addAllAdjudication(json.adjudication);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    return (ImmutableClaimResponse_SubDetail1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_SubDetail1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_SubDetail1 instance
   */
  public static ClaimResponse_SubDetail1 copyOf(ClaimResponse_SubDetail1 instance) {
    if (instance instanceof ImmutableClaimResponse_SubDetail1) {
      return (ImmutableClaimResponse_SubDetail1) instance;
    }
    return ((ImmutableClaimResponse_SubDetail1.Builder) ImmutableClaimResponse_SubDetail1.builder())
        .modifier(instance.modifier())
        .productOrService(instance.productOrService())
        .quantity(instance.quantity())
        .factor(instance.factor())
        .id(instance.id())
        .addAllAdjudication(instance.adjudication())
        .extension(instance.extension())
        .unitPrice(instance.unitPrice())
        .net(instance.net())
        .modifierExtension(instance.modifierExtension())
        .noteNumber(instance.noteNumber())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_SubDetail1 ClaimResponse_SubDetail1}.
   * <pre>
   * ImmutableClaimResponse_SubDetail1.builder()
   *    .modifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_SubDetail1#modifier() modifier}
   *    .productOrService(com.fhir.CodeableConcept) // required {@link ClaimResponse_SubDetail1#productOrService() productOrService}
   *    .quantity(com.fhir.Quantity) // optional {@link ClaimResponse_SubDetail1#quantity() quantity}
   *    .factor(com.fhir.decimal) // optional {@link ClaimResponse_SubDetail1#factor() factor}
   *    .id(String) // optional {@link ClaimResponse_SubDetail1#id() id}
   *    .addAdjudication|addAllAdjudication(com.fhir.ClaimResponse_Adjudication) // {@link ClaimResponse_SubDetail1#adjudication() adjudication} elements
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_SubDetail1#extension() extension}
   *    .unitPrice(com.fhir.Money) // optional {@link ClaimResponse_SubDetail1#unitPrice() unitPrice}
   *    .net(com.fhir.Money) // optional {@link ClaimResponse_SubDetail1#net() net}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_SubDetail1#modifierExtension() modifierExtension}
   *    .noteNumber(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ClaimResponse_SubDetail1#noteNumber() noteNumber}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_SubDetail1 builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableClaimResponse_SubDetail1.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_SubDetail1 ClaimResponse_SubDetail1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClaimResponse_SubDetail1", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_MODIFIER = 0x1L;
    private static final long OPT_BIT_QUANTITY = 0x2L;
    private static final long OPT_BIT_FACTOR = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_UNIT_PRICE = 0x20L;
    private static final long OPT_BIT_NET = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.decimal factor;
    private @javax.annotation.Nullable java.lang.String id;
    private final java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication = new java.util.ArrayList<com.fhir.ClaimResponse_Adjudication>();
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Money unitPrice;
    private @javax.annotation.Nullable com.fhir.Money net;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifier(java.util.List<com.fhir.CodeableConcept> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = java.util.Objects.requireNonNull(modifier, "modifier");
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public final Builder modifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = modifier.orElse(null);
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse_SubDetail1#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productOrService")
    public final Builder productOrService(com.fhir.CodeableConcept productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = java.util.Objects.requireNonNull(productOrService, "productOrService");
      initBits &= ~INIT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<? extends com.fhir.Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#factor() factor} to factor.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail1#factor() factor} to factor.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail1#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail1#id() id} to id.
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
     * Adds one element to {@link ClaimResponse_SubDetail1#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(com.fhir.ClaimResponse_Adjudication element) {
      this.adjudication.add(java.util.Objects.requireNonNull(element, "adjudication element"));
      return this;
    }

    /**
     * Adds elements to {@link ClaimResponse_SubDetail1#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(com.fhir.ClaimResponse_Adjudication... elements) {
      for (com.fhir.ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(java.util.Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ClaimResponse_SubDetail1#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdjudication(Iterable<? extends com.fhir.ClaimResponse_Adjudication> elements) {
      for (com.fhir.ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(java.util.Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail1#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitPrice(com.fhir.Money unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = java.util.Objects.requireNonNull(unitPrice, "unitPrice");
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    public final Builder unitPrice(java.util.Optional<? extends com.fhir.Money> unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = unitPrice.orElse(null);
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    public final Builder net(com.fhir.Money net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = java.util.Objects.requireNonNull(net, "net");
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("net")
    public final Builder net(java.util.Optional<? extends com.fhir.Money> net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = net.orElse(null);
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder noteNumber(java.util.List<com.fhir.positiveInt> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = java.util.Objects.requireNonNull(noteNumber, "noteNumber");
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public final Builder noteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = noteNumber.orElse(null);
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link ClaimResponse_SubDetail1 ClaimResponse_SubDetail1}.
     * @return An immutable instance of ClaimResponse_SubDetail1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ClaimResponse_SubDetail1 build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_SubDetail1(
          modifier,
          productOrService,
          quantity,
          factor,
          id,
          createUnmodifiableList(true, adjudication),
          extension,
          unitPrice,
          net,
          modifierExtension,
          noteNumber);
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ClaimResponse_SubDetail1 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ClaimResponse_SubDetail1, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ClaimResponse_SubDetail1", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_SubDetail1#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(com.fhir.CodeableConcept productOrService);
  }

  @org.immutables.value.Generated(from = "ClaimResponse_SubDetail1", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(java.util.List<com.fhir.CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(com.fhir.decimal factor);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(java.util.Optional<? extends com.fhir.decimal> factor);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Adds one element to {@link ClaimResponse_SubDetail1#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAdjudication(com.fhir.ClaimResponse_Adjudication element);

    /**
     * Adds elements to {@link ClaimResponse_SubDetail1#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAdjudication(com.fhir.ClaimResponse_Adjudication... elements);

    /**
     * Adds elements to {@link ClaimResponse_SubDetail1#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAdjudication(Iterable<? extends com.fhir.ClaimResponse_Adjudication> elements);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(com.fhir.Money unitPrice);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(java.util.Optional<? extends com.fhir.Money> unitPrice);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(com.fhir.Money net);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(java.util.Optional<? extends com.fhir.Money> net);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(java.util.List<com.fhir.positiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> noteNumber);

    /**
     * Builds a new {@link ClaimResponse_SubDetail1 ClaimResponse_SubDetail1}.
     * @return An immutable instance of ClaimResponse_SubDetail1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_SubDetail1 build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}