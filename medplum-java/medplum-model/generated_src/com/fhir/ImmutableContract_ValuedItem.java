//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Contract_ValuedItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_ValuedItem.builder()}.
 */
@org.immutables.value.Generated(from = "Contract_ValuedItem", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_ValuedItem implements com.fhir.Contract_ValuedItem {
  private final @javax.annotation.Nullable com.fhir.decimal points;
  private final @javax.annotation.Nullable java.lang.String payment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept entityCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Reference recipient;
  private final @javax.annotation.Nullable com.fhir.Money net;
  private final @javax.annotation.Nullable com.fhir.Reference entityReference;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable com.fhir.decimal factor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.unsignedInt> securityLabelNumber;
  private final @javax.annotation.Nullable com.fhir.dateTime paymentDate;
  private final @javax.annotation.Nullable com.fhir.Reference responsible;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Money unitPrice;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> linkId;
  private final @javax.annotation.Nullable com.fhir.dateTime effectiveTime;

  private ImmutableContract_ValuedItem(
      @javax.annotation.Nullable com.fhir.decimal points,
      @javax.annotation.Nullable java.lang.String payment,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept entityCodeableConcept,
      @javax.annotation.Nullable com.fhir.Reference recipient,
      @javax.annotation.Nullable com.fhir.Money net,
      @javax.annotation.Nullable com.fhir.Reference entityReference,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable com.fhir.decimal factor,
      @javax.annotation.Nullable java.util.List<com.fhir.unsignedInt> securityLabelNumber,
      @javax.annotation.Nullable com.fhir.dateTime paymentDate,
      @javax.annotation.Nullable com.fhir.Reference responsible,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Money unitPrice,
      @javax.annotation.Nullable java.util.List<java.lang.String> linkId,
      @javax.annotation.Nullable com.fhir.dateTime effectiveTime) {
    this.points = points;
    this.payment = payment;
    this.modifierExtension = modifierExtension;
    this.entityCodeableConcept = entityCodeableConcept;
    this.recipient = recipient;
    this.net = net;
    this.entityReference = entityReference;
    this.identifier = identifier;
    this.factor = factor;
    this.securityLabelNumber = securityLabelNumber;
    this.paymentDate = paymentDate;
    this.responsible = responsible;
    this.id = id;
    this.quantity = quantity;
    this.extension = extension;
    this.unitPrice = unitPrice;
    this.linkId = linkId;
    this.effectiveTime = effectiveTime;
  }

  /**
   * @return The value of the {@code points} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("points")
  @Override
  public java.util.Optional<com.fhir.decimal> points() {
    return java.util.Optional.ofNullable(points);
  }

  /**
   * @return The value of the {@code payment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payment")
  @Override
  public java.util.Optional<java.lang.String> payment() {
    return java.util.Optional.ofNullable(payment);
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
   * @return The value of the {@code entityCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entityCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> entityCodeableConcept() {
    return java.util.Optional.ofNullable(entityCodeableConcept);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recipient")
  @Override
  public java.util.Optional<com.fhir.Reference> recipient() {
    return java.util.Optional.ofNullable(recipient);
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
   * @return The value of the {@code entityReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entityReference")
  @Override
  public java.util.Optional<com.fhir.Reference> entityReference() {
    return java.util.Optional.ofNullable(entityReference);
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
   * @return The value of the {@code factor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("factor")
  @Override
  public java.util.Optional<com.fhir.decimal> factor() {
    return java.util.Optional.ofNullable(factor);
  }

  /**
   * @return The value of the {@code securityLabelNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("securityLabelNumber")
  @Override
  public java.util.Optional<java.util.List<com.fhir.unsignedInt>> securityLabelNumber() {
    return java.util.Optional.ofNullable(securityLabelNumber);
  }

  /**
   * @return The value of the {@code paymentDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paymentDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> paymentDate() {
    return java.util.Optional.ofNullable(paymentDate);
  }

  /**
   * @return The value of the {@code responsible} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responsible")
  @Override
  public java.util.Optional<com.fhir.Reference> responsible() {
    return java.util.Optional.ofNullable(responsible);
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
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantity() {
    return java.util.Optional.ofNullable(quantity);
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
   * @return The value of the {@code linkId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("linkId")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> linkId() {
    return java.util.Optional.ofNullable(linkId);
  }

  /**
   * @return The value of the {@code effectiveTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveTime")
  @Override
  public java.util.Optional<com.fhir.dateTime> effectiveTime() {
    return java.util.Optional.ofNullable(effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#points() points} attribute.
   * @param value The value for points
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPoints(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "points");
    if (this.points == newValue) return this;
    return new ImmutableContract_ValuedItem(
        newValue,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#points() points} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for points
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withPoints(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.points == value) return this;
    return new ImmutableContract_ValuedItem(
        value,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#payment() payment} attribute.
   * @param value The value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPayment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "payment");
    if (java.util.Objects.equals(this.payment, newValue)) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        newValue,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#payment() payment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPayment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.payment, value)) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        value,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        newValue,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        value,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} attribute.
   * @param value The value for entityCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withEntityCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "entityCodeableConcept");
    if (this.entityCodeableConcept == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        newValue,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entityCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withEntityCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.entityCodeableConcept == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        value,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withRecipient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        newValue,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withRecipient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        value,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withNet(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        newValue,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withNet(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        value,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#entityReference() entityReference} attribute.
   * @param value The value for entityReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withEntityReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "entityReference");
    if (this.entityReference == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        newValue,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#entityReference() entityReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entityReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withEntityReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.entityReference == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        value,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        newValue,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        value,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withFactor(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        newValue,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withFactor(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        value,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} attribute.
   * @param value The value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withSecurityLabelNumber(java.util.List<com.fhir.unsignedInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.unsignedInt> newValue = java.util.Objects.requireNonNull(value, "securityLabelNumber");
    if (this.securityLabelNumber == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        newValue,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withSecurityLabelNumber(java.util.Optional<? extends java.util.List<com.fhir.unsignedInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.unsignedInt> value = optional.orElse(null);
    if (this.securityLabelNumber == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        value,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#paymentDate() paymentDate} attribute.
   * @param value The value for paymentDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPaymentDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "paymentDate");
    if (this.paymentDate == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        newValue,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#paymentDate() paymentDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withPaymentDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.paymentDate == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        value,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withResponsible(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "responsible");
    if (this.responsible == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        newValue,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#responsible() responsible} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withResponsible(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.responsible == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        value,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        newValue,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        value,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        newValue,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        value,
        this.extension,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        newValue,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        value,
        this.unitPrice,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withUnitPrice(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        newValue,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withUnitPrice(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        value,
        this.linkId,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withLinkId(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "linkId");
    if (this.linkId == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        newValue,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#linkId() linkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withLinkId(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.linkId == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        value,
        this.effectiveTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#effectiveTime() effectiveTime} attribute.
   * @param value The value for effectiveTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withEffectiveTime(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "effectiveTime");
    if (this.effectiveTime == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#effectiveTime() effectiveTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withEffectiveTime(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.effectiveTime == value) return this;
    return new ImmutableContract_ValuedItem(
        this.points,
        this.payment,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.recipient,
        this.net,
        this.entityReference,
        this.identifier,
        this.factor,
        this.securityLabelNumber,
        this.paymentDate,
        this.responsible,
        this.id,
        this.quantity,
        this.extension,
        this.unitPrice,
        this.linkId,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_ValuedItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_ValuedItem
        && equalTo((ImmutableContract_ValuedItem) another);
  }

  private boolean equalTo(ImmutableContract_ValuedItem another) {
    return java.util.Objects.equals(points, another.points)
        && java.util.Objects.equals(payment, another.payment)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(entityCodeableConcept, another.entityCodeableConcept)
        && java.util.Objects.equals(recipient, another.recipient)
        && java.util.Objects.equals(net, another.net)
        && java.util.Objects.equals(entityReference, another.entityReference)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(factor, another.factor)
        && java.util.Objects.equals(securityLabelNumber, another.securityLabelNumber)
        && java.util.Objects.equals(paymentDate, another.paymentDate)
        && java.util.Objects.equals(responsible, another.responsible)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(unitPrice, another.unitPrice)
        && java.util.Objects.equals(linkId, another.linkId)
        && java.util.Objects.equals(effectiveTime, another.effectiveTime);
  }

  /**
   * Computes a hash code from attributes: {@code points}, {@code payment}, {@code modifierExtension}, {@code entityCodeableConcept}, {@code recipient}, {@code net}, {@code entityReference}, {@code identifier}, {@code factor}, {@code securityLabelNumber}, {@code paymentDate}, {@code responsible}, {@code id}, {@code quantity}, {@code extension}, {@code unitPrice}, {@code linkId}, {@code effectiveTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(points);
    h += (h << 5) + java.util.Objects.hashCode(payment);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(entityCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(recipient);
    h += (h << 5) + java.util.Objects.hashCode(net);
    h += (h << 5) + java.util.Objects.hashCode(entityReference);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(factor);
    h += (h << 5) + java.util.Objects.hashCode(securityLabelNumber);
    h += (h << 5) + java.util.Objects.hashCode(paymentDate);
    h += (h << 5) + java.util.Objects.hashCode(responsible);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(unitPrice);
    h += (h << 5) + java.util.Objects.hashCode(linkId);
    h += (h << 5) + java.util.Objects.hashCode(effectiveTime);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_ValuedItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Contract_ValuedItem{");
    if (points != null) {
      builder.append("points=").append(points);
    }
    if (payment != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("payment=").append(payment);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (entityCodeableConcept != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("entityCodeableConcept=").append(entityCodeableConcept);
    }
    if (recipient != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (net != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("net=").append(net);
    }
    if (entityReference != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("entityReference=").append(entityReference);
    }
    if (identifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (factor != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (securityLabelNumber != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("securityLabelNumber=").append(securityLabelNumber);
    }
    if (paymentDate != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("paymentDate=").append(paymentDate);
    }
    if (responsible != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (quantity != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (unitPrice != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (linkId != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (effectiveTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("effectiveTime=").append(effectiveTime);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Contract_ValuedItem", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Contract_ValuedItem {
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> points = java.util.Optional.empty();
    boolean pointsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> payment = java.util.Optional.empty();
    boolean paymentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> entityCodeableConcept = java.util.Optional.empty();
    boolean entityCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> recipient = java.util.Optional.empty();
    boolean recipientIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> net = java.util.Optional.empty();
    boolean netIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> entityReference = java.util.Optional.empty();
    boolean entityReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factor = java.util.Optional.empty();
    boolean factorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.unsignedInt>> securityLabelNumber = java.util.Optional.empty();
    boolean securityLabelNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> paymentDate = java.util.Optional.empty();
    boolean paymentDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> responsible = java.util.Optional.empty();
    boolean responsibleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> unitPrice = java.util.Optional.empty();
    boolean unitPriceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> linkId = java.util.Optional.empty();
    boolean linkIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> effectiveTime = java.util.Optional.empty();
    boolean effectiveTimeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("points")
    public void setPoints(java.util.Optional<com.fhir.decimal> points) {
      this.points = points;
      this.pointsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public void setPayment(java.util.Optional<java.lang.String> payment) {
      this.payment = payment;
      this.paymentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("entityCodeableConcept")
    public void setEntityCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> entityCodeableConcept) {
      this.entityCodeableConcept = entityCodeableConcept;
      this.entityCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public void setRecipient(java.util.Optional<com.fhir.Reference> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("net")
    public void setNet(java.util.Optional<com.fhir.Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("entityReference")
    public void setEntityReference(java.util.Optional<com.fhir.Reference> entityReference) {
      this.entityReference = entityReference;
      this.entityReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("factor")
    public void setFactor(java.util.Optional<com.fhir.decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabelNumber")
    public void setSecurityLabelNumber(java.util.Optional<java.util.List<com.fhir.unsignedInt>> securityLabelNumber) {
      this.securityLabelNumber = securityLabelNumber;
      this.securityLabelNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentDate")
    public void setPaymentDate(java.util.Optional<com.fhir.dateTime> paymentDate) {
      this.paymentDate = paymentDate;
      this.paymentDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public void setResponsible(java.util.Optional<com.fhir.Reference> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("linkId")
    public void setLinkId(java.util.Optional<java.util.List<java.lang.String>> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveTime")
    public void setEffectiveTime(java.util.Optional<com.fhir.dateTime> effectiveTime) {
      this.effectiveTime = effectiveTime;
      this.effectiveTimeIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.decimal> points() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> payment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> entityCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.unsignedInt>> securityLabelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> paymentDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> effectiveTime() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableContract_ValuedItem fromJson(Json json) {
    ImmutableContract_ValuedItem.Builder builder = ImmutableContract_ValuedItem.builder();
    if (json.pointsIsSet) {
      builder.points(json.points);
    }
    if (json.paymentIsSet) {
      builder.payment(json.payment);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.entityCodeableConceptIsSet) {
      builder.entityCodeableConcept(json.entityCodeableConcept);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.entityReferenceIsSet) {
      builder.entityReference(json.entityReference);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.securityLabelNumberIsSet) {
      builder.securityLabelNumber(json.securityLabelNumber);
    }
    if (json.paymentDateIsSet) {
      builder.paymentDate(json.paymentDate);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.effectiveTimeIsSet) {
      builder.effectiveTime(json.effectiveTime);
    }
    return (ImmutableContract_ValuedItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_ValuedItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_ValuedItem instance
   */
  public static Contract_ValuedItem copyOf(Contract_ValuedItem instance) {
    if (instance instanceof ImmutableContract_ValuedItem) {
      return (ImmutableContract_ValuedItem) instance;
    }
    return ImmutableContract_ValuedItem.builder()
        .points(instance.points())
        .payment(instance.payment())
        .modifierExtension(instance.modifierExtension())
        .entityCodeableConcept(instance.entityCodeableConcept())
        .recipient(instance.recipient())
        .net(instance.net())
        .entityReference(instance.entityReference())
        .identifier(instance.identifier())
        .factor(instance.factor())
        .securityLabelNumber(instance.securityLabelNumber())
        .paymentDate(instance.paymentDate())
        .responsible(instance.responsible())
        .id(instance.id())
        .quantity(instance.quantity())
        .extension(instance.extension())
        .unitPrice(instance.unitPrice())
        .linkId(instance.linkId())
        .effectiveTime(instance.effectiveTime())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_ValuedItem Contract_ValuedItem}.
   * <pre>
   * ImmutableContract_ValuedItem.builder()
   *    .points(com.fhir.decimal) // optional {@link Contract_ValuedItem#points() points}
   *    .payment(String) // optional {@link Contract_ValuedItem#payment() payment}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_ValuedItem#modifierExtension() modifierExtension}
   *    .entityCodeableConcept(com.fhir.CodeableConcept) // optional {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept}
   *    .recipient(com.fhir.Reference) // optional {@link Contract_ValuedItem#recipient() recipient}
   *    .net(com.fhir.Money) // optional {@link Contract_ValuedItem#net() net}
   *    .entityReference(com.fhir.Reference) // optional {@link Contract_ValuedItem#entityReference() entityReference}
   *    .identifier(com.fhir.Identifier) // optional {@link Contract_ValuedItem#identifier() identifier}
   *    .factor(com.fhir.decimal) // optional {@link Contract_ValuedItem#factor() factor}
   *    .securityLabelNumber(List&amp;lt;com.fhir.unsignedInt&amp;gt;) // optional {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber}
   *    .paymentDate(com.fhir.dateTime) // optional {@link Contract_ValuedItem#paymentDate() paymentDate}
   *    .responsible(com.fhir.Reference) // optional {@link Contract_ValuedItem#responsible() responsible}
   *    .id(String) // optional {@link Contract_ValuedItem#id() id}
   *    .quantity(com.fhir.Quantity) // optional {@link Contract_ValuedItem#quantity() quantity}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_ValuedItem#extension() extension}
   *    .unitPrice(com.fhir.Money) // optional {@link Contract_ValuedItem#unitPrice() unitPrice}
   *    .linkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_ValuedItem#linkId() linkId}
   *    .effectiveTime(com.fhir.dateTime) // optional {@link Contract_ValuedItem#effectiveTime() effectiveTime}
   *    .build();
   * </pre>
   * @return A new Contract_ValuedItem builder
   */
  public static ImmutableContract_ValuedItem.Builder builder() {
    return new ImmutableContract_ValuedItem.Builder();
  }

  /**
   * Builds instances of type {@link Contract_ValuedItem Contract_ValuedItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Contract_ValuedItem", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_POINTS = 0x1L;
    private static final long OPT_BIT_PAYMENT = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ENTITY_CODEABLE_CONCEPT = 0x8L;
    private static final long OPT_BIT_RECIPIENT = 0x10L;
    private static final long OPT_BIT_NET = 0x20L;
    private static final long OPT_BIT_ENTITY_REFERENCE = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_FACTOR = 0x100L;
    private static final long OPT_BIT_SECURITY_LABEL_NUMBER = 0x200L;
    private static final long OPT_BIT_PAYMENT_DATE = 0x400L;
    private static final long OPT_BIT_RESPONSIBLE = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_QUANTITY = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_UNIT_PRICE = 0x8000L;
    private static final long OPT_BIT_LINK_ID = 0x10000L;
    private static final long OPT_BIT_EFFECTIVE_TIME = 0x20000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.decimal points;
    private @javax.annotation.Nullable java.lang.String payment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept entityCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Reference recipient;
    private @javax.annotation.Nullable com.fhir.Money net;
    private @javax.annotation.Nullable com.fhir.Reference entityReference;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.decimal factor;
    private @javax.annotation.Nullable java.util.List<com.fhir.unsignedInt> securityLabelNumber;
    private @javax.annotation.Nullable com.fhir.dateTime paymentDate;
    private @javax.annotation.Nullable com.fhir.Reference responsible;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Money unitPrice;
    private @javax.annotation.Nullable java.util.List<java.lang.String> linkId;
    private @javax.annotation.Nullable com.fhir.dateTime effectiveTime;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#points() points} to points.
     * @param points The value for points
     * @return {@code this} builder for chained invocation
     */
    public final Builder points(com.fhir.decimal points) {
      checkNotIsSet(pointsIsSet(), "points");
      this.points = java.util.Objects.requireNonNull(points, "points");
      optBits |= OPT_BIT_POINTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#points() points} to points.
     * @param points The value for points
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("points")
    public final Builder points(java.util.Optional<? extends com.fhir.decimal> points) {
      checkNotIsSet(pointsIsSet(), "points");
      this.points = points.orElse(null);
      optBits |= OPT_BIT_POINTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    public final Builder payment(java.lang.String payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = java.util.Objects.requireNonNull(payment, "payment");
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public final Builder payment(java.util.Optional<java.lang.String> payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = payment.orElse(null);
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_ValuedItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} to entityCodeableConcept.
     * @param entityCodeableConcept The value for entityCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder entityCodeableConcept(com.fhir.CodeableConcept entityCodeableConcept) {
      checkNotIsSet(entityCodeableConceptIsSet(), "entityCodeableConcept");
      this.entityCodeableConcept = java.util.Objects.requireNonNull(entityCodeableConcept, "entityCodeableConcept");
      optBits |= OPT_BIT_ENTITY_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} to entityCodeableConcept.
     * @param entityCodeableConcept The value for entityCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityCodeableConcept")
    public final Builder entityCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> entityCodeableConcept) {
      checkNotIsSet(entityCodeableConceptIsSet(), "entityCodeableConcept");
      this.entityCodeableConcept = entityCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ENTITY_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(com.fhir.Reference recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = java.util.Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public final Builder recipient(java.util.Optional<? extends com.fhir.Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#net() net} to net.
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
     * Initializes the optional value {@link Contract_ValuedItem#net() net} to net.
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
     * Initializes the optional value {@link Contract_ValuedItem#entityReference() entityReference} to entityReference.
     * @param entityReference The value for entityReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder entityReference(com.fhir.Reference entityReference) {
      checkNotIsSet(entityReferenceIsSet(), "entityReference");
      this.entityReference = java.util.Objects.requireNonNull(entityReference, "entityReference");
      optBits |= OPT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#entityReference() entityReference} to entityReference.
     * @param entityReference The value for entityReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityReference")
    public final Builder entityReference(java.util.Optional<? extends com.fhir.Reference> entityReference) {
      checkNotIsSet(entityReferenceIsSet(), "entityReference");
      this.entityReference = entityReference.orElse(null);
      optBits |= OPT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract_ValuedItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract_ValuedItem#factor() factor} to factor.
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
     * Initializes the optional value {@link Contract_ValuedItem#factor() factor} to factor.
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
     * Initializes the optional value {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabelNumber(java.util.List<com.fhir.unsignedInt> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = java.util.Objects.requireNonNull(securityLabelNumber, "securityLabelNumber");
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabelNumber")
    public final Builder securityLabelNumber(java.util.Optional<? extends java.util.List<com.fhir.unsignedInt>> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = securityLabelNumber.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentDate(com.fhir.dateTime paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = java.util.Objects.requireNonNull(paymentDate, "paymentDate");
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentDate")
    public final Builder paymentDate(java.util.Optional<? extends com.fhir.dateTime> paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = paymentDate.orElse(null);
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsible(com.fhir.Reference responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = java.util.Objects.requireNonNull(responsible, "responsible");
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public final Builder responsible(java.util.Optional<? extends com.fhir.Reference> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#id() id} to id.
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
     * Initializes the optional value {@link Contract_ValuedItem#id() id} to id.
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
     * Initializes the optional value {@link Contract_ValuedItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Contract_ValuedItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Contract_ValuedItem#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_ValuedItem#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_ValuedItem#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Contract_ValuedItem#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Contract_ValuedItem#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(java.util.List<java.lang.String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = java.util.Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("linkId")
    public final Builder linkId(java.util.Optional<? extends java.util.List<java.lang.String>> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#effectiveTime() effectiveTime} to effectiveTime.
     * @param effectiveTime The value for effectiveTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveTime(com.fhir.dateTime effectiveTime) {
      checkNotIsSet(effectiveTimeIsSet(), "effectiveTime");
      this.effectiveTime = java.util.Objects.requireNonNull(effectiveTime, "effectiveTime");
      optBits |= OPT_BIT_EFFECTIVE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#effectiveTime() effectiveTime} to effectiveTime.
     * @param effectiveTime The value for effectiveTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveTime")
    public final Builder effectiveTime(java.util.Optional<? extends com.fhir.dateTime> effectiveTime) {
      checkNotIsSet(effectiveTimeIsSet(), "effectiveTime");
      this.effectiveTime = effectiveTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_TIME;
      return this;
    }

    /**
     * Builds a new {@link Contract_ValuedItem Contract_ValuedItem}.
     * @return An immutable instance of Contract_ValuedItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Contract_ValuedItem build() {
      return new ImmutableContract_ValuedItem(
          points,
          payment,
          modifierExtension,
          entityCodeableConcept,
          recipient,
          net,
          entityReference,
          identifier,
          factor,
          securityLabelNumber,
          paymentDate,
          responsible,
          id,
          quantity,
          extension,
          unitPrice,
          linkId,
          effectiveTime);
    }

    private boolean pointsIsSet() {
      return (optBits & OPT_BIT_POINTS) != 0;
    }

    private boolean paymentIsSet() {
      return (optBits & OPT_BIT_PAYMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean entityCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ENTITY_CODEABLE_CONCEPT) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean entityReferenceIsSet() {
      return (optBits & OPT_BIT_ENTITY_REFERENCE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean securityLabelNumberIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL_NUMBER) != 0;
    }

    private boolean paymentDateIsSet() {
      return (optBits & OPT_BIT_PAYMENT_DATE) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean effectiveTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_TIME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Contract_ValuedItem is strict, attribute is already set: ".concat(name));
    }
  }
}
