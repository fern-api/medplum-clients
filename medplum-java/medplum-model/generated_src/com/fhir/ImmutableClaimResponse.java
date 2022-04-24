//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClaimResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse.builder()}.
 */
@org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse implements com.fhir.ClaimResponse {
  private final @javax.annotation.Nullable com.fhir.Reference requestor;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept payeeType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.ClaimResponse_Payment payment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Item> item;
  private final @javax.annotation.Nullable java.lang.String preAuthRef;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Period preAuthPeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subType;
  private final @javax.annotation.Nullable java.lang.String disposition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_ProcessNote> processNote;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_AddItem> addItem;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve;
  private final @javax.annotation.Nullable com.fhir.Reference request;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Insurance> insurance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Error> error;
  private final com.fhir.Reference insurer;
  private final @javax.annotation.Nullable com.fhir.Attachment form;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept formCode;
  private final @javax.annotation.Nullable com.fhir.code outcome;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Total> total;
  private final @javax.annotation.Nullable com.fhir.code use;
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> communicationRequest;

  private ImmutableClaimResponse(
      @javax.annotation.Nullable com.fhir.Reference requestor,
      @javax.annotation.Nullable com.fhir.CodeableConcept payeeType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.ClaimResponse_Payment payment,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Item> item,
      @javax.annotation.Nullable java.lang.String preAuthRef,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Period preAuthPeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.CodeableConcept subType,
      @javax.annotation.Nullable java.lang.String disposition,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_ProcessNote> processNote,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_AddItem> addItem,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve,
      @javax.annotation.Nullable com.fhir.Reference request,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Insurance> insurance,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Error> error,
      com.fhir.Reference insurer,
      @javax.annotation.Nullable com.fhir.Attachment form,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.CodeableConcept formCode,
      @javax.annotation.Nullable com.fhir.code outcome,
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Total> total,
      @javax.annotation.Nullable com.fhir.code use,
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> communicationRequest) {
    this.requestor = requestor;
    this.payeeType = payeeType;
    this.meta = meta;
    this.payment = payment;
    this.item = item;
    this.preAuthRef = preAuthRef;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.preAuthPeriod = preAuthPeriod;
    this.identifier = identifier;
    this.contained = contained;
    this.language = language;
    this.id = id;
    this.subType = subType;
    this.disposition = disposition;
    this.adjudication = adjudication;
    this.processNote = processNote;
    this.addItem = addItem;
    this.extension = extension;
    this.fundsReserve = fundsReserve;
    this.request = request;
    this.modifierExtension = modifierExtension;
    this.insurance = insurance;
    this.error = error;
    this.insurer = insurer;
    this.form = form;
    this.created = created;
    this.text = text;
    this.status = status;
    this.formCode = formCode;
    this.outcome = outcome;
    this.patient = patient;
    this.total = total;
    this.use = use;
    this.type = type;
    this.communicationRequest = communicationRequest;
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
   * @return The value of the {@code payeeType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payeeType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> payeeType() {
    return java.util.Optional.ofNullable(payeeType);
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
   * @return The value of the {@code payment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payment")
  @Override
  public java.util.Optional<com.fhir.ClaimResponse_Payment> payment() {
    return java.util.Optional.ofNullable(payment);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Item>> item() {
    return java.util.Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code preAuthRef} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
  @Override
  public java.util.Optional<java.lang.String> preAuthRef() {
    return java.util.Optional.ofNullable(preAuthRef);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code preAuthPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preAuthPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> preAuthPeriod() {
    return java.util.Optional.ofNullable(preAuthPeriod);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code subType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> subType() {
    return java.util.Optional.ofNullable(subType);
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
   * @return The value of the {@code adjudication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Adjudication>> adjudication() {
    return java.util.Optional.ofNullable(adjudication);
  }

  /**
   * @return The value of the {@code processNote} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("processNote")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_ProcessNote>> processNote() {
    return java.util.Optional.ofNullable(processNote);
  }

  /**
   * @return The value of the {@code addItem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("addItem")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_AddItem>> addItem() {
    return java.util.Optional.ofNullable(addItem);
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
   * @return The value of the {@code fundsReserve} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fundsReserve")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> fundsReserve() {
    return java.util.Optional.ofNullable(fundsReserve);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Insurance>> insurance() {
    return java.util.Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("error")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Error>> error() {
    return java.util.Optional.ofNullable(error);
  }

  /**
   * @return The value of the {@code insurer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurer")
  @Override
  public com.fhir.Reference insurer() {
    return insurer;
  }

  /**
   * @return The value of the {@code form} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("form")
  @Override
  public java.util.Optional<com.fhir.Attachment> form() {
    return java.util.Optional.ofNullable(form);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code formCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("formCode")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> formCode() {
    return java.util.Optional.ofNullable(formCode);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.code> outcome() {
    return java.util.Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("total")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Total>> total() {
    return java.util.Optional.ofNullable(total);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.code> use() {
    return java.util.Optional.ofNullable(use);
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
   * @return The value of the {@code communicationRequest} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("communicationRequest")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> communicationRequest() {
    return java.util.Optional.ofNullable(communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#requestor() requestor} attribute.
   * @param value The value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withRequestor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requestor");
    if (this.requestor == newValue) return this;
    return new ImmutableClaimResponse(
        newValue,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#requestor() requestor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withRequestor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requestor == value) return this;
    return new ImmutableClaimResponse(
        value,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#payeeType() payeeType} attribute.
   * @param value The value for payeeType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPayeeType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "payeeType");
    if (this.payeeType == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        newValue,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#payeeType() payeeType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payeeType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withPayeeType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.payeeType == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        value,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        newValue,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        value,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#payment() payment} attribute.
   * @param value The value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPayment(com.fhir.ClaimResponse_Payment value) {
    @javax.annotation.Nullable com.fhir.ClaimResponse_Payment newValue = java.util.Objects.requireNonNull(value, "payment");
    if (this.payment == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        newValue,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#payment() payment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withPayment(java.util.Optional<? extends com.fhir.ClaimResponse_Payment> optional) {
    @javax.annotation.Nullable com.fhir.ClaimResponse_Payment value = optional.orElse(null);
    if (this.payment == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        value,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withItem(java.util.List<com.fhir.ClaimResponse_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        newValue,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withItem(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        value,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPreAuthRef(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "preAuthRef");
    if (java.util.Objects.equals(this.preAuthRef, newValue)) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#preAuthRef() preAuthRef} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPreAuthRef(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.preAuthRef, value)) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        value,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        newValue,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        newValue,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        value,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#preAuthPeriod() preAuthPeriod} attribute.
   * @param value The value for preAuthPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPreAuthPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "preAuthPeriod");
    if (this.preAuthPeriod == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#preAuthPeriod() preAuthPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withPreAuthPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.preAuthPeriod == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        value,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        newValue,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        value,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        newValue,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        value,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        newValue,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        value,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        newValue,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        value,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withSubType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        newValue,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withSubType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        value,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withDisposition(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "disposition");
    if (java.util.Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        newValue,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withDisposition(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.disposition, value)) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        value,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withAdjudication(java.util.List<com.fhir.ClaimResponse_Adjudication> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> newValue = java.util.Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        newValue,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withAdjudication(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Adjudication>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        value,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#processNote() processNote} attribute.
   * @param value The value for processNote
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withProcessNote(java.util.List<com.fhir.ClaimResponse_ProcessNote> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_ProcessNote> newValue = java.util.Objects.requireNonNull(value, "processNote");
    if (this.processNote == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        newValue,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#processNote() processNote} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processNote
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withProcessNote(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_ProcessNote>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_ProcessNote> value = optional.orElse(null);
    if (this.processNote == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        value,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#addItem() addItem} attribute.
   * @param value The value for addItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withAddItem(java.util.List<com.fhir.ClaimResponse_AddItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_AddItem> newValue = java.util.Objects.requireNonNull(value, "addItem");
    if (this.addItem == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        newValue,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#addItem() addItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withAddItem(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_AddItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_AddItem> value = optional.orElse(null);
    if (this.addItem == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        value,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        newValue,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        value,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#fundsReserve() fundsReserve} attribute.
   * @param value The value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withFundsReserve(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "fundsReserve");
    if (this.fundsReserve == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        newValue,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#fundsReserve() fundsReserve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withFundsReserve(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.fundsReserve == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        value,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withRequest(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        newValue,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withRequest(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        value,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        newValue,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        value,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withInsurance(java.util.List<com.fhir.ClaimResponse_Insurance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Insurance> newValue = java.util.Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        newValue,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withInsurance(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Insurance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Insurance> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        value,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#error() error} attribute.
   * @param value The value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withError(java.util.List<com.fhir.ClaimResponse_Error> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Error> newValue = java.util.Objects.requireNonNull(value, "error");
    if (this.error == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        newValue,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#error() error} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for error
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withError(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Error>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Error> value = optional.orElse(null);
    if (this.error == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        value,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withInsurer(com.fhir.Reference value) {
    if (this.insurer == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "insurer");
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        newValue,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#form() form} attribute.
   * @param value The value for form
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withForm(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "form");
    if (this.form == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        newValue,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#form() form} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for form
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withForm(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.form == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        value,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        newValue,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        value,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        newValue,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        value,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        newValue,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        value,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#formCode() formCode} attribute.
   * @param value The value for formCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withFormCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "formCode");
    if (this.formCode == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        newValue,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#formCode() formCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for formCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withFormCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.formCode == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        value,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withOutcome(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        newValue,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withOutcome(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        value,
        this.patient,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        newValue,
        this.total,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withTotal(java.util.List<com.fhir.ClaimResponse_Total> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Total> newValue = java.util.Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        newValue,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withTotal(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Total>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Total> value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        value,
        this.use,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withUse(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        newValue,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withUse(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        value,
        this.type,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        newValue,
        this.communicationRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#communicationRequest() communicationRequest} attribute.
   * @param value The value for communicationRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withCommunicationRequest(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "communicationRequest");
    if (this.communicationRequest == newValue) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#communicationRequest() communicationRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communicationRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withCommunicationRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.communicationRequest == value) return this;
    return new ImmutableClaimResponse(
        this.requestor,
        this.payeeType,
        this.meta,
        this.payment,
        this.item,
        this.preAuthRef,
        this.resourceType,
        this.implicitRules,
        this.preAuthPeriod,
        this.identifier,
        this.contained,
        this.language,
        this.id,
        this.subType,
        this.disposition,
        this.adjudication,
        this.processNote,
        this.addItem,
        this.extension,
        this.fundsReserve,
        this.request,
        this.modifierExtension,
        this.insurance,
        this.error,
        this.insurer,
        this.form,
        this.created,
        this.text,
        this.status,
        this.formCode,
        this.outcome,
        this.patient,
        this.total,
        this.use,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse
        && equalTo((ImmutableClaimResponse) another);
  }

  private boolean equalTo(ImmutableClaimResponse another) {
    return java.util.Objects.equals(requestor, another.requestor)
        && java.util.Objects.equals(payeeType, another.payeeType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(payment, another.payment)
        && java.util.Objects.equals(item, another.item)
        && java.util.Objects.equals(preAuthRef, another.preAuthRef)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(preAuthPeriod, another.preAuthPeriod)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(subType, another.subType)
        && java.util.Objects.equals(disposition, another.disposition)
        && java.util.Objects.equals(adjudication, another.adjudication)
        && java.util.Objects.equals(processNote, another.processNote)
        && java.util.Objects.equals(addItem, another.addItem)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(fundsReserve, another.fundsReserve)
        && java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(insurance, another.insurance)
        && java.util.Objects.equals(error, another.error)
        && insurer.equals(another.insurer)
        && java.util.Objects.equals(form, another.form)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(formCode, another.formCode)
        && java.util.Objects.equals(outcome, another.outcome)
        && patient.equals(another.patient)
        && java.util.Objects.equals(total, another.total)
        && java.util.Objects.equals(use, another.use)
        && type.equals(another.type)
        && java.util.Objects.equals(communicationRequest, another.communicationRequest);
  }

  /**
   * Computes a hash code from attributes: {@code requestor}, {@code payeeType}, {@code meta}, {@code payment}, {@code item}, {@code preAuthRef}, {@code resourceType}, {@code implicitRules}, {@code preAuthPeriod}, {@code identifier}, {@code contained}, {@code language}, {@code id}, {@code subType}, {@code disposition}, {@code adjudication}, {@code processNote}, {@code addItem}, {@code extension}, {@code fundsReserve}, {@code request}, {@code modifierExtension}, {@code insurance}, {@code error}, {@code insurer}, {@code form}, {@code created}, {@code text}, {@code status}, {@code formCode}, {@code outcome}, {@code patient}, {@code total}, {@code use}, {@code type}, {@code communicationRequest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(requestor);
    h += (h << 5) + java.util.Objects.hashCode(payeeType);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(payment);
    h += (h << 5) + java.util.Objects.hashCode(item);
    h += (h << 5) + java.util.Objects.hashCode(preAuthRef);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(preAuthPeriod);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(subType);
    h += (h << 5) + java.util.Objects.hashCode(disposition);
    h += (h << 5) + java.util.Objects.hashCode(adjudication);
    h += (h << 5) + java.util.Objects.hashCode(processNote);
    h += (h << 5) + java.util.Objects.hashCode(addItem);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(fundsReserve);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(insurance);
    h += (h << 5) + java.util.Objects.hashCode(error);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(form);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(formCode);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(total);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(communicationRequest);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ClaimResponse{");
    if (requestor != null) {
      builder.append("requestor=").append(requestor);
    }
    if (payeeType != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("payeeType=").append(payeeType);
    }
    if (meta != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (payment != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("payment=").append(payment);
    }
    if (item != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (preAuthRef != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (preAuthPeriod != null) {
      builder.append(", ");
      builder.append("preAuthPeriod=").append(preAuthPeriod);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (disposition != null) {
      builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    if (processNote != null) {
      builder.append(", ");
      builder.append("processNote=").append(processNote);
    }
    if (addItem != null) {
      builder.append(", ");
      builder.append("addItem=").append(addItem);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (fundsReserve != null) {
      builder.append(", ");
      builder.append("fundsReserve=").append(fundsReserve);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (error != null) {
      builder.append(", ");
      builder.append("error=").append(error);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (form != null) {
      builder.append(", ");
      builder.append("form=").append(form);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (formCode != null) {
      builder.append(", ");
      builder.append("formCode=").append(formCode);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (total != null) {
      builder.append(", ");
      builder.append("total=").append(total);
    }
    if (use != null) {
      builder.append(", ");
      builder.append("use=").append(use);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (communicationRequest != null) {
      builder.append(", ");
      builder.append("communicationRequest=").append(communicationRequest);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ClaimResponse {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requestor = java.util.Optional.empty();
    boolean requestorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> payeeType = java.util.Optional.empty();
    boolean payeeTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ClaimResponse_Payment> payment = java.util.Optional.empty();
    boolean paymentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> preAuthRef = java.util.Optional.empty();
    boolean preAuthRefIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> preAuthPeriod = java.util.Optional.empty();
    boolean preAuthPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subType = java.util.Optional.empty();
    boolean subTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> disposition = java.util.Optional.empty();
    boolean dispositionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_Adjudication>> adjudication = java.util.Optional.empty();
    boolean adjudicationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_ProcessNote>> processNote = java.util.Optional.empty();
    boolean processNoteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_AddItem>> addItem = java.util.Optional.empty();
    boolean addItemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> fundsReserve = java.util.Optional.empty();
    boolean fundsReserveIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_Insurance>> insurance = java.util.Optional.empty();
    boolean insuranceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_Error>> error = java.util.Optional.empty();
    boolean errorIsSet;
    @javax.annotation.Nullable com.fhir.Reference insurer;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> form = java.util.Optional.empty();
    boolean formIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> formCode = java.util.Optional.empty();
    boolean formCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_Total>> total = java.util.Optional.empty();
    boolean totalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> communicationRequest = java.util.Optional.empty();
    boolean communicationRequestIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("requestor")
    public void setRequestor(java.util.Optional<com.fhir.Reference> requestor) {
      this.requestor = requestor;
      this.requestorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payeeType")
    public void setPayeeType(java.util.Optional<com.fhir.CodeableConcept> payeeType) {
      this.payeeType = payeeType;
      this.payeeTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public void setPayment(java.util.Optional<com.fhir.ClaimResponse_Payment> payment) {
      this.payment = payment;
      this.paymentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.ClaimResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public void setPreAuthRef(java.util.Optional<java.lang.String> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthPeriod")
    public void setPreAuthPeriod(java.util.Optional<com.fhir.Period> preAuthPeriod) {
      this.preAuthPeriod = preAuthPeriod;
      this.preAuthPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public void setSubType(java.util.Optional<com.fhir.CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("disposition")
    public void setDisposition(java.util.Optional<java.lang.String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public void setAdjudication(java.util.Optional<java.util.List<com.fhir.ClaimResponse_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("processNote")
    public void setProcessNote(java.util.Optional<java.util.List<com.fhir.ClaimResponse_ProcessNote>> processNote) {
      this.processNote = processNote;
      this.processNoteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("addItem")
    public void setAddItem(java.util.Optional<java.util.List<com.fhir.ClaimResponse_AddItem>> addItem) {
      this.addItem = addItem;
      this.addItemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fundsReserve")
    public void setFundsReserve(java.util.Optional<com.fhir.CodeableConcept> fundsReserve) {
      this.fundsReserve = fundsReserve;
      this.fundsReserveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.Optional<java.util.List<com.fhir.ClaimResponse_Insurance>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(java.util.Optional<java.util.List<com.fhir.ClaimResponse_Error>> error) {
      this.error = error;
      this.errorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurer")
    public void setInsurer(com.fhir.Reference insurer) {
      this.insurer = insurer;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("form")
    public void setForm(java.util.Optional<com.fhir.Attachment> form) {
      this.form = form;
      this.formIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("formCode")
    public void setFormCode(java.util.Optional<com.fhir.CodeableConcept> formCode) {
      this.formCode = formCode;
      this.formCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.code> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public void setTotal(java.util.Optional<java.util.List<com.fhir.ClaimResponse_Total>> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.code> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("communicationRequest")
    public void setCommunicationRequest(java.util.Optional<java.util.List<com.fhir.Reference>> communicationRequest) {
      this.communicationRequest = communicationRequest;
      this.communicationRequestIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Reference> requestor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> payeeType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ClaimResponse_Payment> payment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> preAuthPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_ProcessNote>> processNote() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_AddItem>> addItem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> fundsReserve() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Insurance>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Error>> error() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> form() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> formCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Total>> total() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> use() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> communicationRequest() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse fromJson(Json json) {
    ImmutableClaimResponse.Builder builder = ((ImmutableClaimResponse.Builder) ImmutableClaimResponse.builder());
    if (json.requestorIsSet) {
      builder.requestor(json.requestor);
    }
    if (json.payeeTypeIsSet) {
      builder.payeeType(json.payeeType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.paymentIsSet) {
      builder.payment(json.payment);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.preAuthPeriodIsSet) {
      builder.preAuthPeriod(json.preAuthPeriod);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.processNoteIsSet) {
      builder.processNote(json.processNote);
    }
    if (json.addItemIsSet) {
      builder.addItem(json.addItem);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.fundsReserveIsSet) {
      builder.fundsReserve(json.fundsReserve);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.errorIsSet) {
      builder.error(json.error);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.formIsSet) {
      builder.form(json.form);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.formCodeIsSet) {
      builder.formCode(json.formCode);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.communicationRequestIsSet) {
      builder.communicationRequest(json.communicationRequest);
    }
    return (ImmutableClaimResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse instance
   */
  public static ClaimResponse copyOf(ClaimResponse instance) {
    if (instance instanceof ImmutableClaimResponse) {
      return (ImmutableClaimResponse) instance;
    }
    return ((ImmutableClaimResponse.Builder) ImmutableClaimResponse.builder())
        .requestor(instance.requestor())
        .payeeType(instance.payeeType())
        .meta(instance.meta())
        .payment(instance.payment())
        .item(instance.item())
        .preAuthRef(instance.preAuthRef())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .preAuthPeriod(instance.preAuthPeriod())
        .identifier(instance.identifier())
        .contained(instance.contained())
        .language(instance.language())
        .id(instance.id())
        .subType(instance.subType())
        .disposition(instance.disposition())
        .adjudication(instance.adjudication())
        .processNote(instance.processNote())
        .addItem(instance.addItem())
        .extension(instance.extension())
        .fundsReserve(instance.fundsReserve())
        .request(instance.request())
        .modifierExtension(instance.modifierExtension())
        .insurance(instance.insurance())
        .error(instance.error())
        .insurer(instance.insurer())
        .form(instance.form())
        .created(instance.created())
        .text(instance.text())
        .status(instance.status())
        .formCode(instance.formCode())
        .outcome(instance.outcome())
        .patient(instance.patient())
        .total(instance.total())
        .use(instance.use())
        .type(instance.type())
        .communicationRequest(instance.communicationRequest())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse ClaimResponse}.
   * <pre>
   * ImmutableClaimResponse.builder()
   *    .requestor(com.fhir.Reference) // optional {@link ClaimResponse#requestor() requestor}
   *    .payeeType(com.fhir.CodeableConcept) // optional {@link ClaimResponse#payeeType() payeeType}
   *    .meta(com.fhir.Meta) // optional {@link ClaimResponse#meta() meta}
   *    .payment(com.fhir.ClaimResponse_Payment) // optional {@link ClaimResponse#payment() payment}
   *    .item(List&amp;lt;com.fhir.ClaimResponse_Item&amp;gt;) // optional {@link ClaimResponse#item() item}
   *    .preAuthRef(String) // optional {@link ClaimResponse#preAuthRef() preAuthRef}
   *    .resourceType(String) // required {@link ClaimResponse#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link ClaimResponse#implicitRules() implicitRules}
   *    .preAuthPeriod(com.fhir.Period) // optional {@link ClaimResponse#preAuthPeriod() preAuthPeriod}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ClaimResponse#identifier() identifier}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ClaimResponse#contained() contained}
   *    .language(com.fhir.code) // optional {@link ClaimResponse#language() language}
   *    .id(com.fhir.id) // optional {@link ClaimResponse#id() id}
   *    .subType(com.fhir.CodeableConcept) // optional {@link ClaimResponse#subType() subType}
   *    .disposition(String) // optional {@link ClaimResponse#disposition() disposition}
   *    .adjudication(List&amp;lt;com.fhir.ClaimResponse_Adjudication&amp;gt;) // optional {@link ClaimResponse#adjudication() adjudication}
   *    .processNote(List&amp;lt;com.fhir.ClaimResponse_ProcessNote&amp;gt;) // optional {@link ClaimResponse#processNote() processNote}
   *    .addItem(List&amp;lt;com.fhir.ClaimResponse_AddItem&amp;gt;) // optional {@link ClaimResponse#addItem() addItem}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse#extension() extension}
   *    .fundsReserve(com.fhir.CodeableConcept) // optional {@link ClaimResponse#fundsReserve() fundsReserve}
   *    .request(com.fhir.Reference) // optional {@link ClaimResponse#request() request}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse#modifierExtension() modifierExtension}
   *    .insurance(List&amp;lt;com.fhir.ClaimResponse_Insurance&amp;gt;) // optional {@link ClaimResponse#insurance() insurance}
   *    .error(List&amp;lt;com.fhir.ClaimResponse_Error&amp;gt;) // optional {@link ClaimResponse#error() error}
   *    .insurer(com.fhir.Reference) // required {@link ClaimResponse#insurer() insurer}
   *    .form(com.fhir.Attachment) // optional {@link ClaimResponse#form() form}
   *    .created(com.fhir.dateTime) // optional {@link ClaimResponse#created() created}
   *    .text(com.fhir.Narrative) // optional {@link ClaimResponse#text() text}
   *    .status(com.fhir.code) // optional {@link ClaimResponse#status() status}
   *    .formCode(com.fhir.CodeableConcept) // optional {@link ClaimResponse#formCode() formCode}
   *    .outcome(com.fhir.code) // optional {@link ClaimResponse#outcome() outcome}
   *    .patient(com.fhir.Reference) // required {@link ClaimResponse#patient() patient}
   *    .total(List&amp;lt;com.fhir.ClaimResponse_Total&amp;gt;) // optional {@link ClaimResponse#total() total}
   *    .use(com.fhir.code) // optional {@link ClaimResponse#use() use}
   *    .type(com.fhir.CodeableConcept) // required {@link ClaimResponse#type() type}
   *    .communicationRequest(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ClaimResponse#communicationRequest() communicationRequest}
   *    .build();
   * </pre>
   * @return A new ClaimResponse builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableClaimResponse.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse ClaimResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements ResourceTypeBuildStage, InsurerBuildStage, PatientBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_INSURER = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long INIT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_REQUESTOR = 0x1L;
    private static final long OPT_BIT_PAYEE_TYPE = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_PAYMENT = 0x8L;
    private static final long OPT_BIT_ITEM = 0x10L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_PRE_AUTH_PERIOD = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_SUB_TYPE = 0x1000L;
    private static final long OPT_BIT_DISPOSITION = 0x2000L;
    private static final long OPT_BIT_ADJUDICATION = 0x4000L;
    private static final long OPT_BIT_PROCESS_NOTE = 0x8000L;
    private static final long OPT_BIT_ADD_ITEM = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_FUNDS_RESERVE = 0x40000L;
    private static final long OPT_BIT_REQUEST = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private static final long OPT_BIT_INSURANCE = 0x200000L;
    private static final long OPT_BIT_ERROR = 0x400000L;
    private static final long OPT_BIT_FORM = 0x800000L;
    private static final long OPT_BIT_CREATED = 0x1000000L;
    private static final long OPT_BIT_TEXT = 0x2000000L;
    private static final long OPT_BIT_STATUS = 0x4000000L;
    private static final long OPT_BIT_FORM_CODE = 0x8000000L;
    private static final long OPT_BIT_OUTCOME = 0x10000000L;
    private static final long OPT_BIT_TOTAL = 0x20000000L;
    private static final long OPT_BIT_USE = 0x40000000L;
    private static final long OPT_BIT_COMMUNICATION_REQUEST = 0x80000000L;
    private long initBits = 0xfL;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference requestor;
    private @javax.annotation.Nullable com.fhir.CodeableConcept payeeType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.ClaimResponse_Payment payment;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Item> item;
    private @javax.annotation.Nullable java.lang.String preAuthRef;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Period preAuthPeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subType;
    private @javax.annotation.Nullable java.lang.String disposition;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_ProcessNote> processNote;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_AddItem> addItem;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve;
    private @javax.annotation.Nullable com.fhir.Reference request;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Insurance> insurance;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Error> error;
    private @javax.annotation.Nullable com.fhir.Reference insurer;
    private @javax.annotation.Nullable com.fhir.Attachment form;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.CodeableConcept formCode;
    private @javax.annotation.Nullable com.fhir.code outcome;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Total> total;
    private @javax.annotation.Nullable com.fhir.code use;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> communicationRequest;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
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
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
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
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for chained invocation
     */
    public final Builder payeeType(com.fhir.CodeableConcept payeeType) {
      checkNotIsSet(payeeTypeIsSet(), "payeeType");
      this.payeeType = java.util.Objects.requireNonNull(payeeType, "payeeType");
      optBits |= OPT_BIT_PAYEE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payeeType")
    public final Builder payeeType(java.util.Optional<? extends com.fhir.CodeableConcept> payeeType) {
      checkNotIsSet(payeeTypeIsSet(), "payeeType");
      this.payeeType = payeeType.orElse(null);
      optBits |= OPT_BIT_PAYEE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    public final Builder payment(com.fhir.ClaimResponse_Payment payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = java.util.Objects.requireNonNull(payment, "payment");
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public final Builder payment(java.util.Optional<? extends com.fhir.ClaimResponse_Payment> payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = payment.orElse(null);
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.ClaimResponse_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(java.lang.String preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = java.util.Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public final Builder preAuthRef(java.util.Optional<java.lang.String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthPeriod(com.fhir.Period preAuthPeriod) {
      checkNotIsSet(preAuthPeriodIsSet(), "preAuthPeriod");
      this.preAuthPeriod = java.util.Objects.requireNonNull(preAuthPeriod, "preAuthPeriod");
      optBits |= OPT_BIT_PRE_AUTH_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthPeriod")
    public final Builder preAuthPeriod(java.util.Optional<? extends com.fhir.Period> preAuthPeriod) {
      checkNotIsSet(preAuthPeriodIsSet(), "preAuthPeriod");
      this.preAuthPeriod = preAuthPeriod.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
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
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
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
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subType(com.fhir.CodeableConcept subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = java.util.Objects.requireNonNull(subType, "subType");
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public final Builder subType(java.util.Optional<? extends com.fhir.CodeableConcept> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = subType.orElse(null);
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = java.util.Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public final Builder adjudication(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    public final Builder processNote(java.util.List<com.fhir.ClaimResponse_ProcessNote> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = java.util.Objects.requireNonNull(processNote, "processNote");
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processNote")
    public final Builder processNote(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_ProcessNote>> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = processNote.orElse(null);
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder addItem(java.util.List<com.fhir.ClaimResponse_AddItem> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = java.util.Objects.requireNonNull(addItem, "addItem");
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addItem")
    public final Builder addItem(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_AddItem>> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = addItem.orElse(null);
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    public final Builder fundsReserve(com.fhir.CodeableConcept fundsReserve) {
      checkNotIsSet(fundsReserveIsSet(), "fundsReserve");
      this.fundsReserve = java.util.Objects.requireNonNull(fundsReserve, "fundsReserve");
      optBits |= OPT_BIT_FUNDS_RESERVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fundsReserve")
    public final Builder fundsReserve(java.util.Optional<? extends com.fhir.CodeableConcept> fundsReserve) {
      checkNotIsSet(fundsReserveIsSet(), "fundsReserve");
      this.fundsReserve = fundsReserve.orElse(null);
      optBits |= OPT_BIT_FUNDS_RESERVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
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
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
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
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(java.util.List<com.fhir.ClaimResponse_Insurance> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = java.util.Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public final Builder insurance(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Insurance>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    public final Builder error(java.util.List<com.fhir.ClaimResponse_Error> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = java.util.Objects.requireNonNull(error, "error");
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public final Builder error(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Error>> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = error.orElse(null);
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insurer")
    public final Builder insurer(com.fhir.Reference insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = java.util.Objects.requireNonNull(insurer, "insurer");
      initBits &= ~INIT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    public final Builder form(com.fhir.Attachment form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = java.util.Objects.requireNonNull(form, "form");
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("form")
    public final Builder form(java.util.Optional<? extends com.fhir.Attachment> form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = form.orElse(null);
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
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
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
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
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
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
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
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
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
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
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
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
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
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
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
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
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.code outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.code> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(java.util.List<com.fhir.ClaimResponse_Total> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = java.util.Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public final Builder total(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Total>> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.code use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.code> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse#type() type} attribute.
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
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder communicationRequest(java.util.List<com.fhir.Reference> communicationRequest) {
      checkNotIsSet(communicationRequestIsSet(), "communicationRequest");
      this.communicationRequest = java.util.Objects.requireNonNull(communicationRequest, "communicationRequest");
      optBits |= OPT_BIT_COMMUNICATION_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("communicationRequest")
    public final Builder communicationRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> communicationRequest) {
      checkNotIsSet(communicationRequestIsSet(), "communicationRequest");
      this.communicationRequest = communicationRequest.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION_REQUEST;
      return this;
    }

    /**
     * Builds a new {@link ClaimResponse ClaimResponse}.
     * @return An immutable instance of ClaimResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ClaimResponse build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse(
          requestor,
          payeeType,
          meta,
          payment,
          item,
          preAuthRef,
          resourceType,
          implicitRules,
          preAuthPeriod,
          identifier,
          contained,
          language,
          id,
          subType,
          disposition,
          adjudication,
          processNote,
          addItem,
          extension,
          fundsReserve,
          request,
          modifierExtension,
          insurance,
          error,
          insurer,
          form,
          created,
          text,
          status,
          formCode,
          outcome,
          patient,
          total,
          use,
          type,
          communicationRequest);
    }

    private boolean requestorIsSet() {
      return (optBits & OPT_BIT_REQUESTOR) != 0;
    }

    private boolean payeeTypeIsSet() {
      return (optBits & OPT_BIT_PAYEE_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean paymentIsSet() {
      return (optBits & OPT_BIT_PAYMENT) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean preAuthPeriodIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_PERIOD) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean processNoteIsSet() {
      return (optBits & OPT_BIT_PROCESS_NOTE) != 0;
    }

    private boolean addItemIsSet() {
      return (optBits & OPT_BIT_ADD_ITEM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean fundsReserveIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean errorIsSet() {
      return (optBits & OPT_BIT_ERROR) != 0;
    }

    private boolean formIsSet() {
      return (optBits & OPT_BIT_FORM) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean formCodeIsSet() {
      return (optBits & OPT_BIT_FORM_CODE) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean communicationRequestIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION_REQUEST) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean insurerIsSet() {
      return (initBits & INIT_BIT_INSURER) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ClaimResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!insurerIsSet()) attributes.add("insurer");
      if (!patientIsSet()) attributes.add("patient");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build ClaimResponse, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    InsurerBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage insurer(com.fhir.Reference insurer);
  }

  @org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "ClaimResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestor(com.fhir.Reference requestor);

    /**
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestor(java.util.Optional<? extends com.fhir.Reference> requestor);

    /**
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payeeType(com.fhir.CodeableConcept payeeType);

    /**
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payeeType(java.util.Optional<? extends com.fhir.CodeableConcept> payeeType);

    /**
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payment(com.fhir.ClaimResponse_Payment payment);

    /**
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payment(java.util.Optional<? extends com.fhir.ClaimResponse_Payment> payment);

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(java.util.List<com.fhir.ClaimResponse_Item> item);

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Item>> item);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(java.lang.String preAuthRef);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(java.util.Optional<java.lang.String> preAuthRef);

    /**
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthPeriod(com.fhir.Period preAuthPeriod);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthPeriod(java.util.Optional<? extends com.fhir.Period> preAuthPeriod);

    /**
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(com.fhir.CodeableConcept subType);

    /**
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(java.util.Optional<? extends com.fhir.CodeableConcept> subType);

    /**
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(java.lang.String disposition);

    /**
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(java.util.Optional<java.lang.String> disposition);

    /**
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processNote(java.util.List<com.fhir.ClaimResponse_ProcessNote> processNote);

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processNote(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_ProcessNote>> processNote);

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addItem(java.util.List<com.fhir.ClaimResponse_AddItem> addItem);

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_AddItem>> addItem);

    /**
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserve(com.fhir.CodeableConcept fundsReserve);

    /**
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserve(java.util.Optional<? extends com.fhir.CodeableConcept> fundsReserve);

    /**
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(com.fhir.Reference request);

    /**
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(java.util.List<com.fhir.ClaimResponse_Insurance> insurance);

    /**
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Insurance>> insurance);

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    BuildFinal error(java.util.List<com.fhir.ClaimResponse_Error> error);

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal error(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Error>> error);

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    BuildFinal form(com.fhir.Attachment form);

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal form(java.util.Optional<? extends com.fhir.Attachment> form);

    /**
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal formCode(com.fhir.CodeableConcept formCode);

    /**
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal formCode(java.util.Optional<? extends com.fhir.CodeableConcept> formCode);

    /**
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.code outcome);

    /**
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.code> outcome);

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(java.util.List<com.fhir.ClaimResponse_Total> total);

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Total>> total);

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    BuildFinal use(com.fhir.code use);

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal use(java.util.Optional<? extends com.fhir.code> use);

    /**
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communicationRequest(java.util.List<com.fhir.Reference> communicationRequest);

    /**
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communicationRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> communicationRequest);

    /**
     * Builds a new {@link ClaimResponse ClaimResponse}.
     * @return An immutable instance of ClaimResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse build();
  }
}
