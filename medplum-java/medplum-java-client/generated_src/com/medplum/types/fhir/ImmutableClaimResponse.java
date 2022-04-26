package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ClaimResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse.builder()}.
 */
@Generated(from = "ClaimResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse implements ClaimResponse {
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable Attachment form;
  private final @Nullable String disposition;
  private final CodeableConcept type;
  private final Reference patient;
  private final @Nullable List<Reference> communicationRequest;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ClaimResponse_Adjudication> adjudication;
  private final Reference insurer;
  private final @Nullable CodeableConcept formCode;
  private final @Nullable List<ClaimResponse_Error> error;
  private final @Nullable List<ClaimResponse_ProcessNote> processNote;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<ClaimResponse_AddItem> addItem;
  private final @Nullable DateTime created;
  private final @Nullable Code outcome;
  private final @Nullable Narrative text;
  private final @Nullable List<ClaimResponse_Item> item;
  private final @Nullable Uri implicitRules;
  private final @Nullable Id id;
  private final @Nullable CodeableConcept payeeType;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Period preAuthPeriod;
  private final @Nullable Code language;
  private final @Nullable String preAuthRef;
  private final @Nullable CodeableConcept fundsReserve;
  private final @Nullable Reference requestor;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code status;
  private final @Nullable Reference request;
  private final @Nullable List<ClaimResponse_Insurance> insurance;
  private final @Nullable Code use;
  private final @Nullable ClaimResponse_Payment payment;
  private final @Nullable CodeableConcept subType;
  private final @Nullable List<ClaimResponse_Total> total;

  private ImmutableClaimResponse(
      String resourceType,
      @Nullable Meta meta,
      @Nullable Attachment form,
      @Nullable String disposition,
      CodeableConcept type,
      Reference patient,
      @Nullable List<Reference> communicationRequest,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ClaimResponse_Adjudication> adjudication,
      Reference insurer,
      @Nullable CodeableConcept formCode,
      @Nullable List<ClaimResponse_Error> error,
      @Nullable List<ClaimResponse_ProcessNote> processNote,
      @Nullable List<Identifier> identifier,
      @Nullable List<ClaimResponse_AddItem> addItem,
      @Nullable DateTime created,
      @Nullable Code outcome,
      @Nullable Narrative text,
      @Nullable List<ClaimResponse_Item> item,
      @Nullable Uri implicitRules,
      @Nullable Id id,
      @Nullable CodeableConcept payeeType,
      @Nullable List<ResourceList> contained,
      @Nullable Period preAuthPeriod,
      @Nullable Code language,
      @Nullable String preAuthRef,
      @Nullable CodeableConcept fundsReserve,
      @Nullable Reference requestor,
      @Nullable List<Extension> extension,
      @Nullable Code status,
      @Nullable Reference request,
      @Nullable List<ClaimResponse_Insurance> insurance,
      @Nullable Code use,
      @Nullable ClaimResponse_Payment payment,
      @Nullable CodeableConcept subType,
      @Nullable List<ClaimResponse_Total> total) {
    this.resourceType = resourceType;
    this.meta = meta;
    this.form = form;
    this.disposition = disposition;
    this.type = type;
    this.patient = patient;
    this.communicationRequest = communicationRequest;
    this.modifierExtension = modifierExtension;
    this.adjudication = adjudication;
    this.insurer = insurer;
    this.formCode = formCode;
    this.error = error;
    this.processNote = processNote;
    this.identifier = identifier;
    this.addItem = addItem;
    this.created = created;
    this.outcome = outcome;
    this.text = text;
    this.item = item;
    this.implicitRules = implicitRules;
    this.id = id;
    this.payeeType = payeeType;
    this.contained = contained;
    this.preAuthPeriod = preAuthPeriod;
    this.language = language;
    this.preAuthRef = preAuthRef;
    this.fundsReserve = fundsReserve;
    this.requestor = requestor;
    this.extension = extension;
    this.status = status;
    this.request = request;
    this.insurance = insurance;
    this.use = use;
    this.payment = payment;
    this.subType = subType;
    this.total = total;
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code form} attribute
   */
  @JsonProperty("form")
  @Override
  public Optional<Attachment> form() {
    return Optional.ofNullable(form);
  }

  /**
   * @return The value of the {@code disposition} attribute
   */
  @JsonProperty("disposition")
  @Override
  public Optional<String> disposition() {
    return Optional.ofNullable(disposition);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code communicationRequest} attribute
   */
  @JsonProperty("communicationRequest")
  @Override
  public Optional<List<Reference>> communicationRequest() {
    return Optional.ofNullable(communicationRequest);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public Optional<List<ClaimResponse_Adjudication>> adjudication() {
    return Optional.ofNullable(adjudication);
  }

  /**
   * @return The value of the {@code insurer} attribute
   */
  @JsonProperty("insurer")
  @Override
  public Reference insurer() {
    return insurer;
  }

  /**
   * @return The value of the {@code formCode} attribute
   */
  @JsonProperty("formCode")
  @Override
  public Optional<CodeableConcept> formCode() {
    return Optional.ofNullable(formCode);
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @JsonProperty("error")
  @Override
  public Optional<List<ClaimResponse_Error>> error() {
    return Optional.ofNullable(error);
  }

  /**
   * @return The value of the {@code processNote} attribute
   */
  @JsonProperty("processNote")
  @Override
  public Optional<List<ClaimResponse_ProcessNote>> processNote() {
    return Optional.ofNullable(processNote);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code addItem} attribute
   */
  @JsonProperty("addItem")
  @Override
  public Optional<List<ClaimResponse_AddItem>> addItem() {
    return Optional.ofNullable(addItem);
  }

  /**
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<Code> outcome() {
    return Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<ClaimResponse_Item>> item() {
    return Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code payeeType} attribute
   */
  @JsonProperty("payeeType")
  @Override
  public Optional<CodeableConcept> payeeType() {
    return Optional.ofNullable(payeeType);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code preAuthPeriod} attribute
   */
  @JsonProperty("preAuthPeriod")
  @Override
  public Optional<Period> preAuthPeriod() {
    return Optional.ofNullable(preAuthPeriod);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code preAuthRef} attribute
   */
  @JsonProperty("preAuthRef")
  @Override
  public Optional<String> preAuthRef() {
    return Optional.ofNullable(preAuthRef);
  }

  /**
   * @return The value of the {@code fundsReserve} attribute
   */
  @JsonProperty("fundsReserve")
  @Override
  public Optional<CodeableConcept> fundsReserve() {
    return Optional.ofNullable(fundsReserve);
  }

  /**
   * @return The value of the {@code requestor} attribute
   */
  @JsonProperty("requestor")
  @Override
  public Optional<Reference> requestor() {
    return Optional.ofNullable(requestor);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<Reference> request() {
    return Optional.ofNullable(request);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public Optional<List<ClaimResponse_Insurance>> insurance() {
    return Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<Code> use() {
    return Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code payment} attribute
   */
  @JsonProperty("payment")
  @Override
  public Optional<ClaimResponse_Payment> payment() {
    return Optional.ofNullable(payment);
  }

  /**
   * @return The value of the {@code subType} attribute
   */
  @JsonProperty("subType")
  @Override
  public Optional<CodeableConcept> subType() {
    return Optional.ofNullable(subType);
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @JsonProperty("total")
  @Override
  public Optional<List<ClaimResponse_Total>> total() {
    return Optional.ofNullable(total);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableClaimResponse(
        newValue,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        newValue,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        value,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#form() form} attribute.
   * @param value The value for form
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withForm(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "form");
    if (this.form == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        newValue,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#form() form} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for form
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withForm(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.form == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        value,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withDisposition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "disposition");
    if (Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        newValue,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withDisposition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.disposition, value)) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        value,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        newValue,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        newValue,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#communicationRequest() communicationRequest} attribute.
   * @param value The value for communicationRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withCommunicationRequest(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "communicationRequest");
    if (this.communicationRequest == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        newValue,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#communicationRequest() communicationRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communicationRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withCommunicationRequest(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.communicationRequest == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        value,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        newValue,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        value,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withAdjudication(List<ClaimResponse_Adjudication> value) {
    @Nullable List<ClaimResponse_Adjudication> newValue = Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        newValue,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withAdjudication(Optional<? extends List<ClaimResponse_Adjudication>> optional) {
    @Nullable List<ClaimResponse_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        value,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse withInsurer(Reference value) {
    if (this.insurer == value) return this;
    Reference newValue = Objects.requireNonNull(value, "insurer");
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        newValue,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#formCode() formCode} attribute.
   * @param value The value for formCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withFormCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "formCode");
    if (this.formCode == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        newValue,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#formCode() formCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for formCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withFormCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.formCode == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        value,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#error() error} attribute.
   * @param value The value for error
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withError(List<ClaimResponse_Error> value) {
    @Nullable List<ClaimResponse_Error> newValue = Objects.requireNonNull(value, "error");
    if (this.error == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        newValue,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#error() error} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for error
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withError(Optional<? extends List<ClaimResponse_Error>> optional) {
    @Nullable List<ClaimResponse_Error> value = optional.orElse(null);
    if (this.error == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        value,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#processNote() processNote} attribute.
   * @param value The value for processNote
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withProcessNote(List<ClaimResponse_ProcessNote> value) {
    @Nullable List<ClaimResponse_ProcessNote> newValue = Objects.requireNonNull(value, "processNote");
    if (this.processNote == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        newValue,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#processNote() processNote} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processNote
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withProcessNote(Optional<? extends List<ClaimResponse_ProcessNote>> optional) {
    @Nullable List<ClaimResponse_ProcessNote> value = optional.orElse(null);
    if (this.processNote == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        value,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        newValue,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        value,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#addItem() addItem} attribute.
   * @param value The value for addItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withAddItem(List<ClaimResponse_AddItem> value) {
    @Nullable List<ClaimResponse_AddItem> newValue = Objects.requireNonNull(value, "addItem");
    if (this.addItem == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        newValue,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#addItem() addItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withAddItem(Optional<? extends List<ClaimResponse_AddItem>> optional) {
    @Nullable List<ClaimResponse_AddItem> value = optional.orElse(null);
    if (this.addItem == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        value,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        newValue,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        value,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withOutcome(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        newValue,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withOutcome(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        value,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        newValue,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        value,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withItem(List<ClaimResponse_Item> value) {
    @Nullable List<ClaimResponse_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        newValue,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withItem(Optional<? extends List<ClaimResponse_Item>> optional) {
    @Nullable List<ClaimResponse_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        value,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        newValue,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        value,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        newValue,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        value,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#payeeType() payeeType} attribute.
   * @param value The value for payeeType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPayeeType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "payeeType");
    if (this.payeeType == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        newValue,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#payeeType() payeeType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payeeType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withPayeeType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.payeeType == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        value,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        newValue,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        value,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#preAuthPeriod() preAuthPeriod} attribute.
   * @param value The value for preAuthPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPreAuthPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "preAuthPeriod");
    if (this.preAuthPeriod == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        newValue,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#preAuthPeriod() preAuthPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withPreAuthPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.preAuthPeriod == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        value,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        newValue,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        value,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPreAuthRef(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "preAuthRef");
    if (Objects.equals(this.preAuthRef, newValue)) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        newValue,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#preAuthRef() preAuthRef} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPreAuthRef(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.preAuthRef, value)) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        value,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#fundsReserve() fundsReserve} attribute.
   * @param value The value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withFundsReserve(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "fundsReserve");
    if (this.fundsReserve == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        newValue,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#fundsReserve() fundsReserve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withFundsReserve(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.fundsReserve == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        value,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#requestor() requestor} attribute.
   * @param value The value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withRequestor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requestor");
    if (this.requestor == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        newValue,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#requestor() requestor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withRequestor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requestor == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        value,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        newValue,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        value,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        newValue,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        value,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withRequest(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        newValue,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withRequest(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        value,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withInsurance(List<ClaimResponse_Insurance> value) {
    @Nullable List<ClaimResponse_Insurance> newValue = Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        newValue,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withInsurance(Optional<? extends List<ClaimResponse_Insurance>> optional) {
    @Nullable List<ClaimResponse_Insurance> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        value,
        this.use,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withUse(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        newValue,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withUse(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        value,
        this.payment,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#payment() payment} attribute.
   * @param value The value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withPayment(ClaimResponse_Payment value) {
    @Nullable ClaimResponse_Payment newValue = Objects.requireNonNull(value, "payment");
    if (this.payment == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        newValue,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#payment() payment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withPayment(Optional<? extends ClaimResponse_Payment> optional) {
    @Nullable ClaimResponse_Payment value = optional.orElse(null);
    if (this.payment == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        value,
        this.subType,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withSubType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        newValue,
        this.total);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withSubType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        value,
        this.total);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse withTotal(List<ClaimResponse_Total> value) {
    @Nullable List<ClaimResponse_Total> newValue = Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse withTotal(Optional<? extends List<ClaimResponse_Total>> optional) {
    @Nullable List<ClaimResponse_Total> value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableClaimResponse(
        this.resourceType,
        this.meta,
        this.form,
        this.disposition,
        this.type,
        this.patient,
        this.communicationRequest,
        this.modifierExtension,
        this.adjudication,
        this.insurer,
        this.formCode,
        this.error,
        this.processNote,
        this.identifier,
        this.addItem,
        this.created,
        this.outcome,
        this.text,
        this.item,
        this.implicitRules,
        this.id,
        this.payeeType,
        this.contained,
        this.preAuthPeriod,
        this.language,
        this.preAuthRef,
        this.fundsReserve,
        this.requestor,
        this.extension,
        this.status,
        this.request,
        this.insurance,
        this.use,
        this.payment,
        this.subType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse
        && equalTo((ImmutableClaimResponse) another);
  }

  private boolean equalTo(ImmutableClaimResponse another) {
    return resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(form, another.form)
        && Objects.equals(disposition, another.disposition)
        && type.equals(another.type)
        && patient.equals(another.patient)
        && Objects.equals(communicationRequest, another.communicationRequest)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(adjudication, another.adjudication)
        && insurer.equals(another.insurer)
        && Objects.equals(formCode, another.formCode)
        && Objects.equals(error, another.error)
        && Objects.equals(processNote, another.processNote)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(addItem, another.addItem)
        && Objects.equals(created, another.created)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(text, another.text)
        && Objects.equals(item, another.item)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(id, another.id)
        && Objects.equals(payeeType, another.payeeType)
        && Objects.equals(contained, another.contained)
        && Objects.equals(preAuthPeriod, another.preAuthPeriod)
        && Objects.equals(language, another.language)
        && Objects.equals(preAuthRef, another.preAuthRef)
        && Objects.equals(fundsReserve, another.fundsReserve)
        && Objects.equals(requestor, another.requestor)
        && Objects.equals(extension, another.extension)
        && Objects.equals(status, another.status)
        && Objects.equals(request, another.request)
        && Objects.equals(insurance, another.insurance)
        && Objects.equals(use, another.use)
        && Objects.equals(payment, another.payment)
        && Objects.equals(subType, another.subType)
        && Objects.equals(total, another.total);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code meta}, {@code form}, {@code disposition}, {@code type}, {@code patient}, {@code communicationRequest}, {@code modifierExtension}, {@code adjudication}, {@code insurer}, {@code formCode}, {@code error}, {@code processNote}, {@code identifier}, {@code addItem}, {@code created}, {@code outcome}, {@code text}, {@code item}, {@code implicitRules}, {@code id}, {@code payeeType}, {@code contained}, {@code preAuthPeriod}, {@code language}, {@code preAuthRef}, {@code fundsReserve}, {@code requestor}, {@code extension}, {@code status}, {@code request}, {@code insurance}, {@code use}, {@code payment}, {@code subType}, {@code total}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(form);
    h += (h << 5) + Objects.hashCode(disposition);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(communicationRequest);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(adjudication);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + Objects.hashCode(formCode);
    h += (h << 5) + Objects.hashCode(error);
    h += (h << 5) + Objects.hashCode(processNote);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(addItem);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(payeeType);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(preAuthPeriod);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(preAuthRef);
    h += (h << 5) + Objects.hashCode(fundsReserve);
    h += (h << 5) + Objects.hashCode(requestor);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(payment);
    h += (h << 5) + Objects.hashCode(subType);
    h += (h << 5) + Objects.hashCode(total);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse{");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (form != null) {
      builder.append(", ");
      builder.append("form=").append(form);
    }
    if (disposition != null) {
      builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (communicationRequest != null) {
      builder.append(", ");
      builder.append("communicationRequest=").append(communicationRequest);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (formCode != null) {
      builder.append(", ");
      builder.append("formCode=").append(formCode);
    }
    if (error != null) {
      builder.append(", ");
      builder.append("error=").append(error);
    }
    if (processNote != null) {
      builder.append(", ");
      builder.append("processNote=").append(processNote);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (addItem != null) {
      builder.append(", ");
      builder.append("addItem=").append(addItem);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (item != null) {
      builder.append(", ");
      builder.append("item=").append(item);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (payeeType != null) {
      builder.append(", ");
      builder.append("payeeType=").append(payeeType);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (preAuthPeriod != null) {
      builder.append(", ");
      builder.append("preAuthPeriod=").append(preAuthPeriod);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (preAuthRef != null) {
      builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (fundsReserve != null) {
      builder.append(", ");
      builder.append("fundsReserve=").append(fundsReserve);
    }
    if (requestor != null) {
      builder.append(", ");
      builder.append("requestor=").append(requestor);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (use != null) {
      builder.append(", ");
      builder.append("use=").append(use);
    }
    if (payment != null) {
      builder.append(", ");
      builder.append("payment=").append(payment);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (total != null) {
      builder.append(", ");
      builder.append("total=").append(total);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse {
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Attachment> form = Optional.empty();
    boolean formIsSet;
    @Nullable Optional<String> disposition = Optional.empty();
    boolean dispositionIsSet;
    @Nullable CodeableConcept type;
    @Nullable Reference patient;
    @Nullable Optional<List<Reference>> communicationRequest = Optional.empty();
    boolean communicationRequestIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ClaimResponse_Adjudication>> adjudication = Optional.empty();
    boolean adjudicationIsSet;
    @Nullable Reference insurer;
    @Nullable Optional<CodeableConcept> formCode = Optional.empty();
    boolean formCodeIsSet;
    @Nullable Optional<List<ClaimResponse_Error>> error = Optional.empty();
    boolean errorIsSet;
    @Nullable Optional<List<ClaimResponse_ProcessNote>> processNote = Optional.empty();
    boolean processNoteIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ClaimResponse_AddItem>> addItem = Optional.empty();
    boolean addItemIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<Code> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ClaimResponse_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> payeeType = Optional.empty();
    boolean payeeTypeIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Period> preAuthPeriod = Optional.empty();
    boolean preAuthPeriodIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> preAuthRef = Optional.empty();
    boolean preAuthRefIsSet;
    @Nullable Optional<CodeableConcept> fundsReserve = Optional.empty();
    boolean fundsReserveIsSet;
    @Nullable Optional<Reference> requestor = Optional.empty();
    boolean requestorIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<List<ClaimResponse_Insurance>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Optional<Code> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<ClaimResponse_Payment> payment = Optional.empty();
    boolean paymentIsSet;
    @Nullable Optional<CodeableConcept> subType = Optional.empty();
    boolean subTypeIsSet;
    @Nullable Optional<List<ClaimResponse_Total>> total = Optional.empty();
    boolean totalIsSet;
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("form")
    public void setForm(Optional<Attachment> form) {
      this.form = form;
      this.formIsSet = true;
    }
    @JsonProperty("disposition")
    public void setDisposition(Optional<String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("communicationRequest")
    public void setCommunicationRequest(Optional<List<Reference>> communicationRequest) {
      this.communicationRequest = communicationRequest;
      this.communicationRequestIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(Optional<List<ClaimResponse_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @JsonProperty("insurer")
    public void setInsurer(Reference insurer) {
      this.insurer = insurer;
    }
    @JsonProperty("formCode")
    public void setFormCode(Optional<CodeableConcept> formCode) {
      this.formCode = formCode;
      this.formCodeIsSet = true;
    }
    @JsonProperty("error")
    public void setError(Optional<List<ClaimResponse_Error>> error) {
      this.error = error;
      this.errorIsSet = true;
    }
    @JsonProperty("processNote")
    public void setProcessNote(Optional<List<ClaimResponse_ProcessNote>> processNote) {
      this.processNote = processNote;
      this.processNoteIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("addItem")
    public void setAddItem(Optional<List<ClaimResponse_AddItem>> addItem) {
      this.addItem = addItem;
      this.addItemIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<Code> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<ClaimResponse_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("payeeType")
    public void setPayeeType(Optional<CodeableConcept> payeeType) {
      this.payeeType = payeeType;
      this.payeeTypeIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("preAuthPeriod")
    public void setPreAuthPeriod(Optional<Period> preAuthPeriod) {
      this.preAuthPeriod = preAuthPeriod;
      this.preAuthPeriodIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("preAuthRef")
    public void setPreAuthRef(Optional<String> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @JsonProperty("fundsReserve")
    public void setFundsReserve(Optional<CodeableConcept> fundsReserve) {
      this.fundsReserve = fundsReserve;
      this.fundsReserveIsSet = true;
    }
    @JsonProperty("requestor")
    public void setRequestor(Optional<Reference> requestor) {
      this.requestor = requestor;
      this.requestorIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<ClaimResponse_Insurance>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<Code> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("payment")
    public void setPayment(Optional<ClaimResponse_Payment> payment) {
      this.payment = payment;
      this.paymentIsSet = true;
    }
    @JsonProperty("subType")
    public void setSubType(Optional<CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @JsonProperty("total")
    public void setTotal(Optional<List<ClaimResponse_Total>> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> form() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> communicationRequest() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> formCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Error>> error() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_ProcessNote>> processNote() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_AddItem>> addItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> payeeType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> preAuthPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> fundsReserve() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requestor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Insurance>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ClaimResponse_Payment> payment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Total>> total() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse fromJson(Json json) {
    ImmutableClaimResponse.Builder builder = ((ImmutableClaimResponse.Builder) ImmutableClaimResponse.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.formIsSet) {
      builder.form(json.form);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.communicationRequestIsSet) {
      builder.communicationRequest(json.communicationRequest);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.formCodeIsSet) {
      builder.formCode(json.formCode);
    }
    if (json.errorIsSet) {
      builder.error(json.error);
    }
    if (json.processNoteIsSet) {
      builder.processNote(json.processNote);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.addItemIsSet) {
      builder.addItem(json.addItem);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.payeeTypeIsSet) {
      builder.payeeType(json.payeeType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.preAuthPeriodIsSet) {
      builder.preAuthPeriod(json.preAuthPeriod);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.fundsReserveIsSet) {
      builder.fundsReserve(json.fundsReserve);
    }
    if (json.requestorIsSet) {
      builder.requestor(json.requestor);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.paymentIsSet) {
      builder.payment(json.payment);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
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
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .form(instance.form())
        .disposition(instance.disposition())
        .type(instance.type())
        .patient(instance.patient())
        .communicationRequest(instance.communicationRequest())
        .modifierExtension(instance.modifierExtension())
        .adjudication(instance.adjudication())
        .insurer(instance.insurer())
        .formCode(instance.formCode())
        .error(instance.error())
        .processNote(instance.processNote())
        .identifier(instance.identifier())
        .addItem(instance.addItem())
        .created(instance.created())
        .outcome(instance.outcome())
        .text(instance.text())
        .item(instance.item())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .payeeType(instance.payeeType())
        .contained(instance.contained())
        .preAuthPeriod(instance.preAuthPeriod())
        .language(instance.language())
        .preAuthRef(instance.preAuthRef())
        .fundsReserve(instance.fundsReserve())
        .requestor(instance.requestor())
        .extension(instance.extension())
        .status(instance.status())
        .request(instance.request())
        .insurance(instance.insurance())
        .use(instance.use())
        .payment(instance.payment())
        .subType(instance.subType())
        .total(instance.total())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse ClaimResponse}.
   * <pre>
   * ImmutableClaimResponse.builder()
   *    .resourceType(String) // required {@link ClaimResponse#resourceType() resourceType}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ClaimResponse#meta() meta}
   *    .form(com.medplum.types.fhir.Attachment) // optional {@link ClaimResponse#form() form}
   *    .disposition(String) // optional {@link ClaimResponse#disposition() disposition}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link ClaimResponse#type() type}
   *    .patient(com.medplum.types.fhir.Reference) // required {@link ClaimResponse#patient() patient}
   *    .communicationRequest(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ClaimResponse#communicationRequest() communicationRequest}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse#modifierExtension() modifierExtension}
   *    .adjudication(List&amp;lt;com.medplum.types.fhir.ClaimResponse_Adjudication&amp;gt;) // optional {@link ClaimResponse#adjudication() adjudication}
   *    .insurer(com.medplum.types.fhir.Reference) // required {@link ClaimResponse#insurer() insurer}
   *    .formCode(com.medplum.types.fhir.CodeableConcept) // optional {@link ClaimResponse#formCode() formCode}
   *    .error(List&amp;lt;com.medplum.types.fhir.ClaimResponse_Error&amp;gt;) // optional {@link ClaimResponse#error() error}
   *    .processNote(List&amp;lt;com.medplum.types.fhir.ClaimResponse_ProcessNote&amp;gt;) // optional {@link ClaimResponse#processNote() processNote}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ClaimResponse#identifier() identifier}
   *    .addItem(List&amp;lt;com.medplum.types.fhir.ClaimResponse_AddItem&amp;gt;) // optional {@link ClaimResponse#addItem() addItem}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link ClaimResponse#created() created}
   *    .outcome(com.medplum.types.fhir.Code) // optional {@link ClaimResponse#outcome() outcome}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ClaimResponse#text() text}
   *    .item(List&amp;lt;com.medplum.types.fhir.ClaimResponse_Item&amp;gt;) // optional {@link ClaimResponse#item() item}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ClaimResponse#implicitRules() implicitRules}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ClaimResponse#id() id}
   *    .payeeType(com.medplum.types.fhir.CodeableConcept) // optional {@link ClaimResponse#payeeType() payeeType}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ClaimResponse#contained() contained}
   *    .preAuthPeriod(com.medplum.types.fhir.Period) // optional {@link ClaimResponse#preAuthPeriod() preAuthPeriod}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ClaimResponse#language() language}
   *    .preAuthRef(String) // optional {@link ClaimResponse#preAuthRef() preAuthRef}
   *    .fundsReserve(com.medplum.types.fhir.CodeableConcept) // optional {@link ClaimResponse#fundsReserve() fundsReserve}
   *    .requestor(com.medplum.types.fhir.Reference) // optional {@link ClaimResponse#requestor() requestor}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse#extension() extension}
   *    .status(com.medplum.types.fhir.Code) // optional {@link ClaimResponse#status() status}
   *    .request(com.medplum.types.fhir.Reference) // optional {@link ClaimResponse#request() request}
   *    .insurance(List&amp;lt;com.medplum.types.fhir.ClaimResponse_Insurance&amp;gt;) // optional {@link ClaimResponse#insurance() insurance}
   *    .use(com.medplum.types.fhir.Code) // optional {@link ClaimResponse#use() use}
   *    .payment(com.medplum.types.fhir.ClaimResponse_Payment) // optional {@link ClaimResponse#payment() payment}
   *    .subType(com.medplum.types.fhir.CodeableConcept) // optional {@link ClaimResponse#subType() subType}
   *    .total(List&amp;lt;com.medplum.types.fhir.ClaimResponse_Total&amp;gt;) // optional {@link ClaimResponse#total() total}
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
  @Generated(from = "ClaimResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements ResourceTypeBuildStage, TypeBuildStage, PatientBuildStage, InsurerBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long INIT_BIT_INSURER = 0x8L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_FORM = 0x2L;
    private static final long OPT_BIT_DISPOSITION = 0x4L;
    private static final long OPT_BIT_COMMUNICATION_REQUEST = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ADJUDICATION = 0x20L;
    private static final long OPT_BIT_FORM_CODE = 0x40L;
    private static final long OPT_BIT_ERROR = 0x80L;
    private static final long OPT_BIT_PROCESS_NOTE = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_ADD_ITEM = 0x400L;
    private static final long OPT_BIT_CREATED = 0x800L;
    private static final long OPT_BIT_OUTCOME = 0x1000L;
    private static final long OPT_BIT_TEXT = 0x2000L;
    private static final long OPT_BIT_ITEM = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_PAYEE_TYPE = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_PRE_AUTH_PERIOD = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x200000L;
    private static final long OPT_BIT_FUNDS_RESERVE = 0x400000L;
    private static final long OPT_BIT_REQUESTOR = 0x800000L;
    private static final long OPT_BIT_EXTENSION = 0x1000000L;
    private static final long OPT_BIT_STATUS = 0x2000000L;
    private static final long OPT_BIT_REQUEST = 0x4000000L;
    private static final long OPT_BIT_INSURANCE = 0x8000000L;
    private static final long OPT_BIT_USE = 0x10000000L;
    private static final long OPT_BIT_PAYMENT = 0x20000000L;
    private static final long OPT_BIT_SUB_TYPE = 0x40000000L;
    private static final long OPT_BIT_TOTAL = 0x80000000L;
    private long initBits = 0xfL;
    private long optBits;

    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable Attachment form;
    private @Nullable String disposition;
    private @Nullable CodeableConcept type;
    private @Nullable Reference patient;
    private @Nullable List<Reference> communicationRequest;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ClaimResponse_Adjudication> adjudication;
    private @Nullable Reference insurer;
    private @Nullable CodeableConcept formCode;
    private @Nullable List<ClaimResponse_Error> error;
    private @Nullable List<ClaimResponse_ProcessNote> processNote;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<ClaimResponse_AddItem> addItem;
    private @Nullable DateTime created;
    private @Nullable Code outcome;
    private @Nullable Narrative text;
    private @Nullable List<ClaimResponse_Item> item;
    private @Nullable Uri implicitRules;
    private @Nullable Id id;
    private @Nullable CodeableConcept payeeType;
    private @Nullable List<ResourceList> contained;
    private @Nullable Period preAuthPeriod;
    private @Nullable Code language;
    private @Nullable String preAuthRef;
    private @Nullable CodeableConcept fundsReserve;
    private @Nullable Reference requestor;
    private @Nullable List<Extension> extension;
    private @Nullable Code status;
    private @Nullable Reference request;
    private @Nullable List<ClaimResponse_Insurance> insurance;
    private @Nullable Code use;
    private @Nullable ClaimResponse_Payment payment;
    private @Nullable CodeableConcept subType;
    private @Nullable List<ClaimResponse_Total> total;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ClaimResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    public final Builder form(Attachment form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = Objects.requireNonNull(form, "form");
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("form")
    public final Builder form(Optional<? extends Attachment> form) {
      checkNotIsSet(formIsSet(), "form");
      this.form = form.orElse(null);
      optBits |= OPT_BIT_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    public final Builder disposition(String disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = Objects.requireNonNull(disposition, "disposition");
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("disposition")
    public final Builder disposition(Optional<String> disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = disposition.orElse(null);
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder communicationRequest(List<Reference> communicationRequest) {
      checkNotIsSet(communicationRequestIsSet(), "communicationRequest");
      this.communicationRequest = Objects.requireNonNull(communicationRequest, "communicationRequest");
      optBits |= OPT_BIT_COMMUNICATION_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("communicationRequest")
    public final Builder communicationRequest(Optional<? extends List<Reference>> communicationRequest) {
      checkNotIsSet(communicationRequestIsSet(), "communicationRequest");
      this.communicationRequest = communicationRequest.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(List<ClaimResponse_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("adjudication")
    public final Builder adjudication(Optional<? extends List<ClaimResponse_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ClaimResponse#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurer")
    public final Builder insurer(Reference insurer) {
      checkNotIsSet(insurerIsSet(), "insurer");
      this.insurer = Objects.requireNonNull(insurer, "insurer");
      initBits &= ~INIT_BIT_INSURER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder formCode(CodeableConcept formCode) {
      checkNotIsSet(formCodeIsSet(), "formCode");
      this.formCode = Objects.requireNonNull(formCode, "formCode");
      optBits |= OPT_BIT_FORM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("formCode")
    public final Builder formCode(Optional<? extends CodeableConcept> formCode) {
      checkNotIsSet(formCodeIsSet(), "formCode");
      this.formCode = formCode.orElse(null);
      optBits |= OPT_BIT_FORM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    public final Builder error(List<ClaimResponse_Error> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = Objects.requireNonNull(error, "error");
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("error")
    public final Builder error(Optional<? extends List<ClaimResponse_Error>> error) {
      checkNotIsSet(errorIsSet(), "error");
      this.error = error.orElse(null);
      optBits |= OPT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    public final Builder processNote(List<ClaimResponse_ProcessNote> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = Objects.requireNonNull(processNote, "processNote");
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("processNote")
    public final Builder processNote(Optional<? extends List<ClaimResponse_ProcessNote>> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = processNote.orElse(null);
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder addItem(List<ClaimResponse_AddItem> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = Objects.requireNonNull(addItem, "addItem");
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addItem")
    public final Builder addItem(Optional<? extends List<ClaimResponse_AddItem>> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = addItem.orElse(null);
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(DateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("created")
    public final Builder created(Optional<? extends DateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(Code outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends Code> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<ClaimResponse_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<ClaimResponse_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for chained invocation
     */
    public final Builder payeeType(CodeableConcept payeeType) {
      checkNotIsSet(payeeTypeIsSet(), "payeeType");
      this.payeeType = Objects.requireNonNull(payeeType, "payeeType");
      optBits |= OPT_BIT_PAYEE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payeeType")
    public final Builder payeeType(Optional<? extends CodeableConcept> payeeType) {
      checkNotIsSet(payeeTypeIsSet(), "payeeType");
      this.payeeType = payeeType.orElse(null);
      optBits |= OPT_BIT_PAYEE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthPeriod(Period preAuthPeriod) {
      checkNotIsSet(preAuthPeriodIsSet(), "preAuthPeriod");
      this.preAuthPeriod = Objects.requireNonNull(preAuthPeriod, "preAuthPeriod");
      optBits |= OPT_BIT_PRE_AUTH_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preAuthPeriod")
    public final Builder preAuthPeriod(Optional<? extends Period> preAuthPeriod) {
      checkNotIsSet(preAuthPeriodIsSet(), "preAuthPeriod");
      this.preAuthPeriod = preAuthPeriod.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(String preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preAuthRef")
    public final Builder preAuthRef(Optional<String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    public final Builder fundsReserve(CodeableConcept fundsReserve) {
      checkNotIsSet(fundsReserveIsSet(), "fundsReserve");
      this.fundsReserve = Objects.requireNonNull(fundsReserve, "fundsReserve");
      optBits |= OPT_BIT_FUNDS_RESERVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fundsReserve")
    public final Builder fundsReserve(Optional<? extends CodeableConcept> fundsReserve) {
      checkNotIsSet(fundsReserveIsSet(), "fundsReserve");
      this.fundsReserve = fundsReserve.orElse(null);
      optBits |= OPT_BIT_FUNDS_RESERVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestor(Reference requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = Objects.requireNonNull(requestor, "requestor");
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestor")
    public final Builder requestor(Optional<? extends Reference> requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = requestor.orElse(null);
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(List<ClaimResponse_Insurance> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurance")
    public final Builder insurance(Optional<? extends List<ClaimResponse_Insurance>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(Code use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends Code> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    public final Builder payment(ClaimResponse_Payment payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = Objects.requireNonNull(payment, "payment");
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payment")
    public final Builder payment(Optional<? extends ClaimResponse_Payment> payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = payment.orElse(null);
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subType(CodeableConcept subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = Objects.requireNonNull(subType, "subType");
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subType")
    public final Builder subType(Optional<? extends CodeableConcept> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = subType.orElse(null);
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(List<ClaimResponse_Total> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("total")
    public final Builder total(Optional<? extends List<ClaimResponse_Total>> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Builds a new {@link ClaimResponse ClaimResponse}.
     * @return An immutable instance of ClaimResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse(
          resourceType,
          meta,
          form,
          disposition,
          type,
          patient,
          communicationRequest,
          modifierExtension,
          adjudication,
          insurer,
          formCode,
          error,
          processNote,
          identifier,
          addItem,
          created,
          outcome,
          text,
          item,
          implicitRules,
          id,
          payeeType,
          contained,
          preAuthPeriod,
          language,
          preAuthRef,
          fundsReserve,
          requestor,
          extension,
          status,
          request,
          insurance,
          use,
          payment,
          subType,
          total);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean formIsSet() {
      return (optBits & OPT_BIT_FORM) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean communicationRequestIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION_REQUEST) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean formCodeIsSet() {
      return (optBits & OPT_BIT_FORM_CODE) != 0;
    }

    private boolean errorIsSet() {
      return (optBits & OPT_BIT_ERROR) != 0;
    }

    private boolean processNoteIsSet() {
      return (optBits & OPT_BIT_PROCESS_NOTE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean addItemIsSet() {
      return (optBits & OPT_BIT_ADD_ITEM) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean payeeTypeIsSet() {
      return (optBits & OPT_BIT_PAYEE_TYPE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean preAuthPeriodIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_PERIOD) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean fundsReserveIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE) != 0;
    }

    private boolean requestorIsSet() {
      return (optBits & OPT_BIT_REQUESTOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean paymentIsSet() {
      return (optBits & OPT_BIT_PAYMENT) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean insurerIsSet() {
      return (initBits & INIT_BIT_INSURER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!typeIsSet()) attributes.add("type");
      if (!patientIsSet()) attributes.add("patient");
      if (!insurerIsSet()) attributes.add("insurer");
      return "Cannot build ClaimResponse, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClaimResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ClaimResponse", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage type(CodeableConcept type);
  }

  @Generated(from = "ClaimResponse", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    InsurerBuildStage patient(Reference patient);
  }

  @Generated(from = "ClaimResponse", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurer(Reference insurer);
  }

  @Generated(from = "ClaimResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ClaimResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    BuildFinal form(Attachment form);

    /**
     * Initializes the optional value {@link ClaimResponse#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal form(Optional<? extends Attachment> form);

    /**
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(String disposition);

    /**
     * Initializes the optional value {@link ClaimResponse#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(Optional<String> disposition);

    /**
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal communicationRequest(List<Reference> communicationRequest);

    /**
     * Initializes the optional value {@link ClaimResponse#communicationRequest() communicationRequest} to communicationRequest.
     * @param communicationRequest The value for communicationRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal communicationRequest(Optional<? extends List<Reference>> communicationRequest);

    /**
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(List<ClaimResponse_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ClaimResponse#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(Optional<? extends List<ClaimResponse_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal formCode(CodeableConcept formCode);

    /**
     * Initializes the optional value {@link ClaimResponse#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal formCode(Optional<? extends CodeableConcept> formCode);

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for chained invocation
     */
    BuildFinal error(List<ClaimResponse_Error> error);

    /**
     * Initializes the optional value {@link ClaimResponse#error() error} to error.
     * @param error The value for error
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal error(Optional<? extends List<ClaimResponse_Error>> error);

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processNote(List<ClaimResponse_ProcessNote> processNote);

    /**
     * Initializes the optional value {@link ClaimResponse#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processNote(Optional<? extends List<ClaimResponse_ProcessNote>> processNote);

    /**
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ClaimResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addItem(List<ClaimResponse_AddItem> addItem);

    /**
     * Initializes the optional value {@link ClaimResponse#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(Optional<? extends List<ClaimResponse_AddItem>> addItem);

    /**
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link ClaimResponse#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(Code outcome);

    /**
     * Initializes the optional value {@link ClaimResponse#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends Code> outcome);

    /**
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ClaimResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(List<ClaimResponse_Item> item);

    /**
     * Initializes the optional value {@link ClaimResponse#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Optional<? extends List<ClaimResponse_Item>> item);

    /**
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ClaimResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ClaimResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payeeType(CodeableConcept payeeType);

    /**
     * Initializes the optional value {@link ClaimResponse#payeeType() payeeType} to payeeType.
     * @param payeeType The value for payeeType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payeeType(Optional<? extends CodeableConcept> payeeType);

    /**
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ClaimResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthPeriod(Period preAuthPeriod);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthPeriod() preAuthPeriod} to preAuthPeriod.
     * @param preAuthPeriod The value for preAuthPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthPeriod(Optional<? extends Period> preAuthPeriod);

    /**
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ClaimResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(String preAuthRef);

    /**
     * Initializes the optional value {@link ClaimResponse#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(Optional<String> preAuthRef);

    /**
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserve(CodeableConcept fundsReserve);

    /**
     * Initializes the optional value {@link ClaimResponse#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserve(Optional<? extends CodeableConcept> fundsReserve);

    /**
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestor(Reference requestor);

    /**
     * Initializes the optional value {@link ClaimResponse#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestor(Optional<? extends Reference> requestor);

    /**
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link ClaimResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(Reference request);

    /**
     * Initializes the optional value {@link ClaimResponse#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends Reference> request);

    /**
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(List<ClaimResponse_Insurance> insurance);

    /**
     * Initializes the optional value {@link ClaimResponse#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(Optional<? extends List<ClaimResponse_Insurance>> insurance);

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    BuildFinal use(Code use);

    /**
     * Initializes the optional value {@link ClaimResponse#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal use(Optional<? extends Code> use);

    /**
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payment(ClaimResponse_Payment payment);

    /**
     * Initializes the optional value {@link ClaimResponse#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payment(Optional<? extends ClaimResponse_Payment> payment);

    /**
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(CodeableConcept subType);

    /**
     * Initializes the optional value {@link ClaimResponse#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(Optional<? extends CodeableConcept> subType);

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(List<ClaimResponse_Total> total);

    /**
     * Initializes the optional value {@link ClaimResponse#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(Optional<? extends List<ClaimResponse_Total>> total);

    /**
     * Builds a new {@link ClaimResponse ClaimResponse}.
     * @return An immutable instance of ClaimResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse build();
  }
}