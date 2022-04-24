//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExplanationOfBenefit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit.builder()}.
 */
@org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit implements com.fhir.ExplanationOfBenefit {
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Period> preAuthRefPeriod;
  private final @javax.annotation.Nullable com.fhir.code use;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Total> total;
  private final @javax.annotation.Nullable com.fhir.Reference originalPrescription;
  private final @javax.annotation.Nullable com.fhir.Reference claim;
  private final java.util.List<com.fhir.ExplanationOfBenefit_Insurance> insurance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final com.fhir.Reference insurer;
  private final @javax.annotation.Nullable com.fhir.Period benefitPeriod;
  private final @javax.annotation.Nullable com.fhir.code outcome;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> careTeam;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> processNote;
  private final @javax.annotation.Nullable com.fhir.positiveInt precedence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Item> item;
  private final @javax.annotation.Nullable com.fhir.Reference claimResponse;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> supportingInfo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Procedure> procedure;
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Reference enterer;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Related> related;
  private final @javax.annotation.Nullable com.fhir.Reference facility;
  private final @javax.annotation.Nullable com.fhir.Period billablePeriod;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept formCode;
  private final com.fhir.Reference provider;
  private final @javax.annotation.Nullable com.fhir.Reference prescription;
  private final @javax.annotation.Nullable com.fhir.ExplanationofbenefitStatus status;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subType;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserveRequested;
  private final @javax.annotation.Nullable com.fhir.Attachment form;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_AddItem> addItem;
  private final @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payment payment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> diagnosis;
  private final com.fhir.Reference patient;
  private final @javax.annotation.Nullable java.lang.String disposition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> benefitBalance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> preAuthRef;
  private final @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payee payee;
  private final @javax.annotation.Nullable com.fhir.Reference referral;
  private final @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Accident accident;

  private ImmutableExplanationOfBenefit(
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Period> preAuthRefPeriod,
      @javax.annotation.Nullable com.fhir.code use,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Total> total,
      @javax.annotation.Nullable com.fhir.Reference originalPrescription,
      @javax.annotation.Nullable com.fhir.Reference claim,
      java.util.List<com.fhir.ExplanationOfBenefit_Insurance> insurance,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime created,
      com.fhir.Reference insurer,
      @javax.annotation.Nullable com.fhir.Period benefitPeriod,
      @javax.annotation.Nullable com.fhir.code outcome,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> careTeam,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> processNote,
      @javax.annotation.Nullable com.fhir.positiveInt precedence,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Item> item,
      @javax.annotation.Nullable com.fhir.Reference claimResponse,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> supportingInfo,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Procedure> procedure,
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Reference enterer,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Related> related,
      @javax.annotation.Nullable com.fhir.Reference facility,
      @javax.annotation.Nullable com.fhir.Period billablePeriod,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept formCode,
      com.fhir.Reference provider,
      @javax.annotation.Nullable com.fhir.Reference prescription,
      @javax.annotation.Nullable com.fhir.ExplanationofbenefitStatus status,
      @javax.annotation.Nullable com.fhir.CodeableConcept priority,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.CodeableConcept subType,
      @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserveRequested,
      @javax.annotation.Nullable com.fhir.Attachment form,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_AddItem> addItem,
      @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payment payment,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> diagnosis,
      com.fhir.Reference patient,
      @javax.annotation.Nullable java.lang.String disposition,
      @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> benefitBalance,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<java.lang.String> preAuthRef,
      @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payee payee,
      @javax.annotation.Nullable com.fhir.Reference referral,
      @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Accident accident) {
    this.id = id;
    this.preAuthRefPeriod = preAuthRefPeriod;
    this.use = use;
    this.implicitRules = implicitRules;
    this.fundsReserve = fundsReserve;
    this.language = language;
    this.total = total;
    this.originalPrescription = originalPrescription;
    this.claim = claim;
    this.insurance = insurance;
    this.modifierExtension = modifierExtension;
    this.created = created;
    this.insurer = insurer;
    this.benefitPeriod = benefitPeriod;
    this.outcome = outcome;
    this.careTeam = careTeam;
    this.processNote = processNote;
    this.precedence = precedence;
    this.item = item;
    this.claimResponse = claimResponse;
    this.meta = meta;
    this.identifier = identifier;
    this.supportingInfo = supportingInfo;
    this.procedure = procedure;
    this.type = type;
    this.enterer = enterer;
    this.resourceType = resourceType;
    this.adjudication = adjudication;
    this.related = related;
    this.facility = facility;
    this.billablePeriod = billablePeriod;
    this.text = text;
    this.formCode = formCode;
    this.provider = provider;
    this.prescription = prescription;
    this.status = status;
    this.priority = priority;
    this.contained = contained;
    this.subType = subType;
    this.fundsReserveRequested = fundsReserveRequested;
    this.form = form;
    this.addItem = addItem;
    this.payment = payment;
    this.diagnosis = diagnosis;
    this.patient = patient;
    this.disposition = disposition;
    this.benefitBalance = benefitBalance;
    this.extension = extension;
    this.preAuthRef = preAuthRef;
    this.payee = payee;
    this.referral = referral;
    this.accident = accident;
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
   * @return The value of the {@code preAuthRefPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preAuthRefPeriod")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Period>> preAuthRefPeriod() {
    return java.util.Optional.ofNullable(preAuthRefPeriod);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("total")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Total>> total() {
    return java.util.Optional.ofNullable(total);
  }

  /**
   * @return The value of the {@code originalPrescription} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("originalPrescription")
  @Override
  public java.util.Optional<com.fhir.Reference> originalPrescription() {
    return java.util.Optional.ofNullable(originalPrescription);
  }

  /**
   * @return The value of the {@code claim} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("claim")
  @Override
  public java.util.Optional<com.fhir.Reference> claim() {
    return java.util.Optional.ofNullable(claim);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurance")
  @Override
  public java.util.List<com.fhir.ExplanationOfBenefit_Insurance> insurance() {
    return insurance;
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
   * @return The value of the {@code created} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("created")
  @Override
  public java.util.Optional<com.fhir.dateTime> created() {
    return java.util.Optional.ofNullable(created);
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
   * @return The value of the {@code benefitPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("benefitPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> benefitPeriod() {
    return java.util.Optional.ofNullable(benefitPeriod);
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
   * @return The value of the {@code careTeam} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_CareTeam>> careTeam() {
    return java.util.Optional.ofNullable(careTeam);
  }

  /**
   * @return The value of the {@code processNote} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("processNote")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote>> processNote() {
    return java.util.Optional.ofNullable(processNote);
  }

  /**
   * @return The value of the {@code precedence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("precedence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> precedence() {
    return java.util.Optional.ofNullable(precedence);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Item>> item() {
    return java.util.Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code claimResponse} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("claimResponse")
  @Override
  public java.util.Optional<com.fhir.Reference> claimResponse() {
    return java.util.Optional.ofNullable(claimResponse);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo>> supportingInfo() {
    return java.util.Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code procedure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedure")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Procedure>> procedure() {
    return java.util.Optional.ofNullable(procedure);
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
   * @return The value of the {@code enterer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enterer")
  @Override
  public java.util.Optional<com.fhir.Reference> enterer() {
    return java.util.Optional.ofNullable(enterer);
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
   * @return The value of the {@code adjudication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication() {
    return java.util.Optional.ofNullable(adjudication);
  }

  /**
   * @return The value of the {@code related} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("related")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Related>> related() {
    return java.util.Optional.ofNullable(related);
  }

  /**
   * @return The value of the {@code facility} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("facility")
  @Override
  public java.util.Optional<com.fhir.Reference> facility() {
    return java.util.Optional.ofNullable(facility);
  }

  /**
   * @return The value of the {@code billablePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("billablePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> billablePeriod() {
    return java.util.Optional.ofNullable(billablePeriod);
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
   * @return The value of the {@code formCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("formCode")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> formCode() {
    return java.util.Optional.ofNullable(formCode);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("provider")
  @Override
  public com.fhir.Reference provider() {
    return provider;
  }

  /**
   * @return The value of the {@code prescription} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prescription")
  @Override
  public java.util.Optional<com.fhir.Reference> prescription() {
    return java.util.Optional.ofNullable(prescription);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ExplanationofbenefitStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code subType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> subType() {
    return java.util.Optional.ofNullable(subType);
  }

  /**
   * @return The value of the {@code fundsReserveRequested} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fundsReserveRequested")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> fundsReserveRequested() {
    return java.util.Optional.ofNullable(fundsReserveRequested);
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
   * @return The value of the {@code addItem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("addItem")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_AddItem>> addItem() {
    return java.util.Optional.ofNullable(addItem);
  }

  /**
   * @return The value of the {@code payment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payment")
  @Override
  public java.util.Optional<com.fhir.ExplanationOfBenefit_Payment> payment() {
    return java.util.Optional.ofNullable(payment);
  }

  /**
   * @return The value of the {@code diagnosis} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis>> diagnosis() {
    return java.util.Optional.ofNullable(diagnosis);
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
   * @return The value of the {@code disposition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disposition")
  @Override
  public java.util.Optional<java.lang.String> disposition() {
    return java.util.Optional.ofNullable(disposition);
  }

  /**
   * @return The value of the {@code benefitBalance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("benefitBalance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance>> benefitBalance() {
    return java.util.Optional.ofNullable(benefitBalance);
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
   * @return The value of the {@code preAuthRef} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> preAuthRef() {
    return java.util.Optional.ofNullable(preAuthRef);
  }

  /**
   * @return The value of the {@code payee} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payee")
  @Override
  public java.util.Optional<com.fhir.ExplanationOfBenefit_Payee> payee() {
    return java.util.Optional.ofNullable(payee);
  }

  /**
   * @return The value of the {@code referral} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referral")
  @Override
  public java.util.Optional<com.fhir.Reference> referral() {
    return java.util.Optional.ofNullable(referral);
  }

  /**
   * @return The value of the {@code accident} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("accident")
  @Override
  public java.util.Optional<com.fhir.ExplanationOfBenefit_Accident> accident() {
    return java.util.Optional.ofNullable(accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        newValue,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableExplanationOfBenefit(
        value,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} attribute.
   * @param value The value for preAuthRefPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPreAuthRefPeriod(java.util.List<com.fhir.Period> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Period> newValue = java.util.Objects.requireNonNull(value, "preAuthRefPeriod");
    if (this.preAuthRefPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        newValue,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRefPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPreAuthRefPeriod(java.util.Optional<? extends java.util.List<com.fhir.Period>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Period> value = optional.orElse(null);
    if (this.preAuthRefPeriod == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        value,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withUse(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        newValue,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withUse(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        value,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        newValue,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        value,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#fundsReserve() fundsReserve} attribute.
   * @param value The value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFundsReserve(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "fundsReserve");
    if (this.fundsReserve == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        newValue,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#fundsReserve() fundsReserve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFundsReserve(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.fundsReserve == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        value,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        newValue,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        value,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withTotal(java.util.List<com.fhir.ExplanationOfBenefit_Total> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Total> newValue = java.util.Objects.requireNonNull(value, "total");
    if (this.total == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        newValue,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#total() total} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withTotal(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Total>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Total> value = optional.orElse(null);
    if (this.total == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        value,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#originalPrescription() originalPrescription} attribute.
   * @param value The value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withOriginalPrescription(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "originalPrescription");
    if (this.originalPrescription == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        newValue,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#originalPrescription() originalPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for originalPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withOriginalPrescription(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.originalPrescription == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        value,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#claim() claim} attribute.
   * @param value The value for claim
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withClaim(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "claim");
    if (this.claim == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        newValue,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#claim() claim} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claim
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withClaim(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.claim == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        value,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ExplanationOfBenefit#insurance() insurance}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withInsurance(com.fhir.ExplanationOfBenefit_Insurance... elements) {
    java.util.List<com.fhir.ExplanationOfBenefit_Insurance> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        newValue,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ExplanationOfBenefit#insurance() insurance}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of insurance elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withInsurance(Iterable<? extends com.fhir.ExplanationOfBenefit_Insurance> elements) {
    if (this.insurance == elements) return this;
    java.util.List<com.fhir.ExplanationOfBenefit_Insurance> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        newValue,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        newValue,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        value,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        newValue,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        value,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#insurer() insurer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for insurer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withInsurer(com.fhir.Reference value) {
    if (this.insurer == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "insurer");
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        newValue,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} attribute.
   * @param value The value for benefitPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withBenefitPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "benefitPeriod");
    if (this.benefitPeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        newValue,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefitPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withBenefitPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.benefitPeriod == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        value,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withOutcome(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        newValue,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withOutcome(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        value,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#careTeam() careTeam} attribute.
   * @param value The value for careTeam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withCareTeam(java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> newValue = java.util.Objects.requireNonNull(value, "careTeam");
    if (this.careTeam == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        newValue,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#careTeam() careTeam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withCareTeam(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_CareTeam>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> value = optional.orElse(null);
    if (this.careTeam == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        value,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#processNote() processNote} attribute.
   * @param value The value for processNote
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withProcessNote(java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> newValue = java.util.Objects.requireNonNull(value, "processNote");
    if (this.processNote == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        newValue,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#processNote() processNote} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processNote
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withProcessNote(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> value = optional.orElse(null);
    if (this.processNote == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        value,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#precedence() precedence} attribute.
   * @param value The value for precedence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPrecedence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "precedence");
    if (this.precedence == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        newValue,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#precedence() precedence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precedence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPrecedence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.precedence == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        value,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withItem(java.util.List<com.fhir.ExplanationOfBenefit_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        newValue,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withItem(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        value,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#claimResponse() claimResponse} attribute.
   * @param value The value for claimResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withClaimResponse(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "claimResponse");
    if (this.claimResponse == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        newValue,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#claimResponse() claimResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for claimResponse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withClaimResponse(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.claimResponse == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        value,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        newValue,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        value,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        newValue,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        value,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withSupportingInfo(java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        newValue,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        value,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#procedure() procedure} attribute.
   * @param value The value for procedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withProcedure(java.util.List<com.fhir.ExplanationOfBenefit_Procedure> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Procedure> newValue = java.util.Objects.requireNonNull(value, "procedure");
    if (this.procedure == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        newValue,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#procedure() procedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withProcedure(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Procedure>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Procedure> value = optional.orElse(null);
    if (this.procedure == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        value,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        newValue,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withEnterer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        newValue,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withEnterer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        value,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        newValue,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withAdjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> newValue = java.util.Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        newValue,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withAdjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        value,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#related() related} attribute.
   * @param value The value for related
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withRelated(java.util.List<com.fhir.ExplanationOfBenefit_Related> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Related> newValue = java.util.Objects.requireNonNull(value, "related");
    if (this.related == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        newValue,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#related() related} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for related
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withRelated(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Related>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Related> value = optional.orElse(null);
    if (this.related == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        value,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#facility() facility} attribute.
   * @param value The value for facility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFacility(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "facility");
    if (this.facility == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        newValue,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#facility() facility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFacility(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.facility == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        value,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#billablePeriod() billablePeriod} attribute.
   * @param value The value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withBillablePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "billablePeriod");
    if (this.billablePeriod == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        newValue,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#billablePeriod() billablePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for billablePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withBillablePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.billablePeriod == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        value,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        newValue,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        value,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#formCode() formCode} attribute.
   * @param value The value for formCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFormCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "formCode");
    if (this.formCode == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        newValue,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#formCode() formCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for formCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFormCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.formCode == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        value,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#provider() provider} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for provider
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withProvider(com.fhir.Reference value) {
    if (this.provider == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "provider");
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        newValue,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#prescription() prescription} attribute.
   * @param value The value for prescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPrescription(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "prescription");
    if (this.prescription == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        newValue,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#prescription() prescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPrescription(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.prescription == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        value,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withStatus(com.fhir.ExplanationofbenefitStatus value) {
    @javax.annotation.Nullable com.fhir.ExplanationofbenefitStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        newValue,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withStatus(java.util.Optional<? extends com.fhir.ExplanationofbenefitStatus> optional) {
    @javax.annotation.Nullable com.fhir.ExplanationofbenefitStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        value,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPriority(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        newValue,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPriority(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        value,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        newValue,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        value,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withSubType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        newValue,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withSubType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        value,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} attribute.
   * @param value The value for fundsReserveRequested
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withFundsReserveRequested(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "fundsReserveRequested");
    if (this.fundsReserveRequested == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        newValue,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundsReserveRequested
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withFundsReserveRequested(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.fundsReserveRequested == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        value,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#form() form} attribute.
   * @param value The value for form
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withForm(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "form");
    if (this.form == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        newValue,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#form() form} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for form
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withForm(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.form == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        value,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#addItem() addItem} attribute.
   * @param value The value for addItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withAddItem(java.util.List<com.fhir.ExplanationOfBenefit_AddItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_AddItem> newValue = java.util.Objects.requireNonNull(value, "addItem");
    if (this.addItem == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        newValue,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#addItem() addItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withAddItem(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_AddItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_AddItem> value = optional.orElse(null);
    if (this.addItem == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        value,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#payment() payment} attribute.
   * @param value The value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPayment(com.fhir.ExplanationOfBenefit_Payment value) {
    @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payment newValue = java.util.Objects.requireNonNull(value, "payment");
    if (this.payment == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        newValue,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#payment() payment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPayment(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Payment> optional) {
    @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payment value = optional.orElse(null);
    if (this.payment == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        value,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withDiagnosis(java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> newValue = java.util.Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        newValue,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withDiagnosis(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        value,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        newValue,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withDisposition(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "disposition");
    if (java.util.Objects.equals(this.disposition, newValue)) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        newValue,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withDisposition(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.disposition, value)) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        value,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#benefitBalance() benefitBalance} attribute.
   * @param value The value for benefitBalance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withBenefitBalance(java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> newValue = java.util.Objects.requireNonNull(value, "benefitBalance");
    if (this.benefitBalance == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        newValue,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#benefitBalance() benefitBalance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for benefitBalance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withBenefitBalance(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> value = optional.orElse(null);
    if (this.benefitBalance == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        value,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        newValue,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        value,
        this.preAuthRef,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#preAuthRef() preAuthRef} attribute.
   * @param value The value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPreAuthRef(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "preAuthRef");
    if (this.preAuthRef == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        newValue,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#preAuthRef() preAuthRef} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preAuthRef
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPreAuthRef(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.preAuthRef == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        value,
        this.payee,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withPayee(com.fhir.ExplanationOfBenefit_Payee value) {
    @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payee newValue = java.util.Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        newValue,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withPayee(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Payee> optional) {
    @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payee value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        value,
        this.referral,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#referral() referral} attribute.
   * @param value The value for referral
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withReferral(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "referral");
    if (this.referral == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        newValue,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#referral() referral} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referral
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withReferral(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.referral == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        value,
        this.accident);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit#accident() accident} attribute.
   * @param value The value for accident
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit withAccident(com.fhir.ExplanationOfBenefit_Accident value) {
    @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Accident newValue = java.util.Objects.requireNonNull(value, "accident");
    if (this.accident == newValue) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit#accident() accident} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accident
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit withAccident(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Accident> optional) {
    @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Accident value = optional.orElse(null);
    if (this.accident == value) return this;
    return new ImmutableExplanationOfBenefit(
        this.id,
        this.preAuthRefPeriod,
        this.use,
        this.implicitRules,
        this.fundsReserve,
        this.language,
        this.total,
        this.originalPrescription,
        this.claim,
        this.insurance,
        this.modifierExtension,
        this.created,
        this.insurer,
        this.benefitPeriod,
        this.outcome,
        this.careTeam,
        this.processNote,
        this.precedence,
        this.item,
        this.claimResponse,
        this.meta,
        this.identifier,
        this.supportingInfo,
        this.procedure,
        this.type,
        this.enterer,
        this.resourceType,
        this.adjudication,
        this.related,
        this.facility,
        this.billablePeriod,
        this.text,
        this.formCode,
        this.provider,
        this.prescription,
        this.status,
        this.priority,
        this.contained,
        this.subType,
        this.fundsReserveRequested,
        this.form,
        this.addItem,
        this.payment,
        this.diagnosis,
        this.patient,
        this.disposition,
        this.benefitBalance,
        this.extension,
        this.preAuthRef,
        this.payee,
        this.referral,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit
        && equalTo((ImmutableExplanationOfBenefit) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(preAuthRefPeriod, another.preAuthRefPeriod)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(fundsReserve, another.fundsReserve)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(total, another.total)
        && java.util.Objects.equals(originalPrescription, another.originalPrescription)
        && java.util.Objects.equals(claim, another.claim)
        && insurance.equals(another.insurance)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(created, another.created)
        && insurer.equals(another.insurer)
        && java.util.Objects.equals(benefitPeriod, another.benefitPeriod)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(careTeam, another.careTeam)
        && java.util.Objects.equals(processNote, another.processNote)
        && java.util.Objects.equals(precedence, another.precedence)
        && java.util.Objects.equals(item, another.item)
        && java.util.Objects.equals(claimResponse, another.claimResponse)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(procedure, another.procedure)
        && type.equals(another.type)
        && java.util.Objects.equals(enterer, another.enterer)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(adjudication, another.adjudication)
        && java.util.Objects.equals(related, another.related)
        && java.util.Objects.equals(facility, another.facility)
        && java.util.Objects.equals(billablePeriod, another.billablePeriod)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(formCode, another.formCode)
        && provider.equals(another.provider)
        && java.util.Objects.equals(prescription, another.prescription)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(subType, another.subType)
        && java.util.Objects.equals(fundsReserveRequested, another.fundsReserveRequested)
        && java.util.Objects.equals(form, another.form)
        && java.util.Objects.equals(addItem, another.addItem)
        && java.util.Objects.equals(payment, another.payment)
        && java.util.Objects.equals(diagnosis, another.diagnosis)
        && patient.equals(another.patient)
        && java.util.Objects.equals(disposition, another.disposition)
        && java.util.Objects.equals(benefitBalance, another.benefitBalance)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(preAuthRef, another.preAuthRef)
        && java.util.Objects.equals(payee, another.payee)
        && java.util.Objects.equals(referral, another.referral)
        && java.util.Objects.equals(accident, another.accident);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code preAuthRefPeriod}, {@code use}, {@code implicitRules}, {@code fundsReserve}, {@code language}, {@code total}, {@code originalPrescription}, {@code claim}, {@code insurance}, {@code modifierExtension}, {@code created}, {@code insurer}, {@code benefitPeriod}, {@code outcome}, {@code careTeam}, {@code processNote}, {@code precedence}, {@code item}, {@code claimResponse}, {@code meta}, {@code identifier}, {@code supportingInfo}, {@code procedure}, {@code type}, {@code enterer}, {@code resourceType}, {@code adjudication}, {@code related}, {@code facility}, {@code billablePeriod}, {@code text}, {@code formCode}, {@code provider}, {@code prescription}, {@code status}, {@code priority}, {@code contained}, {@code subType}, {@code fundsReserveRequested}, {@code form}, {@code addItem}, {@code payment}, {@code diagnosis}, {@code patient}, {@code disposition}, {@code benefitBalance}, {@code extension}, {@code preAuthRef}, {@code payee}, {@code referral}, {@code accident}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(preAuthRefPeriod);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(fundsReserve);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(total);
    h += (h << 5) + java.util.Objects.hashCode(originalPrescription);
    h += (h << 5) + java.util.Objects.hashCode(claim);
    h += (h << 5) + insurance.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + insurer.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(benefitPeriod);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(careTeam);
    h += (h << 5) + java.util.Objects.hashCode(processNote);
    h += (h << 5) + java.util.Objects.hashCode(precedence);
    h += (h << 5) + java.util.Objects.hashCode(item);
    h += (h << 5) + java.util.Objects.hashCode(claimResponse);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(procedure);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(enterer);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(adjudication);
    h += (h << 5) + java.util.Objects.hashCode(related);
    h += (h << 5) + java.util.Objects.hashCode(facility);
    h += (h << 5) + java.util.Objects.hashCode(billablePeriod);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(formCode);
    h += (h << 5) + provider.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(prescription);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(subType);
    h += (h << 5) + java.util.Objects.hashCode(fundsReserveRequested);
    h += (h << 5) + java.util.Objects.hashCode(form);
    h += (h << 5) + java.util.Objects.hashCode(addItem);
    h += (h << 5) + java.util.Objects.hashCode(payment);
    h += (h << 5) + java.util.Objects.hashCode(diagnosis);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(disposition);
    h += (h << 5) + java.util.Objects.hashCode(benefitBalance);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(preAuthRef);
    h += (h << 5) + java.util.Objects.hashCode(payee);
    h += (h << 5) + java.util.Objects.hashCode(referral);
    h += (h << 5) + java.util.Objects.hashCode(accident);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExplanationOfBenefit{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (preAuthRefPeriod != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("preAuthRefPeriod=").append(preAuthRefPeriod);
    }
    if (use != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (implicitRules != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (fundsReserve != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("fundsReserve=").append(fundsReserve);
    }
    if (language != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (total != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("total=").append(total);
    }
    if (originalPrescription != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("originalPrescription=").append(originalPrescription);
    }
    if (claim != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("claim=").append(claim);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("insurance=").append(insurance);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    builder.append(", ");
    builder.append("insurer=").append(insurer);
    if (benefitPeriod != null) {
      builder.append(", ");
      builder.append("benefitPeriod=").append(benefitPeriod);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (careTeam != null) {
      builder.append(", ");
      builder.append("careTeam=").append(careTeam);
    }
    if (processNote != null) {
      builder.append(", ");
      builder.append("processNote=").append(processNote);
    }
    if (precedence != null) {
      builder.append(", ");
      builder.append("precedence=").append(precedence);
    }
    if (item != null) {
      builder.append(", ");
      builder.append("item=").append(item);
    }
    if (claimResponse != null) {
      builder.append(", ");
      builder.append("claimResponse=").append(claimResponse);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (procedure != null) {
      builder.append(", ");
      builder.append("procedure=").append(procedure);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    if (related != null) {
      builder.append(", ");
      builder.append("related=").append(related);
    }
    if (facility != null) {
      builder.append(", ");
      builder.append("facility=").append(facility);
    }
    if (billablePeriod != null) {
      builder.append(", ");
      builder.append("billablePeriod=").append(billablePeriod);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (formCode != null) {
      builder.append(", ");
      builder.append("formCode=").append(formCode);
    }
    builder.append(", ");
    builder.append("provider=").append(provider);
    if (prescription != null) {
      builder.append(", ");
      builder.append("prescription=").append(prescription);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (fundsReserveRequested != null) {
      builder.append(", ");
      builder.append("fundsReserveRequested=").append(fundsReserveRequested);
    }
    if (form != null) {
      builder.append(", ");
      builder.append("form=").append(form);
    }
    if (addItem != null) {
      builder.append(", ");
      builder.append("addItem=").append(addItem);
    }
    if (payment != null) {
      builder.append(", ");
      builder.append("payment=").append(payment);
    }
    if (diagnosis != null) {
      builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (disposition != null) {
      builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (benefitBalance != null) {
      builder.append(", ");
      builder.append("benefitBalance=").append(benefitBalance);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (preAuthRef != null) {
      builder.append(", ");
      builder.append("preAuthRef=").append(preAuthRef);
    }
    if (payee != null) {
      builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (referral != null) {
      builder.append(", ");
      builder.append("referral=").append(referral);
    }
    if (accident != null) {
      builder.append(", ");
      builder.append("accident=").append(accident);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExplanationOfBenefit {
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Period>> preAuthRefPeriod = java.util.Optional.empty();
    boolean preAuthRefPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> fundsReserve = java.util.Optional.empty();
    boolean fundsReserveIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Total>> total = java.util.Optional.empty();
    boolean totalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> originalPrescription = java.util.Optional.empty();
    boolean originalPrescriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> claim = java.util.Optional.empty();
    boolean claimIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Insurance> insurance = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable com.fhir.Reference insurer;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> benefitPeriod = java.util.Optional.empty();
    boolean benefitPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_CareTeam>> careTeam = java.util.Optional.empty();
    boolean careTeamIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote>> processNote = java.util.Optional.empty();
    boolean processNoteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> precedence = java.util.Optional.empty();
    boolean precedenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> claimResponse = java.util.Optional.empty();
    boolean claimResponseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Procedure>> procedure = java.util.Optional.empty();
    boolean procedureIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> enterer = java.util.Optional.empty();
    boolean entererIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication = java.util.Optional.empty();
    boolean adjudicationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Related>> related = java.util.Optional.empty();
    boolean relatedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> facility = java.util.Optional.empty();
    boolean facilityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> billablePeriod = java.util.Optional.empty();
    boolean billablePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> formCode = java.util.Optional.empty();
    boolean formCodeIsSet;
    @javax.annotation.Nullable com.fhir.Reference provider;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> prescription = java.util.Optional.empty();
    boolean prescriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ExplanationofbenefitStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subType = java.util.Optional.empty();
    boolean subTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> fundsReserveRequested = java.util.Optional.empty();
    boolean fundsReserveRequestedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> form = java.util.Optional.empty();
    boolean formIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_AddItem>> addItem = java.util.Optional.empty();
    boolean addItemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ExplanationOfBenefit_Payment> payment = java.util.Optional.empty();
    boolean paymentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis>> diagnosis = java.util.Optional.empty();
    boolean diagnosisIsSet;
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> disposition = java.util.Optional.empty();
    boolean dispositionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance>> benefitBalance = java.util.Optional.empty();
    boolean benefitBalanceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> preAuthRef = java.util.Optional.empty();
    boolean preAuthRefIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ExplanationOfBenefit_Payee> payee = java.util.Optional.empty();
    boolean payeeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> referral = java.util.Optional.empty();
    boolean referralIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ExplanationOfBenefit_Accident> accident = java.util.Optional.empty();
    boolean accidentIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRefPeriod")
    public void setPreAuthRefPeriod(java.util.Optional<java.util.List<com.fhir.Period>> preAuthRefPeriod) {
      this.preAuthRefPeriod = preAuthRefPeriod;
      this.preAuthRefPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.code> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fundsReserve")
    public void setFundsReserve(java.util.Optional<com.fhir.CodeableConcept> fundsReserve) {
      this.fundsReserve = fundsReserve;
      this.fundsReserveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public void setTotal(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Total>> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("originalPrescription")
    public void setOriginalPrescription(java.util.Optional<com.fhir.Reference> originalPrescription) {
      this.originalPrescription = originalPrescription;
      this.originalPrescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("claim")
    public void setClaim(java.util.Optional<com.fhir.Reference> claim) {
      this.claim = claim;
      this.claimIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.List<com.fhir.ExplanationOfBenefit_Insurance> insurance) {
      this.insurance = insurance;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurer")
    public void setInsurer(com.fhir.Reference insurer) {
      this.insurer = insurer;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("benefitPeriod")
    public void setBenefitPeriod(java.util.Optional<com.fhir.Period> benefitPeriod) {
      this.benefitPeriod = benefitPeriod;
      this.benefitPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.code> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
    public void setCareTeam(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_CareTeam>> careTeam) {
      this.careTeam = careTeam;
      this.careTeamIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("processNote")
    public void setProcessNote(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote>> processNote) {
      this.processNote = processNote;
      this.processNoteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("precedence")
    public void setPrecedence(java.util.Optional<com.fhir.positiveInt> precedence) {
      this.precedence = precedence;
      this.precedenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("claimResponse")
    public void setClaimResponse(java.util.Optional<com.fhir.Reference> claimResponse) {
      this.claimResponse = claimResponse;
      this.claimResponseIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedure")
    public void setProcedure(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Procedure>> procedure) {
      this.procedure = procedure;
      this.procedureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public void setEnterer(java.util.Optional<com.fhir.Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public void setAdjudication(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("related")
    public void setRelated(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Related>> related) {
      this.related = related;
      this.relatedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("facility")
    public void setFacility(java.util.Optional<com.fhir.Reference> facility) {
      this.facility = facility;
      this.facilityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("billablePeriod")
    public void setBillablePeriod(java.util.Optional<com.fhir.Period> billablePeriod) {
      this.billablePeriod = billablePeriod;
      this.billablePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("formCode")
    public void setFormCode(java.util.Optional<com.fhir.CodeableConcept> formCode) {
      this.formCode = formCode;
      this.formCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public void setProvider(com.fhir.Reference provider) {
      this.provider = provider;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prescription")
    public void setPrescription(java.util.Optional<com.fhir.Reference> prescription) {
      this.prescription = prescription;
      this.prescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ExplanationofbenefitStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public void setSubType(java.util.Optional<com.fhir.CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fundsReserveRequested")
    public void setFundsReserveRequested(java.util.Optional<com.fhir.CodeableConcept> fundsReserveRequested) {
      this.fundsReserveRequested = fundsReserveRequested;
      this.fundsReserveRequestedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("form")
    public void setForm(java.util.Optional<com.fhir.Attachment> form) {
      this.form = form;
      this.formIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("addItem")
    public void setAddItem(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_AddItem>> addItem) {
      this.addItem = addItem;
      this.addItemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public void setPayment(java.util.Optional<com.fhir.ExplanationOfBenefit_Payment> payment) {
      this.payment = payment;
      this.paymentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public void setDiagnosis(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("disposition")
    public void setDisposition(java.util.Optional<java.lang.String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("benefitBalance")
    public void setBenefitBalance(java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance>> benefitBalance) {
      this.benefitBalance = benefitBalance;
      this.benefitBalanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public void setPreAuthRef(java.util.Optional<java.util.List<java.lang.String>> preAuthRef) {
      this.preAuthRef = preAuthRef;
      this.preAuthRefIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payee")
    public void setPayee(java.util.Optional<com.fhir.ExplanationOfBenefit_Payee> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referral")
    public void setReferral(java.util.Optional<com.fhir.Reference> referral) {
      this.referral = referral;
      this.referralIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("accident")
    public void setAccident(java.util.Optional<com.fhir.ExplanationOfBenefit_Accident> accident) {
      this.accident = accident;
      this.accidentIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Period>> preAuthRefPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> fundsReserve() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Total>> total() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> originalPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> claim() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.ExplanationOfBenefit_Insurance> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference insurer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> benefitPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_CareTeam>> careTeam() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote>> processNote() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> precedence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> claimResponse() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Procedure>> procedure() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Related>> related() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> facility() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> billablePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> formCode() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference provider() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> prescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ExplanationofbenefitStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> fundsReserveRequested() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> form() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_AddItem>> addItem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ExplanationOfBenefit_Payment> payment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance>> benefitBalance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> preAuthRef() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ExplanationOfBenefit_Payee> payee() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> referral() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ExplanationOfBenefit_Accident> accident() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit fromJson(Json json) {
    ImmutableExplanationOfBenefit.Builder builder = ((ImmutableExplanationOfBenefit.Builder) ImmutableExplanationOfBenefit.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.preAuthRefPeriodIsSet) {
      builder.preAuthRefPeriod(json.preAuthRefPeriod);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.fundsReserveIsSet) {
      builder.fundsReserve(json.fundsReserve);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.originalPrescriptionIsSet) {
      builder.originalPrescription(json.originalPrescription);
    }
    if (json.claimIsSet) {
      builder.claim(json.claim);
    }
    if (json.insurance != null) {
      builder.addAllInsurance(json.insurance);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.insurer != null) {
      builder.insurer(json.insurer);
    }
    if (json.benefitPeriodIsSet) {
      builder.benefitPeriod(json.benefitPeriod);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.careTeamIsSet) {
      builder.careTeam(json.careTeam);
    }
    if (json.processNoteIsSet) {
      builder.processNote(json.processNote);
    }
    if (json.precedenceIsSet) {
      builder.precedence(json.precedence);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.claimResponseIsSet) {
      builder.claimResponse(json.claimResponse);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.procedureIsSet) {
      builder.procedure(json.procedure);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.relatedIsSet) {
      builder.related(json.related);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
    }
    if (json.billablePeriodIsSet) {
      builder.billablePeriod(json.billablePeriod);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.formCodeIsSet) {
      builder.formCode(json.formCode);
    }
    if (json.provider != null) {
      builder.provider(json.provider);
    }
    if (json.prescriptionIsSet) {
      builder.prescription(json.prescription);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.fundsReserveRequestedIsSet) {
      builder.fundsReserveRequested(json.fundsReserveRequested);
    }
    if (json.formIsSet) {
      builder.form(json.form);
    }
    if (json.addItemIsSet) {
      builder.addItem(json.addItem);
    }
    if (json.paymentIsSet) {
      builder.payment(json.payment);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.benefitBalanceIsSet) {
      builder.benefitBalance(json.benefitBalance);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.preAuthRefIsSet) {
      builder.preAuthRef(json.preAuthRef);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.referralIsSet) {
      builder.referral(json.referral);
    }
    if (json.accidentIsSet) {
      builder.accident(json.accident);
    }
    return (ImmutableExplanationOfBenefit) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit instance
   */
  public static ExplanationOfBenefit copyOf(ExplanationOfBenefit instance) {
    if (instance instanceof ImmutableExplanationOfBenefit) {
      return (ImmutableExplanationOfBenefit) instance;
    }
    return ((ImmutableExplanationOfBenefit.Builder) ImmutableExplanationOfBenefit.builder())
        .id(instance.id())
        .preAuthRefPeriod(instance.preAuthRefPeriod())
        .use(instance.use())
        .implicitRules(instance.implicitRules())
        .fundsReserve(instance.fundsReserve())
        .language(instance.language())
        .total(instance.total())
        .originalPrescription(instance.originalPrescription())
        .claim(instance.claim())
        .addAllInsurance(instance.insurance())
        .modifierExtension(instance.modifierExtension())
        .created(instance.created())
        .insurer(instance.insurer())
        .benefitPeriod(instance.benefitPeriod())
        .outcome(instance.outcome())
        .careTeam(instance.careTeam())
        .processNote(instance.processNote())
        .precedence(instance.precedence())
        .item(instance.item())
        .claimResponse(instance.claimResponse())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .supportingInfo(instance.supportingInfo())
        .procedure(instance.procedure())
        .type(instance.type())
        .enterer(instance.enterer())
        .resourceType(instance.resourceType())
        .adjudication(instance.adjudication())
        .related(instance.related())
        .facility(instance.facility())
        .billablePeriod(instance.billablePeriod())
        .text(instance.text())
        .formCode(instance.formCode())
        .provider(instance.provider())
        .prescription(instance.prescription())
        .status(instance.status())
        .priority(instance.priority())
        .contained(instance.contained())
        .subType(instance.subType())
        .fundsReserveRequested(instance.fundsReserveRequested())
        .form(instance.form())
        .addItem(instance.addItem())
        .payment(instance.payment())
        .diagnosis(instance.diagnosis())
        .patient(instance.patient())
        .disposition(instance.disposition())
        .benefitBalance(instance.benefitBalance())
        .extension(instance.extension())
        .preAuthRef(instance.preAuthRef())
        .payee(instance.payee())
        .referral(instance.referral())
        .accident(instance.accident())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit ExplanationOfBenefit}.
   * <pre>
   * ImmutableExplanationOfBenefit.builder()
   *    .id(com.fhir.id) // optional {@link ExplanationOfBenefit#id() id}
   *    .preAuthRefPeriod(List&amp;lt;com.fhir.Period&amp;gt;) // optional {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod}
   *    .use(com.fhir.code) // optional {@link ExplanationOfBenefit#use() use}
   *    .implicitRules(com.fhir.uri) // optional {@link ExplanationOfBenefit#implicitRules() implicitRules}
   *    .fundsReserve(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#fundsReserve() fundsReserve}
   *    .language(com.fhir.code) // optional {@link ExplanationOfBenefit#language() language}
   *    .total(List&amp;lt;com.fhir.ExplanationOfBenefit_Total&amp;gt;) // optional {@link ExplanationOfBenefit#total() total}
   *    .originalPrescription(com.fhir.Reference) // optional {@link ExplanationOfBenefit#originalPrescription() originalPrescription}
   *    .claim(com.fhir.Reference) // optional {@link ExplanationOfBenefit#claim() claim}
   *    .addInsurance|addAllInsurance(com.fhir.ExplanationOfBenefit_Insurance) // {@link ExplanationOfBenefit#insurance() insurance} elements
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit#modifierExtension() modifierExtension}
   *    .created(com.fhir.dateTime) // optional {@link ExplanationOfBenefit#created() created}
   *    .insurer(com.fhir.Reference) // required {@link ExplanationOfBenefit#insurer() insurer}
   *    .benefitPeriod(com.fhir.Period) // optional {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod}
   *    .outcome(com.fhir.code) // optional {@link ExplanationOfBenefit#outcome() outcome}
   *    .careTeam(List&amp;lt;com.fhir.ExplanationOfBenefit_CareTeam&amp;gt;) // optional {@link ExplanationOfBenefit#careTeam() careTeam}
   *    .processNote(List&amp;lt;com.fhir.ExplanationOfBenefit_ProcessNote&amp;gt;) // optional {@link ExplanationOfBenefit#processNote() processNote}
   *    .precedence(com.fhir.positiveInt) // optional {@link ExplanationOfBenefit#precedence() precedence}
   *    .item(List&amp;lt;com.fhir.ExplanationOfBenefit_Item&amp;gt;) // optional {@link ExplanationOfBenefit#item() item}
   *    .claimResponse(com.fhir.Reference) // optional {@link ExplanationOfBenefit#claimResponse() claimResponse}
   *    .meta(com.fhir.Meta) // optional {@link ExplanationOfBenefit#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ExplanationOfBenefit#identifier() identifier}
   *    .supportingInfo(List&amp;lt;com.fhir.ExplanationOfBenefit_SupportingInfo&amp;gt;) // optional {@link ExplanationOfBenefit#supportingInfo() supportingInfo}
   *    .procedure(List&amp;lt;com.fhir.ExplanationOfBenefit_Procedure&amp;gt;) // optional {@link ExplanationOfBenefit#procedure() procedure}
   *    .type(com.fhir.CodeableConcept) // required {@link ExplanationOfBenefit#type() type}
   *    .enterer(com.fhir.Reference) // optional {@link ExplanationOfBenefit#enterer() enterer}
   *    .resourceType(String) // required {@link ExplanationOfBenefit#resourceType() resourceType}
   *    .adjudication(List&amp;lt;com.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit#adjudication() adjudication}
   *    .related(List&amp;lt;com.fhir.ExplanationOfBenefit_Related&amp;gt;) // optional {@link ExplanationOfBenefit#related() related}
   *    .facility(com.fhir.Reference) // optional {@link ExplanationOfBenefit#facility() facility}
   *    .billablePeriod(com.fhir.Period) // optional {@link ExplanationOfBenefit#billablePeriod() billablePeriod}
   *    .text(com.fhir.Narrative) // optional {@link ExplanationOfBenefit#text() text}
   *    .formCode(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#formCode() formCode}
   *    .provider(com.fhir.Reference) // required {@link ExplanationOfBenefit#provider() provider}
   *    .prescription(com.fhir.Reference) // optional {@link ExplanationOfBenefit#prescription() prescription}
   *    .status(com.fhir.ExplanationofbenefitStatus) // optional {@link ExplanationOfBenefit#status() status}
   *    .priority(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#priority() priority}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ExplanationOfBenefit#contained() contained}
   *    .subType(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#subType() subType}
   *    .fundsReserveRequested(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested}
   *    .form(com.fhir.Attachment) // optional {@link ExplanationOfBenefit#form() form}
   *    .addItem(List&amp;lt;com.fhir.ExplanationOfBenefit_AddItem&amp;gt;) // optional {@link ExplanationOfBenefit#addItem() addItem}
   *    .payment(com.fhir.ExplanationOfBenefit_Payment) // optional {@link ExplanationOfBenefit#payment() payment}
   *    .diagnosis(List&amp;lt;com.fhir.ExplanationOfBenefit_Diagnosis&amp;gt;) // optional {@link ExplanationOfBenefit#diagnosis() diagnosis}
   *    .patient(com.fhir.Reference) // required {@link ExplanationOfBenefit#patient() patient}
   *    .disposition(String) // optional {@link ExplanationOfBenefit#disposition() disposition}
   *    .benefitBalance(List&amp;lt;com.fhir.ExplanationOfBenefit_BenefitBalance&amp;gt;) // optional {@link ExplanationOfBenefit#benefitBalance() benefitBalance}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit#extension() extension}
   *    .preAuthRef(List&amp;lt;String&amp;gt;) // optional {@link ExplanationOfBenefit#preAuthRef() preAuthRef}
   *    .payee(com.fhir.ExplanationOfBenefit_Payee) // optional {@link ExplanationOfBenefit#payee() payee}
   *    .referral(com.fhir.Reference) // optional {@link ExplanationOfBenefit#referral() referral}
   *    .accident(com.fhir.ExplanationOfBenefit_Accident) // optional {@link ExplanationOfBenefit#accident() accident}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit builder
   */
  public static InsurerBuildStage builder() {
    return new ImmutableExplanationOfBenefit.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit ExplanationOfBenefit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements InsurerBuildStage, TypeBuildStage, ResourceTypeBuildStage, ProviderBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_INSURER = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long INIT_BIT_PROVIDER = 0x8L;
    private static final long INIT_BIT_PATIENT = 0x10L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_PRE_AUTH_REF_PERIOD = 0x2L;
    private static final long OPT_BIT_USE = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_FUNDS_RESERVE = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_TOTAL = 0x40L;
    private static final long OPT_BIT_ORIGINAL_PRESCRIPTION = 0x80L;
    private static final long OPT_BIT_CLAIM = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_CREATED = 0x400L;
    private static final long OPT_BIT_BENEFIT_PERIOD = 0x800L;
    private static final long OPT_BIT_OUTCOME = 0x1000L;
    private static final long OPT_BIT_CARE_TEAM = 0x2000L;
    private static final long OPT_BIT_PROCESS_NOTE = 0x4000L;
    private static final long OPT_BIT_PRECEDENCE = 0x8000L;
    private static final long OPT_BIT_ITEM = 0x10000L;
    private static final long OPT_BIT_CLAIM_RESPONSE = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x100000L;
    private static final long OPT_BIT_PROCEDURE = 0x200000L;
    private static final long OPT_BIT_ENTERER = 0x400000L;
    private static final long OPT_BIT_ADJUDICATION = 0x800000L;
    private static final long OPT_BIT_RELATED = 0x1000000L;
    private static final long OPT_BIT_FACILITY = 0x2000000L;
    private static final long OPT_BIT_BILLABLE_PERIOD = 0x4000000L;
    private static final long OPT_BIT_TEXT = 0x8000000L;
    private static final long OPT_BIT_FORM_CODE = 0x10000000L;
    private static final long OPT_BIT_PRESCRIPTION = 0x20000000L;
    private static final long OPT_BIT_STATUS = 0x40000000L;
    private static final long OPT_BIT_PRIORITY = 0x80000000L;
    private static final long OPT_BIT_CONTAINED = 0x100000000L;
    private static final long OPT_BIT_SUB_TYPE = 0x200000000L;
    private static final long OPT_BIT_FUNDS_RESERVE_REQUESTED = 0x400000000L;
    private static final long OPT_BIT_FORM = 0x800000000L;
    private static final long OPT_BIT_ADD_ITEM = 0x1000000000L;
    private static final long OPT_BIT_PAYMENT = 0x2000000000L;
    private static final long OPT_BIT_DIAGNOSIS = 0x4000000000L;
    private static final long OPT_BIT_DISPOSITION = 0x8000000000L;
    private static final long OPT_BIT_BENEFIT_BALANCE = 0x10000000000L;
    private static final long OPT_BIT_EXTENSION = 0x20000000000L;
    private static final long OPT_BIT_PRE_AUTH_REF = 0x40000000000L;
    private static final long OPT_BIT_PAYEE = 0x80000000000L;
    private static final long OPT_BIT_REFERRAL = 0x100000000000L;
    private static final long OPT_BIT_ACCIDENT = 0x200000000000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Period> preAuthRefPeriod;
    private @javax.annotation.Nullable com.fhir.code use;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserve;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Total> total;
    private @javax.annotation.Nullable com.fhir.Reference originalPrescription;
    private @javax.annotation.Nullable com.fhir.Reference claim;
    private final java.util.List<com.fhir.ExplanationOfBenefit_Insurance> insurance = new java.util.ArrayList<com.fhir.ExplanationOfBenefit_Insurance>();
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable com.fhir.Reference insurer;
    private @javax.annotation.Nullable com.fhir.Period benefitPeriod;
    private @javax.annotation.Nullable com.fhir.code outcome;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> careTeam;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> processNote;
    private @javax.annotation.Nullable com.fhir.positiveInt precedence;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Item> item;
    private @javax.annotation.Nullable com.fhir.Reference claimResponse;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> supportingInfo;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Procedure> procedure;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Reference enterer;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Related> related;
    private @javax.annotation.Nullable com.fhir.Reference facility;
    private @javax.annotation.Nullable com.fhir.Period billablePeriod;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept formCode;
    private @javax.annotation.Nullable com.fhir.Reference provider;
    private @javax.annotation.Nullable com.fhir.Reference prescription;
    private @javax.annotation.Nullable com.fhir.ExplanationofbenefitStatus status;
    private @javax.annotation.Nullable com.fhir.CodeableConcept priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subType;
    private @javax.annotation.Nullable com.fhir.CodeableConcept fundsReserveRequested;
    private @javax.annotation.Nullable com.fhir.Attachment form;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_AddItem> addItem;
    private @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payment payment;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> diagnosis;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable java.lang.String disposition;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> benefitBalance;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<java.lang.String> preAuthRef;
    private @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Payee payee;
    private @javax.annotation.Nullable com.fhir.Reference referral;
    private @javax.annotation.Nullable com.fhir.ExplanationOfBenefit_Accident accident;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRefPeriod(java.util.List<com.fhir.Period> preAuthRefPeriod) {
      checkNotIsSet(preAuthRefPeriodIsSet(), "preAuthRefPeriod");
      this.preAuthRefPeriod = java.util.Objects.requireNonNull(preAuthRefPeriod, "preAuthRefPeriod");
      optBits |= OPT_BIT_PRE_AUTH_REF_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRefPeriod")
    public final Builder preAuthRefPeriod(java.util.Optional<? extends java.util.List<com.fhir.Period>> preAuthRefPeriod) {
      checkNotIsSet(preAuthRefPeriodIsSet(), "preAuthRefPeriod");
      this.preAuthRefPeriod = preAuthRefPeriod.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
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
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
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
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
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
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
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
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
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
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(java.util.List<com.fhir.ExplanationOfBenefit_Total> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = java.util.Objects.requireNonNull(total, "total");
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public final Builder total(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Total>> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder originalPrescription(com.fhir.Reference originalPrescription) {
      checkNotIsSet(originalPrescriptionIsSet(), "originalPrescription");
      this.originalPrescription = java.util.Objects.requireNonNull(originalPrescription, "originalPrescription");
      optBits |= OPT_BIT_ORIGINAL_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originalPrescription")
    public final Builder originalPrescription(java.util.Optional<? extends com.fhir.Reference> originalPrescription) {
      checkNotIsSet(originalPrescriptionIsSet(), "originalPrescription");
      this.originalPrescription = originalPrescription.orElse(null);
      optBits |= OPT_BIT_ORIGINAL_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for chained invocation
     */
    public final Builder claim(com.fhir.Reference claim) {
      checkNotIsSet(claimIsSet(), "claim");
      this.claim = java.util.Objects.requireNonNull(claim, "claim");
      optBits |= OPT_BIT_CLAIM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claim")
    public final Builder claim(java.util.Optional<? extends com.fhir.Reference> claim) {
      checkNotIsSet(claimIsSet(), "claim");
      this.claim = claim.orElse(null);
      optBits |= OPT_BIT_CLAIM;
      return this;
    }

    /**
     * Adds one element to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(com.fhir.ExplanationOfBenefit_Insurance element) {
      this.insurance.add(java.util.Objects.requireNonNull(element, "insurance element"));
      return this;
    }

    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInsurance(com.fhir.ExplanationOfBenefit_Insurance... elements) {
      for (com.fhir.ExplanationOfBenefit_Insurance element : elements) {
        this.insurance.add(java.util.Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInsurance(Iterable<? extends com.fhir.ExplanationOfBenefit_Insurance> elements) {
      for (com.fhir.ExplanationOfBenefit_Insurance element : elements) {
        this.insurance.add(java.util.Objects.requireNonNull(element, "insurance element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
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
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
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
     * Initializes the value for the {@link ExplanationOfBenefit#insurer() insurer} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefitPeriod(com.fhir.Period benefitPeriod) {
      checkNotIsSet(benefitPeriodIsSet(), "benefitPeriod");
      this.benefitPeriod = java.util.Objects.requireNonNull(benefitPeriod, "benefitPeriod");
      optBits |= OPT_BIT_BENEFIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("benefitPeriod")
    public final Builder benefitPeriod(java.util.Optional<? extends com.fhir.Period> benefitPeriod) {
      checkNotIsSet(benefitPeriodIsSet(), "benefitPeriod");
      this.benefitPeriod = benefitPeriod.orElse(null);
      optBits |= OPT_BIT_BENEFIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
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
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
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
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeam(java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = java.util.Objects.requireNonNull(careTeam, "careTeam");
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
    public final Builder careTeam(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_CareTeam>> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = careTeam.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    public final Builder processNote(java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = java.util.Objects.requireNonNull(processNote, "processNote");
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processNote")
    public final Builder processNote(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote>> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = processNote.orElse(null);
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for chained invocation
     */
    public final Builder precedence(com.fhir.positiveInt precedence) {
      checkNotIsSet(precedenceIsSet(), "precedence");
      this.precedence = java.util.Objects.requireNonNull(precedence, "precedence");
      optBits |= OPT_BIT_PRECEDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("precedence")
    public final Builder precedence(java.util.Optional<? extends com.fhir.positiveInt> precedence) {
      checkNotIsSet(precedenceIsSet(), "precedence");
      this.precedence = precedence.orElse(null);
      optBits |= OPT_BIT_PRECEDENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.ExplanationOfBenefit_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder claimResponse(com.fhir.Reference claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = java.util.Objects.requireNonNull(claimResponse, "claimResponse");
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("claimResponse")
    public final Builder claimResponse(java.util.Optional<? extends com.fhir.Reference> claimResponse) {
      checkNotIsSet(claimResponseIsSet(), "claimResponse");
      this.claimResponse = claimResponse.orElse(null);
      optBits |= OPT_BIT_CLAIM_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
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
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
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
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = java.util.Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public final Builder supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedure(java.util.List<com.fhir.ExplanationOfBenefit_Procedure> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = java.util.Objects.requireNonNull(procedure, "procedure");
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedure")
    public final Builder procedure(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Procedure>> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = procedure.orElse(null);
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit#type() type} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    public final Builder enterer(com.fhir.Reference enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = java.util.Objects.requireNonNull(enterer, "enterer");
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public final Builder enterer(java.util.Optional<? extends com.fhir.Reference> enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = enterer.orElse(null);
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
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
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
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
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    public final Builder related(java.util.List<com.fhir.ExplanationOfBenefit_Related> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = java.util.Objects.requireNonNull(related, "related");
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("related")
    public final Builder related(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Related>> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = related.orElse(null);
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    public final Builder facility(com.fhir.Reference facility) {
      checkNotIsSet(facilityIsSet(), "facility");
      this.facility = java.util.Objects.requireNonNull(facility, "facility");
      optBits |= OPT_BIT_FACILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("facility")
    public final Builder facility(java.util.Optional<? extends com.fhir.Reference> facility) {
      checkNotIsSet(facilityIsSet(), "facility");
      this.facility = facility.orElse(null);
      optBits |= OPT_BIT_FACILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder billablePeriod(com.fhir.Period billablePeriod) {
      checkNotIsSet(billablePeriodIsSet(), "billablePeriod");
      this.billablePeriod = java.util.Objects.requireNonNull(billablePeriod, "billablePeriod");
      optBits |= OPT_BIT_BILLABLE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("billablePeriod")
    public final Builder billablePeriod(java.util.Optional<? extends com.fhir.Period> billablePeriod) {
      checkNotIsSet(billablePeriodIsSet(), "billablePeriod");
      this.billablePeriod = billablePeriod.orElse(null);
      optBits |= OPT_BIT_BILLABLE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
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
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
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
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
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
     * Initializes the value for the {@link ExplanationOfBenefit#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    public final Builder provider(com.fhir.Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = java.util.Objects.requireNonNull(provider, "provider");
      initBits &= ~INIT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder prescription(com.fhir.Reference prescription) {
      checkNotIsSet(prescriptionIsSet(), "prescription");
      this.prescription = java.util.Objects.requireNonNull(prescription, "prescription");
      optBits |= OPT_BIT_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prescription")
    public final Builder prescription(java.util.Optional<? extends com.fhir.Reference> prescription) {
      checkNotIsSet(prescriptionIsSet(), "prescription");
      this.prescription = prescription.orElse(null);
      optBits |= OPT_BIT_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ExplanationofbenefitStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ExplanationofbenefitStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.CodeableConcept> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
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
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
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
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
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
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
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
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for chained invocation
     */
    public final Builder fundsReserveRequested(com.fhir.CodeableConcept fundsReserveRequested) {
      checkNotIsSet(fundsReserveRequestedIsSet(), "fundsReserveRequested");
      this.fundsReserveRequested = java.util.Objects.requireNonNull(fundsReserveRequested, "fundsReserveRequested");
      optBits |= OPT_BIT_FUNDS_RESERVE_REQUESTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fundsReserveRequested")
    public final Builder fundsReserveRequested(java.util.Optional<? extends com.fhir.CodeableConcept> fundsReserveRequested) {
      checkNotIsSet(fundsReserveRequestedIsSet(), "fundsReserveRequested");
      this.fundsReserveRequested = fundsReserveRequested.orElse(null);
      optBits |= OPT_BIT_FUNDS_RESERVE_REQUESTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
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
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
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
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder addItem(java.util.List<com.fhir.ExplanationOfBenefit_AddItem> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = java.util.Objects.requireNonNull(addItem, "addItem");
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addItem")
    public final Builder addItem(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_AddItem>> addItem) {
      checkNotIsSet(addItemIsSet(), "addItem");
      this.addItem = addItem.orElse(null);
      optBits |= OPT_BIT_ADD_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    public final Builder payment(com.fhir.ExplanationOfBenefit_Payment payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = java.util.Objects.requireNonNull(payment, "payment");
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payment")
    public final Builder payment(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Payment> payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = payment.orElse(null);
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = java.util.Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosis")
    public final Builder diagnosis(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit#patient() patient} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
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
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for chained invocation
     */
    public final Builder benefitBalance(java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> benefitBalance) {
      checkNotIsSet(benefitBalanceIsSet(), "benefitBalance");
      this.benefitBalance = java.util.Objects.requireNonNull(benefitBalance, "benefitBalance");
      optBits |= OPT_BIT_BENEFIT_BALANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("benefitBalance")
    public final Builder benefitBalance(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance>> benefitBalance) {
      checkNotIsSet(benefitBalanceIsSet(), "benefitBalance");
      this.benefitBalance = benefitBalance.orElse(null);
      optBits |= OPT_BIT_BENEFIT_BALANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    public final Builder preAuthRef(java.util.List<java.lang.String> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = java.util.Objects.requireNonNull(preAuthRef, "preAuthRef");
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preAuthRef")
    public final Builder preAuthRef(java.util.Optional<? extends java.util.List<java.lang.String>> preAuthRef) {
      checkNotIsSet(preAuthRefIsSet(), "preAuthRef");
      this.preAuthRef = preAuthRef.orElse(null);
      optBits |= OPT_BIT_PRE_AUTH_REF;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    public final Builder payee(com.fhir.ExplanationOfBenefit_Payee payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = java.util.Objects.requireNonNull(payee, "payee");
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payee")
    public final Builder payee(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Payee> payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = payee.orElse(null);
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for chained invocation
     */
    public final Builder referral(com.fhir.Reference referral) {
      checkNotIsSet(referralIsSet(), "referral");
      this.referral = java.util.Objects.requireNonNull(referral, "referral");
      optBits |= OPT_BIT_REFERRAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referral")
    public final Builder referral(java.util.Optional<? extends com.fhir.Reference> referral) {
      checkNotIsSet(referralIsSet(), "referral");
      this.referral = referral.orElse(null);
      optBits |= OPT_BIT_REFERRAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    public final Builder accident(com.fhir.ExplanationOfBenefit_Accident accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = java.util.Objects.requireNonNull(accident, "accident");
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accident")
    public final Builder accident(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Accident> accident) {
      checkNotIsSet(accidentIsSet(), "accident");
      this.accident = accident.orElse(null);
      optBits |= OPT_BIT_ACCIDENT;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit ExplanationOfBenefit}.
     * @return An immutable instance of ExplanationOfBenefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExplanationOfBenefit build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit(
          id,
          preAuthRefPeriod,
          use,
          implicitRules,
          fundsReserve,
          language,
          total,
          originalPrescription,
          claim,
          createUnmodifiableList(true, insurance),
          modifierExtension,
          created,
          insurer,
          benefitPeriod,
          outcome,
          careTeam,
          processNote,
          precedence,
          item,
          claimResponse,
          meta,
          identifier,
          supportingInfo,
          procedure,
          type,
          enterer,
          resourceType,
          adjudication,
          related,
          facility,
          billablePeriod,
          text,
          formCode,
          provider,
          prescription,
          status,
          priority,
          contained,
          subType,
          fundsReserveRequested,
          form,
          addItem,
          payment,
          diagnosis,
          patient,
          disposition,
          benefitBalance,
          extension,
          preAuthRef,
          payee,
          referral,
          accident);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean preAuthRefPeriodIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF_PERIOD) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean fundsReserveIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean originalPrescriptionIsSet() {
      return (optBits & OPT_BIT_ORIGINAL_PRESCRIPTION) != 0;
    }

    private boolean claimIsSet() {
      return (optBits & OPT_BIT_CLAIM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean benefitPeriodIsSet() {
      return (optBits & OPT_BIT_BENEFIT_PERIOD) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean careTeamIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM) != 0;
    }

    private boolean processNoteIsSet() {
      return (optBits & OPT_BIT_PROCESS_NOTE) != 0;
    }

    private boolean precedenceIsSet() {
      return (optBits & OPT_BIT_PRECEDENCE) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean claimResponseIsSet() {
      return (optBits & OPT_BIT_CLAIM_RESPONSE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean procedureIsSet() {
      return (optBits & OPT_BIT_PROCEDURE) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean relatedIsSet() {
      return (optBits & OPT_BIT_RELATED) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean billablePeriodIsSet() {
      return (optBits & OPT_BIT_BILLABLE_PERIOD) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean formCodeIsSet() {
      return (optBits & OPT_BIT_FORM_CODE) != 0;
    }

    private boolean prescriptionIsSet() {
      return (optBits & OPT_BIT_PRESCRIPTION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean fundsReserveRequestedIsSet() {
      return (optBits & OPT_BIT_FUNDS_RESERVE_REQUESTED) != 0;
    }

    private boolean formIsSet() {
      return (optBits & OPT_BIT_FORM) != 0;
    }

    private boolean addItemIsSet() {
      return (optBits & OPT_BIT_ADD_ITEM) != 0;
    }

    private boolean paymentIsSet() {
      return (optBits & OPT_BIT_PAYMENT) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean benefitBalanceIsSet() {
      return (optBits & OPT_BIT_BENEFIT_BALANCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean preAuthRefIsSet() {
      return (optBits & OPT_BIT_PRE_AUTH_REF) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean referralIsSet() {
      return (optBits & OPT_BIT_REFERRAL) != 0;
    }

    private boolean accidentIsSet() {
      return (optBits & OPT_BIT_ACCIDENT) != 0;
    }

    private boolean insurerIsSet() {
      return (initBits & INIT_BIT_INSURER) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean providerIsSet() {
      return (initBits & INIT_BIT_PROVIDER) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExplanationOfBenefit is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!insurerIsSet()) attributes.add("insurer");
      if (!typeIsSet()) attributes.add("type");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!providerIsSet()) attributes.add("provider");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build ExplanationOfBenefit, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface InsurerBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#insurer() insurer} attribute.
     * @param insurer The value for insurer 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage insurer(com.fhir.Reference insurer);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ProviderBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface ProviderBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#provider() provider} attribute.
     * @param provider The value for provider 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage provider(com.fhir.Reference provider);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "ExplanationOfBenefit", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRefPeriod(java.util.List<com.fhir.Period> preAuthRefPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRefPeriod() preAuthRefPeriod} to preAuthRefPeriod.
     * @param preAuthRefPeriod The value for preAuthRefPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRefPeriod(java.util.Optional<? extends java.util.List<com.fhir.Period>> preAuthRefPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    BuildFinal use(com.fhir.code use);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal use(java.util.Optional<? extends com.fhir.code> use);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserve(com.fhir.CodeableConcept fundsReserve);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserve() fundsReserve} to fundsReserve.
     * @param fundsReserve The value for fundsReserve
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserve(java.util.Optional<? extends com.fhir.CodeableConcept> fundsReserve);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    BuildFinal total(java.util.List<com.fhir.ExplanationOfBenefit_Total> total);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal total(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Total>> total);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal originalPrescription(com.fhir.Reference originalPrescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#originalPrescription() originalPrescription} to originalPrescription.
     * @param originalPrescription The value for originalPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal originalPrescription(java.util.Optional<? extends com.fhir.Reference> originalPrescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for chained invocation
     */
    BuildFinal claim(com.fhir.Reference claim);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claim() claim} to claim.
     * @param claim The value for claim
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal claim(java.util.Optional<? extends com.fhir.Reference> claim);

    /**
     * Adds one element to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param element A insurance element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(com.fhir.ExplanationOfBenefit_Insurance element);

    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An array of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addInsurance(com.fhir.ExplanationOfBenefit_Insurance... elements);

    /**
     * Adds elements to {@link ExplanationOfBenefit#insurance() insurance} list.
     * @param elements An iterable of insurance elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllInsurance(Iterable<? extends com.fhir.ExplanationOfBenefit_Insurance> elements);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal benefitPeriod(com.fhir.Period benefitPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitPeriod() benefitPeriod} to benefitPeriod.
     * @param benefitPeriod The value for benefitPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal benefitPeriod(java.util.Optional<? extends com.fhir.Period> benefitPeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.code outcome);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.code> outcome);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeam(java.util.List<com.fhir.ExplanationOfBenefit_CareTeam> careTeam);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeam(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_CareTeam>> careTeam);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processNote(java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote> processNote);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processNote(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_ProcessNote>> processNote);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal precedence(com.fhir.positiveInt precedence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#precedence() precedence} to precedence.
     * @param precedence The value for precedence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal precedence(java.util.Optional<? extends com.fhir.positiveInt> precedence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(java.util.List<com.fhir.ExplanationOfBenefit_Item> item);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Item>> item);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for chained invocation
     */
    BuildFinal claimResponse(com.fhir.Reference claimResponse);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#claimResponse() claimResponse} to claimResponse.
     * @param claimResponse The value for claimResponse
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal claimResponse(java.util.Optional<? extends com.fhir.Reference> claimResponse);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo> supportingInfo);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_SupportingInfo>> supportingInfo);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedure(java.util.List<com.fhir.ExplanationOfBenefit_Procedure> procedure);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedure(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Procedure>> procedure);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(com.fhir.Reference enterer);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(java.util.Optional<? extends com.fhir.Reference> enterer);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(java.util.List<com.fhir.ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    BuildFinal related(java.util.List<com.fhir.ExplanationOfBenefit_Related> related);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal related(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Related>> related);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal facility(com.fhir.Reference facility);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal facility(java.util.Optional<? extends com.fhir.Reference> facility);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal billablePeriod(com.fhir.Period billablePeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#billablePeriod() billablePeriod} to billablePeriod.
     * @param billablePeriod The value for billablePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal billablePeriod(java.util.Optional<? extends com.fhir.Period> billablePeriod);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal formCode(com.fhir.CodeableConcept formCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal formCode(java.util.Optional<? extends com.fhir.CodeableConcept> formCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prescription(com.fhir.Reference prescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#prescription() prescription} to prescription.
     * @param prescription The value for prescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prescription(java.util.Optional<? extends com.fhir.Reference> prescription);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ExplanationofbenefitStatus status);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ExplanationofbenefitStatus> status);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.CodeableConcept priority);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.CodeableConcept> priority);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(com.fhir.CodeableConcept subType);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(java.util.Optional<? extends com.fhir.CodeableConcept> subType);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundsReserveRequested(com.fhir.CodeableConcept fundsReserveRequested);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#fundsReserveRequested() fundsReserveRequested} to fundsReserveRequested.
     * @param fundsReserveRequested The value for fundsReserveRequested
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundsReserveRequested(java.util.Optional<? extends com.fhir.CodeableConcept> fundsReserveRequested);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for chained invocation
     */
    BuildFinal form(com.fhir.Attachment form);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#form() form} to form.
     * @param form The value for form
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal form(java.util.Optional<? extends com.fhir.Attachment> form);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addItem(java.util.List<com.fhir.ExplanationOfBenefit_AddItem> addItem);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#addItem() addItem} to addItem.
     * @param addItem The value for addItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addItem(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_AddItem>> addItem);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payment(com.fhir.ExplanationOfBenefit_Payment payment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payment(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Payment> payment);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diagnosis(java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis> diagnosis);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diagnosis(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_Diagnosis>> diagnosis);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(java.lang.String disposition);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(java.util.Optional<java.lang.String> disposition);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal benefitBalance(java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance> benefitBalance);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#benefitBalance() benefitBalance} to benefitBalance.
     * @param benefitBalance The value for benefitBalance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal benefitBalance(java.util.Optional<? extends java.util.List<com.fhir.ExplanationOfBenefit_BenefitBalance>> benefitBalance);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preAuthRef(java.util.List<java.lang.String> preAuthRef);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#preAuthRef() preAuthRef} to preAuthRef.
     * @param preAuthRef The value for preAuthRef
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preAuthRef(java.util.Optional<? extends java.util.List<java.lang.String>> preAuthRef);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(com.fhir.ExplanationOfBenefit_Payee payee);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Payee> payee);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referral(com.fhir.Reference referral);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#referral() referral} to referral.
     * @param referral The value for referral
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referral(java.util.Optional<? extends com.fhir.Reference> referral);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accident(com.fhir.ExplanationOfBenefit_Accident accident);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit#accident() accident} to accident.
     * @param accident The value for accident
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accident(java.util.Optional<? extends com.fhir.ExplanationOfBenefit_Accident> accident);

    /**
     * Builds a new {@link ExplanationOfBenefit ExplanationOfBenefit}.
     * @return An immutable instance of ExplanationOfBenefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit build();
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
