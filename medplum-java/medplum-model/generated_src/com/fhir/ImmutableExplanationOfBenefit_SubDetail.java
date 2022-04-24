//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExplanationOfBenefit_SubDetail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_SubDetail.builder()}.
 */
@org.immutables.value.Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_SubDetail implements com.fhir.ExplanationOfBenefit_SubDetail {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Money net;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept revenue;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
  private final com.fhir.CodeableConcept productOrService;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.decimal factor;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Money unitPrice;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi;

  private ImmutableExplanationOfBenefit_SubDetail(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Money net,
      @javax.annotation.Nullable com.fhir.CodeableConcept revenue,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier,
      com.fhir.CodeableConcept productOrService,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.decimal factor,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Money unitPrice,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi) {
    this.modifierExtension = modifierExtension;
    this.net = net;
    this.revenue = revenue;
    this.noteNumber = noteNumber;
    this.modifier = modifier;
    this.productOrService = productOrService;
    this.quantity = quantity;
    this.factor = factor;
    this.category = category;
    this.sequence = sequence;
    this.adjudication = adjudication;
    this.programCode = programCode;
    this.extension = extension;
    this.unitPrice = unitPrice;
    this.id = id;
    this.udi = udi;
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
   * @return The value of the {@code net} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("net")
  @Override
  public java.util.Optional<com.fhir.Money> net() {
    return java.util.Optional.ofNullable(net);
  }

  /**
   * @return The value of the {@code revenue} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("revenue")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> revenue() {
    return java.util.Optional.ofNullable(revenue);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> category() {
    return java.util.Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code adjudication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication() {
    return java.util.Optional.ofNullable(adjudication);
  }

  /**
   * @return The value of the {@code programCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("programCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode() {
    return java.util.Optional.ofNullable(programCode);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code udi} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("udi")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> udi() {
    return java.util.Optional.ofNullable(udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        newValue,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        value,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withNet(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        newValue,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withNet(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        value,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#revenue() revenue} attribute.
   * @param value The value for revenue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withRevenue(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "revenue");
    if (this.revenue == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        newValue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#revenue() revenue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for revenue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withRevenue(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.revenue == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        value,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withNoteNumber(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        newValue,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withNoteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        value,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withModifier(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        newValue,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withModifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        value,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withProductOrService(com.fhir.CodeableConcept value) {
    if (this.productOrService == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productOrService");
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        newValue,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        newValue,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        value,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        newValue,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        value,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        newValue,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        value,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        newValue,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        value,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withAdjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> newValue = java.util.Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        newValue,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withAdjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        value,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withProgramCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        newValue,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withProgramCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        value,
        this.extension,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        newValue,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        value,
        this.unitPrice,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withUnitPrice(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        newValue,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withUnitPrice(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        value,
        this.id,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        newValue,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        value,
        this.udi);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#udi() udi} attribute.
   * @param value The value for udi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withUdi(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "udi");
    if (this.udi == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#udi() udi} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udi
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withUdi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.udi == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.modifierExtension,
        this.net,
        this.revenue,
        this.noteNumber,
        this.modifier,
        this.productOrService,
        this.quantity,
        this.factor,
        this.category,
        this.sequence,
        this.adjudication,
        this.programCode,
        this.extension,
        this.unitPrice,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_SubDetail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_SubDetail
        && equalTo((ImmutableExplanationOfBenefit_SubDetail) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_SubDetail another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(net, another.net)
        && java.util.Objects.equals(revenue, another.revenue)
        && java.util.Objects.equals(noteNumber, another.noteNumber)
        && java.util.Objects.equals(modifier, another.modifier)
        && productOrService.equals(another.productOrService)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(factor, another.factor)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(adjudication, another.adjudication)
        && java.util.Objects.equals(programCode, another.programCode)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(unitPrice, another.unitPrice)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(udi, another.udi);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code net}, {@code revenue}, {@code noteNumber}, {@code modifier}, {@code productOrService}, {@code quantity}, {@code factor}, {@code category}, {@code sequence}, {@code adjudication}, {@code programCode}, {@code extension}, {@code unitPrice}, {@code id}, {@code udi}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(net);
    h += (h << 5) + java.util.Objects.hashCode(revenue);
    h += (h << 5) + java.util.Objects.hashCode(noteNumber);
    h += (h << 5) + java.util.Objects.hashCode(modifier);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(factor);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(adjudication);
    h += (h << 5) + java.util.Objects.hashCode(programCode);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(unitPrice);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(udi);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_SubDetail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExplanationOfBenefit_SubDetail{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (net != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("net=").append(net);
    }
    if (revenue != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("revenue=").append(revenue);
    }
    if (noteNumber != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (modifier != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (builder.length() > 31) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    if (programCode != null) {
      builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (udi != null) {
      builder.append(", ");
      builder.append("udi=").append(udi);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExplanationOfBenefit_SubDetail {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> net = java.util.Optional.empty();
    boolean netIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> revenue = java.util.Optional.empty();
    boolean revenueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber = java.util.Optional.empty();
    boolean noteNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier = java.util.Optional.empty();
    boolean modifierIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factor = java.util.Optional.empty();
    boolean factorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication = java.util.Optional.empty();
    boolean adjudicationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode = java.util.Optional.empty();
    boolean programCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> unitPrice = java.util.Optional.empty();
    boolean unitPriceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> udi = java.util.Optional.empty();
    boolean udiIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("net")
    public void setNet(java.util.Optional<com.fhir.Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("revenue")
    public void setRevenue(java.util.Optional<com.fhir.CodeableConcept> revenue) {
      this.revenue = revenue;
      this.revenueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public void setNoteNumber(java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public void setAdjudication(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("programCode")
    public void setProgramCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("udi")
    public void setUdi(java.util.Optional<java.util.List<com.fhir.Reference>> udi) {
      this.udi = udi;
      this.udiIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> revenue() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> udi() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_SubDetail fromJson(Json json) {
    ImmutableExplanationOfBenefit_SubDetail.Builder builder = ((ImmutableExplanationOfBenefit_SubDetail.Builder) ImmutableExplanationOfBenefit_SubDetail.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.revenueIsSet) {
      builder.revenue(json.revenue);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
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
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.udiIsSet) {
      builder.udi(json.udi);
    }
    return (ImmutableExplanationOfBenefit_SubDetail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_SubDetail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_SubDetail instance
   */
  public static ExplanationOfBenefit_SubDetail copyOf(ExplanationOfBenefit_SubDetail instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_SubDetail) {
      return (ImmutableExplanationOfBenefit_SubDetail) instance;
    }
    return ((ImmutableExplanationOfBenefit_SubDetail.Builder) ImmutableExplanationOfBenefit_SubDetail.builder())
        .modifierExtension(instance.modifierExtension())
        .net(instance.net())
        .revenue(instance.revenue())
        .noteNumber(instance.noteNumber())
        .modifier(instance.modifier())
        .productOrService(instance.productOrService())
        .quantity(instance.quantity())
        .factor(instance.factor())
        .category(instance.category())
        .sequence(instance.sequence())
        .adjudication(instance.adjudication())
        .programCode(instance.programCode())
        .extension(instance.extension())
        .unitPrice(instance.unitPrice())
        .id(instance.id())
        .udi(instance.udi())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
   * <pre>
   * ImmutableExplanationOfBenefit_SubDetail.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension}
   *    .net(com.fhir.Money) // optional {@link ExplanationOfBenefit_SubDetail#net() net}
   *    .revenue(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_SubDetail#revenue() revenue}
   *    .noteNumber(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber}
   *    .modifier(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#modifier() modifier}
   *    .productOrService(com.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService}
   *    .quantity(com.fhir.Quantity) // optional {@link ExplanationOfBenefit_SubDetail#quantity() quantity}
   *    .factor(com.fhir.decimal) // optional {@link ExplanationOfBenefit_SubDetail#factor() factor}
   *    .category(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_SubDetail#category() category}
   *    .sequence(com.fhir.positiveInt) // optional {@link ExplanationOfBenefit_SubDetail#sequence() sequence}
   *    .adjudication(List&amp;lt;com.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication}
   *    .programCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#programCode() programCode}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#extension() extension}
   *    .unitPrice(com.fhir.Money) // optional {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice}
   *    .id(String) // optional {@link ExplanationOfBenefit_SubDetail#id() id}
   *    .udi(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#udi() udi}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_SubDetail builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableExplanationOfBenefit_SubDetail.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_NET = 0x2L;
    private static final long OPT_BIT_REVENUE = 0x4L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x8L;
    private static final long OPT_BIT_MODIFIER = 0x10L;
    private static final long OPT_BIT_QUANTITY = 0x20L;
    private static final long OPT_BIT_FACTOR = 0x40L;
    private static final long OPT_BIT_CATEGORY = 0x80L;
    private static final long OPT_BIT_SEQUENCE = 0x100L;
    private static final long OPT_BIT_ADJUDICATION = 0x200L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_UNIT_PRICE = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_UDI = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Money net;
    private @javax.annotation.Nullable com.fhir.CodeableConcept revenue;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> modifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productOrService;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.decimal factor;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Money unitPrice;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    public final Builder revenue(com.fhir.CodeableConcept revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = java.util.Objects.requireNonNull(revenue, "revenue");
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revenue")
    public final Builder revenue(java.util.Optional<? extends com.fhir.CodeableConcept> revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = revenue.orElse(null);
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
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
     * Initializes the value for the {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(com.fhir.CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = java.util.Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public final Builder adjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder programCode(java.util.List<com.fhir.CodeableConcept> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = java.util.Objects.requireNonNull(programCode, "programCode");
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("programCode")
    public final Builder programCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = programCode.orElse(null);
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    public final Builder udi(java.util.List<com.fhir.Reference> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = java.util.Objects.requireNonNull(udi, "udi");
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("udi")
    public final Builder udi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = udi.orElse(null);
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
     * @return An immutable instance of ExplanationOfBenefit_SubDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExplanationOfBenefit_SubDetail build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_SubDetail(
          modifierExtension,
          net,
          revenue,
          noteNumber,
          modifier,
          productOrService,
          quantity,
          factor,
          category,
          sequence,
          adjudication,
          programCode,
          extension,
          unitPrice,
          id,
          udi);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean revenueIsSet() {
      return (optBits & OPT_BIT_REVENUE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
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

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean udiIsSet() {
      return (optBits & OPT_BIT_UDI) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExplanationOfBenefit_SubDetail is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ExplanationOfBenefit_SubDetail, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(com.fhir.CodeableConcept productOrService);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(com.fhir.Money net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(java.util.Optional<? extends com.fhir.Money> net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal revenue(com.fhir.CodeableConcept revenue);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal revenue(java.util.Optional<? extends com.fhir.CodeableConcept> revenue);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(java.util.List<com.fhir.positiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(java.util.List<com.fhir.CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(com.fhir.decimal factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(java.util.Optional<? extends com.fhir.decimal> factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(com.fhir.positiveInt sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(java.util.List<com.fhir.CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(com.fhir.Money unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(java.util.Optional<? extends com.fhir.Money> unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udi(java.util.List<com.fhir.Reference> udi);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> udi);

    /**
     * Builds a new {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
     * @return An immutable instance of ExplanationOfBenefit_SubDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_SubDetail build();
  }
}
