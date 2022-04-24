//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PaymentNotice}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePaymentNotice.builder()}.
 */
@org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePaymentNotice implements com.fhir.PaymentNotice {
  private final @javax.annotation.Nullable com.fhir.code status;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Reference provider;
  private final com.fhir.Reference payment;
  private final @javax.annotation.Nullable com.fhir.Reference payee;
  private final @javax.annotation.Nullable com.fhir.Reference response;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept paymentStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.date paymentDate;
  private final @javax.annotation.Nullable com.fhir.Reference request;
  private final com.fhir.Reference recipient;
  private final com.fhir.Money amount;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;

  private ImmutablePaymentNotice(
      @javax.annotation.Nullable com.fhir.code status,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Reference provider,
      com.fhir.Reference payment,
      @javax.annotation.Nullable com.fhir.Reference payee,
      @javax.annotation.Nullable com.fhir.Reference response,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.CodeableConcept paymentStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.date paymentDate,
      @javax.annotation.Nullable com.fhir.Reference request,
      com.fhir.Reference recipient,
      com.fhir.Money amount,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language) {
    this.status = status;
    this.resourceType = resourceType;
    this.meta = meta;
    this.provider = provider;
    this.payment = payment;
    this.payee = payee;
    this.response = response;
    this.id = id;
    this.contained = contained;
    this.paymentStatus = paymentStatus;
    this.extension = extension;
    this.text = text;
    this.created = created;
    this.identifier = identifier;
    this.paymentDate = paymentDate;
    this.request = request;
    this.recipient = recipient;
    this.amount = amount;
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.language = language;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("provider")
  @Override
  public java.util.Optional<com.fhir.Reference> provider() {
    return java.util.Optional.ofNullable(provider);
  }

  /**
   * @return The value of the {@code payment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payment")
  @Override
  public com.fhir.Reference payment() {
    return payment;
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
   * @return The value of the {@code response} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("response")
  @Override
  public java.util.Optional<com.fhir.Reference> response() {
    return java.util.Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code paymentStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paymentStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> paymentStatus() {
    return java.util.Optional.ofNullable(paymentStatus);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code created} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("created")
  @Override
  public java.util.Optional<com.fhir.dateTime> created() {
    return java.util.Optional.ofNullable(created);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code paymentDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paymentDate")
  @Override
  public java.util.Optional<com.fhir.date> paymentDate() {
    return java.util.Optional.ofNullable(paymentDate);
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
   * @return The value of the {@code recipient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recipient")
  @Override
  public com.fhir.Reference recipient() {
    return recipient;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutablePaymentNotice(
        newValue,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutablePaymentNotice(
        value,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePaymentNotice(
        this.status,
        newValue,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        newValue,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        value,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withProvider(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        newValue,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withProvider(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        value,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#payment() payment} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for payment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withPayment(com.fhir.Reference value) {
    if (this.payment == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "payment");
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        newValue,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withPayee(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        newValue,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withPayee(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        value,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withResponse(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        newValue,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withResponse(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        value,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        newValue,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        value,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        newValue,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        value,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#paymentStatus() paymentStatus} attribute.
   * @param value The value for paymentStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withPaymentStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "paymentStatus");
    if (this.paymentStatus == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        newValue,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#paymentStatus() paymentStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withPaymentStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.paymentStatus == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        value,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        newValue,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        value,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        newValue,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        value,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        newValue,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        value,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        newValue,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        value,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#paymentDate() paymentDate} attribute.
   * @param value The value for paymentDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withPaymentDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "paymentDate");
    if (this.paymentDate == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        newValue,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#paymentDate() paymentDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withPaymentDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.paymentDate == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        value,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withRequest(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        newValue,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withRequest(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        value,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#recipient() recipient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for recipient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withRecipient(com.fhir.Reference value) {
    if (this.recipient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recipient");
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        newValue,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#amount() amount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withAmount(com.fhir.Money value) {
    if (this.amount == value) return this;
    com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "amount");
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        newValue,
        this.modifierExtension,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        newValue,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        value,
        this.implicitRules,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePaymentNotice(
        this.status,
        this.resourceType,
        this.meta,
        this.provider,
        this.payment,
        this.payee,
        this.response,
        this.id,
        this.contained,
        this.paymentStatus,
        this.extension,
        this.text,
        this.created,
        this.identifier,
        this.paymentDate,
        this.request,
        this.recipient,
        this.amount,
        this.modifierExtension,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePaymentNotice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePaymentNotice
        && equalTo((ImmutablePaymentNotice) another);
  }

  private boolean equalTo(ImmutablePaymentNotice another) {
    return java.util.Objects.equals(status, another.status)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(provider, another.provider)
        && payment.equals(another.payment)
        && java.util.Objects.equals(payee, another.payee)
        && java.util.Objects.equals(response, another.response)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(paymentStatus, another.paymentStatus)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(paymentDate, another.paymentDate)
        && java.util.Objects.equals(request, another.request)
        && recipient.equals(another.recipient)
        && amount.equals(another.amount)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code resourceType}, {@code meta}, {@code provider}, {@code payment}, {@code payee}, {@code response}, {@code id}, {@code contained}, {@code paymentStatus}, {@code extension}, {@code text}, {@code created}, {@code identifier}, {@code paymentDate}, {@code request}, {@code recipient}, {@code amount}, {@code modifierExtension}, {@code implicitRules}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(provider);
    h += (h << 5) + payment.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(payee);
    h += (h << 5) + java.util.Objects.hashCode(response);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(paymentStatus);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(paymentDate);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + recipient.hashCode();
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code PaymentNotice} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PaymentNotice{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (provider != null) {
      builder.append(", ");
      builder.append("provider=").append(provider);
    }
    builder.append(", ");
    builder.append("payment=").append(payment);
    if (payee != null) {
      builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (response != null) {
      builder.append(", ");
      builder.append("response=").append(response);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (paymentStatus != null) {
      builder.append(", ");
      builder.append("paymentStatus=").append(paymentStatus);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (paymentDate != null) {
      builder.append(", ");
      builder.append("paymentDate=").append(paymentDate);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    builder.append(", ");
    builder.append("recipient=").append(recipient);
    builder.append(", ");
    builder.append("amount=").append(amount);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PaymentNotice {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> provider = java.util.Optional.empty();
    boolean providerIsSet;
    @javax.annotation.Nullable com.fhir.Reference payment;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> payee = java.util.Optional.empty();
    boolean payeeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> response = java.util.Optional.empty();
    boolean responseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> paymentStatus = java.util.Optional.empty();
    boolean paymentStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> paymentDate = java.util.Optional.empty();
    boolean paymentDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable com.fhir.Reference recipient;
    @javax.annotation.Nullable com.fhir.Money amount;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public void setProvider(java.util.Optional<com.fhir.Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public void setPayment(com.fhir.Reference payment) {
      this.payment = payment;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payee")
    public void setPayee(java.util.Optional<com.fhir.Reference> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public void setResponse(java.util.Optional<com.fhir.Reference> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentStatus")
    public void setPaymentStatus(java.util.Optional<com.fhir.CodeableConcept> paymentStatus) {
      this.paymentStatus = paymentStatus;
      this.paymentStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentDate")
    public void setPaymentDate(java.util.Optional<com.fhir.date> paymentDate) {
      this.paymentDate = paymentDate;
      this.paymentDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public void setRecipient(com.fhir.Reference recipient) {
      this.recipient = recipient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    public void setAmount(com.fhir.Money amount) {
      this.amount = amount;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference payment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> payee() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> response() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> paymentStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> paymentDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference recipient() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Money amount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePaymentNotice fromJson(Json json) {
    ImmutablePaymentNotice.Builder builder = ((ImmutablePaymentNotice.Builder) ImmutablePaymentNotice.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.payment != null) {
      builder.payment(json.payment);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.paymentStatusIsSet) {
      builder.paymentStatus(json.paymentStatus);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.paymentDateIsSet) {
      builder.paymentDate(json.paymentDate);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.recipient != null) {
      builder.recipient(json.recipient);
    }
    if (json.amount != null) {
      builder.amount(json.amount);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutablePaymentNotice) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PaymentNotice} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PaymentNotice instance
   */
  public static PaymentNotice copyOf(PaymentNotice instance) {
    if (instance instanceof ImmutablePaymentNotice) {
      return (ImmutablePaymentNotice) instance;
    }
    return ((ImmutablePaymentNotice.Builder) ImmutablePaymentNotice.builder())
        .status(instance.status())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .provider(instance.provider())
        .payment(instance.payment())
        .payee(instance.payee())
        .response(instance.response())
        .id(instance.id())
        .contained(instance.contained())
        .paymentStatus(instance.paymentStatus())
        .extension(instance.extension())
        .text(instance.text())
        .created(instance.created())
        .identifier(instance.identifier())
        .paymentDate(instance.paymentDate())
        .request(instance.request())
        .recipient(instance.recipient())
        .amount(instance.amount())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link PaymentNotice PaymentNotice}.
   * <pre>
   * ImmutablePaymentNotice.builder()
   *    .status(com.fhir.code) // optional {@link PaymentNotice#status() status}
   *    .resourceType(String) // required {@link PaymentNotice#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link PaymentNotice#meta() meta}
   *    .provider(com.fhir.Reference) // optional {@link PaymentNotice#provider() provider}
   *    .payment(com.fhir.Reference) // required {@link PaymentNotice#payment() payment}
   *    .payee(com.fhir.Reference) // optional {@link PaymentNotice#payee() payee}
   *    .response(com.fhir.Reference) // optional {@link PaymentNotice#response() response}
   *    .id(com.fhir.id) // optional {@link PaymentNotice#id() id}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link PaymentNotice#contained() contained}
   *    .paymentStatus(com.fhir.CodeableConcept) // optional {@link PaymentNotice#paymentStatus() paymentStatus}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PaymentNotice#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link PaymentNotice#text() text}
   *    .created(com.fhir.dateTime) // optional {@link PaymentNotice#created() created}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link PaymentNotice#identifier() identifier}
   *    .paymentDate(com.fhir.date) // optional {@link PaymentNotice#paymentDate() paymentDate}
   *    .request(com.fhir.Reference) // optional {@link PaymentNotice#request() request}
   *    .recipient(com.fhir.Reference) // required {@link PaymentNotice#recipient() recipient}
   *    .amount(com.fhir.Money) // required {@link PaymentNotice#amount() amount}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PaymentNotice#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.uri) // optional {@link PaymentNotice#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link PaymentNotice#language() language}
   *    .build();
   * </pre>
   * @return A new PaymentNotice builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutablePaymentNotice.Builder();
  }

  /**
   * Builds instances of type {@link PaymentNotice PaymentNotice}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements ResourceTypeBuildStage, PaymentBuildStage, RecipientBuildStage, AmountBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PAYMENT = 0x2L;
    private static final long INIT_BIT_RECIPIENT = 0x4L;
    private static final long INIT_BIT_AMOUNT = 0x8L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_PROVIDER = 0x4L;
    private static final long OPT_BIT_PAYEE = 0x8L;
    private static final long OPT_BIT_RESPONSE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_PAYMENT_STATUS = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_CREATED = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_PAYMENT_DATE = 0x1000L;
    private static final long OPT_BIT_REQUEST = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private long initBits = 0xfL;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference provider;
    private @javax.annotation.Nullable com.fhir.Reference payment;
    private @javax.annotation.Nullable com.fhir.Reference payee;
    private @javax.annotation.Nullable com.fhir.Reference response;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept paymentStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.date paymentDate;
    private @javax.annotation.Nullable com.fhir.Reference request;
    private @javax.annotation.Nullable com.fhir.Reference recipient;
    private @javax.annotation.Nullable com.fhir.Money amount;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentNotice#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(com.fhir.Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = java.util.Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public final Builder provider(java.util.Optional<? extends com.fhir.Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentNotice#payment() payment} attribute.
     * @param payment The value for payment 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public final Builder payment(com.fhir.Reference payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = java.util.Objects.requireNonNull(payment, "payment");
      initBits &= ~INIT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
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
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
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
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
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
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
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
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentStatus(com.fhir.CodeableConcept paymentStatus) {
      checkNotIsSet(paymentStatusIsSet(), "paymentStatus");
      this.paymentStatus = java.util.Objects.requireNonNull(paymentStatus, "paymentStatus");
      optBits |= OPT_BIT_PAYMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentStatus")
    public final Builder paymentStatus(java.util.Optional<? extends com.fhir.CodeableConcept> paymentStatus) {
      checkNotIsSet(paymentStatusIsSet(), "paymentStatus");
      this.paymentStatus = paymentStatus.orElse(null);
      optBits |= OPT_BIT_PAYMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(com.fhir.dateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = java.util.Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public final Builder created(java.util.Optional<? extends com.fhir.dateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentDate(com.fhir.date paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = java.util.Objects.requireNonNull(paymentDate, "paymentDate");
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentDate")
    public final Builder paymentDate(java.util.Optional<? extends com.fhir.date> paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = paymentDate.orElse(null);
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
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
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
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
     * Initializes the value for the {@link PaymentNotice#recipient() recipient} attribute.
     * @param recipient The value for recipient 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public final Builder recipient(com.fhir.Reference recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = java.util.Objects.requireNonNull(recipient, "recipient");
      initBits &= ~INIT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentNotice#amount() amount} attribute.
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
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Builds a new {@link PaymentNotice PaymentNotice}.
     * @return An immutable instance of PaymentNotice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PaymentNotice build() {
      checkRequiredAttributes();
      return new ImmutablePaymentNotice(
          status,
          resourceType,
          meta,
          provider,
          payment,
          payee,
          response,
          id,
          contained,
          paymentStatus,
          extension,
          text,
          created,
          identifier,
          paymentDate,
          request,
          recipient,
          amount,
          modifierExtension,
          implicitRules,
          language);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean paymentStatusIsSet() {
      return (optBits & OPT_BIT_PAYMENT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean paymentDateIsSet() {
      return (optBits & OPT_BIT_PAYMENT_DATE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean paymentIsSet() {
      return (initBits & INIT_BIT_PAYMENT) == 0;
    }

    private boolean recipientIsSet() {
      return (initBits & INIT_BIT_RECIPIENT) == 0;
    }

    private boolean amountIsSet() {
      return (initBits & INIT_BIT_AMOUNT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PaymentNotice is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!paymentIsSet()) attributes.add("payment");
      if (!recipientIsSet()) attributes.add("recipient");
      if (!amountIsSet()) attributes.add("amount");
      return "Cannot build PaymentNotice, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PaymentBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
  public interface PaymentBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#payment() payment} attribute.
     * @param payment The value for payment 
     * @return {@code this} builder for use in a chained invocation
     */
    RecipientBuildStage payment(com.fhir.Reference payment);
  }

  @org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
  public interface RecipientBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#recipient() recipient} attribute.
     * @param recipient The value for recipient 
     * @return {@code this} builder for use in a chained invocation
     */
    AmountBuildStage recipient(com.fhir.Reference recipient);
  }

  @org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
  public interface AmountBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(com.fhir.Money amount);
  }

  @org.immutables.value.Generated(from = "PaymentNotice", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(com.fhir.Reference provider);

    /**
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(java.util.Optional<? extends com.fhir.Reference> provider);

    /**
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(com.fhir.Reference payee);

    /**
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(java.util.Optional<? extends com.fhir.Reference> payee);

    /**
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    BuildFinal response(com.fhir.Reference response);

    /**
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal response(java.util.Optional<? extends com.fhir.Reference> response);

    /**
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentStatus(com.fhir.CodeableConcept paymentStatus);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentStatus(java.util.Optional<? extends com.fhir.CodeableConcept> paymentStatus);

    /**
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentDate(com.fhir.date paymentDate);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentDate(java.util.Optional<? extends com.fhir.date> paymentDate);

    /**
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(com.fhir.Reference request);

    /**
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Builds a new {@link PaymentNotice PaymentNotice}.
     * @return An immutable instance of PaymentNotice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PaymentNotice build();
  }
}
