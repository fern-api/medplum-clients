//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PaymentReconciliation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePaymentReconciliation.builder()}.
 */
@org.immutables.value.Generated(from = "PaymentReconciliation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePaymentReconciliation implements com.fhir.PaymentReconciliation {
  private final @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_Detail> detail;
  private final com.fhir.Money paymentAmount;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String disposition;
  private final @javax.annotation.Nullable com.fhir.Identifier paymentIdentifier;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference requestor;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept formCode;
  private final @javax.annotation.Nullable com.fhir.Reference request;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference paymentIssuer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_ProcessNote> processNote;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.PaymentreconciliationOutcome outcome;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.date paymentDate;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.dateTime created;

  private ImmutablePaymentReconciliation(
      @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_Detail> detail,
      com.fhir.Money paymentAmount,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String disposition,
      @javax.annotation.Nullable com.fhir.Identifier paymentIdentifier,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference requestor,
      @javax.annotation.Nullable com.fhir.CodeableConcept formCode,
      @javax.annotation.Nullable com.fhir.Reference request,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference paymentIssuer,
      @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_ProcessNote> processNote,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.PaymentreconciliationOutcome outcome,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.date paymentDate,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.dateTime created) {
    this.detail = detail;
    this.paymentAmount = paymentAmount;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.id = id;
    this.disposition = disposition;
    this.paymentIdentifier = paymentIdentifier;
    this.text = text;
    this.requestor = requestor;
    this.formCode = formCode;
    this.request = request;
    this.language = language;
    this.extension = extension;
    this.paymentIssuer = paymentIssuer;
    this.processNote = processNote;
    this.meta = meta;
    this.identifier = identifier;
    this.status = status;
    this.outcome = outcome;
    this.modifierExtension = modifierExtension;
    this.period = period;
    this.paymentDate = paymentDate;
    this.resourceType = resourceType;
    this.created = created;
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_Detail>> detail() {
    return java.util.Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code paymentAmount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paymentAmount")
  @Override
  public com.fhir.Money paymentAmount() {
    return paymentAmount;
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code disposition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disposition")
  @Override
  public java.util.Optional<java.lang.String> disposition() {
    return java.util.Optional.ofNullable(disposition);
  }

  /**
   * @return The value of the {@code paymentIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paymentIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> paymentIdentifier() {
    return java.util.Optional.ofNullable(paymentIdentifier);
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
   * @return The value of the {@code requestor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestor")
  @Override
  public java.util.Optional<com.fhir.Reference> requestor() {
    return java.util.Optional.ofNullable(requestor);
  }

  /**
   * @return The value of the {@code formCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("formCode")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> formCode() {
    return java.util.Optional.ofNullable(formCode);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code paymentIssuer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paymentIssuer")
  @Override
  public java.util.Optional<com.fhir.Reference> paymentIssuer() {
    return java.util.Optional.ofNullable(paymentIssuer);
  }

  /**
   * @return The value of the {@code processNote} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("processNote")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_ProcessNote>> processNote() {
    return java.util.Optional.ofNullable(processNote);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.PaymentreconciliationOutcome> outcome() {
    return java.util.Optional.ofNullable(outcome);
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
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withDetail(java.util.List<com.fhir.PaymentReconciliation_Detail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_Detail> newValue = java.util.Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutablePaymentReconciliation(
        newValue,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withDetail(java.util.Optional<? extends java.util.List<com.fhir.PaymentReconciliation_Detail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutablePaymentReconciliation(
        value,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentReconciliation#paymentAmount() paymentAmount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for paymentAmount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentAmount(com.fhir.Money value) {
    if (this.paymentAmount == value) return this;
    com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "paymentAmount");
    return new ImmutablePaymentReconciliation(
        this.detail,
        newValue,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        newValue,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        value,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        newValue,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        value,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        newValue,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        value,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withDisposition(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "disposition");
    if (java.util.Objects.equals(this.disposition, newValue)) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        newValue,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withDisposition(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.disposition, value)) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        value,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} attribute.
   * @param value The value for paymentIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "paymentIdentifier");
    if (this.paymentIdentifier == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        newValue,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPaymentIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.paymentIdentifier == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        value,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        newValue,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        value,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#requestor() requestor} attribute.
   * @param value The value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withRequestor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requestor");
    if (this.requestor == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        newValue,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#requestor() requestor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withRequestor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requestor == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        value,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#formCode() formCode} attribute.
   * @param value The value for formCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withFormCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "formCode");
    if (this.formCode == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        newValue,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#formCode() formCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for formCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withFormCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.formCode == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        value,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withRequest(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        newValue,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withRequest(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        value,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        newValue,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        value,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        newValue,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        value,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#paymentIssuer() paymentIssuer} attribute.
   * @param value The value for paymentIssuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentIssuer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "paymentIssuer");
    if (this.paymentIssuer == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        newValue,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#paymentIssuer() paymentIssuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentIssuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPaymentIssuer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.paymentIssuer == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        value,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#processNote() processNote} attribute.
   * @param value The value for processNote
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withProcessNote(java.util.List<com.fhir.PaymentReconciliation_ProcessNote> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_ProcessNote> newValue = java.util.Objects.requireNonNull(value, "processNote");
    if (this.processNote == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        newValue,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#processNote() processNote} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processNote
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withProcessNote(java.util.Optional<? extends java.util.List<com.fhir.PaymentReconciliation_ProcessNote>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_ProcessNote> value = optional.orElse(null);
    if (this.processNote == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        value,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        newValue,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        value,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        newValue,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        value,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        newValue,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        value,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withOutcome(com.fhir.PaymentreconciliationOutcome value) {
    @javax.annotation.Nullable com.fhir.PaymentreconciliationOutcome newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        newValue,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withOutcome(java.util.Optional<? extends com.fhir.PaymentreconciliationOutcome> optional) {
    @javax.annotation.Nullable com.fhir.PaymentreconciliationOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        value,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        newValue,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        value,
        this.period,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        newValue,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        value,
        this.paymentDate,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#paymentDate() paymentDate} attribute.
   * @param value The value for paymentDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "paymentDate");
    if (this.paymentDate == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        newValue,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#paymentDate() paymentDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPaymentDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.paymentDate == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        value,
        this.resourceType,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentReconciliation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentReconciliation withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        newValue,
        this.created);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutablePaymentReconciliation(
        this.detail,
        this.paymentAmount,
        this.implicitRules,
        this.contained,
        this.id,
        this.disposition,
        this.paymentIdentifier,
        this.text,
        this.requestor,
        this.formCode,
        this.request,
        this.language,
        this.extension,
        this.paymentIssuer,
        this.processNote,
        this.meta,
        this.identifier,
        this.status,
        this.outcome,
        this.modifierExtension,
        this.period,
        this.paymentDate,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePaymentReconciliation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePaymentReconciliation
        && equalTo((ImmutablePaymentReconciliation) another);
  }

  private boolean equalTo(ImmutablePaymentReconciliation another) {
    return java.util.Objects.equals(detail, another.detail)
        && paymentAmount.equals(another.paymentAmount)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(disposition, another.disposition)
        && java.util.Objects.equals(paymentIdentifier, another.paymentIdentifier)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(requestor, another.requestor)
        && java.util.Objects.equals(formCode, another.formCode)
        && java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(paymentIssuer, another.paymentIssuer)
        && java.util.Objects.equals(processNote, another.processNote)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(paymentDate, another.paymentDate)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(created, another.created);
  }

  /**
   * Computes a hash code from attributes: {@code detail}, {@code paymentAmount}, {@code implicitRules}, {@code contained}, {@code id}, {@code disposition}, {@code paymentIdentifier}, {@code text}, {@code requestor}, {@code formCode}, {@code request}, {@code language}, {@code extension}, {@code paymentIssuer}, {@code processNote}, {@code meta}, {@code identifier}, {@code status}, {@code outcome}, {@code modifierExtension}, {@code period}, {@code paymentDate}, {@code resourceType}, {@code created}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(detail);
    h += (h << 5) + paymentAmount.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(disposition);
    h += (h << 5) + java.util.Objects.hashCode(paymentIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(requestor);
    h += (h << 5) + java.util.Objects.hashCode(formCode);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(paymentIssuer);
    h += (h << 5) + java.util.Objects.hashCode(processNote);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(paymentDate);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(created);
    return h;
  }

  /**
   * Prints the immutable value {@code PaymentReconciliation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PaymentReconciliation{");
    if (detail != null) {
      builder.append("detail=").append(detail);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("paymentAmount=").append(paymentAmount);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (disposition != null) {
      builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (paymentIdentifier != null) {
      builder.append(", ");
      builder.append("paymentIdentifier=").append(paymentIdentifier);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (requestor != null) {
      builder.append(", ");
      builder.append("requestor=").append(requestor);
    }
    if (formCode != null) {
      builder.append(", ");
      builder.append("formCode=").append(formCode);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (paymentIssuer != null) {
      builder.append(", ");
      builder.append("paymentIssuer=").append(paymentIssuer);
    }
    if (processNote != null) {
      builder.append(", ");
      builder.append("processNote=").append(processNote);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (paymentDate != null) {
      builder.append(", ");
      builder.append("paymentDate=").append(paymentDate);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "PaymentReconciliation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PaymentReconciliation {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_Detail>> detail = java.util.Optional.empty();
    boolean detailIsSet;
    @javax.annotation.Nullable com.fhir.Money paymentAmount;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> disposition = java.util.Optional.empty();
    boolean dispositionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> paymentIdentifier = java.util.Optional.empty();
    boolean paymentIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requestor = java.util.Optional.empty();
    boolean requestorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> formCode = java.util.Optional.empty();
    boolean formCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> paymentIssuer = java.util.Optional.empty();
    boolean paymentIssuerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_ProcessNote>> processNote = java.util.Optional.empty();
    boolean processNoteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.PaymentreconciliationOutcome> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> paymentDate = java.util.Optional.empty();
    boolean paymentDateIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentAmount")
    public void setPaymentAmount(com.fhir.Money paymentAmount) {
      this.paymentAmount = paymentAmount;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("disposition")
    public void setDisposition(java.util.Optional<java.lang.String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentIdentifier")
    public void setPaymentIdentifier(java.util.Optional<com.fhir.Identifier> paymentIdentifier) {
      this.paymentIdentifier = paymentIdentifier;
      this.paymentIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestor")
    public void setRequestor(java.util.Optional<com.fhir.Reference> requestor) {
      this.requestor = requestor;
      this.requestorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("formCode")
    public void setFormCode(java.util.Optional<com.fhir.CodeableConcept> formCode) {
      this.formCode = formCode;
      this.formCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentIssuer")
    public void setPaymentIssuer(java.util.Optional<com.fhir.Reference> paymentIssuer) {
      this.paymentIssuer = paymentIssuer;
      this.paymentIssuerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("processNote")
    public void setProcessNote(java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_ProcessNote>> processNote) {
      this.processNote = processNote;
      this.processNoteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.PaymentreconciliationOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentDate")
    public void setPaymentDate(java.util.Optional<com.fhir.date> paymentDate) {
      this.paymentDate = paymentDate;
      this.paymentDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_Detail>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Money paymentAmount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> paymentIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requestor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> formCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> paymentIssuer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PaymentReconciliation_ProcessNote>> processNote() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.PaymentreconciliationOutcome> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> paymentDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePaymentReconciliation fromJson(Json json) {
    ImmutablePaymentReconciliation.Builder builder = ((ImmutablePaymentReconciliation.Builder) ImmutablePaymentReconciliation.builder());
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.paymentAmount != null) {
      builder.paymentAmount(json.paymentAmount);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.paymentIdentifierIsSet) {
      builder.paymentIdentifier(json.paymentIdentifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.requestorIsSet) {
      builder.requestor(json.requestor);
    }
    if (json.formCodeIsSet) {
      builder.formCode(json.formCode);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.paymentIssuerIsSet) {
      builder.paymentIssuer(json.paymentIssuer);
    }
    if (json.processNoteIsSet) {
      builder.processNote(json.processNote);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.paymentDateIsSet) {
      builder.paymentDate(json.paymentDate);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    return (ImmutablePaymentReconciliation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PaymentReconciliation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PaymentReconciliation instance
   */
  public static PaymentReconciliation copyOf(PaymentReconciliation instance) {
    if (instance instanceof ImmutablePaymentReconciliation) {
      return (ImmutablePaymentReconciliation) instance;
    }
    return ((ImmutablePaymentReconciliation.Builder) ImmutablePaymentReconciliation.builder())
        .detail(instance.detail())
        .paymentAmount(instance.paymentAmount())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .id(instance.id())
        .disposition(instance.disposition())
        .paymentIdentifier(instance.paymentIdentifier())
        .text(instance.text())
        .requestor(instance.requestor())
        .formCode(instance.formCode())
        .request(instance.request())
        .language(instance.language())
        .extension(instance.extension())
        .paymentIssuer(instance.paymentIssuer())
        .processNote(instance.processNote())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .status(instance.status())
        .outcome(instance.outcome())
        .modifierExtension(instance.modifierExtension())
        .period(instance.period())
        .paymentDate(instance.paymentDate())
        .resourceType(instance.resourceType())
        .created(instance.created())
        .build();
  }

  /**
   * Creates a builder for {@link PaymentReconciliation PaymentReconciliation}.
   * <pre>
   * ImmutablePaymentReconciliation.builder()
   *    .detail(List&amp;lt;com.fhir.PaymentReconciliation_Detail&amp;gt;) // optional {@link PaymentReconciliation#detail() detail}
   *    .paymentAmount(com.fhir.Money) // required {@link PaymentReconciliation#paymentAmount() paymentAmount}
   *    .implicitRules(com.fhir.uri) // optional {@link PaymentReconciliation#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link PaymentReconciliation#contained() contained}
   *    .id(com.fhir.id) // optional {@link PaymentReconciliation#id() id}
   *    .disposition(String) // optional {@link PaymentReconciliation#disposition() disposition}
   *    .paymentIdentifier(com.fhir.Identifier) // optional {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier}
   *    .text(com.fhir.Narrative) // optional {@link PaymentReconciliation#text() text}
   *    .requestor(com.fhir.Reference) // optional {@link PaymentReconciliation#requestor() requestor}
   *    .formCode(com.fhir.CodeableConcept) // optional {@link PaymentReconciliation#formCode() formCode}
   *    .request(com.fhir.Reference) // optional {@link PaymentReconciliation#request() request}
   *    .language(com.fhir.code) // optional {@link PaymentReconciliation#language() language}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation#extension() extension}
   *    .paymentIssuer(com.fhir.Reference) // optional {@link PaymentReconciliation#paymentIssuer() paymentIssuer}
   *    .processNote(List&amp;lt;com.fhir.PaymentReconciliation_ProcessNote&amp;gt;) // optional {@link PaymentReconciliation#processNote() processNote}
   *    .meta(com.fhir.Meta) // optional {@link PaymentReconciliation#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link PaymentReconciliation#identifier() identifier}
   *    .status(com.fhir.code) // optional {@link PaymentReconciliation#status() status}
   *    .outcome(com.fhir.PaymentreconciliationOutcome) // optional {@link PaymentReconciliation#outcome() outcome}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation#modifierExtension() modifierExtension}
   *    .period(com.fhir.Period) // optional {@link PaymentReconciliation#period() period}
   *    .paymentDate(com.fhir.date) // optional {@link PaymentReconciliation#paymentDate() paymentDate}
   *    .resourceType(String) // required {@link PaymentReconciliation#resourceType() resourceType}
   *    .created(com.fhir.dateTime) // optional {@link PaymentReconciliation#created() created}
   *    .build();
   * </pre>
   * @return A new PaymentReconciliation builder
   */
  public static PaymentAmountBuildStage builder() {
    return new ImmutablePaymentReconciliation.Builder();
  }

  /**
   * Builds instances of type {@link PaymentReconciliation PaymentReconciliation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "PaymentReconciliation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PaymentAmountBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PAYMENT_AMOUNT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_DETAIL = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_DISPOSITION = 0x10L;
    private static final long OPT_BIT_PAYMENT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_REQUESTOR = 0x80L;
    private static final long OPT_BIT_FORM_CODE = 0x100L;
    private static final long OPT_BIT_REQUEST = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_PAYMENT_ISSUER = 0x1000L;
    private static final long OPT_BIT_PROCESS_NOTE = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_OUTCOME = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private static final long OPT_BIT_PERIOD = 0x80000L;
    private static final long OPT_BIT_PAYMENT_DATE = 0x100000L;
    private static final long OPT_BIT_CREATED = 0x200000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_Detail> detail;
    private @javax.annotation.Nullable com.fhir.Money paymentAmount;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String disposition;
    private @javax.annotation.Nullable com.fhir.Identifier paymentIdentifier;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference requestor;
    private @javax.annotation.Nullable com.fhir.CodeableConcept formCode;
    private @javax.annotation.Nullable com.fhir.Reference request;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference paymentIssuer;
    private @javax.annotation.Nullable java.util.List<com.fhir.PaymentReconciliation_ProcessNote> processNote;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.PaymentreconciliationOutcome outcome;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.date paymentDate;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.dateTime created;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(java.util.List<com.fhir.PaymentReconciliation_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = java.util.Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public final Builder detail(java.util.Optional<? extends java.util.List<com.fhir.PaymentReconciliation_Detail>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentReconciliation#paymentAmount() paymentAmount} attribute.
     * @param paymentAmount The value for paymentAmount 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentAmount")
    public final Builder paymentAmount(com.fhir.Money paymentAmount) {
      checkNotIsSet(paymentAmountIsSet(), "paymentAmount");
      this.paymentAmount = java.util.Objects.requireNonNull(paymentAmount, "paymentAmount");
      initBits &= ~INIT_BIT_PAYMENT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
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
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
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
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    public final Builder disposition(java.lang.String disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = java.util.Objects.requireNonNull(disposition, "disposition");
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disposition")
    public final Builder disposition(java.util.Optional<java.lang.String> disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = disposition.orElse(null);
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentIdentifier(com.fhir.Identifier paymentIdentifier) {
      checkNotIsSet(paymentIdentifierIsSet(), "paymentIdentifier");
      this.paymentIdentifier = java.util.Objects.requireNonNull(paymentIdentifier, "paymentIdentifier");
      optBits |= OPT_BIT_PAYMENT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentIdentifier")
    public final Builder paymentIdentifier(java.util.Optional<? extends com.fhir.Identifier> paymentIdentifier) {
      checkNotIsSet(paymentIdentifierIsSet(), "paymentIdentifier");
      this.paymentIdentifier = paymentIdentifier.orElse(null);
      optBits |= OPT_BIT_PAYMENT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
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
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
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
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestor(com.fhir.Reference requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = java.util.Objects.requireNonNull(requestor, "requestor");
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestor")
    public final Builder requestor(java.util.Optional<? extends com.fhir.Reference> requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = requestor.orElse(null);
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder formCode(com.fhir.CodeableConcept formCode) {
      checkNotIsSet(formCodeIsSet(), "formCode");
      this.formCode = java.util.Objects.requireNonNull(formCode, "formCode");
      optBits |= OPT_BIT_FORM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formCode")
    public final Builder formCode(java.util.Optional<? extends com.fhir.CodeableConcept> formCode) {
      checkNotIsSet(formCodeIsSet(), "formCode");
      this.formCode = formCode.orElse(null);
      optBits |= OPT_BIT_FORM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
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
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
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
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
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
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
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
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentIssuer(com.fhir.Reference paymentIssuer) {
      checkNotIsSet(paymentIssuerIsSet(), "paymentIssuer");
      this.paymentIssuer = java.util.Objects.requireNonNull(paymentIssuer, "paymentIssuer");
      optBits |= OPT_BIT_PAYMENT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentIssuer")
    public final Builder paymentIssuer(java.util.Optional<? extends com.fhir.Reference> paymentIssuer) {
      checkNotIsSet(paymentIssuerIsSet(), "paymentIssuer");
      this.paymentIssuer = paymentIssuer.orElse(null);
      optBits |= OPT_BIT_PAYMENT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    public final Builder processNote(java.util.List<com.fhir.PaymentReconciliation_ProcessNote> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = java.util.Objects.requireNonNull(processNote, "processNote");
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processNote")
    public final Builder processNote(java.util.Optional<? extends java.util.List<com.fhir.PaymentReconciliation_ProcessNote>> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = processNote.orElse(null);
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
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
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
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
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
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
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
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
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.PaymentreconciliationOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.PaymentreconciliationOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
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
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
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
     * Initializes the value for the {@link PaymentReconciliation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
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
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
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
     * Builds a new {@link PaymentReconciliation PaymentReconciliation}.
     * @return An immutable instance of PaymentReconciliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PaymentReconciliation build() {
      checkRequiredAttributes();
      return new ImmutablePaymentReconciliation(
          detail,
          paymentAmount,
          implicitRules,
          contained,
          id,
          disposition,
          paymentIdentifier,
          text,
          requestor,
          formCode,
          request,
          language,
          extension,
          paymentIssuer,
          processNote,
          meta,
          identifier,
          status,
          outcome,
          modifierExtension,
          period,
          paymentDate,
          resourceType,
          created);
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean paymentIdentifierIsSet() {
      return (optBits & OPT_BIT_PAYMENT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean requestorIsSet() {
      return (optBits & OPT_BIT_REQUESTOR) != 0;
    }

    private boolean formCodeIsSet() {
      return (optBits & OPT_BIT_FORM_CODE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean paymentIssuerIsSet() {
      return (optBits & OPT_BIT_PAYMENT_ISSUER) != 0;
    }

    private boolean processNoteIsSet() {
      return (optBits & OPT_BIT_PROCESS_NOTE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean paymentDateIsSet() {
      return (optBits & OPT_BIT_PAYMENT_DATE) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean paymentAmountIsSet() {
      return (initBits & INIT_BIT_PAYMENT_AMOUNT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PaymentReconciliation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!paymentAmountIsSet()) attributes.add("paymentAmount");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build PaymentReconciliation, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "PaymentReconciliation", generator = "Immutables")
  public interface PaymentAmountBuildStage {
    /**
     * Initializes the value for the {@link PaymentReconciliation#paymentAmount() paymentAmount} attribute.
     * @param paymentAmount The value for paymentAmount 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage paymentAmount(com.fhir.Money paymentAmount);
  }

  @org.immutables.value.Generated(from = "PaymentReconciliation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PaymentReconciliation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "PaymentReconciliation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(java.util.List<com.fhir.PaymentReconciliation_Detail> detail);

    /**
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(java.util.Optional<? extends java.util.List<com.fhir.PaymentReconciliation_Detail>> detail);

    /**
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(java.lang.String disposition);

    /**
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(java.util.Optional<java.lang.String> disposition);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentIdentifier(com.fhir.Identifier paymentIdentifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentIdentifier(java.util.Optional<? extends com.fhir.Identifier> paymentIdentifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestor(com.fhir.Reference requestor);

    /**
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestor(java.util.Optional<? extends com.fhir.Reference> requestor);

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal formCode(com.fhir.CodeableConcept formCode);

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal formCode(java.util.Optional<? extends com.fhir.CodeableConcept> formCode);

    /**
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(com.fhir.Reference request);

    /**
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentIssuer(com.fhir.Reference paymentIssuer);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentIssuer(java.util.Optional<? extends com.fhir.Reference> paymentIssuer);

    /**
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processNote(java.util.List<com.fhir.PaymentReconciliation_ProcessNote> processNote);

    /**
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processNote(java.util.Optional<? extends java.util.List<com.fhir.PaymentReconciliation_ProcessNote>> processNote);

    /**
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.PaymentreconciliationOutcome outcome);

    /**
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.PaymentreconciliationOutcome> outcome);

    /**
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentDate(com.fhir.date paymentDate);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentDate(java.util.Optional<? extends com.fhir.date> paymentDate);

    /**
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Builds a new {@link PaymentReconciliation PaymentReconciliation}.
     * @return An immutable instance of PaymentReconciliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PaymentReconciliation build();
  }
}
