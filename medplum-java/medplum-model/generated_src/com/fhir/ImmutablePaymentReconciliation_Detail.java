//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PaymentReconciliation_Detail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePaymentReconciliation_Detail.builder()}.
 */
@org.immutables.value.Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePaymentReconciliation_Detail implements com.fhir.PaymentReconciliation_Detail {
  private final @javax.annotation.Nullable com.fhir.Identifier predecessor;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Reference response;
  private final @javax.annotation.Nullable com.fhir.date date;
  private final @javax.annotation.Nullable com.fhir.Money amount;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Reference submitter;
  private final @javax.annotation.Nullable com.fhir.Reference payee;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference responsible;
  private final @javax.annotation.Nullable com.fhir.Reference request;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutablePaymentReconciliation_Detail(
      @javax.annotation.Nullable com.fhir.Identifier predecessor,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Reference response,
      @javax.annotation.Nullable com.fhir.date date,
      @javax.annotation.Nullable com.fhir.Money amount,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Reference submitter,
      @javax.annotation.Nullable com.fhir.Reference payee,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference responsible,
      @javax.annotation.Nullable com.fhir.Reference request,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.predecessor = predecessor;
    this.identifier = identifier;
    this.type = type;
    this.response = response;
    this.date = date;
    this.amount = amount;
    this.id = id;
    this.submitter = submitter;
    this.payee = payee;
    this.modifierExtension = modifierExtension;
    this.responsible = responsible;
    this.request = request;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code predecessor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("predecessor")
  @Override
  public java.util.Optional<com.fhir.Identifier> predecessor() {
    return java.util.Optional.ofNullable(predecessor);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public com.fhir.CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("response")
  @Override
  public java.util.Optional<com.fhir.Reference> response() {
    return java.util.Optional.ofNullable(response);
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
   * @return The value of the {@code amount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("amount")
  @Override
  public java.util.Optional<com.fhir.Money> amount() {
    return java.util.Optional.ofNullable(amount);
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
   * @return The value of the {@code submitter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("submitter")
  @Override
  public java.util.Optional<com.fhir.Reference> submitter() {
    return java.util.Optional.ofNullable(submitter);
  }

  /**
   * @return The value of the {@code payee} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payee")
  @Override
  public java.util.Optional<com.fhir.Reference> payee() {
    return java.util.Optional.ofNullable(payee);
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
   * @return The value of the {@code responsible} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responsible")
  @Override
  public java.util.Optional<com.fhir.Reference> responsible() {
    return java.util.Optional.ofNullable(responsible);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public java.util.Optional<com.fhir.Reference> request() {
    return java.util.Optional.ofNullable(request);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#predecessor() predecessor} attribute.
   * @param value The value for predecessor
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withPredecessor(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "predecessor");
    if (this.predecessor == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        newValue,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#predecessor() predecessor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for predecessor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withPredecessor(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.predecessor == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        value,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        newValue,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        value,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentReconciliation_Detail#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        newValue,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withResponse(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        newValue,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withResponse(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        value,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        newValue,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        value,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withAmount(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        newValue,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withAmount(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        value,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        newValue,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        value,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#submitter() submitter} attribute.
   * @param value The value for submitter
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withSubmitter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "submitter");
    if (this.submitter == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        newValue,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#submitter() submitter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for submitter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withSubmitter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.submitter == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        value,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withPayee(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        newValue,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withPayee(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        value,
        this.modifierExtension,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        newValue,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        value,
        this.responsible,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withResponsible(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "responsible");
    if (this.responsible == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        newValue,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#responsible() responsible} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withResponsible(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.responsible == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        value,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withRequest(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withRequest(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.predecessor,
        this.identifier,
        this.type,
        this.response,
        this.date,
        this.amount,
        this.id,
        this.submitter,
        this.payee,
        this.modifierExtension,
        this.responsible,
        this.request,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePaymentReconciliation_Detail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePaymentReconciliation_Detail
        && equalTo((ImmutablePaymentReconciliation_Detail) another);
  }

  private boolean equalTo(ImmutablePaymentReconciliation_Detail another) {
    return java.util.Objects.equals(predecessor, another.predecessor)
        && java.util.Objects.equals(identifier, another.identifier)
        && type.equals(another.type)
        && java.util.Objects.equals(response, another.response)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(amount, another.amount)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(submitter, another.submitter)
        && java.util.Objects.equals(payee, another.payee)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(responsible, another.responsible)
        && java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code predecessor}, {@code identifier}, {@code type}, {@code response}, {@code date}, {@code amount}, {@code id}, {@code submitter}, {@code payee}, {@code modifierExtension}, {@code responsible}, {@code request}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(predecessor);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(response);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(amount);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(submitter);
    h += (h << 5) + java.util.Objects.hashCode(payee);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(responsible);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code PaymentReconciliation_Detail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PaymentReconciliation_Detail{");
    if (predecessor != null) {
      builder.append("predecessor=").append(predecessor);
    }
    if (identifier != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("type=").append(type);
    if (response != null) {
      builder.append(", ");
      builder.append("response=").append(response);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (amount != null) {
      builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (submitter != null) {
      builder.append(", ");
      builder.append("submitter=").append(submitter);
    }
    if (payee != null) {
      builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (responsible != null) {
      builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PaymentReconciliation_Detail {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> predecessor = java.util.Optional.empty();
    boolean predecessorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> response = java.util.Optional.empty();
    boolean responseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> amount = java.util.Optional.empty();
    boolean amountIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> submitter = java.util.Optional.empty();
    boolean submitterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> payee = java.util.Optional.empty();
    boolean payeeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> responsible = java.util.Optional.empty();
    boolean responsibleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("predecessor")
    public void setPredecessor(java.util.Optional<com.fhir.Identifier> predecessor) {
      this.predecessor = predecessor;
      this.predecessorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public void setResponse(java.util.Optional<com.fhir.Reference> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public void setAmount(java.util.Optional<com.fhir.Money> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("submitter")
    public void setSubmitter(java.util.Optional<com.fhir.Reference> submitter) {
      this.submitter = submitter;
      this.submitterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payee")
    public void setPayee(java.util.Optional<com.fhir.Reference> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responsible")
    public void setResponsible(java.util.Optional<com.fhir.Reference> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Identifier> predecessor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> response() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> amount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> submitter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> payee() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePaymentReconciliation_Detail fromJson(Json json) {
    ImmutablePaymentReconciliation_Detail.Builder builder = ((ImmutablePaymentReconciliation_Detail.Builder) ImmutablePaymentReconciliation_Detail.builder());
    if (json.predecessorIsSet) {
      builder.predecessor(json.predecessor);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.submitterIsSet) {
      builder.submitter(json.submitter);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutablePaymentReconciliation_Detail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PaymentReconciliation_Detail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PaymentReconciliation_Detail instance
   */
  public static PaymentReconciliation_Detail copyOf(PaymentReconciliation_Detail instance) {
    if (instance instanceof ImmutablePaymentReconciliation_Detail) {
      return (ImmutablePaymentReconciliation_Detail) instance;
    }
    return ((ImmutablePaymentReconciliation_Detail.Builder) ImmutablePaymentReconciliation_Detail.builder())
        .predecessor(instance.predecessor())
        .identifier(instance.identifier())
        .type(instance.type())
        .response(instance.response())
        .date(instance.date())
        .amount(instance.amount())
        .id(instance.id())
        .submitter(instance.submitter())
        .payee(instance.payee())
        .modifierExtension(instance.modifierExtension())
        .responsible(instance.responsible())
        .request(instance.request())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
   * <pre>
   * ImmutablePaymentReconciliation_Detail.builder()
   *    .predecessor(com.fhir.Identifier) // optional {@link PaymentReconciliation_Detail#predecessor() predecessor}
   *    .identifier(com.fhir.Identifier) // optional {@link PaymentReconciliation_Detail#identifier() identifier}
   *    .type(com.fhir.CodeableConcept) // required {@link PaymentReconciliation_Detail#type() type}
   *    .response(com.fhir.Reference) // optional {@link PaymentReconciliation_Detail#response() response}
   *    .date(com.fhir.date) // optional {@link PaymentReconciliation_Detail#date() date}
   *    .amount(com.fhir.Money) // optional {@link PaymentReconciliation_Detail#amount() amount}
   *    .id(String) // optional {@link PaymentReconciliation_Detail#id() id}
   *    .submitter(com.fhir.Reference) // optional {@link PaymentReconciliation_Detail#submitter() submitter}
   *    .payee(com.fhir.Reference) // optional {@link PaymentReconciliation_Detail#payee() payee}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension}
   *    .responsible(com.fhir.Reference) // optional {@link PaymentReconciliation_Detail#responsible() responsible}
   *    .request(com.fhir.Reference) // optional {@link PaymentReconciliation_Detail#request() request}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation_Detail#extension() extension}
   *    .build();
   * </pre>
   * @return A new PaymentReconciliation_Detail builder
   */
  public static TypeBuildStage builder() {
    return new ImmutablePaymentReconciliation_Detail.Builder();
  }

  /**
   * Builds instances of type {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_PREDECESSOR = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_RESPONSE = 0x4L;
    private static final long OPT_BIT_DATE = 0x8L;
    private static final long OPT_BIT_AMOUNT = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_SUBMITTER = 0x40L;
    private static final long OPT_BIT_PAYEE = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_RESPONSIBLE = 0x200L;
    private static final long OPT_BIT_REQUEST = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Identifier predecessor;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Reference response;
    private @javax.annotation.Nullable com.fhir.date date;
    private @javax.annotation.Nullable com.fhir.Money amount;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Reference submitter;
    private @javax.annotation.Nullable com.fhir.Reference payee;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference responsible;
    private @javax.annotation.Nullable com.fhir.Reference request;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for chained invocation
     */
    public final Builder predecessor(com.fhir.Identifier predecessor) {
      checkNotIsSet(predecessorIsSet(), "predecessor");
      this.predecessor = java.util.Objects.requireNonNull(predecessor, "predecessor");
      optBits |= OPT_BIT_PREDECESSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("predecessor")
    public final Builder predecessor(java.util.Optional<? extends com.fhir.Identifier> predecessor) {
      checkNotIsSet(predecessorIsSet(), "predecessor");
      this.predecessor = predecessor.orElse(null);
      optBits |= OPT_BIT_PREDECESSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link PaymentReconciliation_Detail#type() type} attribute.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(com.fhir.Reference response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = java.util.Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public final Builder response(java.util.Optional<? extends com.fhir.Reference> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for chained invocation
     */
    public final Builder submitter(com.fhir.Reference submitter) {
      checkNotIsSet(submitterIsSet(), "submitter");
      this.submitter = java.util.Objects.requireNonNull(submitter, "submitter");
      optBits |= OPT_BIT_SUBMITTER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("submitter")
    public final Builder submitter(java.util.Optional<? extends com.fhir.Reference> submitter) {
      checkNotIsSet(submitterIsSet(), "submitter");
      this.submitter = submitter.orElse(null);
      optBits |= OPT_BIT_SUBMITTER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    public final Builder payee(com.fhir.Reference payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = java.util.Objects.requireNonNull(payee, "payee");
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payee")
    public final Builder payee(java.util.Optional<? extends com.fhir.Reference> payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = payee.orElse(null);
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(com.fhir.Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(java.util.Optional<? extends com.fhir.Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
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
     * Builds a new {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
     * @return An immutable instance of PaymentReconciliation_Detail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PaymentReconciliation_Detail build() {
      checkRequiredAttributes();
      return new ImmutablePaymentReconciliation_Detail(
          predecessor,
          identifier,
          type,
          response,
          date,
          amount,
          id,
          submitter,
          payee,
          modifierExtension,
          responsible,
          request,
          extension);
    }

    private boolean predecessorIsSet() {
      return (optBits & OPT_BIT_PREDECESSOR) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean submitterIsSet() {
      return (optBits & OPT_BIT_SUBMITTER) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PaymentReconciliation_Detail is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build PaymentReconciliation_Detail, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link PaymentReconciliation_Detail#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal predecessor(com.fhir.Identifier predecessor);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal predecessor(java.util.Optional<? extends com.fhir.Identifier> predecessor);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    BuildFinal response(com.fhir.Reference response);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal response(java.util.Optional<? extends com.fhir.Reference> response);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.date date);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.date> date);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(com.fhir.Money amount);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(java.util.Optional<? extends com.fhir.Money> amount);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal submitter(com.fhir.Reference submitter);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal submitter(java.util.Optional<? extends com.fhir.Reference> submitter);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(com.fhir.Reference payee);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(java.util.Optional<? extends com.fhir.Reference> payee);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(com.fhir.Reference responsible);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(java.util.Optional<? extends com.fhir.Reference> responsible);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(com.fhir.Reference request);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Builds a new {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
     * @return An immutable instance of PaymentReconciliation_Detail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PaymentReconciliation_Detail build();
  }
}
